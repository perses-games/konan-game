package games.perses.sfml.shader

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
    val data : CValuesRef<FloatVar> = nativeHeap.allocArray<FloatVar>(bufferSize)
    var currentIndex: Int = 0
    var attribBuffer: Int = 0
    var counter = 0

    init {
        memScoped {
            val buffer = alloc<GLuintVar>()

            glGenBuffers(1, buffer.ptr)

            attribBuffer = buffer.value
            glBindBuffer(GL_ARRAY_BUFFER, attribBuffer)
        }
    }


    fun queue(vararg vertices: Float) {
        for (value in vertices) {
            data.getPointer(nativeHeap)[currentIndex++] = value
        }

        if (bufferFull()) {
            //println("Skipped draw call, to many values!")
            currentIndex = 0
        }
    }

    fun queueArray(vertices: Array<Float>) {
        for (index in 0..vertices.size-1) {
            data.getPointer(nativeHeap)[currentIndex++] = vertices[index]
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

            glBufferData(GL_ARRAY_BUFFER, (currentIndex * 4).toLong(), data.getPointer(nativeHeap), GL_DYNAMIC_DRAW)
            glDrawArrays(shaderProgram.drawType, 0, (currentIndex / shaderProgram.verticesBlockSize))
            currentIndex = 0

            shaderProgram.end()
        }
    }

    fun destroy() {
        nativeHeap.free(data.getPointer(nativeHeap).rawValue)
    }
}
