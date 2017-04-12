package games.perses.sfml.time

import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import sfml.sfClock_create
import sfml.sfClock_destroy
import sfml.sfClock_getElapsedTime
import sfml.sfTime_asSeconds

/**
 * Created by rnentjes on 12-4-17.
 */

object Timer {
    val clock = sfClock_create()?.pointed ?: throw IllegalStateException("Unable to create clock!")

    var time = 0f
    var delta = 0f
    var fpsTime = 0f
    var fpsCount = 0
    var fps = 0

    fun tick() {
        val elapsed = sfClock_getElapsedTime(clock.ptr)

        val newTime = sfTime_asSeconds(elapsed)
        delta = newTime - time
        time = newTime

        fpsCount++
        fpsTime += delta
        if (fpsTime > 1f) {
            fpsTime -= 1f
            fps = fpsCount
            fpsCount = 0
        }
    }

    fun destroy() {
        sfClock_destroy(clock.ptr)
    }
}