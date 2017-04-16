package games.perses.sfml.sprite

import games.perses.sfml.texture.TextureMesh

/**
 * Created by rnentjes on 16-4-17.
 */

class Sprite(
  val texture: TextureMesh,
  var x: Float,
  var y: Float,
  var scale: Float = 1f,
  var rotation: Float = 0f
  ) {

    fun render() {
        texture.queueDraw(x, y, scale, rotation)
    }

}