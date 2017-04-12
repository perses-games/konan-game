import games.perses.sfml.Window
import games.perses.sfml.sprite.Sprites
import games.perses.sfml.sprite.Textures
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import kotlinx.cinterop.*
import math.cos
import math.sin
import sfml.*

fun main(args: Array<String>) {

    val music = sfMusic_createFromFile("data/music/DST-TechnoBasic.ogg")

    val font = Font("data/fonts/COMPUTERRobot.ttf")
    val helloKonan = Text(font, 50f, 50f, "Hello Konan!", 76, 255.toByte(), 255.toByte(), 0.toByte())

    sfMusic_setLoop(music, 1)
    sfMusic_play(music)

    memScoped {

        val window = Window("Test", 1024, 768)

        window.clearColor = sfColor_fromRGBA(0, 0, 100, 255.toByte())
        window.enableVerticalSync()

        val sprite = Sprites.create("data/img/smiley.png")

        var time = 0f
        var count = 0

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

            window.clear()
            sprite.position.x = 40f
            sprite.position.y = 30f
            window.draw(sprite)
            window.draw(helloKonan, 100f + sin(time.toDouble()).toFloat() * 50f, 100f + cos(time.toDouble()).toFloat() * 50f)
            window.display()

            count++
            time += 1f / 60f
        }

        Sprites.destroyAll()
        Textures.destroyAll()
        window.destroy()

        sfMusic_destroy(music)

        helloKonan.destroy()
        font.destroy()
    }

}
