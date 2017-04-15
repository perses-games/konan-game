import gles2.*
import kotlinx.cinterop.*

/**
 * User: rnentjes
 * Date: 15-4-17
 * Time: 13:14
 */

//language=GLSL
private val vertexShaderSource2 = """
    attribute vec2 a_position;

    void main(void) {
        // u_projectionView *
        gl_Position = vec4(a_position, 0.0, 1.0);
    }
"""

//language=GLSL
private val fragmentShaderSource2 = """
    precision mediump float;

    void main(void) {
        //gl_FragColor = texture2D(u_sampler, v_textCoord);
        gl_FragColor = vec4(0.0, 100.0, 0.0, 1.0);
    }
"""


object Gles2Test {
    var vertex = 0
    var fragment = 0
    var program = 0
    var position = 0
    var buffer = 0


    val bufferSize = 6
    val data : CValuesRef<FloatVar> = nativeHeap.allocArray<FloatVar>(6)

    fun init() {
        println("GL_VERSION: ${glGetString(GL_VERSION)?.toKString()}")
        println("GL_RENDERER: ${glGetString(GL_RENDERER)?.toKString()}")

        //glViewport(0, 0, 1024, 768)
        createProgram()
        createBuffer()

        println("program: $program")
        println("position: $position")
        println("data: $data")
    }

    fun createBuffer() {
        val dataPointer = data.getPointer(nativeHeap)

        dataPointer[0] = -0.5f
        dataPointer[1] = -0.5f

        dataPointer[2] =  0.5f
        dataPointer[3] = -0.5f

        dataPointer[4] =  0.5f
        dataPointer[5] =  0.5f

        memScoped {
            val bufferRef = alloc<GLuintVar>()

            glGenBuffers(1, bufferRef.ptr)

            buffer = bufferRef.value
            glBindBuffer(GL_ARRAY_BUFFER, buffer)
            glBufferData(GL_ARRAY_BUFFER, (bufferSize * 4).toLong(), dataPointer, GL_STATIC_DRAW)
            //glVertexAttribPointer(position, 2, GL_FLOAT, 0.toByte(), 0, pointer.ptr)
            //glEnableVertexAttribArray(position)
            glBindBuffer(GL_ARRAY_BUFFER, 0)
        }
    }

    fun createProgram() {
        vertex = compileShader(vertexShaderSource2, GL_VERTEX_SHADER)
        fragment = compileShader(fragmentShaderSource2, GL_FRAGMENT_SHADER)

        program = glCreateProgram()

        glAttachShader(program, vertex)
        glAttachShader(program, fragment)

        glBindAttribLocation(program, 0, "a_position")

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

        position = glGetAttribLocation(program, "a_position")
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

    fun render() {
        memScoped {
            val pointer = alloc<LongVar>()
            pointer.value = 0L

            glUseProgram(program)
            glBindBuffer(GL_ARRAY_BUFFER, buffer)
            glVertexAttribPointer(position, 2, GL_FLOAT, 0.toByte(), 0, pointer.ptr)
            glEnableVertexAttribArray(position)
            glDrawArrays(GL_TRIANGLES, 0, 3)
            glDisableVertexAttribArray(position)
            glUseProgram(0)

        }
    }

}