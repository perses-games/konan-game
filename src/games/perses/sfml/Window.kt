package games.perses.sfml

import kotlinx.cinterop.*
import sfml.*

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 12:25
 */


class Window(
  val title: String,
  val width: Int,
  val height: Int,
  val style: Int = sfDefaultStyle
) {
    var fullscreen = false
    set(value) {
        // todo: switch fullscreen
        field = value
    }
    val handle: sfRenderWindow
    var clearColor = sfColor_fromRGBA(0,0,0,255.toByte())

    constructor(title: String): this(title, 800, 600) {
        fullscreen = true
    }

    init {
        var window: CPointer<sfRenderWindow>? = null

        if (fullscreen) {
            window = sfRenderWindow_create(sfVideoMode_getDesktopMode(), title, sfFullscreen, null)
        } else {
            memScoped {
                val videoMode = alloc<sfVideoMode>()

                videoMode.width = width
                videoMode.height = height
                videoMode.bitsPerPixel = 24

                window = sfRenderWindow_create(videoMode.readValue(), title, style, null)
            }
        }

        if (window != null) {
            handle = (window as CPointer<sfRenderWindow>).pointed
        } else {
            throw IllegalStateException("Unable to create window!")
        }
    }

    fun clear() {
        sfRenderWindow_clear(handle.ptr, clearColor)
    }

    fun draw(drawable: Drawable) {
        drawable.draw(handle)
    }

    fun display() {
        sfRenderWindow_display(handle.ptr)
    }

    fun destroy() {
        sfRenderWindow_destroy(handle.ptr)
    }
}

