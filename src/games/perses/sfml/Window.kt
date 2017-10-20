package games.perses.sfml

import kotlinx.cinterop.*
import sfml.*
import cnames.structs.sfRenderWindow

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 12:25
 */

enum class WindowStyle(val value: Int) {
    NONE(sfNone),
    TITLE_BAR(sfTitlebar),
    RESIZE(sfResize),
    CLOSE(sfClose),
    FULLSCREEN(sfFullscreen),
    DEFAULT(sfDefaultStyle),
}

class WindowOptions(
    var depthBits: Int,
    var stencilBits: Int,
    var antialiasingLevel: Int,
    var majorVersion: Int,
    var minorVersion: Int,
    var attributeFlags: sfUint32
)

class SizedWindow(
  title: String,
  width: Int,
  height: Int,
  options: WindowOptions? = null
): Window(title, width, height, options, false)

class FullscreenWindow(
  title: String,
  options: WindowOptions? = null
): Window(title, 800, 600, options, true)

open class Window(
  val title: String,
  val width: Int,
  val height: Int,
  val options: WindowOptions? = null,
  var fullscreen: Boolean = false
) {
    val event = nativeHeap.alloc<sfEvent>()
    var handle: CPointer<sfRenderWindow>? = null
    private var clearColor = sfColor_fromRGBA(0,0,0,255.toByte())

    constructor(title: String): this(title, 800, 600)

    init {
        createWindow()

        Cleanup.add {
            nativeHeap.free(event)

            handle?.apply {
                sfRenderWindow_destroy(this)
            }
        }
    }

    private fun getWindowHandle() = handle ?: throw IllegalStateException("Window handle is null!")

    private fun createWindow() {
        var window: CPointer<sfRenderWindow>?

        handle?.apply {
            sfRenderWindow_destroy(this)
        }

        memScoped {
            var videoMode: CValue<sfVideoMode> = sfVideoMode_getDesktopMode()
            var style: Int = sfDefaultStyle

            if (!fullscreen) {
                val vm = alloc<sfVideoMode>()

                vm.width = width
                vm.height = height
                vm.bitsPerPixel = 24

                videoMode = vm.readValue()
                style = style and (-sfFullscreen + 1)
            } else {
                style = style or sfFullscreen
            }

            val windowContext = alloc<sfContextSettings>()

            windowContext.majorVersion = options?.majorVersion  ?: 2
            windowContext.minorVersion = options?.minorVersion ?: 0
            windowContext.depthBits = options?.depthBits ?: 0
            windowContext.antialiasingLevel = options?.antialiasingLevel ?: 4
            // windowContext.attributeFlags = sfContextDebug

            window = sfRenderWindow_create(videoMode, title, style, windowContext.readValue())

            if (window != null) {
                handle = window

                videoMode.useContents {
                    println("Resize from videoMode: $width, $height")
                    View.resize(width, height)
                }
            } else {
                throw IllegalStateException("Unable to create window!")
            }
        }
    }

    fun clear() {
        sfRenderWindow_clear(getWindowHandle(), clearColor)
    }

    fun resetGLStates() {
        sfRenderWindow_resetGLStates(getWindowHandle())
    }

    fun pushGLStates() {
        sfRenderWindow_pushGLStates(getWindowHandle())
    }

    fun popGLStates() {
        sfRenderWindow_popGLStates(getWindowHandle())
    }

    fun draw(drawable: Drawable) {
        drawable.draw(getWindowHandle().pointed)
    }

    fun draw(drawable: Drawable, x: Float, y: Float) {
        drawable.setPosition(x, y)
        drawable.draw(getWindowHandle().pointed)
    }

    fun display() {
        sfRenderWindow_display(getWindowHandle())
    }

    fun close() {
        sfRenderWindow_close(getWindowHandle())
    }

    fun destroy() {
        sfRenderWindow_destroy(getWindowHandle())
    }

    fun pollEvents() {
        while (sfRenderWindow_pollEvent(getWindowHandle(), event.ptr) > 0) {
            Events.handleEvent(event)
        }
    }

    fun isOpen() = sfRenderWindow_isOpen(getWindowHandle()) > 0

    fun enableVerticalSync() {
        sfRenderWindow_setVerticalSyncEnabled(getWindowHandle(), 1)
    }

    fun disableVerticalSync() {
        sfRenderWindow_setVerticalSyncEnabled(getWindowHandle(), 0)
    }

    fun getView(): CPointer<sfView>? = sfRenderWindow_getDefaultView(getWindowHandle())

    fun setView(view: CPointer<sfView>?) = sfRenderWindow_setView(getWindowHandle(), view)

    fun setClearColor(red: Byte, green: Byte, blue: Byte) {
        clearColor = sfColor_fromRGB(red, green, blue);
    }

    fun switchFullscreen() {
        fullscreen = !fullscreen

        createWindow()
    }
}
