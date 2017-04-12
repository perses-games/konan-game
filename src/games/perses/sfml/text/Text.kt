package games.perses.sfml.text

import games.perses.sfml.Drawable
import kotlinx.cinterop.*
import kotlinx.cinterop.nativeHeap.free
import sfml.*

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 11:15
 */

class Font(
  val filename: String
) {
    val fontHandle = sfFont_createFromFile(filename)

    fun destroy() {
        sfFont_destroy(fontHandle)
    }
}

class Text(
  font: Font,
  var x: Float,
  var y: Float,
  text: String,
  size: Int,
  red: Byte = 255.toByte(),
  green: Byte = 255.toByte(),
  blue: Byte = 255.toByte()
  ): Drawable {
    val textHandle = sfText_create()
    val position = nativeHeap.alloc<sfVector2f>()

    init {
        sfText_setFont(textHandle, font.fontHandle)
        sfText_setString(textHandle, text)
        sfText_setCharacterSize(textHandle, size)
        sfText_setColor(textHandle, sfColor_fromRGB(red, green ,blue))

        position.x = x
        position.y = y
    }

    fun destroy() {
        sfText_destroy(textHandle)
        free(position.rawPtr)
    }

    override fun setPosition(x: Float, y: Float) {
        position.x = x
        position.y = y
    }

    override fun draw(window: sfRenderWindow) {
        sfText_setPosition(textHandle, position.readValue())
        sfRenderWindow_drawText(window.ptr, textHandle, null)
    }
}
