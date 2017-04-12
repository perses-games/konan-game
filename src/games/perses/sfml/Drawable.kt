package games.perses.sfml

import sfml.sfRenderWindow

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 11:15
 */

interface Drawable {

    fun draw(window: sfRenderWindow)

    fun setPosition(x: Float, y:Float)

}
