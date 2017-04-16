package games.perses.sfml

import sfml.sfEvent
import sfml.sfEventType

/**
 * Created by rnentjes on 16-4-17.
 */

object Events {
    var running = true

    fun handleEvent(event: sfEvent) {
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
            sfEventType.sfEvtResized -> {
                View.resize(event.size.width, event.size.height)
            }
            else -> {
                // ignore
            }
        }

    }
}