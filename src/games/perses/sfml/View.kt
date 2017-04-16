package games.perses.sfml

import games.perses.sfml.math.Matrix4
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.readValue
import sfml.sfFloatRect
import sfml.sfView
import sfml.sfView_createFromRect

/**
 * Created by rnentjes on 16-4-17.
 */

enum class ViewMode {
    NONE,
    WIDTH,
    HEIGHT
}

object View {
    var windowWidth: Int = 800
    var windowHeight: Int = 600
    var viewportWidth: Int = windowWidth
    var viewportHeight: Int = windowHeight
    var aspectRatio: Float = windowWidth / windowHeight.toFloat()
    var mode: ViewMode = ViewMode.NONE
    var minAspectRatio: Float = 1f
    var maxAspectRatio: Float = 1f

    val matrix = Matrix4()
    var view: CPointer<sfView>
    val rect = nativeHeap.alloc<sfFloatRect>()

      init {
          rect.left = -400f
          rect.top = -300f
          rect.width = 800f
          rect.height = 600f

          view = sfView_createFromRect(rect.readValue()) ?: throw IllegalStateException("Unable to create view!")
      }

    fun resize(width: Int, height: Int) {
        this.windowWidth = width
        this.windowHeight = height

        println("RESIZED $width, $height!")

        aspectRatio = windowWidth / windowHeight.toFloat()

        if (aspectRatio < minAspectRatio) {
            aspectRatio = minAspectRatio

            windowHeight = (windowWidth / aspectRatio).toInt()
        }

        if (aspectRatio > maxAspectRatio) {
            aspectRatio = maxAspectRatio

            windowWidth = (windowHeight * aspectRatio).toInt()
        }

        when(mode) {
            ViewMode.NONE -> {

            }
            ViewMode.WIDTH -> {
                viewportHeight = (viewportWidth / aspectRatio).toInt()
            }
            ViewMode.HEIGHT -> {
                viewportWidth = (viewportHeight * aspectRatio).toInt()
            }
        }

        println("Set matrix to $viewportWidth, $viewportHeight")
        matrix.setOrthographicProjection(-viewportWidth / 2f, viewportWidth / 2f, viewportHeight / 2f, -viewportHeight / 2f, -5f, 5f)

        rect.left = -viewportWidth / 2f
        rect.top = -viewportHeight / 2f
        rect.width = viewportWidth.toFloat()
        rect.height = viewportHeight.toFloat()

        view = sfView_createFromRect(rect.readValue()) ?: throw IllegalStateException("Unable to create view!")
    }

    fun setToWidth(width: Int) {
        viewportWidth = width
        mode = ViewMode.WIDTH

        resize(width, windowHeight)
    }

    fun setToHeight(height: Int) {
        viewportHeight = height
        mode = ViewMode.HEIGHT

        resize(windowWidth, height)
    }
}
