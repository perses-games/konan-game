
import games.perses.sfml.Window
import games.perses.sfml.math.Matrix4
import games.perses.sfml.shader.ShaderProgram
import games.perses.sfml.shader.ShaderProgramMesh
import games.perses.sfml.shader.VertextAttributeInfo
import games.perses.sfml.sprite.Sprites
import games.perses.sfml.sprite.Textures
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.time.Timer
import gles2.GL_COLOR_BUFFER_BIT
import gles2.GL_TRIANGLES
import gles2.glClear
import gles2.glClearColor
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCValues
import math.cos
import math.sin
import sfml.*

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

        // u_projectionView *
        gl_Position = vec4(a_position + scaledBox.xy, 0.0, 1.0);
    }
"""

//language=GLSL
private val fragmentShaderSource = """
    precision mediump float;

    uniform sampler2D u_sampler;

    varying vec2 v_textCoord;

    void main(void) {
        gl_FragColor = texture2D(u_sampler, v_textCoord);
        gl_FragColor.r = 1.0;
    }
"""

class TextureData(
  val vMatrix: Matrix4,
  val texture: Int
)

fun main(args: Array<String>) {

    val music = sfMusic_createFromFile("data/music/DST-TechnoBasic.ogg")

    val font = Font("data/fonts/COMPUTERRobot.ttf")
    val helloKonan = Text(font, 50f, 50f, "Hello Konan!", 76, 255.toByte(), 255.toByte(), 0.toByte())
    val fpsDisplay = Text(font, 20f, 10f, "FPS: 0", 76, 0.toByte(), 255.toByte(), 0.toByte())

    sfMusic_setLoop(music, 1)
    sfMusic_play(music)

    memScoped {
        val window = Window("Test", 1024, 768)

        window.clearColor = sfColor_fromRGB(0, 0, 100)
        window.enableVerticalSync()

        val identityMatrix = Matrix4()

        if (window.isOpen()) {
            val rect = alloc<sfFloatRect>()
            rect.left = -100f
            rect.top = 100f
            rect.width = 200f
            rect.height = 200f

            //val view = sfView_createFromRect(rect.readValue())
            val view = window.getView()

            val sprite = Sprites.create("data/img/smiley.png")

            Gles2Test.init()
            var running = true

            while (running) {
                window.pollEvents { event ->
                    when (event.type) {
                        sfEventType.sfEvtClosed -> {
                            running = false
                        }
                        sfEventType.sfEvtKeyPressed -> {
                            // println("Key: ${event.key.code}")
                            if (event.key.code == 36) {
                                running = false
                            }
                        }
                        else -> {
                            // ignore
                        }
                    }

                }

                glClearColor(Timer.time % 1f, 0.0f, 0f, 0.1f)
                glClear(GL_COLOR_BUFFER_BIT)

                Gles2Test.render()
                window.display()

                Timer.tick()
            }

            val vainfo = arrayOf(
              VertextAttributeInfo("a_position", 2),
              VertextAttributeInfo("a_boundingBox", 2),
              VertextAttributeInfo("a_texCoord", 2),
              VertextAttributeInfo("a_scale", 1),
              VertextAttributeInfo("a_rotation", 1)
            )

            val program = ShaderProgram<TextureData>(
              GL_TRIANGLES,
              vertexShaderSource,
              fragmentShaderSource,
              vainfo
            ) { program, data ->
                //program.setUniform1i("u_sampler", 0)
                program.setUniformMatrix4fv("u_projectionView", identityMatrix.matrix.toCValues())
            }

            val shaderProgramMesh = ShaderProgramMesh(program)

            val textureData = TextureData(identityMatrix, 0)

            window.resetGLStates()
            window.setView(view)

            running = true
            while (running) {

                window.pollEvents { event ->
                    when (event.type) {
                        sfEventType.sfEvtClosed -> {
                            running = false
                        }
                        sfEventType.sfEvtKeyPressed -> {
                            // println("Key: ${event.key.code}")
                            if (event.key.code == 36) {
                                running = false
                            }
                        }
                        else -> {
                            // ignore
                        }
                    }

                }

                glClearColor(0.5f, 0.5f, 0f, 0.1f)
                glClear(GL_COLOR_BUFFER_BIT)

//                glActiveTexture(GL_TEXTURE0)
                window.resetGLStates()
                window.setView(view)

                fpsDisplay.setText("FPS: ${Timer.fps}")

                sprite.position.x = 40f
                sprite.position.y = 30f
                window.draw(sprite)
                window.draw(helloKonan, 100f + sin(Timer.time.toDouble()).toFloat() * 50f, 100f + cos(Timer.time.toDouble()).toFloat() * 50f)
                window.draw(fpsDisplay)

                sfTexture_bind(sprite.texture.handle.ptr)

                shaderProgramMesh.queue(0f, 0f, -0.5f, -0.5f, 0f, 0f, 1f, 0f)
                shaderProgramMesh.queue(0f, 0f,  0.5f, -0.5f, 1f, 0f, 1f, 0f)
                shaderProgramMesh.queue(0f, 0f,  0.5f,  0.5f, 1f, 1f, 1f, 0f)

                shaderProgramMesh.render(textureData)

                window.display()

                Timer.tick()
            }
            window.close()
        }

        Sprites.destroyAll()
        Textures.destroyAll()
        window.destroy()

        sfMusic_destroy(music)

        helloKonan.destroy()
        font.destroy()
    }

}
