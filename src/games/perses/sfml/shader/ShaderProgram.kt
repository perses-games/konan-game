package games.perses.sfml.shader

import gles2.*
import kotlinx.cinterop.*

/**
 * User: rnentjes
 * Date: 14-4-17
 * Time: 17:21
 */


class ShaderProgram<T>(
  val drawType: Int,
  vertexShaderSource: String,
  fragmentShaderSource: String,
  val vainfo: Array<VertextAttributeInfo>,
  val setter: (program: ShaderProgram<T>, data: T) -> Unit
) {
    val program: Int
    var vertex: Int
    var fragment: Int

    var verticesBlockSize = 0
    var drawLength = 0

    init {
        vertex = compileShader(vertexShaderSource, GL_VERTEX_SHADER)
        fragment = compileShader(fragmentShaderSource, GL_FRAGMENT_SHADER)

        program = glCreateProgram()

        glAttachShader(program, vertex)
        glAttachShader(program, fragment)

        glLinkProgram(program)

        memScoped {
            val programResult = alloc<GLintVar>()
            glGetProgramiv(program, GL_LINK_STATUS, programResult.ptr)

            if (programResult.value == 0) {
                //println(webgl.getProgramInfoLog(shaderProgram))
                throw IllegalStateException("Unable to compile shader program!")
            }
        }

        glUseProgram(program)

        this.verticesBlockSize = 0

        // set attribute locations...
        for (info in vainfo.iterator()) {
            info.location = glGetAttribLocation(program, info.locationName)
            info.offset = verticesBlockSize

            verticesBlockSize += info.numElements
            println("attrib: ${info.locationName}, info.location: ${info.location}, info.numelements: ${info.numElements}, info.offset: ${info.offset}")
        }

        when (drawType) {
            GL_TRIANGLES -> {
                drawLength = verticesBlockSize * 3
            }
            else -> {
                drawLength = verticesBlockSize
            }
        }
    }

    fun compileShader(source: String, type: Int): Int {
        val result = glCreateShader(type)

        memScoped {
            val src = alloc<CPointerVar<GLcharVar>>()
            val size = alloc<GLintVar>()
            size.value = source.length // assume ascii

            src.value = source.cstr.getPointer(nativeHeap)
            glShaderSource(result, 1, src.ptr, size.ptr)
            glCompileShader(result)

            val shaderResult = alloc<GLintVar>()
            glGetShaderiv(result, GL_COMPILE_STATUS, shaderResult.ptr)
            if (shaderResult.value == 0) {
                throw IllegalStateException("Unable to compile shader!\n${source}\n\n$ {glGetShaderInfoLog(result)}")
            }
        }

        return result
    }


    fun begin(attribBuffer: Int, userdata: T) {
        glUseProgram(program)
        glBindBuffer(GL_ARRAY_BUFFER, attribBuffer)

        memScoped {
            // set attribute locations...
            for (info in vainfo.iterator()) {
                val natOffset = nativeNullPtr.plus(info.offset * 4L)

                glEnableVertexAttribArray(info.location)
                glVertexAttribPointer(info.location,
                  info.numElements,
                  GL_FLOAT,
                  0.toByte(),
                  verticesBlockSize * 4,
                  natOffset as COpaquePointer)
            }
        }

        setter(this, userdata)
    }

    fun end() {
        for (info in vainfo.iterator()) {
            glDisableVertexAttribArray(info.location)
        }
        glBindBuffer(GL_ARRAY_BUFFER, 0)
        glUseProgram(0)
    }

    fun getAttribLocation(location: String) = glGetAttribLocation(program, location)

    fun getUniformLocation(location: String) = glGetUniformLocation(program, location)

    fun setUniform1f(location: String, value: Float) { glUniform1f(getUniformLocation(location), value) }
    fun setUniform4f(location: String, v1: Float, v2: Float, v3: Float, v4: Float) { glUniform4f(getUniformLocation(location), v1, v2, v3, v4) }
    fun setUniform1i(location: String, value: Int) { glUniform1i(getUniformLocation(location), value) }
    fun setUniformMatrix4fv(location: String, value: CValuesRef<FloatVar>) { glUniformMatrix4fv(getUniformLocation(location), 1, 0.toByte(), value) }

}
