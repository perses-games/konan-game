package games.perses.sfml

import gles2.glViewport
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
  val style: Int = sfFullscreen,
  var fullscreen: Boolean = false
) {

    var videoMode: CValue<sfVideoMode> = sfVideoMode_getDesktopMode()
    val event = nativeHeap.alloc<sfEvent>()
    var handle: sfRenderWindow? = null
    var clearColor = sfColor_fromRGBA(0,0,0,255.toByte())

    constructor(title: String): this(title, 800, 600, fullscreen = true)

    init {
        if (!fullscreen) {
            memScoped {
                val vm = alloc<sfVideoMode>()

                vm.width = width
                vm.height = height
                vm.bitsPerPixel = 24

                videoMode = vm.readValue()
            }
        }

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
            // windowContext.attributeFlags = sfContextDebug

            window = sfRenderWindow_create(videoMode, title, style, windowContext.readValue())

            if (window != null) {
                handle = (window as CPointer<sfRenderWindow>).pointed

                videoMode.useContents {
                    glViewport(0, 0, width, height)
                }
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

