package games.perses.sfml.shader

import gles2.*
import kotlinx.cinterop.*

/**
 * User: rnentjes
 * Date: 14-4-17
 * Time: 17:21
 */

class ShaderProgram<T>(
  vertexShaderSource: String,
  fragmentShaderSource: String
) {
    var vertex: Int
    var fragment: Int

    init {
        vertex = compileShader(vertexShaderSource, GL_VERTEX_SHADER)
        fragment = compileShader(fragmentShaderSource, GL_FRAGMENT_SHADER)

        val program: Int = glCreateProgram()

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

            glUseProgram(program)
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

}
