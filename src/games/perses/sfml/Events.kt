package games.perses.sfml

import games.perses.sfml.input.Keyboard
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
//            sfEventType.sfEvtKeyReleased -> {
//
//            }
//            sfEventType.sfEvtTextEntered -> {
//
//            }
            sfEventType.sfEvtKeyPressed -> {
                Keyboard.keypressListener?.invoke(event.key.code)
            }
            sfEventType.sfEvtResized -> {
                View.resize(event.size.width, event.size.height)
            }
            else -> {
                // println("Event: ${event.type}")
                // ignore
            }
        }

    }
}