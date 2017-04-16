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
  val style: Int = sfDefaultStyle,
  var fullscreen: Boolean = false
) {

    val event = nativeHeap.alloc<sfEvent>()
    var handle: sfRenderWindow? = null
    var clearColor = sfColor_fromRGBA(0,0,0,255.toByte())

    constructor(title: String): this(title, 800, 600, fullscreen = true)

    init {
        createWindow()
    }

    private fun getWindowHandle() = handle ?: throw IllegalStateException("Window handle is null!")

    private fun createWindow() {
        var window: CPointer<sfRenderWindow>? = null

        memScoped {
            val windowContext = alloc<sfContextSettings>()

            windowContext.majorVersion = 2
            windowContext.minorVersion = 0
            windowContext.depthBits = 0
            windowContext.attributeFlags = sfContextDebug

            if (fullscreen) {
                window = sfRenderWindow_create(sfVideoMode_getDesktopMode(), title, sfFullscreen, windowContext.readValue())
            } else {
                memScoped {
                    val videoMode = alloc<sfVideoMode>()

                    videoMode.width = width
                    videoMode.height = height
                    videoMode.bitsPerPixel = 24

                    window = sfRenderWindow_create(videoMode.readValue(), title, style, windowContext.readValue())
                }
            }

            if (window != null) {
                handle = (window as CPointer<sfRenderWindow>).pointed
            } else {
                throw IllegalStateException("Unable to create window!")
            }
        }
    }

    fun clear() {
        sfRenderWindow_clear(getWindowHandle().ptr, clearColor)
    }

    fun resetGLStates() {
        sfRenderWindow_resetGLStates(getWindowHandle().ptr)
    }

    fun pushGLStates() {
        sfRenderWindow_pushGLStates(getWindowHandle().ptr)
    }

    fun popGLStates() {
        sfRenderWindow_popGLStates(getWindowHandle().ptr)
    }

    fun draw(drawable: Drawable) {
        drawable.draw(getWindowHandle())
    }

    fun draw(drawable: Drawable, x: Float, y: Float) {
        drawable.setPosition(x, y)
        drawable.draw(getWindowHandle())
    }

    fun display() {
        sfRenderWindow_display(getWindowHandle().ptr)
    }

    fun close() {
        sfRenderWindow_close(getWindowHandle().ptr)
    }

    fun destroy() {
        nativeHeap.free(event.ptr)
        sfRenderWindow_destroy(getWindowHandle().ptr)
    }

    fun pollEvents(callback: (sfEvent) -> Unit) {
        while (sfRenderWindow_pollEvent(getWindowHandle().ptr, event.ptr) > 0) {
            callback(event)
        }
    }

    fun isOpen() = sfRenderWindow_isOpen(getWindowHandle().ptr) > 0

    fun enableVerticalSync() {
        sfRenderWindow_setVerticalSyncEnabled(getWindowHandle().ptr, 1)
    }

    fun disableVerticalSync() {
        sfRenderWindow_setVerticalSyncEnabled(getWindowHandle().ptr, 0)
    }

    fun getView(): CPointer<sfView>? = sfRenderWindow_getDefaultView(getWindowHandle().ptr)

    fun setView(view: CPointer<sfView>?) = sfRenderWindow_setView(getWindowHandle().ptr, view)
}

