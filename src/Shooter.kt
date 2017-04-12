
import games.perses.sfml.Window
import games.perses.sfml.sprite.Sprites
import games.perses.sfml.sprite.Textures
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import games.perses.sfml.time.Timer
import kotlinx.cinterop.memScoped
import math.cos
import math.sin
import sfml.*

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

        val sprite = Sprites.create("data/img/smiley.png")

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
