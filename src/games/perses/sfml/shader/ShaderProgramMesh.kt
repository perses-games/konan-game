package games.perses.sfml.shader

import games.perses.sfml.Cleanup
import gles2.*
import kotlinx.cinterop.*

/**
 * Created by rnentjes on 14-4-17.
 */

class VertextAttributeInfo(val locationName: String, val numElements: Int) {
    var location = 0
    var offset = 0
}

class ShaderProgramMesh<T>(
  val shaderProgram: ShaderProgram<T>
) {
    val bufferSize = 20000 - (20000 % shaderProgram.drawLength)
    //val data : CValuesRef<FloatVar> = nativeHeap.allocArray<FloatVar>(bufferSize)
    val data = nativeHeap.allocArray<FloatVar>(bufferSize)
    var currentIndex: Int = 0
    var attribBuffer: Int = 0
    var counter = 0

    init {
        memScoped {
            val buffer = alloc<GLuintVar>()

            glGenBuffers(1, buffer.ptr)

            attribBuffer = buffer.value
            glBindBuffer(GL_ARRAY_BUFFER, attribBuffer)
            glBufferData(GL_ARRAY_BUFFER, (bufferSize * 4).toLong(), data.getPointer(memScope), GL_DYNAMIC_DRAW)
            glBindBuffer(GL_ARRAY_BUFFER, 0)
        }

        Cleanup.add {
            nativeHeap.free(data)
        }
    }


    fun queue(vararg vertices: Float) {
        for (value in vertices) {
            data[currentIndex++] = value
        }

        if (bufferFull()) {
            //println("Skipped draw call, to many values!")
            currentIndex = 0
        }
    }

    fun queueArray(vertices: Array<Float>) {
        for (index in 0..vertices.size - 1) {
            data[currentIndex++] = vertices[index]
        }

        if (bufferFull()) {
            //println("Skipped draw call, to many values!")
            currentIndex = 0
        }
    }

    fun remaining() = bufferSize - currentIndex

    fun bufferFull() = currentIndex == bufferSize

    fun render(userdata: T) {
        counter++
        if (currentIndex > 0) {
            if (currentIndex % shaderProgram.verticesBlockSize != 0) {
                throw IllegalStateException("Number of vertices not a multiple of the attribute block size!")
            }

            shaderProgram.begin(attribBuffer, userdata)

            glBufferSubData(GL_ARRAY_BUFFER, 0, (currentIndex * 4).toLong(), data)
            // println("Draw arrays $currentIndex / ${shaderProgram.verticesBlockSize} = ${currentIndex / shaderProgram.verticesBlockSize}")
            glDrawArrays(shaderProgram.drawType, 0, (currentIndex / shaderProgram.verticesBlockSize))
            currentIndex = 0

            shaderProgram.end()
        }
    }

}
