
import games.perses.sfml.Window
import games.perses.sfml.math.Matrix4
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.texture.Textures
import games.perses.sfml.time.Timer
import gles2.GL_COLOR_BUFFER_BIT
import gles2.glClear
import gles2.glClearColor
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import math.cos
import math.sin
import sfml.*
import stdio.rand


fun main(args: Array<String>) {

    val music = sfMusic_createFromFile("data/music/DST-TechnoBasic.ogg")

    val font = Font("data/fonts/COMPUTERRobot.ttf")
    val helloKonan = Text(font, 50f, 50f, "Hello Konan!", 76, 0.toByte(), 255.toByte(), 255.toByte())
    val fpsDisplay = Text(font, 20f, 10f, "FPS: 0", 76, 0.toByte(), 255.toByte(), 0.toByte())

    sfMusic_setLoop(music, 1)
    sfMusic_play(music)

    memScoped {
        val window = Window("Test", 1024, 768, style = sfDefaultStyle)

        window.clearColor = sfColor_fromRGB(0, 0, 100)
        //window.enableVerticalSync()

        val identityMatrix = Matrix4()

        if (window.isOpen()) {
            val rect = alloc<sfFloatRect>()
            rect.left = -100f
            rect.top = 100f
            rect.width = 200f
            rect.height = 200f

            //val view = sfView_createFromRect(rect.readValue())
            val view = window.getView()

            val smiley = Textures.getOrLoad("data/img/smiley.png")

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

                glClearColor(0.5f, 0.5f, 0f, 0.1f)
                glClear(GL_COLOR_BUFFER_BIT)

                window.resetGLStates()
                window.setView(view)

                fpsDisplay.setText("FPS: ${Timer.fps}")

                for (index in 0..100) {
                    val x = rand() % 1000 / 500f -1f
                    val y = rand() % 1000 / 500f -1f
                    smiley.queueDraw(x, y, (0.0001f + sin(Timer.time.toDouble()) * 0.00005f).toFloat(), Timer.time)
                }
                smiley.render()

                window.resetGLStates()
                window.draw(helloKonan, 100f + sin(Timer.time.toDouble()).toFloat() * 50f, 100f + cos(Timer.time.toDouble()).toFloat() * 50f)
                window.draw(fpsDisplay)

                smiley.queueDraw(0f, 0f, (0.0005f + sin(Timer.time.toDouble()) * 0.00025f).toFloat(), Timer.time)

                smiley.render()

                window.display()

                Timer.tick()
            }
            window.close()
        }

        window.destroy()

        sfMusic_destroy(music)

        helloKonan.destroy()
        font.destroy()
    }

}
