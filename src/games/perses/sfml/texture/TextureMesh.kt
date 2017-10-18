package games.perses.sfml.texture

import games.perses.sfml.Cleanup
import games.perses.sfml.View
import games.perses.sfml.math.Matrix4
import games.perses.sfml.shader.ShaderProgram
import games.perses.sfml.shader.ShaderProgramMesh
import games.perses.sfml.shader.VertextAttributeInfo
import gles2.GL_TEXTURE0
import gles2.GL_TRIANGLES
import gles2.glActiveTexture
import kotlinx.cinterop.CValue
import kotlinx.cinterop.useContents
import sfml.*
import cnames.structs.sfTexture
import kotlinx.cinterop.CPointer

/**
 * User: rnentjes
 * Date: 16-4-17
 * Time: 14:35
 */

//language=GLSL
private val vertexShaderSource = """
    attribute vec2 a_position;
    attribute vec2 a_boundingBox;
    attribute vec2 a_texCoord;
    attribute float a_scale;
    attribute float a_rotation;

    uniform mat4 u_projectionView;

    varying vec2 v_textCoord;

    mat4 scale(float scale) {
        return mat4(
            vec4(scale, 0.0,   0.0,   0.0),
            vec4(0.0,   scale, 0.0,   0.0),
            vec4(0.0,   0.0,   scale, 0.0),
            vec4(0.0,   0.0,   0.0,   1.0)
        );
    }

    mat4 rotateZ(float angle) {
        return mat4(
            vec4(cos(angle),   sin(angle),  0.0,  0.0),
            vec4(-sin(angle),  cos(angle),  0.0,  0.0),
            vec4(0.0,          0.0,         1.0,  0.0),
            vec4(0.0,          0.0,         0.0,  1.0)
        );
    }

    void main(void) {
        v_textCoord = a_texCoord;

        vec4 scaledBox = vec4(a_boundingBox, 1.0, 1.0) * scale(a_scale) * rotateZ(a_rotation);

        gl_Position = u_projectionView * vec4(a_position + scaledBox.xy, -2f, 1.0);
    }
"""

//language=GLSL
private val fragmentShaderSource = """
    precision mediump float;

    uniform sampler2D u_sampler;

    varying vec2 v_textCoord;

    void main(void) {
        gl_FragColor = texture2D(u_sampler, v_textCoord);
    }
"""

class TextureData(
  val vMatrix: Matrix4,
  val texture: CPointer<sfTexture>
)

class TextureMesh(
  val filename: String,
  matrix: Matrix4,
  val glTexture: CPointer<sfTexture>,
  val shaderProgram: ShaderProgram<TextureData>,
  val width: Int,
  val height: Int
) {
    val shaderProgramMesh: ShaderProgramMesh<TextureData> = ShaderProgramMesh(shaderProgram)
    val data: TextureData = TextureData(matrix, glTexture)
    val left = -width / 2f
    val right = width / 2f
    val bottom = -height / 2f
    val top = height / 2f

    fun queueDraw(x: Float, y: Float, scale: Float, rotation: Float) {
        shaderProgramMesh.queue( x, y, left,  bottom,  0f, 0f, scale, rotation)
        shaderProgramMesh.queue( x, y, left,  top,     0f, 1f, scale, rotation)
        shaderProgramMesh.queue( x, y, right, top,     1f, 1f, scale, rotation)
        shaderProgramMesh.queue( x, y, right, top,     1f, 1f, scale, rotation)
        shaderProgramMesh.queue( x, y, right, bottom,  1f, 0f, scale, rotation)
        shaderProgramMesh.queue( x, y, left,  bottom,  0f, 0f, scale, rotation)

        if (shaderProgramMesh.remaining() < 36) {
            render()
        }
    }

    fun queueTileDraw(x: Float, y: Float, tcLeft: Float, tcTop: Float, tcRight: Float, tcBottom: Float, scale: Float) {
        shaderProgramMesh.queue( x, y, left,  bottom,  tcLeft,  tcBottom, scale, 0f)
        shaderProgramMesh.queue( x, y, left,  top,     tcLeft,  tcTop,    scale, 0f)
        shaderProgramMesh.queue( x, y, right, top,     tcRight, tcTop,    scale, 0f)
        shaderProgramMesh.queue( x, y, right, top,     tcRight, tcTop,    scale, 0f)
        shaderProgramMesh.queue( x, y, right, bottom,  tcRight, tcBottom, scale, 0f)
        shaderProgramMesh.queue( x, y, left,  bottom,  tcLeft,  tcBottom, scale, 0f)

        if (shaderProgramMesh.remaining() < 36) {
            render()
        }
    }

    fun render() {
        glActiveTexture(GL_TEXTURE0)
        sfTexture_bind(glTexture)

        shaderProgramMesh.render(data)
    }
}

object Textures {
    var textures = HashMap<String, TextureMesh>()
    val shaderProgram: ShaderProgram<TextureData>
    val matrix: Matrix4 = Matrix4()

    init {
        val setter = { program: ShaderProgram<TextureData>, data: TextureData ->
            program.setUniform1i("u_sampler", 0)
            program.setUniformMatrix4fv("u_projectionView", View.matrix.getCValues()) //data.vMatrix.getCValues())
        }

        val vainfo = arrayOf(
          VertextAttributeInfo("a_position", 2),
          VertextAttributeInfo("a_boundingBox", 2),
          VertextAttributeInfo("a_texCoord", 2),
          VertextAttributeInfo("a_scale", 1),
          VertextAttributeInfo("a_rotation", 1)
        )

        shaderProgram = ShaderProgram(GL_TRIANGLES, vertexShaderSource, fragmentShaderSource, vainfo, setter)

        Cleanup.add {
            destroyAll()
        }
    }

    fun getOrLoad(filename: String): TextureMesh {
        var result = textures[filename]

        if (result == null) {
            load(filename)
            result = get(filename)
        }

        return result
    }

    fun load(filename: String) {
        val sfTxt = sfTexture_createFromFile(filename, null) ?: throw IllegalStateException("Couldn't find texture file: $filename")
        sfTexture_setSmooth(sfTxt, 1)
        val size: CValue<sfVector2u> = sfTexture_getSize(sfTxt)
        size.useContents {
            println("Texture $filename -> $x, $y")
            val result = TextureMesh(filename, matrix, sfTxt, shaderProgram, x, y)
            textures[filename] = result
        }
    }

    fun destroy(filename: String) {
        textures[filename]?.apply {
            destroy(this)
        }
    }

    fun destroy(texture: TextureMesh) {
        sfTexture_destroy(texture.glTexture)

        textures.remove(texture.filename)
    }

    fun destroyAll() {
        for ((_, value) in textures) {
            sfTexture_destroy(value.glTexture)
        }

        textures.clear()
    }

    fun loadSpriteSheet(name: String) {
        //val data = Request(name).json()

        //println(data)
    }

    fun has(name: String) = textures[name] != null
    fun get(name: String) = textures[name] ?: throw IllegalArgumentException("Texture with name $name is not loaded!")

    fun render() {
        for ((_, value) in textures) {
            value.render()
        }
    }

}
