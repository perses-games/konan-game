package games.perses.sfml.music

import kotlinx.cinterop.CPointer
import cnames.structs.sfMusic
import games.perses.sfml.Cleanup
import sfml.*

object Music {

    var music: CPointer<sfMusic>? = null
    var looping = true

    init {
        // clean up resources when we are done
        Cleanup.add {
            music?.apply {
                sfMusic_destroy(this)
            }
        }
    }

    fun load(filename: String) {
        music?.apply {
            sfMusic_destroy(this)
        }

        music = sfMusic_createFromFile("data/music/DST-TechnoBasic.ogg")
    }

    fun play() {
        music?.apply {
            sfMusic_setLoop(this, if (looping) { 1 } else { 0 })

            sfMusic_play(this)
        }
    }

    fun pause() {
        music?.apply {
            sfMusic_pause(this)
        }
    }

}
