package games.perses.sfml

import games.perses.sfml.math.Matrix4
import gles2.glViewport
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.readValue
import sfml.sfFloatRect
import sfml.sfView
import sfml.sfView_createFromRect
import sfml.sfView_setViewport

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
    var unitWidth: Int = windowWidth
    var unitHeight: Int = windowHeight
    var borderLeft: Int = 0
    var borderTop: Int = 0
    var mode: ViewMode = ViewMode.NONE
    var aspectRatio: Float = windowWidth / windowHeight.toFloat()
    var minAspectRatio: Float = 0.9f
    var maxAspectRatio: Float = 1.1f

    val matrix = Matrix4()
    var view: CPointer<sfView>
    val rect = nativeHeap.alloc<sfFloatRect>()
    val viewportRect = nativeHeap.alloc<sfFloatRect>()

      init {
          updateViewport()

          view = sfView_createFromRect(rect.readValue()) ?: throw IllegalStateException("Unable to create view!")
      }

    fun resize(width: Int, height: Int) {
        this.windowWidth = width
        this.windowHeight = height

        aspectRatio = windowWidth / windowHeight.toFloat()

        println("RESIZED $aspectRatio -- $width, $height!")

        if (aspectRatio < minAspectRatio) {
            aspectRatio = minAspectRatio

            unitHeight = (windowWidth / aspectRatio).toInt()
            unitWidth = windowWidth
        } else if (aspectRatio > maxAspectRatio) {
            aspectRatio = maxAspectRatio

            unitHeight = windowHeight
            unitWidth = (windowHeight * aspectRatio).toInt()
        } else {
            unitHeight = windowHeight
            unitWidth = windowWidth
        }

        borderLeft = (windowWidth - unitWidth) / 2
        borderTop = (windowHeight - unitHeight) / 2

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

        println("Set viewport to $aspectRatio -- $borderLeft, $borderTop, $windowWidth, $windowHeight (window: $width, $height)")
        updateViewport()
        println("Set matrix to $viewportWidth, $viewportHeight")
        matrix.setOrthographicProjection(-viewportWidth / 2f, viewportWidth / 2f, viewportHeight / 2f, -viewportHeight / 2f, -5f, 5f)
    }

    fun setToWidth(width: Int) {
        viewportWidth = width
        mode = ViewMode.WIDTH

        resize(windowWidth, windowHeight)
    }

    fun setToHeight(height: Int) {
        viewportHeight = height
        mode = ViewMode.HEIGHT

        resize(windowWidth, windowHeight)
    }

    fun updateViewport() {
        rect.left = -viewportWidth / 2f
        rect.top = -viewportHeight / 2f
        rect.width = viewportWidth.toFloat()
        rect.height = viewportHeight.toFloat()

        viewportRect.left = borderLeft.toFloat() / windowWidth
        viewportRect.top = borderTop.toFloat() / windowHeight
        viewportRect.width = unitWidth.toFloat() / windowWidth
        viewportRect.height = unitHeight.toFloat() / windowHeight

        view = sfView_createFromRect(rect.readValue()) ?: throw IllegalStateException("Unable to create view!")
        sfView_setViewport(view, viewportRect.readValue())

        glViewport(borderLeft, borderTop, unitWidth, unitHeight)
    }
}
