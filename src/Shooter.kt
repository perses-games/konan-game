
import games.perses.sfml.Window
import games.perses.sfml.shader.ShaderProgram
import games.perses.sfml.sprite.Sprites
import games.perses.sfml.sprite.Textures
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.time.Timer
import kotlinx.cinterop.memScoped
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

        gl_Position = u_projectionView * vec4(a_position + scaledBox.xy, 1.0, 1.0);
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
        //window.enableVerticalSync()

        val sprite = Sprites.create("data/img/smiley.png")

        if (window.isOpen()) {
            val program = ShaderProgram<Any>(vertexShaderSource, fragmentShaderSource)
        }

        while (window.isOpen()) {

            window.pollEvents { event ->
                when (event.type) {
                    sfEventType.sfEvtClosed -> {
                        window.close()
                    }
                    sfEventType.sfEvtKeyPressed -> {
                        // println("Key: ${event.key.code}")
                        if (event.key.code == 36) {
                            window.close()
                        }
                    }
                    else -> {
                        // ignore
                    }
                }
            }

            fpsDisplay.setText("FPS: ${Timer.fps}")

            window.clear()
            sprite.position.x = 40f
            sprite.position.y = 30f
            window.draw(sprite)
            window.draw(helloKonan, 100f + sin(Timer.time.toDouble()).toFloat() * 50f, 100f + cos(Timer.time.toDouble()).toFloat() * 50f)
            window.draw(fpsDisplay)
            window.display()

            Timer.tick()
        }

        Sprites.destroyAll()
        Textures.destroyAll()
        window.destroy()

        sfMusic_destroy(music)

        helloKonan.destroy()
        font.destroy()
    }

}
