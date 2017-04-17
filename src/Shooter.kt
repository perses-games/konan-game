
import games.perses.sfml.Events
import games.perses.sfml.View
import games.perses.sfml.Window
import games.perses.sfml.sprite.Sprite
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.texture.Textures
import games.perses.sfml.time.Timer
import gles2.GL_COLOR_BUFFER_BIT
import gles2.glClear
import gles2.glClearColor
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.readValue
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
    //sfMusic_play(music)

    memScoped {
        val window = Window("Test", 1024, 768, style = sfDefaultStyle)

        window.clearColor = sfColor_fromRGB(0, 0, 100)
        //window.enableVerticalSync()

        if (window.isOpen()) {
            val smiley = Textures.getOrLoad("data/img/smiley.png")

            View.setToWidth(2000)
            Textures.matrix.setOrthographicProjection(-5f, 5f, -5f, 5f, -5f, 5f)

            val sprites = ArrayList<Sprite>()

            for (index in 1..100) {
                val x = rand() % 2000 - 1000f
                val y = rand() % 2000 - 1000f
                sprites.add(Sprite(smiley, x, y, 0.1f))
            }

            while (Events.running) {
                window.pollEvents(Events::handleEvent)

                glClearColor(0.5f, 0.5f, 0f, 0.1f)
                glClear(GL_COLOR_BUFFER_BIT)


                View.updateViewport()
                for (sprite in sprites) {
                    sprite.render()
                }
                smiley.render()

                window.resetGLStates()
                window.setView(View.view)

                fpsDisplay.setText("FPS: ${Timer.fps}")
                window.draw(helloKonan, 100f + sin(Timer.time.toDouble()).toFloat() * 50f, 100f + cos(Timer.time.toDouble()).toFloat() * 50f)
                window.draw(fpsDisplay)

                View.updateViewport()
                smiley.queueDraw(-200f, -200f, (0.50f + sin(Timer.time.toDouble()) * 0.25f).toFloat(), Timer.time)

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
