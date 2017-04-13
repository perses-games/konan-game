@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package opengl

import konan.SymbolName
import kotlinx.cinterop.*

@SymbolName("kni_opengl_glClearIndex")
external fun glClearIndex(c: GLfloat): Unit

@SymbolName("kni_opengl_glClearColor")
external fun glClearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit

@SymbolName("kni_opengl_glClear")
external fun glClear(mask: GLbitfield): Unit

@SymbolName("kni_opengl_glIndexMask")
external fun glIndexMask(mask: GLuint): Unit

@SymbolName("kni_opengl_glColorMask")
external fun glColorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit

@SymbolName("kni_opengl_glAlphaFunc")
external fun glAlphaFunc(func: GLenum, ref: GLclampf): Unit

@SymbolName("kni_opengl_glBlendFunc")
external fun glBlendFunc(sfactor: GLenum, dfactor: GLenum): Unit

@SymbolName("kni_opengl_glLogicOp")
external fun glLogicOp(opcode: GLenum): Unit

@SymbolName("kni_opengl_glCullFace")
external fun glCullFace(mode: GLenum): Unit

@SymbolName("kni_opengl_glFrontFace")
external fun glFrontFace(mode: GLenum): Unit

@SymbolName("kni_opengl_glPointSize")
external fun glPointSize(size: GLfloat): Unit

@SymbolName("kni_opengl_glLineWidth")
external fun glLineWidth(width: GLfloat): Unit

@SymbolName("kni_opengl_glLineStipple")
external fun glLineStipple(factor: GLint, pattern: GLushort): Unit

@SymbolName("kni_opengl_glPolygonMode")
external fun glPolygonMode(face: GLenum, mode: GLenum): Unit

@SymbolName("kni_opengl_glPolygonOffset")
external fun glPolygonOffset(factor: GLfloat, units: GLfloat): Unit

fun glPolygonStipple(mask: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _mask = mask?.getPointer(memScope).rawValue
        val res = kni_glPolygonStipple(_mask)
        res
    }
}

@SymbolName("kni_opengl_glPolygonStipple")
private external fun kni_glPolygonStipple(mask: NativePtr): Unit

fun glGetPolygonStipple(mask: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _mask = mask?.getPointer(memScope).rawValue
        val res = kni_glGetPolygonStipple(_mask)
        res
    }
}

@SymbolName("kni_opengl_glGetPolygonStipple")
private external fun kni_glGetPolygonStipple(mask: NativePtr): Unit

@SymbolName("kni_opengl_glEdgeFlag")
external fun glEdgeFlag(flag: GLboolean): Unit

fun glEdgeFlagv(flag: CValuesRef<GLbooleanVar>?): Unit {
    return memScoped {
        val _flag = flag?.getPointer(memScope).rawValue
        val res = kni_glEdgeFlagv(_flag)
        res
    }
}

@SymbolName("kni_opengl_glEdgeFlagv")
private external fun kni_glEdgeFlagv(flag: NativePtr): Unit

@SymbolName("kni_opengl_glScissor")
external fun glScissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit

fun glClipPlane(plane: GLenum, equation: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _plane = plane
        val _equation = equation?.getPointer(memScope).rawValue
        val res = kni_glClipPlane(_plane, _equation)
        res
    }
}

@SymbolName("kni_opengl_glClipPlane")
private external fun kni_glClipPlane(plane: Int, equation: NativePtr): Unit

fun glGetClipPlane(plane: GLenum, equation: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _plane = plane
        val _equation = equation?.getPointer(memScope).rawValue
        val res = kni_glGetClipPlane(_plane, _equation)
        res
    }
}

@SymbolName("kni_opengl_glGetClipPlane")
private external fun kni_glGetClipPlane(plane: Int, equation: NativePtr): Unit

@SymbolName("kni_opengl_glDrawBuffer")
external fun glDrawBuffer(mode: GLenum): Unit

@SymbolName("kni_opengl_glReadBuffer")
external fun glReadBuffer(mode: GLenum): Unit

@SymbolName("kni_opengl_glEnable")
external fun glEnable(cap: GLenum): Unit

@SymbolName("kni_opengl_glDisable")
external fun glDisable(cap: GLenum): Unit

@SymbolName("kni_opengl_glIsEnabled")
external fun glIsEnabled(cap: GLenum): GLboolean

@SymbolName("kni_opengl_glEnableClientState")
external fun glEnableClientState(cap: GLenum): Unit

@SymbolName("kni_opengl_glDisableClientState")
external fun glDisableClientState(cap: GLenum): Unit

fun glGetBooleanv(pname: GLenum, params: CValuesRef<GLbooleanVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetBooleanv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetBooleanv")
private external fun kni_glGetBooleanv(pname: Int, params: NativePtr): Unit

fun glGetDoublev(pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetDoublev(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetDoublev")
private external fun kni_glGetDoublev(pname: Int, params: NativePtr): Unit

fun glGetFloatv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetFloatv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetFloatv")
private external fun kni_glGetFloatv(pname: Int, params: NativePtr): Unit

fun glGetIntegerv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetIntegerv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetIntegerv")
private external fun kni_glGetIntegerv(pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glPushAttrib")
external fun glPushAttrib(mask: GLbitfield): Unit

@SymbolName("kni_opengl_glPopAttrib")
external fun glPopAttrib(): Unit

@SymbolName("kni_opengl_glPushClientAttrib")
external fun glPushClientAttrib(mask: GLbitfield): Unit

@SymbolName("kni_opengl_glPopClientAttrib")
external fun glPopClientAttrib(): Unit

@SymbolName("kni_opengl_glRenderMode")
external fun glRenderMode(mode: GLenum): GLint

@SymbolName("kni_opengl_glGetError")
external fun glGetError(): GLenum

@SymbolName("kni_opengl_glGetString")
external fun glGetString(name: GLenum): CPointer<GLubyteVar>?

@SymbolName("kni_opengl_glFinish")
external fun glFinish(): Unit

@SymbolName("kni_opengl_glFlush")
external fun glFlush(): Unit

@SymbolName("kni_opengl_glHint")
external fun glHint(target: GLenum, mode: GLenum): Unit

@SymbolName("kni_opengl_glClearDepth")
external fun glClearDepth(depth: GLclampd): Unit

@SymbolName("kni_opengl_glDepthFunc")
external fun glDepthFunc(func: GLenum): Unit

@SymbolName("kni_opengl_glDepthMask")
external fun glDepthMask(flag: GLboolean): Unit

@SymbolName("kni_opengl_glDepthRange")
external fun glDepthRange(near_val: GLclampd, far_val: GLclampd): Unit

@SymbolName("kni_opengl_glClearAccum")
external fun glClearAccum(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit

@SymbolName("kni_opengl_glAccum")
external fun glAccum(op: GLenum, value: GLfloat): Unit

@SymbolName("kni_opengl_glMatrixMode")
external fun glMatrixMode(mode: GLenum): Unit

@SymbolName("kni_opengl_glOrtho")
external fun glOrtho(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble, near_val: GLdouble, far_val: GLdouble): Unit

@SymbolName("kni_opengl_glFrustum")
external fun glFrustum(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble, near_val: GLdouble, far_val: GLdouble): Unit

@SymbolName("kni_opengl_glViewport")
external fun glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit

@SymbolName("kni_opengl_glPushMatrix")
external fun glPushMatrix(): Unit

@SymbolName("kni_opengl_glPopMatrix")
external fun glPopMatrix(): Unit

@SymbolName("kni_opengl_glLoadIdentity")
external fun glLoadIdentity(): Unit

fun glLoadMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glLoadMatrixd(_m)
        res
    }
}

@SymbolName("kni_opengl_glLoadMatrixd")
private external fun kni_glLoadMatrixd(m: NativePtr): Unit

fun glLoadMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glLoadMatrixf(_m)
        res
    }
}

@SymbolName("kni_opengl_glLoadMatrixf")
private external fun kni_glLoadMatrixf(m: NativePtr): Unit

fun glMultMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glMultMatrixd(_m)
        res
    }
}

@SymbolName("kni_opengl_glMultMatrixd")
private external fun kni_glMultMatrixd(m: NativePtr): Unit

fun glMultMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glMultMatrixf(_m)
        res
    }
}

@SymbolName("kni_opengl_glMultMatrixf")
private external fun kni_glMultMatrixf(m: NativePtr): Unit

@SymbolName("kni_opengl_glRotated")
external fun glRotated(angle: GLdouble, x: GLdouble, y: GLdouble, z: GLdouble): Unit

@SymbolName("kni_opengl_glRotatef")
external fun glRotatef(angle: GLfloat, x: GLfloat, y: GLfloat, z: GLfloat): Unit

@SymbolName("kni_opengl_glScaled")
external fun glScaled(x: GLdouble, y: GLdouble, z: GLdouble): Unit

@SymbolName("kni_opengl_glScalef")
external fun glScalef(x: GLfloat, y: GLfloat, z: GLfloat): Unit

@SymbolName("kni_opengl_glTranslated")
external fun glTranslated(x: GLdouble, y: GLdouble, z: GLdouble): Unit

@SymbolName("kni_opengl_glTranslatef")
external fun glTranslatef(x: GLfloat, y: GLfloat, z: GLfloat): Unit

@SymbolName("kni_opengl_glIsList")
external fun glIsList(list: GLuint): GLboolean

@SymbolName("kni_opengl_glDeleteLists")
external fun glDeleteLists(list: GLuint, range: GLsizei): Unit

@SymbolName("kni_opengl_glGenLists")
external fun glGenLists(range: GLsizei): GLuint

@SymbolName("kni_opengl_glNewList")
external fun glNewList(list: GLuint, mode: GLenum): Unit

@SymbolName("kni_opengl_glEndList")
external fun glEndList(): Unit

@SymbolName("kni_opengl_glCallList")
external fun glCallList(list: GLuint): Unit

@SymbolName("kni_opengl_glCallLists")
external fun glCallLists(n: GLsizei, type: GLenum, lists: COpaquePointer?): Unit

@SymbolName("kni_opengl_glListBase")
external fun glListBase(base: GLuint): Unit

@SymbolName("kni_opengl_glBegin")
external fun glBegin(mode: GLenum): Unit

@SymbolName("kni_opengl_glEnd")
external fun glEnd(): Unit

@SymbolName("kni_opengl_glVertex2d")
external fun glVertex2d(x: GLdouble, y: GLdouble): Unit

@SymbolName("kni_opengl_glVertex2f")
external fun glVertex2f(x: GLfloat, y: GLfloat): Unit

@SymbolName("kni_opengl_glVertex2i")
external fun glVertex2i(x: GLint, y: GLint): Unit

@SymbolName("kni_opengl_glVertex2s")
external fun glVertex2s(x: GLshort, y: GLshort): Unit

@SymbolName("kni_opengl_glVertex3d")
external fun glVertex3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit

@SymbolName("kni_opengl_glVertex3f")
external fun glVertex3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit

@SymbolName("kni_opengl_glVertex3i")
external fun glVertex3i(x: GLint, y: GLint, z: GLint): Unit

@SymbolName("kni_opengl_glVertex3s")
external fun glVertex3s(x: GLshort, y: GLshort, z: GLshort): Unit

@SymbolName("kni_opengl_glVertex4d")
external fun glVertex4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit

@SymbolName("kni_opengl_glVertex4f")
external fun glVertex4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit

@SymbolName("kni_opengl_glVertex4i")
external fun glVertex4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit

@SymbolName("kni_opengl_glVertex4s")
external fun glVertex4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit

fun glVertex2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex2dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex2dv")
private external fun kni_glVertex2dv(v: NativePtr): Unit

fun glVertex2fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex2fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex2fv")
private external fun kni_glVertex2fv(v: NativePtr): Unit

fun glVertex2iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex2iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex2iv")
private external fun kni_glVertex2iv(v: NativePtr): Unit

fun glVertex2sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex2sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex2sv")
private external fun kni_glVertex2sv(v: NativePtr): Unit

fun glVertex3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex3dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex3dv")
private external fun kni_glVertex3dv(v: NativePtr): Unit

fun glVertex3fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex3fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex3fv")
private external fun kni_glVertex3fv(v: NativePtr): Unit

fun glVertex3iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex3iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex3iv")
private external fun kni_glVertex3iv(v: NativePtr): Unit

fun glVertex3sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex3sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex3sv")
private external fun kni_glVertex3sv(v: NativePtr): Unit

fun glVertex4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex4dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex4dv")
private external fun kni_glVertex4dv(v: NativePtr): Unit

fun glVertex4fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex4fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex4fv")
private external fun kni_glVertex4fv(v: NativePtr): Unit

fun glVertex4iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex4iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex4iv")
private external fun kni_glVertex4iv(v: NativePtr): Unit

fun glVertex4sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertex4sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glVertex4sv")
private external fun kni_glVertex4sv(v: NativePtr): Unit

@SymbolName("kni_opengl_glNormal3b")
external fun glNormal3b(nx: GLbyte, ny: GLbyte, nz: GLbyte): Unit

@SymbolName("kni_opengl_glNormal3d")
external fun glNormal3d(nx: GLdouble, ny: GLdouble, nz: GLdouble): Unit

@SymbolName("kni_opengl_glNormal3f")
external fun glNormal3f(nx: GLfloat, ny: GLfloat, nz: GLfloat): Unit

@SymbolName("kni_opengl_glNormal3i")
external fun glNormal3i(nx: GLint, ny: GLint, nz: GLint): Unit

@SymbolName("kni_opengl_glNormal3s")
external fun glNormal3s(nx: GLshort, ny: GLshort, nz: GLshort): Unit

fun glNormal3bv(v: CValuesRef<GLbyteVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glNormal3bv(_v)
        res
    }
}

@SymbolName("kni_opengl_glNormal3bv")
private external fun kni_glNormal3bv(v: NativePtr): Unit

fun glNormal3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glNormal3dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glNormal3dv")
private external fun kni_glNormal3dv(v: NativePtr): Unit

fun glNormal3fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glNormal3fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glNormal3fv")
private external fun kni_glNormal3fv(v: NativePtr): Unit

fun glNormal3iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glNormal3iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glNormal3iv")
private external fun kni_glNormal3iv(v: NativePtr): Unit

fun glNormal3sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glNormal3sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glNormal3sv")
private external fun kni_glNormal3sv(v: NativePtr): Unit

@SymbolName("kni_opengl_glIndexd")
external fun glIndexd(c: GLdouble): Unit

@SymbolName("kni_opengl_glIndexf")
external fun glIndexf(c: GLfloat): Unit

@SymbolName("kni_opengl_glIndexi")
external fun glIndexi(c: GLint): Unit

@SymbolName("kni_opengl_glIndexs")
external fun glIndexs(c: GLshort): Unit

@SymbolName("kni_opengl_glIndexub")
external fun glIndexub(c: GLubyte): Unit

fun glIndexdv(c: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _c = c?.getPointer(memScope).rawValue
        val res = kni_glIndexdv(_c)
        res
    }
}

@SymbolName("kni_opengl_glIndexdv")
private external fun kni_glIndexdv(c: NativePtr): Unit

fun glIndexfv(c: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _c = c?.getPointer(memScope).rawValue
        val res = kni_glIndexfv(_c)
        res
    }
}

@SymbolName("kni_opengl_glIndexfv")
private external fun kni_glIndexfv(c: NativePtr): Unit

fun glIndexiv(c: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _c = c?.getPointer(memScope).rawValue
        val res = kni_glIndexiv(_c)
        res
    }
}

@SymbolName("kni_opengl_glIndexiv")
private external fun kni_glIndexiv(c: NativePtr): Unit

fun glIndexsv(c: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _c = c?.getPointer(memScope).rawValue
        val res = kni_glIndexsv(_c)
        res
    }
}

@SymbolName("kni_opengl_glIndexsv")
private external fun kni_glIndexsv(c: NativePtr): Unit

fun glIndexubv(c: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _c = c?.getPointer(memScope).rawValue
        val res = kni_glIndexubv(_c)
        res
    }
}

@SymbolName("kni_opengl_glIndexubv")
private external fun kni_glIndexubv(c: NativePtr): Unit

@SymbolName("kni_opengl_glColor3b")
external fun glColor3b(red: GLbyte, green: GLbyte, blue: GLbyte): Unit

@SymbolName("kni_opengl_glColor3d")
external fun glColor3d(red: GLdouble, green: GLdouble, blue: GLdouble): Unit

@SymbolName("kni_opengl_glColor3f")
external fun glColor3f(red: GLfloat, green: GLfloat, blue: GLfloat): Unit

@SymbolName("kni_opengl_glColor3i")
external fun glColor3i(red: GLint, green: GLint, blue: GLint): Unit

@SymbolName("kni_opengl_glColor3s")
external fun glColor3s(red: GLshort, green: GLshort, blue: GLshort): Unit

@SymbolName("kni_opengl_glColor3ub")
external fun glColor3ub(red: GLubyte, green: GLubyte, blue: GLubyte): Unit

@SymbolName("kni_opengl_glColor3ui")
external fun glColor3ui(red: GLuint, green: GLuint, blue: GLuint): Unit

@SymbolName("kni_opengl_glColor3us")
external fun glColor3us(red: GLushort, green: GLushort, blue: GLushort): Unit

@SymbolName("kni_opengl_glColor4b")
external fun glColor4b(red: GLbyte, green: GLbyte, blue: GLbyte, alpha: GLbyte): Unit

@SymbolName("kni_opengl_glColor4d")
external fun glColor4d(red: GLdouble, green: GLdouble, blue: GLdouble, alpha: GLdouble): Unit

@SymbolName("kni_opengl_glColor4f")
external fun glColor4f(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit

@SymbolName("kni_opengl_glColor4i")
external fun glColor4i(red: GLint, green: GLint, blue: GLint, alpha: GLint): Unit

@SymbolName("kni_opengl_glColor4s")
external fun glColor4s(red: GLshort, green: GLshort, blue: GLshort, alpha: GLshort): Unit

@SymbolName("kni_opengl_glColor4ub")
external fun glColor4ub(red: GLubyte, green: GLubyte, blue: GLubyte, alpha: GLubyte): Unit

@SymbolName("kni_opengl_glColor4ui")
external fun glColor4ui(red: GLuint, green: GLuint, blue: GLuint, alpha: GLuint): Unit

@SymbolName("kni_opengl_glColor4us")
external fun glColor4us(red: GLushort, green: GLushort, blue: GLushort, alpha: GLushort): Unit

fun glColor3bv(v: CValuesRef<GLbyteVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3bv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3bv")
private external fun kni_glColor3bv(v: NativePtr): Unit

fun glColor3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3dv")
private external fun kni_glColor3dv(v: NativePtr): Unit

fun glColor3fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3fv")
private external fun kni_glColor3fv(v: NativePtr): Unit

fun glColor3iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3iv")
private external fun kni_glColor3iv(v: NativePtr): Unit

fun glColor3sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3sv")
private external fun kni_glColor3sv(v: NativePtr): Unit

fun glColor3ubv(v: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3ubv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3ubv")
private external fun kni_glColor3ubv(v: NativePtr): Unit

fun glColor3uiv(v: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3uiv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3uiv")
private external fun kni_glColor3uiv(v: NativePtr): Unit

fun glColor3usv(v: CValuesRef<GLushortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor3usv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor3usv")
private external fun kni_glColor3usv(v: NativePtr): Unit

fun glColor4bv(v: CValuesRef<GLbyteVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4bv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4bv")
private external fun kni_glColor4bv(v: NativePtr): Unit

fun glColor4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4dv")
private external fun kni_glColor4dv(v: NativePtr): Unit

fun glColor4fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4fv")
private external fun kni_glColor4fv(v: NativePtr): Unit

fun glColor4iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4iv")
private external fun kni_glColor4iv(v: NativePtr): Unit

fun glColor4sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4sv")
private external fun kni_glColor4sv(v: NativePtr): Unit

fun glColor4ubv(v: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4ubv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4ubv")
private external fun kni_glColor4ubv(v: NativePtr): Unit

fun glColor4uiv(v: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4uiv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4uiv")
private external fun kni_glColor4uiv(v: NativePtr): Unit

fun glColor4usv(v: CValuesRef<GLushortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glColor4usv(_v)
        res
    }
}

@SymbolName("kni_opengl_glColor4usv")
private external fun kni_glColor4usv(v: NativePtr): Unit

@SymbolName("kni_opengl_glTexCoord1d")
external fun glTexCoord1d(s: GLdouble): Unit

@SymbolName("kni_opengl_glTexCoord1f")
external fun glTexCoord1f(s: GLfloat): Unit

@SymbolName("kni_opengl_glTexCoord1i")
external fun glTexCoord1i(s: GLint): Unit

@SymbolName("kni_opengl_glTexCoord1s")
external fun glTexCoord1s(s: GLshort): Unit

@SymbolName("kni_opengl_glTexCoord2d")
external fun glTexCoord2d(s: GLdouble, t: GLdouble): Unit

@SymbolName("kni_opengl_glTexCoord2f")
external fun glTexCoord2f(s: GLfloat, t: GLfloat): Unit

@SymbolName("kni_opengl_glTexCoord2i")
external fun glTexCoord2i(s: GLint, t: GLint): Unit

@SymbolName("kni_opengl_glTexCoord2s")
external fun glTexCoord2s(s: GLshort, t: GLshort): Unit

@SymbolName("kni_opengl_glTexCoord3d")
external fun glTexCoord3d(s: GLdouble, t: GLdouble, r: GLdouble): Unit

@SymbolName("kni_opengl_glTexCoord3f")
external fun glTexCoord3f(s: GLfloat, t: GLfloat, r: GLfloat): Unit

@SymbolName("kni_opengl_glTexCoord3i")
external fun glTexCoord3i(s: GLint, t: GLint, r: GLint): Unit

@SymbolName("kni_opengl_glTexCoord3s")
external fun glTexCoord3s(s: GLshort, t: GLshort, r: GLshort): Unit

@SymbolName("kni_opengl_glTexCoord4d")
external fun glTexCoord4d(s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit

@SymbolName("kni_opengl_glTexCoord4f")
external fun glTexCoord4f(s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit

@SymbolName("kni_opengl_glTexCoord4i")
external fun glTexCoord4i(s: GLint, t: GLint, r: GLint, q: GLint): Unit

@SymbolName("kni_opengl_glTexCoord4s")
external fun glTexCoord4s(s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit

fun glTexCoord1dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord1dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord1dv")
private external fun kni_glTexCoord1dv(v: NativePtr): Unit

fun glTexCoord1fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord1fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord1fv")
private external fun kni_glTexCoord1fv(v: NativePtr): Unit

fun glTexCoord1iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord1iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord1iv")
private external fun kni_glTexCoord1iv(v: NativePtr): Unit

fun glTexCoord1sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord1sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord1sv")
private external fun kni_glTexCoord1sv(v: NativePtr): Unit

fun glTexCoord2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord2dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord2dv")
private external fun kni_glTexCoord2dv(v: NativePtr): Unit

fun glTexCoord2fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord2fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord2fv")
private external fun kni_glTexCoord2fv(v: NativePtr): Unit

fun glTexCoord2iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord2iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord2iv")
private external fun kni_glTexCoord2iv(v: NativePtr): Unit

fun glTexCoord2sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord2sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord2sv")
private external fun kni_glTexCoord2sv(v: NativePtr): Unit

fun glTexCoord3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord3dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord3dv")
private external fun kni_glTexCoord3dv(v: NativePtr): Unit

fun glTexCoord3fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord3fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord3fv")
private external fun kni_glTexCoord3fv(v: NativePtr): Unit

fun glTexCoord3iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord3iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord3iv")
private external fun kni_glTexCoord3iv(v: NativePtr): Unit

fun glTexCoord3sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord3sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord3sv")
private external fun kni_glTexCoord3sv(v: NativePtr): Unit

fun glTexCoord4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord4dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord4dv")
private external fun kni_glTexCoord4dv(v: NativePtr): Unit

fun glTexCoord4fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord4fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord4fv")
private external fun kni_glTexCoord4fv(v: NativePtr): Unit

fun glTexCoord4iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord4iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord4iv")
private external fun kni_glTexCoord4iv(v: NativePtr): Unit

fun glTexCoord4sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glTexCoord4sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glTexCoord4sv")
private external fun kni_glTexCoord4sv(v: NativePtr): Unit

@SymbolName("kni_opengl_glRasterPos2d")
external fun glRasterPos2d(x: GLdouble, y: GLdouble): Unit

@SymbolName("kni_opengl_glRasterPos2f")
external fun glRasterPos2f(x: GLfloat, y: GLfloat): Unit

@SymbolName("kni_opengl_glRasterPos2i")
external fun glRasterPos2i(x: GLint, y: GLint): Unit

@SymbolName("kni_opengl_glRasterPos2s")
external fun glRasterPos2s(x: GLshort, y: GLshort): Unit

@SymbolName("kni_opengl_glRasterPos3d")
external fun glRasterPos3d(x: GLdouble, y: GLdouble, z: GLdouble): Unit

@SymbolName("kni_opengl_glRasterPos3f")
external fun glRasterPos3f(x: GLfloat, y: GLfloat, z: GLfloat): Unit

@SymbolName("kni_opengl_glRasterPos3i")
external fun glRasterPos3i(x: GLint, y: GLint, z: GLint): Unit

@SymbolName("kni_opengl_glRasterPos3s")
external fun glRasterPos3s(x: GLshort, y: GLshort, z: GLshort): Unit

@SymbolName("kni_opengl_glRasterPos4d")
external fun glRasterPos4d(x: GLdouble, y: GLdouble, z: GLdouble, w: GLdouble): Unit

@SymbolName("kni_opengl_glRasterPos4f")
external fun glRasterPos4f(x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit

@SymbolName("kni_opengl_glRasterPos4i")
external fun glRasterPos4i(x: GLint, y: GLint, z: GLint, w: GLint): Unit

@SymbolName("kni_opengl_glRasterPos4s")
external fun glRasterPos4s(x: GLshort, y: GLshort, z: GLshort, w: GLshort): Unit

fun glRasterPos2dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos2dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos2dv")
private external fun kni_glRasterPos2dv(v: NativePtr): Unit

fun glRasterPos2fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos2fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos2fv")
private external fun kni_glRasterPos2fv(v: NativePtr): Unit

fun glRasterPos2iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos2iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos2iv")
private external fun kni_glRasterPos2iv(v: NativePtr): Unit

fun glRasterPos2sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos2sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos2sv")
private external fun kni_glRasterPos2sv(v: NativePtr): Unit

fun glRasterPos3dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos3dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos3dv")
private external fun kni_glRasterPos3dv(v: NativePtr): Unit

fun glRasterPos3fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos3fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos3fv")
private external fun kni_glRasterPos3fv(v: NativePtr): Unit

fun glRasterPos3iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos3iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos3iv")
private external fun kni_glRasterPos3iv(v: NativePtr): Unit

fun glRasterPos3sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos3sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos3sv")
private external fun kni_glRasterPos3sv(v: NativePtr): Unit

fun glRasterPos4dv(v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos4dv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos4dv")
private external fun kni_glRasterPos4dv(v: NativePtr): Unit

fun glRasterPos4fv(v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos4fv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos4fv")
private external fun kni_glRasterPos4fv(v: NativePtr): Unit

fun glRasterPos4iv(v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos4iv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos4iv")
private external fun kni_glRasterPos4iv(v: NativePtr): Unit

fun glRasterPos4sv(v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glRasterPos4sv(_v)
        res
    }
}

@SymbolName("kni_opengl_glRasterPos4sv")
private external fun kni_glRasterPos4sv(v: NativePtr): Unit

@SymbolName("kni_opengl_glRectd")
external fun glRectd(x1: GLdouble, y1: GLdouble, x2: GLdouble, y2: GLdouble): Unit

@SymbolName("kni_opengl_glRectf")
external fun glRectf(x1: GLfloat, y1: GLfloat, x2: GLfloat, y2: GLfloat): Unit

@SymbolName("kni_opengl_glRecti")
external fun glRecti(x1: GLint, y1: GLint, x2: GLint, y2: GLint): Unit

@SymbolName("kni_opengl_glRects")
external fun glRects(x1: GLshort, y1: GLshort, x2: GLshort, y2: GLshort): Unit

fun glRectdv(v1: CValuesRef<GLdoubleVar>?, v2: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _v1 = v1?.getPointer(memScope).rawValue
        val _v2 = v2?.getPointer(memScope).rawValue
        val res = kni_glRectdv(_v1, _v2)
        res
    }
}

@SymbolName("kni_opengl_glRectdv")
private external fun kni_glRectdv(v1: NativePtr, v2: NativePtr): Unit

fun glRectfv(v1: CValuesRef<GLfloatVar>?, v2: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _v1 = v1?.getPointer(memScope).rawValue
        val _v2 = v2?.getPointer(memScope).rawValue
        val res = kni_glRectfv(_v1, _v2)
        res
    }
}

@SymbolName("kni_opengl_glRectfv")
private external fun kni_glRectfv(v1: NativePtr, v2: NativePtr): Unit

fun glRectiv(v1: CValuesRef<GLintVar>?, v2: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _v1 = v1?.getPointer(memScope).rawValue
        val _v2 = v2?.getPointer(memScope).rawValue
        val res = kni_glRectiv(_v1, _v2)
        res
    }
}

@SymbolName("kni_opengl_glRectiv")
private external fun kni_glRectiv(v1: NativePtr, v2: NativePtr): Unit

fun glRectsv(v1: CValuesRef<GLshortVar>?, v2: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _v1 = v1?.getPointer(memScope).rawValue
        val _v2 = v2?.getPointer(memScope).rawValue
        val res = kni_glRectsv(_v1, _v2)
        res
    }
}

@SymbolName("kni_opengl_glRectsv")
private external fun kni_glRectsv(v1: NativePtr, v2: NativePtr): Unit

@SymbolName("kni_opengl_glVertexPointer")
external fun glVertexPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: COpaquePointer?): Unit

@SymbolName("kni_opengl_glNormalPointer")
external fun glNormalPointer(type: GLenum, stride: GLsizei, ptr: COpaquePointer?): Unit

@SymbolName("kni_opengl_glColorPointer")
external fun glColorPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: COpaquePointer?): Unit

@SymbolName("kni_opengl_glIndexPointer")
external fun glIndexPointer(type: GLenum, stride: GLsizei, ptr: COpaquePointer?): Unit

@SymbolName("kni_opengl_glTexCoordPointer")
external fun glTexCoordPointer(size: GLint, type: GLenum, stride: GLsizei, ptr: COpaquePointer?): Unit

@SymbolName("kni_opengl_glEdgeFlagPointer")
external fun glEdgeFlagPointer(stride: GLsizei, ptr: COpaquePointer?): Unit

fun glGetPointerv(pname: GLenum, params: CValuesRef<COpaquePointerVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetPointerv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetPointerv")
private external fun kni_glGetPointerv(pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glArrayElement")
external fun glArrayElement(i: GLint): Unit

@SymbolName("kni_opengl_glDrawArrays")
external fun glDrawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit

@SymbolName("kni_opengl_glDrawElements")
external fun glDrawElements(mode: GLenum, count: GLsizei, type: GLenum, indices: COpaquePointer?): Unit

@SymbolName("kni_opengl_glInterleavedArrays")
external fun glInterleavedArrays(format: GLenum, stride: GLsizei, pointer: COpaquePointer?): Unit

@SymbolName("kni_opengl_glShadeModel")
external fun glShadeModel(mode: GLenum): Unit

@SymbolName("kni_opengl_glLightf")
external fun glLightf(light: GLenum, pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glLighti")
external fun glLighti(light: GLenum, pname: GLenum, param: GLint): Unit

fun glLightfv(light: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _light = light
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glLightfv(_light, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glLightfv")
private external fun kni_glLightfv(light: Int, pname: Int, params: NativePtr): Unit

fun glLightiv(light: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _light = light
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glLightiv(_light, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glLightiv")
private external fun kni_glLightiv(light: Int, pname: Int, params: NativePtr): Unit

fun glGetLightfv(light: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _light = light
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetLightfv(_light, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetLightfv")
private external fun kni_glGetLightfv(light: Int, pname: Int, params: NativePtr): Unit

fun glGetLightiv(light: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _light = light
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetLightiv(_light, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetLightiv")
private external fun kni_glGetLightiv(light: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glLightModelf")
external fun glLightModelf(pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glLightModeli")
external fun glLightModeli(pname: GLenum, param: GLint): Unit

fun glLightModelfv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glLightModelfv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glLightModelfv")
private external fun kni_glLightModelfv(pname: Int, params: NativePtr): Unit

fun glLightModeliv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glLightModeliv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glLightModeliv")
private external fun kni_glLightModeliv(pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glMaterialf")
external fun glMaterialf(face: GLenum, pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glMateriali")
external fun glMateriali(face: GLenum, pname: GLenum, param: GLint): Unit

fun glMaterialfv(face: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _face = face
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glMaterialfv(_face, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glMaterialfv")
private external fun kni_glMaterialfv(face: Int, pname: Int, params: NativePtr): Unit

fun glMaterialiv(face: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _face = face
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glMaterialiv(_face, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glMaterialiv")
private external fun kni_glMaterialiv(face: Int, pname: Int, params: NativePtr): Unit

fun glGetMaterialfv(face: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _face = face
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetMaterialfv(_face, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetMaterialfv")
private external fun kni_glGetMaterialfv(face: Int, pname: Int, params: NativePtr): Unit

fun glGetMaterialiv(face: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _face = face
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetMaterialiv(_face, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetMaterialiv")
private external fun kni_glGetMaterialiv(face: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glColorMaterial")
external fun glColorMaterial(face: GLenum, mode: GLenum): Unit

@SymbolName("kni_opengl_glPixelZoom")
external fun glPixelZoom(xfactor: GLfloat, yfactor: GLfloat): Unit

@SymbolName("kni_opengl_glPixelStoref")
external fun glPixelStoref(pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glPixelStorei")
external fun glPixelStorei(pname: GLenum, param: GLint): Unit

@SymbolName("kni_opengl_glPixelTransferf")
external fun glPixelTransferf(pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glPixelTransferi")
external fun glPixelTransferi(pname: GLenum, param: GLint): Unit

fun glPixelMapfv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _map = map
        val _mapsize = mapsize
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glPixelMapfv(_map, _mapsize, _values)
        res
    }
}

@SymbolName("kni_opengl_glPixelMapfv")
private external fun kni_glPixelMapfv(map: Int, mapsize: Int, values: NativePtr): Unit

fun glPixelMapuiv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _map = map
        val _mapsize = mapsize
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glPixelMapuiv(_map, _mapsize, _values)
        res
    }
}

@SymbolName("kni_opengl_glPixelMapuiv")
private external fun kni_glPixelMapuiv(map: Int, mapsize: Int, values: NativePtr): Unit

fun glPixelMapusv(map: GLenum, mapsize: GLsizei, values: CValuesRef<GLushortVar>?): Unit {
    return memScoped {
        val _map = map
        val _mapsize = mapsize
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glPixelMapusv(_map, _mapsize, _values)
        res
    }
}

@SymbolName("kni_opengl_glPixelMapusv")
private external fun kni_glPixelMapusv(map: Int, mapsize: Int, values: NativePtr): Unit

fun glGetPixelMapfv(map: GLenum, values: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _map = map
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glGetPixelMapfv(_map, _values)
        res
    }
}

@SymbolName("kni_opengl_glGetPixelMapfv")
private external fun kni_glGetPixelMapfv(map: Int, values: NativePtr): Unit

fun glGetPixelMapuiv(map: GLenum, values: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _map = map
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glGetPixelMapuiv(_map, _values)
        res
    }
}

@SymbolName("kni_opengl_glGetPixelMapuiv")
private external fun kni_glGetPixelMapuiv(map: Int, values: NativePtr): Unit

fun glGetPixelMapusv(map: GLenum, values: CValuesRef<GLushortVar>?): Unit {
    return memScoped {
        val _map = map
        val _values = values?.getPointer(memScope).rawValue
        val res = kni_glGetPixelMapusv(_map, _values)
        res
    }
}

@SymbolName("kni_opengl_glGetPixelMapusv")
private external fun kni_glGetPixelMapusv(map: Int, values: NativePtr): Unit

fun glBitmap(width: GLsizei, height: GLsizei, xorig: GLfloat, yorig: GLfloat, xmove: GLfloat, ymove: GLfloat, bitmap: CValuesRef<GLubyteVar>?): Unit {
    return memScoped {
        val _width = width
        val _height = height
        val _xorig = xorig
        val _yorig = yorig
        val _xmove = xmove
        val _ymove = ymove
        val _bitmap = bitmap?.getPointer(memScope).rawValue
        val res = kni_glBitmap(_width, _height, _xorig, _yorig, _xmove, _ymove, _bitmap)
        res
    }
}

@SymbolName("kni_opengl_glBitmap")
private external fun kni_glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: NativePtr): Unit

@SymbolName("kni_opengl_glReadPixels")
external fun glReadPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glDrawPixels")
external fun glDrawPixels(width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCopyPixels")
external fun glCopyPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, type: GLenum): Unit

@SymbolName("kni_opengl_glStencilFunc")
external fun glStencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit

@SymbolName("kni_opengl_glStencilMask")
external fun glStencilMask(mask: GLuint): Unit

@SymbolName("kni_opengl_glStencilOp")
external fun glStencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit

@SymbolName("kni_opengl_glClearStencil")
external fun glClearStencil(s: GLint): Unit

@SymbolName("kni_opengl_glTexGend")
external fun glTexGend(coord: GLenum, pname: GLenum, param: GLdouble): Unit

@SymbolName("kni_opengl_glTexGenf")
external fun glTexGenf(coord: GLenum, pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glTexGeni")
external fun glTexGeni(coord: GLenum, pname: GLenum, param: GLint): Unit

fun glTexGendv(coord: GLenum, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexGendv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexGendv")
private external fun kni_glTexGendv(coord: Int, pname: Int, params: NativePtr): Unit

fun glTexGenfv(coord: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexGenfv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexGenfv")
private external fun kni_glTexGenfv(coord: Int, pname: Int, params: NativePtr): Unit

fun glTexGeniv(coord: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexGeniv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexGeniv")
private external fun kni_glTexGeniv(coord: Int, pname: Int, params: NativePtr): Unit

fun glGetTexGendv(coord: GLenum, pname: GLenum, params: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexGendv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexGendv")
private external fun kni_glGetTexGendv(coord: Int, pname: Int, params: NativePtr): Unit

fun glGetTexGenfv(coord: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexGenfv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexGenfv")
private external fun kni_glGetTexGenfv(coord: Int, pname: Int, params: NativePtr): Unit

fun glGetTexGeniv(coord: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _coord = coord
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexGeniv(_coord, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexGeniv")
private external fun kni_glGetTexGeniv(coord: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glTexEnvf")
external fun glTexEnvf(target: GLenum, pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glTexEnvi")
external fun glTexEnvi(target: GLenum, pname: GLenum, param: GLint): Unit

fun glTexEnvfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexEnvfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexEnvfv")
private external fun kni_glTexEnvfv(target: Int, pname: Int, params: NativePtr): Unit

fun glTexEnviv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexEnviv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexEnviv")
private external fun kni_glTexEnviv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexEnvfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexEnvfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexEnvfv")
private external fun kni_glGetTexEnvfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexEnviv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexEnviv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexEnviv")
private external fun kni_glGetTexEnviv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glTexParameterf")
external fun glTexParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glTexParameteri")
external fun glTexParameteri(target: GLenum, pname: GLenum, param: GLint): Unit

fun glTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexParameterfv")
private external fun kni_glTexParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glTexParameteriv")
private external fun kni_glTexParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexParameterfv")
private external fun kni_glGetTexParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexParameteriv")
private external fun kni_glGetTexParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexLevelParameterfv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _level = level
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexLevelParameterfv(_target, _level, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexLevelParameterfv")
private external fun kni_glGetTexLevelParameterfv(target: Int, level: Int, pname: Int, params: NativePtr): Unit

fun glGetTexLevelParameteriv(target: GLenum, level: GLint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _level = level
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexLevelParameteriv(_target, _level, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetTexLevelParameteriv")
private external fun kni_glGetTexLevelParameteriv(target: Int, level: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glTexImage1D")
external fun glTexImage1D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glTexImage2D")
external fun glTexImage2D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glGetTexImage")
external fun glGetTexImage(target: GLenum, level: GLint, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

fun glGenTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val res = kni_glGenTextures(_n, _textures)
        res
    }
}

@SymbolName("kni_opengl_glGenTextures")
private external fun kni_glGenTextures(n: Int, textures: NativePtr): Unit

fun glDeleteTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val res = kni_glDeleteTextures(_n, _textures)
        res
    }
}

@SymbolName("kni_opengl_glDeleteTextures")
private external fun kni_glDeleteTextures(n: Int, textures: NativePtr): Unit

@SymbolName("kni_opengl_glBindTexture")
external fun glBindTexture(target: GLenum, texture: GLuint): Unit

fun glPrioritizeTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?, priorities: CValuesRef<GLclampfVar>?): Unit {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val _priorities = priorities?.getPointer(memScope).rawValue
        val res = kni_glPrioritizeTextures(_n, _textures, _priorities)
        res
    }
}

@SymbolName("kni_opengl_glPrioritizeTextures")
private external fun kni_glPrioritizeTextures(n: Int, textures: NativePtr, priorities: NativePtr): Unit

fun glAreTexturesResident(n: GLsizei, textures: CValuesRef<GLuintVar>?, residences: CValuesRef<GLbooleanVar>?): GLboolean {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val _residences = residences?.getPointer(memScope).rawValue
        val res = kni_glAreTexturesResident(_n, _textures, _residences)
        res
    }
}

@SymbolName("kni_opengl_glAreTexturesResident")
private external fun kni_glAreTexturesResident(n: Int, textures: NativePtr, residences: NativePtr): Byte

@SymbolName("kni_opengl_glIsTexture")
external fun glIsTexture(texture: GLuint): GLboolean

@SymbolName("kni_opengl_glTexSubImage1D")
external fun glTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glTexSubImage2D")
external fun glTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCopyTexImage1D")
external fun glCopyTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, border: GLint): Unit

@SymbolName("kni_opengl_glCopyTexImage2D")
external fun glCopyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei, border: GLint): Unit

@SymbolName("kni_opengl_glCopyTexSubImage1D")
external fun glCopyTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, x: GLint, y: GLint, width: GLsizei): Unit

@SymbolName("kni_opengl_glCopyTexSubImage2D")
external fun glCopyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit

fun glMap1d(target: GLenum, u1: GLdouble, u2: GLdouble, stride: GLint, order: GLint, points: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _u1 = u1
        val _u2 = u2
        val _stride = stride
        val _order = order
        val _points = points?.getPointer(memScope).rawValue
        val res = kni_glMap1d(_target, _u1, _u2, _stride, _order, _points)
        res
    }
}

@SymbolName("kni_opengl_glMap1d")
private external fun kni_glMap1d(target: Int, u1: Double, u2: Double, stride: Int, order: Int, points: NativePtr): Unit

fun glMap1f(target: GLenum, u1: GLfloat, u2: GLfloat, stride: GLint, order: GLint, points: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _u1 = u1
        val _u2 = u2
        val _stride = stride
        val _order = order
        val _points = points?.getPointer(memScope).rawValue
        val res = kni_glMap1f(_target, _u1, _u2, _stride, _order, _points)
        res
    }
}

@SymbolName("kni_opengl_glMap1f")
private external fun kni_glMap1f(target: Int, u1: Float, u2: Float, stride: Int, order: Int, points: NativePtr): Unit

fun glMap2d(target: GLenum, u1: GLdouble, u2: GLdouble, ustride: GLint, uorder: GLint, v1: GLdouble, v2: GLdouble, vstride: GLint, vorder: GLint, points: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _u1 = u1
        val _u2 = u2
        val _ustride = ustride
        val _uorder = uorder
        val _v1 = v1
        val _v2 = v2
        val _vstride = vstride
        val _vorder = vorder
        val _points = points?.getPointer(memScope).rawValue
        val res = kni_glMap2d(_target, _u1, _u2, _ustride, _uorder, _v1, _v2, _vstride, _vorder, _points)
        res
    }
}

@SymbolName("kni_opengl_glMap2d")
private external fun kni_glMap2d(target: Int, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: NativePtr): Unit

fun glMap2f(target: GLenum, u1: GLfloat, u2: GLfloat, ustride: GLint, uorder: GLint, v1: GLfloat, v2: GLfloat, vstride: GLint, vorder: GLint, points: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _u1 = u1
        val _u2 = u2
        val _ustride = ustride
        val _uorder = uorder
        val _v1 = v1
        val _v2 = v2
        val _vstride = vstride
        val _vorder = vorder
        val _points = points?.getPointer(memScope).rawValue
        val res = kni_glMap2f(_target, _u1, _u2, _ustride, _uorder, _v1, _v2, _vstride, _vorder, _points)
        res
    }
}

@SymbolName("kni_opengl_glMap2f")
private external fun kni_glMap2f(target: Int, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: NativePtr): Unit

fun glGetMapdv(target: GLenum, query: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _query = query
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glGetMapdv(_target, _query, _v)
        res
    }
}

@SymbolName("kni_opengl_glGetMapdv")
private external fun kni_glGetMapdv(target: Int, query: Int, v: NativePtr): Unit

fun glGetMapfv(target: GLenum, query: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _query = query
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glGetMapfv(_target, _query, _v)
        res
    }
}

@SymbolName("kni_opengl_glGetMapfv")
private external fun kni_glGetMapfv(target: Int, query: Int, v: NativePtr): Unit

fun glGetMapiv(target: GLenum, query: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _query = query
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glGetMapiv(_target, _query, _v)
        res
    }
}

@SymbolName("kni_opengl_glGetMapiv")
private external fun kni_glGetMapiv(target: Int, query: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glEvalCoord1d")
external fun glEvalCoord1d(u: GLdouble): Unit

@SymbolName("kni_opengl_glEvalCoord1f")
external fun glEvalCoord1f(u: GLfloat): Unit

fun glEvalCoord1dv(u: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _u = u?.getPointer(memScope).rawValue
        val res = kni_glEvalCoord1dv(_u)
        res
    }
}

@SymbolName("kni_opengl_glEvalCoord1dv")
private external fun kni_glEvalCoord1dv(u: NativePtr): Unit

fun glEvalCoord1fv(u: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _u = u?.getPointer(memScope).rawValue
        val res = kni_glEvalCoord1fv(_u)
        res
    }
}

@SymbolName("kni_opengl_glEvalCoord1fv")
private external fun kni_glEvalCoord1fv(u: NativePtr): Unit

@SymbolName("kni_opengl_glEvalCoord2d")
external fun glEvalCoord2d(u: GLdouble, v: GLdouble): Unit

@SymbolName("kni_opengl_glEvalCoord2f")
external fun glEvalCoord2f(u: GLfloat, v: GLfloat): Unit

fun glEvalCoord2dv(u: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _u = u?.getPointer(memScope).rawValue
        val res = kni_glEvalCoord2dv(_u)
        res
    }
}

@SymbolName("kni_opengl_glEvalCoord2dv")
private external fun kni_glEvalCoord2dv(u: NativePtr): Unit

fun glEvalCoord2fv(u: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _u = u?.getPointer(memScope).rawValue
        val res = kni_glEvalCoord2fv(_u)
        res
    }
}

@SymbolName("kni_opengl_glEvalCoord2fv")
private external fun kni_glEvalCoord2fv(u: NativePtr): Unit

@SymbolName("kni_opengl_glMapGrid1d")
external fun glMapGrid1d(un: GLint, u1: GLdouble, u2: GLdouble): Unit

@SymbolName("kni_opengl_glMapGrid1f")
external fun glMapGrid1f(un: GLint, u1: GLfloat, u2: GLfloat): Unit

@SymbolName("kni_opengl_glMapGrid2d")
external fun glMapGrid2d(un: GLint, u1: GLdouble, u2: GLdouble, vn: GLint, v1: GLdouble, v2: GLdouble): Unit

@SymbolName("kni_opengl_glMapGrid2f")
external fun glMapGrid2f(un: GLint, u1: GLfloat, u2: GLfloat, vn: GLint, v1: GLfloat, v2: GLfloat): Unit

@SymbolName("kni_opengl_glEvalPoint1")
external fun glEvalPoint1(i: GLint): Unit

@SymbolName("kni_opengl_glEvalPoint2")
external fun glEvalPoint2(i: GLint, j: GLint): Unit

@SymbolName("kni_opengl_glEvalMesh1")
external fun glEvalMesh1(mode: GLenum, i1: GLint, i2: GLint): Unit

@SymbolName("kni_opengl_glEvalMesh2")
external fun glEvalMesh2(mode: GLenum, i1: GLint, i2: GLint, j1: GLint, j2: GLint): Unit

@SymbolName("kni_opengl_glFogf")
external fun glFogf(pname: GLenum, param: GLfloat): Unit

@SymbolName("kni_opengl_glFogi")
external fun glFogi(pname: GLenum, param: GLint): Unit

fun glFogfv(pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glFogfv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glFogfv")
private external fun kni_glFogfv(pname: Int, params: NativePtr): Unit

fun glFogiv(pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glFogiv(_pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glFogiv")
private external fun kni_glFogiv(pname: Int, params: NativePtr): Unit

fun glFeedbackBuffer(size: GLsizei, type: GLenum, buffer: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _size = size
        val _type = type
        val _buffer = buffer?.getPointer(memScope).rawValue
        val res = kni_glFeedbackBuffer(_size, _type, _buffer)
        res
    }
}

@SymbolName("kni_opengl_glFeedbackBuffer")
private external fun kni_glFeedbackBuffer(size: Int, type: Int, buffer: NativePtr): Unit

@SymbolName("kni_opengl_glPassThrough")
external fun glPassThrough(token: GLfloat): Unit

fun glSelectBuffer(size: GLsizei, buffer: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _size = size
        val _buffer = buffer?.getPointer(memScope).rawValue
        val res = kni_glSelectBuffer(_size, _buffer)
        res
    }
}

@SymbolName("kni_opengl_glSelectBuffer")
private external fun kni_glSelectBuffer(size: Int, buffer: NativePtr): Unit

@SymbolName("kni_opengl_glInitNames")
external fun glInitNames(): Unit

@SymbolName("kni_opengl_glLoadName")
external fun glLoadName(name: GLuint): Unit

@SymbolName("kni_opengl_glPushName")
external fun glPushName(name: GLuint): Unit

@SymbolName("kni_opengl_glPopName")
external fun glPopName(): Unit

@SymbolName("kni_opengl_glDrawRangeElements")
external fun glDrawRangeElements(mode: GLenum, start: GLuint, end: GLuint, count: GLsizei, type: GLenum, indices: COpaquePointer?): Unit

@SymbolName("kni_opengl_glTexImage3D")
external fun glTexImage3D(target: GLenum, level: GLint, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glTexSubImage3D")
external fun glTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCopyTexSubImage3D")
external fun glCopyTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit

@SymbolName("kni_opengl_glColorTable")
external fun glColorTable(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum, type: GLenum, table: COpaquePointer?): Unit

@SymbolName("kni_opengl_glColorSubTable")
external fun glColorSubTable(target: GLenum, start: GLsizei, count: GLsizei, format: GLenum, type: GLenum, data: COpaquePointer?): Unit

fun glColorTableParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glColorTableParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glColorTableParameteriv")
private external fun kni_glColorTableParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glColorTableParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glColorTableParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glColorTableParameterfv")
private external fun kni_glColorTableParameterfv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glCopyColorSubTable")
external fun glCopyColorSubTable(target: GLenum, start: GLsizei, x: GLint, y: GLint, width: GLsizei): Unit

@SymbolName("kni_opengl_glCopyColorTable")
external fun glCopyColorTable(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit

@SymbolName("kni_opengl_glGetColorTable")
external fun glGetColorTable(target: GLenum, format: GLenum, type: GLenum, table: COpaquePointer?): Unit

fun glGetColorTableParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetColorTableParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetColorTableParameterfv")
private external fun kni_glGetColorTableParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetColorTableParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetColorTableParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetColorTableParameteriv")
private external fun kni_glGetColorTableParameteriv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glBlendEquation")
external fun glBlendEquation(mode: GLenum): Unit

@SymbolName("kni_opengl_glBlendColor")
external fun glBlendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit

@SymbolName("kni_opengl_glHistogram")
external fun glHistogram(target: GLenum, width: GLsizei, internalformat: GLenum, sink: GLboolean): Unit

@SymbolName("kni_opengl_glResetHistogram")
external fun glResetHistogram(target: GLenum): Unit

@SymbolName("kni_opengl_glGetHistogram")
external fun glGetHistogram(target: GLenum, reset: GLboolean, format: GLenum, type: GLenum, values: COpaquePointer?): Unit

fun glGetHistogramParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetHistogramParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetHistogramParameterfv")
private external fun kni_glGetHistogramParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetHistogramParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetHistogramParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetHistogramParameteriv")
private external fun kni_glGetHistogramParameteriv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glMinmax")
external fun glMinmax(target: GLenum, internalformat: GLenum, sink: GLboolean): Unit

@SymbolName("kni_opengl_glResetMinmax")
external fun glResetMinmax(target: GLenum): Unit

@SymbolName("kni_opengl_glGetMinmax")
external fun glGetMinmax(target: GLenum, reset: GLboolean, format: GLenum, types: GLenum, values: COpaquePointer?): Unit

fun glGetMinmaxParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetMinmaxParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetMinmaxParameterfv")
private external fun kni_glGetMinmaxParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetMinmaxParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetMinmaxParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetMinmaxParameteriv")
private external fun kni_glGetMinmaxParameteriv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glConvolutionFilter1D")
external fun glConvolutionFilter1D(target: GLenum, internalformat: GLenum, width: GLsizei, format: GLenum, type: GLenum, image: COpaquePointer?): Unit

@SymbolName("kni_opengl_glConvolutionFilter2D")
external fun glConvolutionFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, image: COpaquePointer?): Unit

@SymbolName("kni_opengl_glConvolutionParameterf")
external fun glConvolutionParameterf(target: GLenum, pname: GLenum, params: GLfloat): Unit

fun glConvolutionParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glConvolutionParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glConvolutionParameterfv")
private external fun kni_glConvolutionParameterfv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glConvolutionParameteri")
external fun glConvolutionParameteri(target: GLenum, pname: GLenum, params: GLint): Unit

fun glConvolutionParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glConvolutionParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glConvolutionParameteriv")
private external fun kni_glConvolutionParameteriv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glCopyConvolutionFilter1D")
external fun glCopyConvolutionFilter1D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei): Unit

@SymbolName("kni_opengl_glCopyConvolutionFilter2D")
external fun glCopyConvolutionFilter2D(target: GLenum, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit

@SymbolName("kni_opengl_glGetConvolutionFilter")
external fun glGetConvolutionFilter(target: GLenum, format: GLenum, type: GLenum, image: COpaquePointer?): Unit

fun glGetConvolutionParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetConvolutionParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetConvolutionParameterfv")
private external fun kni_glGetConvolutionParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetConvolutionParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetConvolutionParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("kni_opengl_glGetConvolutionParameteriv")
private external fun kni_glGetConvolutionParameteriv(target: Int, pname: Int, params: NativePtr): Unit

@SymbolName("kni_opengl_glSeparableFilter2D")
external fun glSeparableFilter2D(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, row: COpaquePointer?, column: COpaquePointer?): Unit

@SymbolName("kni_opengl_glGetSeparableFilter")
external fun glGetSeparableFilter(target: GLenum, format: GLenum, type: GLenum, row: COpaquePointer?, column: COpaquePointer?, span: COpaquePointer?): Unit

@SymbolName("kni_opengl_glActiveTexture")
external fun glActiveTexture(texture: GLenum): Unit

@SymbolName("kni_opengl_glClientActiveTexture")
external fun glClientActiveTexture(texture: GLenum): Unit

@SymbolName("kni_opengl_glCompressedTexImage1D")
external fun glCompressedTexImage1D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, border: GLint, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCompressedTexImage2D")
external fun glCompressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCompressedTexImage3D")
external fun glCompressedTexImage3D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, depth: GLsizei, border: GLint, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCompressedTexSubImage1D")
external fun glCompressedTexSubImage1D(target: GLenum, level: GLint, xoffset: GLint, width: GLsizei, format: GLenum, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCompressedTexSubImage2D")
external fun glCompressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glCompressedTexSubImage3D")
external fun glCompressedTexSubImage3D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, zoffset: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, imageSize: GLsizei, data: COpaquePointer?): Unit

@SymbolName("kni_opengl_glGetCompressedTexImage")
external fun glGetCompressedTexImage(target: GLenum, lod: GLint, img: COpaquePointer?): Unit

@SymbolName("kni_opengl_glMultiTexCoord1d")
external fun glMultiTexCoord1d(target: GLenum, s: GLdouble): Unit

fun glMultiTexCoord1dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1dv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1dv")
private external fun kni_glMultiTexCoord1dv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1f")
external fun glMultiTexCoord1f(target: GLenum, s: GLfloat): Unit

fun glMultiTexCoord1fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1fv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1fv")
private external fun kni_glMultiTexCoord1fv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1i")
external fun glMultiTexCoord1i(target: GLenum, s: GLint): Unit

fun glMultiTexCoord1iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1iv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1iv")
private external fun kni_glMultiTexCoord1iv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1s")
external fun glMultiTexCoord1s(target: GLenum, s: GLshort): Unit

fun glMultiTexCoord1sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1sv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1sv")
private external fun kni_glMultiTexCoord1sv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2d")
external fun glMultiTexCoord2d(target: GLenum, s: GLdouble, t: GLdouble): Unit

fun glMultiTexCoord2dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2dv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2dv")
private external fun kni_glMultiTexCoord2dv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2f")
external fun glMultiTexCoord2f(target: GLenum, s: GLfloat, t: GLfloat): Unit

fun glMultiTexCoord2fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2fv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2fv")
private external fun kni_glMultiTexCoord2fv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2i")
external fun glMultiTexCoord2i(target: GLenum, s: GLint, t: GLint): Unit

fun glMultiTexCoord2iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2iv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2iv")
private external fun kni_glMultiTexCoord2iv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2s")
external fun glMultiTexCoord2s(target: GLenum, s: GLshort, t: GLshort): Unit

fun glMultiTexCoord2sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2sv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2sv")
private external fun kni_glMultiTexCoord2sv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3d")
external fun glMultiTexCoord3d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit

fun glMultiTexCoord3dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3dv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3dv")
private external fun kni_glMultiTexCoord3dv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3f")
external fun glMultiTexCoord3f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit

fun glMultiTexCoord3fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3fv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3fv")
private external fun kni_glMultiTexCoord3fv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3i")
external fun glMultiTexCoord3i(target: GLenum, s: GLint, t: GLint, r: GLint): Unit

fun glMultiTexCoord3iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3iv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3iv")
private external fun kni_glMultiTexCoord3iv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3s")
external fun glMultiTexCoord3s(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit

fun glMultiTexCoord3sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3sv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3sv")
private external fun kni_glMultiTexCoord3sv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4d")
external fun glMultiTexCoord4d(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit

fun glMultiTexCoord4dv(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4dv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4dv")
private external fun kni_glMultiTexCoord4dv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4f")
external fun glMultiTexCoord4f(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit

fun glMultiTexCoord4fv(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4fv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4fv")
private external fun kni_glMultiTexCoord4fv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4i")
external fun glMultiTexCoord4i(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit

fun glMultiTexCoord4iv(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4iv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4iv")
private external fun kni_glMultiTexCoord4iv(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4s")
external fun glMultiTexCoord4s(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit

fun glMultiTexCoord4sv(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4sv(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4sv")
private external fun kni_glMultiTexCoord4sv(target: Int, v: NativePtr): Unit

fun glLoadTransposeMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glLoadTransposeMatrixd(_m)
        res
    }
}

@SymbolName("kni_opengl_glLoadTransposeMatrixd")
private external fun kni_glLoadTransposeMatrixd(m: NativePtr): Unit

fun glLoadTransposeMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glLoadTransposeMatrixf(_m)
        res
    }
}

@SymbolName("kni_opengl_glLoadTransposeMatrixf")
private external fun kni_glLoadTransposeMatrixf(m: NativePtr): Unit

fun glMultTransposeMatrixd(m: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glMultTransposeMatrixd(_m)
        res
    }
}

@SymbolName("kni_opengl_glMultTransposeMatrixd")
private external fun kni_glMultTransposeMatrixd(m: NativePtr): Unit

fun glMultTransposeMatrixf(m: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _m = m?.getPointer(memScope).rawValue
        val res = kni_glMultTransposeMatrixf(_m)
        res
    }
}

@SymbolName("kni_opengl_glMultTransposeMatrixf")
private external fun kni_glMultTransposeMatrixf(m: NativePtr): Unit

@SymbolName("kni_opengl_glSampleCoverage")
external fun glSampleCoverage(value: GLclampf, invert: GLboolean): Unit

@SymbolName("kni_opengl_glActiveTextureARB")
external fun glActiveTextureARB(texture: GLenum): Unit

@SymbolName("kni_opengl_glClientActiveTextureARB")
external fun glClientActiveTextureARB(texture: GLenum): Unit

@SymbolName("kni_opengl_glMultiTexCoord1dARB")
external fun glMultiTexCoord1dARB(target: GLenum, s: GLdouble): Unit

fun glMultiTexCoord1dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1dvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1dvARB")
private external fun kni_glMultiTexCoord1dvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1fARB")
external fun glMultiTexCoord1fARB(target: GLenum, s: GLfloat): Unit

fun glMultiTexCoord1fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1fvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1fvARB")
private external fun kni_glMultiTexCoord1fvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1iARB")
external fun glMultiTexCoord1iARB(target: GLenum, s: GLint): Unit

fun glMultiTexCoord1ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1ivARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1ivARB")
private external fun kni_glMultiTexCoord1ivARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord1sARB")
external fun glMultiTexCoord1sARB(target: GLenum, s: GLshort): Unit

fun glMultiTexCoord1svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord1svARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord1svARB")
private external fun kni_glMultiTexCoord1svARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2dARB")
external fun glMultiTexCoord2dARB(target: GLenum, s: GLdouble, t: GLdouble): Unit

fun glMultiTexCoord2dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2dvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2dvARB")
private external fun kni_glMultiTexCoord2dvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2fARB")
external fun glMultiTexCoord2fARB(target: GLenum, s: GLfloat, t: GLfloat): Unit

fun glMultiTexCoord2fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2fvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2fvARB")
private external fun kni_glMultiTexCoord2fvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2iARB")
external fun glMultiTexCoord2iARB(target: GLenum, s: GLint, t: GLint): Unit

fun glMultiTexCoord2ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2ivARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2ivARB")
private external fun kni_glMultiTexCoord2ivARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord2sARB")
external fun glMultiTexCoord2sARB(target: GLenum, s: GLshort, t: GLshort): Unit

fun glMultiTexCoord2svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord2svARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord2svARB")
private external fun kni_glMultiTexCoord2svARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3dARB")
external fun glMultiTexCoord3dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble): Unit

fun glMultiTexCoord3dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3dvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3dvARB")
private external fun kni_glMultiTexCoord3dvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3fARB")
external fun glMultiTexCoord3fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat): Unit

fun glMultiTexCoord3fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3fvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3fvARB")
private external fun kni_glMultiTexCoord3fvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3iARB")
external fun glMultiTexCoord3iARB(target: GLenum, s: GLint, t: GLint, r: GLint): Unit

fun glMultiTexCoord3ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3ivARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3ivARB")
private external fun kni_glMultiTexCoord3ivARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord3sARB")
external fun glMultiTexCoord3sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort): Unit

fun glMultiTexCoord3svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord3svARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord3svARB")
private external fun kni_glMultiTexCoord3svARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4dARB")
external fun glMultiTexCoord4dARB(target: GLenum, s: GLdouble, t: GLdouble, r: GLdouble, q: GLdouble): Unit

fun glMultiTexCoord4dvARB(target: GLenum, v: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4dvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4dvARB")
private external fun kni_glMultiTexCoord4dvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4fARB")
external fun glMultiTexCoord4fARB(target: GLenum, s: GLfloat, t: GLfloat, r: GLfloat, q: GLfloat): Unit

fun glMultiTexCoord4fvARB(target: GLenum, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4fvARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4fvARB")
private external fun kni_glMultiTexCoord4fvARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4iARB")
external fun glMultiTexCoord4iARB(target: GLenum, s: GLint, t: GLint, r: GLint, q: GLint): Unit

fun glMultiTexCoord4ivARB(target: GLenum, v: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4ivARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4ivARB")
private external fun kni_glMultiTexCoord4ivARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_glMultiTexCoord4sARB")
external fun glMultiTexCoord4sARB(target: GLenum, s: GLshort, t: GLshort, r: GLshort, q: GLshort): Unit

fun glMultiTexCoord4svARB(target: GLenum, v: CValuesRef<GLshortVar>?): Unit {
    return memScoped {
        val _target = target
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glMultiTexCoord4svARB(_target, _v)
        res
    }
}

@SymbolName("kni_opengl_glMultiTexCoord4svARB")
private external fun kni_glMultiTexCoord4svARB(target: Int, v: NativePtr): Unit

@SymbolName("kni_opengl_imaxabs")
external fun imaxabs(__n: intmax_t): intmax_t

fun imaxdiv(__numer: intmax_t, __denom: intmax_t): CValue<imaxdiv_t> {
    return memScoped {
        val ___numer = __numer
        val ___denom = __denom
        val res = kni_imaxdiv(___numer, ___denom, alloc<imaxdiv_t>().rawPtr)
        interpretPointed<imaxdiv_t>(res).readValue()
    }
}

@SymbolName("kni_opengl_imaxdiv")
private external fun kni_imaxdiv(__numer: Long, __denom: Long, retValPlacement: NativePtr): NativePtr

fun strtoimax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): intmax_t {
    return memScoped {
        val ___nptr = __nptr?.cstr?.getPointer(memScope).rawValue
        val ___endptr = __endptr?.getPointer(memScope).rawValue
        val ___base = __base
        val res = kni_strtoimax(___nptr, ___endptr, ___base)
        res
    }
}

@SymbolName("kni_opengl_strtoimax")
private external fun kni_strtoimax(__nptr: NativePtr, __endptr: NativePtr, __base: Int): Long

fun strtoumax(__nptr: String?, __endptr: CValuesRef<CPointerVar<ByteVar>>?, __base: Int): uintmax_t {
    return memScoped {
        val ___nptr = __nptr?.cstr?.getPointer(memScope).rawValue
        val ___endptr = __endptr?.getPointer(memScope).rawValue
        val ___base = __base
        val res = kni_strtoumax(___nptr, ___endptr, ___base)
        res
    }
}

@SymbolName("kni_opengl_strtoumax")
private external fun kni_strtoumax(__nptr: NativePtr, __endptr: NativePtr, __base: Int): Long

fun wcstoimax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): intmax_t {
    return memScoped {
        val ___nptr = __nptr?.getPointer(memScope).rawValue
        val ___endptr = __endptr?.getPointer(memScope).rawValue
        val ___base = __base
        val res = kni_wcstoimax(___nptr, ___endptr, ___base)
        res
    }
}

@SymbolName("kni_opengl_wcstoimax")
private external fun kni_wcstoimax(__nptr: NativePtr, __endptr: NativePtr, __base: Int): Long

fun wcstoumax(__nptr: CValuesRef<__gwchar_tVar>?, __endptr: CValuesRef<CPointerVar<__gwchar_tVar>>?, __base: Int): uintmax_t {
    return memScoped {
        val ___nptr = __nptr?.getPointer(memScope).rawValue
        val ___endptr = __endptr?.getPointer(memScope).rawValue
        val ___base = __base
        val res = kni_wcstoumax(___nptr, ___endptr, ___base)
        res
    }
}

@SymbolName("kni_opengl_wcstoumax")
private external fun kni_wcstoumax(__nptr: NativePtr, __endptr: NativePtr, __base: Int): Long

@SymbolName("kni_opengl_glBlendEquationSeparateATI")
external fun glBlendEquationSeparateATI(modeRGB: GLenum, modeA: GLenum): Unit

fun gluBeginCurve(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluBeginCurve(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluBeginCurve")
private external fun kni_gluBeginCurve(nurb: NativePtr): Unit

fun gluBeginPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluBeginPolygon(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluBeginPolygon")
private external fun kni_gluBeginPolygon(tess: NativePtr): Unit

fun gluBeginSurface(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluBeginSurface(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluBeginSurface")
private external fun kni_gluBeginSurface(nurb: NativePtr): Unit

fun gluBeginTrim(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluBeginTrim(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluBeginTrim")
private external fun kni_gluBeginTrim(nurb: NativePtr): Unit

@SymbolName("kni_opengl_gluBuild1DMipmapLevels")
external fun gluBuild1DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: COpaquePointer?): GLint

@SymbolName("kni_opengl_gluBuild1DMipmaps")
external fun gluBuild1DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, format: GLenum, type: GLenum, data: COpaquePointer?): GLint

@SymbolName("kni_opengl_gluBuild2DMipmapLevels")
external fun gluBuild2DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: COpaquePointer?): GLint

@SymbolName("kni_opengl_gluBuild2DMipmaps")
external fun gluBuild2DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, data: COpaquePointer?): GLint

@SymbolName("kni_opengl_gluBuild3DMipmapLevels")
external fun gluBuild3DMipmapLevels(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, level: GLint, base: GLint, max: GLint, data: COpaquePointer?): GLint

@SymbolName("kni_opengl_gluBuild3DMipmaps")
external fun gluBuild3DMipmaps(target: GLenum, internalFormat: GLint, width: GLsizei, height: GLsizei, depth: GLsizei, format: GLenum, type: GLenum, data: COpaquePointer?): GLint

fun gluCheckExtension(extName: CValuesRef<GLubyteVar>?, extString: CValuesRef<GLubyteVar>?): GLboolean {
    return memScoped {
        val _extName = extName?.getPointer(memScope).rawValue
        val _extString = extString?.getPointer(memScope).rawValue
        val res = kni_gluCheckExtension(_extName, _extString)
        res
    }
}

@SymbolName("kni_opengl_gluCheckExtension")
private external fun kni_gluCheckExtension(extName: NativePtr, extString: NativePtr): Byte

fun gluCylinder(quad: CValuesRef<GLUquadric>?, base: GLdouble, top: GLdouble, height: GLdouble, slices: GLint, stacks: GLint): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _base = base
        val _top = top
        val _height = height
        val _slices = slices
        val _stacks = stacks
        val res = kni_gluCylinder(_quad, _base, _top, _height, _slices, _stacks)
        res
    }
}

@SymbolName("kni_opengl_gluCylinder")
private external fun kni_gluCylinder(quad: NativePtr, base: Double, top: Double, height: Double, slices: Int, stacks: Int): Unit

fun gluDeleteNurbsRenderer(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluDeleteNurbsRenderer(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluDeleteNurbsRenderer")
private external fun kni_gluDeleteNurbsRenderer(nurb: NativePtr): Unit

fun gluDeleteQuadric(quad: CValuesRef<GLUquadric>?): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val res = kni_gluDeleteQuadric(_quad)
        res
    }
}

@SymbolName("kni_opengl_gluDeleteQuadric")
private external fun kni_gluDeleteQuadric(quad: NativePtr): Unit

fun gluDeleteTess(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluDeleteTess(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluDeleteTess")
private external fun kni_gluDeleteTess(tess: NativePtr): Unit

fun gluDisk(quad: CValuesRef<GLUquadric>?, inner: GLdouble, outer: GLdouble, slices: GLint, loops: GLint): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _inner = inner
        val _outer = outer
        val _slices = slices
        val _loops = loops
        val res = kni_gluDisk(_quad, _inner, _outer, _slices, _loops)
        res
    }
}

@SymbolName("kni_opengl_gluDisk")
private external fun kni_gluDisk(quad: NativePtr, inner: Double, outer: Double, slices: Int, loops: Int): Unit

fun gluEndCurve(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluEndCurve(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluEndCurve")
private external fun kni_gluEndCurve(nurb: NativePtr): Unit

fun gluEndPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluEndPolygon(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluEndPolygon")
private external fun kni_gluEndPolygon(tess: NativePtr): Unit

fun gluEndSurface(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluEndSurface(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluEndSurface")
private external fun kni_gluEndSurface(nurb: NativePtr): Unit

fun gluEndTrim(nurb: CValuesRef<GLUnurbs>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val res = kni_gluEndTrim(_nurb)
        res
    }
}

@SymbolName("kni_opengl_gluEndTrim")
private external fun kni_gluEndTrim(nurb: NativePtr): Unit

@SymbolName("kni_opengl_gluErrorString")
external fun gluErrorString(error: GLenum): CPointer<GLubyteVar>?

fun gluGetNurbsProperty(nurb: CValuesRef<GLUnurbs>?, property: GLenum, data: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _property = property
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_gluGetNurbsProperty(_nurb, _property, _data)
        res
    }
}

@SymbolName("kni_opengl_gluGetNurbsProperty")
private external fun kni_gluGetNurbsProperty(nurb: NativePtr, property: Int, data: NativePtr): Unit

@SymbolName("kni_opengl_gluGetString")
external fun gluGetString(name: GLenum): CPointer<GLubyteVar>?

fun gluGetTessProperty(tess: CValuesRef<GLUtesselator>?, which: GLenum, data: CValuesRef<GLdoubleVar>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _which = which
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_gluGetTessProperty(_tess, _which, _data)
        res
    }
}

@SymbolName("kni_opengl_gluGetTessProperty")
private external fun kni_gluGetTessProperty(tess: NativePtr, which: Int, data: NativePtr): Unit

fun gluLoadSamplingMatrices(nurb: CValuesRef<GLUnurbs>?, model: CValuesRef<GLfloatVar>?, perspective: CValuesRef<GLfloatVar>?, view: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _model = model?.getPointer(memScope).rawValue
        val _perspective = perspective?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_gluLoadSamplingMatrices(_nurb, _model, _perspective, _view)
        res
    }
}

@SymbolName("kni_opengl_gluLoadSamplingMatrices")
private external fun kni_gluLoadSamplingMatrices(nurb: NativePtr, model: NativePtr, perspective: NativePtr, view: NativePtr): Unit

@SymbolName("kni_opengl_gluLookAt")
external fun gluLookAt(eyeX: GLdouble, eyeY: GLdouble, eyeZ: GLdouble, centerX: GLdouble, centerY: GLdouble, centerZ: GLdouble, upX: GLdouble, upY: GLdouble, upZ: GLdouble): Unit

@SymbolName("kni_opengl_gluNewNurbsRenderer")
external fun gluNewNurbsRenderer(): CPointer<GLUnurbs>?

@SymbolName("kni_opengl_gluNewQuadric")
external fun gluNewQuadric(): CPointer<GLUquadric>?

@SymbolName("kni_opengl_gluNewTess")
external fun gluNewTess(): CPointer<GLUtesselator>?

fun gluNextContour(tess: CValuesRef<GLUtesselator>?, type: GLenum): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _type = type
        val res = kni_gluNextContour(_tess, _type)
        res
    }
}

@SymbolName("kni_opengl_gluNextContour")
private external fun kni_gluNextContour(tess: NativePtr, type: Int): Unit

fun gluNurbsCallback(nurb: CValuesRef<GLUnurbs>?, which: GLenum, CallBackFunc: _GLUfuncptr?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _which = which
        val _CallBackFunc = CallBackFunc.rawValue
        val res = kni_gluNurbsCallback(_nurb, _which, _CallBackFunc)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsCallback")
private external fun kni_gluNurbsCallback(nurb: NativePtr, which: Int, CallBackFunc: NativePtr): Unit

fun gluNurbsCallbackData(nurb: CValuesRef<GLUnurbs>?, userData: COpaquePointer?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _userData = userData.rawValue
        val res = kni_gluNurbsCallbackData(_nurb, _userData)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsCallbackData")
private external fun kni_gluNurbsCallbackData(nurb: NativePtr, userData: NativePtr): Unit

fun gluNurbsCallbackDataEXT(nurb: CValuesRef<GLUnurbs>?, userData: COpaquePointer?): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _userData = userData.rawValue
        val res = kni_gluNurbsCallbackDataEXT(_nurb, _userData)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsCallbackDataEXT")
private external fun kni_gluNurbsCallbackDataEXT(nurb: NativePtr, userData: NativePtr): Unit

fun gluNurbsCurve(nurb: CValuesRef<GLUnurbs>?, knotCount: GLint, knots: CValuesRef<GLfloatVar>?, stride: GLint, control: CValuesRef<GLfloatVar>?, order: GLint, type: GLenum): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _knotCount = knotCount
        val _knots = knots?.getPointer(memScope).rawValue
        val _stride = stride
        val _control = control?.getPointer(memScope).rawValue
        val _order = order
        val _type = type
        val res = kni_gluNurbsCurve(_nurb, _knotCount, _knots, _stride, _control, _order, _type)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsCurve")
private external fun kni_gluNurbsCurve(nurb: NativePtr, knotCount: Int, knots: NativePtr, stride: Int, control: NativePtr, order: Int, type: Int): Unit

fun gluNurbsProperty(nurb: CValuesRef<GLUnurbs>?, property: GLenum, value: GLfloat): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _property = property
        val _value = value
        val res = kni_gluNurbsProperty(_nurb, _property, _value)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsProperty")
private external fun kni_gluNurbsProperty(nurb: NativePtr, property: Int, value: Float): Unit

fun gluNurbsSurface(nurb: CValuesRef<GLUnurbs>?, sKnotCount: GLint, sKnots: CValuesRef<GLfloatVar>?, tKnotCount: GLint, tKnots: CValuesRef<GLfloatVar>?, sStride: GLint, tStride: GLint, control: CValuesRef<GLfloatVar>?, sOrder: GLint, tOrder: GLint, type: GLenum): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _sKnotCount = sKnotCount
        val _sKnots = sKnots?.getPointer(memScope).rawValue
        val _tKnotCount = tKnotCount
        val _tKnots = tKnots?.getPointer(memScope).rawValue
        val _sStride = sStride
        val _tStride = tStride
        val _control = control?.getPointer(memScope).rawValue
        val _sOrder = sOrder
        val _tOrder = tOrder
        val _type = type
        val res = kni_gluNurbsSurface(_nurb, _sKnotCount, _sKnots, _tKnotCount, _tKnots, _sStride, _tStride, _control, _sOrder, _tOrder, _type)
        res
    }
}

@SymbolName("kni_opengl_gluNurbsSurface")
private external fun kni_gluNurbsSurface(nurb: NativePtr, sKnotCount: Int, sKnots: NativePtr, tKnotCount: Int, tKnots: NativePtr, sStride: Int, tStride: Int, control: NativePtr, sOrder: Int, tOrder: Int, type: Int): Unit

@SymbolName("kni_opengl_gluOrtho2D")
external fun gluOrtho2D(left: GLdouble, right: GLdouble, bottom: GLdouble, top: GLdouble): Unit

fun gluPartialDisk(quad: CValuesRef<GLUquadric>?, inner: GLdouble, outer: GLdouble, slices: GLint, loops: GLint, start: GLdouble, sweep: GLdouble): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _inner = inner
        val _outer = outer
        val _slices = slices
        val _loops = loops
        val _start = start
        val _sweep = sweep
        val res = kni_gluPartialDisk(_quad, _inner, _outer, _slices, _loops, _start, _sweep)
        res
    }
}

@SymbolName("kni_opengl_gluPartialDisk")
private external fun kni_gluPartialDisk(quad: NativePtr, inner: Double, outer: Double, slices: Int, loops: Int, start: Double, sweep: Double): Unit

@SymbolName("kni_opengl_gluPerspective")
external fun gluPerspective(fovy: GLdouble, aspect: GLdouble, zNear: GLdouble, zFar: GLdouble): Unit

fun gluPickMatrix(x: GLdouble, y: GLdouble, delX: GLdouble, delY: GLdouble, viewport: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _x = x
        val _y = y
        val _delX = delX
        val _delY = delY
        val _viewport = viewport?.getPointer(memScope).rawValue
        val res = kni_gluPickMatrix(_x, _y, _delX, _delY, _viewport)
        res
    }
}

@SymbolName("kni_opengl_gluPickMatrix")
private external fun kni_gluPickMatrix(x: Double, y: Double, delX: Double, delY: Double, viewport: NativePtr): Unit

fun gluProject(objX: GLdouble, objY: GLdouble, objZ: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, winX: CValuesRef<GLdoubleVar>?, winY: CValuesRef<GLdoubleVar>?, winZ: CValuesRef<GLdoubleVar>?): GLint {
    return memScoped {
        val _objX = objX
        val _objY = objY
        val _objZ = objZ
        val _model = model?.getPointer(memScope).rawValue
        val _proj = proj?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val _winX = winX?.getPointer(memScope).rawValue
        val _winY = winY?.getPointer(memScope).rawValue
        val _winZ = winZ?.getPointer(memScope).rawValue
        val res = kni_gluProject(_objX, _objY, _objZ, _model, _proj, _view, _winX, _winY, _winZ)
        res
    }
}

@SymbolName("kni_opengl_gluProject")
private external fun kni_gluProject(objX: Double, objY: Double, objZ: Double, model: NativePtr, proj: NativePtr, view: NativePtr, winX: NativePtr, winY: NativePtr, winZ: NativePtr): Int

fun gluPwlCurve(nurb: CValuesRef<GLUnurbs>?, count: GLint, data: CValuesRef<GLfloatVar>?, stride: GLint, type: GLenum): Unit {
    return memScoped {
        val _nurb = nurb?.getPointer(memScope).rawValue
        val _count = count
        val _data = data?.getPointer(memScope).rawValue
        val _stride = stride
        val _type = type
        val res = kni_gluPwlCurve(_nurb, _count, _data, _stride, _type)
        res
    }
}

@SymbolName("kni_opengl_gluPwlCurve")
private external fun kni_gluPwlCurve(nurb: NativePtr, count: Int, data: NativePtr, stride: Int, type: Int): Unit

fun gluQuadricCallback(quad: CValuesRef<GLUquadric>?, which: GLenum, CallBackFunc: _GLUfuncptr?): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _which = which
        val _CallBackFunc = CallBackFunc.rawValue
        val res = kni_gluQuadricCallback(_quad, _which, _CallBackFunc)
        res
    }
}

@SymbolName("kni_opengl_gluQuadricCallback")
private external fun kni_gluQuadricCallback(quad: NativePtr, which: Int, CallBackFunc: NativePtr): Unit

fun gluQuadricDrawStyle(quad: CValuesRef<GLUquadric>?, draw: GLenum): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _draw = draw
        val res = kni_gluQuadricDrawStyle(_quad, _draw)
        res
    }
}

@SymbolName("kni_opengl_gluQuadricDrawStyle")
private external fun kni_gluQuadricDrawStyle(quad: NativePtr, draw: Int): Unit

fun gluQuadricNormals(quad: CValuesRef<GLUquadric>?, normal: GLenum): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _normal = normal
        val res = kni_gluQuadricNormals(_quad, _normal)
        res
    }
}

@SymbolName("kni_opengl_gluQuadricNormals")
private external fun kni_gluQuadricNormals(quad: NativePtr, normal: Int): Unit

fun gluQuadricOrientation(quad: CValuesRef<GLUquadric>?, orientation: GLenum): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _orientation = orientation
        val res = kni_gluQuadricOrientation(_quad, _orientation)
        res
    }
}

@SymbolName("kni_opengl_gluQuadricOrientation")
private external fun kni_gluQuadricOrientation(quad: NativePtr, orientation: Int): Unit

fun gluQuadricTexture(quad: CValuesRef<GLUquadric>?, texture: GLboolean): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _texture = texture
        val res = kni_gluQuadricTexture(_quad, _texture)
        res
    }
}

@SymbolName("kni_opengl_gluQuadricTexture")
private external fun kni_gluQuadricTexture(quad: NativePtr, texture: Byte): Unit

@SymbolName("kni_opengl_gluScaleImage")
external fun gluScaleImage(format: GLenum, wIn: GLsizei, hIn: GLsizei, typeIn: GLenum, dataIn: COpaquePointer?, wOut: GLsizei, hOut: GLsizei, typeOut: GLenum, dataOut: COpaquePointer?): GLint

fun gluSphere(quad: CValuesRef<GLUquadric>?, radius: GLdouble, slices: GLint, stacks: GLint): Unit {
    return memScoped {
        val _quad = quad?.getPointer(memScope).rawValue
        val _radius = radius
        val _slices = slices
        val _stacks = stacks
        val res = kni_gluSphere(_quad, _radius, _slices, _stacks)
        res
    }
}

@SymbolName("kni_opengl_gluSphere")
private external fun kni_gluSphere(quad: NativePtr, radius: Double, slices: Int, stacks: Int): Unit

fun gluTessBeginContour(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluTessBeginContour(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluTessBeginContour")
private external fun kni_gluTessBeginContour(tess: NativePtr): Unit

fun gluTessBeginPolygon(tess: CValuesRef<GLUtesselator>?, data: COpaquePointer?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val res = kni_gluTessBeginPolygon(_tess, _data)
        res
    }
}

@SymbolName("kni_opengl_gluTessBeginPolygon")
private external fun kni_gluTessBeginPolygon(tess: NativePtr, data: NativePtr): Unit

fun gluTessCallback(tess: CValuesRef<GLUtesselator>?, which: GLenum, CallBackFunc: _GLUfuncptr?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _which = which
        val _CallBackFunc = CallBackFunc.rawValue
        val res = kni_gluTessCallback(_tess, _which, _CallBackFunc)
        res
    }
}

@SymbolName("kni_opengl_gluTessCallback")
private external fun kni_gluTessCallback(tess: NativePtr, which: Int, CallBackFunc: NativePtr): Unit

fun gluTessEndContour(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluTessEndContour(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluTessEndContour")
private external fun kni_gluTessEndContour(tess: NativePtr): Unit

fun gluTessEndPolygon(tess: CValuesRef<GLUtesselator>?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val res = kni_gluTessEndPolygon(_tess)
        res
    }
}

@SymbolName("kni_opengl_gluTessEndPolygon")
private external fun kni_gluTessEndPolygon(tess: NativePtr): Unit

fun gluTessNormal(tess: CValuesRef<GLUtesselator>?, valueX: GLdouble, valueY: GLdouble, valueZ: GLdouble): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _valueX = valueX
        val _valueY = valueY
        val _valueZ = valueZ
        val res = kni_gluTessNormal(_tess, _valueX, _valueY, _valueZ)
        res
    }
}

@SymbolName("kni_opengl_gluTessNormal")
private external fun kni_gluTessNormal(tess: NativePtr, valueX: Double, valueY: Double, valueZ: Double): Unit

fun gluTessProperty(tess: CValuesRef<GLUtesselator>?, which: GLenum, data: GLdouble): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _which = which
        val _data = data
        val res = kni_gluTessProperty(_tess, _which, _data)
        res
    }
}

@SymbolName("kni_opengl_gluTessProperty")
private external fun kni_gluTessProperty(tess: NativePtr, which: Int, data: Double): Unit

fun gluTessVertex(tess: CValuesRef<GLUtesselator>?, location: CValuesRef<GLdoubleVar>?, data: COpaquePointer?): Unit {
    return memScoped {
        val _tess = tess?.getPointer(memScope).rawValue
        val _location = location?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val res = kni_gluTessVertex(_tess, _location, _data)
        res
    }
}

@SymbolName("kni_opengl_gluTessVertex")
private external fun kni_gluTessVertex(tess: NativePtr, location: NativePtr, data: NativePtr): Unit

fun gluUnProject(winX: GLdouble, winY: GLdouble, winZ: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, objX: CValuesRef<GLdoubleVar>?, objY: CValuesRef<GLdoubleVar>?, objZ: CValuesRef<GLdoubleVar>?): GLint {
    return memScoped {
        val _winX = winX
        val _winY = winY
        val _winZ = winZ
        val _model = model?.getPointer(memScope).rawValue
        val _proj = proj?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val _objX = objX?.getPointer(memScope).rawValue
        val _objY = objY?.getPointer(memScope).rawValue
        val _objZ = objZ?.getPointer(memScope).rawValue
        val res = kni_gluUnProject(_winX, _winY, _winZ, _model, _proj, _view, _objX, _objY, _objZ)
        res
    }
}

@SymbolName("kni_opengl_gluUnProject")
private external fun kni_gluUnProject(winX: Double, winY: Double, winZ: Double, model: NativePtr, proj: NativePtr, view: NativePtr, objX: NativePtr, objY: NativePtr, objZ: NativePtr): Int

fun gluUnProject4(winX: GLdouble, winY: GLdouble, winZ: GLdouble, clipW: GLdouble, model: CValuesRef<GLdoubleVar>?, proj: CValuesRef<GLdoubleVar>?, view: CValuesRef<GLintVar>?, nearVal: GLdouble, farVal: GLdouble, objX: CValuesRef<GLdoubleVar>?, objY: CValuesRef<GLdoubleVar>?, objZ: CValuesRef<GLdoubleVar>?, objW: CValuesRef<GLdoubleVar>?): GLint {
    return memScoped {
        val _winX = winX
        val _winY = winY
        val _winZ = winZ
        val _clipW = clipW
        val _model = model?.getPointer(memScope).rawValue
        val _proj = proj?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val _nearVal = nearVal
        val _farVal = farVal
        val _objX = objX?.getPointer(memScope).rawValue
        val _objY = objY?.getPointer(memScope).rawValue
        val _objZ = objZ?.getPointer(memScope).rawValue
        val _objW = objW?.getPointer(memScope).rawValue
        val res = kni_gluUnProject4(_winX, _winY, _winZ, _clipW, _model, _proj, _view, _nearVal, _farVal, _objX, _objY, _objZ, _objW)
        res
    }
}

@SymbolName("kni_opengl_gluUnProject4")
private external fun kni_gluUnProject4(winX: Double, winY: Double, winZ: Double, clipW: Double, model: NativePtr, proj: NativePtr, view: NativePtr, nearVal: Double, farVal: Double, objX: NativePtr, objY: NativePtr, objZ: NativePtr, objW: NativePtr): Int

val __llvm__: Int = 1

val __clang__: Int = 1

val __clang_major__: Int = 3

val __clang_minor__: Int = 9

val __clang_patchlevel__: Int = 0

val __GNUC_MINOR__: Int = 2

val __GNUC_PATCHLEVEL__: Int = 1

val __GNUC__: Int = 4

val __GXX_ABI_VERSION: Int = 1002

val __ATOMIC_RELAXED: Int = 0

val __ATOMIC_CONSUME: Int = 1

val __ATOMIC_ACQUIRE: Int = 2

val __ATOMIC_RELEASE: Int = 3

val __ATOMIC_ACQ_REL: Int = 4

val __ATOMIC_SEQ_CST: Int = 5

val __PRAGMA_REDEFINE_EXTNAME: Int = 1

val __CONSTANT_CFSTRINGS__: Int = 1

val __ORDER_LITTLE_ENDIAN__: Int = 1234

val __ORDER_BIG_ENDIAN__: Int = 4321

val __ORDER_PDP_ENDIAN__: Int = 3412

val __BYTE_ORDER__: Int = 1234

val __LITTLE_ENDIAN__: Int = 1

val _LP64: Int = 1

val __LP64__: Int = 1

val __CHAR_BIT__: Int = 8

val __SCHAR_MAX__: Int = 127

val __SHRT_MAX__: Int = 32767

val __INT_MAX__: Int = 2147483647

val __LONG_MAX__: Long = 9223372036854775807

val __LONG_LONG_MAX__: Long = 9223372036854775807

val __WCHAR_MAX__: Int = 2147483647

val __INTMAX_MAX__: Long = 9223372036854775807

val __SIZE_MAX__: Long = -1

val __UINTMAX_MAX__: Long = -1

val __PTRDIFF_MAX__: Long = 9223372036854775807

val __INTPTR_MAX__: Long = 9223372036854775807

val __UINTPTR_MAX__: Long = -1

val __SIZEOF_DOUBLE__: Int = 8

val __SIZEOF_FLOAT__: Int = 4

val __SIZEOF_INT__: Int = 4

val __SIZEOF_LONG__: Int = 8

val __SIZEOF_LONG_DOUBLE__: Int = 16

val __SIZEOF_LONG_LONG__: Int = 8

val __SIZEOF_POINTER__: Int = 8

val __SIZEOF_SHORT__: Int = 2

val __SIZEOF_PTRDIFF_T__: Int = 8

val __SIZEOF_SIZE_T__: Int = 8

val __SIZEOF_WCHAR_T__: Int = 4

val __SIZEOF_WINT_T__: Int = 4

val __SIZEOF_INT128__: Int = 16

val __INTMAX_WIDTH__: Int = 64

val __PTRDIFF_WIDTH__: Int = 64

val __INTPTR_WIDTH__: Int = 64

val __SIZE_WIDTH__: Int = 64

val __WCHAR_WIDTH__: Int = 32

val __WINT_WIDTH__: Int = 32

val __SIG_ATOMIC_WIDTH__: Int = 32

val __SIG_ATOMIC_MAX__: Int = 2147483647

val __UINTMAX_WIDTH__: Int = 64

val __UINTPTR_WIDTH__: Int = 64

val __FLT_DENORM_MIN__: Float = bitsToFloat(1) /* == 1.4E-45 */

val __FLT_HAS_DENORM__: Int = 1

val __FLT_DIG__: Int = 6

val __FLT_DECIMAL_DIG__: Int = 9

val __FLT_EPSILON__: Float = bitsToFloat(872415232) /* == 1.1920929E-7 */

val __FLT_HAS_INFINITY__: Int = 1

val __FLT_HAS_QUIET_NAN__: Int = 1

val __FLT_MANT_DIG__: Int = 24

val __FLT_MAX_10_EXP__: Int = 38

val __FLT_MAX_EXP__: Int = 128

val __FLT_MAX__: Float = bitsToFloat(2139095039) /* == 3.4028235E38 */

val __FLT_MIN_10_EXP__: Int = -37

val __FLT_MIN_EXP__: Int = -125

val __FLT_MIN__: Float = bitsToFloat(8388608) /* == 1.17549435E-38 */

val __DBL_DENORM_MIN__: Double = bitsToDouble(1) /* == 4.9E-324 */

val __DBL_HAS_DENORM__: Int = 1

val __DBL_DIG__: Int = 15

val __DBL_DECIMAL_DIG__: Int = 17

val __DBL_EPSILON__: Double = bitsToDouble(4372995238176751616) /* == 2.220446049250313E-16 */

val __DBL_HAS_INFINITY__: Int = 1

val __DBL_HAS_QUIET_NAN__: Int = 1

val __DBL_MANT_DIG__: Int = 53

val __DBL_MAX_10_EXP__: Int = 308

val __DBL_MAX_EXP__: Int = 1024

val __DBL_MAX__: Double = bitsToDouble(9218868437227405311) /* == 1.7976931348623157E308 */

val __DBL_MIN_10_EXP__: Int = -307

val __DBL_MIN_EXP__: Int = -1021

val __DBL_MIN__: Double = bitsToDouble(4503599627370496) /* == 2.2250738585072014E-308 */


val __LDBL_HAS_DENORM__: Int = 1

val __LDBL_DIG__: Int = 18

val __LDBL_DECIMAL_DIG__: Int = 21


val __LDBL_HAS_INFINITY__: Int = 1

val __LDBL_HAS_QUIET_NAN__: Int = 1

val __LDBL_MANT_DIG__: Int = 64

val __LDBL_MAX_10_EXP__: Int = 4932

val __LDBL_MAX_EXP__: Int = 16384


val __LDBL_MIN_10_EXP__: Int = -4931

val __LDBL_MIN_EXP__: Int = -16381


val __POINTER_WIDTH__: Int = 64

val __BIGGEST_ALIGNMENT__: Int = 16

val __WINT_UNSIGNED__: Int = 1

val __UINT8_MAX__: Int = 255

val __INT8_MAX__: Int = 127

val __UINT16_MAX__: Int = 65535

val __INT16_MAX__: Int = 32767

val __UINT32_MAX__: Int = -1

val __INT32_MAX__: Int = 2147483647

val __UINT64_MAX__: Long = -1

val __INT64_MAX__: Long = 9223372036854775807

val __INT_LEAST8_MAX__: Int = 127

val __UINT_LEAST8_MAX__: Int = 255

val __INT_LEAST16_MAX__: Int = 32767

val __UINT_LEAST16_MAX__: Int = 65535

val __INT_LEAST32_MAX__: Int = 2147483647

val __UINT_LEAST32_MAX__: Int = -1

val __INT_LEAST64_MAX__: Long = 9223372036854775807

val __UINT_LEAST64_MAX__: Long = -1

val __INT_FAST8_MAX__: Int = 127

val __UINT_FAST8_MAX__: Int = 255

val __INT_FAST16_MAX__: Int = 32767

val __UINT_FAST16_MAX__: Int = 65535

val __INT_FAST32_MAX__: Int = 2147483647

val __UINT_FAST32_MAX__: Int = -1

val __INT_FAST64_MAX__: Long = 9223372036854775807

val __UINT_FAST64_MAX__: Long = -1

val __FINITE_MATH_ONLY__: Int = 0

val __GNUC_STDC_INLINE__: Int = 1

val __GCC_ATOMIC_TEST_AND_SET_TRUEVAL: Int = 1

val __GCC_ATOMIC_BOOL_LOCK_FREE: Int = 2

val __GCC_ATOMIC_CHAR_LOCK_FREE: Int = 2

val __GCC_ATOMIC_CHAR16_T_LOCK_FREE: Int = 2

val __GCC_ATOMIC_CHAR32_T_LOCK_FREE: Int = 2

val __GCC_ATOMIC_WCHAR_T_LOCK_FREE: Int = 2

val __GCC_ATOMIC_SHORT_LOCK_FREE: Int = 2

val __GCC_ATOMIC_INT_LOCK_FREE: Int = 2

val __GCC_ATOMIC_LONG_LOCK_FREE: Int = 2

val __GCC_ATOMIC_LLONG_LOCK_FREE: Int = 2

val __GCC_ATOMIC_POINTER_LOCK_FREE: Int = 2

val __NO_INLINE__: Int = 1

val __FLT_EVAL_METHOD__: Int = 0

val __FLT_RADIX__: Int = 2

val __DECIMAL_DIG__: Int = 21

val __amd64__: Int = 1

val __amd64: Int = 1

val __x86_64: Int = 1

val __x86_64__: Int = 1

val __k8: Int = 1

val __k8__: Int = 1

val __tune_k8__: Int = 1

val __NO_MATH_INLINES: Int = 1

val __FXSR__: Int = 1

val __SSE2__: Int = 1

val __SSE2_MATH__: Int = 1

val __SSE__: Int = 1

val __SSE_MATH__: Int = 1

val __MMX__: Int = 1

val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_1: Int = 1

val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_2: Int = 1

val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_4: Int = 1

val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_8: Int = 1

val unix: Int = 1

val __unix: Int = 1

val __unix__: Int = 1

val linux: Int = 1

val __linux: Int = 1

val __linux__: Int = 1

val __gnu_linux__: Int = 1

val __ELF__: Int = 1

val __FLOAT128__: Int = 1

val __STDC__: Int = 1

val __STDC_HOSTED__: Int = 1

val __STDC_VERSION__: Long = 201112

val __STDC_UTF_16__: Int = 1

val __STDC_UTF_32__: Int = 1

val CSFML_VERSION_MAJOR: Int = 2

val CSFML_VERSION_MINOR: Int = 3

val CSFML_VERSION_PATCH: Int = 0

val sfFalse: Int = 0

val sfTrue: Int = 1

val GL_VERSION_1_1: Int = 1

val GL_VERSION_1_2: Int = 1

val GL_VERSION_1_3: Int = 1

val GL_ARB_imaging: Int = 1

val GL_FALSE: Int = 0

val GL_TRUE: Int = 1

val GL_BYTE: Int = 5120

val GL_UNSIGNED_BYTE: Int = 5121

val GL_SHORT: Int = 5122

val GL_UNSIGNED_SHORT: Int = 5123

val GL_INT: Int = 5124

val GL_UNSIGNED_INT: Int = 5125

val GL_FLOAT: Int = 5126

val GL_2_BYTES: Int = 5127

val GL_3_BYTES: Int = 5128

val GL_4_BYTES: Int = 5129

val GL_DOUBLE: Int = 5130

val GL_POINTS: Int = 0

val GL_LINES: Int = 1

val GL_LINE_LOOP: Int = 2

val GL_LINE_STRIP: Int = 3

val GL_TRIANGLES: Int = 4

val GL_TRIANGLE_STRIP: Int = 5

val GL_TRIANGLE_FAN: Int = 6

val GL_QUADS: Int = 7

val GL_QUAD_STRIP: Int = 8

val GL_POLYGON: Int = 9

val GL_VERTEX_ARRAY: Int = 32884

val GL_NORMAL_ARRAY: Int = 32885

val GL_COLOR_ARRAY: Int = 32886

val GL_INDEX_ARRAY: Int = 32887

val GL_TEXTURE_COORD_ARRAY: Int = 32888

val GL_EDGE_FLAG_ARRAY: Int = 32889

val GL_VERTEX_ARRAY_SIZE: Int = 32890

val GL_VERTEX_ARRAY_TYPE: Int = 32891

val GL_VERTEX_ARRAY_STRIDE: Int = 32892

val GL_NORMAL_ARRAY_TYPE: Int = 32894

val GL_NORMAL_ARRAY_STRIDE: Int = 32895

val GL_COLOR_ARRAY_SIZE: Int = 32897

val GL_COLOR_ARRAY_TYPE: Int = 32898

val GL_COLOR_ARRAY_STRIDE: Int = 32899

val GL_INDEX_ARRAY_TYPE: Int = 32901

val GL_INDEX_ARRAY_STRIDE: Int = 32902

val GL_TEXTURE_COORD_ARRAY_SIZE: Int = 32904

val GL_TEXTURE_COORD_ARRAY_TYPE: Int = 32905

val GL_TEXTURE_COORD_ARRAY_STRIDE: Int = 32906

val GL_EDGE_FLAG_ARRAY_STRIDE: Int = 32908

val GL_VERTEX_ARRAY_POINTER: Int = 32910

val GL_NORMAL_ARRAY_POINTER: Int = 32911

val GL_COLOR_ARRAY_POINTER: Int = 32912

val GL_INDEX_ARRAY_POINTER: Int = 32913

val GL_TEXTURE_COORD_ARRAY_POINTER: Int = 32914

val GL_EDGE_FLAG_ARRAY_POINTER: Int = 32915

val GL_V2F: Int = 10784

val GL_V3F: Int = 10785

val GL_C4UB_V2F: Int = 10786

val GL_C4UB_V3F: Int = 10787

val GL_C3F_V3F: Int = 10788

val GL_N3F_V3F: Int = 10789

val GL_C4F_N3F_V3F: Int = 10790

val GL_T2F_V3F: Int = 10791

val GL_T4F_V4F: Int = 10792

val GL_T2F_C4UB_V3F: Int = 10793

val GL_T2F_C3F_V3F: Int = 10794

val GL_T2F_N3F_V3F: Int = 10795

val GL_T2F_C4F_N3F_V3F: Int = 10796

val GL_T4F_C4F_N3F_V4F: Int = 10797

val GL_MATRIX_MODE: Int = 2976

val GL_MODELVIEW: Int = 5888

val GL_PROJECTION: Int = 5889

val GL_TEXTURE: Int = 5890

val GL_POINT_SMOOTH: Int = 2832

val GL_POINT_SIZE: Int = 2833

val GL_POINT_SIZE_GRANULARITY: Int = 2835

val GL_POINT_SIZE_RANGE: Int = 2834

val GL_LINE_SMOOTH: Int = 2848

val GL_LINE_STIPPLE: Int = 2852

val GL_LINE_STIPPLE_PATTERN: Int = 2853

val GL_LINE_STIPPLE_REPEAT: Int = 2854

val GL_LINE_WIDTH: Int = 2849

val GL_LINE_WIDTH_GRANULARITY: Int = 2851

val GL_LINE_WIDTH_RANGE: Int = 2850

val GL_POINT: Int = 6912

val GL_LINE: Int = 6913

val GL_FILL: Int = 6914

val GL_CW: Int = 2304

val GL_CCW: Int = 2305

val GL_FRONT: Int = 1028

val GL_BACK: Int = 1029

val GL_POLYGON_MODE: Int = 2880

val GL_POLYGON_SMOOTH: Int = 2881

val GL_POLYGON_STIPPLE: Int = 2882

val GL_EDGE_FLAG: Int = 2883

val GL_CULL_FACE: Int = 2884

val GL_CULL_FACE_MODE: Int = 2885

val GL_FRONT_FACE: Int = 2886

val GL_POLYGON_OFFSET_FACTOR: Int = 32824

val GL_POLYGON_OFFSET_UNITS: Int = 10752

val GL_POLYGON_OFFSET_POINT: Int = 10753

val GL_POLYGON_OFFSET_LINE: Int = 10754

val GL_POLYGON_OFFSET_FILL: Int = 32823

val GL_COMPILE: Int = 4864

val GL_COMPILE_AND_EXECUTE: Int = 4865

val GL_LIST_BASE: Int = 2866

val GL_LIST_INDEX: Int = 2867

val GL_LIST_MODE: Int = 2864

val GL_NEVER: Int = 512

val GL_LESS: Int = 513

val GL_EQUAL: Int = 514

val GL_LEQUAL: Int = 515

val GL_GREATER: Int = 516

val GL_NOTEQUAL: Int = 517

val GL_GEQUAL: Int = 518

val GL_ALWAYS: Int = 519

val GL_DEPTH_TEST: Int = 2929

val GL_DEPTH_BITS: Int = 3414

val GL_DEPTH_CLEAR_VALUE: Int = 2931

val GL_DEPTH_FUNC: Int = 2932

val GL_DEPTH_RANGE: Int = 2928

val GL_DEPTH_WRITEMASK: Int = 2930

val GL_DEPTH_COMPONENT: Int = 6402

val GL_LIGHTING: Int = 2896

val GL_LIGHT0: Int = 16384

val GL_LIGHT1: Int = 16385

val GL_LIGHT2: Int = 16386

val GL_LIGHT3: Int = 16387

val GL_LIGHT4: Int = 16388

val GL_LIGHT5: Int = 16389

val GL_LIGHT6: Int = 16390

val GL_LIGHT7: Int = 16391

val GL_SPOT_EXPONENT: Int = 4613

val GL_SPOT_CUTOFF: Int = 4614

val GL_CONSTANT_ATTENUATION: Int = 4615

val GL_LINEAR_ATTENUATION: Int = 4616

val GL_QUADRATIC_ATTENUATION: Int = 4617

val GL_AMBIENT: Int = 4608

val GL_DIFFUSE: Int = 4609

val GL_SPECULAR: Int = 4610

val GL_SHININESS: Int = 5633

val GL_EMISSION: Int = 5632

val GL_POSITION: Int = 4611

val GL_SPOT_DIRECTION: Int = 4612

val GL_AMBIENT_AND_DIFFUSE: Int = 5634

val GL_COLOR_INDEXES: Int = 5635

val GL_LIGHT_MODEL_TWO_SIDE: Int = 2898

val GL_LIGHT_MODEL_LOCAL_VIEWER: Int = 2897

val GL_LIGHT_MODEL_AMBIENT: Int = 2899

val GL_FRONT_AND_BACK: Int = 1032

val GL_SHADE_MODEL: Int = 2900

val GL_FLAT: Int = 7424

val GL_SMOOTH: Int = 7425

val GL_COLOR_MATERIAL: Int = 2903

val GL_COLOR_MATERIAL_FACE: Int = 2901

val GL_COLOR_MATERIAL_PARAMETER: Int = 2902

val GL_NORMALIZE: Int = 2977

val GL_CLIP_PLANE0: Int = 12288

val GL_CLIP_PLANE1: Int = 12289

val GL_CLIP_PLANE2: Int = 12290

val GL_CLIP_PLANE3: Int = 12291

val GL_CLIP_PLANE4: Int = 12292

val GL_CLIP_PLANE5: Int = 12293

val GL_ACCUM_RED_BITS: Int = 3416

val GL_ACCUM_GREEN_BITS: Int = 3417

val GL_ACCUM_BLUE_BITS: Int = 3418

val GL_ACCUM_ALPHA_BITS: Int = 3419

val GL_ACCUM_CLEAR_VALUE: Int = 2944

val GL_ACCUM: Int = 256

val GL_ADD: Int = 260

val GL_LOAD: Int = 257

val GL_MULT: Int = 259

val GL_RETURN: Int = 258

val GL_ALPHA_TEST: Int = 3008

val GL_ALPHA_TEST_REF: Int = 3010

val GL_ALPHA_TEST_FUNC: Int = 3009

val GL_BLEND: Int = 3042

val GL_BLEND_SRC: Int = 3041

val GL_BLEND_DST: Int = 3040

val GL_ZERO: Int = 0

val GL_ONE: Int = 1

val GL_SRC_COLOR: Int = 768

val GL_ONE_MINUS_SRC_COLOR: Int = 769

val GL_SRC_ALPHA: Int = 770

val GL_ONE_MINUS_SRC_ALPHA: Int = 771

val GL_DST_ALPHA: Int = 772

val GL_ONE_MINUS_DST_ALPHA: Int = 773

val GL_DST_COLOR: Int = 774

val GL_ONE_MINUS_DST_COLOR: Int = 775

val GL_SRC_ALPHA_SATURATE: Int = 776

val GL_FEEDBACK: Int = 7169

val GL_RENDER: Int = 7168

val GL_SELECT: Int = 7170

val GL_2D: Int = 1536

val GL_3D: Int = 1537

val GL_3D_COLOR: Int = 1538

val GL_3D_COLOR_TEXTURE: Int = 1539

val GL_4D_COLOR_TEXTURE: Int = 1540

val GL_POINT_TOKEN: Int = 1793

val GL_LINE_TOKEN: Int = 1794

val GL_LINE_RESET_TOKEN: Int = 1799

val GL_POLYGON_TOKEN: Int = 1795

val GL_BITMAP_TOKEN: Int = 1796

val GL_DRAW_PIXEL_TOKEN: Int = 1797

val GL_COPY_PIXEL_TOKEN: Int = 1798

val GL_PASS_THROUGH_TOKEN: Int = 1792

val GL_FEEDBACK_BUFFER_POINTER: Int = 3568

val GL_FEEDBACK_BUFFER_SIZE: Int = 3569

val GL_FEEDBACK_BUFFER_TYPE: Int = 3570

val GL_SELECTION_BUFFER_POINTER: Int = 3571

val GL_SELECTION_BUFFER_SIZE: Int = 3572

val GL_FOG: Int = 2912

val GL_FOG_MODE: Int = 2917

val GL_FOG_DENSITY: Int = 2914

val GL_FOG_COLOR: Int = 2918

val GL_FOG_INDEX: Int = 2913

val GL_FOG_START: Int = 2915

val GL_FOG_END: Int = 2916

val GL_LINEAR: Int = 9729

val GL_EXP: Int = 2048

val GL_EXP2: Int = 2049

val GL_LOGIC_OP: Int = 3057

val GL_INDEX_LOGIC_OP: Int = 3057

val GL_COLOR_LOGIC_OP: Int = 3058

val GL_LOGIC_OP_MODE: Int = 3056

val GL_CLEAR: Int = 5376

val GL_SET: Int = 5391

val GL_COPY: Int = 5379

val GL_COPY_INVERTED: Int = 5388

val GL_NOOP: Int = 5381

val GL_INVERT: Int = 5386

val GL_AND: Int = 5377

val GL_NAND: Int = 5390

val GL_OR: Int = 5383

val GL_NOR: Int = 5384

val GL_XOR: Int = 5382

val GL_EQUIV: Int = 5385

val GL_AND_REVERSE: Int = 5378

val GL_AND_INVERTED: Int = 5380

val GL_OR_REVERSE: Int = 5387

val GL_OR_INVERTED: Int = 5389

val GL_STENCIL_BITS: Int = 3415

val GL_STENCIL_TEST: Int = 2960

val GL_STENCIL_CLEAR_VALUE: Int = 2961

val GL_STENCIL_FUNC: Int = 2962

val GL_STENCIL_VALUE_MASK: Int = 2963

val GL_STENCIL_FAIL: Int = 2964

val GL_STENCIL_PASS_DEPTH_FAIL: Int = 2965

val GL_STENCIL_PASS_DEPTH_PASS: Int = 2966

val GL_STENCIL_REF: Int = 2967

val GL_STENCIL_WRITEMASK: Int = 2968

val GL_STENCIL_INDEX: Int = 6401

val GL_KEEP: Int = 7680

val GL_REPLACE: Int = 7681

val GL_INCR: Int = 7682

val GL_DECR: Int = 7683

val GL_NONE: Int = 0

val GL_LEFT: Int = 1030

val GL_RIGHT: Int = 1031

val GL_FRONT_LEFT: Int = 1024

val GL_FRONT_RIGHT: Int = 1025

val GL_BACK_LEFT: Int = 1026

val GL_BACK_RIGHT: Int = 1027

val GL_AUX0: Int = 1033

val GL_AUX1: Int = 1034

val GL_AUX2: Int = 1035

val GL_AUX3: Int = 1036

val GL_COLOR_INDEX: Int = 6400

val GL_RED: Int = 6403

val GL_GREEN: Int = 6404

val GL_BLUE: Int = 6405

val GL_ALPHA: Int = 6406

val GL_LUMINANCE: Int = 6409

val GL_LUMINANCE_ALPHA: Int = 6410

val GL_ALPHA_BITS: Int = 3413

val GL_RED_BITS: Int = 3410

val GL_GREEN_BITS: Int = 3411

val GL_BLUE_BITS: Int = 3412

val GL_INDEX_BITS: Int = 3409

val GL_SUBPIXEL_BITS: Int = 3408

val GL_AUX_BUFFERS: Int = 3072

val GL_READ_BUFFER: Int = 3074

val GL_DRAW_BUFFER: Int = 3073

val GL_DOUBLEBUFFER: Int = 3122

val GL_STEREO: Int = 3123

val GL_BITMAP: Int = 6656

val GL_COLOR: Int = 6144

val GL_DEPTH: Int = 6145

val GL_STENCIL: Int = 6146

val GL_DITHER: Int = 3024

val GL_RGB: Int = 6407

val GL_RGBA: Int = 6408

val GL_MAX_LIST_NESTING: Int = 2865

val GL_MAX_EVAL_ORDER: Int = 3376

val GL_MAX_LIGHTS: Int = 3377

val GL_MAX_CLIP_PLANES: Int = 3378

val GL_MAX_TEXTURE_SIZE: Int = 3379

val GL_MAX_PIXEL_MAP_TABLE: Int = 3380

val GL_MAX_ATTRIB_STACK_DEPTH: Int = 3381

val GL_MAX_MODELVIEW_STACK_DEPTH: Int = 3382

val GL_MAX_NAME_STACK_DEPTH: Int = 3383

val GL_MAX_PROJECTION_STACK_DEPTH: Int = 3384

val GL_MAX_TEXTURE_STACK_DEPTH: Int = 3385

val GL_MAX_VIEWPORT_DIMS: Int = 3386

val GL_MAX_CLIENT_ATTRIB_STACK_DEPTH: Int = 3387

val GL_ATTRIB_STACK_DEPTH: Int = 2992

val GL_CLIENT_ATTRIB_STACK_DEPTH: Int = 2993

val GL_COLOR_CLEAR_VALUE: Int = 3106

val GL_COLOR_WRITEMASK: Int = 3107

val GL_CURRENT_INDEX: Int = 2817

val GL_CURRENT_COLOR: Int = 2816

val GL_CURRENT_NORMAL: Int = 2818

val GL_CURRENT_RASTER_COLOR: Int = 2820

val GL_CURRENT_RASTER_DISTANCE: Int = 2825

val GL_CURRENT_RASTER_INDEX: Int = 2821

val GL_CURRENT_RASTER_POSITION: Int = 2823

val GL_CURRENT_RASTER_TEXTURE_COORDS: Int = 2822

val GL_CURRENT_RASTER_POSITION_VALID: Int = 2824

val GL_CURRENT_TEXTURE_COORDS: Int = 2819

val GL_INDEX_CLEAR_VALUE: Int = 3104

val GL_INDEX_MODE: Int = 3120

val GL_INDEX_WRITEMASK: Int = 3105

val GL_MODELVIEW_MATRIX: Int = 2982

val GL_MODELVIEW_STACK_DEPTH: Int = 2979

val GL_NAME_STACK_DEPTH: Int = 3440

val GL_PROJECTION_MATRIX: Int = 2983

val GL_PROJECTION_STACK_DEPTH: Int = 2980

val GL_RENDER_MODE: Int = 3136

val GL_RGBA_MODE: Int = 3121

val GL_TEXTURE_MATRIX: Int = 2984

val GL_TEXTURE_STACK_DEPTH: Int = 2981

val GL_VIEWPORT: Int = 2978

val GL_AUTO_NORMAL: Int = 3456

val GL_MAP1_COLOR_4: Int = 3472

val GL_MAP1_INDEX: Int = 3473

val GL_MAP1_NORMAL: Int = 3474

val GL_MAP1_TEXTURE_COORD_1: Int = 3475

val GL_MAP1_TEXTURE_COORD_2: Int = 3476

val GL_MAP1_TEXTURE_COORD_3: Int = 3477

val GL_MAP1_TEXTURE_COORD_4: Int = 3478

val GL_MAP1_VERTEX_3: Int = 3479

val GL_MAP1_VERTEX_4: Int = 3480

val GL_MAP2_COLOR_4: Int = 3504

val GL_MAP2_INDEX: Int = 3505

val GL_MAP2_NORMAL: Int = 3506

val GL_MAP2_TEXTURE_COORD_1: Int = 3507

val GL_MAP2_TEXTURE_COORD_2: Int = 3508

val GL_MAP2_TEXTURE_COORD_3: Int = 3509

val GL_MAP2_TEXTURE_COORD_4: Int = 3510

val GL_MAP2_VERTEX_3: Int = 3511

val GL_MAP2_VERTEX_4: Int = 3512

val GL_MAP1_GRID_DOMAIN: Int = 3536

val GL_MAP1_GRID_SEGMENTS: Int = 3537

val GL_MAP2_GRID_DOMAIN: Int = 3538

val GL_MAP2_GRID_SEGMENTS: Int = 3539

val GL_COEFF: Int = 2560

val GL_ORDER: Int = 2561

val GL_DOMAIN: Int = 2562

val GL_PERSPECTIVE_CORRECTION_HINT: Int = 3152

val GL_POINT_SMOOTH_HINT: Int = 3153

val GL_LINE_SMOOTH_HINT: Int = 3154

val GL_POLYGON_SMOOTH_HINT: Int = 3155

val GL_FOG_HINT: Int = 3156

val GL_DONT_CARE: Int = 4352

val GL_FASTEST: Int = 4353

val GL_NICEST: Int = 4354

val GL_SCISSOR_BOX: Int = 3088

val GL_SCISSOR_TEST: Int = 3089

val GL_MAP_COLOR: Int = 3344

val GL_MAP_STENCIL: Int = 3345

val GL_INDEX_SHIFT: Int = 3346

val GL_INDEX_OFFSET: Int = 3347

val GL_RED_SCALE: Int = 3348

val GL_RED_BIAS: Int = 3349

val GL_GREEN_SCALE: Int = 3352

val GL_GREEN_BIAS: Int = 3353

val GL_BLUE_SCALE: Int = 3354

val GL_BLUE_BIAS: Int = 3355

val GL_ALPHA_SCALE: Int = 3356

val GL_ALPHA_BIAS: Int = 3357

val GL_DEPTH_SCALE: Int = 3358

val GL_DEPTH_BIAS: Int = 3359

val GL_PIXEL_MAP_S_TO_S_SIZE: Int = 3249

val GL_PIXEL_MAP_I_TO_I_SIZE: Int = 3248

val GL_PIXEL_MAP_I_TO_R_SIZE: Int = 3250

val GL_PIXEL_MAP_I_TO_G_SIZE: Int = 3251

val GL_PIXEL_MAP_I_TO_B_SIZE: Int = 3252

val GL_PIXEL_MAP_I_TO_A_SIZE: Int = 3253

val GL_PIXEL_MAP_R_TO_R_SIZE: Int = 3254

val GL_PIXEL_MAP_G_TO_G_SIZE: Int = 3255

val GL_PIXEL_MAP_B_TO_B_SIZE: Int = 3256

val GL_PIXEL_MAP_A_TO_A_SIZE: Int = 3257

val GL_PIXEL_MAP_S_TO_S: Int = 3185

val GL_PIXEL_MAP_I_TO_I: Int = 3184

val GL_PIXEL_MAP_I_TO_R: Int = 3186

val GL_PIXEL_MAP_I_TO_G: Int = 3187

val GL_PIXEL_MAP_I_TO_B: Int = 3188

val GL_PIXEL_MAP_I_TO_A: Int = 3189

val GL_PIXEL_MAP_R_TO_R: Int = 3190

val GL_PIXEL_MAP_G_TO_G: Int = 3191

val GL_PIXEL_MAP_B_TO_B: Int = 3192

val GL_PIXEL_MAP_A_TO_A: Int = 3193

val GL_PACK_ALIGNMENT: Int = 3333

val GL_PACK_LSB_FIRST: Int = 3329

val GL_PACK_ROW_LENGTH: Int = 3330

val GL_PACK_SKIP_PIXELS: Int = 3332

val GL_PACK_SKIP_ROWS: Int = 3331

val GL_PACK_SWAP_BYTES: Int = 3328

val GL_UNPACK_ALIGNMENT: Int = 3317

val GL_UNPACK_LSB_FIRST: Int = 3313

val GL_UNPACK_ROW_LENGTH: Int = 3314

val GL_UNPACK_SKIP_PIXELS: Int = 3316

val GL_UNPACK_SKIP_ROWS: Int = 3315

val GL_UNPACK_SWAP_BYTES: Int = 3312

val GL_ZOOM_X: Int = 3350

val GL_ZOOM_Y: Int = 3351

val GL_TEXTURE_ENV: Int = 8960

val GL_TEXTURE_ENV_MODE: Int = 8704

val GL_TEXTURE_1D: Int = 3552

val GL_TEXTURE_2D: Int = 3553

val GL_TEXTURE_WRAP_S: Int = 10242

val GL_TEXTURE_WRAP_T: Int = 10243

val GL_TEXTURE_MAG_FILTER: Int = 10240

val GL_TEXTURE_MIN_FILTER: Int = 10241

val GL_TEXTURE_ENV_COLOR: Int = 8705

val GL_TEXTURE_GEN_S: Int = 3168

val GL_TEXTURE_GEN_T: Int = 3169

val GL_TEXTURE_GEN_R: Int = 3170

val GL_TEXTURE_GEN_Q: Int = 3171

val GL_TEXTURE_GEN_MODE: Int = 9472

val GL_TEXTURE_BORDER_COLOR: Int = 4100

val GL_TEXTURE_WIDTH: Int = 4096

val GL_TEXTURE_HEIGHT: Int = 4097

val GL_TEXTURE_BORDER: Int = 4101

val GL_TEXTURE_COMPONENTS: Int = 4099

val GL_TEXTURE_RED_SIZE: Int = 32860

val GL_TEXTURE_GREEN_SIZE: Int = 32861

val GL_TEXTURE_BLUE_SIZE: Int = 32862

val GL_TEXTURE_ALPHA_SIZE: Int = 32863

val GL_TEXTURE_LUMINANCE_SIZE: Int = 32864

val GL_TEXTURE_INTENSITY_SIZE: Int = 32865

val GL_NEAREST_MIPMAP_NEAREST: Int = 9984

val GL_NEAREST_MIPMAP_LINEAR: Int = 9986

val GL_LINEAR_MIPMAP_NEAREST: Int = 9985

val GL_LINEAR_MIPMAP_LINEAR: Int = 9987

val GL_OBJECT_LINEAR: Int = 9217

val GL_OBJECT_PLANE: Int = 9473

val GL_EYE_LINEAR: Int = 9216

val GL_EYE_PLANE: Int = 9474

val GL_SPHERE_MAP: Int = 9218

val GL_DECAL: Int = 8449

val GL_MODULATE: Int = 8448

val GL_NEAREST: Int = 9728

val GL_REPEAT: Int = 10497

val GL_CLAMP: Int = 10496

val GL_S: Int = 8192

val GL_T: Int = 8193

val GL_R: Int = 8194

val GL_Q: Int = 8195

val GL_VENDOR: Int = 7936

val GL_RENDERER: Int = 7937

val GL_VERSION: Int = 7938

val GL_EXTENSIONS: Int = 7939

val GL_NO_ERROR: Int = 0

val GL_INVALID_ENUM: Int = 1280

val GL_INVALID_VALUE: Int = 1281

val GL_INVALID_OPERATION: Int = 1282

val GL_STACK_OVERFLOW: Int = 1283

val GL_STACK_UNDERFLOW: Int = 1284

val GL_OUT_OF_MEMORY: Int = 1285

val GL_CURRENT_BIT: Int = 1

val GL_POINT_BIT: Int = 2

val GL_LINE_BIT: Int = 4

val GL_POLYGON_BIT: Int = 8

val GL_POLYGON_STIPPLE_BIT: Int = 16

val GL_PIXEL_MODE_BIT: Int = 32

val GL_LIGHTING_BIT: Int = 64

val GL_FOG_BIT: Int = 128

val GL_DEPTH_BUFFER_BIT: Int = 256

val GL_ACCUM_BUFFER_BIT: Int = 512

val GL_STENCIL_BUFFER_BIT: Int = 1024

val GL_VIEWPORT_BIT: Int = 2048

val GL_TRANSFORM_BIT: Int = 4096

val GL_ENABLE_BIT: Int = 8192

val GL_COLOR_BUFFER_BIT: Int = 16384

val GL_HINT_BIT: Int = 32768

val GL_EVAL_BIT: Int = 65536

val GL_LIST_BIT: Int = 131072

val GL_TEXTURE_BIT: Int = 262144

val GL_SCISSOR_BIT: Int = 524288

val GL_ALL_ATTRIB_BITS: Int = -1

val GL_PROXY_TEXTURE_1D: Int = 32867

val GL_PROXY_TEXTURE_2D: Int = 32868

val GL_TEXTURE_PRIORITY: Int = 32870

val GL_TEXTURE_RESIDENT: Int = 32871

val GL_TEXTURE_BINDING_1D: Int = 32872

val GL_TEXTURE_BINDING_2D: Int = 32873

val GL_TEXTURE_INTERNAL_FORMAT: Int = 4099

val GL_ALPHA4: Int = 32827

val GL_ALPHA8: Int = 32828

val GL_ALPHA12: Int = 32829

val GL_ALPHA16: Int = 32830

val GL_LUMINANCE4: Int = 32831

val GL_LUMINANCE8: Int = 32832

val GL_LUMINANCE12: Int = 32833

val GL_LUMINANCE16: Int = 32834

val GL_LUMINANCE4_ALPHA4: Int = 32835

val GL_LUMINANCE6_ALPHA2: Int = 32836

val GL_LUMINANCE8_ALPHA8: Int = 32837

val GL_LUMINANCE12_ALPHA4: Int = 32838

val GL_LUMINANCE12_ALPHA12: Int = 32839

val GL_LUMINANCE16_ALPHA16: Int = 32840

val GL_INTENSITY: Int = 32841

val GL_INTENSITY4: Int = 32842

val GL_INTENSITY8: Int = 32843

val GL_INTENSITY12: Int = 32844

val GL_INTENSITY16: Int = 32845

val GL_R3_G3_B2: Int = 10768

val GL_RGB4: Int = 32847

val GL_RGB5: Int = 32848

val GL_RGB8: Int = 32849

val GL_RGB10: Int = 32850

val GL_RGB12: Int = 32851

val GL_RGB16: Int = 32852

val GL_RGBA2: Int = 32853

val GL_RGBA4: Int = 32854

val GL_RGB5_A1: Int = 32855

val GL_RGBA8: Int = 32856

val GL_RGB10_A2: Int = 32857

val GL_RGBA12: Int = 32858

val GL_RGBA16: Int = 32859

val GL_CLIENT_PIXEL_STORE_BIT: Int = 1

val GL_CLIENT_VERTEX_ARRAY_BIT: Int = 2

val GL_ALL_CLIENT_ATTRIB_BITS: Int = -1

val GL_CLIENT_ALL_ATTRIB_BITS: Int = -1

val GL_RESCALE_NORMAL: Int = 32826

val GL_CLAMP_TO_EDGE: Int = 33071

val GL_MAX_ELEMENTS_VERTICES: Int = 33000

val GL_MAX_ELEMENTS_INDICES: Int = 33001

val GL_BGR: Int = 32992

val GL_BGRA: Int = 32993

val GL_UNSIGNED_BYTE_3_3_2: Int = 32818

val GL_UNSIGNED_BYTE_2_3_3_REV: Int = 33634

val GL_UNSIGNED_SHORT_5_6_5: Int = 33635

val GL_UNSIGNED_SHORT_5_6_5_REV: Int = 33636

val GL_UNSIGNED_SHORT_4_4_4_4: Int = 32819

val GL_UNSIGNED_SHORT_4_4_4_4_REV: Int = 33637

val GL_UNSIGNED_SHORT_5_5_5_1: Int = 32820

val GL_UNSIGNED_SHORT_1_5_5_5_REV: Int = 33638

val GL_UNSIGNED_INT_8_8_8_8: Int = 32821

val GL_UNSIGNED_INT_8_8_8_8_REV: Int = 33639

val GL_UNSIGNED_INT_10_10_10_2: Int = 32822

val GL_UNSIGNED_INT_2_10_10_10_REV: Int = 33640

val GL_LIGHT_MODEL_COLOR_CONTROL: Int = 33272

val GL_SINGLE_COLOR: Int = 33273

val GL_SEPARATE_SPECULAR_COLOR: Int = 33274

val GL_TEXTURE_MIN_LOD: Int = 33082

val GL_TEXTURE_MAX_LOD: Int = 33083

val GL_TEXTURE_BASE_LEVEL: Int = 33084

val GL_TEXTURE_MAX_LEVEL: Int = 33085

val GL_SMOOTH_POINT_SIZE_RANGE: Int = 2834

val GL_SMOOTH_POINT_SIZE_GRANULARITY: Int = 2835

val GL_SMOOTH_LINE_WIDTH_RANGE: Int = 2850

val GL_SMOOTH_LINE_WIDTH_GRANULARITY: Int = 2851

val GL_ALIASED_POINT_SIZE_RANGE: Int = 33901

val GL_ALIASED_LINE_WIDTH_RANGE: Int = 33902

val GL_PACK_SKIP_IMAGES: Int = 32875

val GL_PACK_IMAGE_HEIGHT: Int = 32876

val GL_UNPACK_SKIP_IMAGES: Int = 32877

val GL_UNPACK_IMAGE_HEIGHT: Int = 32878

val GL_TEXTURE_3D: Int = 32879

val GL_PROXY_TEXTURE_3D: Int = 32880

val GL_TEXTURE_DEPTH: Int = 32881

val GL_TEXTURE_WRAP_R: Int = 32882

val GL_MAX_3D_TEXTURE_SIZE: Int = 32883

val GL_TEXTURE_BINDING_3D: Int = 32874

val GL_CONSTANT_COLOR: Int = 32769

val GL_ONE_MINUS_CONSTANT_COLOR: Int = 32770

val GL_CONSTANT_ALPHA: Int = 32771

val GL_ONE_MINUS_CONSTANT_ALPHA: Int = 32772

val GL_COLOR_TABLE: Int = 32976

val GL_POST_CONVOLUTION_COLOR_TABLE: Int = 32977

val GL_POST_COLOR_MATRIX_COLOR_TABLE: Int = 32978

val GL_PROXY_COLOR_TABLE: Int = 32979

val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE: Int = 32980

val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE: Int = 32981

val GL_COLOR_TABLE_SCALE: Int = 32982

val GL_COLOR_TABLE_BIAS: Int = 32983

val GL_COLOR_TABLE_FORMAT: Int = 32984

val GL_COLOR_TABLE_WIDTH: Int = 32985

val GL_COLOR_TABLE_RED_SIZE: Int = 32986

val GL_COLOR_TABLE_GREEN_SIZE: Int = 32987

val GL_COLOR_TABLE_BLUE_SIZE: Int = 32988

val GL_COLOR_TABLE_ALPHA_SIZE: Int = 32989

val GL_COLOR_TABLE_LUMINANCE_SIZE: Int = 32990

val GL_COLOR_TABLE_INTENSITY_SIZE: Int = 32991

val GL_CONVOLUTION_1D: Int = 32784

val GL_CONVOLUTION_2D: Int = 32785

val GL_SEPARABLE_2D: Int = 32786

val GL_CONVOLUTION_BORDER_MODE: Int = 32787

val GL_CONVOLUTION_FILTER_SCALE: Int = 32788

val GL_CONVOLUTION_FILTER_BIAS: Int = 32789

val GL_REDUCE: Int = 32790

val GL_CONVOLUTION_FORMAT: Int = 32791

val GL_CONVOLUTION_WIDTH: Int = 32792

val GL_CONVOLUTION_HEIGHT: Int = 32793

val GL_MAX_CONVOLUTION_WIDTH: Int = 32794

val GL_MAX_CONVOLUTION_HEIGHT: Int = 32795

val GL_POST_CONVOLUTION_RED_SCALE: Int = 32796

val GL_POST_CONVOLUTION_GREEN_SCALE: Int = 32797

val GL_POST_CONVOLUTION_BLUE_SCALE: Int = 32798

val GL_POST_CONVOLUTION_ALPHA_SCALE: Int = 32799

val GL_POST_CONVOLUTION_RED_BIAS: Int = 32800

val GL_POST_CONVOLUTION_GREEN_BIAS: Int = 32801

val GL_POST_CONVOLUTION_BLUE_BIAS: Int = 32802

val GL_POST_CONVOLUTION_ALPHA_BIAS: Int = 32803

val GL_CONSTANT_BORDER: Int = 33105

val GL_REPLICATE_BORDER: Int = 33107

val GL_CONVOLUTION_BORDER_COLOR: Int = 33108

val GL_COLOR_MATRIX: Int = 32945

val GL_COLOR_MATRIX_STACK_DEPTH: Int = 32946

val GL_MAX_COLOR_MATRIX_STACK_DEPTH: Int = 32947

val GL_POST_COLOR_MATRIX_RED_SCALE: Int = 32948

val GL_POST_COLOR_MATRIX_GREEN_SCALE: Int = 32949

val GL_POST_COLOR_MATRIX_BLUE_SCALE: Int = 32950

val GL_POST_COLOR_MATRIX_ALPHA_SCALE: Int = 32951

val GL_POST_COLOR_MATRIX_RED_BIAS: Int = 32952

val GL_POST_COLOR_MATRIX_GREEN_BIAS: Int = 32953

val GL_POST_COLOR_MATRIX_BLUE_BIAS: Int = 32954

val GL_POST_COLOR_MATRIX_ALPHA_BIAS: Int = 32955

val GL_HISTOGRAM: Int = 32804

val GL_PROXY_HISTOGRAM: Int = 32805

val GL_HISTOGRAM_WIDTH: Int = 32806

val GL_HISTOGRAM_FORMAT: Int = 32807

val GL_HISTOGRAM_RED_SIZE: Int = 32808

val GL_HISTOGRAM_GREEN_SIZE: Int = 32809

val GL_HISTOGRAM_BLUE_SIZE: Int = 32810

val GL_HISTOGRAM_ALPHA_SIZE: Int = 32811

val GL_HISTOGRAM_LUMINANCE_SIZE: Int = 32812

val GL_HISTOGRAM_SINK: Int = 32813

val GL_MINMAX: Int = 32814

val GL_MINMAX_FORMAT: Int = 32815

val GL_MINMAX_SINK: Int = 32816

val GL_TABLE_TOO_LARGE: Int = 32817

val GL_BLEND_EQUATION: Int = 32777

val GL_MIN: Int = 32775

val GL_MAX: Int = 32776

val GL_FUNC_ADD: Int = 32774

val GL_FUNC_SUBTRACT: Int = 32778

val GL_FUNC_REVERSE_SUBTRACT: Int = 32779

val GL_BLEND_COLOR: Int = 32773

val GL_TEXTURE0: Int = 33984

val GL_TEXTURE1: Int = 33985

val GL_TEXTURE2: Int = 33986

val GL_TEXTURE3: Int = 33987

val GL_TEXTURE4: Int = 33988

val GL_TEXTURE5: Int = 33989

val GL_TEXTURE6: Int = 33990

val GL_TEXTURE7: Int = 33991

val GL_TEXTURE8: Int = 33992

val GL_TEXTURE9: Int = 33993

val GL_TEXTURE10: Int = 33994

val GL_TEXTURE11: Int = 33995

val GL_TEXTURE12: Int = 33996

val GL_TEXTURE13: Int = 33997

val GL_TEXTURE14: Int = 33998

val GL_TEXTURE15: Int = 33999

val GL_TEXTURE16: Int = 34000

val GL_TEXTURE17: Int = 34001

val GL_TEXTURE18: Int = 34002

val GL_TEXTURE19: Int = 34003

val GL_TEXTURE20: Int = 34004

val GL_TEXTURE21: Int = 34005

val GL_TEXTURE22: Int = 34006

val GL_TEXTURE23: Int = 34007

val GL_TEXTURE24: Int = 34008

val GL_TEXTURE25: Int = 34009

val GL_TEXTURE26: Int = 34010

val GL_TEXTURE27: Int = 34011

val GL_TEXTURE28: Int = 34012

val GL_TEXTURE29: Int = 34013

val GL_TEXTURE30: Int = 34014

val GL_TEXTURE31: Int = 34015

val GL_ACTIVE_TEXTURE: Int = 34016

val GL_CLIENT_ACTIVE_TEXTURE: Int = 34017

val GL_MAX_TEXTURE_UNITS: Int = 34018

val GL_NORMAL_MAP: Int = 34065

val GL_REFLECTION_MAP: Int = 34066

val GL_TEXTURE_CUBE_MAP: Int = 34067

val GL_TEXTURE_BINDING_CUBE_MAP: Int = 34068

val GL_TEXTURE_CUBE_MAP_POSITIVE_X: Int = 34069

val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: Int = 34070

val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: Int = 34071

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = 34072

val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: Int = 34073

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = 34074

val GL_PROXY_TEXTURE_CUBE_MAP: Int = 34075

val GL_MAX_CUBE_MAP_TEXTURE_SIZE: Int = 34076

val GL_COMPRESSED_ALPHA: Int = 34025

val GL_COMPRESSED_LUMINANCE: Int = 34026

val GL_COMPRESSED_LUMINANCE_ALPHA: Int = 34027

val GL_COMPRESSED_INTENSITY: Int = 34028

val GL_COMPRESSED_RGB: Int = 34029

val GL_COMPRESSED_RGBA: Int = 34030

val GL_TEXTURE_COMPRESSION_HINT: Int = 34031

val GL_TEXTURE_COMPRESSED_IMAGE_SIZE: Int = 34464

val GL_TEXTURE_COMPRESSED: Int = 34465

val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 34466

val GL_COMPRESSED_TEXTURE_FORMATS: Int = 34467

val GL_MULTISAMPLE: Int = 32925

val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 32926

val GL_SAMPLE_ALPHA_TO_ONE: Int = 32927

val GL_SAMPLE_COVERAGE: Int = 32928

val GL_SAMPLE_BUFFERS: Int = 32936

val GL_SAMPLES: Int = 32937

val GL_SAMPLE_COVERAGE_VALUE: Int = 32938

val GL_SAMPLE_COVERAGE_INVERT: Int = 32939

val GL_MULTISAMPLE_BIT: Int = 536870912

val GL_TRANSPOSE_MODELVIEW_MATRIX: Int = 34019

val GL_TRANSPOSE_PROJECTION_MATRIX: Int = 34020

val GL_TRANSPOSE_TEXTURE_MATRIX: Int = 34021

val GL_TRANSPOSE_COLOR_MATRIX: Int = 34022

val GL_COMBINE: Int = 34160

val GL_COMBINE_RGB: Int = 34161

val GL_COMBINE_ALPHA: Int = 34162

val GL_SOURCE0_RGB: Int = 34176

val GL_SOURCE1_RGB: Int = 34177

val GL_SOURCE2_RGB: Int = 34178

val GL_SOURCE0_ALPHA: Int = 34184

val GL_SOURCE1_ALPHA: Int = 34185

val GL_SOURCE2_ALPHA: Int = 34186

val GL_OPERAND0_RGB: Int = 34192

val GL_OPERAND1_RGB: Int = 34193

val GL_OPERAND2_RGB: Int = 34194

val GL_OPERAND0_ALPHA: Int = 34200

val GL_OPERAND1_ALPHA: Int = 34201

val GL_OPERAND2_ALPHA: Int = 34202

val GL_RGB_SCALE: Int = 34163

val GL_ADD_SIGNED: Int = 34164

val GL_INTERPOLATE: Int = 34165

val GL_SUBTRACT: Int = 34023

val GL_CONSTANT: Int = 34166

val GL_PRIMARY_COLOR: Int = 34167

val GL_PREVIOUS: Int = 34168

val GL_DOT3_RGB: Int = 34478

val GL_DOT3_RGBA: Int = 34479

val GL_CLAMP_TO_BORDER: Int = 33069

val GL_ARB_multitexture: Int = 1

val GL_TEXTURE0_ARB: Int = 33984

val GL_TEXTURE1_ARB: Int = 33985

val GL_TEXTURE2_ARB: Int = 33986

val GL_TEXTURE3_ARB: Int = 33987

val GL_TEXTURE4_ARB: Int = 33988

val GL_TEXTURE5_ARB: Int = 33989

val GL_TEXTURE6_ARB: Int = 33990

val GL_TEXTURE7_ARB: Int = 33991

val GL_TEXTURE8_ARB: Int = 33992

val GL_TEXTURE9_ARB: Int = 33993

val GL_TEXTURE10_ARB: Int = 33994

val GL_TEXTURE11_ARB: Int = 33995

val GL_TEXTURE12_ARB: Int = 33996

val GL_TEXTURE13_ARB: Int = 33997

val GL_TEXTURE14_ARB: Int = 33998

val GL_TEXTURE15_ARB: Int = 33999

val GL_TEXTURE16_ARB: Int = 34000

val GL_TEXTURE17_ARB: Int = 34001

val GL_TEXTURE18_ARB: Int = 34002

val GL_TEXTURE19_ARB: Int = 34003

val GL_TEXTURE20_ARB: Int = 34004

val GL_TEXTURE21_ARB: Int = 34005

val GL_TEXTURE22_ARB: Int = 34006

val GL_TEXTURE23_ARB: Int = 34007

val GL_TEXTURE24_ARB: Int = 34008

val GL_TEXTURE25_ARB: Int = 34009

val GL_TEXTURE26_ARB: Int = 34010

val GL_TEXTURE27_ARB: Int = 34011

val GL_TEXTURE28_ARB: Int = 34012

val GL_TEXTURE29_ARB: Int = 34013

val GL_TEXTURE30_ARB: Int = 34014

val GL_TEXTURE31_ARB: Int = 34015

val GL_ACTIVE_TEXTURE_ARB: Int = 34016

val GL_CLIENT_ACTIVE_TEXTURE_ARB: Int = 34017

val GL_MAX_TEXTURE_UNITS_ARB: Int = 34018

val __glext_h_: Int = 1

val GL_GLEXT_VERSION: Int = 20160609

val GL_VERSION_1_4: Int = 1

val GL_BLEND_DST_RGB: Int = 32968

val GL_BLEND_SRC_RGB: Int = 32969

val GL_BLEND_DST_ALPHA: Int = 32970

val GL_BLEND_SRC_ALPHA: Int = 32971

val GL_POINT_FADE_THRESHOLD_SIZE: Int = 33064

val GL_DEPTH_COMPONENT16: Int = 33189

val GL_DEPTH_COMPONENT24: Int = 33190

val GL_DEPTH_COMPONENT32: Int = 33191

val GL_MIRRORED_REPEAT: Int = 33648

val GL_MAX_TEXTURE_LOD_BIAS: Int = 34045

val GL_TEXTURE_LOD_BIAS: Int = 34049

val GL_INCR_WRAP: Int = 34055

val GL_DECR_WRAP: Int = 34056

val GL_TEXTURE_DEPTH_SIZE: Int = 34890

val GL_TEXTURE_COMPARE_MODE: Int = 34892

val GL_TEXTURE_COMPARE_FUNC: Int = 34893

val GL_POINT_SIZE_MIN: Int = 33062

val GL_POINT_SIZE_MAX: Int = 33063

val GL_POINT_DISTANCE_ATTENUATION: Int = 33065

val GL_GENERATE_MIPMAP: Int = 33169

val GL_GENERATE_MIPMAP_HINT: Int = 33170

val GL_FOG_COORDINATE_SOURCE: Int = 33872

val GL_FOG_COORDINATE: Int = 33873

val GL_FRAGMENT_DEPTH: Int = 33874

val GL_CURRENT_FOG_COORDINATE: Int = 33875

val GL_FOG_COORDINATE_ARRAY_TYPE: Int = 33876

val GL_FOG_COORDINATE_ARRAY_STRIDE: Int = 33877

val GL_FOG_COORDINATE_ARRAY_POINTER: Int = 33878

val GL_FOG_COORDINATE_ARRAY: Int = 33879

val GL_COLOR_SUM: Int = 33880

val GL_CURRENT_SECONDARY_COLOR: Int = 33881

val GL_SECONDARY_COLOR_ARRAY_SIZE: Int = 33882

val GL_SECONDARY_COLOR_ARRAY_TYPE: Int = 33883

val GL_SECONDARY_COLOR_ARRAY_STRIDE: Int = 33884

val GL_SECONDARY_COLOR_ARRAY_POINTER: Int = 33885

val GL_SECONDARY_COLOR_ARRAY: Int = 33886

val GL_TEXTURE_FILTER_CONTROL: Int = 34048

val GL_DEPTH_TEXTURE_MODE: Int = 34891

val GL_COMPARE_R_TO_TEXTURE: Int = 34894

val GL_VERSION_1_5: Int = 1

val GL_BUFFER_SIZE: Int = 34660

val GL_BUFFER_USAGE: Int = 34661

val GL_QUERY_COUNTER_BITS: Int = 34916

val GL_CURRENT_QUERY: Int = 34917

val GL_QUERY_RESULT: Int = 34918

val GL_QUERY_RESULT_AVAILABLE: Int = 34919

val GL_ARRAY_BUFFER: Int = 34962

val GL_ELEMENT_ARRAY_BUFFER: Int = 34963

val GL_ARRAY_BUFFER_BINDING: Int = 34964

val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 34965

val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = 34975

val GL_READ_ONLY: Int = 35000

val GL_WRITE_ONLY: Int = 35001

val GL_READ_WRITE: Int = 35002

val GL_BUFFER_ACCESS: Int = 35003

val GL_BUFFER_MAPPED: Int = 35004

val GL_BUFFER_MAP_POINTER: Int = 35005

val GL_STREAM_DRAW: Int = 35040

val GL_STREAM_READ: Int = 35041

val GL_STREAM_COPY: Int = 35042

val GL_STATIC_DRAW: Int = 35044

val GL_STATIC_READ: Int = 35045

val GL_STATIC_COPY: Int = 35046

val GL_DYNAMIC_DRAW: Int = 35048

val GL_DYNAMIC_READ: Int = 35049

val GL_DYNAMIC_COPY: Int = 35050

val GL_SAMPLES_PASSED: Int = 35092

val GL_SRC1_ALPHA: Int = 34185

val GL_VERTEX_ARRAY_BUFFER_BINDING: Int = 34966

val GL_NORMAL_ARRAY_BUFFER_BINDING: Int = 34967

val GL_COLOR_ARRAY_BUFFER_BINDING: Int = 34968

val GL_INDEX_ARRAY_BUFFER_BINDING: Int = 34969

val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING: Int = 34970

val GL_EDGE_FLAG_ARRAY_BUFFER_BINDING: Int = 34971

val GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING: Int = 34972

val GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING: Int = 34973

val GL_WEIGHT_ARRAY_BUFFER_BINDING: Int = 34974

val GL_FOG_COORD_SRC: Int = 33872

val GL_FOG_COORD: Int = 33873

val GL_CURRENT_FOG_COORD: Int = 33875

val GL_FOG_COORD_ARRAY_TYPE: Int = 33876

val GL_FOG_COORD_ARRAY_STRIDE: Int = 33877

val GL_FOG_COORD_ARRAY_POINTER: Int = 33878

val GL_FOG_COORD_ARRAY: Int = 33879

val GL_FOG_COORD_ARRAY_BUFFER_BINDING: Int = 34973

val GL_SRC0_RGB: Int = 34176

val GL_SRC1_RGB: Int = 34177

val GL_SRC2_RGB: Int = 34178

val GL_SRC0_ALPHA: Int = 34184

val GL_SRC2_ALPHA: Int = 34186

val GL_VERSION_2_0: Int = 1

val GL_BLEND_EQUATION_RGB: Int = 32777

val GL_VERTEX_ATTRIB_ARRAY_ENABLED: Int = 34338

val GL_VERTEX_ATTRIB_ARRAY_SIZE: Int = 34339

val GL_VERTEX_ATTRIB_ARRAY_STRIDE: Int = 34340

val GL_VERTEX_ATTRIB_ARRAY_TYPE: Int = 34341

val GL_CURRENT_VERTEX_ATTRIB: Int = 34342

val GL_VERTEX_PROGRAM_POINT_SIZE: Int = 34370

val GL_VERTEX_ATTRIB_ARRAY_POINTER: Int = 34373

val GL_STENCIL_BACK_FUNC: Int = 34816

val GL_STENCIL_BACK_FAIL: Int = 34817

val GL_STENCIL_BACK_PASS_DEPTH_FAIL: Int = 34818

val GL_STENCIL_BACK_PASS_DEPTH_PASS: Int = 34819

val GL_MAX_DRAW_BUFFERS: Int = 34852

val GL_DRAW_BUFFER0: Int = 34853

val GL_DRAW_BUFFER1: Int = 34854

val GL_DRAW_BUFFER2: Int = 34855

val GL_DRAW_BUFFER3: Int = 34856

val GL_DRAW_BUFFER4: Int = 34857

val GL_DRAW_BUFFER5: Int = 34858

val GL_DRAW_BUFFER6: Int = 34859

val GL_DRAW_BUFFER7: Int = 34860

val GL_DRAW_BUFFER8: Int = 34861

val GL_DRAW_BUFFER9: Int = 34862

val GL_DRAW_BUFFER10: Int = 34863

val GL_DRAW_BUFFER11: Int = 34864

val GL_DRAW_BUFFER12: Int = 34865

val GL_DRAW_BUFFER13: Int = 34866

val GL_DRAW_BUFFER14: Int = 34867

val GL_DRAW_BUFFER15: Int = 34868

val GL_BLEND_EQUATION_ALPHA: Int = 34877

val GL_MAX_VERTEX_ATTRIBS: Int = 34921

val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = 34922

val GL_MAX_TEXTURE_IMAGE_UNITS: Int = 34930

val GL_FRAGMENT_SHADER: Int = 35632

val GL_VERTEX_SHADER: Int = 35633

val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = 35657

val GL_MAX_VERTEX_UNIFORM_COMPONENTS: Int = 35658

val GL_MAX_VARYING_FLOATS: Int = 35659

val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = 35660

val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = 35661

val GL_SHADER_TYPE: Int = 35663

val GL_FLOAT_VEC2: Int = 35664

val GL_FLOAT_VEC3: Int = 35665

val GL_FLOAT_VEC4: Int = 35666

val GL_INT_VEC2: Int = 35667

val GL_INT_VEC3: Int = 35668

val GL_INT_VEC4: Int = 35669

val GL_BOOL: Int = 35670

val GL_BOOL_VEC2: Int = 35671

val GL_BOOL_VEC3: Int = 35672

val GL_BOOL_VEC4: Int = 35673

val GL_FLOAT_MAT2: Int = 35674

val GL_FLOAT_MAT3: Int = 35675

val GL_FLOAT_MAT4: Int = 35676

val GL_SAMPLER_1D: Int = 35677

val GL_SAMPLER_2D: Int = 35678

val GL_SAMPLER_3D: Int = 35679

val GL_SAMPLER_CUBE: Int = 35680

val GL_SAMPLER_1D_SHADOW: Int = 35681

val GL_SAMPLER_2D_SHADOW: Int = 35682

val GL_DELETE_STATUS: Int = 35712

val GL_COMPILE_STATUS: Int = 35713

val GL_LINK_STATUS: Int = 35714

val GL_VALIDATE_STATUS: Int = 35715

val GL_INFO_LOG_LENGTH: Int = 35716

val GL_ATTACHED_SHADERS: Int = 35717

val GL_ACTIVE_UNIFORMS: Int = 35718

val GL_ACTIVE_UNIFORM_MAX_LENGTH: Int = 35719

val GL_SHADER_SOURCE_LENGTH: Int = 35720

val GL_ACTIVE_ATTRIBUTES: Int = 35721

val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: Int = 35722

val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: Int = 35723

val GL_SHADING_LANGUAGE_VERSION: Int = 35724

val GL_CURRENT_PROGRAM: Int = 35725

val GL_POINT_SPRITE_COORD_ORIGIN: Int = 36000

val GL_LOWER_LEFT: Int = 36001

val GL_UPPER_LEFT: Int = 36002

val GL_STENCIL_BACK_REF: Int = 36003

val GL_STENCIL_BACK_VALUE_MASK: Int = 36004

val GL_STENCIL_BACK_WRITEMASK: Int = 36005

val GL_VERTEX_PROGRAM_TWO_SIDE: Int = 34371

val GL_POINT_SPRITE: Int = 34913

val GL_COORD_REPLACE: Int = 34914

val GL_MAX_TEXTURE_COORDS: Int = 34929

val GL_VERSION_2_1: Int = 1

val GL_PIXEL_PACK_BUFFER: Int = 35051

val GL_PIXEL_UNPACK_BUFFER: Int = 35052

val GL_PIXEL_PACK_BUFFER_BINDING: Int = 35053

val GL_PIXEL_UNPACK_BUFFER_BINDING: Int = 35055

val GL_FLOAT_MAT2x3: Int = 35685

val GL_FLOAT_MAT2x4: Int = 35686

val GL_FLOAT_MAT3x2: Int = 35687

val GL_FLOAT_MAT3x4: Int = 35688

val GL_FLOAT_MAT4x2: Int = 35689

val GL_FLOAT_MAT4x3: Int = 35690

val GL_SRGB: Int = 35904

val GL_SRGB8: Int = 35905

val GL_SRGB_ALPHA: Int = 35906

val GL_SRGB8_ALPHA8: Int = 35907

val GL_COMPRESSED_SRGB: Int = 35912

val GL_COMPRESSED_SRGB_ALPHA: Int = 35913

val GL_CURRENT_RASTER_SECONDARY_COLOR: Int = 33887

val GL_SLUMINANCE_ALPHA: Int = 35908

val GL_SLUMINANCE8_ALPHA8: Int = 35909

val GL_SLUMINANCE: Int = 35910

val GL_SLUMINANCE8: Int = 35911

val GL_COMPRESSED_SLUMINANCE: Int = 35914

val GL_COMPRESSED_SLUMINANCE_ALPHA: Int = 35915

val GL_VERSION_3_0: Int = 1

val GL_COMPARE_REF_TO_TEXTURE: Int = 34894

val GL_CLIP_DISTANCE0: Int = 12288

val GL_CLIP_DISTANCE1: Int = 12289

val GL_CLIP_DISTANCE2: Int = 12290

val GL_CLIP_DISTANCE3: Int = 12291

val GL_CLIP_DISTANCE4: Int = 12292

val GL_CLIP_DISTANCE5: Int = 12293

val GL_CLIP_DISTANCE6: Int = 12294

val GL_CLIP_DISTANCE7: Int = 12295

val GL_MAX_CLIP_DISTANCES: Int = 3378

val GL_MAJOR_VERSION: Int = 33307

val GL_MINOR_VERSION: Int = 33308

val GL_NUM_EXTENSIONS: Int = 33309

val GL_CONTEXT_FLAGS: Int = 33310

val GL_COMPRESSED_RED: Int = 33317

val GL_COMPRESSED_RG: Int = 33318

val GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT: Int = 1

val GL_RGBA32F: Int = 34836

val GL_RGB32F: Int = 34837

val GL_RGBA16F: Int = 34842

val GL_RGB16F: Int = 34843

val GL_VERTEX_ATTRIB_ARRAY_INTEGER: Int = 35069

val GL_MAX_ARRAY_TEXTURE_LAYERS: Int = 35071

val GL_MIN_PROGRAM_TEXEL_OFFSET: Int = 35076

val GL_MAX_PROGRAM_TEXEL_OFFSET: Int = 35077

val GL_CLAMP_READ_COLOR: Int = 35100

val GL_FIXED_ONLY: Int = 35101

val GL_MAX_VARYING_COMPONENTS: Int = 35659

val GL_TEXTURE_1D_ARRAY: Int = 35864

val GL_PROXY_TEXTURE_1D_ARRAY: Int = 35865

val GL_TEXTURE_2D_ARRAY: Int = 35866

val GL_PROXY_TEXTURE_2D_ARRAY: Int = 35867

val GL_TEXTURE_BINDING_1D_ARRAY: Int = 35868

val GL_TEXTURE_BINDING_2D_ARRAY: Int = 35869

val GL_R11F_G11F_B10F: Int = 35898

val GL_UNSIGNED_INT_10F_11F_11F_REV: Int = 35899

val GL_RGB9_E5: Int = 35901

val GL_UNSIGNED_INT_5_9_9_9_REV: Int = 35902

val GL_TEXTURE_SHARED_SIZE: Int = 35903

val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH: Int = 35958

val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: Int = 35967

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = 35968

val GL_TRANSFORM_FEEDBACK_VARYINGS: Int = 35971

val GL_TRANSFORM_FEEDBACK_BUFFER_START: Int = 35972

val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = 35973

val GL_PRIMITIVES_GENERATED: Int = 35975

val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = 35976

val GL_RASTERIZER_DISCARD: Int = 35977

val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = 35978

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = 35979

val GL_INTERLEAVED_ATTRIBS: Int = 35980

val GL_SEPARATE_ATTRIBS: Int = 35981

val GL_TRANSFORM_FEEDBACK_BUFFER: Int = 35982

val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = 35983

val GL_RGBA32UI: Int = 36208

val GL_RGB32UI: Int = 36209

val GL_RGBA16UI: Int = 36214

val GL_RGB16UI: Int = 36215

val GL_RGBA8UI: Int = 36220

val GL_RGB8UI: Int = 36221

val GL_RGBA32I: Int = 36226

val GL_RGB32I: Int = 36227

val GL_RGBA16I: Int = 36232

val GL_RGB16I: Int = 36233

val GL_RGBA8I: Int = 36238

val GL_RGB8I: Int = 36239

val GL_RED_INTEGER: Int = 36244

val GL_GREEN_INTEGER: Int = 36245

val GL_BLUE_INTEGER: Int = 36246

val GL_RGB_INTEGER: Int = 36248

val GL_RGBA_INTEGER: Int = 36249

val GL_BGR_INTEGER: Int = 36250

val GL_BGRA_INTEGER: Int = 36251

val GL_SAMPLER_1D_ARRAY: Int = 36288

val GL_SAMPLER_2D_ARRAY: Int = 36289

val GL_SAMPLER_1D_ARRAY_SHADOW: Int = 36291

val GL_SAMPLER_2D_ARRAY_SHADOW: Int = 36292

val GL_SAMPLER_CUBE_SHADOW: Int = 36293

val GL_UNSIGNED_INT_VEC2: Int = 36294

val GL_UNSIGNED_INT_VEC3: Int = 36295

val GL_UNSIGNED_INT_VEC4: Int = 36296

val GL_INT_SAMPLER_1D: Int = 36297

val GL_INT_SAMPLER_2D: Int = 36298

val GL_INT_SAMPLER_3D: Int = 36299

val GL_INT_SAMPLER_CUBE: Int = 36300

val GL_INT_SAMPLER_1D_ARRAY: Int = 36302

val GL_INT_SAMPLER_2D_ARRAY: Int = 36303

val GL_UNSIGNED_INT_SAMPLER_1D: Int = 36305

val GL_UNSIGNED_INT_SAMPLER_2D: Int = 36306

val GL_UNSIGNED_INT_SAMPLER_3D: Int = 36307

val GL_UNSIGNED_INT_SAMPLER_CUBE: Int = 36308

val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY: Int = 36310

val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = 36311

val GL_QUERY_WAIT: Int = 36371

val GL_QUERY_NO_WAIT: Int = 36372

val GL_QUERY_BY_REGION_WAIT: Int = 36373

val GL_QUERY_BY_REGION_NO_WAIT: Int = 36374

val GL_BUFFER_ACCESS_FLAGS: Int = 37151

val GL_BUFFER_MAP_LENGTH: Int = 37152

val GL_BUFFER_MAP_OFFSET: Int = 37153

val GL_DEPTH_COMPONENT32F: Int = 36012

val GL_DEPTH32F_STENCIL8: Int = 36013

val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: Int = 36269

val GL_INVALID_FRAMEBUFFER_OPERATION: Int = 1286

val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = 33296

val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = 33297

val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = 33298

val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = 33299

val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = 33300

val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = 33301

val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = 33302

val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = 33303

val GL_FRAMEBUFFER_DEFAULT: Int = 33304

val GL_FRAMEBUFFER_UNDEFINED: Int = 33305

val GL_DEPTH_STENCIL_ATTACHMENT: Int = 33306

val GL_MAX_RENDERBUFFER_SIZE: Int = 34024

val GL_DEPTH_STENCIL: Int = 34041

val GL_UNSIGNED_INT_24_8: Int = 34042

val GL_DEPTH24_STENCIL8: Int = 35056

val GL_TEXTURE_STENCIL_SIZE: Int = 35057

val GL_TEXTURE_RED_TYPE: Int = 35856

val GL_TEXTURE_GREEN_TYPE: Int = 35857

val GL_TEXTURE_BLUE_TYPE: Int = 35858

val GL_TEXTURE_ALPHA_TYPE: Int = 35859

val GL_TEXTURE_DEPTH_TYPE: Int = 35862

val GL_UNSIGNED_NORMALIZED: Int = 35863

val GL_FRAMEBUFFER_BINDING: Int = 36006

val GL_DRAW_FRAMEBUFFER_BINDING: Int = 36006

val GL_RENDERBUFFER_BINDING: Int = 36007

val GL_READ_FRAMEBUFFER: Int = 36008

val GL_DRAW_FRAMEBUFFER: Int = 36009

val GL_READ_FRAMEBUFFER_BINDING: Int = 36010

val GL_RENDERBUFFER_SAMPLES: Int = 36011

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = 36048

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = 36049

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = 36050

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = 36051

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = 36052

val GL_FRAMEBUFFER_COMPLETE: Int = 36053

val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = 36054

val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = 36055

val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER: Int = 36059

val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER: Int = 36060

val GL_FRAMEBUFFER_UNSUPPORTED: Int = 36061

val GL_MAX_COLOR_ATTACHMENTS: Int = 36063

val GL_COLOR_ATTACHMENT0: Int = 36064

val GL_COLOR_ATTACHMENT1: Int = 36065

val GL_COLOR_ATTACHMENT2: Int = 36066

val GL_COLOR_ATTACHMENT3: Int = 36067

val GL_COLOR_ATTACHMENT4: Int = 36068

val GL_COLOR_ATTACHMENT5: Int = 36069

val GL_COLOR_ATTACHMENT6: Int = 36070

val GL_COLOR_ATTACHMENT7: Int = 36071

val GL_COLOR_ATTACHMENT8: Int = 36072

val GL_COLOR_ATTACHMENT9: Int = 36073

val GL_COLOR_ATTACHMENT10: Int = 36074

val GL_COLOR_ATTACHMENT11: Int = 36075

val GL_COLOR_ATTACHMENT12: Int = 36076

val GL_COLOR_ATTACHMENT13: Int = 36077

val GL_COLOR_ATTACHMENT14: Int = 36078

val GL_COLOR_ATTACHMENT15: Int = 36079

val GL_COLOR_ATTACHMENT16: Int = 36080

val GL_COLOR_ATTACHMENT17: Int = 36081

val GL_COLOR_ATTACHMENT18: Int = 36082

val GL_COLOR_ATTACHMENT19: Int = 36083

val GL_COLOR_ATTACHMENT20: Int = 36084

val GL_COLOR_ATTACHMENT21: Int = 36085

val GL_COLOR_ATTACHMENT22: Int = 36086

val GL_COLOR_ATTACHMENT23: Int = 36087

val GL_COLOR_ATTACHMENT24: Int = 36088

val GL_COLOR_ATTACHMENT25: Int = 36089

val GL_COLOR_ATTACHMENT26: Int = 36090

val GL_COLOR_ATTACHMENT27: Int = 36091

val GL_COLOR_ATTACHMENT28: Int = 36092

val GL_COLOR_ATTACHMENT29: Int = 36093

val GL_COLOR_ATTACHMENT30: Int = 36094

val GL_COLOR_ATTACHMENT31: Int = 36095

val GL_DEPTH_ATTACHMENT: Int = 36096

val GL_STENCIL_ATTACHMENT: Int = 36128

val GL_FRAMEBUFFER: Int = 36160

val GL_RENDERBUFFER: Int = 36161

val GL_RENDERBUFFER_WIDTH: Int = 36162

val GL_RENDERBUFFER_HEIGHT: Int = 36163

val GL_RENDERBUFFER_INTERNAL_FORMAT: Int = 36164

val GL_STENCIL_INDEX1: Int = 36166

val GL_STENCIL_INDEX4: Int = 36167

val GL_STENCIL_INDEX8: Int = 36168

val GL_STENCIL_INDEX16: Int = 36169

val GL_RENDERBUFFER_RED_SIZE: Int = 36176

val GL_RENDERBUFFER_GREEN_SIZE: Int = 36177

val GL_RENDERBUFFER_BLUE_SIZE: Int = 36178

val GL_RENDERBUFFER_ALPHA_SIZE: Int = 36179

val GL_RENDERBUFFER_DEPTH_SIZE: Int = 36180

val GL_RENDERBUFFER_STENCIL_SIZE: Int = 36181

val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = 36182

val GL_MAX_SAMPLES: Int = 36183

val GL_INDEX: Int = 33314

val GL_TEXTURE_LUMINANCE_TYPE: Int = 35860

val GL_TEXTURE_INTENSITY_TYPE: Int = 35861

val GL_FRAMEBUFFER_SRGB: Int = 36281

val GL_HALF_FLOAT: Int = 5131

val GL_MAP_READ_BIT: Int = 1

val GL_MAP_WRITE_BIT: Int = 2

val GL_MAP_INVALIDATE_RANGE_BIT: Int = 4

val GL_MAP_INVALIDATE_BUFFER_BIT: Int = 8

val GL_MAP_FLUSH_EXPLICIT_BIT: Int = 16

val GL_MAP_UNSYNCHRONIZED_BIT: Int = 32

val GL_COMPRESSED_RED_RGTC1: Int = 36283

val GL_COMPRESSED_SIGNED_RED_RGTC1: Int = 36284

val GL_COMPRESSED_RG_RGTC2: Int = 36285

val GL_COMPRESSED_SIGNED_RG_RGTC2: Int = 36286

val GL_RG: Int = 33319

val GL_RG_INTEGER: Int = 33320

val GL_R8: Int = 33321

val GL_R16: Int = 33322

val GL_RG8: Int = 33323

val GL_RG16: Int = 33324

val GL_R16F: Int = 33325

val GL_R32F: Int = 33326

val GL_RG16F: Int = 33327

val GL_RG32F: Int = 33328

val GL_R8I: Int = 33329

val GL_R8UI: Int = 33330

val GL_R16I: Int = 33331

val GL_R16UI: Int = 33332

val GL_R32I: Int = 33333

val GL_R32UI: Int = 33334

val GL_RG8I: Int = 33335

val GL_RG8UI: Int = 33336

val GL_RG16I: Int = 33337

val GL_RG16UI: Int = 33338

val GL_RG32I: Int = 33339

val GL_RG32UI: Int = 33340

val GL_VERTEX_ARRAY_BINDING: Int = 34229

val GL_CLAMP_VERTEX_COLOR: Int = 35098

val GL_CLAMP_FRAGMENT_COLOR: Int = 35099

val GL_ALPHA_INTEGER: Int = 36247

val GL_VERSION_3_1: Int = 1

val GL_SAMPLER_2D_RECT: Int = 35683

val GL_SAMPLER_2D_RECT_SHADOW: Int = 35684

val GL_SAMPLER_BUFFER: Int = 36290

val GL_INT_SAMPLER_2D_RECT: Int = 36301

val GL_INT_SAMPLER_BUFFER: Int = 36304

val GL_UNSIGNED_INT_SAMPLER_2D_RECT: Int = 36309

val GL_UNSIGNED_INT_SAMPLER_BUFFER: Int = 36312

val GL_TEXTURE_BUFFER: Int = 35882

val GL_MAX_TEXTURE_BUFFER_SIZE: Int = 35883

val GL_TEXTURE_BINDING_BUFFER: Int = 35884

val GL_TEXTURE_BUFFER_DATA_STORE_BINDING: Int = 35885

val GL_TEXTURE_RECTANGLE: Int = 34037

val GL_TEXTURE_BINDING_RECTANGLE: Int = 34038

val GL_PROXY_TEXTURE_RECTANGLE: Int = 34039

val GL_MAX_RECTANGLE_TEXTURE_SIZE: Int = 34040

val GL_R8_SNORM: Int = 36756

val GL_RG8_SNORM: Int = 36757

val GL_RGB8_SNORM: Int = 36758

val GL_RGBA8_SNORM: Int = 36759

val GL_R16_SNORM: Int = 36760

val GL_RG16_SNORM: Int = 36761

val GL_RGB16_SNORM: Int = 36762

val GL_RGBA16_SNORM: Int = 36763

val GL_SIGNED_NORMALIZED: Int = 36764

val GL_PRIMITIVE_RESTART: Int = 36765

val GL_PRIMITIVE_RESTART_INDEX: Int = 36766

val GL_COPY_READ_BUFFER: Int = 36662

val GL_COPY_WRITE_BUFFER: Int = 36663

val GL_UNIFORM_BUFFER: Int = 35345

val GL_UNIFORM_BUFFER_BINDING: Int = 35368

val GL_UNIFORM_BUFFER_START: Int = 35369

val GL_UNIFORM_BUFFER_SIZE: Int = 35370

val GL_MAX_VERTEX_UNIFORM_BLOCKS: Int = 35371

val GL_MAX_GEOMETRY_UNIFORM_BLOCKS: Int = 35372

val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: Int = 35373

val GL_MAX_COMBINED_UNIFORM_BLOCKS: Int = 35374

val GL_MAX_UNIFORM_BUFFER_BINDINGS: Int = 35375

val GL_MAX_UNIFORM_BLOCK_SIZE: Int = 35376

val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = 35377

val GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS: Int = 35378

val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = 35379

val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = 35380

val GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH: Int = 35381

val GL_ACTIVE_UNIFORM_BLOCKS: Int = 35382

val GL_UNIFORM_TYPE: Int = 35383

val GL_UNIFORM_SIZE: Int = 35384

val GL_UNIFORM_NAME_LENGTH: Int = 35385

val GL_UNIFORM_BLOCK_INDEX: Int = 35386

val GL_UNIFORM_OFFSET: Int = 35387

val GL_UNIFORM_ARRAY_STRIDE: Int = 35388

val GL_UNIFORM_MATRIX_STRIDE: Int = 35389

val GL_UNIFORM_IS_ROW_MAJOR: Int = 35390

val GL_UNIFORM_BLOCK_BINDING: Int = 35391

val GL_UNIFORM_BLOCK_DATA_SIZE: Int = 35392

val GL_UNIFORM_BLOCK_NAME_LENGTH: Int = 35393

val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = 35394

val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = 35395

val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = 35396

val GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER: Int = 35397

val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = 35398

val GL_INVALID_INDEX: Int = -1

val GL_VERSION_3_2: Int = 1

val _INTTYPES_H: Int = 1

val _FEATURES_H: Int = 1

val _DEFAULT_SOURCE: Int = 1

val __USE_ISOC11: Int = 1

val __USE_ISOC99: Int = 1

val __USE_ISOC95: Int = 1

val __USE_POSIX_IMPLICITLY: Int = 1

val _POSIX_SOURCE: Int = 1

val _POSIX_C_SOURCE: Long = 200809

val __USE_POSIX: Int = 1

val __USE_POSIX2: Int = 1

val __USE_POSIX199309: Int = 1

val __USE_POSIX199506: Int = 1

val __USE_XOPEN2K: Int = 1

val __USE_XOPEN2K8: Int = 1

val _ATFILE_SOURCE: Int = 1

val __USE_MISC: Int = 1

val __USE_ATFILE: Int = 1

val __USE_FORTIFY_LEVEL: Int = 0

val _STDC_PREDEF_H: Int = 1

val __STDC_IEC_559__: Int = 1

val __STDC_IEC_559_COMPLEX__: Int = 1

val __STDC_ISO_10646__: Long = 201505

val __STDC_NO_THREADS__: Int = 1

val __GNU_LIBRARY__: Int = 6

val __GLIBC__: Int = 2

val __GLIBC_MINOR__: Int = 23

val _SYS_CDEFS_H: Int = 1

val __WORDSIZE: Int = 64

val __WORDSIZE_TIME64_COMPAT32: Int = 1

val __SYSCALL_WORDSIZE: Int = 64

val _STDINT_H: Int = 1

val _BITS_WCHAR_H: Int = 1

val __WCHAR_MAX: Int = 2147483647

val __WCHAR_MIN: Int = -2147483648

val INT8_MIN: Int = -128

val INT16_MIN: Int = -32768

val INT32_MIN: Int = -2147483648

val INT64_MIN: Long = -9223372036854775807 - 1

val INT8_MAX: Int = 127

val INT16_MAX: Int = 32767

val INT32_MAX: Int = 2147483647

val INT64_MAX: Long = 9223372036854775807

val UINT8_MAX: Int = 255

val UINT16_MAX: Int = 65535

val UINT32_MAX: Int = -1

val UINT64_MAX: Long = -1

val INT_LEAST8_MIN: Int = -128

val INT_LEAST16_MIN: Int = -32768

val INT_LEAST32_MIN: Int = -2147483648

val INT_LEAST64_MIN: Long = -9223372036854775807 - 1

val INT_LEAST8_MAX: Int = 127

val INT_LEAST16_MAX: Int = 32767

val INT_LEAST32_MAX: Int = 2147483647

val INT_LEAST64_MAX: Long = 9223372036854775807

val UINT_LEAST8_MAX: Int = 255

val UINT_LEAST16_MAX: Int = 65535

val UINT_LEAST32_MAX: Int = -1

val UINT_LEAST64_MAX: Long = -1

val INT_FAST8_MIN: Int = -128

val INT_FAST16_MIN: Long = -9223372036854775807 - 1

val INT_FAST32_MIN: Long = -9223372036854775807 - 1

val INT_FAST64_MIN: Long = -9223372036854775807 - 1

val INT_FAST8_MAX: Int = 127

val INT_FAST16_MAX: Long = 9223372036854775807

val INT_FAST32_MAX: Long = 9223372036854775807

val INT_FAST64_MAX: Long = 9223372036854775807

val UINT_FAST8_MAX: Int = 255

val UINT_FAST16_MAX: Long = -1

val UINT_FAST32_MAX: Long = -1

val UINT_FAST64_MAX: Long = -1

val INTPTR_MIN: Long = -9223372036854775807 - 1

val INTPTR_MAX: Long = 9223372036854775807

val UINTPTR_MAX: Long = -1

val INTMAX_MIN: Long = -9223372036854775807 - 1

val INTMAX_MAX: Long = 9223372036854775807

val UINTMAX_MAX: Long = -1

val PTRDIFF_MIN: Long = -9223372036854775807 - 1

val PTRDIFF_MAX: Long = 9223372036854775807

val SIG_ATOMIC_MIN: Int = -2147483648

val SIG_ATOMIC_MAX: Int = 2147483647

val SIZE_MAX: Long = -1

val WCHAR_MIN: Int = -2147483648

val WCHAR_MAX: Int = 2147483647

val WINT_MIN: Int = 0

val WINT_MAX: Int = -1

val ____gwchar_t_defined: Int = 1

val GL_CONTEXT_CORE_PROFILE_BIT: Int = 1

val GL_CONTEXT_COMPATIBILITY_PROFILE_BIT: Int = 2

val GL_LINES_ADJACENCY: Int = 10

val GL_LINE_STRIP_ADJACENCY: Int = 11

val GL_TRIANGLES_ADJACENCY: Int = 12

val GL_TRIANGLE_STRIP_ADJACENCY: Int = 13

val GL_PROGRAM_POINT_SIZE: Int = 34370

val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS: Int = 35881

val GL_FRAMEBUFFER_ATTACHMENT_LAYERED: Int = 36263

val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS: Int = 36264

val GL_GEOMETRY_SHADER: Int = 36313

val GL_GEOMETRY_VERTICES_OUT: Int = 35094

val GL_GEOMETRY_INPUT_TYPE: Int = 35095

val GL_GEOMETRY_OUTPUT_TYPE: Int = 35096

val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS: Int = 36319

val GL_MAX_GEOMETRY_OUTPUT_VERTICES: Int = 36320

val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS: Int = 36321

val GL_MAX_VERTEX_OUTPUT_COMPONENTS: Int = 37154

val GL_MAX_GEOMETRY_INPUT_COMPONENTS: Int = 37155

val GL_MAX_GEOMETRY_OUTPUT_COMPONENTS: Int = 37156

val GL_MAX_FRAGMENT_INPUT_COMPONENTS: Int = 37157

val GL_CONTEXT_PROFILE_MASK: Int = 37158

val GL_DEPTH_CLAMP: Int = 34383

val GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION: Int = 36428

val GL_FIRST_VERTEX_CONVENTION: Int = 36429

val GL_LAST_VERTEX_CONVENTION: Int = 36430

val GL_PROVOKING_VERTEX: Int = 36431

val GL_TEXTURE_CUBE_MAP_SEAMLESS: Int = 34895

val GL_MAX_SERVER_WAIT_TIMEOUT: Int = 37137

val GL_OBJECT_TYPE: Int = 37138

val GL_SYNC_CONDITION: Int = 37139

val GL_SYNC_STATUS: Int = 37140

val GL_SYNC_FLAGS: Int = 37141

val GL_SYNC_FENCE: Int = 37142

val GL_SYNC_GPU_COMMANDS_COMPLETE: Int = 37143

val GL_UNSIGNALED: Int = 37144

val GL_SIGNALED: Int = 37145

val GL_ALREADY_SIGNALED: Int = 37146

val GL_TIMEOUT_EXPIRED: Int = 37147

val GL_CONDITION_SATISFIED: Int = 37148

val GL_WAIT_FAILED: Int = 37149

val GL_TIMEOUT_IGNORED: Long = -1

val GL_SYNC_FLUSH_COMMANDS_BIT: Int = 1

val GL_SAMPLE_POSITION: Int = 36432

val GL_SAMPLE_MASK: Int = 36433

val GL_SAMPLE_MASK_VALUE: Int = 36434

val GL_MAX_SAMPLE_MASK_WORDS: Int = 36441

val GL_TEXTURE_2D_MULTISAMPLE: Int = 37120

val GL_PROXY_TEXTURE_2D_MULTISAMPLE: Int = 37121

val GL_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37122

val GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY: Int = 37123

val GL_TEXTURE_BINDING_2D_MULTISAMPLE: Int = 37124

val GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY: Int = 37125

val GL_TEXTURE_SAMPLES: Int = 37126

val GL_TEXTURE_FIXED_SAMPLE_LOCATIONS: Int = 37127

val GL_SAMPLER_2D_MULTISAMPLE: Int = 37128

val GL_INT_SAMPLER_2D_MULTISAMPLE: Int = 37129

val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE: Int = 37130

val GL_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37131

val GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37132

val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: Int = 37133

val GL_MAX_COLOR_TEXTURE_SAMPLES: Int = 37134

val GL_MAX_DEPTH_TEXTURE_SAMPLES: Int = 37135

val GL_MAX_INTEGER_SAMPLES: Int = 37136

val GL_VERSION_3_3: Int = 1

val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: Int = 35070

val GL_SRC1_COLOR: Int = 35065

val GL_ONE_MINUS_SRC1_COLOR: Int = 35066

val GL_ONE_MINUS_SRC1_ALPHA: Int = 35067

val GL_MAX_DUAL_SOURCE_DRAW_BUFFERS: Int = 35068

val GL_ANY_SAMPLES_PASSED: Int = 35887

val GL_SAMPLER_BINDING: Int = 35097

val GL_RGB10_A2UI: Int = 36975

val GL_TEXTURE_SWIZZLE_R: Int = 36418

val GL_TEXTURE_SWIZZLE_G: Int = 36419

val GL_TEXTURE_SWIZZLE_B: Int = 36420

val GL_TEXTURE_SWIZZLE_A: Int = 36421

val GL_TEXTURE_SWIZZLE_RGBA: Int = 36422

val GL_TIME_ELAPSED: Int = 35007

val GL_TIMESTAMP: Int = 36392

val GL_INT_2_10_10_10_REV: Int = 36255

val GL_VERSION_4_0: Int = 1

val GL_SAMPLE_SHADING: Int = 35894

val GL_MIN_SAMPLE_SHADING_VALUE: Int = 35895

val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36446

val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET: Int = 36447

val GL_TEXTURE_CUBE_MAP_ARRAY: Int = 36873

val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY: Int = 36874

val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY: Int = 36875

val GL_SAMPLER_CUBE_MAP_ARRAY: Int = 36876

val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW: Int = 36877

val GL_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36878

val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY: Int = 36879

val GL_DRAW_INDIRECT_BUFFER: Int = 36671

val GL_DRAW_INDIRECT_BUFFER_BINDING: Int = 36675

val GL_GEOMETRY_SHADER_INVOCATIONS: Int = 34943

val GL_MAX_GEOMETRY_SHADER_INVOCATIONS: Int = 36442

val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET: Int = 36443

val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET: Int = 36444

val GL_FRAGMENT_INTERPOLATION_OFFSET_BITS: Int = 36445

val GL_MAX_VERTEX_STREAMS: Int = 36465

val GL_DOUBLE_VEC2: Int = 36860

val GL_DOUBLE_VEC3: Int = 36861

val GL_DOUBLE_VEC4: Int = 36862

val GL_DOUBLE_MAT2: Int = 36678

val GL_DOUBLE_MAT3: Int = 36679

val GL_DOUBLE_MAT4: Int = 36680

val GL_DOUBLE_MAT2x3: Int = 36681

val GL_DOUBLE_MAT2x4: Int = 36682

val GL_DOUBLE_MAT3x2: Int = 36683

val GL_DOUBLE_MAT3x4: Int = 36684

val GL_DOUBLE_MAT4x2: Int = 36685

val GL_DOUBLE_MAT4x3: Int = 36686

val GL_ACTIVE_SUBROUTINES: Int = 36325

val GL_ACTIVE_SUBROUTINE_UNIFORMS: Int = 36326

val GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36423

val GL_ACTIVE_SUBROUTINE_MAX_LENGTH: Int = 36424

val GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH: Int = 36425

val GL_MAX_SUBROUTINES: Int = 36327

val GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS: Int = 36328

val GL_NUM_COMPATIBLE_SUBROUTINES: Int = 36426

val GL_COMPATIBLE_SUBROUTINES: Int = 36427

val GL_PATCHES: Int = 14

val GL_PATCH_VERTICES: Int = 36466

val GL_PATCH_DEFAULT_INNER_LEVEL: Int = 36467

val GL_PATCH_DEFAULT_OUTER_LEVEL: Int = 36468

val GL_TESS_CONTROL_OUTPUT_VERTICES: Int = 36469

val GL_TESS_GEN_MODE: Int = 36470

val GL_TESS_GEN_SPACING: Int = 36471

val GL_TESS_GEN_VERTEX_ORDER: Int = 36472

val GL_TESS_GEN_POINT_MODE: Int = 36473

val GL_ISOLINES: Int = 36474

val GL_FRACTIONAL_ODD: Int = 36475

val GL_FRACTIONAL_EVEN: Int = 36476

val GL_MAX_PATCH_VERTICES: Int = 36477

val GL_MAX_TESS_GEN_LEVEL: Int = 36478

val GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36479

val GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36480

val GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS: Int = 36481

val GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS: Int = 36482

val GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS: Int = 36483

val GL_MAX_TESS_PATCH_COMPONENTS: Int = 36484

val GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS: Int = 36485

val GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS: Int = 36486

val GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS: Int = 36489

val GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS: Int = 36490

val GL_MAX_TESS_CONTROL_INPUT_COMPONENTS: Int = 34924

val GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS: Int = 34925

val GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS: Int = 36382

val GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS: Int = 36383

val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 34032

val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 34033

val GL_TESS_EVALUATION_SHADER: Int = 36487

val GL_TESS_CONTROL_SHADER: Int = 36488

val GL_TRANSFORM_FEEDBACK: Int = 36386

val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED: Int = 36387

val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE: Int = 36388

val GL_TRANSFORM_FEEDBACK_BINDING: Int = 36389

val GL_MAX_TRANSFORM_FEEDBACK_BUFFERS: Int = 36464

val GL_VERSION_4_1: Int = 1

val GL_FIXED: Int = 5132

val GL_IMPLEMENTATION_COLOR_READ_TYPE: Int = 35738

val GL_IMPLEMENTATION_COLOR_READ_FORMAT: Int = 35739

val GL_LOW_FLOAT: Int = 36336

val GL_MEDIUM_FLOAT: Int = 36337

val GL_HIGH_FLOAT: Int = 36338

val GL_LOW_INT: Int = 36339

val GL_MEDIUM_INT: Int = 36340

val GL_HIGH_INT: Int = 36341

val GL_SHADER_COMPILER: Int = 36346

val GL_SHADER_BINARY_FORMATS: Int = 36344

val GL_NUM_SHADER_BINARY_FORMATS: Int = 36345

val GL_MAX_VERTEX_UNIFORM_VECTORS: Int = 36347

val GL_MAX_VARYING_VECTORS: Int = 36348

val GL_MAX_FRAGMENT_UNIFORM_VECTORS: Int = 36349

val GL_RGB565: Int = 36194

val GL_PROGRAM_BINARY_RETRIEVABLE_HINT: Int = 33367

val GL_PROGRAM_BINARY_LENGTH: Int = 34625

val GL_NUM_PROGRAM_BINARY_FORMATS: Int = 34814

val GL_PROGRAM_BINARY_FORMATS: Int = 34815

val GL_VERTEX_SHADER_BIT: Int = 1

val GL_FRAGMENT_SHADER_BIT: Int = 2

val GL_GEOMETRY_SHADER_BIT: Int = 4

val GL_TESS_CONTROL_SHADER_BIT: Int = 8

val GL_TESS_EVALUATION_SHADER_BIT: Int = 16

val GL_ALL_SHADER_BITS: Int = -1

val GL_PROGRAM_SEPARABLE: Int = 33368

val GL_ACTIVE_PROGRAM: Int = 33369

val GL_PROGRAM_PIPELINE_BINDING: Int = 33370

val GL_MAX_VIEWPORTS: Int = 33371

val GL_VIEWPORT_SUBPIXEL_BITS: Int = 33372

val GL_VIEWPORT_BOUNDS_RANGE: Int = 33373

val GL_LAYER_PROVOKING_VERTEX: Int = 33374

val GL_VIEWPORT_INDEX_PROVOKING_VERTEX: Int = 33375

val GL_UNDEFINED_VERTEX: Int = 33376

val GL_VERSION_4_2: Int = 1

val GL_COPY_READ_BUFFER_BINDING: Int = 36662

val GL_COPY_WRITE_BUFFER_BINDING: Int = 36663

val GL_TRANSFORM_FEEDBACK_ACTIVE: Int = 36388

val GL_TRANSFORM_FEEDBACK_PAUSED: Int = 36387

val GL_UNPACK_COMPRESSED_BLOCK_WIDTH: Int = 37159

val GL_UNPACK_COMPRESSED_BLOCK_HEIGHT: Int = 37160

val GL_UNPACK_COMPRESSED_BLOCK_DEPTH: Int = 37161

val GL_UNPACK_COMPRESSED_BLOCK_SIZE: Int = 37162

val GL_PACK_COMPRESSED_BLOCK_WIDTH: Int = 37163

val GL_PACK_COMPRESSED_BLOCK_HEIGHT: Int = 37164

val GL_PACK_COMPRESSED_BLOCK_DEPTH: Int = 37165

val GL_PACK_COMPRESSED_BLOCK_SIZE: Int = 37166

val GL_NUM_SAMPLE_COUNTS: Int = 37760

val GL_MIN_MAP_BUFFER_ALIGNMENT: Int = 37052

val GL_ATOMIC_COUNTER_BUFFER: Int = 37568

val GL_ATOMIC_COUNTER_BUFFER_BINDING: Int = 37569

val GL_ATOMIC_COUNTER_BUFFER_START: Int = 37570

val GL_ATOMIC_COUNTER_BUFFER_SIZE: Int = 37571

val GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE: Int = 37572

val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS: Int = 37573

val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES: Int = 37574

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER: Int = 37575

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 37576

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 37577

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER: Int = 37578

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER: Int = 37579

val GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS: Int = 37580

val GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS: Int = 37581

val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS: Int = 37582

val GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS: Int = 37583

val GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS: Int = 37584

val GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS: Int = 37585

val GL_MAX_VERTEX_ATOMIC_COUNTERS: Int = 37586

val GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS: Int = 37587

val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS: Int = 37588

val GL_MAX_GEOMETRY_ATOMIC_COUNTERS: Int = 37589

val GL_MAX_FRAGMENT_ATOMIC_COUNTERS: Int = 37590

val GL_MAX_COMBINED_ATOMIC_COUNTERS: Int = 37591

val GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE: Int = 37592

val GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS: Int = 37596

val GL_ACTIVE_ATOMIC_COUNTER_BUFFERS: Int = 37593

val GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX: Int = 37594

val GL_UNSIGNED_INT_ATOMIC_COUNTER: Int = 37595

val GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT: Int = 1

val GL_ELEMENT_ARRAY_BARRIER_BIT: Int = 2

val GL_UNIFORM_BARRIER_BIT: Int = 4

val GL_TEXTURE_FETCH_BARRIER_BIT: Int = 8

val GL_SHADER_IMAGE_ACCESS_BARRIER_BIT: Int = 32

val GL_COMMAND_BARRIER_BIT: Int = 64

val GL_PIXEL_BUFFER_BARRIER_BIT: Int = 128

val GL_TEXTURE_UPDATE_BARRIER_BIT: Int = 256

val GL_BUFFER_UPDATE_BARRIER_BIT: Int = 512

val GL_FRAMEBUFFER_BARRIER_BIT: Int = 1024

val GL_TRANSFORM_FEEDBACK_BARRIER_BIT: Int = 2048

val GL_ATOMIC_COUNTER_BARRIER_BIT: Int = 4096

val GL_ALL_BARRIER_BITS: Int = -1

val GL_MAX_IMAGE_UNITS: Int = 36664

val GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS: Int = 36665

val GL_IMAGE_BINDING_NAME: Int = 36666

val GL_IMAGE_BINDING_LEVEL: Int = 36667

val GL_IMAGE_BINDING_LAYERED: Int = 36668

val GL_IMAGE_BINDING_LAYER: Int = 36669

val GL_IMAGE_BINDING_ACCESS: Int = 36670

val GL_IMAGE_1D: Int = 36940

val GL_IMAGE_2D: Int = 36941

val GL_IMAGE_3D: Int = 36942

val GL_IMAGE_2D_RECT: Int = 36943

val GL_IMAGE_CUBE: Int = 36944

val GL_IMAGE_BUFFER: Int = 36945

val GL_IMAGE_1D_ARRAY: Int = 36946

val GL_IMAGE_2D_ARRAY: Int = 36947

val GL_IMAGE_CUBE_MAP_ARRAY: Int = 36948

val GL_IMAGE_2D_MULTISAMPLE: Int = 36949

val GL_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36950

val GL_INT_IMAGE_1D: Int = 36951

val GL_INT_IMAGE_2D: Int = 36952

val GL_INT_IMAGE_3D: Int = 36953

val GL_INT_IMAGE_2D_RECT: Int = 36954

val GL_INT_IMAGE_CUBE: Int = 36955

val GL_INT_IMAGE_BUFFER: Int = 36956

val GL_INT_IMAGE_1D_ARRAY: Int = 36957

val GL_INT_IMAGE_2D_ARRAY: Int = 36958

val GL_INT_IMAGE_CUBE_MAP_ARRAY: Int = 36959

val GL_INT_IMAGE_2D_MULTISAMPLE: Int = 36960

val GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36961

val GL_UNSIGNED_INT_IMAGE_1D: Int = 36962

val GL_UNSIGNED_INT_IMAGE_2D: Int = 36963

val GL_UNSIGNED_INT_IMAGE_3D: Int = 36964

val GL_UNSIGNED_INT_IMAGE_2D_RECT: Int = 36965

val GL_UNSIGNED_INT_IMAGE_CUBE: Int = 36966

val GL_UNSIGNED_INT_IMAGE_BUFFER: Int = 36967

val GL_UNSIGNED_INT_IMAGE_1D_ARRAY: Int = 36968

val GL_UNSIGNED_INT_IMAGE_2D_ARRAY: Int = 36969

val GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY: Int = 36970

val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE: Int = 36971

val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY: Int = 36972

val GL_MAX_IMAGE_SAMPLES: Int = 36973

val GL_IMAGE_BINDING_FORMAT: Int = 36974

val GL_IMAGE_FORMAT_COMPATIBILITY_TYPE: Int = 37063

val GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE: Int = 37064

val GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS: Int = 37065

val GL_MAX_VERTEX_IMAGE_UNIFORMS: Int = 37066

val GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS: Int = 37067

val GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS: Int = 37068

val GL_MAX_GEOMETRY_IMAGE_UNIFORMS: Int = 37069

val GL_MAX_FRAGMENT_IMAGE_UNIFORMS: Int = 37070

val GL_MAX_COMBINED_IMAGE_UNIFORMS: Int = 37071

val GL_COMPRESSED_RGBA_BPTC_UNORM: Int = 36492

val GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM: Int = 36493

val GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT: Int = 36494

val GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT: Int = 36495

val GL_TEXTURE_IMMUTABLE_FORMAT: Int = 37167

val GL_VERSION_4_3: Int = 1

val GL_NUM_SHADING_LANGUAGE_VERSIONS: Int = 33513

val GL_VERTEX_ATTRIB_ARRAY_LONG: Int = 34638

val GL_COMPRESSED_RGB8_ETC2: Int = 37492

val GL_COMPRESSED_SRGB8_ETC2: Int = 37493

val GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = 37494

val GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: Int = 37495

val GL_COMPRESSED_RGBA8_ETC2_EAC: Int = 37496

val GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: Int = 37497

val GL_COMPRESSED_R11_EAC: Int = 37488

val GL_COMPRESSED_SIGNED_R11_EAC: Int = 37489

val GL_COMPRESSED_RG11_EAC: Int = 37490

val GL_COMPRESSED_SIGNED_RG11_EAC: Int = 37491

val GL_PRIMITIVE_RESTART_FIXED_INDEX: Int = 36201

val GL_ANY_SAMPLES_PASSED_CONSERVATIVE: Int = 36202

val GL_MAX_ELEMENT_INDEX: Int = 36203

val GL_COMPUTE_SHADER: Int = 37305

val GL_MAX_COMPUTE_UNIFORM_BLOCKS: Int = 37307

val GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS: Int = 37308

val GL_MAX_COMPUTE_IMAGE_UNIFORMS: Int = 37309

val GL_MAX_COMPUTE_SHARED_MEMORY_SIZE: Int = 33378

val GL_MAX_COMPUTE_UNIFORM_COMPONENTS: Int = 33379

val GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS: Int = 33380

val GL_MAX_COMPUTE_ATOMIC_COUNTERS: Int = 33381

val GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS: Int = 33382

val GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS: Int = 37099

val GL_MAX_COMPUTE_WORK_GROUP_COUNT: Int = 37310

val GL_MAX_COMPUTE_WORK_GROUP_SIZE: Int = 37311

val GL_COMPUTE_WORK_GROUP_SIZE: Int = 33383

val GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER: Int = 37100

val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER: Int = 37101

val GL_DISPATCH_INDIRECT_BUFFER: Int = 37102

val GL_DISPATCH_INDIRECT_BUFFER_BINDING: Int = 37103

val GL_COMPUTE_SHADER_BIT: Int = 32

val GL_DEBUG_OUTPUT_SYNCHRONOUS: Int = 33346

val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH: Int = 33347

val GL_DEBUG_CALLBACK_FUNCTION: Int = 33348

val GL_DEBUG_CALLBACK_USER_PARAM: Int = 33349

val GL_DEBUG_SOURCE_API: Int = 33350

val GL_DEBUG_SOURCE_WINDOW_SYSTEM: Int = 33351

val GL_DEBUG_SOURCE_SHADER_COMPILER: Int = 33352

val GL_DEBUG_SOURCE_THIRD_PARTY: Int = 33353

val GL_DEBUG_SOURCE_APPLICATION: Int = 33354

val GL_DEBUG_SOURCE_OTHER: Int = 33355

val GL_DEBUG_TYPE_ERROR: Int = 33356

val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR: Int = 33357

val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR: Int = 33358

val GL_DEBUG_TYPE_PORTABILITY: Int = 33359

val GL_DEBUG_TYPE_PERFORMANCE: Int = 33360

val GL_DEBUG_TYPE_OTHER: Int = 33361

val GL_MAX_DEBUG_MESSAGE_LENGTH: Int = 37187

val GL_MAX_DEBUG_LOGGED_MESSAGES: Int = 37188

val GL_DEBUG_LOGGED_MESSAGES: Int = 37189

val GL_DEBUG_SEVERITY_HIGH: Int = 37190

val GL_DEBUG_SEVERITY_MEDIUM: Int = 37191

val GL_DEBUG_SEVERITY_LOW: Int = 37192

val GL_DEBUG_TYPE_MARKER: Int = 33384

val GL_DEBUG_TYPE_PUSH_GROUP: Int = 33385

val GL_DEBUG_TYPE_POP_GROUP: Int = 33386

val GL_DEBUG_SEVERITY_NOTIFICATION: Int = 33387

val GL_MAX_DEBUG_GROUP_STACK_DEPTH: Int = 33388

val GL_DEBUG_GROUP_STACK_DEPTH: Int = 33389

val GL_BUFFER: Int = 33504

val GL_SHADER: Int = 33505

val GL_PROGRAM: Int = 33506

val GL_QUERY: Int = 33507

val GL_PROGRAM_PIPELINE: Int = 33508

val GL_SAMPLER: Int = 33510

val GL_MAX_LABEL_LENGTH: Int = 33512

val GL_DEBUG_OUTPUT: Int = 37600

val GL_CONTEXT_FLAG_DEBUG_BIT: Int = 2

val GL_MAX_UNIFORM_LOCATIONS: Int = 33390

val GL_FRAMEBUFFER_DEFAULT_WIDTH: Int = 37648

val GL_FRAMEBUFFER_DEFAULT_HEIGHT: Int = 37649

val GL_FRAMEBUFFER_DEFAULT_LAYERS: Int = 37650

val GL_FRAMEBUFFER_DEFAULT_SAMPLES: Int = 37651

val GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS: Int = 37652

val GL_MAX_FRAMEBUFFER_WIDTH: Int = 37653

val GL_MAX_FRAMEBUFFER_HEIGHT: Int = 37654

val GL_MAX_FRAMEBUFFER_LAYERS: Int = 37655

val GL_MAX_FRAMEBUFFER_SAMPLES: Int = 37656

val GL_INTERNALFORMAT_SUPPORTED: Int = 33391

val GL_INTERNALFORMAT_PREFERRED: Int = 33392

val GL_INTERNALFORMAT_RED_SIZE: Int = 33393

val GL_INTERNALFORMAT_GREEN_SIZE: Int = 33394

val GL_INTERNALFORMAT_BLUE_SIZE: Int = 33395

val GL_INTERNALFORMAT_ALPHA_SIZE: Int = 33396

val GL_INTERNALFORMAT_DEPTH_SIZE: Int = 33397

val GL_INTERNALFORMAT_STENCIL_SIZE: Int = 33398

val GL_INTERNALFORMAT_SHARED_SIZE: Int = 33399

val GL_INTERNALFORMAT_RED_TYPE: Int = 33400

val GL_INTERNALFORMAT_GREEN_TYPE: Int = 33401

val GL_INTERNALFORMAT_BLUE_TYPE: Int = 33402

val GL_INTERNALFORMAT_ALPHA_TYPE: Int = 33403

val GL_INTERNALFORMAT_DEPTH_TYPE: Int = 33404

val GL_INTERNALFORMAT_STENCIL_TYPE: Int = 33405

val GL_MAX_WIDTH: Int = 33406

val GL_MAX_HEIGHT: Int = 33407

val GL_MAX_DEPTH: Int = 33408

val GL_MAX_LAYERS: Int = 33409

val GL_MAX_COMBINED_DIMENSIONS: Int = 33410

val GL_COLOR_COMPONENTS: Int = 33411

val GL_DEPTH_COMPONENTS: Int = 33412

val GL_STENCIL_COMPONENTS: Int = 33413

val GL_COLOR_RENDERABLE: Int = 33414

val GL_DEPTH_RENDERABLE: Int = 33415

val GL_STENCIL_RENDERABLE: Int = 33416

val GL_FRAMEBUFFER_RENDERABLE: Int = 33417

val GL_FRAMEBUFFER_RENDERABLE_LAYERED: Int = 33418

val GL_FRAMEBUFFER_BLEND: Int = 33419

val GL_READ_PIXELS: Int = 33420

val GL_READ_PIXELS_FORMAT: Int = 33421

val GL_READ_PIXELS_TYPE: Int = 33422

val GL_TEXTURE_IMAGE_FORMAT: Int = 33423

val GL_TEXTURE_IMAGE_TYPE: Int = 33424

val GL_GET_TEXTURE_IMAGE_FORMAT: Int = 33425

val GL_GET_TEXTURE_IMAGE_TYPE: Int = 33426

val GL_MIPMAP: Int = 33427

val GL_MANUAL_GENERATE_MIPMAP: Int = 33428

val GL_AUTO_GENERATE_MIPMAP: Int = 33429

val GL_COLOR_ENCODING: Int = 33430

val GL_SRGB_READ: Int = 33431

val GL_SRGB_WRITE: Int = 33432

val GL_FILTER: Int = 33434

val GL_VERTEX_TEXTURE: Int = 33435

val GL_TESS_CONTROL_TEXTURE: Int = 33436

val GL_TESS_EVALUATION_TEXTURE: Int = 33437

val GL_GEOMETRY_TEXTURE: Int = 33438

val GL_FRAGMENT_TEXTURE: Int = 33439

val GL_COMPUTE_TEXTURE: Int = 33440

val GL_TEXTURE_SHADOW: Int = 33441

val GL_TEXTURE_GATHER: Int = 33442

val GL_TEXTURE_GATHER_SHADOW: Int = 33443

val GL_SHADER_IMAGE_LOAD: Int = 33444

val GL_SHADER_IMAGE_STORE: Int = 33445

val GL_SHADER_IMAGE_ATOMIC: Int = 33446

val GL_IMAGE_TEXEL_SIZE: Int = 33447

val GL_IMAGE_COMPATIBILITY_CLASS: Int = 33448

val GL_IMAGE_PIXEL_FORMAT: Int = 33449

val GL_IMAGE_PIXEL_TYPE: Int = 33450

val GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST: Int = 33452

val GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST: Int = 33453

val GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE: Int = 33454

val GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE: Int = 33455

val GL_TEXTURE_COMPRESSED_BLOCK_WIDTH: Int = 33457

val GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT: Int = 33458

val GL_TEXTURE_COMPRESSED_BLOCK_SIZE: Int = 33459

val GL_CLEAR_BUFFER: Int = 33460

val GL_TEXTURE_VIEW: Int = 33461

val GL_VIEW_COMPATIBILITY_CLASS: Int = 33462

val GL_FULL_SUPPORT: Int = 33463

val GL_CAVEAT_SUPPORT: Int = 33464

val GL_IMAGE_CLASS_4_X_32: Int = 33465

val GL_IMAGE_CLASS_2_X_32: Int = 33466

val GL_IMAGE_CLASS_1_X_32: Int = 33467

val GL_IMAGE_CLASS_4_X_16: Int = 33468

val GL_IMAGE_CLASS_2_X_16: Int = 33469

val GL_IMAGE_CLASS_1_X_16: Int = 33470

val GL_IMAGE_CLASS_4_X_8: Int = 33471

val GL_IMAGE_CLASS_2_X_8: Int = 33472

val GL_IMAGE_CLASS_1_X_8: Int = 33473

val GL_IMAGE_CLASS_11_11_10: Int = 33474

val GL_IMAGE_CLASS_10_10_10_2: Int = 33475

val GL_VIEW_CLASS_128_BITS: Int = 33476

val GL_VIEW_CLASS_96_BITS: Int = 33477

val GL_VIEW_CLASS_64_BITS: Int = 33478

val GL_VIEW_CLASS_48_BITS: Int = 33479

val GL_VIEW_CLASS_32_BITS: Int = 33480

val GL_VIEW_CLASS_24_BITS: Int = 33481

val GL_VIEW_CLASS_16_BITS: Int = 33482

val GL_VIEW_CLASS_8_BITS: Int = 33483

val GL_VIEW_CLASS_S3TC_DXT1_RGB: Int = 33484

val GL_VIEW_CLASS_S3TC_DXT1_RGBA: Int = 33485

val GL_VIEW_CLASS_S3TC_DXT3_RGBA: Int = 33486

val GL_VIEW_CLASS_S3TC_DXT5_RGBA: Int = 33487

val GL_VIEW_CLASS_RGTC1_RED: Int = 33488

val GL_VIEW_CLASS_RGTC2_RG: Int = 33489

val GL_VIEW_CLASS_BPTC_UNORM: Int = 33490

val GL_VIEW_CLASS_BPTC_FLOAT: Int = 33491

val GL_UNIFORM: Int = 37601

val GL_UNIFORM_BLOCK: Int = 37602

val GL_PROGRAM_INPUT: Int = 37603

val GL_PROGRAM_OUTPUT: Int = 37604

val GL_BUFFER_VARIABLE: Int = 37605

val GL_SHADER_STORAGE_BLOCK: Int = 37606

val GL_VERTEX_SUBROUTINE: Int = 37608

val GL_TESS_CONTROL_SUBROUTINE: Int = 37609

val GL_TESS_EVALUATION_SUBROUTINE: Int = 37610

val GL_GEOMETRY_SUBROUTINE: Int = 37611

val GL_FRAGMENT_SUBROUTINE: Int = 37612

val GL_COMPUTE_SUBROUTINE: Int = 37613

val GL_VERTEX_SUBROUTINE_UNIFORM: Int = 37614

val GL_TESS_CONTROL_SUBROUTINE_UNIFORM: Int = 37615

val GL_TESS_EVALUATION_SUBROUTINE_UNIFORM: Int = 37616

val GL_GEOMETRY_SUBROUTINE_UNIFORM: Int = 37617

val GL_FRAGMENT_SUBROUTINE_UNIFORM: Int = 37618

val GL_COMPUTE_SUBROUTINE_UNIFORM: Int = 37619

val GL_TRANSFORM_FEEDBACK_VARYING: Int = 37620

val GL_ACTIVE_RESOURCES: Int = 37621

val GL_MAX_NAME_LENGTH: Int = 37622

val GL_MAX_NUM_ACTIVE_VARIABLES: Int = 37623

val GL_MAX_NUM_COMPATIBLE_SUBROUTINES: Int = 37624

val GL_NAME_LENGTH: Int = 37625

val GL_TYPE: Int = 37626

val GL_ARRAY_SIZE: Int = 37627

val GL_OFFSET: Int = 37628

val GL_BLOCK_INDEX: Int = 37629

val GL_ARRAY_STRIDE: Int = 37630

val GL_MATRIX_STRIDE: Int = 37631

val GL_IS_ROW_MAJOR: Int = 37632

val GL_ATOMIC_COUNTER_BUFFER_INDEX: Int = 37633

val GL_BUFFER_BINDING: Int = 37634

val GL_BUFFER_DATA_SIZE: Int = 37635

val GL_NUM_ACTIVE_VARIABLES: Int = 37636

val GL_ACTIVE_VARIABLES: Int = 37637

val GL_REFERENCED_BY_VERTEX_SHADER: Int = 37638

val GL_REFERENCED_BY_TESS_CONTROL_SHADER: Int = 37639

val GL_REFERENCED_BY_TESS_EVALUATION_SHADER: Int = 37640

val GL_REFERENCED_BY_GEOMETRY_SHADER: Int = 37641

val GL_REFERENCED_BY_FRAGMENT_SHADER: Int = 37642

val GL_REFERENCED_BY_COMPUTE_SHADER: Int = 37643

val GL_TOP_LEVEL_ARRAY_SIZE: Int = 37644

val GL_TOP_LEVEL_ARRAY_STRIDE: Int = 37645

val GL_LOCATION: Int = 37646

val GL_LOCATION_INDEX: Int = 37647

val GL_IS_PER_PATCH: Int = 37607

val GL_SHADER_STORAGE_BUFFER: Int = 37074

val GL_SHADER_STORAGE_BUFFER_BINDING: Int = 37075

val GL_SHADER_STORAGE_BUFFER_START: Int = 37076

val GL_SHADER_STORAGE_BUFFER_SIZE: Int = 37077

val GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS: Int = 37078

val GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS: Int = 37079

val GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS: Int = 37080

val GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS: Int = 37081

val GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS: Int = 37082

val GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS: Int = 37083

val GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS: Int = 37084

val GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS: Int = 37085

val GL_MAX_SHADER_STORAGE_BLOCK_SIZE: Int = 37086

val GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT: Int = 37087

val GL_SHADER_STORAGE_BARRIER_BIT: Int = 8192

val GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES: Int = 36665

val GL_DEPTH_STENCIL_TEXTURE_MODE: Int = 37098

val GL_TEXTURE_BUFFER_OFFSET: Int = 37277

val GL_TEXTURE_BUFFER_SIZE: Int = 37278

val GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT: Int = 37279

val GL_TEXTURE_VIEW_MIN_LEVEL: Int = 33499

val GL_TEXTURE_VIEW_NUM_LEVELS: Int = 33500

val GL_TEXTURE_VIEW_MIN_LAYER: Int = 33501

val GL_TEXTURE_VIEW_NUM_LAYERS: Int = 33502

val GL_TEXTURE_IMMUTABLE_LEVELS: Int = 33503

val GL_VERTEX_ATTRIB_BINDING: Int = 33492

val GL_VERTEX_ATTRIB_RELATIVE_OFFSET: Int = 33493

val GL_VERTEX_BINDING_DIVISOR: Int = 33494

val GL_VERTEX_BINDING_OFFSET: Int = 33495

val GL_VERTEX_BINDING_STRIDE: Int = 33496

val GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET: Int = 33497

val GL_MAX_VERTEX_ATTRIB_BINDINGS: Int = 33498

val GL_VERTEX_BINDING_BUFFER: Int = 36687

val GL_DISPLAY_LIST: Int = 33511

val GL_VERSION_4_4: Int = 1

val GL_MAX_VERTEX_ATTRIB_STRIDE: Int = 33509

val GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED: Int = 33313

val GL_TEXTURE_BUFFER_BINDING: Int = 35882

val GL_MAP_PERSISTENT_BIT: Int = 64

val GL_MAP_COHERENT_BIT: Int = 128

val GL_DYNAMIC_STORAGE_BIT: Int = 256

val GL_CLIENT_STORAGE_BIT: Int = 512

val GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT: Int = 16384

val GL_BUFFER_IMMUTABLE_STORAGE: Int = 33311

val GL_BUFFER_STORAGE_FLAGS: Int = 33312

val GL_CLEAR_TEXTURE: Int = 37733

val GL_LOCATION_COMPONENT: Int = 37706

val GL_TRANSFORM_FEEDBACK_BUFFER_INDEX: Int = 37707

val GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE: Int = 37708

val GL_QUERY_BUFFER: Int = 37266

val GL_QUERY_BUFFER_BARRIER_BIT: Int = 32768

val GL_QUERY_BUFFER_BINDING: Int = 37267

val GL_QUERY_RESULT_NO_WAIT: Int = 37268

val GL_MIRROR_CLAMP_TO_EDGE: Int = 34627

val GL_VERSION_4_5: Int = 1

val GL_CONTEXT_LOST: Int = 1287

val GL_NEGATIVE_ONE_TO_ONE: Int = 37726

val GL_ZERO_TO_ONE: Int = 37727

val GL_CLIP_ORIGIN: Int = 37724

val GL_CLIP_DEPTH_MODE: Int = 37725

val GL_QUERY_WAIT_INVERTED: Int = 36375

val GL_QUERY_NO_WAIT_INVERTED: Int = 36376

val GL_QUERY_BY_REGION_WAIT_INVERTED: Int = 36377

val GL_QUERY_BY_REGION_NO_WAIT_INVERTED: Int = 36378

val GL_MAX_CULL_DISTANCES: Int = 33529

val GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES: Int = 33530

val GL_TEXTURE_TARGET: Int = 4102

val GL_QUERY_TARGET: Int = 33514

val GL_GUILTY_CONTEXT_RESET: Int = 33363

val GL_INNOCENT_CONTEXT_RESET: Int = 33364

val GL_UNKNOWN_CONTEXT_RESET: Int = 33365

val GL_RESET_NOTIFICATION_STRATEGY: Int = 33366

val GL_LOSE_CONTEXT_ON_RESET: Int = 33362

val GL_NO_RESET_NOTIFICATION: Int = 33377

val GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT: Int = 4

val GL_CONTEXT_RELEASE_BEHAVIOR: Int = 33531

val GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH: Int = 33532

val GL_ARB_ES2_compatibility: Int = 1

val GL_ARB_ES3_1_compatibility: Int = 1

val GL_ARB_ES3_2_compatibility: Int = 1

val GL_PRIMITIVE_BOUNDING_BOX_ARB: Int = 37566

val GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB: Int = 37761

val GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB: Int = 37762

val GL_ARB_ES3_compatibility: Int = 1

val GL_ARB_arrays_of_arrays: Int = 1

val GL_ARB_base_instance: Int = 1

val GL_ARB_bindless_texture: Int = 1

val GL_UNSIGNED_INT64_ARB: Int = 5135

val GL_ARB_blend_func_extended: Int = 1

val GL_ARB_buffer_storage: Int = 1

val GL_ARB_cl_event: Int = 1

val GL_SYNC_CL_EVENT_ARB: Int = 33344

val GL_SYNC_CL_EVENT_COMPLETE_ARB: Int = 33345

val GL_ARB_clear_buffer_object: Int = 1

val GL_ARB_clear_texture: Int = 1

val GL_ARB_clip_control: Int = 1

val GL_ARB_color_buffer_float: Int = 1

val GL_RGBA_FLOAT_MODE_ARB: Int = 34848

val GL_CLAMP_VERTEX_COLOR_ARB: Int = 35098

val GL_CLAMP_FRAGMENT_COLOR_ARB: Int = 35099

val GL_CLAMP_READ_COLOR_ARB: Int = 35100

val GL_FIXED_ONLY_ARB: Int = 35101

val GL_ARB_compatibility: Int = 1

val GL_ARB_compressed_texture_pixel_storage: Int = 1

val GL_ARB_compute_shader: Int = 1

val GL_ARB_compute_variable_group_size: Int = 1

val GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB: Int = 37700

val GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB: Int = 37099

val GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB: Int = 37701

val GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB: Int = 37311

val GL_ARB_conditional_render_inverted: Int = 1

val GL_ARB_conservative_depth: Int = 1

val GL_ARB_copy_buffer: Int = 1

val GL_ARB_copy_image: Int = 1

val GL_ARB_cull_distance: Int = 1

val GL_ARB_debug_output: Int = 1

val GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB: Int = 33346

val GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB: Int = 33347

val GL_DEBUG_CALLBACK_FUNCTION_ARB: Int = 33348

val GL_DEBUG_CALLBACK_USER_PARAM_ARB: Int = 33349

val GL_DEBUG_SOURCE_API_ARB: Int = 33350

val GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB: Int = 33351

val GL_DEBUG_SOURCE_SHADER_COMPILER_ARB: Int = 33352

val GL_DEBUG_SOURCE_THIRD_PARTY_ARB: Int = 33353

val GL_DEBUG_SOURCE_APPLICATION_ARB: Int = 33354

val GL_DEBUG_SOURCE_OTHER_ARB: Int = 33355

val GL_DEBUG_TYPE_ERROR_ARB: Int = 33356

val GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB: Int = 33357

val GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB: Int = 33358

val GL_DEBUG_TYPE_PORTABILITY_ARB: Int = 33359

val GL_DEBUG_TYPE_PERFORMANCE_ARB: Int = 33360

val GL_DEBUG_TYPE_OTHER_ARB: Int = 33361

val GL_MAX_DEBUG_MESSAGE_LENGTH_ARB: Int = 37187

val GL_MAX_DEBUG_LOGGED_MESSAGES_ARB: Int = 37188

val GL_DEBUG_LOGGED_MESSAGES_ARB: Int = 37189

val GL_DEBUG_SEVERITY_HIGH_ARB: Int = 37190

val GL_DEBUG_SEVERITY_MEDIUM_ARB: Int = 37191

val GL_DEBUG_SEVERITY_LOW_ARB: Int = 37192

val GL_ARB_depth_buffer_float: Int = 1

val GL_ARB_depth_clamp: Int = 1

val GL_ARB_depth_texture: Int = 1

val GL_DEPTH_COMPONENT16_ARB: Int = 33189

val GL_DEPTH_COMPONENT24_ARB: Int = 33190

val GL_DEPTH_COMPONENT32_ARB: Int = 33191

val GL_TEXTURE_DEPTH_SIZE_ARB: Int = 34890

val GL_DEPTH_TEXTURE_MODE_ARB: Int = 34891

val GL_ARB_derivative_control: Int = 1

val GL_ARB_direct_state_access: Int = 1

val GL_ARB_draw_buffers: Int = 1

val GL_MAX_DRAW_BUFFERS_ARB: Int = 34852

val GL_DRAW_BUFFER0_ARB: Int = 34853

val GL_DRAW_BUFFER1_ARB: Int = 34854

val GL_DRAW_BUFFER2_ARB: Int = 34855

val GL_DRAW_BUFFER3_ARB: Int = 34856

val GL_DRAW_BUFFER4_ARB: Int = 34857

val GL_DRAW_BUFFER5_ARB: Int = 34858

val GL_DRAW_BUFFER6_ARB: Int = 34859

val GL_DRAW_BUFFER7_ARB: Int = 34860

val GL_DRAW_BUFFER8_ARB: Int = 34861

val GL_DRAW_BUFFER9_ARB: Int = 34862

val GL_DRAW_BUFFER10_ARB: Int = 34863

val GL_DRAW_BUFFER11_ARB: Int = 34864

val GL_DRAW_BUFFER12_ARB: Int = 34865

val GL_DRAW_BUFFER13_ARB: Int = 34866

val GL_DRAW_BUFFER14_ARB: Int = 34867

val GL_DRAW_BUFFER15_ARB: Int = 34868

val GL_ARB_draw_buffers_blend: Int = 1

val GL_ARB_draw_elements_base_vertex: Int = 1

val GL_ARB_draw_indirect: Int = 1

val GL_ARB_draw_instanced: Int = 1

val GL_ARB_enhanced_layouts: Int = 1

val GL_ARB_explicit_attrib_location: Int = 1

val GL_ARB_explicit_uniform_location: Int = 1

val GL_ARB_fragment_coord_conventions: Int = 1

val GL_ARB_fragment_layer_viewport: Int = 1

val GL_ARB_fragment_program: Int = 1

val GL_FRAGMENT_PROGRAM_ARB: Int = 34820

val GL_PROGRAM_FORMAT_ASCII_ARB: Int = 34933

val GL_PROGRAM_LENGTH_ARB: Int = 34343

val GL_PROGRAM_FORMAT_ARB: Int = 34934

val GL_PROGRAM_BINDING_ARB: Int = 34423

val GL_PROGRAM_INSTRUCTIONS_ARB: Int = 34976

val GL_MAX_PROGRAM_INSTRUCTIONS_ARB: Int = 34977

val GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB: Int = 34978

val GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB: Int = 34979

val GL_PROGRAM_TEMPORARIES_ARB: Int = 34980

val GL_MAX_PROGRAM_TEMPORARIES_ARB: Int = 34981

val GL_PROGRAM_NATIVE_TEMPORARIES_ARB: Int = 34982

val GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB: Int = 34983

val GL_PROGRAM_PARAMETERS_ARB: Int = 34984

val GL_MAX_PROGRAM_PARAMETERS_ARB: Int = 34985

val GL_PROGRAM_NATIVE_PARAMETERS_ARB: Int = 34986

val GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB: Int = 34987

val GL_PROGRAM_ATTRIBS_ARB: Int = 34988

val GL_MAX_PROGRAM_ATTRIBS_ARB: Int = 34989

val GL_PROGRAM_NATIVE_ATTRIBS_ARB: Int = 34990

val GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB: Int = 34991

val GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB: Int = 34996

val GL_MAX_PROGRAM_ENV_PARAMETERS_ARB: Int = 34997

val GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB: Int = 34998

val GL_PROGRAM_ALU_INSTRUCTIONS_ARB: Int = 34821

val GL_PROGRAM_TEX_INSTRUCTIONS_ARB: Int = 34822

val GL_PROGRAM_TEX_INDIRECTIONS_ARB: Int = 34823

val GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB: Int = 34824

val GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB: Int = 34825

val GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB: Int = 34826

val GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB: Int = 34827

val GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB: Int = 34828

val GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB: Int = 34829

val GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB: Int = 34830

val GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB: Int = 34831

val GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB: Int = 34832

val GL_PROGRAM_STRING_ARB: Int = 34344

val GL_PROGRAM_ERROR_POSITION_ARB: Int = 34379

val GL_CURRENT_MATRIX_ARB: Int = 34369

val GL_TRANSPOSE_CURRENT_MATRIX_ARB: Int = 34999

val GL_CURRENT_MATRIX_STACK_DEPTH_ARB: Int = 34368

val GL_MAX_PROGRAM_MATRICES_ARB: Int = 34351

val GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB: Int = 34350

val GL_MAX_TEXTURE_COORDS_ARB: Int = 34929

val GL_MAX_TEXTURE_IMAGE_UNITS_ARB: Int = 34930

val GL_PROGRAM_ERROR_STRING_ARB: Int = 34932

val GL_MATRIX0_ARB: Int = 35008

val GL_MATRIX1_ARB: Int = 35009

val GL_MATRIX2_ARB: Int = 35010

val GL_MATRIX3_ARB: Int = 35011

val GL_MATRIX4_ARB: Int = 35012

val GL_MATRIX5_ARB: Int = 35013

val GL_MATRIX6_ARB: Int = 35014

val GL_MATRIX7_ARB: Int = 35015

val GL_MATRIX8_ARB: Int = 35016

val GL_MATRIX9_ARB: Int = 35017

val GL_MATRIX10_ARB: Int = 35018

val GL_MATRIX11_ARB: Int = 35019

val GL_MATRIX12_ARB: Int = 35020

val GL_MATRIX13_ARB: Int = 35021

val GL_MATRIX14_ARB: Int = 35022

val GL_MATRIX15_ARB: Int = 35023

val GL_MATRIX16_ARB: Int = 35024

val GL_MATRIX17_ARB: Int = 35025

val GL_MATRIX18_ARB: Int = 35026

val GL_MATRIX19_ARB: Int = 35027

val GL_MATRIX20_ARB: Int = 35028

val GL_MATRIX21_ARB: Int = 35029

val GL_MATRIX22_ARB: Int = 35030

val GL_MATRIX23_ARB: Int = 35031

val GL_MATRIX24_ARB: Int = 35032

val GL_MATRIX25_ARB: Int = 35033

val GL_MATRIX26_ARB: Int = 35034

val GL_MATRIX27_ARB: Int = 35035

val GL_MATRIX28_ARB: Int = 35036

val GL_MATRIX29_ARB: Int = 35037

val GL_MATRIX30_ARB: Int = 35038

val GL_MATRIX31_ARB: Int = 35039

val GL_ARB_fragment_program_shadow: Int = 1

val GL_ARB_fragment_shader: Int = 1

val GL_FRAGMENT_SHADER_ARB: Int = 35632

val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB: Int = 35657

val GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB: Int = 35723

val GL_ARB_fragment_shader_interlock: Int = 1

val GL_ARB_framebuffer_no_attachments: Int = 1

val GL_ARB_framebuffer_object: Int = 1

val GL_ARB_framebuffer_sRGB: Int = 1

val GL_ARB_geometry_shader4: Int = 1

val GL_LINES_ADJACENCY_ARB: Int = 10

val GL_LINE_STRIP_ADJACENCY_ARB: Int = 11

val GL_TRIANGLES_ADJACENCY_ARB: Int = 12

val GL_TRIANGLE_STRIP_ADJACENCY_ARB: Int = 13

val GL_PROGRAM_POINT_SIZE_ARB: Int = 34370

val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB: Int = 35881

val GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB: Int = 36263

val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB: Int = 36264

val GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB: Int = 36265

val GL_GEOMETRY_SHADER_ARB: Int = 36313

val GL_GEOMETRY_VERTICES_OUT_ARB: Int = 36314

val GL_GEOMETRY_INPUT_TYPE_ARB: Int = 36315

val GL_GEOMETRY_OUTPUT_TYPE_ARB: Int = 36316

val GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB: Int = 36317

val GL_MAX_VERTEX_VARYING_COMPONENTS_ARB: Int = 36318

val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB: Int = 36319

val GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB: Int = 36320

val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB: Int = 36321

val GL_ARB_get_program_binary: Int = 1

val GL_ARB_get_texture_sub_image: Int = 1

val GL_ARB_gpu_shader5: Int = 1

val GL_ARB_gpu_shader_fp64: Int = 1

val GL_ARB_gpu_shader_int64: Int = 1

val GL_INT64_ARB: Int = 5134

val GL_INT64_VEC2_ARB: Int = 36841

val GL_INT64_VEC3_ARB: Int = 36842

val GL_INT64_VEC4_ARB: Int = 36843

val GL_UNSIGNED_INT64_VEC2_ARB: Int = 36853

val GL_UNSIGNED_INT64_VEC3_ARB: Int = 36854

val GL_UNSIGNED_INT64_VEC4_ARB: Int = 36855

val GL_ARB_half_float_pixel: Int = 1

val GL_HALF_FLOAT_ARB: Int = 5131

val GL_ARB_half_float_vertex: Int = 1

val GL_ARB_indirect_parameters: Int = 1

val GL_PARAMETER_BUFFER_ARB: Int = 33006

val GL_PARAMETER_BUFFER_BINDING_ARB: Int = 33007

val GL_ARB_instanced_arrays: Int = 1

val GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB: Int = 35070

val GL_ARB_internalformat_query: Int = 1

val GL_ARB_internalformat_query2: Int = 1

val GL_SRGB_DECODE_ARB: Int = 33433

val GL_ARB_invalidate_subdata: Int = 1

val GL_ARB_map_buffer_alignment: Int = 1

val GL_ARB_map_buffer_range: Int = 1

val GL_ARB_matrix_palette: Int = 1

val GL_MATRIX_PALETTE_ARB: Int = 34880

val GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB: Int = 34881

val GL_MAX_PALETTE_MATRICES_ARB: Int = 34882

val GL_CURRENT_PALETTE_MATRIX_ARB: Int = 34883

val GL_MATRIX_INDEX_ARRAY_ARB: Int = 34884

val GL_CURRENT_MATRIX_INDEX_ARB: Int = 34885

val GL_MATRIX_INDEX_ARRAY_SIZE_ARB: Int = 34886

val GL_MATRIX_INDEX_ARRAY_TYPE_ARB: Int = 34887

val GL_MATRIX_INDEX_ARRAY_STRIDE_ARB: Int = 34888

val GL_MATRIX_INDEX_ARRAY_POINTER_ARB: Int = 34889

val GL_ARB_multi_bind: Int = 1

val GL_ARB_multi_draw_indirect: Int = 1

val GL_ARB_multisample: Int = 1

val GL_MULTISAMPLE_ARB: Int = 32925

val GL_SAMPLE_ALPHA_TO_COVERAGE_ARB: Int = 32926

val GL_SAMPLE_ALPHA_TO_ONE_ARB: Int = 32927

val GL_SAMPLE_COVERAGE_ARB: Int = 32928

val GL_SAMPLE_BUFFERS_ARB: Int = 32936

val GL_SAMPLES_ARB: Int = 32937

val GL_SAMPLE_COVERAGE_VALUE_ARB: Int = 32938

val GL_SAMPLE_COVERAGE_INVERT_ARB: Int = 32939

val GL_MULTISAMPLE_BIT_ARB: Int = 536870912

val GL_ARB_occlusion_query: Int = 1

val GL_QUERY_COUNTER_BITS_ARB: Int = 34916

val GL_CURRENT_QUERY_ARB: Int = 34917

val GL_QUERY_RESULT_ARB: Int = 34918

val GL_QUERY_RESULT_AVAILABLE_ARB: Int = 34919

val GL_SAMPLES_PASSED_ARB: Int = 35092

val GL_ARB_occlusion_query2: Int = 1

val GL_ARB_parallel_shader_compile: Int = 1

val GL_MAX_SHADER_COMPILER_THREADS_ARB: Int = 37296

val GL_COMPLETION_STATUS_ARB: Int = 37297

val GL_ARB_pipeline_statistics_query: Int = 1

val GL_VERTICES_SUBMITTED_ARB: Int = 33518

val GL_PRIMITIVES_SUBMITTED_ARB: Int = 33519

val GL_VERTEX_SHADER_INVOCATIONS_ARB: Int = 33520

val GL_TESS_CONTROL_SHADER_PATCHES_ARB: Int = 33521

val GL_TESS_EVALUATION_SHADER_INVOCATIONS_ARB: Int = 33522

val GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB: Int = 33523

val GL_FRAGMENT_SHADER_INVOCATIONS_ARB: Int = 33524

val GL_COMPUTE_SHADER_INVOCATIONS_ARB: Int = 33525

val GL_CLIPPING_INPUT_PRIMITIVES_ARB: Int = 33526

val GL_CLIPPING_OUTPUT_PRIMITIVES_ARB: Int = 33527

val GL_ARB_pixel_buffer_object: Int = 1

val GL_PIXEL_PACK_BUFFER_ARB: Int = 35051

val GL_PIXEL_UNPACK_BUFFER_ARB: Int = 35052

val GL_PIXEL_PACK_BUFFER_BINDING_ARB: Int = 35053

val GL_PIXEL_UNPACK_BUFFER_BINDING_ARB: Int = 35055

val GL_ARB_point_parameters: Int = 1

val GL_POINT_SIZE_MIN_ARB: Int = 33062

val GL_POINT_SIZE_MAX_ARB: Int = 33063

val GL_POINT_FADE_THRESHOLD_SIZE_ARB: Int = 33064

val GL_POINT_DISTANCE_ATTENUATION_ARB: Int = 33065

val GL_ARB_point_sprite: Int = 1

val GL_POINT_SPRITE_ARB: Int = 34913

val GL_COORD_REPLACE_ARB: Int = 34914

val GL_ARB_post_depth_coverage: Int = 1

val GL_ARB_program_interface_query: Int = 1

val GL_ARB_provoking_vertex: Int = 1

val GL_ARB_query_buffer_object: Int = 1

val GL_ARB_robust_buffer_access_behavior: Int = 1

val GL_ARB_robustness: Int = 1

val GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB: Int = 4

val GL_LOSE_CONTEXT_ON_RESET_ARB: Int = 33362

val GL_GUILTY_CONTEXT_RESET_ARB: Int = 33363

val GL_INNOCENT_CONTEXT_RESET_ARB: Int = 33364

val GL_UNKNOWN_CONTEXT_RESET_ARB: Int = 33365

val GL_RESET_NOTIFICATION_STRATEGY_ARB: Int = 33366

val GL_NO_RESET_NOTIFICATION_ARB: Int = 33377

val GL_ARB_robustness_isolation: Int = 1

val GL_ARB_sample_locations: Int = 1

val GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB: Int = 37693

val GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB: Int = 37694

val GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB: Int = 37695

val GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB: Int = 37696

val GL_SAMPLE_LOCATION_ARB: Int = 36432

val GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB: Int = 37697

val GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB: Int = 37698

val GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB: Int = 37699

val GL_ARB_sample_shading: Int = 1

val GL_SAMPLE_SHADING_ARB: Int = 35894

val GL_MIN_SAMPLE_SHADING_VALUE_ARB: Int = 35895

val GL_ARB_sampler_objects: Int = 1

val GL_ARB_seamless_cube_map: Int = 1

val GL_ARB_seamless_cubemap_per_texture: Int = 1

val GL_ARB_separate_shader_objects: Int = 1

val GL_ARB_shader_atomic_counter_ops: Int = 1

val GL_ARB_shader_atomic_counters: Int = 1

val GL_ARB_shader_ballot: Int = 1

val GL_ARB_shader_bit_encoding: Int = 1

val GL_ARB_shader_clock: Int = 1

val GL_ARB_shader_draw_parameters: Int = 1

val GL_ARB_shader_group_vote: Int = 1

val GL_ARB_shader_image_load_store: Int = 1

val GL_ARB_shader_image_size: Int = 1

val GL_ARB_shader_objects: Int = 1

val GL_PROGRAM_OBJECT_ARB: Int = 35648

val GL_SHADER_OBJECT_ARB: Int = 35656

val GL_OBJECT_TYPE_ARB: Int = 35662

val GL_OBJECT_SUBTYPE_ARB: Int = 35663

val GL_FLOAT_VEC2_ARB: Int = 35664

val GL_FLOAT_VEC3_ARB: Int = 35665

val GL_FLOAT_VEC4_ARB: Int = 35666

val GL_INT_VEC2_ARB: Int = 35667

val GL_INT_VEC3_ARB: Int = 35668

val GL_INT_VEC4_ARB: Int = 35669

val GL_BOOL_ARB: Int = 35670

val GL_BOOL_VEC2_ARB: Int = 35671

val GL_BOOL_VEC3_ARB: Int = 35672

val GL_BOOL_VEC4_ARB: Int = 35673

val GL_FLOAT_MAT2_ARB: Int = 35674

val GL_FLOAT_MAT3_ARB: Int = 35675

val GL_FLOAT_MAT4_ARB: Int = 35676

val GL_SAMPLER_1D_ARB: Int = 35677

val GL_SAMPLER_2D_ARB: Int = 35678

val GL_SAMPLER_3D_ARB: Int = 35679

val GL_SAMPLER_CUBE_ARB: Int = 35680

val GL_SAMPLER_1D_SHADOW_ARB: Int = 35681

val GL_SAMPLER_2D_SHADOW_ARB: Int = 35682

val GL_SAMPLER_2D_RECT_ARB: Int = 35683

val GL_SAMPLER_2D_RECT_SHADOW_ARB: Int = 35684

val GL_OBJECT_DELETE_STATUS_ARB: Int = 35712

val GL_OBJECT_COMPILE_STATUS_ARB: Int = 35713

val GL_OBJECT_LINK_STATUS_ARB: Int = 35714

val GL_OBJECT_VALIDATE_STATUS_ARB: Int = 35715

val GL_OBJECT_INFO_LOG_LENGTH_ARB: Int = 35716

val GL_OBJECT_ATTACHED_OBJECTS_ARB: Int = 35717

val GL_OBJECT_ACTIVE_UNIFORMS_ARB: Int = 35718

val GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB: Int = 35719

val GL_OBJECT_SHADER_SOURCE_LENGTH_ARB: Int = 35720

val GL_ARB_shader_precision: Int = 1

val GL_ARB_shader_stencil_export: Int = 1

val GL_ARB_shader_storage_buffer_object: Int = 1

val GL_ARB_shader_subroutine: Int = 1

val GL_ARB_shader_texture_image_samples: Int = 1

val GL_ARB_shader_texture_lod: Int = 1

val GL_ARB_shader_viewport_layer_array: Int = 1

val GL_ARB_shading_language_100: Int = 1

val GL_SHADING_LANGUAGE_VERSION_ARB: Int = 35724

val GL_ARB_shading_language_420pack: Int = 1

val GL_ARB_shading_language_include: Int = 1

val GL_SHADER_INCLUDE_ARB: Int = 36270

val GL_NAMED_STRING_LENGTH_ARB: Int = 36329

val GL_NAMED_STRING_TYPE_ARB: Int = 36330

val GL_ARB_shading_language_packing: Int = 1

val GL_ARB_shadow: Int = 1

val GL_TEXTURE_COMPARE_MODE_ARB: Int = 34892

val GL_TEXTURE_COMPARE_FUNC_ARB: Int = 34893

val GL_COMPARE_R_TO_TEXTURE_ARB: Int = 34894

val GL_ARB_shadow_ambient: Int = 1

val GL_TEXTURE_COMPARE_FAIL_VALUE_ARB: Int = 32959

val GL_ARB_sparse_buffer: Int = 1

val GL_SPARSE_STORAGE_BIT_ARB: Int = 1024

val GL_SPARSE_BUFFER_PAGE_SIZE_ARB: Int = 33528

val GL_ARB_sparse_texture: Int = 1

val GL_TEXTURE_SPARSE_ARB: Int = 37286

val GL_VIRTUAL_PAGE_SIZE_INDEX_ARB: Int = 37287

val GL_NUM_SPARSE_LEVELS_ARB: Int = 37290

val GL_NUM_VIRTUAL_PAGE_SIZES_ARB: Int = 37288

val GL_VIRTUAL_PAGE_SIZE_X_ARB: Int = 37269

val GL_VIRTUAL_PAGE_SIZE_Y_ARB: Int = 37270

val GL_VIRTUAL_PAGE_SIZE_Z_ARB: Int = 37271

val GL_MAX_SPARSE_TEXTURE_SIZE_ARB: Int = 37272

val GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB: Int = 37273

val GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB: Int = 37274

val GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB: Int = 37289

val GL_ARB_sparse_texture2: Int = 1

val GL_ARB_sparse_texture_clamp: Int = 1

val GL_ARB_stencil_texturing: Int = 1

val GL_ARB_sync: Int = 1

val GL_ARB_tessellation_shader: Int = 1

val GL_ARB_texture_barrier: Int = 1

val GL_ARB_texture_border_clamp: Int = 1

val GL_CLAMP_TO_BORDER_ARB: Int = 33069

val GL_ARB_texture_buffer_object: Int = 1

val GL_TEXTURE_BUFFER_ARB: Int = 35882

val GL_MAX_TEXTURE_BUFFER_SIZE_ARB: Int = 35883

val GL_TEXTURE_BINDING_BUFFER_ARB: Int = 35884

val GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB: Int = 35885

val GL_TEXTURE_BUFFER_FORMAT_ARB: Int = 35886

val GL_ARB_texture_buffer_object_rgb32: Int = 1

val GL_ARB_texture_buffer_range: Int = 1

val GL_ARB_texture_compression: Int = 1

val GL_COMPRESSED_ALPHA_ARB: Int = 34025

val GL_COMPRESSED_LUMINANCE_ARB: Int = 34026

val GL_COMPRESSED_LUMINANCE_ALPHA_ARB: Int = 34027

val GL_COMPRESSED_INTENSITY_ARB: Int = 34028

val GL_COMPRESSED_RGB_ARB: Int = 34029

val GL_COMPRESSED_RGBA_ARB: Int = 34030

val GL_TEXTURE_COMPRESSION_HINT_ARB: Int = 34031

val GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB: Int = 34464

val GL_TEXTURE_COMPRESSED_ARB: Int = 34465

val GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB: Int = 34466

val GL_COMPRESSED_TEXTURE_FORMATS_ARB: Int = 34467

val GL_ARB_texture_compression_bptc: Int = 1

val GL_COMPRESSED_RGBA_BPTC_UNORM_ARB: Int = 36492

val GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB: Int = 36493

val GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB: Int = 36494

val GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB: Int = 36495

val GL_ARB_texture_compression_rgtc: Int = 1

val GL_ARB_texture_cube_map: Int = 1

val GL_NORMAL_MAP_ARB: Int = 34065

val GL_REFLECTION_MAP_ARB: Int = 34066

val GL_TEXTURE_CUBE_MAP_ARB: Int = 34067

val GL_TEXTURE_BINDING_CUBE_MAP_ARB: Int = 34068

val GL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB: Int = 34069

val GL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB: Int = 34070

val GL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB: Int = 34071

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB: Int = 34072

val GL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB: Int = 34073

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB: Int = 34074

val GL_PROXY_TEXTURE_CUBE_MAP_ARB: Int = 34075

val GL_MAX_CUBE_MAP_TEXTURE_SIZE_ARB: Int = 34076

val GL_ARB_texture_cube_map_array: Int = 1

val GL_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36873

val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB: Int = 36874

val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB: Int = 36875

val GL_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36876

val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB: Int = 36877

val GL_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36878

val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB: Int = 36879

val GL_ARB_texture_env_add: Int = 1

val GL_ARB_texture_env_combine: Int = 1

val GL_COMBINE_ARB: Int = 34160

val GL_COMBINE_RGB_ARB: Int = 34161

val GL_COMBINE_ALPHA_ARB: Int = 34162

val GL_SOURCE0_RGB_ARB: Int = 34176

val GL_SOURCE1_RGB_ARB: Int = 34177

val GL_SOURCE2_RGB_ARB: Int = 34178

val GL_SOURCE0_ALPHA_ARB: Int = 34184

val GL_SOURCE1_ALPHA_ARB: Int = 34185

val GL_SOURCE2_ALPHA_ARB: Int = 34186

val GL_OPERAND0_RGB_ARB: Int = 34192

val GL_OPERAND1_RGB_ARB: Int = 34193

val GL_OPERAND2_RGB_ARB: Int = 34194

val GL_OPERAND0_ALPHA_ARB: Int = 34200

val GL_OPERAND1_ALPHA_ARB: Int = 34201

val GL_OPERAND2_ALPHA_ARB: Int = 34202

val GL_RGB_SCALE_ARB: Int = 34163

val GL_ADD_SIGNED_ARB: Int = 34164

val GL_INTERPOLATE_ARB: Int = 34165

val GL_SUBTRACT_ARB: Int = 34023

val GL_CONSTANT_ARB: Int = 34166

val GL_PRIMARY_COLOR_ARB: Int = 34167

val GL_PREVIOUS_ARB: Int = 34168

val GL_ARB_texture_env_crossbar: Int = 1

val GL_ARB_texture_env_dot3: Int = 1

val GL_DOT3_RGB_ARB: Int = 34478

val GL_DOT3_RGBA_ARB: Int = 34479

val GL_ARB_texture_filter_minmax: Int = 1

val GL_TEXTURE_REDUCTION_MODE_ARB: Int = 37734

val GL_WEIGHTED_AVERAGE_ARB: Int = 37735

val GL_ARB_texture_float: Int = 1

val GL_TEXTURE_RED_TYPE_ARB: Int = 35856

val GL_TEXTURE_GREEN_TYPE_ARB: Int = 35857

val GL_TEXTURE_BLUE_TYPE_ARB: Int = 35858

val GL_TEXTURE_ALPHA_TYPE_ARB: Int = 35859

val GL_TEXTURE_LUMINANCE_TYPE_ARB: Int = 35860

val GL_TEXTURE_INTENSITY_TYPE_ARB: Int = 35861

val GL_TEXTURE_DEPTH_TYPE_ARB: Int = 35862

val GL_UNSIGNED_NORMALIZED_ARB: Int = 35863

val GL_RGBA32F_ARB: Int = 34836

val GL_RGB32F_ARB: Int = 34837

val GL_ALPHA32F_ARB: Int = 34838

val GL_INTENSITY32F_ARB: Int = 34839

val GL_LUMINANCE32F_ARB: Int = 34840

val GL_LUMINANCE_ALPHA32F_ARB: Int = 34841

val GL_RGBA16F_ARB: Int = 34842

val GL_RGB16F_ARB: Int = 34843

val GL_ALPHA16F_ARB: Int = 34844

val GL_INTENSITY16F_ARB: Int = 34845

val GL_LUMINANCE16F_ARB: Int = 34846

val GL_LUMINANCE_ALPHA16F_ARB: Int = 34847

val GL_ARB_texture_gather: Int = 1

val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36446

val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB: Int = 36447

val GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB: Int = 36767

val GL_ARB_texture_mirror_clamp_to_edge: Int = 1

val GL_ARB_texture_mirrored_repeat: Int = 1

val GL_MIRRORED_REPEAT_ARB: Int = 33648

val GL_ARB_texture_multisample: Int = 1

val GL_ARB_texture_non_power_of_two: Int = 1

val GL_ARB_texture_query_levels: Int = 1

val GL_ARB_texture_query_lod: Int = 1

val GL_ARB_texture_rectangle: Int = 1

val GL_TEXTURE_RECTANGLE_ARB: Int = 34037

val GL_TEXTURE_BINDING_RECTANGLE_ARB: Int = 34038

val GL_PROXY_TEXTURE_RECTANGLE_ARB: Int = 34039

val GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB: Int = 34040

val GL_ARB_texture_rg: Int = 1

val GL_ARB_texture_rgb10_a2ui: Int = 1

val GL_ARB_texture_stencil8: Int = 1

val GL_ARB_texture_storage: Int = 1

val GL_ARB_texture_storage_multisample: Int = 1

val GL_ARB_texture_swizzle: Int = 1

val GL_ARB_texture_view: Int = 1

val GL_ARB_timer_query: Int = 1

val GL_ARB_transform_feedback2: Int = 1

val GL_ARB_transform_feedback3: Int = 1

val GL_ARB_transform_feedback_instanced: Int = 1

val GL_ARB_transform_feedback_overflow_query: Int = 1

val GL_TRANSFORM_FEEDBACK_OVERFLOW_ARB: Int = 33516

val GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW_ARB: Int = 33517

val GL_ARB_transpose_matrix: Int = 1

val GL_TRANSPOSE_MODELVIEW_MATRIX_ARB: Int = 34019

val GL_TRANSPOSE_PROJECTION_MATRIX_ARB: Int = 34020

val GL_TRANSPOSE_TEXTURE_MATRIX_ARB: Int = 34021

val GL_TRANSPOSE_COLOR_MATRIX_ARB: Int = 34022

val GL_ARB_uniform_buffer_object: Int = 1

val GL_ARB_vertex_array_bgra: Int = 1

val GL_ARB_vertex_array_object: Int = 1

val GL_ARB_vertex_attrib_64bit: Int = 1

val GL_ARB_vertex_attrib_binding: Int = 1

val GL_ARB_vertex_blend: Int = 1

val GL_MAX_VERTEX_UNITS_ARB: Int = 34468

val GL_ACTIVE_VERTEX_UNITS_ARB: Int = 34469

val GL_WEIGHT_SUM_UNITY_ARB: Int = 34470

val GL_VERTEX_BLEND_ARB: Int = 34471

val GL_CURRENT_WEIGHT_ARB: Int = 34472

val GL_WEIGHT_ARRAY_TYPE_ARB: Int = 34473

val GL_WEIGHT_ARRAY_STRIDE_ARB: Int = 34474

val GL_WEIGHT_ARRAY_SIZE_ARB: Int = 34475

val GL_WEIGHT_ARRAY_POINTER_ARB: Int = 34476

val GL_WEIGHT_ARRAY_ARB: Int = 34477

val GL_MODELVIEW0_ARB: Int = 5888

val GL_MODELVIEW1_ARB: Int = 34058

val GL_MODELVIEW2_ARB: Int = 34594

val GL_MODELVIEW3_ARB: Int = 34595

val GL_MODELVIEW4_ARB: Int = 34596

val GL_MODELVIEW5_ARB: Int = 34597

val GL_MODELVIEW6_ARB: Int = 34598

val GL_MODELVIEW7_ARB: Int = 34599

val GL_MODELVIEW8_ARB: Int = 34600

val GL_MODELVIEW9_ARB: Int = 34601

val GL_MODELVIEW10_ARB: Int = 34602

val GL_MODELVIEW11_ARB: Int = 34603

val GL_MODELVIEW12_ARB: Int = 34604

val GL_MODELVIEW13_ARB: Int = 34605

val GL_MODELVIEW14_ARB: Int = 34606

val GL_MODELVIEW15_ARB: Int = 34607

val GL_MODELVIEW16_ARB: Int = 34608

val GL_MODELVIEW17_ARB: Int = 34609

val GL_MODELVIEW18_ARB: Int = 34610

val GL_MODELVIEW19_ARB: Int = 34611

val GL_MODELVIEW20_ARB: Int = 34612

val GL_MODELVIEW21_ARB: Int = 34613

val GL_MODELVIEW22_ARB: Int = 34614

val GL_MODELVIEW23_ARB: Int = 34615

val GL_MODELVIEW24_ARB: Int = 34616

val GL_MODELVIEW25_ARB: Int = 34617

val GL_MODELVIEW26_ARB: Int = 34618

val GL_MODELVIEW27_ARB: Int = 34619

val GL_MODELVIEW28_ARB: Int = 34620

val GL_MODELVIEW29_ARB: Int = 34621

val GL_MODELVIEW30_ARB: Int = 34622

val GL_MODELVIEW31_ARB: Int = 34623

val GL_ARB_vertex_buffer_object: Int = 1

val GL_BUFFER_SIZE_ARB: Int = 34660

val GL_BUFFER_USAGE_ARB: Int = 34661

val GL_ARRAY_BUFFER_ARB: Int = 34962

val GL_ELEMENT_ARRAY_BUFFER_ARB: Int = 34963

val GL_ARRAY_BUFFER_BINDING_ARB: Int = 34964

val GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB: Int = 34965

val GL_VERTEX_ARRAY_BUFFER_BINDING_ARB: Int = 34966

val GL_NORMAL_ARRAY_BUFFER_BINDING_ARB: Int = 34967

val GL_COLOR_ARRAY_BUFFER_BINDING_ARB: Int = 34968

val GL_INDEX_ARRAY_BUFFER_BINDING_ARB: Int = 34969

val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB: Int = 34970

val GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB: Int = 34971

val GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB: Int = 34972

val GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB: Int = 34973

val GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB: Int = 34974

val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB: Int = 34975

val GL_READ_ONLY_ARB: Int = 35000

val GL_WRITE_ONLY_ARB: Int = 35001

val GL_READ_WRITE_ARB: Int = 35002

val GL_BUFFER_ACCESS_ARB: Int = 35003

val GL_BUFFER_MAPPED_ARB: Int = 35004

val GL_BUFFER_MAP_POINTER_ARB: Int = 35005

val GL_STREAM_DRAW_ARB: Int = 35040

val GL_STREAM_READ_ARB: Int = 35041

val GL_STREAM_COPY_ARB: Int = 35042

val GL_STATIC_DRAW_ARB: Int = 35044

val GL_STATIC_READ_ARB: Int = 35045

val GL_STATIC_COPY_ARB: Int = 35046

val GL_DYNAMIC_DRAW_ARB: Int = 35048

val GL_DYNAMIC_READ_ARB: Int = 35049

val GL_DYNAMIC_COPY_ARB: Int = 35050

val GL_ARB_vertex_program: Int = 1

val GL_COLOR_SUM_ARB: Int = 33880

val GL_VERTEX_PROGRAM_ARB: Int = 34336

val GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB: Int = 34338

val GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB: Int = 34339

val GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB: Int = 34340

val GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB: Int = 34341

val GL_CURRENT_VERTEX_ATTRIB_ARB: Int = 34342

val GL_VERTEX_PROGRAM_POINT_SIZE_ARB: Int = 34370

val GL_VERTEX_PROGRAM_TWO_SIDE_ARB: Int = 34371

val GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB: Int = 34373

val GL_MAX_VERTEX_ATTRIBS_ARB: Int = 34921

val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB: Int = 34922

val GL_PROGRAM_ADDRESS_REGISTERS_ARB: Int = 34992

val GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB: Int = 34993

val GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB: Int = 34994

val GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB: Int = 34995

val GL_ARB_vertex_shader: Int = 1

val GL_VERTEX_SHADER_ARB: Int = 35633

val GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB: Int = 35658

val GL_MAX_VARYING_FLOATS_ARB: Int = 35659

val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB: Int = 35660

val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB: Int = 35661

val GL_OBJECT_ACTIVE_ATTRIBUTES_ARB: Int = 35721

val GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB: Int = 35722

val GL_ARB_vertex_type_10f_11f_11f_rev: Int = 1

val GL_ARB_vertex_type_2_10_10_10_rev: Int = 1

val GL_ARB_viewport_array: Int = 1

val GL_ARB_window_pos: Int = 1

val GL_KHR_blend_equation_advanced: Int = 1

val GL_MULTIPLY_KHR: Int = 37524

val GL_SCREEN_KHR: Int = 37525

val GL_OVERLAY_KHR: Int = 37526

val GL_DARKEN_KHR: Int = 37527

val GL_LIGHTEN_KHR: Int = 37528

val GL_COLORDODGE_KHR: Int = 37529

val GL_COLORBURN_KHR: Int = 37530

val GL_HARDLIGHT_KHR: Int = 37531

val GL_SOFTLIGHT_KHR: Int = 37532

val GL_DIFFERENCE_KHR: Int = 37534

val GL_EXCLUSION_KHR: Int = 37536

val GL_HSL_HUE_KHR: Int = 37549

val GL_HSL_SATURATION_KHR: Int = 37550

val GL_HSL_COLOR_KHR: Int = 37551

val GL_HSL_LUMINOSITY_KHR: Int = 37552

val GL_KHR_blend_equation_advanced_coherent: Int = 1

val GL_BLEND_ADVANCED_COHERENT_KHR: Int = 37509

val GL_KHR_context_flush_control: Int = 1

val GL_KHR_debug: Int = 1

val GL_KHR_no_error: Int = 1

val GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR: Int = 8

val GL_KHR_robust_buffer_access_behavior: Int = 1

val GL_KHR_robustness: Int = 1

val GL_CONTEXT_ROBUST_ACCESS: Int = 37107

val GL_KHR_texture_compression_astc_hdr: Int = 1

val GL_COMPRESSED_RGBA_ASTC_4x4_KHR: Int = 37808

val GL_COMPRESSED_RGBA_ASTC_5x4_KHR: Int = 37809

val GL_COMPRESSED_RGBA_ASTC_5x5_KHR: Int = 37810

val GL_COMPRESSED_RGBA_ASTC_6x5_KHR: Int = 37811

val GL_COMPRESSED_RGBA_ASTC_6x6_KHR: Int = 37812

val GL_COMPRESSED_RGBA_ASTC_8x5_KHR: Int = 37813

val GL_COMPRESSED_RGBA_ASTC_8x6_KHR: Int = 37814

val GL_COMPRESSED_RGBA_ASTC_8x8_KHR: Int = 37815

val GL_COMPRESSED_RGBA_ASTC_10x5_KHR: Int = 37816

val GL_COMPRESSED_RGBA_ASTC_10x6_KHR: Int = 37817

val GL_COMPRESSED_RGBA_ASTC_10x8_KHR: Int = 37818

val GL_COMPRESSED_RGBA_ASTC_10x10_KHR: Int = 37819

val GL_COMPRESSED_RGBA_ASTC_12x10_KHR: Int = 37820

val GL_COMPRESSED_RGBA_ASTC_12x12_KHR: Int = 37821

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR: Int = 37840

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR: Int = 37841

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR: Int = 37842

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR: Int = 37843

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR: Int = 37844

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR: Int = 37845

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR: Int = 37846

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR: Int = 37847

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR: Int = 37848

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR: Int = 37849

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR: Int = 37850

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR: Int = 37851

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR: Int = 37852

val GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR: Int = 37853

val GL_KHR_texture_compression_astc_ldr: Int = 1

val GL_KHR_texture_compression_astc_sliced_3d: Int = 1

val GL_OES_byte_coordinates: Int = 1

val GL_OES_compressed_paletted_texture: Int = 1

val GL_PALETTE4_RGB8_OES: Int = 35728

val GL_PALETTE4_RGBA8_OES: Int = 35729

val GL_PALETTE4_R5_G6_B5_OES: Int = 35730

val GL_PALETTE4_RGBA4_OES: Int = 35731

val GL_PALETTE4_RGB5_A1_OES: Int = 35732

val GL_PALETTE8_RGB8_OES: Int = 35733

val GL_PALETTE8_RGBA8_OES: Int = 35734

val GL_PALETTE8_R5_G6_B5_OES: Int = 35735

val GL_PALETTE8_RGBA4_OES: Int = 35736

val GL_PALETTE8_RGB5_A1_OES: Int = 35737

val GL_OES_fixed_point: Int = 1

val GL_FIXED_OES: Int = 5132

val GL_OES_query_matrix: Int = 1

val GL_OES_read_format: Int = 1

val GL_IMPLEMENTATION_COLOR_READ_TYPE_OES: Int = 35738

val GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES: Int = 35739

val GL_OES_single_precision: Int = 1

val GL_3DFX_multisample: Int = 1

val GL_MULTISAMPLE_3DFX: Int = 34482

val GL_SAMPLE_BUFFERS_3DFX: Int = 34483

val GL_SAMPLES_3DFX: Int = 34484

val GL_MULTISAMPLE_BIT_3DFX: Int = 536870912

val GL_3DFX_tbuffer: Int = 1

val GL_3DFX_texture_compression_FXT1: Int = 1

val GL_COMPRESSED_RGB_FXT1_3DFX: Int = 34480

val GL_COMPRESSED_RGBA_FXT1_3DFX: Int = 34481

val GL_AMD_blend_minmax_factor: Int = 1

val GL_FACTOR_MIN_AMD: Int = 36892

val GL_FACTOR_MAX_AMD: Int = 36893

val GL_AMD_conservative_depth: Int = 1

val GL_AMD_debug_output: Int = 1

val GL_MAX_DEBUG_MESSAGE_LENGTH_AMD: Int = 37187

val GL_MAX_DEBUG_LOGGED_MESSAGES_AMD: Int = 37188

val GL_DEBUG_LOGGED_MESSAGES_AMD: Int = 37189

val GL_DEBUG_SEVERITY_HIGH_AMD: Int = 37190

val GL_DEBUG_SEVERITY_MEDIUM_AMD: Int = 37191

val GL_DEBUG_SEVERITY_LOW_AMD: Int = 37192

val GL_DEBUG_CATEGORY_API_ERROR_AMD: Int = 37193

val GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD: Int = 37194

val GL_DEBUG_CATEGORY_DEPRECATION_AMD: Int = 37195

val GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD: Int = 37196

val GL_DEBUG_CATEGORY_PERFORMANCE_AMD: Int = 37197

val GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD: Int = 37198

val GL_DEBUG_CATEGORY_APPLICATION_AMD: Int = 37199

val GL_DEBUG_CATEGORY_OTHER_AMD: Int = 37200

val GL_AMD_depth_clamp_separate: Int = 1

val GL_DEPTH_CLAMP_NEAR_AMD: Int = 36894

val GL_DEPTH_CLAMP_FAR_AMD: Int = 36895

val GL_AMD_draw_buffers_blend: Int = 1

val GL_AMD_gcn_shader: Int = 1

val GL_AMD_gpu_shader_int64: Int = 1

val GL_INT64_NV: Int = 5134

val GL_UNSIGNED_INT64_NV: Int = 5135

val GL_INT8_NV: Int = 36832

val GL_INT8_VEC2_NV: Int = 36833

val GL_INT8_VEC3_NV: Int = 36834

val GL_INT8_VEC4_NV: Int = 36835

val GL_INT16_NV: Int = 36836

val GL_INT16_VEC2_NV: Int = 36837

val GL_INT16_VEC3_NV: Int = 36838

val GL_INT16_VEC4_NV: Int = 36839

val GL_INT64_VEC2_NV: Int = 36841

val GL_INT64_VEC3_NV: Int = 36842

val GL_INT64_VEC4_NV: Int = 36843

val GL_UNSIGNED_INT8_NV: Int = 36844

val GL_UNSIGNED_INT8_VEC2_NV: Int = 36845

val GL_UNSIGNED_INT8_VEC3_NV: Int = 36846

val GL_UNSIGNED_INT8_VEC4_NV: Int = 36847

val GL_UNSIGNED_INT16_NV: Int = 36848

val GL_UNSIGNED_INT16_VEC2_NV: Int = 36849

val GL_UNSIGNED_INT16_VEC3_NV: Int = 36850

val GL_UNSIGNED_INT16_VEC4_NV: Int = 36851

val GL_UNSIGNED_INT64_VEC2_NV: Int = 36853

val GL_UNSIGNED_INT64_VEC3_NV: Int = 36854

val GL_UNSIGNED_INT64_VEC4_NV: Int = 36855

val GL_FLOAT16_NV: Int = 36856

val GL_FLOAT16_VEC2_NV: Int = 36857

val GL_FLOAT16_VEC3_NV: Int = 36858

val GL_FLOAT16_VEC4_NV: Int = 36859

val GL_AMD_interleaved_elements: Int = 1

val GL_VERTEX_ELEMENT_SWIZZLE_AMD: Int = 37284

val GL_VERTEX_ID_SWIZZLE_AMD: Int = 37285

val GL_AMD_multi_draw_indirect: Int = 1

val GL_AMD_name_gen_delete: Int = 1

val GL_DATA_BUFFER_AMD: Int = 37201

val GL_PERFORMANCE_MONITOR_AMD: Int = 37202

val GL_QUERY_OBJECT_AMD: Int = 37203

val GL_VERTEX_ARRAY_OBJECT_AMD: Int = 37204

val GL_SAMPLER_OBJECT_AMD: Int = 37205

val GL_AMD_occlusion_query_event: Int = 1

val GL_OCCLUSION_QUERY_EVENT_MASK_AMD: Int = 34639

val GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD: Int = 1

val GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD: Int = 2

val GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD: Int = 4

val GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD: Int = 8

val GL_QUERY_ALL_EVENT_BITS_AMD: Int = -1

val GL_AMD_performance_monitor: Int = 1

val GL_COUNTER_TYPE_AMD: Int = 35776

val GL_COUNTER_RANGE_AMD: Int = 35777

val GL_UNSIGNED_INT64_AMD: Int = 35778

val GL_PERCENTAGE_AMD: Int = 35779

val GL_PERFMON_RESULT_AVAILABLE_AMD: Int = 35780

val GL_PERFMON_RESULT_SIZE_AMD: Int = 35781

val GL_PERFMON_RESULT_AMD: Int = 35782

val GL_AMD_pinned_memory: Int = 1

val GL_EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD: Int = 37216

val GL_AMD_query_buffer_object: Int = 1

val GL_QUERY_BUFFER_AMD: Int = 37266

val GL_QUERY_BUFFER_BINDING_AMD: Int = 37267

val GL_QUERY_RESULT_NO_WAIT_AMD: Int = 37268

val GL_AMD_sample_positions: Int = 1

val GL_SUBSAMPLE_DISTANCE_AMD: Int = 34879

val GL_AMD_seamless_cubemap_per_texture: Int = 1

val GL_AMD_shader_atomic_counter_ops: Int = 1

val GL_AMD_shader_explicit_vertex_parameter: Int = 1

val GL_AMD_shader_stencil_export: Int = 1

val GL_AMD_shader_trinary_minmax: Int = 1

val GL_AMD_sparse_texture: Int = 1

val GL_VIRTUAL_PAGE_SIZE_X_AMD: Int = 37269

val GL_VIRTUAL_PAGE_SIZE_Y_AMD: Int = 37270

val GL_VIRTUAL_PAGE_SIZE_Z_AMD: Int = 37271

val GL_MAX_SPARSE_TEXTURE_SIZE_AMD: Int = 37272

val GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD: Int = 37273

val GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS: Int = 37274

val GL_MIN_SPARSE_LEVEL_AMD: Int = 37275

val GL_MIN_LOD_WARNING_AMD: Int = 37276

val GL_TEXTURE_STORAGE_SPARSE_BIT_AMD: Int = 1

val GL_AMD_stencil_operation_extended: Int = 1

val GL_SET_AMD: Int = 34634

val GL_REPLACE_VALUE_AMD: Int = 34635

val GL_STENCIL_OP_VALUE_AMD: Int = 34636

val GL_STENCIL_BACK_OP_VALUE_AMD: Int = 34637

val GL_AMD_texture_texture4: Int = 1

val GL_AMD_transform_feedback3_lines_triangles: Int = 1

val GL_AMD_transform_feedback4: Int = 1

val GL_STREAM_RASTERIZATION_AMD: Int = 37280

val GL_AMD_vertex_shader_layer: Int = 1

val GL_AMD_vertex_shader_tessellator: Int = 1

val GL_SAMPLER_BUFFER_AMD: Int = 36865

val GL_INT_SAMPLER_BUFFER_AMD: Int = 36866

val GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD: Int = 36867

val GL_TESSELLATION_MODE_AMD: Int = 36868

val GL_TESSELLATION_FACTOR_AMD: Int = 36869

val GL_DISCRETE_AMD: Int = 36870

val GL_CONTINUOUS_AMD: Int = 36871

val GL_AMD_vertex_shader_viewport_index: Int = 1

val GL_APPLE_aux_depth_stencil: Int = 1

val GL_AUX_DEPTH_STENCIL_APPLE: Int = 35348

val GL_APPLE_client_storage: Int = 1

val GL_UNPACK_CLIENT_STORAGE_APPLE: Int = 34226

val GL_APPLE_element_array: Int = 1

val GL_ELEMENT_ARRAY_APPLE: Int = 35340

val GL_ELEMENT_ARRAY_TYPE_APPLE: Int = 35341

val GL_ELEMENT_ARRAY_POINTER_APPLE: Int = 35342

val GL_APPLE_fence: Int = 1

val GL_DRAW_PIXELS_APPLE: Int = 35338

val GL_FENCE_APPLE: Int = 35339

val GL_APPLE_float_pixels: Int = 1

val GL_HALF_APPLE: Int = 5131

val GL_RGBA_FLOAT32_APPLE: Int = 34836

val GL_RGB_FLOAT32_APPLE: Int = 34837

val GL_ALPHA_FLOAT32_APPLE: Int = 34838

val GL_INTENSITY_FLOAT32_APPLE: Int = 34839

val GL_LUMINANCE_FLOAT32_APPLE: Int = 34840

val GL_LUMINANCE_ALPHA_FLOAT32_APPLE: Int = 34841

val GL_RGBA_FLOAT16_APPLE: Int = 34842

val GL_RGB_FLOAT16_APPLE: Int = 34843

val GL_ALPHA_FLOAT16_APPLE: Int = 34844

val GL_INTENSITY_FLOAT16_APPLE: Int = 34845

val GL_LUMINANCE_FLOAT16_APPLE: Int = 34846

val GL_LUMINANCE_ALPHA_FLOAT16_APPLE: Int = 34847

val GL_COLOR_FLOAT_APPLE: Int = 35343

val GL_APPLE_flush_buffer_range: Int = 1

val GL_BUFFER_SERIALIZED_MODIFY_APPLE: Int = 35346

val GL_BUFFER_FLUSHING_UNMAP_APPLE: Int = 35347

val GL_APPLE_object_purgeable: Int = 1

val GL_BUFFER_OBJECT_APPLE: Int = 34227

val GL_RELEASED_APPLE: Int = 35353

val GL_VOLATILE_APPLE: Int = 35354

val GL_RETAINED_APPLE: Int = 35355

val GL_UNDEFINED_APPLE: Int = 35356

val GL_PURGEABLE_APPLE: Int = 35357

val GL_APPLE_rgb_422: Int = 1

val GL_RGB_422_APPLE: Int = 35359

val GL_UNSIGNED_SHORT_8_8_APPLE: Int = 34234

val GL_UNSIGNED_SHORT_8_8_REV_APPLE: Int = 34235

val GL_RGB_RAW_422_APPLE: Int = 35409

val GL_APPLE_row_bytes: Int = 1

val GL_PACK_ROW_BYTES_APPLE: Int = 35349

val GL_UNPACK_ROW_BYTES_APPLE: Int = 35350

val GL_APPLE_specular_vector: Int = 1

val GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE: Int = 34224

val GL_APPLE_texture_range: Int = 1

val GL_TEXTURE_RANGE_LENGTH_APPLE: Int = 34231

val GL_TEXTURE_RANGE_POINTER_APPLE: Int = 34232

val GL_TEXTURE_STORAGE_HINT_APPLE: Int = 34236

val GL_STORAGE_PRIVATE_APPLE: Int = 34237

val GL_STORAGE_CACHED_APPLE: Int = 34238

val GL_STORAGE_SHARED_APPLE: Int = 34239

val GL_APPLE_transform_hint: Int = 1

val GL_TRANSFORM_HINT_APPLE: Int = 34225

val GL_APPLE_vertex_array_object: Int = 1

val GL_VERTEX_ARRAY_BINDING_APPLE: Int = 34229

val GL_APPLE_vertex_array_range: Int = 1

val GL_VERTEX_ARRAY_RANGE_APPLE: Int = 34077

val GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE: Int = 34078

val GL_VERTEX_ARRAY_STORAGE_HINT_APPLE: Int = 34079

val GL_VERTEX_ARRAY_RANGE_POINTER_APPLE: Int = 34081

val GL_STORAGE_CLIENT_APPLE: Int = 34228

val GL_APPLE_vertex_program_evaluators: Int = 1

val GL_VERTEX_ATTRIB_MAP1_APPLE: Int = 35328

val GL_VERTEX_ATTRIB_MAP2_APPLE: Int = 35329

val GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE: Int = 35330

val GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE: Int = 35331

val GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE: Int = 35332

val GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE: Int = 35333

val GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE: Int = 35334

val GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE: Int = 35335

val GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE: Int = 35336

val GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE: Int = 35337

val GL_APPLE_ycbcr_422: Int = 1

val GL_YCBCR_422_APPLE: Int = 34233

val GL_ATI_draw_buffers: Int = 1

val GL_MAX_DRAW_BUFFERS_ATI: Int = 34852

val GL_DRAW_BUFFER0_ATI: Int = 34853

val GL_DRAW_BUFFER1_ATI: Int = 34854

val GL_DRAW_BUFFER2_ATI: Int = 34855

val GL_DRAW_BUFFER3_ATI: Int = 34856

val GL_DRAW_BUFFER4_ATI: Int = 34857

val GL_DRAW_BUFFER5_ATI: Int = 34858

val GL_DRAW_BUFFER6_ATI: Int = 34859

val GL_DRAW_BUFFER7_ATI: Int = 34860

val GL_DRAW_BUFFER8_ATI: Int = 34861

val GL_DRAW_BUFFER9_ATI: Int = 34862

val GL_DRAW_BUFFER10_ATI: Int = 34863

val GL_DRAW_BUFFER11_ATI: Int = 34864

val GL_DRAW_BUFFER12_ATI: Int = 34865

val GL_DRAW_BUFFER13_ATI: Int = 34866

val GL_DRAW_BUFFER14_ATI: Int = 34867

val GL_DRAW_BUFFER15_ATI: Int = 34868

val GL_ATI_element_array: Int = 1

val GL_ELEMENT_ARRAY_ATI: Int = 34664

val GL_ELEMENT_ARRAY_TYPE_ATI: Int = 34665

val GL_ELEMENT_ARRAY_POINTER_ATI: Int = 34666

val GL_ATI_envmap_bumpmap: Int = 1

val GL_BUMP_ROT_MATRIX_ATI: Int = 34677

val GL_BUMP_ROT_MATRIX_SIZE_ATI: Int = 34678

val GL_BUMP_NUM_TEX_UNITS_ATI: Int = 34679

val GL_BUMP_TEX_UNITS_ATI: Int = 34680

val GL_DUDV_ATI: Int = 34681

val GL_DU8DV8_ATI: Int = 34682

val GL_BUMP_ENVMAP_ATI: Int = 34683

val GL_BUMP_TARGET_ATI: Int = 34684

val GL_ATI_fragment_shader: Int = 1

val GL_FRAGMENT_SHADER_ATI: Int = 35104

val GL_REG_0_ATI: Int = 35105

val GL_REG_1_ATI: Int = 35106

val GL_REG_2_ATI: Int = 35107

val GL_REG_3_ATI: Int = 35108

val GL_REG_4_ATI: Int = 35109

val GL_REG_5_ATI: Int = 35110

val GL_REG_6_ATI: Int = 35111

val GL_REG_7_ATI: Int = 35112

val GL_REG_8_ATI: Int = 35113

val GL_REG_9_ATI: Int = 35114

val GL_REG_10_ATI: Int = 35115

val GL_REG_11_ATI: Int = 35116

val GL_REG_12_ATI: Int = 35117

val GL_REG_13_ATI: Int = 35118

val GL_REG_14_ATI: Int = 35119

val GL_REG_15_ATI: Int = 35120

val GL_REG_16_ATI: Int = 35121

val GL_REG_17_ATI: Int = 35122

val GL_REG_18_ATI: Int = 35123

val GL_REG_19_ATI: Int = 35124

val GL_REG_20_ATI: Int = 35125

val GL_REG_21_ATI: Int = 35126

val GL_REG_22_ATI: Int = 35127

val GL_REG_23_ATI: Int = 35128

val GL_REG_24_ATI: Int = 35129

val GL_REG_25_ATI: Int = 35130

val GL_REG_26_ATI: Int = 35131

val GL_REG_27_ATI: Int = 35132

val GL_REG_28_ATI: Int = 35133

val GL_REG_29_ATI: Int = 35134

val GL_REG_30_ATI: Int = 35135

val GL_REG_31_ATI: Int = 35136

val GL_CON_0_ATI: Int = 35137

val GL_CON_1_ATI: Int = 35138

val GL_CON_2_ATI: Int = 35139

val GL_CON_3_ATI: Int = 35140

val GL_CON_4_ATI: Int = 35141

val GL_CON_5_ATI: Int = 35142

val GL_CON_6_ATI: Int = 35143

val GL_CON_7_ATI: Int = 35144

val GL_CON_8_ATI: Int = 35145

val GL_CON_9_ATI: Int = 35146

val GL_CON_10_ATI: Int = 35147

val GL_CON_11_ATI: Int = 35148

val GL_CON_12_ATI: Int = 35149

val GL_CON_13_ATI: Int = 35150

val GL_CON_14_ATI: Int = 35151

val GL_CON_15_ATI: Int = 35152

val GL_CON_16_ATI: Int = 35153

val GL_CON_17_ATI: Int = 35154

val GL_CON_18_ATI: Int = 35155

val GL_CON_19_ATI: Int = 35156

val GL_CON_20_ATI: Int = 35157

val GL_CON_21_ATI: Int = 35158

val GL_CON_22_ATI: Int = 35159

val GL_CON_23_ATI: Int = 35160

val GL_CON_24_ATI: Int = 35161

val GL_CON_25_ATI: Int = 35162

val GL_CON_26_ATI: Int = 35163

val GL_CON_27_ATI: Int = 35164

val GL_CON_28_ATI: Int = 35165

val GL_CON_29_ATI: Int = 35166

val GL_CON_30_ATI: Int = 35167

val GL_CON_31_ATI: Int = 35168

val GL_MOV_ATI: Int = 35169

val GL_ADD_ATI: Int = 35171

val GL_MUL_ATI: Int = 35172

val GL_SUB_ATI: Int = 35173

val GL_DOT3_ATI: Int = 35174

val GL_DOT4_ATI: Int = 35175

val GL_MAD_ATI: Int = 35176

val GL_LERP_ATI: Int = 35177

val GL_CND_ATI: Int = 35178

val GL_CND0_ATI: Int = 35179

val GL_DOT2_ADD_ATI: Int = 35180

val GL_SECONDARY_INTERPOLATOR_ATI: Int = 35181

val GL_NUM_FRAGMENT_REGISTERS_ATI: Int = 35182

val GL_NUM_FRAGMENT_CONSTANTS_ATI: Int = 35183

val GL_NUM_PASSES_ATI: Int = 35184

val GL_NUM_INSTRUCTIONS_PER_PASS_ATI: Int = 35185

val GL_NUM_INSTRUCTIONS_TOTAL_ATI: Int = 35186

val GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI: Int = 35187

val GL_NUM_LOOPBACK_COMPONENTS_ATI: Int = 35188

val GL_COLOR_ALPHA_PAIRING_ATI: Int = 35189

val GL_SWIZZLE_STR_ATI: Int = 35190

val GL_SWIZZLE_STQ_ATI: Int = 35191

val GL_SWIZZLE_STR_DR_ATI: Int = 35192

val GL_SWIZZLE_STQ_DQ_ATI: Int = 35193

val GL_SWIZZLE_STRQ_ATI: Int = 35194

val GL_SWIZZLE_STRQ_DQ_ATI: Int = 35195

val GL_RED_BIT_ATI: Int = 1

val GL_GREEN_BIT_ATI: Int = 2

val GL_BLUE_BIT_ATI: Int = 4

val GL_2X_BIT_ATI: Int = 1

val GL_4X_BIT_ATI: Int = 2

val GL_8X_BIT_ATI: Int = 4

val GL_HALF_BIT_ATI: Int = 8

val GL_QUARTER_BIT_ATI: Int = 16

val GL_EIGHTH_BIT_ATI: Int = 32

val GL_SATURATE_BIT_ATI: Int = 64

val GL_COMP_BIT_ATI: Int = 2

val GL_NEGATE_BIT_ATI: Int = 4

val GL_BIAS_BIT_ATI: Int = 8

val GL_ATI_map_object_buffer: Int = 1

val GL_ATI_meminfo: Int = 1

val GL_VBO_FREE_MEMORY_ATI: Int = 34811

val GL_TEXTURE_FREE_MEMORY_ATI: Int = 34812

val GL_RENDERBUFFER_FREE_MEMORY_ATI: Int = 34813

val GL_ATI_pixel_format_float: Int = 1

val GL_RGBA_FLOAT_MODE_ATI: Int = 34848

val GL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI: Int = 34869

val GL_ATI_pn_triangles: Int = 1

val GL_PN_TRIANGLES_ATI: Int = 34800

val GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI: Int = 34801

val GL_PN_TRIANGLES_POINT_MODE_ATI: Int = 34802

val GL_PN_TRIANGLES_NORMAL_MODE_ATI: Int = 34803

val GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI: Int = 34804

val GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI: Int = 34805

val GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI: Int = 34806

val GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI: Int = 34807

val GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI: Int = 34808

val GL_ATI_separate_stencil: Int = 1

val GL_STENCIL_BACK_FUNC_ATI: Int = 34816

val GL_STENCIL_BACK_FAIL_ATI: Int = 34817

val GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI: Int = 34818

val GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI: Int = 34819

val GL_ATI_text_fragment_shader: Int = 1

val GL_TEXT_FRAGMENT_SHADER_ATI: Int = 33280

val GL_ATI_texture_env_combine3: Int = 1

val GL_MODULATE_ADD_ATI: Int = 34628

val GL_MODULATE_SIGNED_ADD_ATI: Int = 34629

val GL_MODULATE_SUBTRACT_ATI: Int = 34630

val GL_ATI_texture_float: Int = 1

val GL_RGBA_FLOAT32_ATI: Int = 34836

val GL_RGB_FLOAT32_ATI: Int = 34837

val GL_ALPHA_FLOAT32_ATI: Int = 34838

val GL_INTENSITY_FLOAT32_ATI: Int = 34839

val GL_LUMINANCE_FLOAT32_ATI: Int = 34840

val GL_LUMINANCE_ALPHA_FLOAT32_ATI: Int = 34841

val GL_RGBA_FLOAT16_ATI: Int = 34842

val GL_RGB_FLOAT16_ATI: Int = 34843

val GL_ALPHA_FLOAT16_ATI: Int = 34844

val GL_INTENSITY_FLOAT16_ATI: Int = 34845

val GL_LUMINANCE_FLOAT16_ATI: Int = 34846

val GL_LUMINANCE_ALPHA_FLOAT16_ATI: Int = 34847

val GL_ATI_texture_mirror_once: Int = 1

val GL_MIRROR_CLAMP_ATI: Int = 34626

val GL_MIRROR_CLAMP_TO_EDGE_ATI: Int = 34627

val GL_ATI_vertex_array_object: Int = 1

val GL_STATIC_ATI: Int = 34656

val GL_DYNAMIC_ATI: Int = 34657

val GL_PRESERVE_ATI: Int = 34658

val GL_DISCARD_ATI: Int = 34659

val GL_OBJECT_BUFFER_SIZE_ATI: Int = 34660

val GL_OBJECT_BUFFER_USAGE_ATI: Int = 34661

val GL_ARRAY_OBJECT_BUFFER_ATI: Int = 34662

val GL_ARRAY_OBJECT_OFFSET_ATI: Int = 34663

val GL_ATI_vertex_attrib_array_object: Int = 1

val GL_ATI_vertex_streams: Int = 1

val GL_MAX_VERTEX_STREAMS_ATI: Int = 34667

val GL_VERTEX_STREAM0_ATI: Int = 34668

val GL_VERTEX_STREAM1_ATI: Int = 34669

val GL_VERTEX_STREAM2_ATI: Int = 34670

val GL_VERTEX_STREAM3_ATI: Int = 34671

val GL_VERTEX_STREAM4_ATI: Int = 34672

val GL_VERTEX_STREAM5_ATI: Int = 34673

val GL_VERTEX_STREAM6_ATI: Int = 34674

val GL_VERTEX_STREAM7_ATI: Int = 34675

val GL_VERTEX_SOURCE_ATI: Int = 34676

val GL_EXT_422_pixels: Int = 1

val GL_422_EXT: Int = 32972

val GL_422_REV_EXT: Int = 32973

val GL_422_AVERAGE_EXT: Int = 32974

val GL_422_REV_AVERAGE_EXT: Int = 32975

val GL_EXT_abgr: Int = 1

val GL_ABGR_EXT: Int = 32768

val GL_EXT_bgra: Int = 1

val GL_BGR_EXT: Int = 32992

val GL_BGRA_EXT: Int = 32993

val GL_EXT_bindable_uniform: Int = 1

val GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT: Int = 36322

val GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT: Int = 36323

val GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT: Int = 36324

val GL_MAX_BINDABLE_UNIFORM_SIZE_EXT: Int = 36333

val GL_UNIFORM_BUFFER_EXT: Int = 36334

val GL_UNIFORM_BUFFER_BINDING_EXT: Int = 36335

val GL_EXT_blend_color: Int = 1

val GL_CONSTANT_COLOR_EXT: Int = 32769

val GL_ONE_MINUS_CONSTANT_COLOR_EXT: Int = 32770

val GL_CONSTANT_ALPHA_EXT: Int = 32771

val GL_ONE_MINUS_CONSTANT_ALPHA_EXT: Int = 32772

val GL_BLEND_COLOR_EXT: Int = 32773

val GL_EXT_blend_equation_separate: Int = 1

val GL_BLEND_EQUATION_RGB_EXT: Int = 32777

val GL_BLEND_EQUATION_ALPHA_EXT: Int = 34877

val GL_EXT_blend_func_separate: Int = 1

val GL_BLEND_DST_RGB_EXT: Int = 32968

val GL_BLEND_SRC_RGB_EXT: Int = 32969

val GL_BLEND_DST_ALPHA_EXT: Int = 32970

val GL_BLEND_SRC_ALPHA_EXT: Int = 32971

val GL_EXT_blend_logic_op: Int = 1

val GL_EXT_blend_minmax: Int = 1

val GL_MIN_EXT: Int = 32775

val GL_MAX_EXT: Int = 32776

val GL_FUNC_ADD_EXT: Int = 32774

val GL_BLEND_EQUATION_EXT: Int = 32777

val GL_EXT_blend_subtract: Int = 1

val GL_FUNC_SUBTRACT_EXT: Int = 32778

val GL_FUNC_REVERSE_SUBTRACT_EXT: Int = 32779

val GL_EXT_clip_volume_hint: Int = 1

val GL_CLIP_VOLUME_CLIPPING_HINT_EXT: Int = 33008

val GL_EXT_cmyka: Int = 1

val GL_CMYK_EXT: Int = 32780

val GL_CMYKA_EXT: Int = 32781

val GL_PACK_CMYK_HINT_EXT: Int = 32782

val GL_UNPACK_CMYK_HINT_EXT: Int = 32783

val GL_EXT_color_subtable: Int = 1

val GL_EXT_compiled_vertex_array: Int = 1

val GL_ARRAY_ELEMENT_LOCK_FIRST_EXT: Int = 33192

val GL_ARRAY_ELEMENT_LOCK_COUNT_EXT: Int = 33193

val GL_EXT_convolution: Int = 1

val GL_CONVOLUTION_1D_EXT: Int = 32784

val GL_CONVOLUTION_2D_EXT: Int = 32785

val GL_SEPARABLE_2D_EXT: Int = 32786

val GL_CONVOLUTION_BORDER_MODE_EXT: Int = 32787

val GL_CONVOLUTION_FILTER_SCALE_EXT: Int = 32788

val GL_CONVOLUTION_FILTER_BIAS_EXT: Int = 32789

val GL_REDUCE_EXT: Int = 32790

val GL_CONVOLUTION_FORMAT_EXT: Int = 32791

val GL_CONVOLUTION_WIDTH_EXT: Int = 32792

val GL_CONVOLUTION_HEIGHT_EXT: Int = 32793

val GL_MAX_CONVOLUTION_WIDTH_EXT: Int = 32794

val GL_MAX_CONVOLUTION_HEIGHT_EXT: Int = 32795

val GL_POST_CONVOLUTION_RED_SCALE_EXT: Int = 32796

val GL_POST_CONVOLUTION_GREEN_SCALE_EXT: Int = 32797

val GL_POST_CONVOLUTION_BLUE_SCALE_EXT: Int = 32798

val GL_POST_CONVOLUTION_ALPHA_SCALE_EXT: Int = 32799

val GL_POST_CONVOLUTION_RED_BIAS_EXT: Int = 32800

val GL_POST_CONVOLUTION_GREEN_BIAS_EXT: Int = 32801

val GL_POST_CONVOLUTION_BLUE_BIAS_EXT: Int = 32802

val GL_POST_CONVOLUTION_ALPHA_BIAS_EXT: Int = 32803

val GL_EXT_coordinate_frame: Int = 1

val GL_TANGENT_ARRAY_EXT: Int = 33849

val GL_BINORMAL_ARRAY_EXT: Int = 33850

val GL_CURRENT_TANGENT_EXT: Int = 33851

val GL_CURRENT_BINORMAL_EXT: Int = 33852

val GL_TANGENT_ARRAY_TYPE_EXT: Int = 33854

val GL_TANGENT_ARRAY_STRIDE_EXT: Int = 33855

val GL_BINORMAL_ARRAY_TYPE_EXT: Int = 33856

val GL_BINORMAL_ARRAY_STRIDE_EXT: Int = 33857

val GL_TANGENT_ARRAY_POINTER_EXT: Int = 33858

val GL_BINORMAL_ARRAY_POINTER_EXT: Int = 33859

val GL_MAP1_TANGENT_EXT: Int = 33860

val GL_MAP2_TANGENT_EXT: Int = 33861

val GL_MAP1_BINORMAL_EXT: Int = 33862

val GL_MAP2_BINORMAL_EXT: Int = 33863

val GL_EXT_copy_texture: Int = 1

val GL_EXT_cull_vertex: Int = 1

val GL_CULL_VERTEX_EXT: Int = 33194

val GL_CULL_VERTEX_EYE_POSITION_EXT: Int = 33195

val GL_CULL_VERTEX_OBJECT_POSITION_EXT: Int = 33196

val GL_EXT_debug_label: Int = 1

val GL_PROGRAM_PIPELINE_OBJECT_EXT: Int = 35407

val GL_PROGRAM_OBJECT_EXT: Int = 35648

val GL_SHADER_OBJECT_EXT: Int = 35656

val GL_BUFFER_OBJECT_EXT: Int = 37201

val GL_QUERY_OBJECT_EXT: Int = 37203

val GL_VERTEX_ARRAY_OBJECT_EXT: Int = 37204

val GL_EXT_debug_marker: Int = 1

val GL_EXT_depth_bounds_test: Int = 1

val GL_DEPTH_BOUNDS_TEST_EXT: Int = 34960

val GL_DEPTH_BOUNDS_EXT: Int = 34961

val GL_EXT_direct_state_access: Int = 1

val GL_PROGRAM_MATRIX_EXT: Int = 36397

val GL_TRANSPOSE_PROGRAM_MATRIX_EXT: Int = 36398

val GL_PROGRAM_MATRIX_STACK_DEPTH_EXT: Int = 36399

val GL_EXT_draw_buffers2: Int = 1

val GL_EXT_draw_instanced: Int = 1

val GL_EXT_draw_range_elements: Int = 1

val GL_MAX_ELEMENTS_VERTICES_EXT: Int = 33000

val GL_MAX_ELEMENTS_INDICES_EXT: Int = 33001

val GL_EXT_fog_coord: Int = 1

val GL_FOG_COORDINATE_SOURCE_EXT: Int = 33872

val GL_FOG_COORDINATE_EXT: Int = 33873

val GL_FRAGMENT_DEPTH_EXT: Int = 33874

val GL_CURRENT_FOG_COORDINATE_EXT: Int = 33875

val GL_FOG_COORDINATE_ARRAY_TYPE_EXT: Int = 33876

val GL_FOG_COORDINATE_ARRAY_STRIDE_EXT: Int = 33877

val GL_FOG_COORDINATE_ARRAY_POINTER_EXT: Int = 33878

val GL_FOG_COORDINATE_ARRAY_EXT: Int = 33879

val GL_EXT_framebuffer_blit: Int = 1

val GL_READ_FRAMEBUFFER_EXT: Int = 36008

val GL_DRAW_FRAMEBUFFER_EXT: Int = 36009

val GL_DRAW_FRAMEBUFFER_BINDING_EXT: Int = 36006

val GL_READ_FRAMEBUFFER_BINDING_EXT: Int = 36010

val GL_EXT_framebuffer_multisample: Int = 1

val GL_RENDERBUFFER_SAMPLES_EXT: Int = 36011

val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT: Int = 36182

val GL_MAX_SAMPLES_EXT: Int = 36183

val GL_EXT_framebuffer_multisample_blit_scaled: Int = 1

val GL_SCALED_RESOLVE_FASTEST_EXT: Int = 37050

val GL_SCALED_RESOLVE_NICEST_EXT: Int = 37051

val GL_EXT_framebuffer_object: Int = 1

val GL_INVALID_FRAMEBUFFER_OPERATION_EXT: Int = 1286

val GL_MAX_RENDERBUFFER_SIZE_EXT: Int = 34024

val GL_FRAMEBUFFER_BINDING_EXT: Int = 36006

val GL_RENDERBUFFER_BINDING_EXT: Int = 36007

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT: Int = 36048

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT: Int = 36049

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT: Int = 36050

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT: Int = 36051

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT: Int = 36052

val GL_FRAMEBUFFER_COMPLETE_EXT: Int = 36053

val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT: Int = 36054

val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT: Int = 36055

val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT: Int = 36057

val GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT: Int = 36058

val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT: Int = 36059

val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT: Int = 36060

val GL_FRAMEBUFFER_UNSUPPORTED_EXT: Int = 36061

val GL_MAX_COLOR_ATTACHMENTS_EXT: Int = 36063

val GL_COLOR_ATTACHMENT0_EXT: Int = 36064

val GL_COLOR_ATTACHMENT1_EXT: Int = 36065

val GL_COLOR_ATTACHMENT2_EXT: Int = 36066

val GL_COLOR_ATTACHMENT3_EXT: Int = 36067

val GL_COLOR_ATTACHMENT4_EXT: Int = 36068

val GL_COLOR_ATTACHMENT5_EXT: Int = 36069

val GL_COLOR_ATTACHMENT6_EXT: Int = 36070

val GL_COLOR_ATTACHMENT7_EXT: Int = 36071

val GL_COLOR_ATTACHMENT8_EXT: Int = 36072

val GL_COLOR_ATTACHMENT9_EXT: Int = 36073

val GL_COLOR_ATTACHMENT10_EXT: Int = 36074

val GL_COLOR_ATTACHMENT11_EXT: Int = 36075

val GL_COLOR_ATTACHMENT12_EXT: Int = 36076

val GL_COLOR_ATTACHMENT13_EXT: Int = 36077

val GL_COLOR_ATTACHMENT14_EXT: Int = 36078

val GL_COLOR_ATTACHMENT15_EXT: Int = 36079

val GL_DEPTH_ATTACHMENT_EXT: Int = 36096

val GL_STENCIL_ATTACHMENT_EXT: Int = 36128

val GL_FRAMEBUFFER_EXT: Int = 36160

val GL_RENDERBUFFER_EXT: Int = 36161

val GL_RENDERBUFFER_WIDTH_EXT: Int = 36162

val GL_RENDERBUFFER_HEIGHT_EXT: Int = 36163

val GL_RENDERBUFFER_INTERNAL_FORMAT_EXT: Int = 36164

val GL_STENCIL_INDEX1_EXT: Int = 36166

val GL_STENCIL_INDEX4_EXT: Int = 36167

val GL_STENCIL_INDEX8_EXT: Int = 36168

val GL_STENCIL_INDEX16_EXT: Int = 36169

val GL_RENDERBUFFER_RED_SIZE_EXT: Int = 36176

val GL_RENDERBUFFER_GREEN_SIZE_EXT: Int = 36177

val GL_RENDERBUFFER_BLUE_SIZE_EXT: Int = 36178

val GL_RENDERBUFFER_ALPHA_SIZE_EXT: Int = 36179

val GL_RENDERBUFFER_DEPTH_SIZE_EXT: Int = 36180

val GL_RENDERBUFFER_STENCIL_SIZE_EXT: Int = 36181

val GL_EXT_framebuffer_sRGB: Int = 1

val GL_FRAMEBUFFER_SRGB_EXT: Int = 36281

val GL_FRAMEBUFFER_SRGB_CAPABLE_EXT: Int = 36282

val GL_EXT_geometry_shader4: Int = 1

val GL_GEOMETRY_SHADER_EXT: Int = 36313

val GL_GEOMETRY_VERTICES_OUT_EXT: Int = 36314

val GL_GEOMETRY_INPUT_TYPE_EXT: Int = 36315

val GL_GEOMETRY_OUTPUT_TYPE_EXT: Int = 36316

val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT: Int = 35881

val GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT: Int = 36317

val GL_MAX_VERTEX_VARYING_COMPONENTS_EXT: Int = 36318

val GL_MAX_VARYING_COMPONENTS_EXT: Int = 35659

val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT: Int = 36319

val GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT: Int = 36320

val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT: Int = 36321

val GL_LINES_ADJACENCY_EXT: Int = 10

val GL_LINE_STRIP_ADJACENCY_EXT: Int = 11

val GL_TRIANGLES_ADJACENCY_EXT: Int = 12

val GL_TRIANGLE_STRIP_ADJACENCY_EXT: Int = 13

val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT: Int = 36264

val GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT: Int = 36265

val GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT: Int = 36263

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT: Int = 36052

val GL_PROGRAM_POINT_SIZE_EXT: Int = 34370

val GL_EXT_gpu_program_parameters: Int = 1

val GL_EXT_gpu_shader4: Int = 1

val GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT: Int = 35069

val GL_SAMPLER_1D_ARRAY_EXT: Int = 36288

val GL_SAMPLER_2D_ARRAY_EXT: Int = 36289

val GL_SAMPLER_BUFFER_EXT: Int = 36290

val GL_SAMPLER_1D_ARRAY_SHADOW_EXT: Int = 36291

val GL_SAMPLER_2D_ARRAY_SHADOW_EXT: Int = 36292

val GL_SAMPLER_CUBE_SHADOW_EXT: Int = 36293

val GL_UNSIGNED_INT_VEC2_EXT: Int = 36294

val GL_UNSIGNED_INT_VEC3_EXT: Int = 36295

val GL_UNSIGNED_INT_VEC4_EXT: Int = 36296

val GL_INT_SAMPLER_1D_EXT: Int = 36297

val GL_INT_SAMPLER_2D_EXT: Int = 36298

val GL_INT_SAMPLER_3D_EXT: Int = 36299

val GL_INT_SAMPLER_CUBE_EXT: Int = 36300

val GL_INT_SAMPLER_2D_RECT_EXT: Int = 36301

val GL_INT_SAMPLER_1D_ARRAY_EXT: Int = 36302

val GL_INT_SAMPLER_2D_ARRAY_EXT: Int = 36303

val GL_INT_SAMPLER_BUFFER_EXT: Int = 36304

val GL_UNSIGNED_INT_SAMPLER_1D_EXT: Int = 36305

val GL_UNSIGNED_INT_SAMPLER_2D_EXT: Int = 36306

val GL_UNSIGNED_INT_SAMPLER_3D_EXT: Int = 36307

val GL_UNSIGNED_INT_SAMPLER_CUBE_EXT: Int = 36308

val GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT: Int = 36309

val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT: Int = 36310

val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT: Int = 36311

val GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT: Int = 36312

val GL_MIN_PROGRAM_TEXEL_OFFSET_EXT: Int = 35076

val GL_MAX_PROGRAM_TEXEL_OFFSET_EXT: Int = 35077

val GL_EXT_histogram: Int = 1

val GL_HISTOGRAM_EXT: Int = 32804

val GL_PROXY_HISTOGRAM_EXT: Int = 32805

val GL_HISTOGRAM_WIDTH_EXT: Int = 32806

val GL_HISTOGRAM_FORMAT_EXT: Int = 32807

val GL_HISTOGRAM_RED_SIZE_EXT: Int = 32808

val GL_HISTOGRAM_GREEN_SIZE_EXT: Int = 32809

val GL_HISTOGRAM_BLUE_SIZE_EXT: Int = 32810

val GL_HISTOGRAM_ALPHA_SIZE_EXT: Int = 32811

val GL_HISTOGRAM_LUMINANCE_SIZE_EXT: Int = 32812

val GL_HISTOGRAM_SINK_EXT: Int = 32813

val GL_MINMAX_EXT: Int = 32814

val GL_MINMAX_FORMAT_EXT: Int = 32815

val GL_MINMAX_SINK_EXT: Int = 32816

val GL_TABLE_TOO_LARGE_EXT: Int = 32817

val GL_EXT_index_array_formats: Int = 1

val GL_IUI_V2F_EXT: Int = 33197

val GL_IUI_V3F_EXT: Int = 33198

val GL_IUI_N3F_V2F_EXT: Int = 33199

val GL_IUI_N3F_V3F_EXT: Int = 33200

val GL_T2F_IUI_V2F_EXT: Int = 33201

val GL_T2F_IUI_V3F_EXT: Int = 33202

val GL_T2F_IUI_N3F_V2F_EXT: Int = 33203

val GL_T2F_IUI_N3F_V3F_EXT: Int = 33204

val GL_EXT_index_func: Int = 1

val GL_INDEX_TEST_EXT: Int = 33205

val GL_INDEX_TEST_FUNC_EXT: Int = 33206

val GL_INDEX_TEST_REF_EXT: Int = 33207

val GL_EXT_index_material: Int = 1

val GL_INDEX_MATERIAL_EXT: Int = 33208

val GL_INDEX_MATERIAL_PARAMETER_EXT: Int = 33209

val GL_INDEX_MATERIAL_FACE_EXT: Int = 33210

val GL_EXT_index_texture: Int = 1

val GL_EXT_light_texture: Int = 1

val GL_FRAGMENT_MATERIAL_EXT: Int = 33609

val GL_FRAGMENT_NORMAL_EXT: Int = 33610

val GL_FRAGMENT_COLOR_EXT: Int = 33612

val GL_ATTENUATION_EXT: Int = 33613

val GL_SHADOW_ATTENUATION_EXT: Int = 33614

val GL_TEXTURE_APPLICATION_MODE_EXT: Int = 33615

val GL_TEXTURE_LIGHT_EXT: Int = 33616

val GL_TEXTURE_MATERIAL_FACE_EXT: Int = 33617

val GL_TEXTURE_MATERIAL_PARAMETER_EXT: Int = 33618

val GL_EXT_misc_attribute: Int = 1

val GL_EXT_multi_draw_arrays: Int = 1

val GL_EXT_multisample: Int = 1

val GL_MULTISAMPLE_EXT: Int = 32925

val GL_SAMPLE_ALPHA_TO_MASK_EXT: Int = 32926

val GL_SAMPLE_ALPHA_TO_ONE_EXT: Int = 32927

val GL_SAMPLE_MASK_EXT: Int = 32928

val GL_1PASS_EXT: Int = 32929

val GL_2PASS_0_EXT: Int = 32930

val GL_2PASS_1_EXT: Int = 32931

val GL_4PASS_0_EXT: Int = 32932

val GL_4PASS_1_EXT: Int = 32933

val GL_4PASS_2_EXT: Int = 32934

val GL_4PASS_3_EXT: Int = 32935

val GL_SAMPLE_BUFFERS_EXT: Int = 32936

val GL_SAMPLES_EXT: Int = 32937

val GL_SAMPLE_MASK_VALUE_EXT: Int = 32938

val GL_SAMPLE_MASK_INVERT_EXT: Int = 32939

val GL_SAMPLE_PATTERN_EXT: Int = 32940

val GL_MULTISAMPLE_BIT_EXT: Int = 536870912

val GL_EXT_packed_depth_stencil: Int = 1

val GL_DEPTH_STENCIL_EXT: Int = 34041

val GL_UNSIGNED_INT_24_8_EXT: Int = 34042

val GL_DEPTH24_STENCIL8_EXT: Int = 35056

val GL_TEXTURE_STENCIL_SIZE_EXT: Int = 35057

val GL_EXT_packed_float: Int = 1

val GL_R11F_G11F_B10F_EXT: Int = 35898

val GL_UNSIGNED_INT_10F_11F_11F_REV_EXT: Int = 35899

val GL_RGBA_SIGNED_COMPONENTS_EXT: Int = 35900

val GL_EXT_packed_pixels: Int = 1

val GL_UNSIGNED_BYTE_3_3_2_EXT: Int = 32818

val GL_UNSIGNED_SHORT_4_4_4_4_EXT: Int = 32819

val GL_UNSIGNED_SHORT_5_5_5_1_EXT: Int = 32820

val GL_UNSIGNED_INT_8_8_8_8_EXT: Int = 32821

val GL_UNSIGNED_INT_10_10_10_2_EXT: Int = 32822

val GL_EXT_paletted_texture: Int = 1

val GL_COLOR_INDEX1_EXT: Int = 32994

val GL_COLOR_INDEX2_EXT: Int = 32995

val GL_COLOR_INDEX4_EXT: Int = 32996

val GL_COLOR_INDEX8_EXT: Int = 32997

val GL_COLOR_INDEX12_EXT: Int = 32998

val GL_COLOR_INDEX16_EXT: Int = 32999

val GL_TEXTURE_INDEX_SIZE_EXT: Int = 33005

val GL_EXT_pixel_buffer_object: Int = 1

val GL_PIXEL_PACK_BUFFER_EXT: Int = 35051

val GL_PIXEL_UNPACK_BUFFER_EXT: Int = 35052

val GL_PIXEL_PACK_BUFFER_BINDING_EXT: Int = 35053

val GL_PIXEL_UNPACK_BUFFER_BINDING_EXT: Int = 35055

val GL_EXT_pixel_transform: Int = 1

val GL_PIXEL_TRANSFORM_2D_EXT: Int = 33584

val GL_PIXEL_MAG_FILTER_EXT: Int = 33585

val GL_PIXEL_MIN_FILTER_EXT: Int = 33586

val GL_PIXEL_CUBIC_WEIGHT_EXT: Int = 33587

val GL_CUBIC_EXT: Int = 33588

val GL_AVERAGE_EXT: Int = 33589

val GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT: Int = 33590

val GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT: Int = 33591

val GL_PIXEL_TRANSFORM_2D_MATRIX_EXT: Int = 33592

val GL_EXT_pixel_transform_color_table: Int = 1

val GL_EXT_point_parameters: Int = 1

val GL_POINT_SIZE_MIN_EXT: Int = 33062

val GL_POINT_SIZE_MAX_EXT: Int = 33063

val GL_POINT_FADE_THRESHOLD_SIZE_EXT: Int = 33064

val GL_DISTANCE_ATTENUATION_EXT: Int = 33065

val GL_EXT_polygon_offset: Int = 1

val GL_POLYGON_OFFSET_EXT: Int = 32823

val GL_POLYGON_OFFSET_FACTOR_EXT: Int = 32824

val GL_POLYGON_OFFSET_BIAS_EXT: Int = 32825

val GL_EXT_polygon_offset_clamp: Int = 1

val GL_POLYGON_OFFSET_CLAMP_EXT: Int = 36379

val GL_EXT_post_depth_coverage: Int = 1

val GL_EXT_provoking_vertex: Int = 1

val GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT: Int = 36428

val GL_FIRST_VERTEX_CONVENTION_EXT: Int = 36429

val GL_LAST_VERTEX_CONVENTION_EXT: Int = 36430

val GL_PROVOKING_VERTEX_EXT: Int = 36431

val GL_EXT_raster_multisample: Int = 1

val GL_RASTER_MULTISAMPLE_EXT: Int = 37671

val GL_RASTER_SAMPLES_EXT: Int = 37672

val GL_MAX_RASTER_SAMPLES_EXT: Int = 37673

val GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT: Int = 37674

val GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT: Int = 37675

val GL_EFFECTIVE_RASTER_SAMPLES_EXT: Int = 37676

val GL_EXT_rescale_normal: Int = 1

val GL_RESCALE_NORMAL_EXT: Int = 32826

val GL_EXT_secondary_color: Int = 1

val GL_COLOR_SUM_EXT: Int = 33880

val GL_CURRENT_SECONDARY_COLOR_EXT: Int = 33881

val GL_SECONDARY_COLOR_ARRAY_SIZE_EXT: Int = 33882

val GL_SECONDARY_COLOR_ARRAY_TYPE_EXT: Int = 33883

val GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT: Int = 33884

val GL_SECONDARY_COLOR_ARRAY_POINTER_EXT: Int = 33885

val GL_SECONDARY_COLOR_ARRAY_EXT: Int = 33886

val GL_EXT_separate_shader_objects: Int = 1

val GL_ACTIVE_PROGRAM_EXT: Int = 35725

val GL_EXT_separate_specular_color: Int = 1

val GL_LIGHT_MODEL_COLOR_CONTROL_EXT: Int = 33272

val GL_SINGLE_COLOR_EXT: Int = 33273

val GL_SEPARATE_SPECULAR_COLOR_EXT: Int = 33274

val GL_EXT_shader_image_load_formatted: Int = 1

val GL_EXT_shader_image_load_store: Int = 1

val GL_MAX_IMAGE_UNITS_EXT: Int = 36664

val GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT: Int = 36665

val GL_IMAGE_BINDING_NAME_EXT: Int = 36666

val GL_IMAGE_BINDING_LEVEL_EXT: Int = 36667

val GL_IMAGE_BINDING_LAYERED_EXT: Int = 36668

val GL_IMAGE_BINDING_LAYER_EXT: Int = 36669

val GL_IMAGE_BINDING_ACCESS_EXT: Int = 36670

val GL_IMAGE_1D_EXT: Int = 36940

val GL_IMAGE_2D_EXT: Int = 36941

val GL_IMAGE_3D_EXT: Int = 36942

val GL_IMAGE_2D_RECT_EXT: Int = 36943

val GL_IMAGE_CUBE_EXT: Int = 36944

val GL_IMAGE_BUFFER_EXT: Int = 36945

val GL_IMAGE_1D_ARRAY_EXT: Int = 36946

val GL_IMAGE_2D_ARRAY_EXT: Int = 36947

val GL_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36948

val GL_IMAGE_2D_MULTISAMPLE_EXT: Int = 36949

val GL_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36950

val GL_INT_IMAGE_1D_EXT: Int = 36951

val GL_INT_IMAGE_2D_EXT: Int = 36952

val GL_INT_IMAGE_3D_EXT: Int = 36953

val GL_INT_IMAGE_2D_RECT_EXT: Int = 36954

val GL_INT_IMAGE_CUBE_EXT: Int = 36955

val GL_INT_IMAGE_BUFFER_EXT: Int = 36956

val GL_INT_IMAGE_1D_ARRAY_EXT: Int = 36957

val GL_INT_IMAGE_2D_ARRAY_EXT: Int = 36958

val GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36959

val GL_INT_IMAGE_2D_MULTISAMPLE_EXT: Int = 36960

val GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36961

val GL_UNSIGNED_INT_IMAGE_1D_EXT: Int = 36962

val GL_UNSIGNED_INT_IMAGE_2D_EXT: Int = 36963

val GL_UNSIGNED_INT_IMAGE_3D_EXT: Int = 36964

val GL_UNSIGNED_INT_IMAGE_2D_RECT_EXT: Int = 36965

val GL_UNSIGNED_INT_IMAGE_CUBE_EXT: Int = 36966

val GL_UNSIGNED_INT_IMAGE_BUFFER_EXT: Int = 36967

val GL_UNSIGNED_INT_IMAGE_1D_ARRAY_EXT: Int = 36968

val GL_UNSIGNED_INT_IMAGE_2D_ARRAY_EXT: Int = 36969

val GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT: Int = 36970

val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT: Int = 36971

val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT: Int = 36972

val GL_MAX_IMAGE_SAMPLES_EXT: Int = 36973

val GL_IMAGE_BINDING_FORMAT_EXT: Int = 36974

val GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT: Int = 1

val GL_ELEMENT_ARRAY_BARRIER_BIT_EXT: Int = 2

val GL_UNIFORM_BARRIER_BIT_EXT: Int = 4

val GL_TEXTURE_FETCH_BARRIER_BIT_EXT: Int = 8

val GL_SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT: Int = 32

val GL_COMMAND_BARRIER_BIT_EXT: Int = 64

val GL_PIXEL_BUFFER_BARRIER_BIT_EXT: Int = 128

val GL_TEXTURE_UPDATE_BARRIER_BIT_EXT: Int = 256

val GL_BUFFER_UPDATE_BARRIER_BIT_EXT: Int = 512

val GL_FRAMEBUFFER_BARRIER_BIT_EXT: Int = 1024

val GL_TRANSFORM_FEEDBACK_BARRIER_BIT_EXT: Int = 2048

val GL_ATOMIC_COUNTER_BARRIER_BIT_EXT: Int = 4096

val GL_ALL_BARRIER_BITS_EXT: Int = -1

val GL_EXT_shader_integer_mix: Int = 1

val GL_EXT_shadow_funcs: Int = 1

val GL_EXT_shared_texture_palette: Int = 1

val GL_SHARED_TEXTURE_PALETTE_EXT: Int = 33275

val GL_EXT_sparse_texture2: Int = 1

val GL_EXT_stencil_clear_tag: Int = 1

val GL_STENCIL_TAG_BITS_EXT: Int = 35058

val GL_STENCIL_CLEAR_TAG_VALUE_EXT: Int = 35059

val GL_EXT_stencil_two_side: Int = 1

val GL_STENCIL_TEST_TWO_SIDE_EXT: Int = 35088

val GL_ACTIVE_STENCIL_FACE_EXT: Int = 35089

val GL_EXT_stencil_wrap: Int = 1

val GL_INCR_WRAP_EXT: Int = 34055

val GL_DECR_WRAP_EXT: Int = 34056

val GL_EXT_subtexture: Int = 1

val GL_EXT_texture: Int = 1

val GL_ALPHA4_EXT: Int = 32827

val GL_ALPHA8_EXT: Int = 32828

val GL_ALPHA12_EXT: Int = 32829

val GL_ALPHA16_EXT: Int = 32830

val GL_LUMINANCE4_EXT: Int = 32831

val GL_LUMINANCE8_EXT: Int = 32832

val GL_LUMINANCE12_EXT: Int = 32833

val GL_LUMINANCE16_EXT: Int = 32834

val GL_LUMINANCE4_ALPHA4_EXT: Int = 32835

val GL_LUMINANCE6_ALPHA2_EXT: Int = 32836

val GL_LUMINANCE8_ALPHA8_EXT: Int = 32837

val GL_LUMINANCE12_ALPHA4_EXT: Int = 32838

val GL_LUMINANCE12_ALPHA12_EXT: Int = 32839

val GL_LUMINANCE16_ALPHA16_EXT: Int = 32840

val GL_INTENSITY_EXT: Int = 32841

val GL_INTENSITY4_EXT: Int = 32842

val GL_INTENSITY8_EXT: Int = 32843

val GL_INTENSITY12_EXT: Int = 32844

val GL_INTENSITY16_EXT: Int = 32845

val GL_RGB2_EXT: Int = 32846

val GL_RGB4_EXT: Int = 32847

val GL_RGB5_EXT: Int = 32848

val GL_RGB8_EXT: Int = 32849

val GL_RGB10_EXT: Int = 32850

val GL_RGB12_EXT: Int = 32851

val GL_RGB16_EXT: Int = 32852

val GL_RGBA2_EXT: Int = 32853

val GL_RGBA4_EXT: Int = 32854

val GL_RGB5_A1_EXT: Int = 32855

val GL_RGBA8_EXT: Int = 32856

val GL_RGB10_A2_EXT: Int = 32857

val GL_RGBA12_EXT: Int = 32858

val GL_RGBA16_EXT: Int = 32859

val GL_TEXTURE_RED_SIZE_EXT: Int = 32860

val GL_TEXTURE_GREEN_SIZE_EXT: Int = 32861

val GL_TEXTURE_BLUE_SIZE_EXT: Int = 32862

val GL_TEXTURE_ALPHA_SIZE_EXT: Int = 32863

val GL_TEXTURE_LUMINANCE_SIZE_EXT: Int = 32864

val GL_TEXTURE_INTENSITY_SIZE_EXT: Int = 32865

val GL_REPLACE_EXT: Int = 32866

val GL_PROXY_TEXTURE_1D_EXT: Int = 32867

val GL_PROXY_TEXTURE_2D_EXT: Int = 32868

val GL_TEXTURE_TOO_LARGE_EXT: Int = 32869

val GL_EXT_texture3D: Int = 1

val GL_PACK_SKIP_IMAGES_EXT: Int = 32875

val GL_PACK_IMAGE_HEIGHT_EXT: Int = 32876

val GL_UNPACK_SKIP_IMAGES_EXT: Int = 32877

val GL_UNPACK_IMAGE_HEIGHT_EXT: Int = 32878

val GL_TEXTURE_3D_EXT: Int = 32879

val GL_PROXY_TEXTURE_3D_EXT: Int = 32880

val GL_TEXTURE_DEPTH_EXT: Int = 32881

val GL_TEXTURE_WRAP_R_EXT: Int = 32882

val GL_MAX_3D_TEXTURE_SIZE_EXT: Int = 32883

val GL_EXT_texture_array: Int = 1

val GL_TEXTURE_1D_ARRAY_EXT: Int = 35864

val GL_PROXY_TEXTURE_1D_ARRAY_EXT: Int = 35865

val GL_TEXTURE_2D_ARRAY_EXT: Int = 35866

val GL_PROXY_TEXTURE_2D_ARRAY_EXT: Int = 35867

val GL_TEXTURE_BINDING_1D_ARRAY_EXT: Int = 35868

val GL_TEXTURE_BINDING_2D_ARRAY_EXT: Int = 35869

val GL_MAX_ARRAY_TEXTURE_LAYERS_EXT: Int = 35071

val GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT: Int = 34894

val GL_EXT_texture_buffer_object: Int = 1

val GL_TEXTURE_BUFFER_EXT: Int = 35882

val GL_MAX_TEXTURE_BUFFER_SIZE_EXT: Int = 35883

val GL_TEXTURE_BINDING_BUFFER_EXT: Int = 35884

val GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT: Int = 35885

val GL_TEXTURE_BUFFER_FORMAT_EXT: Int = 35886

val GL_EXT_texture_compression_latc: Int = 1

val GL_COMPRESSED_LUMINANCE_LATC1_EXT: Int = 35952

val GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT: Int = 35953

val GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT: Int = 35954

val GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT: Int = 35955

val GL_EXT_texture_compression_rgtc: Int = 1

val GL_COMPRESSED_RED_RGTC1_EXT: Int = 36283

val GL_COMPRESSED_SIGNED_RED_RGTC1_EXT: Int = 36284

val GL_COMPRESSED_RED_GREEN_RGTC2_EXT: Int = 36285

val GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: Int = 36286

val GL_EXT_texture_compression_s3tc: Int = 1

val GL_COMPRESSED_RGB_S3TC_DXT1_EXT: Int = 33776

val GL_COMPRESSED_RGBA_S3TC_DXT1_EXT: Int = 33777

val GL_COMPRESSED_RGBA_S3TC_DXT3_EXT: Int = 33778

val GL_COMPRESSED_RGBA_S3TC_DXT5_EXT: Int = 33779

val GL_EXT_texture_cube_map: Int = 1

val GL_NORMAL_MAP_EXT: Int = 34065

val GL_REFLECTION_MAP_EXT: Int = 34066

val GL_TEXTURE_CUBE_MAP_EXT: Int = 34067

val GL_TEXTURE_BINDING_CUBE_MAP_EXT: Int = 34068

val GL_TEXTURE_CUBE_MAP_POSITIVE_X_EXT: Int = 34069

val GL_TEXTURE_CUBE_MAP_NEGATIVE_X_EXT: Int = 34070

val GL_TEXTURE_CUBE_MAP_POSITIVE_Y_EXT: Int = 34071

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_EXT: Int = 34072

val GL_TEXTURE_CUBE_MAP_POSITIVE_Z_EXT: Int = 34073

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_EXT: Int = 34074

val GL_PROXY_TEXTURE_CUBE_MAP_EXT: Int = 34075

val GL_MAX_CUBE_MAP_TEXTURE_SIZE_EXT: Int = 34076

val GL_EXT_texture_env_add: Int = 1

val GL_EXT_texture_env_combine: Int = 1

val GL_COMBINE_EXT: Int = 34160

val GL_COMBINE_RGB_EXT: Int = 34161

val GL_COMBINE_ALPHA_EXT: Int = 34162

val GL_RGB_SCALE_EXT: Int = 34163

val GL_ADD_SIGNED_EXT: Int = 34164

val GL_INTERPOLATE_EXT: Int = 34165

val GL_CONSTANT_EXT: Int = 34166

val GL_PRIMARY_COLOR_EXT: Int = 34167

val GL_PREVIOUS_EXT: Int = 34168

val GL_SOURCE0_RGB_EXT: Int = 34176

val GL_SOURCE1_RGB_EXT: Int = 34177

val GL_SOURCE2_RGB_EXT: Int = 34178

val GL_SOURCE0_ALPHA_EXT: Int = 34184

val GL_SOURCE1_ALPHA_EXT: Int = 34185

val GL_SOURCE2_ALPHA_EXT: Int = 34186

val GL_OPERAND0_RGB_EXT: Int = 34192

val GL_OPERAND1_RGB_EXT: Int = 34193

val GL_OPERAND2_RGB_EXT: Int = 34194

val GL_OPERAND0_ALPHA_EXT: Int = 34200

val GL_OPERAND1_ALPHA_EXT: Int = 34201

val GL_OPERAND2_ALPHA_EXT: Int = 34202

val GL_EXT_texture_env_dot3: Int = 1

val GL_DOT3_RGB_EXT: Int = 34624

val GL_DOT3_RGBA_EXT: Int = 34625

val GL_EXT_texture_filter_anisotropic: Int = 1

val GL_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34046

val GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT: Int = 34047

val GL_EXT_texture_filter_minmax: Int = 1

val GL_EXT_texture_integer: Int = 1

val GL_RGBA32UI_EXT: Int = 36208

val GL_RGB32UI_EXT: Int = 36209

val GL_ALPHA32UI_EXT: Int = 36210

val GL_INTENSITY32UI_EXT: Int = 36211

val GL_LUMINANCE32UI_EXT: Int = 36212

val GL_LUMINANCE_ALPHA32UI_EXT: Int = 36213

val GL_RGBA16UI_EXT: Int = 36214

val GL_RGB16UI_EXT: Int = 36215

val GL_ALPHA16UI_EXT: Int = 36216

val GL_INTENSITY16UI_EXT: Int = 36217

val GL_LUMINANCE16UI_EXT: Int = 36218

val GL_LUMINANCE_ALPHA16UI_EXT: Int = 36219

val GL_RGBA8UI_EXT: Int = 36220

val GL_RGB8UI_EXT: Int = 36221

val GL_ALPHA8UI_EXT: Int = 36222

val GL_INTENSITY8UI_EXT: Int = 36223

val GL_LUMINANCE8UI_EXT: Int = 36224

val GL_LUMINANCE_ALPHA8UI_EXT: Int = 36225

val GL_RGBA32I_EXT: Int = 36226

val GL_RGB32I_EXT: Int = 36227

val GL_ALPHA32I_EXT: Int = 36228

val GL_INTENSITY32I_EXT: Int = 36229

val GL_LUMINANCE32I_EXT: Int = 36230

val GL_LUMINANCE_ALPHA32I_EXT: Int = 36231

val GL_RGBA16I_EXT: Int = 36232

val GL_RGB16I_EXT: Int = 36233

val GL_ALPHA16I_EXT: Int = 36234

val GL_INTENSITY16I_EXT: Int = 36235

val GL_LUMINANCE16I_EXT: Int = 36236

val GL_LUMINANCE_ALPHA16I_EXT: Int = 36237

val GL_RGBA8I_EXT: Int = 36238

val GL_RGB8I_EXT: Int = 36239

val GL_ALPHA8I_EXT: Int = 36240

val GL_INTENSITY8I_EXT: Int = 36241

val GL_LUMINANCE8I_EXT: Int = 36242

val GL_LUMINANCE_ALPHA8I_EXT: Int = 36243

val GL_RED_INTEGER_EXT: Int = 36244

val GL_GREEN_INTEGER_EXT: Int = 36245

val GL_BLUE_INTEGER_EXT: Int = 36246

val GL_ALPHA_INTEGER_EXT: Int = 36247

val GL_RGB_INTEGER_EXT: Int = 36248

val GL_RGBA_INTEGER_EXT: Int = 36249

val GL_BGR_INTEGER_EXT: Int = 36250

val GL_BGRA_INTEGER_EXT: Int = 36251

val GL_LUMINANCE_INTEGER_EXT: Int = 36252

val GL_LUMINANCE_ALPHA_INTEGER_EXT: Int = 36253

val GL_RGBA_INTEGER_MODE_EXT: Int = 36254

val GL_EXT_texture_lod_bias: Int = 1

val GL_MAX_TEXTURE_LOD_BIAS_EXT: Int = 34045

val GL_TEXTURE_FILTER_CONTROL_EXT: Int = 34048

val GL_TEXTURE_LOD_BIAS_EXT: Int = 34049

val GL_EXT_texture_mirror_clamp: Int = 1

val GL_MIRROR_CLAMP_EXT: Int = 34626

val GL_MIRROR_CLAMP_TO_EDGE_EXT: Int = 34627

val GL_MIRROR_CLAMP_TO_BORDER_EXT: Int = 35090

val GL_EXT_texture_object: Int = 1

val GL_TEXTURE_PRIORITY_EXT: Int = 32870

val GL_TEXTURE_RESIDENT_EXT: Int = 32871

val GL_TEXTURE_1D_BINDING_EXT: Int = 32872

val GL_TEXTURE_2D_BINDING_EXT: Int = 32873

val GL_TEXTURE_3D_BINDING_EXT: Int = 32874

val GL_EXT_texture_perturb_normal: Int = 1

val GL_PERTURB_EXT: Int = 34222

val GL_TEXTURE_NORMAL_EXT: Int = 34223

val GL_EXT_texture_sRGB: Int = 1

val GL_SRGB_EXT: Int = 35904

val GL_SRGB8_EXT: Int = 35905

val GL_SRGB_ALPHA_EXT: Int = 35906

val GL_SRGB8_ALPHA8_EXT: Int = 35907

val GL_SLUMINANCE_ALPHA_EXT: Int = 35908

val GL_SLUMINANCE8_ALPHA8_EXT: Int = 35909

val GL_SLUMINANCE_EXT: Int = 35910

val GL_SLUMINANCE8_EXT: Int = 35911

val GL_COMPRESSED_SRGB_EXT: Int = 35912

val GL_COMPRESSED_SRGB_ALPHA_EXT: Int = 35913

val GL_COMPRESSED_SLUMINANCE_EXT: Int = 35914

val GL_COMPRESSED_SLUMINANCE_ALPHA_EXT: Int = 35915

val GL_COMPRESSED_SRGB_S3TC_DXT1_EXT: Int = 35916

val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: Int = 35917

val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: Int = 35918

val GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: Int = 35919

val GL_EXT_texture_sRGB_decode: Int = 1

val GL_TEXTURE_SRGB_DECODE_EXT: Int = 35400

val GL_DECODE_EXT: Int = 35401

val GL_SKIP_DECODE_EXT: Int = 35402

val GL_EXT_texture_shared_exponent: Int = 1

val GL_RGB9_E5_EXT: Int = 35901

val GL_UNSIGNED_INT_5_9_9_9_REV_EXT: Int = 35902

val GL_TEXTURE_SHARED_SIZE_EXT: Int = 35903

val GL_EXT_texture_snorm: Int = 1

val GL_ALPHA_SNORM: Int = 36880

val GL_LUMINANCE_SNORM: Int = 36881

val GL_LUMINANCE_ALPHA_SNORM: Int = 36882

val GL_INTENSITY_SNORM: Int = 36883

val GL_ALPHA8_SNORM: Int = 36884

val GL_LUMINANCE8_SNORM: Int = 36885

val GL_LUMINANCE8_ALPHA8_SNORM: Int = 36886

val GL_INTENSITY8_SNORM: Int = 36887

val GL_ALPHA16_SNORM: Int = 36888

val GL_LUMINANCE16_SNORM: Int = 36889

val GL_LUMINANCE16_ALPHA16_SNORM: Int = 36890

val GL_INTENSITY16_SNORM: Int = 36891

val GL_RED_SNORM: Int = 36752

val GL_RG_SNORM: Int = 36753

val GL_RGB_SNORM: Int = 36754

val GL_RGBA_SNORM: Int = 36755

val GL_EXT_texture_swizzle: Int = 1

val GL_TEXTURE_SWIZZLE_R_EXT: Int = 36418

val GL_TEXTURE_SWIZZLE_G_EXT: Int = 36419

val GL_TEXTURE_SWIZZLE_B_EXT: Int = 36420

val GL_TEXTURE_SWIZZLE_A_EXT: Int = 36421

val GL_TEXTURE_SWIZZLE_RGBA_EXT: Int = 36422

val GL_EXT_timer_query: Int = 1

val GL_TIME_ELAPSED_EXT: Int = 35007

val GL_EXT_transform_feedback: Int = 1

val GL_TRANSFORM_FEEDBACK_BUFFER_EXT: Int = 35982

val GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT: Int = 35972

val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT: Int = 35973

val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT: Int = 35983

val GL_INTERLEAVED_ATTRIBS_EXT: Int = 35980

val GL_SEPARATE_ATTRIBS_EXT: Int = 35981

val GL_PRIMITIVES_GENERATED_EXT: Int = 35975

val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT: Int = 35976

val GL_RASTERIZER_DISCARD_EXT: Int = 35977

val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT: Int = 35978

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT: Int = 35979

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT: Int = 35968

val GL_TRANSFORM_FEEDBACK_VARYINGS_EXT: Int = 35971

val GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT: Int = 35967

val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT: Int = 35958

val GL_EXT_vertex_array: Int = 1

val GL_VERTEX_ARRAY_EXT: Int = 32884

val GL_NORMAL_ARRAY_EXT: Int = 32885

val GL_COLOR_ARRAY_EXT: Int = 32886

val GL_INDEX_ARRAY_EXT: Int = 32887

val GL_TEXTURE_COORD_ARRAY_EXT: Int = 32888

val GL_EDGE_FLAG_ARRAY_EXT: Int = 32889

val GL_VERTEX_ARRAY_SIZE_EXT: Int = 32890

val GL_VERTEX_ARRAY_TYPE_EXT: Int = 32891

val GL_VERTEX_ARRAY_STRIDE_EXT: Int = 32892

val GL_VERTEX_ARRAY_COUNT_EXT: Int = 32893

val GL_NORMAL_ARRAY_TYPE_EXT: Int = 32894

val GL_NORMAL_ARRAY_STRIDE_EXT: Int = 32895

val GL_NORMAL_ARRAY_COUNT_EXT: Int = 32896

val GL_COLOR_ARRAY_SIZE_EXT: Int = 32897

val GL_COLOR_ARRAY_TYPE_EXT: Int = 32898

val GL_COLOR_ARRAY_STRIDE_EXT: Int = 32899

val GL_COLOR_ARRAY_COUNT_EXT: Int = 32900

val GL_INDEX_ARRAY_TYPE_EXT: Int = 32901

val GL_INDEX_ARRAY_STRIDE_EXT: Int = 32902

val GL_INDEX_ARRAY_COUNT_EXT: Int = 32903

val GL_TEXTURE_COORD_ARRAY_SIZE_EXT: Int = 32904

val GL_TEXTURE_COORD_ARRAY_TYPE_EXT: Int = 32905

val GL_TEXTURE_COORD_ARRAY_STRIDE_EXT: Int = 32906

val GL_TEXTURE_COORD_ARRAY_COUNT_EXT: Int = 32907

val GL_EDGE_FLAG_ARRAY_STRIDE_EXT: Int = 32908

val GL_EDGE_FLAG_ARRAY_COUNT_EXT: Int = 32909

val GL_VERTEX_ARRAY_POINTER_EXT: Int = 32910

val GL_NORMAL_ARRAY_POINTER_EXT: Int = 32911

val GL_COLOR_ARRAY_POINTER_EXT: Int = 32912

val GL_INDEX_ARRAY_POINTER_EXT: Int = 32913

val GL_TEXTURE_COORD_ARRAY_POINTER_EXT: Int = 32914

val GL_EDGE_FLAG_ARRAY_POINTER_EXT: Int = 32915

val GL_EXT_vertex_array_bgra: Int = 1

val GL_EXT_vertex_attrib_64bit: Int = 1

val GL_DOUBLE_VEC2_EXT: Int = 36860

val GL_DOUBLE_VEC3_EXT: Int = 36861

val GL_DOUBLE_VEC4_EXT: Int = 36862

val GL_DOUBLE_MAT2_EXT: Int = 36678

val GL_DOUBLE_MAT3_EXT: Int = 36679

val GL_DOUBLE_MAT4_EXT: Int = 36680

val GL_DOUBLE_MAT2x3_EXT: Int = 36681

val GL_DOUBLE_MAT2x4_EXT: Int = 36682

val GL_DOUBLE_MAT3x2_EXT: Int = 36683

val GL_DOUBLE_MAT3x4_EXT: Int = 36684

val GL_DOUBLE_MAT4x2_EXT: Int = 36685

val GL_DOUBLE_MAT4x3_EXT: Int = 36686

val GL_EXT_vertex_shader: Int = 1

val GL_VERTEX_SHADER_EXT: Int = 34688

val GL_VERTEX_SHADER_BINDING_EXT: Int = 34689

val GL_OP_INDEX_EXT: Int = 34690

val GL_OP_NEGATE_EXT: Int = 34691

val GL_OP_DOT3_EXT: Int = 34692

val GL_OP_DOT4_EXT: Int = 34693

val GL_OP_MUL_EXT: Int = 34694

val GL_OP_ADD_EXT: Int = 34695

val GL_OP_MADD_EXT: Int = 34696

val GL_OP_FRAC_EXT: Int = 34697

val GL_OP_MAX_EXT: Int = 34698

val GL_OP_MIN_EXT: Int = 34699

val GL_OP_SET_GE_EXT: Int = 34700

val GL_OP_SET_LT_EXT: Int = 34701

val GL_OP_CLAMP_EXT: Int = 34702

val GL_OP_FLOOR_EXT: Int = 34703

val GL_OP_ROUND_EXT: Int = 34704

val GL_OP_EXP_BASE_2_EXT: Int = 34705

val GL_OP_LOG_BASE_2_EXT: Int = 34706

val GL_OP_POWER_EXT: Int = 34707

val GL_OP_RECIP_EXT: Int = 34708

val GL_OP_RECIP_SQRT_EXT: Int = 34709

val GL_OP_SUB_EXT: Int = 34710

val GL_OP_CROSS_PRODUCT_EXT: Int = 34711

val GL_OP_MULTIPLY_MATRIX_EXT: Int = 34712

val GL_OP_MOV_EXT: Int = 34713

val GL_OUTPUT_VERTEX_EXT: Int = 34714

val GL_OUTPUT_COLOR0_EXT: Int = 34715

val GL_OUTPUT_COLOR1_EXT: Int = 34716

val GL_OUTPUT_TEXTURE_COORD0_EXT: Int = 34717

val GL_OUTPUT_TEXTURE_COORD1_EXT: Int = 34718

val GL_OUTPUT_TEXTURE_COORD2_EXT: Int = 34719

val GL_OUTPUT_TEXTURE_COORD3_EXT: Int = 34720

val GL_OUTPUT_TEXTURE_COORD4_EXT: Int = 34721

val GL_OUTPUT_TEXTURE_COORD5_EXT: Int = 34722

val GL_OUTPUT_TEXTURE_COORD6_EXT: Int = 34723

val GL_OUTPUT_TEXTURE_COORD7_EXT: Int = 34724

val GL_OUTPUT_TEXTURE_COORD8_EXT: Int = 34725

val GL_OUTPUT_TEXTURE_COORD9_EXT: Int = 34726

val GL_OUTPUT_TEXTURE_COORD10_EXT: Int = 34727

val GL_OUTPUT_TEXTURE_COORD11_EXT: Int = 34728

val GL_OUTPUT_TEXTURE_COORD12_EXT: Int = 34729

val GL_OUTPUT_TEXTURE_COORD13_EXT: Int = 34730

val GL_OUTPUT_TEXTURE_COORD14_EXT: Int = 34731

val GL_OUTPUT_TEXTURE_COORD15_EXT: Int = 34732

val GL_OUTPUT_TEXTURE_COORD16_EXT: Int = 34733

val GL_OUTPUT_TEXTURE_COORD17_EXT: Int = 34734

val GL_OUTPUT_TEXTURE_COORD18_EXT: Int = 34735

val GL_OUTPUT_TEXTURE_COORD19_EXT: Int = 34736

val GL_OUTPUT_TEXTURE_COORD20_EXT: Int = 34737

val GL_OUTPUT_TEXTURE_COORD21_EXT: Int = 34738

val GL_OUTPUT_TEXTURE_COORD22_EXT: Int = 34739

val GL_OUTPUT_TEXTURE_COORD23_EXT: Int = 34740

val GL_OUTPUT_TEXTURE_COORD24_EXT: Int = 34741

val GL_OUTPUT_TEXTURE_COORD25_EXT: Int = 34742

val GL_OUTPUT_TEXTURE_COORD26_EXT: Int = 34743

val GL_OUTPUT_TEXTURE_COORD27_EXT: Int = 34744

val GL_OUTPUT_TEXTURE_COORD28_EXT: Int = 34745

val GL_OUTPUT_TEXTURE_COORD29_EXT: Int = 34746

val GL_OUTPUT_TEXTURE_COORD30_EXT: Int = 34747

val GL_OUTPUT_TEXTURE_COORD31_EXT: Int = 34748

val GL_OUTPUT_FOG_EXT: Int = 34749

val GL_SCALAR_EXT: Int = 34750

val GL_VECTOR_EXT: Int = 34751

val GL_MATRIX_EXT: Int = 34752

val GL_VARIANT_EXT: Int = 34753

val GL_INVARIANT_EXT: Int = 34754

val GL_LOCAL_CONSTANT_EXT: Int = 34755

val GL_LOCAL_EXT: Int = 34756

val GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34757

val GL_MAX_VERTEX_SHADER_VARIANTS_EXT: Int = 34758

val GL_MAX_VERTEX_SHADER_INVARIANTS_EXT: Int = 34759

val GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34760

val GL_MAX_VERTEX_SHADER_LOCALS_EXT: Int = 34761

val GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34762

val GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT: Int = 34763

val GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34764

val GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT: Int = 34765

val GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT: Int = 34766

val GL_VERTEX_SHADER_INSTRUCTIONS_EXT: Int = 34767

val GL_VERTEX_SHADER_VARIANTS_EXT: Int = 34768

val GL_VERTEX_SHADER_INVARIANTS_EXT: Int = 34769

val GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT: Int = 34770

val GL_VERTEX_SHADER_LOCALS_EXT: Int = 34771

val GL_VERTEX_SHADER_OPTIMIZED_EXT: Int = 34772

val GL_X_EXT: Int = 34773

val GL_Y_EXT: Int = 34774

val GL_Z_EXT: Int = 34775

val GL_W_EXT: Int = 34776

val GL_NEGATIVE_X_EXT: Int = 34777

val GL_NEGATIVE_Y_EXT: Int = 34778

val GL_NEGATIVE_Z_EXT: Int = 34779

val GL_NEGATIVE_W_EXT: Int = 34780

val GL_ZERO_EXT: Int = 34781

val GL_ONE_EXT: Int = 34782

val GL_NEGATIVE_ONE_EXT: Int = 34783

val GL_NORMALIZED_RANGE_EXT: Int = 34784

val GL_FULL_RANGE_EXT: Int = 34785

val GL_CURRENT_VERTEX_EXT: Int = 34786

val GL_MVP_MATRIX_EXT: Int = 34787

val GL_VARIANT_VALUE_EXT: Int = 34788

val GL_VARIANT_DATATYPE_EXT: Int = 34789

val GL_VARIANT_ARRAY_STRIDE_EXT: Int = 34790

val GL_VARIANT_ARRAY_TYPE_EXT: Int = 34791

val GL_VARIANT_ARRAY_EXT: Int = 34792

val GL_VARIANT_ARRAY_POINTER_EXT: Int = 34793

val GL_INVARIANT_VALUE_EXT: Int = 34794

val GL_INVARIANT_DATATYPE_EXT: Int = 34795

val GL_LOCAL_CONSTANT_VALUE_EXT: Int = 34796

val GL_LOCAL_CONSTANT_DATATYPE_EXT: Int = 34797

val GL_EXT_vertex_weighting: Int = 1

val GL_MODELVIEW0_STACK_DEPTH_EXT: Int = 2979

val GL_MODELVIEW1_STACK_DEPTH_EXT: Int = 34050

val GL_MODELVIEW0_MATRIX_EXT: Int = 2982

val GL_MODELVIEW1_MATRIX_EXT: Int = 34054

val GL_VERTEX_WEIGHTING_EXT: Int = 34057

val GL_MODELVIEW0_EXT: Int = 5888

val GL_MODELVIEW1_EXT: Int = 34058

val GL_CURRENT_VERTEX_WEIGHT_EXT: Int = 34059

val GL_VERTEX_WEIGHT_ARRAY_EXT: Int = 34060

val GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT: Int = 34061

val GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT: Int = 34062

val GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT: Int = 34063

val GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT: Int = 34064

val GL_EXT_window_rectangles: Int = 1

val GL_INCLUSIVE_EXT: Int = 36624

val GL_EXCLUSIVE_EXT: Int = 36625

val GL_WINDOW_RECTANGLE_EXT: Int = 36626

val GL_WINDOW_RECTANGLE_MODE_EXT: Int = 36627

val GL_MAX_WINDOW_RECTANGLES_EXT: Int = 36628

val GL_NUM_WINDOW_RECTANGLES_EXT: Int = 36629

val GL_EXT_x11_sync_object: Int = 1

val GL_SYNC_X11_FENCE_EXT: Int = 37089

val GL_GREMEDY_frame_terminator: Int = 1

val GL_GREMEDY_string_marker: Int = 1

val GL_HP_convolution_border_modes: Int = 1

val GL_IGNORE_BORDER_HP: Int = 33104

val GL_CONSTANT_BORDER_HP: Int = 33105

val GL_REPLICATE_BORDER_HP: Int = 33107

val GL_CONVOLUTION_BORDER_COLOR_HP: Int = 33108

val GL_HP_image_transform: Int = 1

val GL_IMAGE_SCALE_X_HP: Int = 33109

val GL_IMAGE_SCALE_Y_HP: Int = 33110

val GL_IMAGE_TRANSLATE_X_HP: Int = 33111

val GL_IMAGE_TRANSLATE_Y_HP: Int = 33112

val GL_IMAGE_ROTATE_ANGLE_HP: Int = 33113

val GL_IMAGE_ROTATE_ORIGIN_X_HP: Int = 33114

val GL_IMAGE_ROTATE_ORIGIN_Y_HP: Int = 33115

val GL_IMAGE_MAG_FILTER_HP: Int = 33116

val GL_IMAGE_MIN_FILTER_HP: Int = 33117

val GL_IMAGE_CUBIC_WEIGHT_HP: Int = 33118

val GL_CUBIC_HP: Int = 33119

val GL_AVERAGE_HP: Int = 33120

val GL_IMAGE_TRANSFORM_2D_HP: Int = 33121

val GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP: Int = 33122

val GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP: Int = 33123

val GL_HP_occlusion_test: Int = 1

val GL_OCCLUSION_TEST_HP: Int = 33125

val GL_OCCLUSION_TEST_RESULT_HP: Int = 33126

val GL_HP_texture_lighting: Int = 1

val GL_TEXTURE_LIGHTING_MODE_HP: Int = 33127

val GL_TEXTURE_POST_SPECULAR_HP: Int = 33128

val GL_TEXTURE_PRE_SPECULAR_HP: Int = 33129

val GL_IBM_cull_vertex: Int = 1

val GL_CULL_VERTEX_IBM: Int = 103050

val GL_IBM_multimode_draw_arrays: Int = 1

val GL_IBM_rasterpos_clip: Int = 1

val GL_RASTER_POSITION_UNCLIPPED_IBM: Int = 103010

val GL_IBM_static_data: Int = 1

val GL_ALL_STATIC_DATA_IBM: Int = 103060

val GL_STATIC_VERTEX_ARRAY_IBM: Int = 103061

val GL_IBM_texture_mirrored_repeat: Int = 1

val GL_MIRRORED_REPEAT_IBM: Int = 33648

val GL_IBM_vertex_array_lists: Int = 1

val GL_VERTEX_ARRAY_LIST_IBM: Int = 103070

val GL_NORMAL_ARRAY_LIST_IBM: Int = 103071

val GL_COLOR_ARRAY_LIST_IBM: Int = 103072

val GL_INDEX_ARRAY_LIST_IBM: Int = 103073

val GL_TEXTURE_COORD_ARRAY_LIST_IBM: Int = 103074

val GL_EDGE_FLAG_ARRAY_LIST_IBM: Int = 103075

val GL_FOG_COORDINATE_ARRAY_LIST_IBM: Int = 103076

val GL_SECONDARY_COLOR_ARRAY_LIST_IBM: Int = 103077

val GL_VERTEX_ARRAY_LIST_STRIDE_IBM: Int = 103080

val GL_NORMAL_ARRAY_LIST_STRIDE_IBM: Int = 103081

val GL_COLOR_ARRAY_LIST_STRIDE_IBM: Int = 103082

val GL_INDEX_ARRAY_LIST_STRIDE_IBM: Int = 103083

val GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM: Int = 103084

val GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM: Int = 103085

val GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM: Int = 103086

val GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM: Int = 103087

val GL_INGR_blend_func_separate: Int = 1

val GL_INGR_color_clamp: Int = 1

val GL_RED_MIN_CLAMP_INGR: Int = 34144

val GL_GREEN_MIN_CLAMP_INGR: Int = 34145

val GL_BLUE_MIN_CLAMP_INGR: Int = 34146

val GL_ALPHA_MIN_CLAMP_INGR: Int = 34147

val GL_RED_MAX_CLAMP_INGR: Int = 34148

val GL_GREEN_MAX_CLAMP_INGR: Int = 34149

val GL_BLUE_MAX_CLAMP_INGR: Int = 34150

val GL_ALPHA_MAX_CLAMP_INGR: Int = 34151

val GL_INGR_interlace_read: Int = 1

val GL_INTERLACE_READ_INGR: Int = 34152

val GL_INTEL_fragment_shader_ordering: Int = 1

val GL_INTEL_framebuffer_CMAA: Int = 1

val GL_INTEL_map_texture: Int = 1

val GL_TEXTURE_MEMORY_LAYOUT_INTEL: Int = 33791

val GL_LAYOUT_DEFAULT_INTEL: Int = 0

val GL_LAYOUT_LINEAR_INTEL: Int = 1

val GL_LAYOUT_LINEAR_CPU_CACHED_INTEL: Int = 2

val GL_INTEL_parallel_arrays: Int = 1

val GL_PARALLEL_ARRAYS_INTEL: Int = 33780

val GL_VERTEX_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33781

val GL_NORMAL_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33782

val GL_COLOR_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33783

val GL_TEXTURE_COORD_ARRAY_PARALLEL_POINTERS_INTEL: Int = 33784

val GL_INTEL_performance_query: Int = 1

val GL_PERFQUERY_SINGLE_CONTEXT_INTEL: Int = 0

val GL_PERFQUERY_GLOBAL_CONTEXT_INTEL: Int = 1

val GL_PERFQUERY_WAIT_INTEL: Int = 33787

val GL_PERFQUERY_FLUSH_INTEL: Int = 33786

val GL_PERFQUERY_DONOT_FLUSH_INTEL: Int = 33785

val GL_PERFQUERY_COUNTER_EVENT_INTEL: Int = 38128

val GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL: Int = 38129

val GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL: Int = 38130

val GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL: Int = 38131

val GL_PERFQUERY_COUNTER_RAW_INTEL: Int = 38132

val GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL: Int = 38133

val GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL: Int = 38136

val GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL: Int = 38137

val GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL: Int = 38138

val GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL: Int = 38139

val GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL: Int = 38140

val GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL: Int = 38141

val GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL: Int = 38142

val GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL: Int = 38143

val GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL: Int = 38144

val GL_MESAX_texture_stack: Int = 1

val GL_TEXTURE_1D_STACK_MESAX: Int = 34649

val GL_TEXTURE_2D_STACK_MESAX: Int = 34650

val GL_PROXY_TEXTURE_1D_STACK_MESAX: Int = 34651

val GL_PROXY_TEXTURE_2D_STACK_MESAX: Int = 34652

val GL_TEXTURE_1D_STACK_BINDING_MESAX: Int = 34653

val GL_TEXTURE_2D_STACK_BINDING_MESAX: Int = 34654

val GL_MESA_pack_invert: Int = 1

val GL_PACK_INVERT_MESA: Int = 34648

val GL_MESA_resize_buffers: Int = 1

val GL_MESA_window_pos: Int = 1

val GL_MESA_ycbcr_texture: Int = 1

val GL_UNSIGNED_SHORT_8_8_MESA: Int = 34234

val GL_UNSIGNED_SHORT_8_8_REV_MESA: Int = 34235

val GL_YCBCR_MESA: Int = 34647

val GL_NVX_conditional_render: Int = 1

val GL_NVX_gpu_memory_info: Int = 1

val GL_GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX: Int = 36935

val GL_GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX: Int = 36936

val GL_GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX: Int = 36937

val GL_GPU_MEMORY_INFO_EVICTION_COUNT_NVX: Int = 36938

val GL_GPU_MEMORY_INFO_EVICTED_MEMORY_NVX: Int = 36939

val GL_NV_bindless_multi_draw_indirect: Int = 1

val GL_NV_bindless_multi_draw_indirect_count: Int = 1

val GL_NV_bindless_texture: Int = 1

val GL_NV_blend_equation_advanced: Int = 1

val GL_BLEND_OVERLAP_NV: Int = 37505

val GL_BLEND_PREMULTIPLIED_SRC_NV: Int = 37504

val GL_BLUE_NV: Int = 6405

val GL_COLORBURN_NV: Int = 37530

val GL_COLORDODGE_NV: Int = 37529

val GL_CONJOINT_NV: Int = 37508

val GL_CONTRAST_NV: Int = 37537

val GL_DARKEN_NV: Int = 37527

val GL_DIFFERENCE_NV: Int = 37534

val GL_DISJOINT_NV: Int = 37507

val GL_DST_ATOP_NV: Int = 37519

val GL_DST_IN_NV: Int = 37515

val GL_DST_NV: Int = 37511

val GL_DST_OUT_NV: Int = 37517

val GL_DST_OVER_NV: Int = 37513

val GL_EXCLUSION_NV: Int = 37536

val GL_GREEN_NV: Int = 6404

val GL_HARDLIGHT_NV: Int = 37531

val GL_HARDMIX_NV: Int = 37545

val GL_HSL_COLOR_NV: Int = 37551

val GL_HSL_HUE_NV: Int = 37549

val GL_HSL_LUMINOSITY_NV: Int = 37552

val GL_HSL_SATURATION_NV: Int = 37550

val GL_INVERT_OVG_NV: Int = 37556

val GL_INVERT_RGB_NV: Int = 37539

val GL_LIGHTEN_NV: Int = 37528

val GL_LINEARBURN_NV: Int = 37541

val GL_LINEARDODGE_NV: Int = 37540

val GL_LINEARLIGHT_NV: Int = 37543

val GL_MINUS_CLAMPED_NV: Int = 37555

val GL_MINUS_NV: Int = 37535

val GL_MULTIPLY_NV: Int = 37524

val GL_OVERLAY_NV: Int = 37526

val GL_PINLIGHT_NV: Int = 37544

val GL_PLUS_CLAMPED_ALPHA_NV: Int = 37554

val GL_PLUS_CLAMPED_NV: Int = 37553

val GL_PLUS_DARKER_NV: Int = 37522

val GL_PLUS_NV: Int = 37521

val GL_RED_NV: Int = 6403

val GL_SCREEN_NV: Int = 37525

val GL_SOFTLIGHT_NV: Int = 37532

val GL_SRC_ATOP_NV: Int = 37518

val GL_SRC_IN_NV: Int = 37514

val GL_SRC_NV: Int = 37510

val GL_SRC_OUT_NV: Int = 37516

val GL_SRC_OVER_NV: Int = 37512

val GL_UNCORRELATED_NV: Int = 37506

val GL_VIVIDLIGHT_NV: Int = 37542

val GL_XOR_NV: Int = 5382

val GL_NV_blend_equation_advanced_coherent: Int = 1

val GL_BLEND_ADVANCED_COHERENT_NV: Int = 37509

val GL_NV_blend_square: Int = 1

val GL_NV_clip_space_w_scaling: Int = 1

val GL_VIEWPORT_POSITION_W_SCALE_NV: Int = 37756

val GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV: Int = 37757

val GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV: Int = 37758

val GL_NV_command_list: Int = 1

val GL_TERMINATE_SEQUENCE_COMMAND_NV: Int = 0

val GL_NOP_COMMAND_NV: Int = 1

val GL_DRAW_ELEMENTS_COMMAND_NV: Int = 2

val GL_DRAW_ARRAYS_COMMAND_NV: Int = 3

val GL_DRAW_ELEMENTS_STRIP_COMMAND_NV: Int = 4

val GL_DRAW_ARRAYS_STRIP_COMMAND_NV: Int = 5

val GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV: Int = 6

val GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV: Int = 7

val GL_ELEMENT_ADDRESS_COMMAND_NV: Int = 8

val GL_ATTRIBUTE_ADDRESS_COMMAND_NV: Int = 9

val GL_UNIFORM_ADDRESS_COMMAND_NV: Int = 10

val GL_BLEND_COLOR_COMMAND_NV: Int = 11

val GL_STENCIL_REF_COMMAND_NV: Int = 12

val GL_LINE_WIDTH_COMMAND_NV: Int = 13

val GL_POLYGON_OFFSET_COMMAND_NV: Int = 14

val GL_ALPHA_REF_COMMAND_NV: Int = 15

val GL_VIEWPORT_COMMAND_NV: Int = 16

val GL_SCISSOR_COMMAND_NV: Int = 17

val GL_FRONT_FACE_COMMAND_NV: Int = 18

val GL_NV_compute_program5: Int = 1

val GL_COMPUTE_PROGRAM_NV: Int = 37115

val GL_COMPUTE_PROGRAM_PARAMETER_BUFFER_NV: Int = 37116

val GL_NV_conditional_render: Int = 1

val GL_QUERY_WAIT_NV: Int = 36371

val GL_QUERY_NO_WAIT_NV: Int = 36372

val GL_QUERY_BY_REGION_WAIT_NV: Int = 36373

val GL_QUERY_BY_REGION_NO_WAIT_NV: Int = 36374

val GL_NV_conservative_raster: Int = 1

val GL_CONSERVATIVE_RASTERIZATION_NV: Int = 37702

val GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV: Int = 37703

val GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV: Int = 37704

val GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV: Int = 37705

val GL_NV_conservative_raster_dilate: Int = 1

val GL_CONSERVATIVE_RASTER_DILATE_NV: Int = 37753

val GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV: Int = 37754

val GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV: Int = 37755

val GL_NV_conservative_raster_pre_snap_triangles: Int = 1

val GL_CONSERVATIVE_RASTER_MODE_NV: Int = 38221

val GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV: Int = 38222

val GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV: Int = 38223

val GL_NV_copy_depth_to_color: Int = 1

val GL_DEPTH_STENCIL_TO_RGBA_NV: Int = 34926

val GL_DEPTH_STENCIL_TO_BGRA_NV: Int = 34927

val GL_NV_copy_image: Int = 1

val GL_NV_deep_texture3D: Int = 1

val GL_MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV: Int = 37072

val GL_MAX_DEEP_3D_TEXTURE_DEPTH_NV: Int = 37073

val GL_NV_depth_buffer_float: Int = 1

val GL_DEPTH_COMPONENT32F_NV: Int = 36267

val GL_DEPTH32F_STENCIL8_NV: Int = 36268

val GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV: Int = 36269

val GL_DEPTH_BUFFER_FLOAT_MODE_NV: Int = 36271

val GL_NV_depth_clamp: Int = 1

val GL_DEPTH_CLAMP_NV: Int = 34383

val GL_NV_draw_texture: Int = 1

val GL_NV_evaluators: Int = 1

val GL_EVAL_2D_NV: Int = 34496

val GL_EVAL_TRIANGULAR_2D_NV: Int = 34497

val GL_MAP_TESSELLATION_NV: Int = 34498

val GL_MAP_ATTRIB_U_ORDER_NV: Int = 34499

val GL_MAP_ATTRIB_V_ORDER_NV: Int = 34500

val GL_EVAL_FRACTIONAL_TESSELLATION_NV: Int = 34501

val GL_EVAL_VERTEX_ATTRIB0_NV: Int = 34502

val GL_EVAL_VERTEX_ATTRIB1_NV: Int = 34503

val GL_EVAL_VERTEX_ATTRIB2_NV: Int = 34504

val GL_EVAL_VERTEX_ATTRIB3_NV: Int = 34505

val GL_EVAL_VERTEX_ATTRIB4_NV: Int = 34506

val GL_EVAL_VERTEX_ATTRIB5_NV: Int = 34507

val GL_EVAL_VERTEX_ATTRIB6_NV: Int = 34508

val GL_EVAL_VERTEX_ATTRIB7_NV: Int = 34509

val GL_EVAL_VERTEX_ATTRIB8_NV: Int = 34510

val GL_EVAL_VERTEX_ATTRIB9_NV: Int = 34511

val GL_EVAL_VERTEX_ATTRIB10_NV: Int = 34512

val GL_EVAL_VERTEX_ATTRIB11_NV: Int = 34513

val GL_EVAL_VERTEX_ATTRIB12_NV: Int = 34514

val GL_EVAL_VERTEX_ATTRIB13_NV: Int = 34515

val GL_EVAL_VERTEX_ATTRIB14_NV: Int = 34516

val GL_EVAL_VERTEX_ATTRIB15_NV: Int = 34517

val GL_MAX_MAP_TESSELLATION_NV: Int = 34518

val GL_MAX_RATIONAL_EVAL_ORDER_NV: Int = 34519

val GL_NV_explicit_multisample: Int = 1

val GL_SAMPLE_POSITION_NV: Int = 36432

val GL_SAMPLE_MASK_NV: Int = 36433

val GL_SAMPLE_MASK_VALUE_NV: Int = 36434

val GL_TEXTURE_BINDING_RENDERBUFFER_NV: Int = 36435

val GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV: Int = 36436

val GL_TEXTURE_RENDERBUFFER_NV: Int = 36437

val GL_SAMPLER_RENDERBUFFER_NV: Int = 36438

val GL_INT_SAMPLER_RENDERBUFFER_NV: Int = 36439

val GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV: Int = 36440

val GL_MAX_SAMPLE_MASK_WORDS_NV: Int = 36441

val GL_NV_fence: Int = 1

val GL_ALL_COMPLETED_NV: Int = 34034

val GL_FENCE_STATUS_NV: Int = 34035

val GL_FENCE_CONDITION_NV: Int = 34036

val GL_NV_fill_rectangle: Int = 1

val GL_FILL_RECTANGLE_NV: Int = 37692

val GL_NV_float_buffer: Int = 1

val GL_FLOAT_R_NV: Int = 34944

val GL_FLOAT_RG_NV: Int = 34945

val GL_FLOAT_RGB_NV: Int = 34946

val GL_FLOAT_RGBA_NV: Int = 34947

val GL_FLOAT_R16_NV: Int = 34948

val GL_FLOAT_R32_NV: Int = 34949

val GL_FLOAT_RG16_NV: Int = 34950

val GL_FLOAT_RG32_NV: Int = 34951

val GL_FLOAT_RGB16_NV: Int = 34952

val GL_FLOAT_RGB32_NV: Int = 34953

val GL_FLOAT_RGBA16_NV: Int = 34954

val GL_FLOAT_RGBA32_NV: Int = 34955

val GL_TEXTURE_FLOAT_COMPONENTS_NV: Int = 34956

val GL_FLOAT_CLEAR_COLOR_VALUE_NV: Int = 34957

val GL_FLOAT_RGBA_MODE_NV: Int = 34958

val GL_NV_fog_distance: Int = 1

val GL_FOG_DISTANCE_MODE_NV: Int = 34138

val GL_EYE_RADIAL_NV: Int = 34139

val GL_EYE_PLANE_ABSOLUTE_NV: Int = 34140

val GL_NV_fragment_coverage_to_color: Int = 1

val GL_FRAGMENT_COVERAGE_TO_COLOR_NV: Int = 37597

val GL_FRAGMENT_COVERAGE_COLOR_NV: Int = 37598

val GL_NV_fragment_program: Int = 1

val GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV: Int = 34920

val GL_FRAGMENT_PROGRAM_NV: Int = 34928

val GL_MAX_TEXTURE_COORDS_NV: Int = 34929

val GL_MAX_TEXTURE_IMAGE_UNITS_NV: Int = 34930

val GL_FRAGMENT_PROGRAM_BINDING_NV: Int = 34931

val GL_PROGRAM_ERROR_STRING_NV: Int = 34932

val GL_NV_fragment_program2: Int = 1

val GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV: Int = 35060

val GL_MAX_PROGRAM_CALL_DEPTH_NV: Int = 35061

val GL_MAX_PROGRAM_IF_DEPTH_NV: Int = 35062

val GL_MAX_PROGRAM_LOOP_DEPTH_NV: Int = 35063

val GL_MAX_PROGRAM_LOOP_COUNT_NV: Int = 35064

val GL_NV_fragment_program4: Int = 1

val GL_NV_fragment_program_option: Int = 1

val GL_NV_fragment_shader_interlock: Int = 1

val GL_NV_framebuffer_mixed_samples: Int = 1

val GL_COVERAGE_MODULATION_TABLE_NV: Int = 37681

val GL_COLOR_SAMPLES_NV: Int = 36384

val GL_DEPTH_SAMPLES_NV: Int = 37677

val GL_STENCIL_SAMPLES_NV: Int = 37678

val GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV: Int = 37679

val GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV: Int = 37680

val GL_COVERAGE_MODULATION_NV: Int = 37682

val GL_COVERAGE_MODULATION_TABLE_SIZE_NV: Int = 37683

val GL_NV_framebuffer_multisample_coverage: Int = 1

val GL_RENDERBUFFER_COVERAGE_SAMPLES_NV: Int = 36011

val GL_RENDERBUFFER_COLOR_SAMPLES_NV: Int = 36368

val GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV: Int = 36369

val GL_MULTISAMPLE_COVERAGE_MODES_NV: Int = 36370

val GL_NV_geometry_program4: Int = 1

val GL_GEOMETRY_PROGRAM_NV: Int = 35878

val GL_MAX_PROGRAM_OUTPUT_VERTICES_NV: Int = 35879

val GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV: Int = 35880

val GL_NV_geometry_shader4: Int = 1

val GL_NV_geometry_shader_passthrough: Int = 1

val GL_NV_gpu_program4: Int = 1

val GL_MIN_PROGRAM_TEXEL_OFFSET_NV: Int = 35076

val GL_MAX_PROGRAM_TEXEL_OFFSET_NV: Int = 35077

val GL_PROGRAM_ATTRIB_COMPONENTS_NV: Int = 35078

val GL_PROGRAM_RESULT_COMPONENTS_NV: Int = 35079

val GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV: Int = 35080

val GL_MAX_PROGRAM_RESULT_COMPONENTS_NV: Int = 35081

val GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV: Int = 36261

val GL_MAX_PROGRAM_GENERIC_RESULTS_NV: Int = 36262

val GL_NV_gpu_program5: Int = 1

val GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV: Int = 36442

val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV: Int = 36443

val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV: Int = 36444

val GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV: Int = 36445

val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV: Int = 36446

val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV: Int = 36447

val GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV: Int = 36676

val GL_MAX_PROGRAM_SUBROUTINE_NUM_NV: Int = 36677

val GL_NV_gpu_program5_mem_extended: Int = 1

val GL_NV_gpu_shader5: Int = 1

val GL_NV_half_float: Int = 1

val GL_HALF_FLOAT_NV: Int = 5131

val GL_NV_internalformat_sample_query: Int = 1

val GL_MULTISAMPLES_NV: Int = 37745

val GL_SUPERSAMPLE_SCALE_X_NV: Int = 37746

val GL_SUPERSAMPLE_SCALE_Y_NV: Int = 37747

val GL_CONFORMANT_NV: Int = 37748

val GL_NV_light_max_exponent: Int = 1

val GL_MAX_SHININESS_NV: Int = 34052

val GL_MAX_SPOT_EXPONENT_NV: Int = 34053

val GL_NV_multisample_coverage: Int = 1

val GL_NV_multisample_filter_hint: Int = 1

val GL_MULTISAMPLE_FILTER_HINT_NV: Int = 34100

val GL_NV_occlusion_query: Int = 1

val GL_PIXEL_COUNTER_BITS_NV: Int = 34916

val GL_CURRENT_OCCLUSION_QUERY_ID_NV: Int = 34917

val GL_PIXEL_COUNT_NV: Int = 34918

val GL_PIXEL_COUNT_AVAILABLE_NV: Int = 34919

val GL_NV_packed_depth_stencil: Int = 1

val GL_DEPTH_STENCIL_NV: Int = 34041

val GL_UNSIGNED_INT_24_8_NV: Int = 34042

val GL_NV_parameter_buffer_object: Int = 1

val GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV: Int = 36256

val GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV: Int = 36257

val GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV: Int = 36258

val GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV: Int = 36259

val GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV: Int = 36260

val GL_NV_parameter_buffer_object2: Int = 1

val GL_NV_path_rendering: Int = 1

val GL_PATH_FORMAT_SVG_NV: Int = 36976

val GL_PATH_FORMAT_PS_NV: Int = 36977

val GL_STANDARD_FONT_NAME_NV: Int = 36978

val GL_SYSTEM_FONT_NAME_NV: Int = 36979

val GL_FILE_NAME_NV: Int = 36980

val GL_PATH_STROKE_WIDTH_NV: Int = 36981

val GL_PATH_END_CAPS_NV: Int = 36982

val GL_PATH_INITIAL_END_CAP_NV: Int = 36983

val GL_PATH_TERMINAL_END_CAP_NV: Int = 36984

val GL_PATH_JOIN_STYLE_NV: Int = 36985

val GL_PATH_MITER_LIMIT_NV: Int = 36986

val GL_PATH_DASH_CAPS_NV: Int = 36987

val GL_PATH_INITIAL_DASH_CAP_NV: Int = 36988

val GL_PATH_TERMINAL_DASH_CAP_NV: Int = 36989

val GL_PATH_DASH_OFFSET_NV: Int = 36990

val GL_PATH_CLIENT_LENGTH_NV: Int = 36991

val GL_PATH_FILL_MODE_NV: Int = 36992

val GL_PATH_FILL_MASK_NV: Int = 36993

val GL_PATH_FILL_COVER_MODE_NV: Int = 36994

val GL_PATH_STROKE_COVER_MODE_NV: Int = 36995

val GL_PATH_STROKE_MASK_NV: Int = 36996

val GL_COUNT_UP_NV: Int = 37000

val GL_COUNT_DOWN_NV: Int = 37001

val GL_PATH_OBJECT_BOUNDING_BOX_NV: Int = 37002

val GL_CONVEX_HULL_NV: Int = 37003

val GL_BOUNDING_BOX_NV: Int = 37005

val GL_TRANSLATE_X_NV: Int = 37006

val GL_TRANSLATE_Y_NV: Int = 37007

val GL_TRANSLATE_2D_NV: Int = 37008

val GL_TRANSLATE_3D_NV: Int = 37009

val GL_AFFINE_2D_NV: Int = 37010

val GL_AFFINE_3D_NV: Int = 37012

val GL_TRANSPOSE_AFFINE_2D_NV: Int = 37014

val GL_TRANSPOSE_AFFINE_3D_NV: Int = 37016

val GL_UTF8_NV: Int = 37018

val GL_UTF16_NV: Int = 37019

val GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV: Int = 37020

val GL_PATH_COMMAND_COUNT_NV: Int = 37021

val GL_PATH_COORD_COUNT_NV: Int = 37022

val GL_PATH_DASH_ARRAY_COUNT_NV: Int = 37023

val GL_PATH_COMPUTED_LENGTH_NV: Int = 37024

val GL_PATH_FILL_BOUNDING_BOX_NV: Int = 37025

val GL_PATH_STROKE_BOUNDING_BOX_NV: Int = 37026

val GL_SQUARE_NV: Int = 37027

val GL_ROUND_NV: Int = 37028

val GL_TRIANGULAR_NV: Int = 37029

val GL_BEVEL_NV: Int = 37030

val GL_MITER_REVERT_NV: Int = 37031

val GL_MITER_TRUNCATE_NV: Int = 37032

val GL_SKIP_MISSING_GLYPH_NV: Int = 37033

val GL_USE_MISSING_GLYPH_NV: Int = 37034

val GL_PATH_ERROR_POSITION_NV: Int = 37035

val GL_ACCUM_ADJACENT_PAIRS_NV: Int = 37037

val GL_ADJACENT_PAIRS_NV: Int = 37038

val GL_FIRST_TO_REST_NV: Int = 37039

val GL_PATH_GEN_MODE_NV: Int = 37040

val GL_PATH_GEN_COEFF_NV: Int = 37041

val GL_PATH_GEN_COMPONENTS_NV: Int = 37043

val GL_PATH_STENCIL_FUNC_NV: Int = 37047

val GL_PATH_STENCIL_REF_NV: Int = 37048

val GL_PATH_STENCIL_VALUE_MASK_NV: Int = 37049

val GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV: Int = 37053

val GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV: Int = 37054

val GL_PATH_COVER_DEPTH_FUNC_NV: Int = 37055

val GL_PATH_DASH_OFFSET_RESET_NV: Int = 37044

val GL_MOVE_TO_RESETS_NV: Int = 37045

val GL_MOVE_TO_CONTINUES_NV: Int = 37046

val GL_CLOSE_PATH_NV: Int = 0

val GL_MOVE_TO_NV: Int = 2

val GL_RELATIVE_MOVE_TO_NV: Int = 3

val GL_LINE_TO_NV: Int = 4

val GL_RELATIVE_LINE_TO_NV: Int = 5

val GL_HORIZONTAL_LINE_TO_NV: Int = 6

val GL_RELATIVE_HORIZONTAL_LINE_TO_NV: Int = 7

val GL_VERTICAL_LINE_TO_NV: Int = 8

val GL_RELATIVE_VERTICAL_LINE_TO_NV: Int = 9

val GL_QUADRATIC_CURVE_TO_NV: Int = 10

val GL_RELATIVE_QUADRATIC_CURVE_TO_NV: Int = 11

val GL_CUBIC_CURVE_TO_NV: Int = 12

val GL_RELATIVE_CUBIC_CURVE_TO_NV: Int = 13

val GL_SMOOTH_QUADRATIC_CURVE_TO_NV: Int = 14

val GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV: Int = 15

val GL_SMOOTH_CUBIC_CURVE_TO_NV: Int = 16

val GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV: Int = 17

val GL_SMALL_CCW_ARC_TO_NV: Int = 18

val GL_RELATIVE_SMALL_CCW_ARC_TO_NV: Int = 19

val GL_SMALL_CW_ARC_TO_NV: Int = 20

val GL_RELATIVE_SMALL_CW_ARC_TO_NV: Int = 21

val GL_LARGE_CCW_ARC_TO_NV: Int = 22

val GL_RELATIVE_LARGE_CCW_ARC_TO_NV: Int = 23

val GL_LARGE_CW_ARC_TO_NV: Int = 24

val GL_RELATIVE_LARGE_CW_ARC_TO_NV: Int = 25

val GL_RESTART_PATH_NV: Int = 240

val GL_DUP_FIRST_CUBIC_CURVE_TO_NV: Int = 242

val GL_DUP_LAST_CUBIC_CURVE_TO_NV: Int = 244

val GL_RECT_NV: Int = 246

val GL_CIRCULAR_CCW_ARC_TO_NV: Int = 248

val GL_CIRCULAR_CW_ARC_TO_NV: Int = 250

val GL_CIRCULAR_TANGENT_ARC_TO_NV: Int = 252

val GL_ARC_TO_NV: Int = 254

val GL_RELATIVE_ARC_TO_NV: Int = 255

val GL_BOLD_BIT_NV: Int = 1

val GL_ITALIC_BIT_NV: Int = 2

val GL_GLYPH_WIDTH_BIT_NV: Int = 1

val GL_GLYPH_HEIGHT_BIT_NV: Int = 2

val GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV: Int = 4

val GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV: Int = 8

val GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV: Int = 16

val GL_GLYPH_VERTICAL_BEARING_X_BIT_NV: Int = 32

val GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV: Int = 64

val GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV: Int = 128

val GL_GLYPH_HAS_KERNING_BIT_NV: Int = 256

val GL_FONT_X_MIN_BOUNDS_BIT_NV: Int = 65536

val GL_FONT_Y_MIN_BOUNDS_BIT_NV: Int = 131072

val GL_FONT_X_MAX_BOUNDS_BIT_NV: Int = 262144

val GL_FONT_Y_MAX_BOUNDS_BIT_NV: Int = 524288

val GL_FONT_UNITS_PER_EM_BIT_NV: Int = 1048576

val GL_FONT_ASCENDER_BIT_NV: Int = 2097152

val GL_FONT_DESCENDER_BIT_NV: Int = 4194304

val GL_FONT_HEIGHT_BIT_NV: Int = 8388608

val GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV: Int = 16777216

val GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV: Int = 33554432

val GL_FONT_UNDERLINE_POSITION_BIT_NV: Int = 67108864

val GL_FONT_UNDERLINE_THICKNESS_BIT_NV: Int = 134217728

val GL_FONT_HAS_KERNING_BIT_NV: Int = 268435456

val GL_ROUNDED_RECT_NV: Int = 232

val GL_RELATIVE_ROUNDED_RECT_NV: Int = 233

val GL_ROUNDED_RECT2_NV: Int = 234

val GL_RELATIVE_ROUNDED_RECT2_NV: Int = 235

val GL_ROUNDED_RECT4_NV: Int = 236

val GL_RELATIVE_ROUNDED_RECT4_NV: Int = 237

val GL_ROUNDED_RECT8_NV: Int = 238

val GL_RELATIVE_ROUNDED_RECT8_NV: Int = 239

val GL_RELATIVE_RECT_NV: Int = 247

val GL_FONT_GLYPHS_AVAILABLE_NV: Int = 37736

val GL_FONT_TARGET_UNAVAILABLE_NV: Int = 37737

val GL_FONT_UNAVAILABLE_NV: Int = 37738

val GL_FONT_UNINTELLIGIBLE_NV: Int = 37739

val GL_CONIC_CURVE_TO_NV: Int = 26

val GL_RELATIVE_CONIC_CURVE_TO_NV: Int = 27

val GL_FONT_NUM_GLYPH_INDICES_BIT_NV: Int = 536870912

val GL_STANDARD_FONT_FORMAT_NV: Int = 37740

val GL_2_BYTES_NV: Int = 5127

val GL_3_BYTES_NV: Int = 5128

val GL_4_BYTES_NV: Int = 5129

val GL_EYE_LINEAR_NV: Int = 9216

val GL_OBJECT_LINEAR_NV: Int = 9217

val GL_CONSTANT_NV: Int = 34166

val GL_PATH_FOG_GEN_MODE_NV: Int = 37036

val GL_PRIMARY_COLOR_NV: Int = 34092

val GL_SECONDARY_COLOR_NV: Int = 34093

val GL_PATH_GEN_COLOR_FORMAT_NV: Int = 37042

val GL_PATH_PROJECTION_NV: Int = 5889

val GL_PATH_MODELVIEW_NV: Int = 5888

val GL_PATH_MODELVIEW_STACK_DEPTH_NV: Int = 2979

val GL_PATH_MODELVIEW_MATRIX_NV: Int = 2982

val GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV: Int = 3382

val GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV: Int = 34019

val GL_PATH_PROJECTION_STACK_DEPTH_NV: Int = 2980

val GL_PATH_PROJECTION_MATRIX_NV: Int = 2983

val GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV: Int = 3384

val GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV: Int = 34020

val GL_FRAGMENT_INPUT_NV: Int = 37741

val GL_NV_path_rendering_shared_edge: Int = 1

val GL_SHARED_EDGE_NV: Int = 192

val GL_NV_pixel_data_range: Int = 1

val GL_WRITE_PIXEL_DATA_RANGE_NV: Int = 34936

val GL_READ_PIXEL_DATA_RANGE_NV: Int = 34937

val GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV: Int = 34938

val GL_READ_PIXEL_DATA_RANGE_LENGTH_NV: Int = 34939

val GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV: Int = 34940

val GL_READ_PIXEL_DATA_RANGE_POINTER_NV: Int = 34941

val GL_NV_point_sprite: Int = 1

val GL_POINT_SPRITE_NV: Int = 34913

val GL_COORD_REPLACE_NV: Int = 34914

val GL_POINT_SPRITE_R_MODE_NV: Int = 34915

val GL_NV_present_video: Int = 1

val GL_FRAME_NV: Int = 36390

val GL_FIELDS_NV: Int = 36391

val GL_CURRENT_TIME_NV: Int = 36392

val GL_NUM_FILL_STREAMS_NV: Int = 36393

val GL_PRESENT_TIME_NV: Int = 36394

val GL_PRESENT_DURATION_NV: Int = 36395

val GL_NV_primitive_restart: Int = 1

val GL_PRIMITIVE_RESTART_NV: Int = 34136

val GL_PRIMITIVE_RESTART_INDEX_NV: Int = 34137

val GL_NV_register_combiners: Int = 1

val GL_REGISTER_COMBINERS_NV: Int = 34082

val GL_VARIABLE_A_NV: Int = 34083

val GL_VARIABLE_B_NV: Int = 34084

val GL_VARIABLE_C_NV: Int = 34085

val GL_VARIABLE_D_NV: Int = 34086

val GL_VARIABLE_E_NV: Int = 34087

val GL_VARIABLE_F_NV: Int = 34088

val GL_VARIABLE_G_NV: Int = 34089

val GL_CONSTANT_COLOR0_NV: Int = 34090

val GL_CONSTANT_COLOR1_NV: Int = 34091

val GL_SPARE0_NV: Int = 34094

val GL_SPARE1_NV: Int = 34095

val GL_DISCARD_NV: Int = 34096

val GL_E_TIMES_F_NV: Int = 34097

val GL_SPARE0_PLUS_SECONDARY_COLOR_NV: Int = 34098

val GL_UNSIGNED_IDENTITY_NV: Int = 34102

val GL_UNSIGNED_INVERT_NV: Int = 34103

val GL_EXPAND_NORMAL_NV: Int = 34104

val GL_EXPAND_NEGATE_NV: Int = 34105

val GL_HALF_BIAS_NORMAL_NV: Int = 34106

val GL_HALF_BIAS_NEGATE_NV: Int = 34107

val GL_SIGNED_IDENTITY_NV: Int = 34108

val GL_SIGNED_NEGATE_NV: Int = 34109

val GL_SCALE_BY_TWO_NV: Int = 34110

val GL_SCALE_BY_FOUR_NV: Int = 34111

val GL_SCALE_BY_ONE_HALF_NV: Int = 34112

val GL_BIAS_BY_NEGATIVE_ONE_HALF_NV: Int = 34113

val GL_COMBINER_INPUT_NV: Int = 34114

val GL_COMBINER_MAPPING_NV: Int = 34115

val GL_COMBINER_COMPONENT_USAGE_NV: Int = 34116

val GL_COMBINER_AB_DOT_PRODUCT_NV: Int = 34117

val GL_COMBINER_CD_DOT_PRODUCT_NV: Int = 34118

val GL_COMBINER_MUX_SUM_NV: Int = 34119

val GL_COMBINER_SCALE_NV: Int = 34120

val GL_COMBINER_BIAS_NV: Int = 34121

val GL_COMBINER_AB_OUTPUT_NV: Int = 34122

val GL_COMBINER_CD_OUTPUT_NV: Int = 34123

val GL_COMBINER_SUM_OUTPUT_NV: Int = 34124

val GL_MAX_GENERAL_COMBINERS_NV: Int = 34125

val GL_NUM_GENERAL_COMBINERS_NV: Int = 34126

val GL_COLOR_SUM_CLAMP_NV: Int = 34127

val GL_COMBINER0_NV: Int = 34128

val GL_COMBINER1_NV: Int = 34129

val GL_COMBINER2_NV: Int = 34130

val GL_COMBINER3_NV: Int = 34131

val GL_COMBINER4_NV: Int = 34132

val GL_COMBINER5_NV: Int = 34133

val GL_COMBINER6_NV: Int = 34134

val GL_COMBINER7_NV: Int = 34135

val GL_NV_register_combiners2: Int = 1

val GL_PER_STAGE_CONSTANTS_NV: Int = 34101

val GL_NV_robustness_video_memory_purge: Int = 1

val GL_PURGED_CONTEXT_RESET_NV: Int = 37563

val GL_NV_sample_locations: Int = 1

val GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV: Int = 37693

val GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV: Int = 37694

val GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV: Int = 37695

val GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV: Int = 37696

val GL_SAMPLE_LOCATION_NV: Int = 36432

val GL_PROGRAMMABLE_SAMPLE_LOCATION_NV: Int = 37697

val GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV: Int = 37698

val GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV: Int = 37699

val GL_NV_sample_mask_override_coverage: Int = 1

val GL_NV_shader_atomic_counters: Int = 1

val GL_NV_shader_atomic_float: Int = 1

val GL_NV_shader_atomic_float64: Int = 1

val GL_NV_shader_atomic_fp16_vector: Int = 1

val GL_NV_shader_atomic_int64: Int = 1

val GL_NV_shader_buffer_load: Int = 1

val GL_BUFFER_GPU_ADDRESS_NV: Int = 36637

val GL_GPU_ADDRESS_NV: Int = 36660

val GL_MAX_SHADER_BUFFER_ADDRESS_NV: Int = 36661

val GL_NV_shader_buffer_store: Int = 1

val GL_SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV: Int = 16

val GL_NV_shader_storage_buffer_object: Int = 1

val GL_NV_shader_thread_group: Int = 1

val GL_WARP_SIZE_NV: Int = 37689

val GL_WARPS_PER_SM_NV: Int = 37690

val GL_SM_COUNT_NV: Int = 37691

val GL_NV_shader_thread_shuffle: Int = 1

val GL_NV_stereo_view_rendering: Int = 1

val GL_NV_tessellation_program5: Int = 1

val GL_MAX_PROGRAM_PATCH_ATTRIBS_NV: Int = 34520

val GL_TESS_CONTROL_PROGRAM_NV: Int = 35102

val GL_TESS_EVALUATION_PROGRAM_NV: Int = 35103

val GL_TESS_CONTROL_PROGRAM_PARAMETER_BUFFER_NV: Int = 35956

val GL_TESS_EVALUATION_PROGRAM_PARAMETER_BUFFER_NV: Int = 35957

val GL_NV_texgen_emboss: Int = 1

val GL_EMBOSS_LIGHT_NV: Int = 34141

val GL_EMBOSS_CONSTANT_NV: Int = 34142

val GL_EMBOSS_MAP_NV: Int = 34143

val GL_NV_texgen_reflection: Int = 1

val GL_NORMAL_MAP_NV: Int = 34065

val GL_REFLECTION_MAP_NV: Int = 34066

val GL_NV_texture_barrier: Int = 1

val GL_NV_texture_compression_vtc: Int = 1

val GL_NV_texture_env_combine4: Int = 1

val GL_COMBINE4_NV: Int = 34051

val GL_SOURCE3_RGB_NV: Int = 34179

val GL_SOURCE3_ALPHA_NV: Int = 34187

val GL_OPERAND3_RGB_NV: Int = 34195

val GL_OPERAND3_ALPHA_NV: Int = 34203

val GL_NV_texture_expand_normal: Int = 1

val GL_TEXTURE_UNSIGNED_REMAP_MODE_NV: Int = 34959

val GL_NV_texture_multisample: Int = 1

val GL_TEXTURE_COVERAGE_SAMPLES_NV: Int = 36933

val GL_TEXTURE_COLOR_SAMPLES_NV: Int = 36934

val GL_NV_texture_rectangle: Int = 1

val GL_TEXTURE_RECTANGLE_NV: Int = 34037

val GL_TEXTURE_BINDING_RECTANGLE_NV: Int = 34038

val GL_PROXY_TEXTURE_RECTANGLE_NV: Int = 34039

val GL_MAX_RECTANGLE_TEXTURE_SIZE_NV: Int = 34040

val GL_NV_texture_shader: Int = 1

val GL_OFFSET_TEXTURE_RECTANGLE_NV: Int = 34380

val GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV: Int = 34381

val GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV: Int = 34382

val GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV: Int = 34521

val GL_UNSIGNED_INT_S8_S8_8_8_NV: Int = 34522

val GL_UNSIGNED_INT_8_8_S8_S8_REV_NV: Int = 34523

val GL_DSDT_MAG_INTENSITY_NV: Int = 34524

val GL_SHADER_CONSISTENT_NV: Int = 34525

val GL_TEXTURE_SHADER_NV: Int = 34526

val GL_SHADER_OPERATION_NV: Int = 34527

val GL_CULL_MODES_NV: Int = 34528

val GL_OFFSET_TEXTURE_MATRIX_NV: Int = 34529

val GL_OFFSET_TEXTURE_SCALE_NV: Int = 34530

val GL_OFFSET_TEXTURE_BIAS_NV: Int = 34531

val GL_OFFSET_TEXTURE_2D_MATRIX_NV: Int = 34529

val GL_OFFSET_TEXTURE_2D_SCALE_NV: Int = 34530

val GL_OFFSET_TEXTURE_2D_BIAS_NV: Int = 34531

val GL_PREVIOUS_TEXTURE_INPUT_NV: Int = 34532

val GL_CONST_EYE_NV: Int = 34533

val GL_PASS_THROUGH_NV: Int = 34534

val GL_CULL_FRAGMENT_NV: Int = 34535

val GL_OFFSET_TEXTURE_2D_NV: Int = 34536

val GL_DEPENDENT_AR_TEXTURE_2D_NV: Int = 34537

val GL_DEPENDENT_GB_TEXTURE_2D_NV: Int = 34538

val GL_DOT_PRODUCT_NV: Int = 34540

val GL_DOT_PRODUCT_DEPTH_REPLACE_NV: Int = 34541

val GL_DOT_PRODUCT_TEXTURE_2D_NV: Int = 34542

val GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV: Int = 34544

val GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV: Int = 34545

val GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV: Int = 34546

val GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV: Int = 34547

val GL_HILO_NV: Int = 34548

val GL_DSDT_NV: Int = 34549

val GL_DSDT_MAG_NV: Int = 34550

val GL_DSDT_MAG_VIB_NV: Int = 34551

val GL_HILO16_NV: Int = 34552

val GL_SIGNED_HILO_NV: Int = 34553

val GL_SIGNED_HILO16_NV: Int = 34554

val GL_SIGNED_RGBA_NV: Int = 34555

val GL_SIGNED_RGBA8_NV: Int = 34556

val GL_SIGNED_RGB_NV: Int = 34558

val GL_SIGNED_RGB8_NV: Int = 34559

val GL_SIGNED_LUMINANCE_NV: Int = 34561

val GL_SIGNED_LUMINANCE8_NV: Int = 34562

val GL_SIGNED_LUMINANCE_ALPHA_NV: Int = 34563

val GL_SIGNED_LUMINANCE8_ALPHA8_NV: Int = 34564

val GL_SIGNED_ALPHA_NV: Int = 34565

val GL_SIGNED_ALPHA8_NV: Int = 34566

val GL_SIGNED_INTENSITY_NV: Int = 34567

val GL_SIGNED_INTENSITY8_NV: Int = 34568

val GL_DSDT8_NV: Int = 34569

val GL_DSDT8_MAG8_NV: Int = 34570

val GL_DSDT8_MAG8_INTENSITY8_NV: Int = 34571

val GL_SIGNED_RGB_UNSIGNED_ALPHA_NV: Int = 34572

val GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV: Int = 34573

val GL_HI_SCALE_NV: Int = 34574

val GL_LO_SCALE_NV: Int = 34575

val GL_DS_SCALE_NV: Int = 34576

val GL_DT_SCALE_NV: Int = 34577

val GL_MAGNITUDE_SCALE_NV: Int = 34578

val GL_VIBRANCE_SCALE_NV: Int = 34579

val GL_HI_BIAS_NV: Int = 34580

val GL_LO_BIAS_NV: Int = 34581

val GL_DS_BIAS_NV: Int = 34582

val GL_DT_BIAS_NV: Int = 34583

val GL_MAGNITUDE_BIAS_NV: Int = 34584

val GL_VIBRANCE_BIAS_NV: Int = 34585

val GL_TEXTURE_BORDER_VALUES_NV: Int = 34586

val GL_TEXTURE_HI_SIZE_NV: Int = 34587

val GL_TEXTURE_LO_SIZE_NV: Int = 34588

val GL_TEXTURE_DS_SIZE_NV: Int = 34589

val GL_TEXTURE_DT_SIZE_NV: Int = 34590

val GL_TEXTURE_MAG_SIZE_NV: Int = 34591

val GL_NV_texture_shader2: Int = 1

val GL_DOT_PRODUCT_TEXTURE_3D_NV: Int = 34543

val GL_NV_texture_shader3: Int = 1

val GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV: Int = 34896

val GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV: Int = 34897

val GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV: Int = 34898

val GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV: Int = 34899

val GL_OFFSET_HILO_TEXTURE_2D_NV: Int = 34900

val GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV: Int = 34901

val GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV: Int = 34902

val GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV: Int = 34903

val GL_DEPENDENT_HILO_TEXTURE_2D_NV: Int = 34904

val GL_DEPENDENT_RGB_TEXTURE_3D_NV: Int = 34905

val GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV: Int = 34906

val GL_DOT_PRODUCT_PASS_THROUGH_NV: Int = 34907

val GL_DOT_PRODUCT_TEXTURE_1D_NV: Int = 34908

val GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV: Int = 34909

val GL_HILO8_NV: Int = 34910

val GL_SIGNED_HILO8_NV: Int = 34911

val GL_FORCE_BLUE_TO_ONE_NV: Int = 34912

val GL_NV_transform_feedback: Int = 1

val GL_BACK_PRIMARY_COLOR_NV: Int = 35959

val GL_BACK_SECONDARY_COLOR_NV: Int = 35960

val GL_TEXTURE_COORD_NV: Int = 35961

val GL_CLIP_DISTANCE_NV: Int = 35962

val GL_VERTEX_ID_NV: Int = 35963

val GL_PRIMITIVE_ID_NV: Int = 35964

val GL_GENERIC_ATTRIB_NV: Int = 35965

val GL_TRANSFORM_FEEDBACK_ATTRIBS_NV: Int = 35966

val GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV: Int = 35967

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV: Int = 35968

val GL_ACTIVE_VARYINGS_NV: Int = 35969

val GL_ACTIVE_VARYING_MAX_LENGTH_NV: Int = 35970

val GL_TRANSFORM_FEEDBACK_VARYINGS_NV: Int = 35971

val GL_TRANSFORM_FEEDBACK_BUFFER_START_NV: Int = 35972

val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV: Int = 35973

val GL_TRANSFORM_FEEDBACK_RECORD_NV: Int = 35974

val GL_PRIMITIVES_GENERATED_NV: Int = 35975

val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV: Int = 35976

val GL_RASTERIZER_DISCARD_NV: Int = 35977

val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV: Int = 35978

val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV: Int = 35979

val GL_INTERLEAVED_ATTRIBS_NV: Int = 35980

val GL_SEPARATE_ATTRIBS_NV: Int = 35981

val GL_TRANSFORM_FEEDBACK_BUFFER_NV: Int = 35982

val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV: Int = 35983

val GL_LAYER_NV: Int = 36266

val GL_NEXT_BUFFER_NV: Int = -2

val GL_SKIP_COMPONENTS4_NV: Int = -3

val GL_SKIP_COMPONENTS3_NV: Int = -4

val GL_SKIP_COMPONENTS2_NV: Int = -5

val GL_SKIP_COMPONENTS1_NV: Int = -6

val GL_NV_transform_feedback2: Int = 1

val GL_TRANSFORM_FEEDBACK_NV: Int = 36386

val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV: Int = 36387

val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV: Int = 36388

val GL_TRANSFORM_FEEDBACK_BINDING_NV: Int = 36389

val GL_NV_uniform_buffer_unified_memory: Int = 1

val GL_UNIFORM_BUFFER_UNIFIED_NV: Int = 37742

val GL_UNIFORM_BUFFER_ADDRESS_NV: Int = 37743

val GL_UNIFORM_BUFFER_LENGTH_NV: Int = 37744

val GL_NV_vdpau_interop: Int = 1

val GL_SURFACE_STATE_NV: Int = 34539

val GL_SURFACE_REGISTERED_NV: Int = 34557

val GL_SURFACE_MAPPED_NV: Int = 34560

val GL_WRITE_DISCARD_NV: Int = 35006

val GL_NV_vertex_array_range: Int = 1

val GL_VERTEX_ARRAY_RANGE_NV: Int = 34077

val GL_VERTEX_ARRAY_RANGE_LENGTH_NV: Int = 34078

val GL_VERTEX_ARRAY_RANGE_VALID_NV: Int = 34079

val GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV: Int = 34080

val GL_VERTEX_ARRAY_RANGE_POINTER_NV: Int = 34081

val GL_NV_vertex_array_range2: Int = 1

val GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV: Int = 34099

val GL_NV_vertex_attrib_integer_64bit: Int = 1

val GL_NV_vertex_buffer_unified_memory: Int = 1

val GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV: Int = 36638

val GL_ELEMENT_ARRAY_UNIFIED_NV: Int = 36639

val GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV: Int = 36640

val GL_VERTEX_ARRAY_ADDRESS_NV: Int = 36641

val GL_NORMAL_ARRAY_ADDRESS_NV: Int = 36642

val GL_COLOR_ARRAY_ADDRESS_NV: Int = 36643

val GL_INDEX_ARRAY_ADDRESS_NV: Int = 36644

val GL_TEXTURE_COORD_ARRAY_ADDRESS_NV: Int = 36645

val GL_EDGE_FLAG_ARRAY_ADDRESS_NV: Int = 36646

val GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV: Int = 36647

val GL_FOG_COORD_ARRAY_ADDRESS_NV: Int = 36648

val GL_ELEMENT_ARRAY_ADDRESS_NV: Int = 36649

val GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV: Int = 36650

val GL_VERTEX_ARRAY_LENGTH_NV: Int = 36651

val GL_NORMAL_ARRAY_LENGTH_NV: Int = 36652

val GL_COLOR_ARRAY_LENGTH_NV: Int = 36653

val GL_INDEX_ARRAY_LENGTH_NV: Int = 36654

val GL_TEXTURE_COORD_ARRAY_LENGTH_NV: Int = 36655

val GL_EDGE_FLAG_ARRAY_LENGTH_NV: Int = 36656

val GL_SECONDARY_COLOR_ARRAY_LENGTH_NV: Int = 36657

val GL_FOG_COORD_ARRAY_LENGTH_NV: Int = 36658

val GL_ELEMENT_ARRAY_LENGTH_NV: Int = 36659

val GL_DRAW_INDIRECT_UNIFIED_NV: Int = 36672

val GL_DRAW_INDIRECT_ADDRESS_NV: Int = 36673

val GL_DRAW_INDIRECT_LENGTH_NV: Int = 36674

val GL_NV_vertex_program: Int = 1

val GL_VERTEX_PROGRAM_NV: Int = 34336

val GL_VERTEX_STATE_PROGRAM_NV: Int = 34337

val GL_ATTRIB_ARRAY_SIZE_NV: Int = 34339

val GL_ATTRIB_ARRAY_STRIDE_NV: Int = 34340

val GL_ATTRIB_ARRAY_TYPE_NV: Int = 34341

val GL_CURRENT_ATTRIB_NV: Int = 34342

val GL_PROGRAM_LENGTH_NV: Int = 34343

val GL_PROGRAM_STRING_NV: Int = 34344

val GL_MODELVIEW_PROJECTION_NV: Int = 34345

val GL_IDENTITY_NV: Int = 34346

val GL_INVERSE_NV: Int = 34347

val GL_TRANSPOSE_NV: Int = 34348

val GL_INVERSE_TRANSPOSE_NV: Int = 34349

val GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV: Int = 34350

val GL_MAX_TRACK_MATRICES_NV: Int = 34351

val GL_MATRIX0_NV: Int = 34352

val GL_MATRIX1_NV: Int = 34353

val GL_MATRIX2_NV: Int = 34354

val GL_MATRIX3_NV: Int = 34355

val GL_MATRIX4_NV: Int = 34356

val GL_MATRIX5_NV: Int = 34357

val GL_MATRIX6_NV: Int = 34358

val GL_MATRIX7_NV: Int = 34359

val GL_CURRENT_MATRIX_STACK_DEPTH_NV: Int = 34368

val GL_CURRENT_MATRIX_NV: Int = 34369

val GL_VERTEX_PROGRAM_POINT_SIZE_NV: Int = 34370

val GL_VERTEX_PROGRAM_TWO_SIDE_NV: Int = 34371

val GL_PROGRAM_PARAMETER_NV: Int = 34372

val GL_ATTRIB_ARRAY_POINTER_NV: Int = 34373

val GL_PROGRAM_TARGET_NV: Int = 34374

val GL_PROGRAM_RESIDENT_NV: Int = 34375

val GL_TRACK_MATRIX_NV: Int = 34376

val GL_TRACK_MATRIX_TRANSFORM_NV: Int = 34377

val GL_VERTEX_PROGRAM_BINDING_NV: Int = 34378

val GL_PROGRAM_ERROR_POSITION_NV: Int = 34379

val GL_VERTEX_ATTRIB_ARRAY0_NV: Int = 34384

val GL_VERTEX_ATTRIB_ARRAY1_NV: Int = 34385

val GL_VERTEX_ATTRIB_ARRAY2_NV: Int = 34386

val GL_VERTEX_ATTRIB_ARRAY3_NV: Int = 34387

val GL_VERTEX_ATTRIB_ARRAY4_NV: Int = 34388

val GL_VERTEX_ATTRIB_ARRAY5_NV: Int = 34389

val GL_VERTEX_ATTRIB_ARRAY6_NV: Int = 34390

val GL_VERTEX_ATTRIB_ARRAY7_NV: Int = 34391

val GL_VERTEX_ATTRIB_ARRAY8_NV: Int = 34392

val GL_VERTEX_ATTRIB_ARRAY9_NV: Int = 34393

val GL_VERTEX_ATTRIB_ARRAY10_NV: Int = 34394

val GL_VERTEX_ATTRIB_ARRAY11_NV: Int = 34395

val GL_VERTEX_ATTRIB_ARRAY12_NV: Int = 34396

val GL_VERTEX_ATTRIB_ARRAY13_NV: Int = 34397

val GL_VERTEX_ATTRIB_ARRAY14_NV: Int = 34398

val GL_VERTEX_ATTRIB_ARRAY15_NV: Int = 34399

val GL_MAP1_VERTEX_ATTRIB0_4_NV: Int = 34400

val GL_MAP1_VERTEX_ATTRIB1_4_NV: Int = 34401

val GL_MAP1_VERTEX_ATTRIB2_4_NV: Int = 34402

val GL_MAP1_VERTEX_ATTRIB3_4_NV: Int = 34403

val GL_MAP1_VERTEX_ATTRIB4_4_NV: Int = 34404

val GL_MAP1_VERTEX_ATTRIB5_4_NV: Int = 34405

val GL_MAP1_VERTEX_ATTRIB6_4_NV: Int = 34406

val GL_MAP1_VERTEX_ATTRIB7_4_NV: Int = 34407

val GL_MAP1_VERTEX_ATTRIB8_4_NV: Int = 34408

val GL_MAP1_VERTEX_ATTRIB9_4_NV: Int = 34409

val GL_MAP1_VERTEX_ATTRIB10_4_NV: Int = 34410

val GL_MAP1_VERTEX_ATTRIB11_4_NV: Int = 34411

val GL_MAP1_VERTEX_ATTRIB12_4_NV: Int = 34412

val GL_MAP1_VERTEX_ATTRIB13_4_NV: Int = 34413

val GL_MAP1_VERTEX_ATTRIB14_4_NV: Int = 34414

val GL_MAP1_VERTEX_ATTRIB15_4_NV: Int = 34415

val GL_MAP2_VERTEX_ATTRIB0_4_NV: Int = 34416

val GL_MAP2_VERTEX_ATTRIB1_4_NV: Int = 34417

val GL_MAP2_VERTEX_ATTRIB2_4_NV: Int = 34418

val GL_MAP2_VERTEX_ATTRIB3_4_NV: Int = 34419

val GL_MAP2_VERTEX_ATTRIB4_4_NV: Int = 34420

val GL_MAP2_VERTEX_ATTRIB5_4_NV: Int = 34421

val GL_MAP2_VERTEX_ATTRIB6_4_NV: Int = 34422

val GL_MAP2_VERTEX_ATTRIB7_4_NV: Int = 34423

val GL_MAP2_VERTEX_ATTRIB8_4_NV: Int = 34424

val GL_MAP2_VERTEX_ATTRIB9_4_NV: Int = 34425

val GL_MAP2_VERTEX_ATTRIB10_4_NV: Int = 34426

val GL_MAP2_VERTEX_ATTRIB11_4_NV: Int = 34427

val GL_MAP2_VERTEX_ATTRIB12_4_NV: Int = 34428

val GL_MAP2_VERTEX_ATTRIB13_4_NV: Int = 34429

val GL_MAP2_VERTEX_ATTRIB14_4_NV: Int = 34430

val GL_MAP2_VERTEX_ATTRIB15_4_NV: Int = 34431

val GL_NV_vertex_program1_1: Int = 1

val GL_NV_vertex_program2: Int = 1

val GL_NV_vertex_program2_option: Int = 1

val GL_NV_vertex_program3: Int = 1

val GL_NV_vertex_program4: Int = 1

val GL_VERTEX_ATTRIB_ARRAY_INTEGER_NV: Int = 35069

val GL_NV_video_capture: Int = 1

val GL_VIDEO_BUFFER_NV: Int = 36896

val GL_VIDEO_BUFFER_BINDING_NV: Int = 36897

val GL_FIELD_UPPER_NV: Int = 36898

val GL_FIELD_LOWER_NV: Int = 36899

val GL_NUM_VIDEO_CAPTURE_STREAMS_NV: Int = 36900

val GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV: Int = 36901

val GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV: Int = 36902

val GL_LAST_VIDEO_CAPTURE_STATUS_NV: Int = 36903

val GL_VIDEO_BUFFER_PITCH_NV: Int = 36904

val GL_VIDEO_COLOR_CONVERSION_MATRIX_NV: Int = 36905

val GL_VIDEO_COLOR_CONVERSION_MAX_NV: Int = 36906

val GL_VIDEO_COLOR_CONVERSION_MIN_NV: Int = 36907

val GL_VIDEO_COLOR_CONVERSION_OFFSET_NV: Int = 36908

val GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV: Int = 36909

val GL_PARTIAL_SUCCESS_NV: Int = 36910

val GL_SUCCESS_NV: Int = 36911

val GL_FAILURE_NV: Int = 36912

val GL_YCBYCR8_422_NV: Int = 36913

val GL_YCBAYCR8A_4224_NV: Int = 36914

val GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV: Int = 36915

val GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV: Int = 36916

val GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV: Int = 36917

val GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV: Int = 36918

val GL_Z4Y12Z4CB12Z4CR12_444_NV: Int = 36919

val GL_VIDEO_CAPTURE_FRAME_WIDTH_NV: Int = 36920

val GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV: Int = 36921

val GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV: Int = 36922

val GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV: Int = 36923

val GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV: Int = 36924

val GL_NV_viewport_array2: Int = 1

val GL_NV_viewport_swizzle: Int = 1

val GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV: Int = 37712

val GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV: Int = 37713

val GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV: Int = 37714

val GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV: Int = 37715

val GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV: Int = 37716

val GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV: Int = 37717

val GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV: Int = 37718

val GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV: Int = 37719

val GL_VIEWPORT_SWIZZLE_X_NV: Int = 37720

val GL_VIEWPORT_SWIZZLE_Y_NV: Int = 37721

val GL_VIEWPORT_SWIZZLE_Z_NV: Int = 37722

val GL_VIEWPORT_SWIZZLE_W_NV: Int = 37723

val GL_OML_interlace: Int = 1

val GL_INTERLACE_OML: Int = 35200

val GL_INTERLACE_READ_OML: Int = 35201

val GL_OML_resample: Int = 1

val GL_PACK_RESAMPLE_OML: Int = 35204

val GL_UNPACK_RESAMPLE_OML: Int = 35205

val GL_RESAMPLE_REPLICATE_OML: Int = 35206

val GL_RESAMPLE_ZERO_FILL_OML: Int = 35207

val GL_RESAMPLE_AVERAGE_OML: Int = 35208

val GL_RESAMPLE_DECIMATE_OML: Int = 35209

val GL_OML_subsample: Int = 1

val GL_FORMAT_SUBSAMPLE_24_24_OML: Int = 35202

val GL_FORMAT_SUBSAMPLE_244_244_OML: Int = 35203

val GL_OVR_multiview: Int = 1

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: Int = 38448

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: Int = 38450

val GL_MAX_VIEWS_OVR: Int = 38449

val GL_OVR_multiview2: Int = 1

val GL_PGI_misc_hints: Int = 1

val GL_PREFER_DOUBLEBUFFER_HINT_PGI: Int = 107000

val GL_CONSERVE_MEMORY_HINT_PGI: Int = 107005

val GL_RECLAIM_MEMORY_HINT_PGI: Int = 107006

val GL_NATIVE_GRAPHICS_HANDLE_PGI: Int = 107010

val GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI: Int = 107011

val GL_NATIVE_GRAPHICS_END_HINT_PGI: Int = 107012

val GL_ALWAYS_FAST_HINT_PGI: Int = 107020

val GL_ALWAYS_SOFT_HINT_PGI: Int = 107021

val GL_ALLOW_DRAW_OBJ_HINT_PGI: Int = 107022

val GL_ALLOW_DRAW_WIN_HINT_PGI: Int = 107023

val GL_ALLOW_DRAW_FRG_HINT_PGI: Int = 107024

val GL_ALLOW_DRAW_MEM_HINT_PGI: Int = 107025

val GL_STRICT_DEPTHFUNC_HINT_PGI: Int = 107030

val GL_STRICT_LIGHTING_HINT_PGI: Int = 107031

val GL_STRICT_SCISSOR_HINT_PGI: Int = 107032

val GL_FULL_STIPPLE_HINT_PGI: Int = 107033

val GL_CLIP_NEAR_HINT_PGI: Int = 107040

val GL_CLIP_FAR_HINT_PGI: Int = 107041

val GL_WIDE_LINE_HINT_PGI: Int = 107042

val GL_BACK_NORMALS_HINT_PGI: Int = 107043

val GL_PGI_vertex_hints: Int = 1

val GL_VERTEX_DATA_HINT_PGI: Int = 107050

val GL_VERTEX_CONSISTENT_HINT_PGI: Int = 107051

val GL_MATERIAL_SIDE_HINT_PGI: Int = 107052

val GL_MAX_VERTEX_HINT_PGI: Int = 107053

val GL_COLOR3_BIT_PGI: Int = 65536

val GL_COLOR4_BIT_PGI: Int = 131072

val GL_EDGEFLAG_BIT_PGI: Int = 262144

val GL_INDEX_BIT_PGI: Int = 524288

val GL_MAT_AMBIENT_BIT_PGI: Int = 1048576

val GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI: Int = 2097152

val GL_MAT_DIFFUSE_BIT_PGI: Int = 4194304

val GL_MAT_EMISSION_BIT_PGI: Int = 8388608

val GL_MAT_COLOR_INDEXES_BIT_PGI: Int = 16777216

val GL_MAT_SHININESS_BIT_PGI: Int = 33554432

val GL_MAT_SPECULAR_BIT_PGI: Int = 67108864

val GL_NORMAL_BIT_PGI: Int = 134217728

val GL_TEXCOORD1_BIT_PGI: Int = 268435456

val GL_TEXCOORD2_BIT_PGI: Int = 536870912

val GL_TEXCOORD3_BIT_PGI: Int = 1073741824

val GL_TEXCOORD4_BIT_PGI: Int = -2147483648

val GL_VERTEX23_BIT_PGI: Int = 4

val GL_VERTEX4_BIT_PGI: Int = 8

val GL_REND_screen_coordinates: Int = 1

val GL_SCREEN_COORDINATES_REND: Int = 33936

val GL_INVERTED_SCREEN_W_REND: Int = 33937

val GL_S3_s3tc: Int = 1

val GL_RGB_S3TC: Int = 33696

val GL_RGB4_S3TC: Int = 33697

val GL_RGBA_S3TC: Int = 33698

val GL_RGBA4_S3TC: Int = 33699

val GL_RGBA_DXT5_S3TC: Int = 33700

val GL_RGBA4_DXT5_S3TC: Int = 33701

val GL_SGIS_detail_texture: Int = 1

val GL_DETAIL_TEXTURE_2D_SGIS: Int = 32917

val GL_DETAIL_TEXTURE_2D_BINDING_SGIS: Int = 32918

val GL_LINEAR_DETAIL_SGIS: Int = 32919

val GL_LINEAR_DETAIL_ALPHA_SGIS: Int = 32920

val GL_LINEAR_DETAIL_COLOR_SGIS: Int = 32921

val GL_DETAIL_TEXTURE_LEVEL_SGIS: Int = 32922

val GL_DETAIL_TEXTURE_MODE_SGIS: Int = 32923

val GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS: Int = 32924

val GL_SGIS_fog_function: Int = 1

val GL_FOG_FUNC_SGIS: Int = 33066

val GL_FOG_FUNC_POINTS_SGIS: Int = 33067

val GL_MAX_FOG_FUNC_POINTS_SGIS: Int = 33068

val GL_SGIS_generate_mipmap: Int = 1

val GL_GENERATE_MIPMAP_SGIS: Int = 33169

val GL_GENERATE_MIPMAP_HINT_SGIS: Int = 33170

val GL_SGIS_multisample: Int = 1

val GL_MULTISAMPLE_SGIS: Int = 32925

val GL_SAMPLE_ALPHA_TO_MASK_SGIS: Int = 32926

val GL_SAMPLE_ALPHA_TO_ONE_SGIS: Int = 32927

val GL_SAMPLE_MASK_SGIS: Int = 32928

val GL_1PASS_SGIS: Int = 32929

val GL_2PASS_0_SGIS: Int = 32930

val GL_2PASS_1_SGIS: Int = 32931

val GL_4PASS_0_SGIS: Int = 32932

val GL_4PASS_1_SGIS: Int = 32933

val GL_4PASS_2_SGIS: Int = 32934

val GL_4PASS_3_SGIS: Int = 32935

val GL_SAMPLE_BUFFERS_SGIS: Int = 32936

val GL_SAMPLES_SGIS: Int = 32937

val GL_SAMPLE_MASK_VALUE_SGIS: Int = 32938

val GL_SAMPLE_MASK_INVERT_SGIS: Int = 32939

val GL_SAMPLE_PATTERN_SGIS: Int = 32940

val GL_SGIS_pixel_texture: Int = 1

val GL_PIXEL_TEXTURE_SGIS: Int = 33619

val GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS: Int = 33620

val GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS: Int = 33621

val GL_PIXEL_GROUP_COLOR_SGIS: Int = 33622

val GL_SGIS_point_line_texgen: Int = 1

val GL_EYE_DISTANCE_TO_POINT_SGIS: Int = 33264

val GL_OBJECT_DISTANCE_TO_POINT_SGIS: Int = 33265

val GL_EYE_DISTANCE_TO_LINE_SGIS: Int = 33266

val GL_OBJECT_DISTANCE_TO_LINE_SGIS: Int = 33267

val GL_EYE_POINT_SGIS: Int = 33268

val GL_OBJECT_POINT_SGIS: Int = 33269

val GL_EYE_LINE_SGIS: Int = 33270

val GL_OBJECT_LINE_SGIS: Int = 33271

val GL_SGIS_point_parameters: Int = 1

val GL_POINT_SIZE_MIN_SGIS: Int = 33062

val GL_POINT_SIZE_MAX_SGIS: Int = 33063

val GL_POINT_FADE_THRESHOLD_SIZE_SGIS: Int = 33064

val GL_DISTANCE_ATTENUATION_SGIS: Int = 33065

val GL_SGIS_sharpen_texture: Int = 1

val GL_LINEAR_SHARPEN_SGIS: Int = 32941

val GL_LINEAR_SHARPEN_ALPHA_SGIS: Int = 32942

val GL_LINEAR_SHARPEN_COLOR_SGIS: Int = 32943

val GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS: Int = 32944

val GL_SGIS_texture4D: Int = 1

val GL_PACK_SKIP_VOLUMES_SGIS: Int = 33072

val GL_PACK_IMAGE_DEPTH_SGIS: Int = 33073

val GL_UNPACK_SKIP_VOLUMES_SGIS: Int = 33074

val GL_UNPACK_IMAGE_DEPTH_SGIS: Int = 33075

val GL_TEXTURE_4D_SGIS: Int = 33076

val GL_PROXY_TEXTURE_4D_SGIS: Int = 33077

val GL_TEXTURE_4DSIZE_SGIS: Int = 33078

val GL_TEXTURE_WRAP_Q_SGIS: Int = 33079

val GL_MAX_4D_TEXTURE_SIZE_SGIS: Int = 33080

val GL_TEXTURE_4D_BINDING_SGIS: Int = 33103

val GL_SGIS_texture_border_clamp: Int = 1

val GL_CLAMP_TO_BORDER_SGIS: Int = 33069

val GL_SGIS_texture_color_mask: Int = 1

val GL_TEXTURE_COLOR_WRITEMASK_SGIS: Int = 33263

val GL_SGIS_texture_edge_clamp: Int = 1

val GL_CLAMP_TO_EDGE_SGIS: Int = 33071

val GL_SGIS_texture_filter4: Int = 1

val GL_FILTER4_SGIS: Int = 33094

val GL_TEXTURE_FILTER4_SIZE_SGIS: Int = 33095

val GL_SGIS_texture_lod: Int = 1

val GL_TEXTURE_MIN_LOD_SGIS: Int = 33082

val GL_TEXTURE_MAX_LOD_SGIS: Int = 33083

val GL_TEXTURE_BASE_LEVEL_SGIS: Int = 33084

val GL_TEXTURE_MAX_LEVEL_SGIS: Int = 33085

val GL_SGIS_texture_select: Int = 1

val GL_DUAL_ALPHA4_SGIS: Int = 33040

val GL_DUAL_ALPHA8_SGIS: Int = 33041

val GL_DUAL_ALPHA12_SGIS: Int = 33042

val GL_DUAL_ALPHA16_SGIS: Int = 33043

val GL_DUAL_LUMINANCE4_SGIS: Int = 33044

val GL_DUAL_LUMINANCE8_SGIS: Int = 33045

val GL_DUAL_LUMINANCE12_SGIS: Int = 33046

val GL_DUAL_LUMINANCE16_SGIS: Int = 33047

val GL_DUAL_INTENSITY4_SGIS: Int = 33048

val GL_DUAL_INTENSITY8_SGIS: Int = 33049

val GL_DUAL_INTENSITY12_SGIS: Int = 33050

val GL_DUAL_INTENSITY16_SGIS: Int = 33051

val GL_DUAL_LUMINANCE_ALPHA4_SGIS: Int = 33052

val GL_DUAL_LUMINANCE_ALPHA8_SGIS: Int = 33053

val GL_QUAD_ALPHA4_SGIS: Int = 33054

val GL_QUAD_ALPHA8_SGIS: Int = 33055

val GL_QUAD_LUMINANCE4_SGIS: Int = 33056

val GL_QUAD_LUMINANCE8_SGIS: Int = 33057

val GL_QUAD_INTENSITY4_SGIS: Int = 33058

val GL_QUAD_INTENSITY8_SGIS: Int = 33059

val GL_DUAL_TEXTURE_SELECT_SGIS: Int = 33060

val GL_QUAD_TEXTURE_SELECT_SGIS: Int = 33061

val GL_SGIX_async: Int = 1

val GL_ASYNC_MARKER_SGIX: Int = 33577

val GL_SGIX_async_histogram: Int = 1

val GL_ASYNC_HISTOGRAM_SGIX: Int = 33580

val GL_MAX_ASYNC_HISTOGRAM_SGIX: Int = 33581

val GL_SGIX_async_pixel: Int = 1

val GL_ASYNC_TEX_IMAGE_SGIX: Int = 33628

val GL_ASYNC_DRAW_PIXELS_SGIX: Int = 33629

val GL_ASYNC_READ_PIXELS_SGIX: Int = 33630

val GL_MAX_ASYNC_TEX_IMAGE_SGIX: Int = 33631

val GL_MAX_ASYNC_DRAW_PIXELS_SGIX: Int = 33632

val GL_MAX_ASYNC_READ_PIXELS_SGIX: Int = 33633

val GL_SGIX_blend_alpha_minmax: Int = 1

val GL_ALPHA_MIN_SGIX: Int = 33568

val GL_ALPHA_MAX_SGIX: Int = 33569

val GL_SGIX_calligraphic_fragment: Int = 1

val GL_CALLIGRAPHIC_FRAGMENT_SGIX: Int = 33155

val GL_SGIX_clipmap: Int = 1

val GL_LINEAR_CLIPMAP_LINEAR_SGIX: Int = 33136

val GL_TEXTURE_CLIPMAP_CENTER_SGIX: Int = 33137

val GL_TEXTURE_CLIPMAP_FRAME_SGIX: Int = 33138

val GL_TEXTURE_CLIPMAP_OFFSET_SGIX: Int = 33139

val GL_TEXTURE_CLIPMAP_VIRTUAL_DEPTH_SGIX: Int = 33140

val GL_TEXTURE_CLIPMAP_LOD_OFFSET_SGIX: Int = 33141

val GL_TEXTURE_CLIPMAP_DEPTH_SGIX: Int = 33142

val GL_MAX_CLIPMAP_DEPTH_SGIX: Int = 33143

val GL_MAX_CLIPMAP_VIRTUAL_DEPTH_SGIX: Int = 33144

val GL_NEAREST_CLIPMAP_NEAREST_SGIX: Int = 33869

val GL_NEAREST_CLIPMAP_LINEAR_SGIX: Int = 33870

val GL_LINEAR_CLIPMAP_NEAREST_SGIX: Int = 33871

val GL_SGIX_convolution_accuracy: Int = 1

val GL_CONVOLUTION_HINT_SGIX: Int = 33558

val GL_SGIX_depth_pass_instrument: Int = 1

val GL_SGIX_depth_texture: Int = 1

val GL_DEPTH_COMPONENT16_SGIX: Int = 33189

val GL_DEPTH_COMPONENT24_SGIX: Int = 33190

val GL_DEPTH_COMPONENT32_SGIX: Int = 33191

val GL_SGIX_flush_raster: Int = 1

val GL_SGIX_fog_offset: Int = 1

val GL_FOG_OFFSET_SGIX: Int = 33176

val GL_FOG_OFFSET_VALUE_SGIX: Int = 33177

val GL_SGIX_fragment_lighting: Int = 1

val GL_FRAGMENT_LIGHTING_SGIX: Int = 33792

val GL_FRAGMENT_COLOR_MATERIAL_SGIX: Int = 33793

val GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX: Int = 33794

val GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX: Int = 33795

val GL_MAX_FRAGMENT_LIGHTS_SGIX: Int = 33796

val GL_MAX_ACTIVE_LIGHTS_SGIX: Int = 33797

val GL_CURRENT_RASTER_NORMAL_SGIX: Int = 33798

val GL_LIGHT_ENV_MODE_SGIX: Int = 33799

val GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX: Int = 33800

val GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX: Int = 33801

val GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX: Int = 33802

val GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX: Int = 33803

val GL_FRAGMENT_LIGHT0_SGIX: Int = 33804

val GL_FRAGMENT_LIGHT1_SGIX: Int = 33805

val GL_FRAGMENT_LIGHT2_SGIX: Int = 33806

val GL_FRAGMENT_LIGHT3_SGIX: Int = 33807

val GL_FRAGMENT_LIGHT4_SGIX: Int = 33808

val GL_FRAGMENT_LIGHT5_SGIX: Int = 33809

val GL_FRAGMENT_LIGHT6_SGIX: Int = 33810

val GL_FRAGMENT_LIGHT7_SGIX: Int = 33811

val GL_SGIX_framezoom: Int = 1

val GL_FRAMEZOOM_SGIX: Int = 33163

val GL_FRAMEZOOM_FACTOR_SGIX: Int = 33164

val GL_MAX_FRAMEZOOM_FACTOR_SGIX: Int = 33165

val GL_SGIX_igloo_interface: Int = 1

val GL_SGIX_instruments: Int = 1

val GL_INSTRUMENT_BUFFER_POINTER_SGIX: Int = 33152

val GL_INSTRUMENT_MEASUREMENTS_SGIX: Int = 33153

val GL_SGIX_interlace: Int = 1

val GL_INTERLACE_SGIX: Int = 32916

val GL_SGIX_ir_instrument1: Int = 1

val GL_IR_INSTRUMENT1_SGIX: Int = 33151

val GL_SGIX_list_priority: Int = 1

val GL_LIST_PRIORITY_SGIX: Int = 33154

val GL_SGIX_pixel_texture: Int = 1

val GL_PIXEL_TEX_GEN_SGIX: Int = 33081

val GL_PIXEL_TEX_GEN_MODE_SGIX: Int = 33579

val GL_SGIX_pixel_tiles: Int = 1

val GL_PIXEL_TILE_BEST_ALIGNMENT_SGIX: Int = 33086

val GL_PIXEL_TILE_CACHE_INCREMENT_SGIX: Int = 33087

val GL_PIXEL_TILE_WIDTH_SGIX: Int = 33088

val GL_PIXEL_TILE_HEIGHT_SGIX: Int = 33089

val GL_PIXEL_TILE_GRID_WIDTH_SGIX: Int = 33090

val GL_PIXEL_TILE_GRID_HEIGHT_SGIX: Int = 33091

val GL_PIXEL_TILE_GRID_DEPTH_SGIX: Int = 33092

val GL_PIXEL_TILE_CACHE_SIZE_SGIX: Int = 33093

val GL_SGIX_polynomial_ffd: Int = 1

val GL_TEXTURE_DEFORMATION_BIT_SGIX: Int = 1

val GL_GEOMETRY_DEFORMATION_BIT_SGIX: Int = 2

val GL_GEOMETRY_DEFORMATION_SGIX: Int = 33172

val GL_TEXTURE_DEFORMATION_SGIX: Int = 33173

val GL_DEFORMATIONS_MASK_SGIX: Int = 33174

val GL_MAX_DEFORMATION_ORDER_SGIX: Int = 33175

val GL_SGIX_reference_plane: Int = 1

val GL_REFERENCE_PLANE_SGIX: Int = 33149

val GL_REFERENCE_PLANE_EQUATION_SGIX: Int = 33150

val GL_SGIX_resample: Int = 1

val GL_PACK_RESAMPLE_SGIX: Int = 33838

val GL_UNPACK_RESAMPLE_SGIX: Int = 33839

val GL_RESAMPLE_REPLICATE_SGIX: Int = 33843

val GL_RESAMPLE_ZERO_FILL_SGIX: Int = 33844

val GL_RESAMPLE_DECIMATE_SGIX: Int = 33840

val GL_SGIX_scalebias_hint: Int = 1

val GL_SCALEBIAS_HINT_SGIX: Int = 33570

val GL_SGIX_shadow: Int = 1

val GL_TEXTURE_COMPARE_SGIX: Int = 33178

val GL_TEXTURE_COMPARE_OPERATOR_SGIX: Int = 33179

val GL_TEXTURE_LEQUAL_R_SGIX: Int = 33180

val GL_TEXTURE_GEQUAL_R_SGIX: Int = 33181

val GL_SGIX_shadow_ambient: Int = 1

val GL_SHADOW_AMBIENT_SGIX: Int = 32959

val GL_SGIX_sprite: Int = 1

val GL_SPRITE_SGIX: Int = 33096

val GL_SPRITE_MODE_SGIX: Int = 33097

val GL_SPRITE_AXIS_SGIX: Int = 33098

val GL_SPRITE_TRANSLATION_SGIX: Int = 33099

val GL_SPRITE_AXIAL_SGIX: Int = 33100

val GL_SPRITE_OBJECT_ALIGNED_SGIX: Int = 33101

val GL_SPRITE_EYE_ALIGNED_SGIX: Int = 33102

val GL_SGIX_subsample: Int = 1

val GL_PACK_SUBSAMPLE_RATE_SGIX: Int = 34208

val GL_UNPACK_SUBSAMPLE_RATE_SGIX: Int = 34209

val GL_PIXEL_SUBSAMPLE_4444_SGIX: Int = 34210

val GL_PIXEL_SUBSAMPLE_2424_SGIX: Int = 34211

val GL_PIXEL_SUBSAMPLE_4242_SGIX: Int = 34212

val GL_SGIX_tag_sample_buffer: Int = 1

val GL_SGIX_texture_add_env: Int = 1

val GL_TEXTURE_ENV_BIAS_SGIX: Int = 32958

val GL_SGIX_texture_coordinate_clamp: Int = 1

val GL_TEXTURE_MAX_CLAMP_S_SGIX: Int = 33641

val GL_TEXTURE_MAX_CLAMP_T_SGIX: Int = 33642

val GL_TEXTURE_MAX_CLAMP_R_SGIX: Int = 33643

val GL_SGIX_texture_lod_bias: Int = 1

val GL_TEXTURE_LOD_BIAS_S_SGIX: Int = 33166

val GL_TEXTURE_LOD_BIAS_T_SGIX: Int = 33167

val GL_TEXTURE_LOD_BIAS_R_SGIX: Int = 33168

val GL_SGIX_texture_multi_buffer: Int = 1

val GL_TEXTURE_MULTI_BUFFER_HINT_SGIX: Int = 33070

val GL_SGIX_texture_scale_bias: Int = 1

val GL_POST_TEXTURE_FILTER_BIAS_SGIX: Int = 33145

val GL_POST_TEXTURE_FILTER_SCALE_SGIX: Int = 33146

val GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX: Int = 33147

val GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX: Int = 33148

val GL_SGIX_vertex_preclip: Int = 1

val GL_VERTEX_PRECLIP_SGIX: Int = 33774

val GL_VERTEX_PRECLIP_HINT_SGIX: Int = 33775

val GL_SGIX_ycrcb: Int = 1

val GL_YCRCB_422_SGIX: Int = 33211

val GL_YCRCB_444_SGIX: Int = 33212

val GL_SGIX_ycrcb_subsample: Int = 1

val GL_SGIX_ycrcba: Int = 1

val GL_YCRCB_SGIX: Int = 33560

val GL_YCRCBA_SGIX: Int = 33561

val GL_SGI_color_matrix: Int = 1

val GL_COLOR_MATRIX_SGI: Int = 32945

val GL_COLOR_MATRIX_STACK_DEPTH_SGI: Int = 32946

val GL_MAX_COLOR_MATRIX_STACK_DEPTH_SGI: Int = 32947

val GL_POST_COLOR_MATRIX_RED_SCALE_SGI: Int = 32948

val GL_POST_COLOR_MATRIX_GREEN_SCALE_SGI: Int = 32949

val GL_POST_COLOR_MATRIX_BLUE_SCALE_SGI: Int = 32950

val GL_POST_COLOR_MATRIX_ALPHA_SCALE_SGI: Int = 32951

val GL_POST_COLOR_MATRIX_RED_BIAS_SGI: Int = 32952

val GL_POST_COLOR_MATRIX_GREEN_BIAS_SGI: Int = 32953

val GL_POST_COLOR_MATRIX_BLUE_BIAS_SGI: Int = 32954

val GL_POST_COLOR_MATRIX_ALPHA_BIAS_SGI: Int = 32955

val GL_SGI_color_table: Int = 1

val GL_COLOR_TABLE_SGI: Int = 32976

val GL_POST_CONVOLUTION_COLOR_TABLE_SGI: Int = 32977

val GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI: Int = 32978

val GL_PROXY_COLOR_TABLE_SGI: Int = 32979

val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI: Int = 32980

val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI: Int = 32981

val GL_COLOR_TABLE_SCALE_SGI: Int = 32982

val GL_COLOR_TABLE_BIAS_SGI: Int = 32983

val GL_COLOR_TABLE_FORMAT_SGI: Int = 32984

val GL_COLOR_TABLE_WIDTH_SGI: Int = 32985

val GL_COLOR_TABLE_RED_SIZE_SGI: Int = 32986

val GL_COLOR_TABLE_GREEN_SIZE_SGI: Int = 32987

val GL_COLOR_TABLE_BLUE_SIZE_SGI: Int = 32988

val GL_COLOR_TABLE_ALPHA_SIZE_SGI: Int = 32989

val GL_COLOR_TABLE_LUMINANCE_SIZE_SGI: Int = 32990

val GL_COLOR_TABLE_INTENSITY_SIZE_SGI: Int = 32991

val GL_SGI_texture_color_table: Int = 1

val GL_TEXTURE_COLOR_TABLE_SGI: Int = 32956

val GL_PROXY_TEXTURE_COLOR_TABLE_SGI: Int = 32957

val GL_SUNX_constant_data: Int = 1

val GL_UNPACK_CONSTANT_DATA_SUNX: Int = 33237

val GL_TEXTURE_CONSTANT_DATA_SUNX: Int = 33238

val GL_SUN_convolution_border_modes: Int = 1

val GL_WRAP_BORDER_SUN: Int = 33236

val GL_SUN_global_alpha: Int = 1

val GL_GLOBAL_ALPHA_SUN: Int = 33241

val GL_GLOBAL_ALPHA_FACTOR_SUN: Int = 33242

val GL_SUN_mesh_array: Int = 1

val GL_QUAD_MESH_SUN: Int = 34324

val GL_TRIANGLE_MESH_SUN: Int = 34325

val GL_SUN_slice_accum: Int = 1

val GL_SLICE_ACCUM_SUN: Int = 34252

val GL_SUN_triangle_list: Int = 1

val GL_RESTART_SUN: Int = 1

val GL_REPLACE_MIDDLE_SUN: Int = 2

val GL_REPLACE_OLDEST_SUN: Int = 3

val GL_TRIANGLE_LIST_SUN: Int = 33239

val GL_REPLACEMENT_CODE_SUN: Int = 33240

val GL_REPLACEMENT_CODE_ARRAY_SUN: Int = 34240

val GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN: Int = 34241

val GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN: Int = 34242

val GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN: Int = 34243

val GL_R1UI_V3F_SUN: Int = 34244

val GL_R1UI_C4UB_V3F_SUN: Int = 34245

val GL_R1UI_C3F_V3F_SUN: Int = 34246

val GL_R1UI_N3F_V3F_SUN: Int = 34247

val GL_R1UI_C4F_N3F_V3F_SUN: Int = 34248

val GL_R1UI_T2F_V3F_SUN: Int = 34249

val GL_R1UI_T2F_N3F_V3F_SUN: Int = 34250

val GL_R1UI_T2F_C4F_N3F_V3F_SUN: Int = 34251

val GL_SUN_vertex: Int = 1

val GL_WIN_phong_shading: Int = 1

val GL_PHONG_WIN: Int = 33002

val GL_PHONG_HINT_WIN: Int = 33003

val GL_WIN_specular_fog: Int = 1

val GL_FOG_SPECULAR_TEXTURE_WIN: Int = 33004

val GL_MESA_packed_depth_stencil: Int = 1

val GL_DEPTH_STENCIL_MESA: Int = 34640

val GL_UNSIGNED_INT_24_8_MESA: Int = 34641

val GL_UNSIGNED_INT_8_24_REV_MESA: Int = 34642

val GL_UNSIGNED_SHORT_15_1_MESA: Int = 34643

val GL_UNSIGNED_SHORT_1_15_REV_MESA: Int = 34644

val GL_ATI_blend_equation_separate: Int = 1

val GL_ALPHA_BLEND_EQUATION_ATI: Int = 34877

val GL_OES_EGL_image: Int = 1

val GLU_EXT_object_space_tess: Int = 1

val GLU_EXT_nurbs_tessellator: Int = 1

val GLU_FALSE: Int = 0

val GLU_TRUE: Int = 1

val GLU_VERSION_1_1: Int = 1

val GLU_VERSION_1_2: Int = 1

val GLU_VERSION_1_3: Int = 1

val GLU_VERSION: Int = 100800

val GLU_EXTENSIONS: Int = 100801

val GLU_INVALID_ENUM: Int = 100900

val GLU_INVALID_VALUE: Int = 100901

val GLU_OUT_OF_MEMORY: Int = 100902

val GLU_INCOMPATIBLE_GL_VERSION: Int = 100903

val GLU_INVALID_OPERATION: Int = 100904

val GLU_OUTLINE_POLYGON: Int = 100240

val GLU_OUTLINE_PATCH: Int = 100241

val GLU_NURBS_ERROR: Int = 100103

val GLU_ERROR: Int = 100103

val GLU_NURBS_BEGIN: Int = 100164

val GLU_NURBS_BEGIN_EXT: Int = 100164

val GLU_NURBS_VERTEX: Int = 100165

val GLU_NURBS_VERTEX_EXT: Int = 100165

val GLU_NURBS_NORMAL: Int = 100166

val GLU_NURBS_NORMAL_EXT: Int = 100166

val GLU_NURBS_COLOR: Int = 100167

val GLU_NURBS_COLOR_EXT: Int = 100167

val GLU_NURBS_TEXTURE_COORD: Int = 100168

val GLU_NURBS_TEX_COORD_EXT: Int = 100168

val GLU_NURBS_END: Int = 100169

val GLU_NURBS_END_EXT: Int = 100169

val GLU_NURBS_BEGIN_DATA: Int = 100170

val GLU_NURBS_BEGIN_DATA_EXT: Int = 100170

val GLU_NURBS_VERTEX_DATA: Int = 100171

val GLU_NURBS_VERTEX_DATA_EXT: Int = 100171

val GLU_NURBS_NORMAL_DATA: Int = 100172

val GLU_NURBS_NORMAL_DATA_EXT: Int = 100172

val GLU_NURBS_COLOR_DATA: Int = 100173

val GLU_NURBS_COLOR_DATA_EXT: Int = 100173

val GLU_NURBS_TEXTURE_COORD_DATA: Int = 100174

val GLU_NURBS_TEX_COORD_DATA_EXT: Int = 100174

val GLU_NURBS_END_DATA: Int = 100175

val GLU_NURBS_END_DATA_EXT: Int = 100175

val GLU_NURBS_ERROR1: Int = 100251

val GLU_NURBS_ERROR2: Int = 100252

val GLU_NURBS_ERROR3: Int = 100253

val GLU_NURBS_ERROR4: Int = 100254

val GLU_NURBS_ERROR5: Int = 100255

val GLU_NURBS_ERROR6: Int = 100256

val GLU_NURBS_ERROR7: Int = 100257

val GLU_NURBS_ERROR8: Int = 100258

val GLU_NURBS_ERROR9: Int = 100259

val GLU_NURBS_ERROR10: Int = 100260

val GLU_NURBS_ERROR11: Int = 100261

val GLU_NURBS_ERROR12: Int = 100262

val GLU_NURBS_ERROR13: Int = 100263

val GLU_NURBS_ERROR14: Int = 100264

val GLU_NURBS_ERROR15: Int = 100265

val GLU_NURBS_ERROR16: Int = 100266

val GLU_NURBS_ERROR17: Int = 100267

val GLU_NURBS_ERROR18: Int = 100268

val GLU_NURBS_ERROR19: Int = 100269

val GLU_NURBS_ERROR20: Int = 100270

val GLU_NURBS_ERROR21: Int = 100271

val GLU_NURBS_ERROR22: Int = 100272

val GLU_NURBS_ERROR23: Int = 100273

val GLU_NURBS_ERROR24: Int = 100274

val GLU_NURBS_ERROR25: Int = 100275

val GLU_NURBS_ERROR26: Int = 100276

val GLU_NURBS_ERROR27: Int = 100277

val GLU_NURBS_ERROR28: Int = 100278

val GLU_NURBS_ERROR29: Int = 100279

val GLU_NURBS_ERROR30: Int = 100280

val GLU_NURBS_ERROR31: Int = 100281

val GLU_NURBS_ERROR32: Int = 100282

val GLU_NURBS_ERROR33: Int = 100283

val GLU_NURBS_ERROR34: Int = 100284

val GLU_NURBS_ERROR35: Int = 100285

val GLU_NURBS_ERROR36: Int = 100286

val GLU_NURBS_ERROR37: Int = 100287

val GLU_AUTO_LOAD_MATRIX: Int = 100200

val GLU_CULLING: Int = 100201

val GLU_SAMPLING_TOLERANCE: Int = 100203

val GLU_DISPLAY_MODE: Int = 100204

val GLU_PARAMETRIC_TOLERANCE: Int = 100202

val GLU_SAMPLING_METHOD: Int = 100205

val GLU_U_STEP: Int = 100206

val GLU_V_STEP: Int = 100207

val GLU_NURBS_MODE: Int = 100160

val GLU_NURBS_MODE_EXT: Int = 100160

val GLU_NURBS_TESSELLATOR: Int = 100161

val GLU_NURBS_TESSELLATOR_EXT: Int = 100161

val GLU_NURBS_RENDERER: Int = 100162

val GLU_NURBS_RENDERER_EXT: Int = 100162

val GLU_OBJECT_PARAMETRIC_ERROR: Int = 100208

val GLU_OBJECT_PARAMETRIC_ERROR_EXT: Int = 100208

val GLU_OBJECT_PATH_LENGTH: Int = 100209

val GLU_OBJECT_PATH_LENGTH_EXT: Int = 100209

val GLU_PATH_LENGTH: Int = 100215

val GLU_PARAMETRIC_ERROR: Int = 100216

val GLU_DOMAIN_DISTANCE: Int = 100217

val GLU_MAP1_TRIM_2: Int = 100210

val GLU_MAP1_TRIM_3: Int = 100211

val GLU_POINT: Int = 100010

val GLU_LINE: Int = 100011

val GLU_FILL: Int = 100012

val GLU_SILHOUETTE: Int = 100013

val GLU_SMOOTH: Int = 100000

val GLU_FLAT: Int = 100001

val GLU_NONE: Int = 100002

val GLU_OUTSIDE: Int = 100020

val GLU_INSIDE: Int = 100021

val GLU_TESS_BEGIN: Int = 100100

val GLU_BEGIN: Int = 100100

val GLU_TESS_VERTEX: Int = 100101

val GLU_VERTEX: Int = 100101

val GLU_TESS_END: Int = 100102

val GLU_END: Int = 100102

val GLU_TESS_ERROR: Int = 100103

val GLU_TESS_EDGE_FLAG: Int = 100104

val GLU_EDGE_FLAG: Int = 100104

val GLU_TESS_COMBINE: Int = 100105

val GLU_TESS_BEGIN_DATA: Int = 100106

val GLU_TESS_VERTEX_DATA: Int = 100107

val GLU_TESS_END_DATA: Int = 100108

val GLU_TESS_ERROR_DATA: Int = 100109

val GLU_TESS_EDGE_FLAG_DATA: Int = 100110

val GLU_TESS_COMBINE_DATA: Int = 100111

val GLU_CW: Int = 100120

val GLU_CCW: Int = 100121

val GLU_INTERIOR: Int = 100122

val GLU_EXTERIOR: Int = 100123

val GLU_UNKNOWN: Int = 100124

val GLU_TESS_WINDING_RULE: Int = 100140

val GLU_TESS_BOUNDARY_ONLY: Int = 100141

val GLU_TESS_TOLERANCE: Int = 100142

val GLU_TESS_ERROR1: Int = 100151

val GLU_TESS_ERROR2: Int = 100152

val GLU_TESS_ERROR3: Int = 100153

val GLU_TESS_ERROR4: Int = 100154

val GLU_TESS_ERROR5: Int = 100155

val GLU_TESS_ERROR6: Int = 100156

val GLU_TESS_ERROR7: Int = 100157

val GLU_TESS_ERROR8: Int = 100158

val GLU_TESS_MISSING_BEGIN_POLYGON: Int = 100151

val GLU_TESS_MISSING_BEGIN_CONTOUR: Int = 100152

val GLU_TESS_MISSING_END_POLYGON: Int = 100153

val GLU_TESS_MISSING_END_CONTOUR: Int = 100154

val GLU_TESS_COORD_TOO_LARGE: Int = 100155

val GLU_TESS_NEED_COMBINE_CALLBACK: Int = 100156

val GLU_TESS_WINDING_ODD: Int = 100130

val GLU_TESS_WINDING_NONZERO: Int = 100131

val GLU_TESS_WINDING_POSITIVE: Int = 100132

val GLU_TESS_WINDING_NEGATIVE: Int = 100133

val GLU_TESS_WINDING_ABS_GEQ_TWO: Int = 100134

val GLU_TESS_MAX_COORD: Double = bitsToDouble(6850974717710472879) /* == 1.0E150 */

class max_align_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 16)
    
    var __clang_max_align_nonce1: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class __GLsync(override val rawPtr: NativePtr) : COpaque

class imaxdiv_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class _cl_context(override val rawPtr: NativePtr) : COpaque

class _cl_event(override val rawPtr: NativePtr) : COpaque

class GLUnurbs(override val rawPtr: NativePtr) : COpaque

class GLUquadric(override val rawPtr: NativePtr) : COpaque

class GLUtesselator(override val rawPtr: NativePtr) : COpaque

typealias sfBoolVar = IntVarOf<sfBool>
typealias sfBool = Int

typealias sfInt8Var = ByteVarOf<sfInt8>
typealias sfInt8 = Byte

typealias sfUint8Var = ByteVarOf<sfUint8>
typealias sfUint8 = Byte

typealias sfInt16Var = ShortVarOf<sfInt16>
typealias sfInt16 = Short

typealias sfUint16Var = ShortVarOf<sfUint16>
typealias sfUint16 = Short

typealias sfInt32Var = IntVarOf<sfInt32>
typealias sfInt32 = Int

typealias sfUint32Var = IntVarOf<sfUint32>
typealias sfUint32 = Int

typealias sfInt64Var = LongVarOf<sfInt64>
typealias sfInt64 = Long

typealias sfUint64Var = LongVarOf<sfUint64>
typealias sfUint64 = Long

typealias GLenumVar = IntVarOf<GLenum>
typealias GLenum = Int

typealias GLbooleanVar = ByteVarOf<GLboolean>
typealias GLboolean = Byte

typealias GLbitfieldVar = IntVarOf<GLbitfield>
typealias GLbitfield = Int

typealias GLbyteVar = ByteVarOf<GLbyte>
typealias GLbyte = Byte

typealias GLshortVar = ShortVarOf<GLshort>
typealias GLshort = Short

typealias GLintVar = IntVarOf<GLint>
typealias GLint = Int

typealias GLubyteVar = ByteVarOf<GLubyte>
typealias GLubyte = Byte

typealias GLushortVar = ShortVarOf<GLushort>
typealias GLushort = Short

typealias GLuintVar = IntVarOf<GLuint>
typealias GLuint = Int

typealias GLsizeiVar = IntVarOf<GLsizei>
typealias GLsizei = Int

typealias GLfloatVar = FloatVarOf<GLfloat>
typealias GLfloat = Float

typealias GLclampfVar = FloatVarOf<GLclampf>
typealias GLclampf = Float

typealias GLdoubleVar = DoubleVarOf<GLdouble>
typealias GLdouble = Double

typealias GLclampdVar = DoubleVarOf<GLclampd>
typealias GLclampd = Double

typealias PFNGLDRAWRANGEELEMENTSPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSPROC>
typealias PFNGLDRAWRANGEELEMENTSPROC = CPointer<CFunction<CFunctionType2>>

typealias PFNGLTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DPROC>
typealias PFNGLTEXIMAGE3DPROC = CPointer<CFunction<CFunctionType3>>

typealias PFNGLTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE3DPROC>
typealias PFNGLTEXSUBIMAGE3DPROC = CPointer<CFunction<CFunctionType4>>

typealias PFNGLCOPYTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE3DPROC>
typealias PFNGLCOPYTEXSUBIMAGE3DPROC = CPointer<CFunction<CFunctionType5>>

typealias PFNGLACTIVETEXTUREPROCVar = CPointerVarOf<PFNGLACTIVETEXTUREPROC>
typealias PFNGLACTIVETEXTUREPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLSAMPLECOVERAGEPROCVar = CPointerVarOf<PFNGLSAMPLECOVERAGEPROC>
typealias PFNGLSAMPLECOVERAGEPROC = CPointer<CFunction<CFunctionType7>>

typealias PFNGLCOMPRESSEDTEXIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE3DPROC = CPointer<CFunction<CFunctionType8>>

typealias PFNGLCOMPRESSEDTEXIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE2DPROC = CPointer<CFunction<CFunctionType9>>

typealias PFNGLCOMPRESSEDTEXIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE1DPROC = CPointer<CFunction<CFunctionType10>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = CPointer<CFunction<CFunctionType11>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = CPointer<CFunction<CFunctionType12>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = CPointer<CFunction<CFunctionType13>>

typealias PFNGLGETCOMPRESSEDTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXIMAGEPROC = CPointer<CFunction<CFunctionType14>>

typealias PFNGLACTIVETEXTUREARBPROCVar = CPointerVarOf<PFNGLACTIVETEXTUREARBPROC>
typealias PFNGLACTIVETEXTUREARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCLIENTACTIVETEXTUREARBPROCVar = CPointerVarOf<PFNGLCLIENTACTIVETEXTUREARBPROC>
typealias PFNGLCLIENTACTIVETEXTUREARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLMULTITEXCOORD1DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1DARBPROC>
typealias PFNGLMULTITEXCOORD1DARBPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLMULTITEXCOORD1DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1DVARBPROC>
typealias PFNGLMULTITEXCOORD1DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMULTITEXCOORD1FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1FARBPROC>
typealias PFNGLMULTITEXCOORD1FARBPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLMULTITEXCOORD1FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1FVARBPROC>
typealias PFNGLMULTITEXCOORD1FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMULTITEXCOORD1IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1IARBPROC>
typealias PFNGLMULTITEXCOORD1IARBPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLMULTITEXCOORD1IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1IVARBPROC>
typealias PFNGLMULTITEXCOORD1IVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD1SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1SARBPROC>
typealias PFNGLMULTITEXCOORD1SARBPROC = CPointer<CFunction<CFunctionType21>>

typealias PFNGLMULTITEXCOORD1SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1SVARBPROC>
typealias PFNGLMULTITEXCOORD1SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLMULTITEXCOORD2DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2DARBPROC>
typealias PFNGLMULTITEXCOORD2DARBPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLMULTITEXCOORD2DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2DVARBPROC>
typealias PFNGLMULTITEXCOORD2DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMULTITEXCOORD2FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2FARBPROC>
typealias PFNGLMULTITEXCOORD2FARBPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLMULTITEXCOORD2FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2FVARBPROC>
typealias PFNGLMULTITEXCOORD2FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMULTITEXCOORD2IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2IARBPROC>
typealias PFNGLMULTITEXCOORD2IARBPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLMULTITEXCOORD2IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2IVARBPROC>
typealias PFNGLMULTITEXCOORD2IVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD2SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2SARBPROC>
typealias PFNGLMULTITEXCOORD2SARBPROC = CPointer<CFunction<CFunctionType26>>

typealias PFNGLMULTITEXCOORD2SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2SVARBPROC>
typealias PFNGLMULTITEXCOORD2SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLMULTITEXCOORD3DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3DARBPROC>
typealias PFNGLMULTITEXCOORD3DARBPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLMULTITEXCOORD3DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3DVARBPROC>
typealias PFNGLMULTITEXCOORD3DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMULTITEXCOORD3FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3FARBPROC>
typealias PFNGLMULTITEXCOORD3FARBPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLMULTITEXCOORD3FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3FVARBPROC>
typealias PFNGLMULTITEXCOORD3FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMULTITEXCOORD3IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3IARBPROC>
typealias PFNGLMULTITEXCOORD3IARBPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLMULTITEXCOORD3IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3IVARBPROC>
typealias PFNGLMULTITEXCOORD3IVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD3SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3SARBPROC>
typealias PFNGLMULTITEXCOORD3SARBPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLMULTITEXCOORD3SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3SVARBPROC>
typealias PFNGLMULTITEXCOORD3SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLMULTITEXCOORD4DARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4DARBPROC>
typealias PFNGLMULTITEXCOORD4DARBPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLMULTITEXCOORD4DVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4DVARBPROC>
typealias PFNGLMULTITEXCOORD4DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMULTITEXCOORD4FARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4FARBPROC>
typealias PFNGLMULTITEXCOORD4FARBPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLMULTITEXCOORD4FVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4FVARBPROC>
typealias PFNGLMULTITEXCOORD4FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMULTITEXCOORD4IARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4IARBPROC>
typealias PFNGLMULTITEXCOORD4IARBPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLMULTITEXCOORD4IVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4IVARBPROC>
typealias PFNGLMULTITEXCOORD4IVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD4SARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4SARBPROC>
typealias PFNGLMULTITEXCOORD4SARBPROC = CPointer<CFunction<CFunctionType34>>

typealias PFNGLMULTITEXCOORD4SVARBPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4SVARBPROC>
typealias PFNGLMULTITEXCOORD4SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLBLENDFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEPROC>
typealias PFNGLBLENDFUNCSEPARATEPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLMULTIDRAWARRAYSPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSPROC>
typealias PFNGLMULTIDRAWARRAYSPROC = CPointer<CFunction<CFunctionType36>>

typealias PFNGLMULTIDRAWELEMENTSPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSPROC>
typealias PFNGLMULTIDRAWELEMENTSPROC = CPointer<CFunction<CFunctionType37>>

typealias PFNGLPOINTPARAMETERFPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFPROC>
typealias PFNGLPOINTPARAMETERFPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLPOINTPARAMETERFVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVPROC>
typealias PFNGLPOINTPARAMETERFVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLPOINTPARAMETERIPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIPROC>
typealias PFNGLPOINTPARAMETERIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPOINTPARAMETERIVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIVPROC>
typealias PFNGLPOINTPARAMETERIVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLFOGCOORDFPROCVar = CPointerVarOf<PFNGLFOGCOORDFPROC>
typealias PFNGLFOGCOORDFPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLFOGCOORDFVPROCVar = CPointerVarOf<PFNGLFOGCOORDFVPROC>
typealias PFNGLFOGCOORDFVPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLFOGCOORDDPROCVar = CPointerVarOf<PFNGLFOGCOORDDPROC>
typealias PFNGLFOGCOORDDPROC = CPointer<CFunction<CFunctionType40>>

typealias PFNGLFOGCOORDDVPROCVar = CPointerVarOf<PFNGLFOGCOORDDVPROC>
typealias PFNGLFOGCOORDDVPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLFOGCOORDPOINTERPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTERPROC>
typealias PFNGLFOGCOORDPOINTERPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLSECONDARYCOLOR3BPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BPROC>
typealias PFNGLSECONDARYCOLOR3BPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLSECONDARYCOLOR3BVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BVPROC>
typealias PFNGLSECONDARYCOLOR3BVPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLSECONDARYCOLOR3DPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DPROC>
typealias PFNGLSECONDARYCOLOR3DPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLSECONDARYCOLOR3DVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DVPROC>
typealias PFNGLSECONDARYCOLOR3DVPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLSECONDARYCOLOR3FPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FPROC>
typealias PFNGLSECONDARYCOLOR3FPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLSECONDARYCOLOR3FVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FVPROC>
typealias PFNGLSECONDARYCOLOR3FVPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLSECONDARYCOLOR3IPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IPROC>
typealias PFNGLSECONDARYCOLOR3IPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLSECONDARYCOLOR3IVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IVPROC>
typealias PFNGLSECONDARYCOLOR3IVPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLSECONDARYCOLOR3SPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SPROC>
typealias PFNGLSECONDARYCOLOR3SPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLSECONDARYCOLOR3SVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SVPROC>
typealias PFNGLSECONDARYCOLOR3SVPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLSECONDARYCOLOR3UBPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBPROC>
typealias PFNGLSECONDARYCOLOR3UBPROC = CPointer<CFunction<CFunctionType51>>

typealias PFNGLSECONDARYCOLOR3UBVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBVPROC>
typealias PFNGLSECONDARYCOLOR3UBVPROC = CPointer<CFunction<CFunctionType52>>

typealias PFNGLSECONDARYCOLOR3UIPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIPROC>
typealias PFNGLSECONDARYCOLOR3UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLSECONDARYCOLOR3UIVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIVPROC>
typealias PFNGLSECONDARYCOLOR3UIVPROC = CPointer<CFunction<CFunctionType54>>

typealias PFNGLSECONDARYCOLOR3USPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USPROC>
typealias PFNGLSECONDARYCOLOR3USPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLSECONDARYCOLOR3USVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USVPROC>
typealias PFNGLSECONDARYCOLOR3USVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLSECONDARYCOLORPOINTERPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTERPROC>
typealias PFNGLSECONDARYCOLORPOINTERPROC = CPointer<CFunction<CFunctionType57>>

typealias PFNGLWINDOWPOS2DPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DPROC>
typealias PFNGLWINDOWPOS2DPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLWINDOWPOS2DVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVPROC>
typealias PFNGLWINDOWPOS2DVPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS2FPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FPROC>
typealias PFNGLWINDOWPOS2FPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLWINDOWPOS2FVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVPROC>
typealias PFNGLWINDOWPOS2FVPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS2IPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IPROC>
typealias PFNGLWINDOWPOS2IPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLWINDOWPOS2IVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVPROC>
typealias PFNGLWINDOWPOS2IVPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS2SPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SPROC>
typealias PFNGLWINDOWPOS2SPROC = CPointer<CFunction<CFunctionType61>>

typealias PFNGLWINDOWPOS2SVPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVPROC>
typealias PFNGLWINDOWPOS2SVPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLWINDOWPOS3DPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DPROC>
typealias PFNGLWINDOWPOS3DPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLWINDOWPOS3DVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVPROC>
typealias PFNGLWINDOWPOS3DVPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS3FPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FPROC>
typealias PFNGLWINDOWPOS3FPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLWINDOWPOS3FVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVPROC>
typealias PFNGLWINDOWPOS3FVPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS3IPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IPROC>
typealias PFNGLWINDOWPOS3IPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLWINDOWPOS3IVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVPROC>
typealias PFNGLWINDOWPOS3IVPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS3SPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SPROC>
typealias PFNGLWINDOWPOS3SPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLWINDOWPOS3SVPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVPROC>
typealias PFNGLWINDOWPOS3SVPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLBLENDCOLORPROCVar = CPointerVarOf<PFNGLBLENDCOLORPROC>
typealias PFNGLBLENDCOLORPROC = CPointer<CFunction<CFunctionType62>>

typealias PFNGLBLENDEQUATIONPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONPROC>
typealias PFNGLBLENDEQUATIONPROC = CPointer<CFunction<CFunctionType6>>

typealias ptrdiff_tVar = LongVarOf<ptrdiff_t>
typealias ptrdiff_t = Long

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias wchar_tVar = IntVarOf<wchar_t>
typealias wchar_t = Int

typealias GLsizeiptrVar = LongVarOf<GLsizeiptr>
typealias GLsizeiptr = ptrdiff_t

typealias GLintptrVar = LongVarOf<GLintptr>
typealias GLintptr = ptrdiff_t

typealias PFNGLGENQUERIESPROCVar = CPointerVarOf<PFNGLGENQUERIESPROC>
typealias PFNGLGENQUERIESPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETEQUERIESPROCVar = CPointerVarOf<PFNGLDELETEQUERIESPROC>
typealias PFNGLDELETEQUERIESPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISQUERYPROCVar = CPointerVarOf<PFNGLISQUERYPROC>
typealias PFNGLISQUERYPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBEGINQUERYPROCVar = CPointerVarOf<PFNGLBEGINQUERYPROC>
typealias PFNGLBEGINQUERYPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENDQUERYPROCVar = CPointerVarOf<PFNGLENDQUERYPROC>
typealias PFNGLENDQUERYPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETQUERYIVPROCVar = CPointerVarOf<PFNGLGETQUERYIVPROC>
typealias PFNGLGETQUERYIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETQUERYOBJECTIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTIVPROC>
typealias PFNGLGETQUERYOBJECTIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETQUERYOBJECTUIVPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUIVPROC>
typealias PFNGLGETQUERYOBJECTUIVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLBINDBUFFERPROCVar = CPointerVarOf<PFNGLBINDBUFFERPROC>
typealias PFNGLBINDBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEBUFFERSPROC>
typealias PFNGLDELETEBUFFERSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENBUFFERSPROCVar = CPointerVarOf<PFNGLGENBUFFERSPROC>
typealias PFNGLGENBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISBUFFERPROCVar = CPointerVarOf<PFNGLISBUFFERPROC>
typealias PFNGLISBUFFERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBUFFERDATAPROCVar = CPointerVarOf<PFNGLBUFFERDATAPROC>
typealias PFNGLBUFFERDATAPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLBUFFERSUBDATAPROC>
typealias PFNGLBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType70>>

typealias PFNGLGETBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLGETBUFFERSUBDATAPROC>
typealias PFNGLGETBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType71>>

typealias PFNGLMAPBUFFERPROCVar = CPointerVarOf<PFNGLMAPBUFFERPROC>
typealias PFNGLMAPBUFFERPROC = CPointer<CFunction<CFunctionType72>>

typealias PFNGLUNMAPBUFFERPROCVar = CPointerVarOf<PFNGLUNMAPBUFFERPROC>
typealias PFNGLUNMAPBUFFERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERIVPROC>
typealias PFNGLGETBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETBUFFERPOINTERVPROCVar = CPointerVarOf<PFNGLGETBUFFERPOINTERVPROC>
typealias PFNGLGETBUFFERPOINTERVPROC = CPointer<CFunction<CFunctionType73>>

typealias GLcharVar = ByteVarOf<GLchar>
typealias GLchar = Byte

typealias PFNGLBLENDEQUATIONSEPARATEPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEPROC>
typealias PFNGLBLENDEQUATIONSEPARATEPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDRAWBUFFERSPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSPROC>
typealias PFNGLDRAWBUFFERSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLSTENCILOPSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILOPSEPARATEPROC>
typealias PFNGLSTENCILOPSEPARATEPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLSTENCILFUNCSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILFUNCSEPARATEPROC>
typealias PFNGLSTENCILFUNCSEPARATEPROC = CPointer<CFunction<CFunctionType74>>

typealias PFNGLSTENCILMASKSEPARATEPROCVar = CPointerVarOf<PFNGLSTENCILMASKSEPARATEPROC>
typealias PFNGLSTENCILMASKSEPARATEPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLATTACHSHADERPROCVar = CPointerVarOf<PFNGLATTACHSHADERPROC>
typealias PFNGLATTACHSHADERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBINDATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLBINDATTRIBLOCATIONPROC>
typealias PFNGLBINDATTRIBLOCATIONPROC = CPointer<CFunction<CFunctionType75>>

typealias PFNGLCOMPILESHADERPROCVar = CPointerVarOf<PFNGLCOMPILESHADERPROC>
typealias PFNGLCOMPILESHADERPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCREATEPROGRAMPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMPROC>
typealias PFNGLCREATEPROGRAMPROC = CPointer<CFunction<CFunctionType76>>

typealias PFNGLCREATESHADERPROCVar = CPointerVarOf<PFNGLCREATESHADERPROC>
typealias PFNGLCREATESHADERPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLDELETEPROGRAMPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPROC>
typealias PFNGLDELETEPROGRAMPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDELETESHADERPROCVar = CPointerVarOf<PFNGLDELETESHADERPROC>
typealias PFNGLDELETESHADERPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDETACHSHADERPROCVar = CPointerVarOf<PFNGLDETACHSHADERPROC>
typealias PFNGLDETACHSHADERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLDISABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENABLEVERTEXATTRIBARRAYPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBARRAYPROC>
typealias PFNGLENABLEVERTEXATTRIBARRAYPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETACTIVEATTRIBPROCVar = CPointerVarOf<PFNGLGETACTIVEATTRIBPROC>
typealias PFNGLGETACTIVEATTRIBPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLGETACTIVEUNIFORMPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMPROC>
typealias PFNGLGETACTIVEUNIFORMPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLGETATTACHEDSHADERSPROCVar = CPointerVarOf<PFNGLGETATTACHEDSHADERSPROC>
typealias PFNGLGETATTACHEDSHADERSPROC = CPointer<CFunction<CFunctionType79>>

typealias PFNGLGETATTRIBLOCATIONPROCVar = CPointerVarOf<PFNGLGETATTRIBLOCATIONPROC>
typealias PFNGLGETATTRIBLOCATIONPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLGETPROGRAMIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVPROC>
typealias PFNGLGETPROGRAMIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPROGRAMINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMINFOLOGPROC>
typealias PFNGLGETPROGRAMINFOLOGPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLGETSHADERIVPROCVar = CPointerVarOf<PFNGLGETSHADERIVPROC>
typealias PFNGLGETSHADERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETSHADERINFOLOGPROCVar = CPointerVarOf<PFNGLGETSHADERINFOLOGPROC>
typealias PFNGLGETSHADERINFOLOGPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLGETSHADERSOURCEPROCVar = CPointerVarOf<PFNGLGETSHADERSOURCEPROC>
typealias PFNGLGETSHADERSOURCEPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLGETUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETUNIFORMLOCATIONPROC>
typealias PFNGLGETUNIFORMLOCATIONPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLGETUNIFORMFVPROCVar = CPointerVarOf<PFNGLGETUNIFORMFVPROC>
typealias PFNGLGETUNIFORMFVPROC = CPointer<CFunction<CFunctionType82>>

typealias PFNGLGETUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMIVPROC>
typealias PFNGLGETUNIFORMIVPROC = CPointer<CFunction<CFunctionType83>>

typealias PFNGLGETVERTEXATTRIBDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVPROC>
typealias PFNGLGETVERTEXATTRIBDVPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETVERTEXATTRIBFVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVPROC>
typealias PFNGLGETVERTEXATTRIBFVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVERTEXATTRIBIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVPROC>
typealias PFNGLGETVERTEXATTRIBIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXATTRIBPOINTERVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLISPROGRAMPROCVar = CPointerVarOf<PFNGLISPROGRAMPROC>
typealias PFNGLISPROGRAMPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLISSHADERPROCVar = CPointerVarOf<PFNGLISSHADERPROC>
typealias PFNGLISSHADERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLLINKPROGRAMPROCVar = CPointerVarOf<PFNGLLINKPROGRAMPROC>
typealias PFNGLLINKPROGRAMPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLSHADERSOURCEPROCVar = CPointerVarOf<PFNGLSHADERSOURCEPROC>
typealias PFNGLSHADERSOURCEPROC = CPointer<CFunction<CFunctionType86>>

typealias PFNGLUSEPROGRAMPROCVar = CPointerVarOf<PFNGLUSEPROGRAMPROC>
typealias PFNGLUSEPROGRAMPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLUNIFORM1FPROCVar = CPointerVarOf<PFNGLUNIFORM1FPROC>
typealias PFNGLUNIFORM1FPROC = CPointer<CFunction<CFunctionType87>>

typealias PFNGLUNIFORM2FPROCVar = CPointerVarOf<PFNGLUNIFORM2FPROC>
typealias PFNGLUNIFORM2FPROC = CPointer<CFunction<CFunctionType88>>

typealias PFNGLUNIFORM3FPROCVar = CPointerVarOf<PFNGLUNIFORM3FPROC>
typealias PFNGLUNIFORM3FPROC = CPointer<CFunction<CFunctionType89>>

typealias PFNGLUNIFORM4FPROCVar = CPointerVarOf<PFNGLUNIFORM4FPROC>
typealias PFNGLUNIFORM4FPROC = CPointer<CFunction<CFunctionType90>>

typealias PFNGLUNIFORM1IPROCVar = CPointerVarOf<PFNGLUNIFORM1IPROC>
typealias PFNGLUNIFORM1IPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLUNIFORM2IPROCVar = CPointerVarOf<PFNGLUNIFORM2IPROC>
typealias PFNGLUNIFORM2IPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLUNIFORM3IPROCVar = CPointerVarOf<PFNGLUNIFORM3IPROC>
typealias PFNGLUNIFORM3IPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLUNIFORM4IPROCVar = CPointerVarOf<PFNGLUNIFORM4IPROC>
typealias PFNGLUNIFORM4IPROC = CPointer<CFunction<CFunctionType92>>

typealias PFNGLUNIFORM1FVPROCVar = CPointerVarOf<PFNGLUNIFORM1FVPROC>
typealias PFNGLUNIFORM1FVPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM2FVPROCVar = CPointerVarOf<PFNGLUNIFORM2FVPROC>
typealias PFNGLUNIFORM2FVPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM3FVPROCVar = CPointerVarOf<PFNGLUNIFORM3FVPROC>
typealias PFNGLUNIFORM3FVPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM4FVPROCVar = CPointerVarOf<PFNGLUNIFORM4FVPROC>
typealias PFNGLUNIFORM4FVPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM1IVPROCVar = CPointerVarOf<PFNGLUNIFORM1IVPROC>
typealias PFNGLUNIFORM1IVPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM2IVPROCVar = CPointerVarOf<PFNGLUNIFORM2IVPROC>
typealias PFNGLUNIFORM2IVPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM3IVPROCVar = CPointerVarOf<PFNGLUNIFORM3IVPROC>
typealias PFNGLUNIFORM3IVPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM4IVPROCVar = CPointerVarOf<PFNGLUNIFORM4IVPROC>
typealias PFNGLUNIFORM4IVPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2FVPROC>
typealias PFNGLUNIFORMMATRIX2FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3FVPROC>
typealias PFNGLUNIFORMMATRIX3FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4FVPROC>
typealias PFNGLUNIFORMMATRIX4FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLVALIDATEPROGRAMPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPROC>
typealias PFNGLVALIDATEPROGRAMPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLVERTEXATTRIB1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DPROC>
typealias PFNGLVERTEXATTRIB1DPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXATTRIB1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVPROC>
typealias PFNGLVERTEXATTRIB1DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB1FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FPROC>
typealias PFNGLVERTEXATTRIB1FPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLVERTEXATTRIB1FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVPROC>
typealias PFNGLVERTEXATTRIB1FVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB1SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SPROC>
typealias PFNGLVERTEXATTRIB1SPROC = CPointer<CFunction<CFunctionType21>>

typealias PFNGLVERTEXATTRIB1SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVPROC>
typealias PFNGLVERTEXATTRIB1SVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DPROC>
typealias PFNGLVERTEXATTRIB2DPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXATTRIB2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVPROC>
typealias PFNGLVERTEXATTRIB2DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB2FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FPROC>
typealias PFNGLVERTEXATTRIB2FPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLVERTEXATTRIB2FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVPROC>
typealias PFNGLVERTEXATTRIB2FVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB2SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SPROC>
typealias PFNGLVERTEXATTRIB2SPROC = CPointer<CFunction<CFunctionType26>>

typealias PFNGLVERTEXATTRIB2SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVPROC>
typealias PFNGLVERTEXATTRIB2SVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DPROC>
typealias PFNGLVERTEXATTRIB3DPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXATTRIB3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVPROC>
typealias PFNGLVERTEXATTRIB3DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB3FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FPROC>
typealias PFNGLVERTEXATTRIB3FPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLVERTEXATTRIB3FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVPROC>
typealias PFNGLVERTEXATTRIB3FVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB3SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SPROC>
typealias PFNGLVERTEXATTRIB3SPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLVERTEXATTRIB3SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVPROC>
typealias PFNGLVERTEXATTRIB3SVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4NBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NBVPROC>
typealias PFNGLVERTEXATTRIB4NBVPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIB4NIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NIVPROC>
typealias PFNGLVERTEXATTRIB4NIVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIB4NSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NSVPROC>
typealias PFNGLVERTEXATTRIB4NSVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4NUBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBPROC>
typealias PFNGLVERTEXATTRIB4NUBPROC = CPointer<CFunction<CFunctionType97>>

typealias PFNGLVERTEXATTRIB4NUBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBVPROC>
typealias PFNGLVERTEXATTRIB4NUBVPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIB4NUIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUIVPROC>
typealias PFNGLVERTEXATTRIB4NUIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIB4NUSVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUSVPROC>
typealias PFNGLVERTEXATTRIB4NUSVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIB4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4BVPROC>
typealias PFNGLVERTEXATTRIB4BVPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIB4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DPROC>
typealias PFNGLVERTEXATTRIB4DPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXATTRIB4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVPROC>
typealias PFNGLVERTEXATTRIB4DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB4FPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FPROC>
typealias PFNGLVERTEXATTRIB4FPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLVERTEXATTRIB4FVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVPROC>
typealias PFNGLVERTEXATTRIB4FVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4IVPROC>
typealias PFNGLVERTEXATTRIB4IVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIB4SPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SPROC>
typealias PFNGLVERTEXATTRIB4SPROC = CPointer<CFunction<CFunctionType34>>

typealias PFNGLVERTEXATTRIB4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVPROC>
typealias PFNGLVERTEXATTRIB4SVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVPROC>
typealias PFNGLVERTEXATTRIB4UBVPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIB4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UIVPROC>
typealias PFNGLVERTEXATTRIB4UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIB4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4USVPROC>
typealias PFNGLVERTEXATTRIB4USVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIBPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERPROC>
typealias PFNGLVERTEXATTRIBPOINTERPROC = CPointer<CFunction<CFunctionType101>>

typealias PFNGLUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3FVPROC>
typealias PFNGLUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2FVPROC>
typealias PFNGLUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4FVPROC>
typealias PFNGLUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2FVPROC>
typealias PFNGLUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4FVPROC>
typealias PFNGLUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3FVPROC>
typealias PFNGLUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<CFunctionType95>>

typealias GLhalfVar = ShortVarOf<GLhalf>
typealias GLhalf = Short

typealias PFNGLCOLORMASKIPROCVar = CPointerVarOf<PFNGLCOLORMASKIPROC>
typealias PFNGLCOLORMASKIPROC = CPointer<CFunction<CFunctionType97>>

typealias PFNGLGETBOOLEANI_VPROCVar = CPointerVarOf<PFNGLGETBOOLEANI_VPROC>
typealias PFNGLGETBOOLEANI_VPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLGETINTEGERI_VPROCVar = CPointerVarOf<PFNGLGETINTEGERI_VPROC>
typealias PFNGLGETINTEGERI_VPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLENABLEIPROCVar = CPointerVarOf<PFNGLENABLEIPROC>
typealias PFNGLENABLEIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEIPROCVar = CPointerVarOf<PFNGLDISABLEIPROC>
typealias PFNGLDISABLEIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLISENABLEDIPROCVar = CPointerVarOf<PFNGLISENABLEDIPROC>
typealias PFNGLISENABLEDIPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLBEGINTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKPROC>
typealias PFNGLENDTRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLBINDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGEPROC>
typealias PFNGLBINDBUFFERRANGEPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLBINDBUFFERBASEPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASEPROC>
typealias PFNGLBINDBUFFERBASEPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CPointer<CFunction<CFunctionType105>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLCLAMPCOLORPROCVar = CPointerVarOf<PFNGLCLAMPCOLORPROC>
typealias PFNGLCLAMPCOLORPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBEGINCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERPROC>
typealias PFNGLBEGINCONDITIONALRENDERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENDCONDITIONALRENDERPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERPROC>
typealias PFNGLENDCONDITIONALRENDERPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLVERTEXATTRIBIPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIPOINTERPROC>
typealias PFNGLVERTEXATTRIBIPOINTERPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLGETVERTEXATTRIBIIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIIVPROC>
typealias PFNGLGETVERTEXATTRIBIIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXATTRIBIUIVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIUIVPROC>
typealias PFNGLGETVERTEXATTRIBIUIVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLVERTEXATTRIBI1IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IPROC>
typealias PFNGLVERTEXATTRIBI1IPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLVERTEXATTRIBI2IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IPROC>
typealias PFNGLVERTEXATTRIBI2IPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLVERTEXATTRIBI3IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IPROC>
typealias PFNGLVERTEXATTRIBI3IPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLVERTEXATTRIBI4IPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IPROC>
typealias PFNGLVERTEXATTRIBI4IPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLVERTEXATTRIBI1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIPROC>
typealias PFNGLVERTEXATTRIBI1UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXATTRIBI2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIPROC>
typealias PFNGLVERTEXATTRIBI2UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXATTRIBI3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIPROC>
typealias PFNGLVERTEXATTRIBI3UIPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLVERTEXATTRIBI4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIPROC>
typealias PFNGLVERTEXATTRIBI4UIPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLVERTEXATTRIBI1IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IVPROC>
typealias PFNGLVERTEXATTRIBI1IVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI2IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IVPROC>
typealias PFNGLVERTEXATTRIBI2IVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI3IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IVPROC>
typealias PFNGLVERTEXATTRIBI3IVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI4IVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IVPROC>
typealias PFNGLVERTEXATTRIBI4IVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIVPROC>
typealias PFNGLVERTEXATTRIBI1UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIVPROC>
typealias PFNGLVERTEXATTRIBI2UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIVPROC>
typealias PFNGLVERTEXATTRIBI3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIVPROC>
typealias PFNGLVERTEXATTRIBI4UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI4BVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4BVPROC>
typealias PFNGLVERTEXATTRIBI4BVPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIBI4SVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4SVPROC>
typealias PFNGLVERTEXATTRIBI4SVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIBI4UBVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UBVPROC>
typealias PFNGLVERTEXATTRIBI4UBVPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIBI4USVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4USVPROC>
typealias PFNGLVERTEXATTRIBI4USVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLGETUNIFORMUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMUIVPROC>
typealias PFNGLGETUNIFORMUIVPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLBINDFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONPROC>
typealias PFNGLBINDFRAGDATALOCATIONPROC = CPointer<CFunction<CFunctionType75>>

typealias PFNGLGETFRAGDATALOCATIONPROCVar = CPointerVarOf<PFNGLGETFRAGDATALOCATIONPROC>
typealias PFNGLGETFRAGDATALOCATIONPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLUNIFORM1UIPROCVar = CPointerVarOf<PFNGLUNIFORM1UIPROC>
typealias PFNGLUNIFORM1UIPROC = CPointer<CFunction<CFunctionType109>>

typealias PFNGLUNIFORM2UIPROCVar = CPointerVarOf<PFNGLUNIFORM2UIPROC>
typealias PFNGLUNIFORM2UIPROC = CPointer<CFunction<CFunctionType110>>

typealias PFNGLUNIFORM3UIPROCVar = CPointerVarOf<PFNGLUNIFORM3UIPROC>
typealias PFNGLUNIFORM3UIPROC = CPointer<CFunction<CFunctionType111>>

typealias PFNGLUNIFORM4UIPROCVar = CPointerVarOf<PFNGLUNIFORM4UIPROC>
typealias PFNGLUNIFORM4UIPROC = CPointer<CFunction<CFunctionType112>>

typealias PFNGLUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLUNIFORM1UIVPROC>
typealias PFNGLUNIFORM1UIVPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLUNIFORM2UIVPROC>
typealias PFNGLUNIFORM2UIVPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLUNIFORM3UIVPROC>
typealias PFNGLUNIFORM3UIVPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLUNIFORM4UIVPROC>
typealias PFNGLUNIFORM4UIVPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIIVPROC>
typealias PFNGLTEXPARAMETERIIVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIUIVPROC>
typealias PFNGLTEXPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLGETTEXPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIIVPROC>
typealias PFNGLGETTEXPARAMETERIIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTEXPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIUIVPROC>
typealias PFNGLGETTEXPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLCLEARBUFFERIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERIVPROC>
typealias PFNGLCLEARBUFFERIVPROC = CPointer<CFunction<CFunctionType116>>

typealias PFNGLCLEARBUFFERUIVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERUIVPROC>
typealias PFNGLCLEARBUFFERUIVPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLCLEARBUFFERFVPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFVPROC>
typealias PFNGLCLEARBUFFERFVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLCLEARBUFFERFIPROCVar = CPointerVarOf<PFNGLCLEARBUFFERFIPROC>
typealias PFNGLCLEARBUFFERFIPROC = CPointer<CFunction<CFunctionType119>>

typealias PFNGLGETSTRINGIPROCVar = CPointerVarOf<PFNGLGETSTRINGIPROC>
typealias PFNGLGETSTRINGIPROC = CPointer<CFunction<CFunctionType120>>

typealias PFNGLISRENDERBUFFERPROCVar = CPointerVarOf<PFNGLISRENDERBUFFERPROC>
typealias PFNGLISRENDERBUFFERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBINDRENDERBUFFERPROCVar = CPointerVarOf<PFNGLBINDRENDERBUFFERPROC>
typealias PFNGLBINDRENDERBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETERENDERBUFFERSPROCVar = CPointerVarOf<PFNGLDELETERENDERBUFFERSPROC>
typealias PFNGLDELETERENDERBUFFERSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENRENDERBUFFERSPROCVar = CPointerVarOf<PFNGLGENRENDERBUFFERSPROC>
typealias PFNGLGENRENDERBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLRENDERBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEPROC>
typealias PFNGLRENDERBUFFERSTORAGEPROC = CPointer<CFunction<CFunctionType121>>

typealias PFNGLGETRENDERBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETRENDERBUFFERPARAMETERIVPROC>
typealias PFNGLGETRENDERBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLISFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLISFRAMEBUFFERPROC>
typealias PFNGLISFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBINDFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBINDFRAMEBUFFERPROC>
typealias PFNGLBINDFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLDELETEFRAMEBUFFERSPROC>
typealias PFNGLDELETEFRAMEBUFFERSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLGENFRAMEBUFFERSPROC>
typealias PFNGLGENFRAMEBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLCHECKFRAMEBUFFERSTATUSPROCVar = CPointerVarOf<PFNGLCHECKFRAMEBUFFERSTATUSPROC>
typealias PFNGLCHECKFRAMEBUFFERSTATUSPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLFRAMEBUFFERTEXTURE1DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE1DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE1DPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLFRAMEBUFFERTEXTURE2DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE2DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE2DPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLFRAMEBUFFERTEXTURE3DPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE3DPROC>
typealias PFNGLFRAMEBUFFERTEXTURE3DPROC = CPointer<CFunction<CFunctionType123>>

typealias PFNGLFRAMEBUFFERRENDERBUFFERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERRENDERBUFFERPROC>
typealias PFNGLFRAMEBUFFERRENDERBUFFERPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC>
typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGENERATEMIPMAPPROCVar = CPointerVarOf<PFNGLGENERATEMIPMAPPROC>
typealias PFNGLGENERATEMIPMAPPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBLITFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBLITFRAMEBUFFERPROC>
typealias PFNGLBLITFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType125>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLFRAMEBUFFERTEXTURELAYERPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYERPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYERPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLMAPBUFFERRANGEPROCVar = CPointerVarOf<PFNGLMAPBUFFERRANGEPROC>
typealias PFNGLMAPBUFFERRANGEPROC = CPointer<CFunction<CFunctionType128>>

typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDBUFFERRANGEPROC>
typealias PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLBINDVERTEXARRAYPROCVar = CPointerVarOf<PFNGLBINDVERTEXARRAYPROC>
typealias PFNGLBINDVERTEXARRAYPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDELETEVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLDELETEVERTEXARRAYSPROC>
typealias PFNGLDELETEVERTEXARRAYSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLGENVERTEXARRAYSPROC>
typealias PFNGLGENVERTEXARRAYSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISVERTEXARRAYPROCVar = CPointerVarOf<PFNGLISVERTEXARRAYPROC>
typealias PFNGLISVERTEXARRAYPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLDRAWARRAYSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDPROC>
typealias PFNGLDRAWARRAYSINSTANCEDPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLDRAWELEMENTSINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDPROC = CPointer<CFunction<CFunctionType130>>

typealias PFNGLTEXBUFFERPROCVar = CPointerVarOf<PFNGLTEXBUFFERPROC>
typealias PFNGLTEXBUFFERPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLPRIMITIVERESTARTINDEXPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTINDEXPROC>
typealias PFNGLPRIMITIVERESTARTINDEXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOPYBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCOPYBUFFERSUBDATAPROC>
typealias PFNGLCOPYBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType131>>

typealias PFNGLGETUNIFORMINDICESPROCVar = CPointerVarOf<PFNGLGETUNIFORMINDICESPROC>
typealias PFNGLGETUNIFORMINDICESPROC = CPointer<CFunction<CFunctionType132>>

typealias PFNGLGETACTIVEUNIFORMSIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMSIVPROC>
typealias PFNGLGETACTIVEUNIFORMSIVPROC = CPointer<CFunction<CFunctionType133>>

typealias PFNGLGETACTIVEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMNAMEPROC = CPointer<CFunction<CFunctionType134>>

typealias PFNGLGETUNIFORMBLOCKINDEXPROCVar = CPointerVarOf<PFNGLGETUNIFORMBLOCKINDEXPROC>
typealias PFNGLGETUNIFORMBLOCKINDEXPROC = CPointer<CFunction<CFunctionType135>>

typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKIVPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC>
typealias PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CPointer<CFunction<CFunctionType134>>

typealias PFNGLUNIFORMBLOCKBINDINGPROCVar = CPointerVarOf<PFNGLUNIFORMBLOCKBINDINGPROC>
typealias PFNGLUNIFORMBLOCKBINDINGPROC = CPointer<CFunction<CFunctionType53>>

typealias GLsyncVar = CPointerVarOf<GLsync>
typealias GLsync = CPointer<__GLsync>

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = Byte

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = Short

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = Int

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = Long

typealias uint8_tVar = ByteVarOf<uint8_t>
typealias uint8_t = Byte

typealias uint16_tVar = ShortVarOf<uint16_t>
typealias uint16_t = Short

typealias uint32_tVar = IntVarOf<uint32_t>
typealias uint32_t = Int

typealias uint64_tVar = LongVarOf<uint64_t>
typealias uint64_t = Long

typealias int_least8_tVar = ByteVarOf<int_least8_t>
typealias int_least8_t = Byte

typealias int_least16_tVar = ShortVarOf<int_least16_t>
typealias int_least16_t = Short

typealias int_least32_tVar = IntVarOf<int_least32_t>
typealias int_least32_t = Int

typealias int_least64_tVar = LongVarOf<int_least64_t>
typealias int_least64_t = Long

typealias uint_least8_tVar = ByteVarOf<uint_least8_t>
typealias uint_least8_t = Byte

typealias uint_least16_tVar = ShortVarOf<uint_least16_t>
typealias uint_least16_t = Short

typealias uint_least32_tVar = IntVarOf<uint_least32_t>
typealias uint_least32_t = Int

typealias uint_least64_tVar = LongVarOf<uint_least64_t>
typealias uint_least64_t = Long

typealias int_fast8_tVar = ByteVarOf<int_fast8_t>
typealias int_fast8_t = Byte

typealias int_fast16_tVar = LongVarOf<int_fast16_t>
typealias int_fast16_t = Long

typealias int_fast32_tVar = LongVarOf<int_fast32_t>
typealias int_fast32_t = Long

typealias int_fast64_tVar = LongVarOf<int_fast64_t>
typealias int_fast64_t = Long

typealias uint_fast8_tVar = ByteVarOf<uint_fast8_t>
typealias uint_fast8_t = Byte

typealias uint_fast16_tVar = LongVarOf<uint_fast16_t>
typealias uint_fast16_t = Long

typealias uint_fast32_tVar = LongVarOf<uint_fast32_t>
typealias uint_fast32_t = Long

typealias uint_fast64_tVar = LongVarOf<uint_fast64_t>
typealias uint_fast64_t = Long

typealias intptr_tVar = LongVarOf<intptr_t>
typealias intptr_t = Long

typealias uintptr_tVar = LongVarOf<uintptr_t>
typealias uintptr_t = Long

typealias intmax_tVar = LongVarOf<intmax_t>
typealias intmax_t = Long

typealias uintmax_tVar = LongVarOf<uintmax_t>
typealias uintmax_t = Long

typealias __gwchar_tVar = IntVarOf<__gwchar_t>
typealias __gwchar_t = Int

typealias GLuint64Var = LongVarOf<GLuint64>
typealias GLuint64 = uint64_t

typealias GLint64Var = LongVarOf<GLint64>
typealias GLint64 = int64_t

typealias PFNGLDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<CFunctionType130>>

typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC>
typealias PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CPointer<CFunction<CFunctionType136>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CPointer<CFunction<CFunctionType137>>

typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC>
typealias PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CPointer<CFunction<CFunctionType138>>

typealias PFNGLPROVOKINGVERTEXPROCVar = CPointerVarOf<PFNGLPROVOKINGVERTEXPROC>
typealias PFNGLPROVOKINGVERTEXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLFENCESYNCPROCVar = CPointerVarOf<PFNGLFENCESYNCPROC>
typealias PFNGLFENCESYNCPROC = CPointer<CFunction<CFunctionType139>>

typealias PFNGLISSYNCPROCVar = CPointerVarOf<PFNGLISSYNCPROC>
typealias PFNGLISSYNCPROC = CPointer<CFunction<CFunctionType140>>

typealias PFNGLDELETESYNCPROCVar = CPointerVarOf<PFNGLDELETESYNCPROC>
typealias PFNGLDELETESYNCPROC = CPointer<CFunction<CFunctionType141>>

typealias PFNGLCLIENTWAITSYNCPROCVar = CPointerVarOf<PFNGLCLIENTWAITSYNCPROC>
typealias PFNGLCLIENTWAITSYNCPROC = CPointer<CFunction<CFunctionType142>>

typealias PFNGLWAITSYNCPROCVar = CPointerVarOf<PFNGLWAITSYNCPROC>
typealias PFNGLWAITSYNCPROC = CPointer<CFunction<CFunctionType143>>

typealias PFNGLGETINTEGER64VPROCVar = CPointerVarOf<PFNGLGETINTEGER64VPROC>
typealias PFNGLGETINTEGER64VPROC = CPointer<CFunction<CFunctionType144>>

typealias PFNGLGETSYNCIVPROCVar = CPointerVarOf<PFNGLGETSYNCIVPROC>
typealias PFNGLGETSYNCIVPROC = CPointer<CFunction<CFunctionType145>>

typealias PFNGLGETINTEGER64I_VPROCVar = CPointerVarOf<PFNGLGETINTEGER64I_VPROC>
typealias PFNGLGETINTEGER64I_VPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETBUFFERPARAMETERI64VPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERI64VPROC>
typealias PFNGLGETBUFFERPARAMETERI64VPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLFRAMEBUFFERTEXTUREPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREPROC>
typealias PFNGLFRAMEBUFFERTEXTUREPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLTEXIMAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE2DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType148>>

typealias PFNGLTEXIMAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXIMAGE3DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType149>>

typealias PFNGLGETMULTISAMPLEFVPROCVar = CPointerVarOf<PFNGLGETMULTISAMPLEFVPROC>
typealias PFNGLGETMULTISAMPLEFVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLSAMPLEMASKIPROCVar = CPointerVarOf<PFNGLSAMPLEMASKIPROC>
typealias PFNGLSAMPLEMASKIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONINDEXEDPROC>
typealias PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = CPointer<CFunction<CFunctionType150>>

typealias PFNGLGETFRAGDATAINDEXPROCVar = CPointerVarOf<PFNGLGETFRAGDATAINDEXPROC>
typealias PFNGLGETFRAGDATAINDEXPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLGENSAMPLERSPROCVar = CPointerVarOf<PFNGLGENSAMPLERSPROC>
typealias PFNGLGENSAMPLERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETESAMPLERSPROCVar = CPointerVarOf<PFNGLDELETESAMPLERSPROC>
typealias PFNGLDELETESAMPLERSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISSAMPLERPROCVar = CPointerVarOf<PFNGLISSAMPLERPROC>
typealias PFNGLISSAMPLERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBINDSAMPLERPROCVar = CPointerVarOf<PFNGLBINDSAMPLERPROC>
typealias PFNGLBINDSAMPLERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLSAMPLERPARAMETERIPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIPROC>
typealias PFNGLSAMPLERPARAMETERIPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIVPROC>
typealias PFNGLSAMPLERPARAMETERIVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLSAMPLERPARAMETERFPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFPROC>
typealias PFNGLSAMPLERPARAMETERFPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERFVPROC>
typealias PFNGLSAMPLERPARAMETERFVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIIVPROC>
typealias PFNGLSAMPLERPARAMETERIIVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLSAMPLERPARAMETERIUIVPROC>
typealias PFNGLSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLGETSAMPLERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETSAMPLERPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETSAMPLERPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERFVPROC>
typealias PFNGLGETSAMPLERPARAMETERFVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETSAMPLERPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETSAMPLERPARAMETERIUIVPROC>
typealias PFNGLGETSAMPLERPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLQUERYCOUNTERPROCVar = CPointerVarOf<PFNGLQUERYCOUNTERPROC>
typealias PFNGLQUERYCOUNTERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETQUERYOBJECTI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTI64VPROC>
typealias PFNGLGETQUERYOBJECTI64VPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETQUERYOBJECTUI64VPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUI64VPROC>
typealias PFNGLGETQUERYOBJECTUI64VPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLVERTEXATTRIBDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORPROC>
typealias PFNGLVERTEXATTRIBDIVISORPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXATTRIBP1UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIPROC>
typealias PFNGLVERTEXATTRIBP1UIPROC = CPointer<CFunction<CFunctionType155>>

typealias PFNGLVERTEXATTRIBP1UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP1UIVPROC>
typealias PFNGLVERTEXATTRIBP1UIVPROC = CPointer<CFunction<CFunctionType156>>

typealias PFNGLVERTEXATTRIBP2UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIPROC>
typealias PFNGLVERTEXATTRIBP2UIPROC = CPointer<CFunction<CFunctionType155>>

typealias PFNGLVERTEXATTRIBP2UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP2UIVPROC>
typealias PFNGLVERTEXATTRIBP2UIVPROC = CPointer<CFunction<CFunctionType156>>

typealias PFNGLVERTEXATTRIBP3UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIPROC>
typealias PFNGLVERTEXATTRIBP3UIPROC = CPointer<CFunction<CFunctionType155>>

typealias PFNGLVERTEXATTRIBP3UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP3UIVPROC>
typealias PFNGLVERTEXATTRIBP3UIVPROC = CPointer<CFunction<CFunctionType156>>

typealias PFNGLVERTEXATTRIBP4UIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIPROC>
typealias PFNGLVERTEXATTRIBP4UIPROC = CPointer<CFunction<CFunctionType155>>

typealias PFNGLVERTEXATTRIBP4UIVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBP4UIVPROC>
typealias PFNGLVERTEXATTRIBP4UIVPROC = CPointer<CFunction<CFunctionType156>>

typealias PFNGLVERTEXP2UIPROCVar = CPointerVarOf<PFNGLVERTEXP2UIPROC>
typealias PFNGLVERTEXP2UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXP2UIVPROCVar = CPointerVarOf<PFNGLVERTEXP2UIVPROC>
typealias PFNGLVERTEXP2UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXP3UIPROCVar = CPointerVarOf<PFNGLVERTEXP3UIPROC>
typealias PFNGLVERTEXP3UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXP3UIVPROCVar = CPointerVarOf<PFNGLVERTEXP3UIVPROC>
typealias PFNGLVERTEXP3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXP4UIPROCVar = CPointerVarOf<PFNGLVERTEXP4UIPROC>
typealias PFNGLVERTEXP4UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXP4UIVPROCVar = CPointerVarOf<PFNGLVERTEXP4UIVPROC>
typealias PFNGLVERTEXP4UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLTEXCOORDP1UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP1UIPROC>
typealias PFNGLTEXCOORDP1UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTEXCOORDP1UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP1UIVPROC>
typealias PFNGLTEXCOORDP1UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLTEXCOORDP2UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP2UIPROC>
typealias PFNGLTEXCOORDP2UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTEXCOORDP2UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP2UIVPROC>
typealias PFNGLTEXCOORDP2UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLTEXCOORDP3UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP3UIPROC>
typealias PFNGLTEXCOORDP3UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTEXCOORDP3UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP3UIVPROC>
typealias PFNGLTEXCOORDP3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLTEXCOORDP4UIPROCVar = CPointerVarOf<PFNGLTEXCOORDP4UIPROC>
typealias PFNGLTEXCOORDP4UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTEXCOORDP4UIVPROCVar = CPointerVarOf<PFNGLTEXCOORDP4UIVPROC>
typealias PFNGLTEXCOORDP4UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLMULTITEXCOORDP1UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP1UIPROC>
typealias PFNGLMULTITEXCOORDP1UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXCOORDP1UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP1UIVPROC>
typealias PFNGLMULTITEXCOORDP1UIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLMULTITEXCOORDP2UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP2UIPROC>
typealias PFNGLMULTITEXCOORDP2UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXCOORDP2UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP2UIVPROC>
typealias PFNGLMULTITEXCOORDP2UIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLMULTITEXCOORDP3UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP3UIPROC>
typealias PFNGLMULTITEXCOORDP3UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXCOORDP3UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP3UIVPROC>
typealias PFNGLMULTITEXCOORDP3UIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLMULTITEXCOORDP4UIPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP4UIPROC>
typealias PFNGLMULTITEXCOORDP4UIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXCOORDP4UIVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDP4UIVPROC>
typealias PFNGLMULTITEXCOORDP4UIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLNORMALP3UIPROCVar = CPointerVarOf<PFNGLNORMALP3UIPROC>
typealias PFNGLNORMALP3UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLNORMALP3UIVPROCVar = CPointerVarOf<PFNGLNORMALP3UIVPROC>
typealias PFNGLNORMALP3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLCOLORP3UIPROCVar = CPointerVarOf<PFNGLCOLORP3UIPROC>
typealias PFNGLCOLORP3UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCOLORP3UIVPROCVar = CPointerVarOf<PFNGLCOLORP3UIVPROC>
typealias PFNGLCOLORP3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLCOLORP4UIPROCVar = CPointerVarOf<PFNGLCOLORP4UIPROC>
typealias PFNGLCOLORP4UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCOLORP4UIVPROCVar = CPointerVarOf<PFNGLCOLORP4UIVPROC>
typealias PFNGLCOLORP4UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLSECONDARYCOLORP3UIPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORP3UIPROC>
typealias PFNGLSECONDARYCOLORP3UIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLSECONDARYCOLORP3UIVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORP3UIVPROC>
typealias PFNGLSECONDARYCOLORP3UIVPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLMINSAMPLESHADINGPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGPROC>
typealias PFNGLMINSAMPLESHADINGPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLBLENDEQUATIONIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIPROC>
typealias PFNGLBLENDEQUATIONIPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBLENDEQUATIONSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBLENDFUNCIPROCVar = CPointerVarOf<PFNGLBLENDFUNCIPROC>
typealias PFNGLBLENDFUNCIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBLENDFUNCSEPARATEIPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIPROC>
typealias PFNGLBLENDFUNCSEPARATEIPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLDRAWARRAYSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINDIRECTPROC>
typealias PFNGLDRAWARRAYSINDIRECTPROC = CPointer<CFunction<CFunctionType157>>

typealias PFNGLDRAWELEMENTSINDIRECTPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINDIRECTPROC>
typealias PFNGLDRAWELEMENTSINDIRECTPROC = CPointer<CFunction<CFunctionType158>>

typealias PFNGLUNIFORM1DPROCVar = CPointerVarOf<PFNGLUNIFORM1DPROC>
typealias PFNGLUNIFORM1DPROC = CPointer<CFunction<CFunctionType159>>

typealias PFNGLUNIFORM2DPROCVar = CPointerVarOf<PFNGLUNIFORM2DPROC>
typealias PFNGLUNIFORM2DPROC = CPointer<CFunction<CFunctionType160>>

typealias PFNGLUNIFORM3DPROCVar = CPointerVarOf<PFNGLUNIFORM3DPROC>
typealias PFNGLUNIFORM3DPROC = CPointer<CFunction<CFunctionType161>>

typealias PFNGLUNIFORM4DPROCVar = CPointerVarOf<PFNGLUNIFORM4DPROC>
typealias PFNGLUNIFORM4DPROC = CPointer<CFunction<CFunctionType162>>

typealias PFNGLUNIFORM1DVPROCVar = CPointerVarOf<PFNGLUNIFORM1DVPROC>
typealias PFNGLUNIFORM1DVPROC = CPointer<CFunction<CFunctionType163>>

typealias PFNGLUNIFORM2DVPROCVar = CPointerVarOf<PFNGLUNIFORM2DVPROC>
typealias PFNGLUNIFORM2DVPROC = CPointer<CFunction<CFunctionType163>>

typealias PFNGLUNIFORM3DVPROCVar = CPointerVarOf<PFNGLUNIFORM3DVPROC>
typealias PFNGLUNIFORM3DVPROC = CPointer<CFunction<CFunctionType163>>

typealias PFNGLUNIFORM4DVPROCVar = CPointerVarOf<PFNGLUNIFORM4DVPROC>
typealias PFNGLUNIFORM4DVPROC = CPointer<CFunction<CFunctionType163>>

typealias PFNGLUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2DVPROC>
typealias PFNGLUNIFORMMATRIX2DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3DVPROC>
typealias PFNGLUNIFORMMATRIX3DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4DVPROC>
typealias PFNGLUNIFORMMATRIX4DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X3DVPROC>
typealias PFNGLUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2X4DVPROC>
typealias PFNGLUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X2DVPROC>
typealias PFNGLUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3X4DVPROC>
typealias PFNGLUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X2DVPROC>
typealias PFNGLUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4X3DVPROC>
typealias PFNGLUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<CFunctionType164>>

typealias PFNGLGETUNIFORMDVPROCVar = CPointerVarOf<PFNGLGETUNIFORMDVPROC>
typealias PFNGLGETUNIFORMDVPROC = CPointer<CFunction<CFunctionType165>>

typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC>
typealias PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = CPointer<CFunction<CFunctionType166>>

typealias PFNGLGETSUBROUTINEINDEXPROCVar = CPointerVarOf<PFNGLGETSUBROUTINEINDEXPROC>
typealias PFNGLGETSUBROUTINEINDEXPROC = CPointer<CFunction<CFunctionType167>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = CPointer<CFunction<CFunctionType168>>

typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC>
typealias PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = CPointer<CFunction<CFunctionType169>>

typealias PFNGLGETACTIVESUBROUTINENAMEPROCVar = CPointerVarOf<PFNGLGETACTIVESUBROUTINENAMEPROC>
typealias PFNGLGETACTIVESUBROUTINENAMEPROC = CPointer<CFunction<CFunctionType169>>

typealias PFNGLUNIFORMSUBROUTINESUIVPROCVar = CPointerVarOf<PFNGLUNIFORMSUBROUTINESUIVPROC>
typealias PFNGLUNIFORMSUBROUTINESUIVPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLGETUNIFORMSUBROUTINEUIVPROCVar = CPointerVarOf<PFNGLGETUNIFORMSUBROUTINEUIVPROC>
typealias PFNGLGETUNIFORMSUBROUTINEUIVPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLGETPROGRAMSTAGEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTAGEIVPROC>
typealias PFNGLGETPROGRAMSTAGEIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLPATCHPARAMETERIPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERIPROC>
typealias PFNGLPATCHPARAMETERIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPATCHPARAMETERFVPROCVar = CPointerVarOf<PFNGLPATCHPARAMETERFVPROC>
typealias PFNGLPATCHPARAMETERFVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLBINDTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLBINDTRANSFORMFEEDBACKPROC>
typealias PFNGLBINDTRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETETRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLDELETETRANSFORMFEEDBACKSPROC>
typealias PFNGLDELETETRANSFORMFEEDBACKSPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENTRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLGENTRANSFORMFEEDBACKSPROC>
typealias PFNGLGENTRANSFORMFEEDBACKSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLISTRANSFORMFEEDBACKPROC>
typealias PFNGLISTRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLPAUSETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLPAUSETRANSFORMFEEDBACKPROC>
typealias PFNGLPAUSETRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLRESUMETRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLRESUMETRANSFORMFEEDBACKPROC>
typealias PFNGLRESUMETRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLDRAWTRANSFORMFEEDBACKPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBEGINQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLBEGINQUERYINDEXEDPROC>
typealias PFNGLBEGINQUERYINDEXEDPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLENDQUERYINDEXEDPROCVar = CPointerVarOf<PFNGLENDQUERYINDEXEDPROC>
typealias PFNGLENDQUERYINDEXEDPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETQUERYINDEXEDIVPROCVar = CPointerVarOf<PFNGLGETQUERYINDEXEDIVPROC>
typealias PFNGLGETQUERYINDEXEDIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLRELEASESHADERCOMPILERPROCVar = CPointerVarOf<PFNGLRELEASESHADERCOMPILERPROC>
typealias PFNGLRELEASESHADERCOMPILERPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLSHADERBINARYPROCVar = CPointerVarOf<PFNGLSHADERBINARYPROC>
typealias PFNGLSHADERBINARYPROC = CPointer<CFunction<CFunctionType170>>

typealias PFNGLGETSHADERPRECISIONFORMATPROCVar = CPointerVarOf<PFNGLGETSHADERPRECISIONFORMATPROC>
typealias PFNGLGETSHADERPRECISIONFORMATPROC = CPointer<CFunction<CFunctionType171>>

typealias PFNGLDEPTHRANGEFPROCVar = CPointerVarOf<PFNGLDEPTHRANGEFPROC>
typealias PFNGLDEPTHRANGEFPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLCLEARDEPTHFPROCVar = CPointerVarOf<PFNGLCLEARDEPTHFPROC>
typealias PFNGLCLEARDEPTHFPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLGETPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLGETPROGRAMBINARYPROC>
typealias PFNGLGETPROGRAMBINARYPROC = CPointer<CFunction<CFunctionType172>>

typealias PFNGLPROGRAMBINARYPROCVar = CPointerVarOf<PFNGLPROGRAMBINARYPROC>
typealias PFNGLPROGRAMBINARYPROC = CPointer<CFunction<CFunctionType173>>

typealias PFNGLPROGRAMPARAMETERIPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIPROC>
typealias PFNGLPROGRAMPARAMETERIPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLUSEPROGRAMSTAGESPROCVar = CPointerVarOf<PFNGLUSEPROGRAMSTAGESPROC>
typealias PFNGLUSEPROGRAMSTAGESPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLACTIVESHADERPROGRAMPROCVar = CPointerVarOf<PFNGLACTIVESHADERPROGRAMPROC>
typealias PFNGLACTIVESHADERPROGRAMPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCREATESHADERPROGRAMVPROCVar = CPointerVarOf<PFNGLCREATESHADERPROGRAMVPROC>
typealias PFNGLCREATESHADERPROGRAMVPROC = CPointer<CFunction<CFunctionType174>>

typealias PFNGLBINDPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLBINDPROGRAMPIPELINEPROC>
typealias PFNGLBINDPROGRAMPIPELINEPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDELETEPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMPIPELINESPROC>
typealias PFNGLDELETEPROGRAMPIPELINESPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLGENPROGRAMPIPELINESPROC>
typealias PFNGLGENPROGRAMPIPELINESPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLISPROGRAMPIPELINEPROC>
typealias PFNGLISPROGRAMPIPELINEPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETPROGRAMPIPELINEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEIVPROC>
typealias PFNGLGETPROGRAMPIPELINEIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLPROGRAMUNIFORM1IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IPROC>
typealias PFNGLPROGRAMUNIFORM1IPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLPROGRAMUNIFORM1IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IVPROC>
typealias PFNGLPROGRAMUNIFORM1IVPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM1FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FPROC>
typealias PFNGLPROGRAMUNIFORM1FPROC = CPointer<CFunction<CFunctionType176>>

typealias PFNGLPROGRAMUNIFORM1FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FVPROC>
typealias PFNGLPROGRAMUNIFORM1FVPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM1DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DPROC>
typealias PFNGLPROGRAMUNIFORM1DPROC = CPointer<CFunction<CFunctionType178>>

typealias PFNGLPROGRAMUNIFORM1DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DVPROC>
typealias PFNGLPROGRAMUNIFORM1DVPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM1UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIPROC>
typealias PFNGLPROGRAMUNIFORM1UIPROC = CPointer<CFunction<CFunctionType180>>

typealias PFNGLPROGRAMUNIFORM1UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIVPROC>
typealias PFNGLPROGRAMUNIFORM1UIVPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM2IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IPROC>
typealias PFNGLPROGRAMUNIFORM2IPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLPROGRAMUNIFORM2IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IVPROC>
typealias PFNGLPROGRAMUNIFORM2IVPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM2FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FPROC>
typealias PFNGLPROGRAMUNIFORM2FPROC = CPointer<CFunction<CFunctionType182>>

typealias PFNGLPROGRAMUNIFORM2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FVPROC>
typealias PFNGLPROGRAMUNIFORM2FVPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM2DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DPROC>
typealias PFNGLPROGRAMUNIFORM2DPROC = CPointer<CFunction<CFunctionType183>>

typealias PFNGLPROGRAMUNIFORM2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DVPROC>
typealias PFNGLPROGRAMUNIFORM2DVPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM2UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIPROC>
typealias PFNGLPROGRAMUNIFORM2UIPROC = CPointer<CFunction<CFunctionType184>>

typealias PFNGLPROGRAMUNIFORM2UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIVPROC>
typealias PFNGLPROGRAMUNIFORM2UIVPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM3IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IPROC>
typealias PFNGLPROGRAMUNIFORM3IPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLPROGRAMUNIFORM3IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IVPROC>
typealias PFNGLPROGRAMUNIFORM3IVPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM3FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FPROC>
typealias PFNGLPROGRAMUNIFORM3FPROC = CPointer<CFunction<CFunctionType185>>

typealias PFNGLPROGRAMUNIFORM3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FVPROC>
typealias PFNGLPROGRAMUNIFORM3FVPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM3DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DPROC>
typealias PFNGLPROGRAMUNIFORM3DPROC = CPointer<CFunction<CFunctionType186>>

typealias PFNGLPROGRAMUNIFORM3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DVPROC>
typealias PFNGLPROGRAMUNIFORM3DVPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM3UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIPROC>
typealias PFNGLPROGRAMUNIFORM3UIPROC = CPointer<CFunction<CFunctionType187>>

typealias PFNGLPROGRAMUNIFORM3UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIVPROC>
typealias PFNGLPROGRAMUNIFORM3UIVPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM4IPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IPROC>
typealias PFNGLPROGRAMUNIFORM4IPROC = CPointer<CFunction<CFunctionType188>>

typealias PFNGLPROGRAMUNIFORM4IVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IVPROC>
typealias PFNGLPROGRAMUNIFORM4IVPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM4FPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FPROC>
typealias PFNGLPROGRAMUNIFORM4FPROC = CPointer<CFunction<CFunctionType189>>

typealias PFNGLPROGRAMUNIFORM4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FVPROC>
typealias PFNGLPROGRAMUNIFORM4FVPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM4DPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DPROC>
typealias PFNGLPROGRAMUNIFORM4DPROC = CPointer<CFunction<CFunctionType190>>

typealias PFNGLPROGRAMUNIFORM4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DVPROC>
typealias PFNGLPROGRAMUNIFORM4DVPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM4UIPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIPROC>
typealias PFNGLPROGRAMUNIFORM4UIPROC = CPointer<CFunction<CFunctionType191>>

typealias PFNGLPROGRAMUNIFORM4UIVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIVPROC>
typealias PFNGLPROGRAMUNIFORM4UIVPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLVALIDATEPROGRAMPIPELINEPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMPIPELINEPROC>
typealias PFNGLVALIDATEPROGRAMPIPELINEPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROCVar = CPointerVarOf<PFNGLGETPROGRAMPIPELINEINFOLOGPROC>
typealias PFNGLGETPROGRAMPIPELINEINFOLOGPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLVERTEXATTRIBL1DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DPROC>
typealias PFNGLVERTEXATTRIBL1DPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXATTRIBL2DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DPROC>
typealias PFNGLVERTEXATTRIBL2DPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXATTRIBL3DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DPROC>
typealias PFNGLVERTEXATTRIBL3DPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXATTRIBL4DPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DPROC>
typealias PFNGLVERTEXATTRIBL4DPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXATTRIBL1DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DVPROC>
typealias PFNGLVERTEXATTRIBL1DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL2DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DVPROC>
typealias PFNGLVERTEXATTRIBL2DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL3DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DVPROC>
typealias PFNGLVERTEXATTRIBL3DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL4DVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DVPROC>
typealias PFNGLVERTEXATTRIBL4DVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBLPOINTERPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLPOINTERPROC>
typealias PFNGLVERTEXATTRIBLPOINTERPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLGETVERTEXATTRIBLDVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLDVPROC>
typealias PFNGLGETVERTEXATTRIBLDVPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLVIEWPORTARRAYVPROCVar = CPointerVarOf<PFNGLVIEWPORTARRAYVPROC>
typealias PFNGLVIEWPORTARRAYVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLVIEWPORTINDEXEDFPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFPROC>
typealias PFNGLVIEWPORTINDEXEDFPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLVIEWPORTINDEXEDFVPROCVar = CPointerVarOf<PFNGLVIEWPORTINDEXEDFVPROC>
typealias PFNGLVIEWPORTINDEXEDFVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLSCISSORARRAYVPROCVar = CPointerVarOf<PFNGLSCISSORARRAYVPROC>
typealias PFNGLSCISSORARRAYVPROC = CPointer<CFunction<CFunctionType116>>

typealias PFNGLSCISSORINDEXEDPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDPROC>
typealias PFNGLSCISSORINDEXEDPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLSCISSORINDEXEDVPROCVar = CPointerVarOf<PFNGLSCISSORINDEXEDVPROC>
typealias PFNGLSCISSORINDEXEDVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLDEPTHRANGEARRAYVPROCVar = CPointerVarOf<PFNGLDEPTHRANGEARRAYVPROC>
typealias PFNGLDEPTHRANGEARRAYVPROC = CPointer<CFunction<CFunctionType194>>

typealias PFNGLDEPTHRANGEINDEXEDPROCVar = CPointerVarOf<PFNGLDEPTHRANGEINDEXEDPROC>
typealias PFNGLDEPTHRANGEINDEXEDPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLGETFLOATI_VPROCVar = CPointerVarOf<PFNGLGETFLOATI_VPROC>
typealias PFNGLGETFLOATI_VPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETDOUBLEI_VPROCVar = CPointerVarOf<PFNGLGETDOUBLEI_VPROC>
typealias PFNGLGETDOUBLEI_VPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC>
typealias PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC = CPointer<CFunction<CFunctionType195>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC = CPointer<CFunction<CFunctionType196>>

typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC = CPointer<CFunction<CFunctionType197>>

typealias PFNGLGETINTERNALFORMATIVPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATIVPROC>
typealias PFNGLGETINTERNALFORMATIVPROC = CPointer<CFunction<CFunctionType198>>

typealias PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROCVar = CPointerVarOf<PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC>
typealias PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLBINDIMAGETEXTUREPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTUREPROC>
typealias PFNGLBINDIMAGETEXTUREPROC = CPointer<CFunction<CFunctionType199>>

typealias PFNGLMEMORYBARRIERPROCVar = CPointerVarOf<PFNGLMEMORYBARRIERPROC>
typealias PFNGLMEMORYBARRIERPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTEXSTORAGE1DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE1DPROC>
typealias PFNGLTEXSTORAGE1DPROC = CPointer<CFunction<CFunctionType200>>

typealias PFNGLTEXSTORAGE2DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE2DPROC>
typealias PFNGLTEXSTORAGE2DPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLTEXSTORAGE3DPROCVar = CPointerVarOf<PFNGLTEXSTORAGE3DPROC>
typealias PFNGLTEXSTORAGE3DPROC = CPointer<CFunction<CFunctionType201>>

typealias PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC = CPointer<CFunction<CFunctionType147>>

typealias GLDEBUGPROCVar = CPointerVarOf<GLDEBUGPROC>
typealias GLDEBUGPROC = CPointer<CFunction<CFunctionType202>>

typealias PFNGLCLEARBUFFERDATAPROCVar = CPointerVarOf<PFNGLCLEARBUFFERDATAPROC>
typealias PFNGLCLEARBUFFERDATAPROC = CPointer<CFunction<CFunctionType203>>

typealias PFNGLCLEARBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCLEARBUFFERSUBDATAPROC>
typealias PFNGLCLEARBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType204>>

typealias PFNGLDISPATCHCOMPUTEPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEPROC>
typealias PFNGLDISPATCHCOMPUTEPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLDISPATCHCOMPUTEINDIRECTPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEINDIRECTPROC>
typealias PFNGLDISPATCHCOMPUTEINDIRECTPROC = CPointer<CFunction<CFunctionType205>>

typealias PFNGLCOPYIMAGESUBDATAPROCVar = CPointerVarOf<PFNGLCOPYIMAGESUBDATAPROC>
typealias PFNGLCOPYIMAGESUBDATAPROC = CPointer<CFunction<CFunctionType206>>

typealias PFNGLFRAMEBUFFERPARAMETERIPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERPARAMETERIPROC>
typealias PFNGLFRAMEBUFFERPARAMETERIPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLGETFRAMEBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERPARAMETERIVPROC>
typealias PFNGLGETFRAMEBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETINTERNALFORMATI64VPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATI64VPROC>
typealias PFNGLGETINTERNALFORMATI64VPROC = CPointer<CFunction<CFunctionType207>>

typealias PFNGLINVALIDATETEXSUBIMAGEPROCVar = CPointerVarOf<PFNGLINVALIDATETEXSUBIMAGEPROC>
typealias PFNGLINVALIDATETEXSUBIMAGEPROC = CPointer<CFunction<CFunctionType208>>

typealias PFNGLINVALIDATETEXIMAGEPROCVar = CPointerVarOf<PFNGLINVALIDATETEXIMAGEPROC>
typealias PFNGLINVALIDATETEXIMAGEPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLINVALIDATEBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLINVALIDATEBUFFERSUBDATAPROC>
typealias PFNGLINVALIDATEBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLINVALIDATEBUFFERDATAPROCVar = CPointerVarOf<PFNGLINVALIDATEBUFFERDATAPROC>
typealias PFNGLINVALIDATEBUFFERDATAPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLINVALIDATEFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLINVALIDATEFRAMEBUFFERPROC>
typealias PFNGLINVALIDATEFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLINVALIDATESUBFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLINVALIDATESUBFRAMEBUFFERPROC>
typealias PFNGLINVALIDATESUBFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType209>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTPROC = CPointer<CFunction<CFunctionType210>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTPROC = CPointer<CFunction<CFunctionType211>>

typealias PFNGLGETPROGRAMINTERFACEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMINTERFACEIVPROC>
typealias PFNGLGETPROGRAMINTERFACEIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETPROGRAMRESOURCEINDEXPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEINDEXPROC>
typealias PFNGLGETPROGRAMRESOURCEINDEXPROC = CPointer<CFunction<CFunctionType167>>

typealias PFNGLGETPROGRAMRESOURCENAMEPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCENAMEPROC>
typealias PFNGLGETPROGRAMRESOURCENAMEPROC = CPointer<CFunction<CFunctionType169>>

typealias PFNGLGETPROGRAMRESOURCEIVPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEIVPROC>
typealias PFNGLGETPROGRAMRESOURCEIVPROC = CPointer<CFunction<CFunctionType212>>

typealias PFNGLGETPROGRAMRESOURCELOCATIONPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCELOCATIONPROC>
typealias PFNGLGETPROGRAMRESOURCELOCATIONPROC = CPointer<CFunction<CFunctionType166>>

typealias PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC>
typealias PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC = CPointer<CFunction<CFunctionType166>>

typealias PFNGLSHADERSTORAGEBLOCKBINDINGPROCVar = CPointerVarOf<PFNGLSHADERSTORAGEBLOCKBINDINGPROC>
typealias PFNGLSHADERSTORAGEBLOCKBINDINGPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTEXBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTEXBUFFERRANGEPROC>
typealias PFNGLTEXBUFFERRANGEPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLTEXSTORAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXSTORAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXSTORAGE2DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType148>>

typealias PFNGLTEXSTORAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXSTORAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXSTORAGE3DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType149>>

typealias PFNGLTEXTUREVIEWPROCVar = CPointerVarOf<PFNGLTEXTUREVIEWPROC>
typealias PFNGLTEXTUREVIEWPROC = CPointer<CFunction<CFunctionType213>>

typealias PFNGLBINDVERTEXBUFFERPROCVar = CPointerVarOf<PFNGLBINDVERTEXBUFFERPROC>
typealias PFNGLBINDVERTEXBUFFERPROC = CPointer<CFunction<CFunctionType214>>

typealias PFNGLVERTEXATTRIBFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBFORMATPROC>
typealias PFNGLVERTEXATTRIBFORMATPROC = CPointer<CFunction<CFunctionType215>>

typealias PFNGLVERTEXATTRIBIFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIFORMATPROC>
typealias PFNGLVERTEXATTRIBIFORMATPROC = CPointer<CFunction<CFunctionType184>>

typealias PFNGLVERTEXATTRIBLFORMATPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLFORMATPROC>
typealias PFNGLVERTEXATTRIBLFORMATPROC = CPointer<CFunction<CFunctionType184>>

typealias PFNGLVERTEXATTRIBBINDINGPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBBINDINGPROC>
typealias PFNGLVERTEXATTRIBBINDINGPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXBINDINGDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXBINDINGDIVISORPROC>
typealias PFNGLVERTEXBINDINGDIVISORPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDEBUGMESSAGECONTROLPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECONTROLPROC>
typealias PFNGLDEBUGMESSAGECONTROLPROC = CPointer<CFunction<CFunctionType216>>

typealias PFNGLDEBUGMESSAGEINSERTPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTPROC>
typealias PFNGLDEBUGMESSAGEINSERTPROC = CPointer<CFunction<CFunctionType217>>

typealias PFNGLDEBUGMESSAGECALLBACKPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKPROC>
typealias PFNGLDEBUGMESSAGECALLBACKPROC = CPointer<CFunction<CFunctionType218>>

typealias PFNGLGETDEBUGMESSAGELOGPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGPROC>
typealias PFNGLGETDEBUGMESSAGELOGPROC = CPointer<CFunction<CFunctionType219>>

typealias PFNGLPUSHDEBUGGROUPPROCVar = CPointerVarOf<PFNGLPUSHDEBUGGROUPPROC>
typealias PFNGLPUSHDEBUGGROUPPROC = CPointer<CFunction<CFunctionType220>>

typealias PFNGLPOPDEBUGGROUPPROCVar = CPointerVarOf<PFNGLPOPDEBUGGROUPPROC>
typealias PFNGLPOPDEBUGGROUPPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLOBJECTLABELPROCVar = CPointerVarOf<PFNGLOBJECTLABELPROC>
typealias PFNGLOBJECTLABELPROC = CPointer<CFunction<CFunctionType220>>

typealias PFNGLGETOBJECTLABELPROCVar = CPointerVarOf<PFNGLGETOBJECTLABELPROC>
typealias PFNGLGETOBJECTLABELPROC = CPointer<CFunction<CFunctionType134>>

typealias PFNGLOBJECTPTRLABELPROCVar = CPointerVarOf<PFNGLOBJECTPTRLABELPROC>
typealias PFNGLOBJECTPTRLABELPROC = CPointer<CFunction<CFunctionType221>>

typealias PFNGLGETOBJECTPTRLABELPROCVar = CPointerVarOf<PFNGLGETOBJECTPTRLABELPROC>
typealias PFNGLGETOBJECTPTRLABELPROC = CPointer<CFunction<CFunctionType222>>

typealias PFNGLBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLBUFFERSTORAGEPROC>
typealias PFNGLBUFFERSTORAGEPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLCLEARTEXIMAGEPROCVar = CPointerVarOf<PFNGLCLEARTEXIMAGEPROC>
typealias PFNGLCLEARTEXIMAGEPROC = CPointer<CFunction<CFunctionType223>>

typealias PFNGLCLEARTEXSUBIMAGEPROCVar = CPointerVarOf<PFNGLCLEARTEXSUBIMAGEPROC>
typealias PFNGLCLEARTEXSUBIMAGEPROC = CPointer<CFunction<CFunctionType4>>

typealias PFNGLBINDBUFFERSBASEPROCVar = CPointerVarOf<PFNGLBINDBUFFERSBASEPROC>
typealias PFNGLBINDBUFFERSBASEPROC = CPointer<CFunction<CFunctionType224>>

typealias PFNGLBINDBUFFERSRANGEPROCVar = CPointerVarOf<PFNGLBINDBUFFERSRANGEPROC>
typealias PFNGLBINDBUFFERSRANGEPROC = CPointer<CFunction<CFunctionType225>>

typealias PFNGLBINDTEXTURESPROCVar = CPointerVarOf<PFNGLBINDTEXTURESPROC>
typealias PFNGLBINDTEXTURESPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLBINDSAMPLERSPROCVar = CPointerVarOf<PFNGLBINDSAMPLERSPROC>
typealias PFNGLBINDSAMPLERSPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLBINDIMAGETEXTURESPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTURESPROC>
typealias PFNGLBINDIMAGETEXTURESPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLBINDVERTEXBUFFERSPROCVar = CPointerVarOf<PFNGLBINDVERTEXBUFFERSPROC>
typealias PFNGLBINDVERTEXBUFFERSPROC = CPointer<CFunction<CFunctionType226>>

typealias PFNGLCLIPCONTROLPROCVar = CPointerVarOf<PFNGLCLIPCONTROLPROC>
typealias PFNGLCLIPCONTROLPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCREATETRANSFORMFEEDBACKSPROCVar = CPointerVarOf<PFNGLCREATETRANSFORMFEEDBACKSPROC>
typealias PFNGLCREATETRANSFORMFEEDBACKSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLTRANSFORMFEEDBACKBUFFERBASEPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC>
typealias PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC>
typealias PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLGETTRANSFORMFEEDBACKIVPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKIVPROC>
typealias PFNGLGETTRANSFORMFEEDBACKIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTRANSFORMFEEDBACKI_VPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKI_VPROC>
typealias PFNGLGETTRANSFORMFEEDBACKI_VPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETTRANSFORMFEEDBACKI64_VPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKI64_VPROC>
typealias PFNGLGETTRANSFORMFEEDBACKI64_VPROC = CPointer<CFunction<CFunctionType227>>

typealias PFNGLCREATEBUFFERSPROCVar = CPointerVarOf<PFNGLCREATEBUFFERSPROC>
typealias PFNGLCREATEBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLNAMEDBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEPROC>
typealias PFNGLNAMEDBUFFERSTORAGEPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLNAMEDBUFFERDATAPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERDATAPROC>
typealias PFNGLNAMEDBUFFERDATAPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSUBDATAPROC>
typealias PFNGLNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType70>>

typealias PFNGLCOPYNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCOPYNAMEDBUFFERSUBDATAPROC>
typealias PFNGLCOPYNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType131>>

typealias PFNGLCLEARNAMEDBUFFERDATAPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERDATAPROC>
typealias PFNGLCLEARNAMEDBUFFERDATAPROC = CPointer<CFunction<CFunctionType203>>

typealias PFNGLCLEARNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERSUBDATAPROC>
typealias PFNGLCLEARNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType204>>

typealias PFNGLMAPNAMEDBUFFERPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERPROC>
typealias PFNGLMAPNAMEDBUFFERPROC = CPointer<CFunction<CFunctionType72>>

typealias PFNGLMAPNAMEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERRANGEPROC>
typealias PFNGLMAPNAMEDBUFFERRANGEPROC = CPointer<CFunction<CFunctionType128>>

typealias PFNGLUNMAPNAMEDBUFFERPROCVar = CPointerVarOf<PFNGLUNMAPNAMEDBUFFERPROC>
typealias PFNGLUNMAPNAMEDBUFFERPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC>
typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLGETNAMEDBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETNAMEDBUFFERPARAMETERI64VPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERI64VPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERI64VPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETNAMEDBUFFERPOINTERVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPOINTERVPROC>
typealias PFNGLGETNAMEDBUFFERPOINTERVPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLGETNAMEDBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERSUBDATAPROC>
typealias PFNGLGETNAMEDBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType71>>

typealias PFNGLCREATEFRAMEBUFFERSPROCVar = CPointerVarOf<PFNGLCREATEFRAMEBUFFERSPROC>
typealias PFNGLCREATEFRAMEBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC>
typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC>
typealias PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLNAMEDFRAMEBUFFERREADBUFFERPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC>
typealias PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROCVar = CPointerVarOf<PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC>
typealias PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROCVar = CPointerVarOf<PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC>
typealias PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC = CPointer<CFunction<CFunctionType209>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERIVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERIVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERIVPROC = CPointer<CFunction<CFunctionType228>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERUIVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC = CPointer<CFunction<CFunctionType224>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERFVPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERFVPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERFVPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLCLEARNAMEDFRAMEBUFFERFIPROCVar = CPointerVarOf<PFNGLCLEARNAMEDFRAMEBUFFERFIPROC>
typealias PFNGLCLEARNAMEDFRAMEBUFFERFIPROC = CPointer<CFunction<CFunctionType230>>

typealias PFNGLBLITNAMEDFRAMEBUFFERPROCVar = CPointerVarOf<PFNGLBLITNAMEDFRAMEBUFFERPROC>
typealias PFNGLBLITNAMEDFRAMEBUFFERPROC = CPointer<CFunction<CFunctionType231>>

typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROCVar = CPointerVarOf<PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC>
typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLCREATERENDERBUFFERSPROCVar = CPointerVarOf<PFNGLCREATERENDERBUFFERSPROC>
typealias PFNGLCREATERENDERBUFFERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEPROC = CPointer<CFunction<CFunctionType121>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC>
typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLCREATETEXTURESPROCVar = CPointerVarOf<PFNGLCREATETEXTURESPROC>
typealias PFNGLCREATETEXTURESPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLTEXTUREBUFFERPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERPROC>
typealias PFNGLTEXTUREBUFFERPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTEXTUREBUFFERRANGEPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERRANGEPROC>
typealias PFNGLTEXTUREBUFFERRANGEPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLTEXTURESTORAGE1DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE1DPROC>
typealias PFNGLTEXTURESTORAGE1DPROC = CPointer<CFunction<CFunctionType200>>

typealias PFNGLTEXTURESTORAGE2DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DPROC>
typealias PFNGLTEXTURESTORAGE2DPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLTEXTURESTORAGE3DPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DPROC>
typealias PFNGLTEXTURESTORAGE3DPROC = CPointer<CFunction<CFunctionType201>>

typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC>
typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType148>>

typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC>
typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC = CPointer<CFunction<CFunctionType149>>

typealias PFNGLTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE1DPROC>
typealias PFNGLTEXTURESUBIMAGE1DPROC = CPointer<CFunction<CFunctionType233>>

typealias PFNGLTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE2DPROC>
typealias PFNGLTEXTURESUBIMAGE2DPROC = CPointer<CFunction<CFunctionType234>>

typealias PFNGLTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE3DPROC>
typealias PFNGLTEXTURESUBIMAGE3DPROC = CPointer<CFunction<CFunctionType4>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC = CPointer<CFunction<CFunctionType13>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC = CPointer<CFunction<CFunctionType12>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC = CPointer<CFunction<CFunctionType11>>

typealias PFNGLCOPYTEXTURESUBIMAGE1DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE1DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE1DPROC = CPointer<CFunction<CFunctionType188>>

typealias PFNGLCOPYTEXTURESUBIMAGE2DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE2DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE2DPROC = CPointer<CFunction<CFunctionType208>>

typealias PFNGLCOPYTEXTURESUBIMAGE3DPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE3DPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE3DPROC = CPointer<CFunction<CFunctionType5>>

typealias PFNGLTEXTUREPARAMETERFPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFPROC>
typealias PFNGLTEXTUREPARAMETERFPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLTEXTUREPARAMETERFVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFVPROC>
typealias PFNGLTEXTUREPARAMETERFVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLTEXTUREPARAMETERIPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIPROC>
typealias PFNGLTEXTUREPARAMETERIPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLTEXTUREPARAMETERIIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIIVPROC>
typealias PFNGLTEXTUREPARAMETERIIVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLTEXTUREPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIUIVPROC>
typealias PFNGLTEXTUREPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLTEXTUREPARAMETERIVPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIVPROC>
typealias PFNGLTEXTUREPARAMETERIVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLGENERATETEXTUREMIPMAPPROCVar = CPointerVarOf<PFNGLGENERATETEXTUREMIPMAPPROC>
typealias PFNGLGENERATETEXTUREMIPMAPPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBINDTEXTUREUNITPROCVar = CPointerVarOf<PFNGLBINDTEXTUREUNITPROC>
typealias PFNGLBINDTEXTUREUNITPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETTEXTUREIMAGEPROCVar = CPointerVarOf<PFNGLGETTEXTUREIMAGEPROC>
typealias PFNGLGETTEXTUREIMAGEPROC = CPointer<CFunction<CFunctionType235>>

typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC = CPointer<CFunction<CFunctionType236>>

typealias PFNGLGETTEXTURELEVELPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERFVPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERFVPROC = CPointer<CFunction<CFunctionType237>>

typealias PFNGLGETTEXTURELEVELPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERIVPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERIVPROC = CPointer<CFunction<CFunctionType238>>

typealias PFNGLGETTEXTUREPARAMETERFVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERFVPROC>
typealias PFNGLGETTEXTUREPARAMETERFVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETTEXTUREPARAMETERIIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTEXTUREPARAMETERIUIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIUIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIUIVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLGETTEXTUREPARAMETERIVPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIVPROC>
typealias PFNGLGETTEXTUREPARAMETERIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLCREATEVERTEXARRAYSPROCVar = CPointerVarOf<PFNGLCREATEVERTEXARRAYSPROC>
typealias PFNGLCREATEVERTEXARRAYSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDISABLEVERTEXARRAYATTRIBPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYATTRIBPROC>
typealias PFNGLDISABLEVERTEXARRAYATTRIBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENABLEVERTEXARRAYATTRIBPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYATTRIBPROC>
typealias PFNGLENABLEVERTEXARRAYATTRIBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXARRAYELEMENTBUFFERPROCVar = CPointerVarOf<PFNGLVERTEXARRAYELEMENTBUFFERPROC>
typealias PFNGLVERTEXARRAYELEMENTBUFFERPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXARRAYVERTEXBUFFERPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBUFFERPROC>
typealias PFNGLVERTEXARRAYVERTEXBUFFERPROC = CPointer<CFunction<CFunctionType239>>

typealias PFNGLVERTEXARRAYVERTEXBUFFERSPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBUFFERSPROC>
typealias PFNGLVERTEXARRAYVERTEXBUFFERSPROC = CPointer<CFunction<CFunctionType240>>

typealias PFNGLVERTEXARRAYATTRIBBINDINGPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBBINDINGPROC>
typealias PFNGLVERTEXARRAYATTRIBBINDINGPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXARRAYATTRIBFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBFORMATPROC = CPointer<CFunction<CFunctionType241>>

typealias PFNGLVERTEXARRAYATTRIBIFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBIFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBIFORMATPROC = CPointer<CFunction<CFunctionType242>>

typealias PFNGLVERTEXARRAYATTRIBLFORMATPROCVar = CPointerVarOf<PFNGLVERTEXARRAYATTRIBLFORMATPROC>
typealias PFNGLVERTEXARRAYATTRIBLFORMATPROC = CPointer<CFunction<CFunctionType242>>

typealias PFNGLVERTEXARRAYBINDINGDIVISORPROCVar = CPointerVarOf<PFNGLVERTEXARRAYBINDINGDIVISORPROC>
typealias PFNGLVERTEXARRAYBINDINGDIVISORPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLGETVERTEXARRAYIVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYIVPROC>
typealias PFNGLGETVERTEXARRAYIVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXARRAYINDEXEDIVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINDEXEDIVPROC>
typealias PFNGLGETVERTEXARRAYINDEXEDIVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETVERTEXARRAYINDEXED64IVPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINDEXED64IVPROC>
typealias PFNGLGETVERTEXARRAYINDEXED64IVPROC = CPointer<CFunction<CFunctionType227>>

typealias PFNGLCREATESAMPLERSPROCVar = CPointerVarOf<PFNGLCREATESAMPLERSPROC>
typealias PFNGLCREATESAMPLERSPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLCREATEPROGRAMPIPELINESPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMPIPELINESPROC>
typealias PFNGLCREATEPROGRAMPIPELINESPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLCREATEQUERIESPROCVar = CPointerVarOf<PFNGLCREATEQUERIESPROC>
typealias PFNGLCREATEQUERIESPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLGETQUERYBUFFEROBJECTI64VPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTI64VPROC>
typealias PFNGLGETQUERYBUFFEROBJECTI64VPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLGETQUERYBUFFEROBJECTIVPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTIVPROC>
typealias PFNGLGETQUERYBUFFEROBJECTIVPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLGETQUERYBUFFEROBJECTUI64VPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTUI64VPROC>
typealias PFNGLGETQUERYBUFFEROBJECTUI64VPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLGETQUERYBUFFEROBJECTUIVPROCVar = CPointerVarOf<PFNGLGETQUERYBUFFEROBJECTUIVPROC>
typealias PFNGLGETQUERYBUFFEROBJECTUIVPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLMEMORYBARRIERBYREGIONPROCVar = CPointerVarOf<PFNGLMEMORYBARRIERBYREGIONPROC>
typealias PFNGLMEMORYBARRIERBYREGIONPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETTEXTURESUBIMAGEPROCVar = CPointerVarOf<PFNGLGETTEXTURESUBIMAGEPROC>
typealias PFNGLGETTEXTURESUBIMAGEPROC = CPointer<CFunction<CFunctionType244>>

typealias PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC>
typealias PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC = CPointer<CFunction<CFunctionType245>>

typealias PFNGLGETGRAPHICSRESETSTATUSPROCVar = CPointerVarOf<PFNGLGETGRAPHICSRESETSTATUSPROC>
typealias PFNGLGETGRAPHICSRESETSTATUSPROC = CPointer<CFunction<CFunctionType76>>

typealias PFNGLGETNCOMPRESSEDTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETNCOMPRESSEDTEXIMAGEPROC>
typealias PFNGLGETNCOMPRESSEDTEXIMAGEPROC = CPointer<CFunction<CFunctionType236>>

typealias PFNGLGETNTEXIMAGEPROCVar = CPointerVarOf<PFNGLGETNTEXIMAGEPROC>
typealias PFNGLGETNTEXIMAGEPROC = CPointer<CFunction<CFunctionType235>>

typealias PFNGLGETNUNIFORMDVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMDVPROC>
typealias PFNGLGETNUNIFORMDVPROC = CPointer<CFunction<CFunctionType246>>

typealias PFNGLGETNUNIFORMFVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMFVPROC>
typealias PFNGLGETNUNIFORMFVPROC = CPointer<CFunction<CFunctionType247>>

typealias PFNGLGETNUNIFORMIVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMIVPROC>
typealias PFNGLGETNUNIFORMIVPROC = CPointer<CFunction<CFunctionType248>>

typealias PFNGLGETNUNIFORMUIVPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUIVPROC>
typealias PFNGLGETNUNIFORMUIVPROC = CPointer<CFunction<CFunctionType249>>

typealias PFNGLREADNPIXELSPROCVar = CPointerVarOf<PFNGLREADNPIXELSPROC>
typealias PFNGLREADNPIXELSPROC = CPointer<CFunction<CFunctionType250>>

typealias PFNGLGETNMAPDVPROCVar = CPointerVarOf<PFNGLGETNMAPDVPROC>
typealias PFNGLGETNMAPDVPROC = CPointer<CFunction<CFunctionType251>>

typealias PFNGLGETNMAPFVPROCVar = CPointerVarOf<PFNGLGETNMAPFVPROC>
typealias PFNGLGETNMAPFVPROC = CPointer<CFunction<CFunctionType252>>

typealias PFNGLGETNMAPIVPROCVar = CPointerVarOf<PFNGLGETNMAPIVPROC>
typealias PFNGLGETNMAPIVPROC = CPointer<CFunction<CFunctionType253>>

typealias PFNGLGETNPIXELMAPFVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPFVPROC>
typealias PFNGLGETNPIXELMAPFVPROC = CPointer<CFunction<CFunctionType82>>

typealias PFNGLGETNPIXELMAPUIVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUIVPROC>
typealias PFNGLGETNPIXELMAPUIVPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLGETNPIXELMAPUSVPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUSVPROC>
typealias PFNGLGETNPIXELMAPUSVPROC = CPointer<CFunction<CFunctionType254>>

typealias PFNGLGETNPOLYGONSTIPPLEPROCVar = CPointerVarOf<PFNGLGETNPOLYGONSTIPPLEPROC>
typealias PFNGLGETNPOLYGONSTIPPLEPROC = CPointer<CFunction<CFunctionType255>>

typealias PFNGLGETNCOLORTABLEPROCVar = CPointerVarOf<PFNGLGETNCOLORTABLEPROC>
typealias PFNGLGETNCOLORTABLEPROC = CPointer<CFunction<CFunctionType256>>

typealias PFNGLGETNCONVOLUTIONFILTERPROCVar = CPointerVarOf<PFNGLGETNCONVOLUTIONFILTERPROC>
typealias PFNGLGETNCONVOLUTIONFILTERPROC = CPointer<CFunction<CFunctionType256>>

typealias PFNGLGETNSEPARABLEFILTERPROCVar = CPointerVarOf<PFNGLGETNSEPARABLEFILTERPROC>
typealias PFNGLGETNSEPARABLEFILTERPROC = CPointer<CFunction<CFunctionType257>>

typealias PFNGLGETNHISTOGRAMPROCVar = CPointerVarOf<PFNGLGETNHISTOGRAMPROC>
typealias PFNGLGETNHISTOGRAMPROC = CPointer<CFunction<CFunctionType258>>

typealias PFNGLGETNMINMAXPROCVar = CPointerVarOf<PFNGLGETNMINMAXPROC>
typealias PFNGLGETNMINMAXPROC = CPointer<CFunction<CFunctionType258>>

typealias PFNGLTEXTUREBARRIERPROCVar = CPointerVarOf<PFNGLTEXTUREBARRIERPROC>
typealias PFNGLTEXTUREBARRIERPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLPRIMITIVEBOUNDINGBOXARBPROCVar = CPointerVarOf<PFNGLPRIMITIVEBOUNDINGBOXARBPROC>
typealias PFNGLPRIMITIVEBOUNDINGBOXARBPROC = CPointer<CFunction<CFunctionType259>>

typealias GLuint64EXTVar = LongVarOf<GLuint64EXT>
typealias GLuint64EXT = uint64_t

typealias PFNGLGETTEXTUREHANDLEARBPROCVar = CPointerVarOf<PFNGLGETTEXTUREHANDLEARBPROC>
typealias PFNGLGETTEXTUREHANDLEARBPROC = CPointer<CFunction<CFunctionType260>>

typealias PFNGLGETTEXTURESAMPLERHANDLEARBPROCVar = CPointerVarOf<PFNGLGETTEXTURESAMPLERHANDLEARBPROC>
typealias PFNGLGETTEXTURESAMPLERHANDLEARBPROC = CPointer<CFunction<CFunctionType261>>

typealias PFNGLMAKETEXTUREHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLERESIDENTARBPROC>
typealias PFNGLMAKETEXTUREHANDLERESIDENTARBPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC>
typealias PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLGETIMAGEHANDLEARBPROCVar = CPointerVarOf<PFNGLGETIMAGEHANDLEARBPROC>
typealias PFNGLGETIMAGEHANDLEARBPROC = CPointer<CFunction<CFunctionType263>>

typealias PFNGLMAKEIMAGEHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLERESIDENTARBPROC>
typealias PFNGLMAKEIMAGEHANDLERESIDENTARBPROC = CPointer<CFunction<CFunctionType264>>

typealias PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC>
typealias PFNGLMAKEIMAGEHANDLENONRESIDENTARBPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLUNIFORMHANDLEUI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64ARBPROC>
typealias PFNGLUNIFORMHANDLEUI64ARBPROC = CPointer<CFunction<CFunctionType265>>

typealias PFNGLUNIFORMHANDLEUI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64VARBPROC>
typealias PFNGLUNIFORMHANDLEUI64VARBPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC = CPointer<CFunction<CFunctionType267>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLISTEXTUREHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLISTEXTUREHANDLERESIDENTARBPROC>
typealias PFNGLISTEXTUREHANDLERESIDENTARBPROC = CPointer<CFunction<CFunctionType269>>

typealias PFNGLISIMAGEHANDLERESIDENTARBPROCVar = CPointerVarOf<PFNGLISIMAGEHANDLERESIDENTARBPROC>
typealias PFNGLISIMAGEHANDLERESIDENTARBPROC = CPointer<CFunction<CFunctionType269>>

typealias PFNGLVERTEXATTRIBL1UI64ARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64ARBPROC>
typealias PFNGLVERTEXATTRIBL1UI64ARBPROC = CPointer<CFunction<CFunctionType270>>

typealias PFNGLVERTEXATTRIBL1UI64VARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64VARBPROC>
typealias PFNGLVERTEXATTRIBL1UI64VARBPROC = CPointer<CFunction<CFunctionType271>>

typealias PFNGLGETVERTEXATTRIBLUI64VARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLUI64VARBPROC>
typealias PFNGLGETVERTEXATTRIBLUI64VARBPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLCREATESYNCFROMCLEVENTARBPROCVar = CPointerVarOf<PFNGLCREATESYNCFROMCLEVENTARBPROC>
typealias PFNGLCREATESYNCFROMCLEVENTARBPROC = CPointer<CFunction<CFunctionType272>>

typealias PFNGLCLAMPCOLORARBPROCVar = CPointerVarOf<PFNGLCLAMPCOLORARBPROC>
typealias PFNGLCLAMPCOLORARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROCVar = CPointerVarOf<PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC>
typealias PFNGLDISPATCHCOMPUTEGROUPSIZEARBPROC = CPointer<CFunction<CFunctionType273>>

typealias GLDEBUGPROCARBVar = CPointerVarOf<GLDEBUGPROCARB>
typealias GLDEBUGPROCARB = CPointer<CFunction<CFunctionType202>>

typealias PFNGLDEBUGMESSAGECONTROLARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECONTROLARBPROC>
typealias PFNGLDEBUGMESSAGECONTROLARBPROC = CPointer<CFunction<CFunctionType216>>

typealias PFNGLDEBUGMESSAGEINSERTARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTARBPROC>
typealias PFNGLDEBUGMESSAGEINSERTARBPROC = CPointer<CFunction<CFunctionType217>>

typealias PFNGLDEBUGMESSAGECALLBACKARBPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKARBPROC>
typealias PFNGLDEBUGMESSAGECALLBACKARBPROC = CPointer<CFunction<CFunctionType218>>

typealias PFNGLGETDEBUGMESSAGELOGARBPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGARBPROC>
typealias PFNGLGETDEBUGMESSAGELOGARBPROC = CPointer<CFunction<CFunctionType219>>

typealias PFNGLDRAWBUFFERSARBPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSARBPROC>
typealias PFNGLDRAWBUFFERSARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLBLENDEQUATIONIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONIARBPROC>
typealias PFNGLBLENDEQUATIONIARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBLENDEQUATIONSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEIARBPROC>
typealias PFNGLBLENDEQUATIONSEPARATEIARBPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBLENDFUNCIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCIARBPROC>
typealias PFNGLBLENDFUNCIARBPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBLENDFUNCSEPARATEIARBPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEIARBPROC>
typealias PFNGLBLENDFUNCSEPARATEIARBPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLDRAWARRAYSINSTANCEDARBPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDARBPROC>
typealias PFNGLDRAWARRAYSINSTANCEDARBPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLDRAWELEMENTSINSTANCEDARBPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDARBPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDARBPROC = CPointer<CFunction<CFunctionType130>>

typealias PFNGLPROGRAMSTRINGARBPROCVar = CPointerVarOf<PFNGLPROGRAMSTRINGARBPROC>
typealias PFNGLPROGRAMSTRINGARBPROC = CPointer<CFunction<CFunctionType274>>

typealias PFNGLBINDPROGRAMARBPROCVar = CPointerVarOf<PFNGLBINDPROGRAMARBPROC>
typealias PFNGLBINDPROGRAMARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEPROGRAMSARBPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMSARBPROC>
typealias PFNGLDELETEPROGRAMSARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENPROGRAMSARBPROCVar = CPointerVarOf<PFNGLGENPROGRAMSARBPROC>
typealias PFNGLGENPROGRAMSARBPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLPROGRAMENVPARAMETER4DARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4DARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4DARBPROC = CPointer<CFunction<CFunctionType275>>

typealias PFNGLPROGRAMENVPARAMETER4DVARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4DVARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4DVARBPROC = CPointer<CFunction<CFunctionType276>>

typealias PFNGLPROGRAMENVPARAMETER4FARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4FARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4FARBPROC = CPointer<CFunction<CFunctionType277>>

typealias PFNGLPROGRAMENVPARAMETER4FVARBPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETER4FVARBPROC>
typealias PFNGLPROGRAMENVPARAMETER4FVARBPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLPROGRAMLOCALPARAMETER4DARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4DARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4DARBPROC = CPointer<CFunction<CFunctionType275>>

typealias PFNGLPROGRAMLOCALPARAMETER4DVARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4DVARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4DVARBPROC = CPointer<CFunction<CFunctionType276>>

typealias PFNGLPROGRAMLOCALPARAMETER4FARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4FARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4FARBPROC = CPointer<CFunction<CFunctionType277>>

typealias PFNGLPROGRAMLOCALPARAMETER4FVARBPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETER4FVARBPROC>
typealias PFNGLPROGRAMLOCALPARAMETER4FVARBPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGETPROGRAMENVPARAMETERDVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERDVARBPROC>
typealias PFNGLGETPROGRAMENVPARAMETERDVARBPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETPROGRAMENVPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERFVARBPROC>
typealias PFNGLGETPROGRAMENVPARAMETERFVARBPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETPROGRAMLOCALPARAMETERDVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERDVARBPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERDVARBPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETPROGRAMLOCALPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETPROGRAMIVARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVARBPROC>
typealias PFNGLGETPROGRAMIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPROGRAMSTRINGARBPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTRINGARBPROC>
typealias PFNGLGETPROGRAMSTRINGARBPROC = CPointer<CFunction<CFunctionType278>>

typealias PFNGLISPROGRAMARBPROCVar = CPointerVarOf<PFNGLISPROGRAMARBPROC>
typealias PFNGLISPROGRAMARBPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLPROGRAMPARAMETERIARBPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIARBPROC>
typealias PFNGLPROGRAMPARAMETERIARBPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLFRAMEBUFFERTEXTUREARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREARBPROC>
typealias PFNGLFRAMEBUFFERTEXTUREARBPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLFRAMEBUFFERTEXTURELAYERARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYERARBPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYERARBPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLFRAMEBUFFERTEXTUREFACEARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREFACEARBPROC>
typealias PFNGLFRAMEBUFFERTEXTUREFACEARBPROC = CPointer<CFunction<CFunctionType279>>

typealias PFNGLUNIFORM1I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM1I64ARBPROC>
typealias PFNGLUNIFORM1I64ARBPROC = CPointer<CFunction<CFunctionType280>>

typealias PFNGLUNIFORM2I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM2I64ARBPROC>
typealias PFNGLUNIFORM2I64ARBPROC = CPointer<CFunction<CFunctionType281>>

typealias PFNGLUNIFORM3I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM3I64ARBPROC>
typealias PFNGLUNIFORM3I64ARBPROC = CPointer<CFunction<CFunctionType282>>

typealias PFNGLUNIFORM4I64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM4I64ARBPROC>
typealias PFNGLUNIFORM4I64ARBPROC = CPointer<CFunction<CFunctionType283>>

typealias PFNGLUNIFORM1I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM1I64VARBPROC>
typealias PFNGLUNIFORM1I64VARBPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM2I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM2I64VARBPROC>
typealias PFNGLUNIFORM2I64VARBPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM3I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM3I64VARBPROC>
typealias PFNGLUNIFORM3I64VARBPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM4I64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM4I64VARBPROC>
typealias PFNGLUNIFORM4I64VARBPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM1UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64ARBPROC>
typealias PFNGLUNIFORM1UI64ARBPROC = CPointer<CFunction<CFunctionType265>>

typealias PFNGLUNIFORM2UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64ARBPROC>
typealias PFNGLUNIFORM2UI64ARBPROC = CPointer<CFunction<CFunctionType285>>

typealias PFNGLUNIFORM3UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64ARBPROC>
typealias PFNGLUNIFORM3UI64ARBPROC = CPointer<CFunction<CFunctionType286>>

typealias PFNGLUNIFORM4UI64ARBPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64ARBPROC>
typealias PFNGLUNIFORM4UI64ARBPROC = CPointer<CFunction<CFunctionType287>>

typealias PFNGLUNIFORM1UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64VARBPROC>
typealias PFNGLUNIFORM1UI64VARBPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM2UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64VARBPROC>
typealias PFNGLUNIFORM2UI64VARBPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM3UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64VARBPROC>
typealias PFNGLUNIFORM3UI64VARBPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM4UI64VARBPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64VARBPROC>
typealias PFNGLUNIFORM4UI64VARBPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLGETUNIFORMI64VARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMI64VARBPROC>
typealias PFNGLGETUNIFORMI64VARBPROC = CPointer<CFunction<CFunctionType288>>

typealias PFNGLGETUNIFORMUI64VARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMUI64VARBPROC>
typealias PFNGLGETUNIFORMUI64VARBPROC = CPointer<CFunction<CFunctionType289>>

typealias PFNGLGETNUNIFORMI64VARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMI64VARBPROC>
typealias PFNGLGETNUNIFORMI64VARBPROC = CPointer<CFunction<CFunctionType290>>

typealias PFNGLGETNUNIFORMUI64VARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUI64VARBPROC>
typealias PFNGLGETNUNIFORMUI64VARBPROC = CPointer<CFunction<CFunctionType291>>

typealias PFNGLPROGRAMUNIFORM1I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM1I64ARBPROC = CPointer<CFunction<CFunctionType292>>

typealias PFNGLPROGRAMUNIFORM2I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM2I64ARBPROC = CPointer<CFunction<CFunctionType293>>

typealias PFNGLPROGRAMUNIFORM3I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM3I64ARBPROC = CPointer<CFunction<CFunctionType294>>

typealias PFNGLPROGRAMUNIFORM4I64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64ARBPROC>
typealias PFNGLPROGRAMUNIFORM4I64ARBPROC = CPointer<CFunction<CFunctionType295>>

typealias PFNGLPROGRAMUNIFORM1I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM1I64VARBPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM2I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM2I64VARBPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM3I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM3I64VARBPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM4I64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64VARBPROC>
typealias PFNGLPROGRAMUNIFORM4I64VARBPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM1UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM1UI64ARBPROC = CPointer<CFunction<CFunctionType267>>

typealias PFNGLPROGRAMUNIFORM2UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM2UI64ARBPROC = CPointer<CFunction<CFunctionType297>>

typealias PFNGLPROGRAMUNIFORM3UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM3UI64ARBPROC = CPointer<CFunction<CFunctionType298>>

typealias PFNGLPROGRAMUNIFORM4UI64ARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64ARBPROC>
typealias PFNGLPROGRAMUNIFORM4UI64ARBPROC = CPointer<CFunction<CFunctionType299>>

typealias PFNGLPROGRAMUNIFORM1UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM1UI64VARBPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM2UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM2UI64VARBPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM3UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM3UI64VARBPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM4UI64VARBPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64VARBPROC>
typealias PFNGLPROGRAMUNIFORM4UI64VARBPROC = CPointer<CFunction<CFunctionType268>>

typealias GLhalfARBVar = ShortVarOf<GLhalfARB>
typealias GLhalfARB = Short

typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTCOUNTARBPROC = CPointer<CFunction<CFunctionType300>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC = CPointer<CFunction<CFunctionType301>>

typealias PFNGLVERTEXATTRIBDIVISORARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBDIVISORARBPROC>
typealias PFNGLVERTEXATTRIBDIVISORARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCURRENTPALETTEMATRIXARBPROCVar = CPointerVarOf<PFNGLCURRENTPALETTEMATRIXARBPROC>
typealias PFNGLCURRENTPALETTEMATRIXARBPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLMATRIXINDEXUBVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUBVARBPROC>
typealias PFNGLMATRIXINDEXUBVARBPROC = CPointer<CFunction<CFunctionType303>>

typealias PFNGLMATRIXINDEXUSVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUSVARBPROC>
typealias PFNGLMATRIXINDEXUSVARBPROC = CPointer<CFunction<CFunctionType304>>

typealias PFNGLMATRIXINDEXUIVARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXUIVARBPROC>
typealias PFNGLMATRIXINDEXUIVARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLMATRIXINDEXPOINTERARBPROCVar = CPointerVarOf<PFNGLMATRIXINDEXPOINTERARBPROC>
typealias PFNGLMATRIXINDEXPOINTERARBPROC = CPointer<CFunction<CFunctionType57>>

typealias PFNGLSAMPLECOVERAGEARBPROCVar = CPointerVarOf<PFNGLSAMPLECOVERAGEARBPROC>
typealias PFNGLSAMPLECOVERAGEARBPROC = CPointer<CFunction<CFunctionType7>>

typealias PFNGLGENQUERIESARBPROCVar = CPointerVarOf<PFNGLGENQUERIESARBPROC>
typealias PFNGLGENQUERIESARBPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETEQUERIESARBPROCVar = CPointerVarOf<PFNGLDELETEQUERIESARBPROC>
typealias PFNGLDELETEQUERIESARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISQUERYARBPROCVar = CPointerVarOf<PFNGLISQUERYARBPROC>
typealias PFNGLISQUERYARBPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBEGINQUERYARBPROCVar = CPointerVarOf<PFNGLBEGINQUERYARBPROC>
typealias PFNGLBEGINQUERYARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENDQUERYARBPROCVar = CPointerVarOf<PFNGLENDQUERYARBPROC>
typealias PFNGLENDQUERYARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETQUERYIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYIVARBPROC>
typealias PFNGLGETQUERYIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETQUERYOBJECTIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTIVARBPROC>
typealias PFNGLGETQUERYOBJECTIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETQUERYOBJECTUIVARBPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUIVARBPROC>
typealias PFNGLGETQUERYOBJECTUIVARBPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLMAXSHADERCOMPILERTHREADSARBPROCVar = CPointerVarOf<PFNGLMAXSHADERCOMPILERTHREADSARBPROC>
typealias PFNGLMAXSHADERCOMPILERTHREADSARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPOINTPARAMETERFARBPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFARBPROC>
typealias PFNGLPOINTPARAMETERFARBPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLPOINTPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVARBPROC>
typealias PFNGLPOINTPARAMETERFVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLGETGRAPHICSRESETSTATUSARBPROCVar = CPointerVarOf<PFNGLGETGRAPHICSRESETSTATUSARBPROC>
typealias PFNGLGETGRAPHICSRESETSTATUSARBPROC = CPointer<CFunction<CFunctionType76>>

typealias PFNGLGETNTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETNTEXIMAGEARBPROC>
typealias PFNGLGETNTEXIMAGEARBPROC = CPointer<CFunction<CFunctionType235>>

typealias PFNGLREADNPIXELSARBPROCVar = CPointerVarOf<PFNGLREADNPIXELSARBPROC>
typealias PFNGLREADNPIXELSARBPROC = CPointer<CFunction<CFunctionType250>>

typealias PFNGLGETNCOMPRESSEDTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETNCOMPRESSEDTEXIMAGEARBPROC>
typealias PFNGLGETNCOMPRESSEDTEXIMAGEARBPROC = CPointer<CFunction<CFunctionType236>>

typealias PFNGLGETNUNIFORMFVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMFVARBPROC>
typealias PFNGLGETNUNIFORMFVARBPROC = CPointer<CFunction<CFunctionType247>>

typealias PFNGLGETNUNIFORMIVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMIVARBPROC>
typealias PFNGLGETNUNIFORMIVARBPROC = CPointer<CFunction<CFunctionType248>>

typealias PFNGLGETNUNIFORMUIVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMUIVARBPROC>
typealias PFNGLGETNUNIFORMUIVARBPROC = CPointer<CFunction<CFunctionType249>>

typealias PFNGLGETNUNIFORMDVARBPROCVar = CPointerVarOf<PFNGLGETNUNIFORMDVARBPROC>
typealias PFNGLGETNUNIFORMDVARBPROC = CPointer<CFunction<CFunctionType246>>

typealias PFNGLGETNMAPDVARBPROCVar = CPointerVarOf<PFNGLGETNMAPDVARBPROC>
typealias PFNGLGETNMAPDVARBPROC = CPointer<CFunction<CFunctionType251>>

typealias PFNGLGETNMAPFVARBPROCVar = CPointerVarOf<PFNGLGETNMAPFVARBPROC>
typealias PFNGLGETNMAPFVARBPROC = CPointer<CFunction<CFunctionType252>>

typealias PFNGLGETNMAPIVARBPROCVar = CPointerVarOf<PFNGLGETNMAPIVARBPROC>
typealias PFNGLGETNMAPIVARBPROC = CPointer<CFunction<CFunctionType253>>

typealias PFNGLGETNPIXELMAPFVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPFVARBPROC>
typealias PFNGLGETNPIXELMAPFVARBPROC = CPointer<CFunction<CFunctionType82>>

typealias PFNGLGETNPIXELMAPUIVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUIVARBPROC>
typealias PFNGLGETNPIXELMAPUIVARBPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLGETNPIXELMAPUSVARBPROCVar = CPointerVarOf<PFNGLGETNPIXELMAPUSVARBPROC>
typealias PFNGLGETNPIXELMAPUSVARBPROC = CPointer<CFunction<CFunctionType254>>

typealias PFNGLGETNPOLYGONSTIPPLEARBPROCVar = CPointerVarOf<PFNGLGETNPOLYGONSTIPPLEARBPROC>
typealias PFNGLGETNPOLYGONSTIPPLEARBPROC = CPointer<CFunction<CFunctionType255>>

typealias PFNGLGETNCOLORTABLEARBPROCVar = CPointerVarOf<PFNGLGETNCOLORTABLEARBPROC>
typealias PFNGLGETNCOLORTABLEARBPROC = CPointer<CFunction<CFunctionType256>>

typealias PFNGLGETNCONVOLUTIONFILTERARBPROCVar = CPointerVarOf<PFNGLGETNCONVOLUTIONFILTERARBPROC>
typealias PFNGLGETNCONVOLUTIONFILTERARBPROC = CPointer<CFunction<CFunctionType256>>

typealias PFNGLGETNSEPARABLEFILTERARBPROCVar = CPointerVarOf<PFNGLGETNSEPARABLEFILTERARBPROC>
typealias PFNGLGETNSEPARABLEFILTERARBPROC = CPointer<CFunction<CFunctionType257>>

typealias PFNGLGETNHISTOGRAMARBPROCVar = CPointerVarOf<PFNGLGETNHISTOGRAMARBPROC>
typealias PFNGLGETNHISTOGRAMARBPROC = CPointer<CFunction<CFunctionType258>>

typealias PFNGLGETNMINMAXARBPROCVar = CPointerVarOf<PFNGLGETNMINMAXARBPROC>
typealias PFNGLGETNMINMAXARBPROC = CPointer<CFunction<CFunctionType258>>

typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC>
typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC>
typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLEVALUATEDEPTHVALUESARBPROCVar = CPointerVarOf<PFNGLEVALUATEDEPTHVALUESARBPROC>
typealias PFNGLEVALUATEDEPTHVALUESARBPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLMINSAMPLESHADINGARBPROCVar = CPointerVarOf<PFNGLMINSAMPLESHADINGARBPROC>
typealias PFNGLMINSAMPLESHADINGARBPROC = CPointer<CFunction<CFunctionType38>>

typealias GLhandleARBVar = IntVarOf<GLhandleARB>
typealias GLhandleARB = Int

typealias GLcharARBVar = ByteVarOf<GLcharARB>
typealias GLcharARB = Byte

typealias PFNGLDELETEOBJECTARBPROCVar = CPointerVarOf<PFNGLDELETEOBJECTARBPROC>
typealias PFNGLDELETEOBJECTARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETHANDLEARBPROCVar = CPointerVarOf<PFNGLGETHANDLEARBPROC>
typealias PFNGLGETHANDLEARBPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLDETACHOBJECTARBPROCVar = CPointerVarOf<PFNGLDETACHOBJECTARBPROC>
typealias PFNGLDETACHOBJECTARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCREATESHADEROBJECTARBPROCVar = CPointerVarOf<PFNGLCREATESHADEROBJECTARBPROC>
typealias PFNGLCREATESHADEROBJECTARBPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLSHADERSOURCEARBPROCVar = CPointerVarOf<PFNGLSHADERSOURCEARBPROC>
typealias PFNGLSHADERSOURCEARBPROC = CPointer<CFunction<CFunctionType305>>

typealias PFNGLCOMPILESHADERARBPROCVar = CPointerVarOf<PFNGLCOMPILESHADERARBPROC>
typealias PFNGLCOMPILESHADERARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCREATEPROGRAMOBJECTARBPROCVar = CPointerVarOf<PFNGLCREATEPROGRAMOBJECTARBPROC>
typealias PFNGLCREATEPROGRAMOBJECTARBPROC = CPointer<CFunction<CFunctionType76>>

typealias PFNGLATTACHOBJECTARBPROCVar = CPointerVarOf<PFNGLATTACHOBJECTARBPROC>
typealias PFNGLATTACHOBJECTARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLLINKPROGRAMARBPROCVar = CPointerVarOf<PFNGLLINKPROGRAMARBPROC>
typealias PFNGLLINKPROGRAMARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLUSEPROGRAMOBJECTARBPROCVar = CPointerVarOf<PFNGLUSEPROGRAMOBJECTARBPROC>
typealias PFNGLUSEPROGRAMOBJECTARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLVALIDATEPROGRAMARBPROCVar = CPointerVarOf<PFNGLVALIDATEPROGRAMARBPROC>
typealias PFNGLVALIDATEPROGRAMARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLUNIFORM1FARBPROCVar = CPointerVarOf<PFNGLUNIFORM1FARBPROC>
typealias PFNGLUNIFORM1FARBPROC = CPointer<CFunction<CFunctionType87>>

typealias PFNGLUNIFORM2FARBPROCVar = CPointerVarOf<PFNGLUNIFORM2FARBPROC>
typealias PFNGLUNIFORM2FARBPROC = CPointer<CFunction<CFunctionType88>>

typealias PFNGLUNIFORM3FARBPROCVar = CPointerVarOf<PFNGLUNIFORM3FARBPROC>
typealias PFNGLUNIFORM3FARBPROC = CPointer<CFunction<CFunctionType89>>

typealias PFNGLUNIFORM4FARBPROCVar = CPointerVarOf<PFNGLUNIFORM4FARBPROC>
typealias PFNGLUNIFORM4FARBPROC = CPointer<CFunction<CFunctionType90>>

typealias PFNGLUNIFORM1IARBPROCVar = CPointerVarOf<PFNGLUNIFORM1IARBPROC>
typealias PFNGLUNIFORM1IARBPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLUNIFORM2IARBPROCVar = CPointerVarOf<PFNGLUNIFORM2IARBPROC>
typealias PFNGLUNIFORM2IARBPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLUNIFORM3IARBPROCVar = CPointerVarOf<PFNGLUNIFORM3IARBPROC>
typealias PFNGLUNIFORM3IARBPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLUNIFORM4IARBPROCVar = CPointerVarOf<PFNGLUNIFORM4IARBPROC>
typealias PFNGLUNIFORM4IARBPROC = CPointer<CFunction<CFunctionType92>>

typealias PFNGLUNIFORM1FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM1FVARBPROC>
typealias PFNGLUNIFORM1FVARBPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM2FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM2FVARBPROC>
typealias PFNGLUNIFORM2FVARBPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM3FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM3FVARBPROC>
typealias PFNGLUNIFORM3FVARBPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM4FVARBPROCVar = CPointerVarOf<PFNGLUNIFORM4FVARBPROC>
typealias PFNGLUNIFORM4FVARBPROC = CPointer<CFunction<CFunctionType93>>

typealias PFNGLUNIFORM1IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM1IVARBPROC>
typealias PFNGLUNIFORM1IVARBPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM2IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM2IVARBPROC>
typealias PFNGLUNIFORM2IVARBPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM3IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM3IVARBPROC>
typealias PFNGLUNIFORM3IVARBPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORM4IVARBPROCVar = CPointerVarOf<PFNGLUNIFORM4IVARBPROC>
typealias PFNGLUNIFORM4IVARBPROC = CPointer<CFunction<CFunctionType94>>

typealias PFNGLUNIFORMMATRIX2FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX2FVARBPROC>
typealias PFNGLUNIFORMMATRIX2FVARBPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX3FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX3FVARBPROC>
typealias PFNGLUNIFORMMATRIX3FVARBPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLUNIFORMMATRIX4FVARBPROCVar = CPointerVarOf<PFNGLUNIFORMMATRIX4FVARBPROC>
typealias PFNGLUNIFORMMATRIX4FVARBPROC = CPointer<CFunction<CFunctionType95>>

typealias PFNGLGETOBJECTPARAMETERFVARBPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERFVARBPROC>
typealias PFNGLGETOBJECTPARAMETERFVARBPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETOBJECTPARAMETERIVARBPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERIVARBPROC>
typealias PFNGLGETOBJECTPARAMETERIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETINFOLOGARBPROCVar = CPointerVarOf<PFNGLGETINFOLOGARBPROC>
typealias PFNGLGETINFOLOGARBPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLGETATTACHEDOBJECTSARBPROCVar = CPointerVarOf<PFNGLGETATTACHEDOBJECTSARBPROC>
typealias PFNGLGETATTACHEDOBJECTSARBPROC = CPointer<CFunction<CFunctionType79>>

typealias PFNGLGETUNIFORMLOCATIONARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMLOCATIONARBPROC>
typealias PFNGLGETUNIFORMLOCATIONARBPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLGETACTIVEUNIFORMARBPROCVar = CPointerVarOf<PFNGLGETACTIVEUNIFORMARBPROC>
typealias PFNGLGETACTIVEUNIFORMARBPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLGETUNIFORMFVARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMFVARBPROC>
typealias PFNGLGETUNIFORMFVARBPROC = CPointer<CFunction<CFunctionType82>>

typealias PFNGLGETUNIFORMIVARBPROCVar = CPointerVarOf<PFNGLGETUNIFORMIVARBPROC>
typealias PFNGLGETUNIFORMIVARBPROC = CPointer<CFunction<CFunctionType83>>

typealias PFNGLGETSHADERSOURCEARBPROCVar = CPointerVarOf<PFNGLGETSHADERSOURCEARBPROC>
typealias PFNGLGETSHADERSOURCEARBPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLNAMEDSTRINGARBPROC>
typealias PFNGLNAMEDSTRINGARBPROC = CPointer<CFunction<CFunctionType306>>

typealias PFNGLDELETENAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLDELETENAMEDSTRINGARBPROC>
typealias PFNGLDELETENAMEDSTRINGARBPROC = CPointer<CFunction<CFunctionType307>>

typealias PFNGLCOMPILESHADERINCLUDEARBPROCVar = CPointerVarOf<PFNGLCOMPILESHADERINCLUDEARBPROC>
typealias PFNGLCOMPILESHADERINCLUDEARBPROC = CPointer<CFunction<CFunctionType86>>

typealias PFNGLISNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLISNAMEDSTRINGARBPROC>
typealias PFNGLISNAMEDSTRINGARBPROC = CPointer<CFunction<CFunctionType308>>

typealias PFNGLGETNAMEDSTRINGARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGARBPROC>
typealias PFNGLGETNAMEDSTRINGARBPROC = CPointer<CFunction<CFunctionType309>>

typealias PFNGLGETNAMEDSTRINGIVARBPROCVar = CPointerVarOf<PFNGLGETNAMEDSTRINGIVARBPROC>
typealias PFNGLGETNAMEDSTRINGIVARBPROC = CPointer<CFunction<CFunctionType310>>

typealias PFNGLBUFFERPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLBUFFERPAGECOMMITMENTARBPROC>
typealias PFNGLBUFFERPAGECOMMITMENTARBPROC = CPointer<CFunction<CFunctionType311>>

typealias PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROC>
typealias PFNGLNAMEDBUFFERPAGECOMMITMENTEXTPROC = CPointer<CFunction<CFunctionType311>>

typealias PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC>
typealias PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC = CPointer<CFunction<CFunctionType311>>

typealias PFNGLTEXPAGECOMMITMENTARBPROCVar = CPointerVarOf<PFNGLTEXPAGECOMMITMENTARBPROC>
typealias PFNGLTEXPAGECOMMITMENTARBPROC = CPointer<CFunction<CFunctionType312>>

typealias PFNGLTEXBUFFERARBPROCVar = CPointerVarOf<PFNGLTEXBUFFERARBPROC>
typealias PFNGLTEXBUFFERARBPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLCOMPRESSEDTEXIMAGE3DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE3DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE3DARBPROC = CPointer<CFunction<CFunctionType8>>

typealias PFNGLCOMPRESSEDTEXIMAGE2DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE2DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE2DARBPROC = CPointer<CFunction<CFunctionType9>>

typealias PFNGLCOMPRESSEDTEXIMAGE1DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXIMAGE1DARBPROC>
typealias PFNGLCOMPRESSEDTEXIMAGE1DARBPROC = CPointer<CFunction<CFunctionType10>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC = CPointer<CFunction<CFunctionType11>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC = CPointer<CFunction<CFunctionType12>>

typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC>
typealias PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC = CPointer<CFunction<CFunctionType13>>

typealias PFNGLGETCOMPRESSEDTEXIMAGEARBPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXIMAGEARBPROC>
typealias PFNGLGETCOMPRESSEDTEXIMAGEARBPROC = CPointer<CFunction<CFunctionType14>>

typealias PFNGLLOADTRANSPOSEMATRIXFARBPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXFARBPROC>
typealias PFNGLLOADTRANSPOSEMATRIXFARBPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLLOADTRANSPOSEMATRIXDARBPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXDARBPROC>
typealias PFNGLLOADTRANSPOSEMATRIXDARBPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLMULTTRANSPOSEMATRIXFARBPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXFARBPROC>
typealias PFNGLMULTTRANSPOSEMATRIXFARBPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLMULTTRANSPOSEMATRIXDARBPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXDARBPROC>
typealias PFNGLMULTTRANSPOSEMATRIXDARBPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWEIGHTBVARBPROCVar = CPointerVarOf<PFNGLWEIGHTBVARBPROC>
typealias PFNGLWEIGHTBVARBPROC = CPointer<CFunction<CFunctionType313>>

typealias PFNGLWEIGHTSVARBPROCVar = CPointerVarOf<PFNGLWEIGHTSVARBPROC>
typealias PFNGLWEIGHTSVARBPROC = CPointer<CFunction<CFunctionType314>>

typealias PFNGLWEIGHTIVARBPROCVar = CPointerVarOf<PFNGLWEIGHTIVARBPROC>
typealias PFNGLWEIGHTIVARBPROC = CPointer<CFunction<CFunctionType315>>

typealias PFNGLWEIGHTFVARBPROCVar = CPointerVarOf<PFNGLWEIGHTFVARBPROC>
typealias PFNGLWEIGHTFVARBPROC = CPointer<CFunction<CFunctionType316>>

typealias PFNGLWEIGHTDVARBPROCVar = CPointerVarOf<PFNGLWEIGHTDVARBPROC>
typealias PFNGLWEIGHTDVARBPROC = CPointer<CFunction<CFunctionType317>>

typealias PFNGLWEIGHTUBVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUBVARBPROC>
typealias PFNGLWEIGHTUBVARBPROC = CPointer<CFunction<CFunctionType303>>

typealias PFNGLWEIGHTUSVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUSVARBPROC>
typealias PFNGLWEIGHTUSVARBPROC = CPointer<CFunction<CFunctionType304>>

typealias PFNGLWEIGHTUIVARBPROCVar = CPointerVarOf<PFNGLWEIGHTUIVARBPROC>
typealias PFNGLWEIGHTUIVARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLWEIGHTPOINTERARBPROCVar = CPointerVarOf<PFNGLWEIGHTPOINTERARBPROC>
typealias PFNGLWEIGHTPOINTERARBPROC = CPointer<CFunction<CFunctionType57>>

typealias PFNGLVERTEXBLENDARBPROCVar = CPointerVarOf<PFNGLVERTEXBLENDARBPROC>
typealias PFNGLVERTEXBLENDARBPROC = CPointer<CFunction<CFunctionType302>>

typealias GLsizeiptrARBVar = LongVarOf<GLsizeiptrARB>
typealias GLsizeiptrARB = ptrdiff_t

typealias GLintptrARBVar = LongVarOf<GLintptrARB>
typealias GLintptrARB = ptrdiff_t

typealias PFNGLBINDBUFFERARBPROCVar = CPointerVarOf<PFNGLBINDBUFFERARBPROC>
typealias PFNGLBINDBUFFERARBPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEBUFFERSARBPROCVar = CPointerVarOf<PFNGLDELETEBUFFERSARBPROC>
typealias PFNGLDELETEBUFFERSARBPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENBUFFERSARBPROCVar = CPointerVarOf<PFNGLGENBUFFERSARBPROC>
typealias PFNGLGENBUFFERSARBPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISBUFFERARBPROCVar = CPointerVarOf<PFNGLISBUFFERARBPROC>
typealias PFNGLISBUFFERARBPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBUFFERDATAARBPROCVar = CPointerVarOf<PFNGLBUFFERDATAARBPROC>
typealias PFNGLBUFFERDATAARBPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLBUFFERSUBDATAARBPROCVar = CPointerVarOf<PFNGLBUFFERSUBDATAARBPROC>
typealias PFNGLBUFFERSUBDATAARBPROC = CPointer<CFunction<CFunctionType70>>

typealias PFNGLGETBUFFERSUBDATAARBPROCVar = CPointerVarOf<PFNGLGETBUFFERSUBDATAARBPROC>
typealias PFNGLGETBUFFERSUBDATAARBPROC = CPointer<CFunction<CFunctionType71>>

typealias PFNGLMAPBUFFERARBPROCVar = CPointerVarOf<PFNGLMAPBUFFERARBPROC>
typealias PFNGLMAPBUFFERARBPROC = CPointer<CFunction<CFunctionType72>>

typealias PFNGLUNMAPBUFFERARBPROCVar = CPointerVarOf<PFNGLUNMAPBUFFERARBPROC>
typealias PFNGLUNMAPBUFFERARBPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETBUFFERPARAMETERIVARBPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERIVARBPROC>
typealias PFNGLGETBUFFERPARAMETERIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETBUFFERPOINTERVARBPROCVar = CPointerVarOf<PFNGLGETBUFFERPOINTERVARBPROC>
typealias PFNGLGETBUFFERPOINTERVARBPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLVERTEXATTRIB1DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DARBPROC>
typealias PFNGLVERTEXATTRIB1DARBPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXATTRIB1DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVARBPROC>
typealias PFNGLVERTEXATTRIB1DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB1FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FARBPROC>
typealias PFNGLVERTEXATTRIB1FARBPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLVERTEXATTRIB1FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVARBPROC>
typealias PFNGLVERTEXATTRIB1FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB1SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SARBPROC>
typealias PFNGLVERTEXATTRIB1SARBPROC = CPointer<CFunction<CFunctionType21>>

typealias PFNGLVERTEXATTRIB1SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVARBPROC>
typealias PFNGLVERTEXATTRIB1SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB2DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DARBPROC>
typealias PFNGLVERTEXATTRIB2DARBPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXATTRIB2DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVARBPROC>
typealias PFNGLVERTEXATTRIB2DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB2FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FARBPROC>
typealias PFNGLVERTEXATTRIB2FARBPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLVERTEXATTRIB2FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVARBPROC>
typealias PFNGLVERTEXATTRIB2FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB2SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SARBPROC>
typealias PFNGLVERTEXATTRIB2SARBPROC = CPointer<CFunction<CFunctionType26>>

typealias PFNGLVERTEXATTRIB2SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVARBPROC>
typealias PFNGLVERTEXATTRIB2SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB3DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DARBPROC>
typealias PFNGLVERTEXATTRIB3DARBPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXATTRIB3DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVARBPROC>
typealias PFNGLVERTEXATTRIB3DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB3FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FARBPROC>
typealias PFNGLVERTEXATTRIB3FARBPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLVERTEXATTRIB3FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVARBPROC>
typealias PFNGLVERTEXATTRIB3FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB3SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SARBPROC>
typealias PFNGLVERTEXATTRIB3SARBPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLVERTEXATTRIB3SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVARBPROC>
typealias PFNGLVERTEXATTRIB3SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4NBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NBVARBPROC>
typealias PFNGLVERTEXATTRIB4NBVARBPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIB4NIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NIVARBPROC>
typealias PFNGLVERTEXATTRIB4NIVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIB4NSVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NSVARBPROC>
typealias PFNGLVERTEXATTRIB4NSVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4NUBARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBARBPROC>
typealias PFNGLVERTEXATTRIB4NUBARBPROC = CPointer<CFunction<CFunctionType97>>

typealias PFNGLVERTEXATTRIB4NUBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUBVARBPROC>
typealias PFNGLVERTEXATTRIB4NUBVARBPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIB4NUIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUIVARBPROC>
typealias PFNGLVERTEXATTRIB4NUIVARBPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIB4NUSVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4NUSVARBPROC>
typealias PFNGLVERTEXATTRIB4NUSVARBPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIB4BVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4BVARBPROC>
typealias PFNGLVERTEXATTRIB4BVARBPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIB4DARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DARBPROC>
typealias PFNGLVERTEXATTRIB4DARBPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXATTRIB4DVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVARBPROC>
typealias PFNGLVERTEXATTRIB4DVARBPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB4FARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FARBPROC>
typealias PFNGLVERTEXATTRIB4FARBPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLVERTEXATTRIB4FVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVARBPROC>
typealias PFNGLVERTEXATTRIB4FVARBPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB4IVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4IVARBPROC>
typealias PFNGLVERTEXATTRIB4IVARBPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIB4SARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SARBPROC>
typealias PFNGLVERTEXATTRIB4SARBPROC = CPointer<CFunction<CFunctionType34>>

typealias PFNGLVERTEXATTRIB4SVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVARBPROC>
typealias PFNGLVERTEXATTRIB4SVARBPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4UBVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVARBPROC>
typealias PFNGLVERTEXATTRIB4UBVARBPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIB4UIVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UIVARBPROC>
typealias PFNGLVERTEXATTRIB4UIVARBPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIB4USVARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4USVARBPROC>
typealias PFNGLVERTEXATTRIB4USVARBPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIBPOINTERARBPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERARBPROC>
typealias PFNGLVERTEXATTRIBPOINTERARBPROC = CPointer<CFunction<CFunctionType101>>

typealias PFNGLENABLEVERTEXATTRIBARRAYARBPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBARRAYARBPROC>
typealias PFNGLENABLEVERTEXATTRIBARRAYARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDISABLEVERTEXATTRIBARRAYARBPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBARRAYARBPROC>
typealias PFNGLDISABLEVERTEXATTRIBARRAYARBPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETVERTEXATTRIBDVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVARBPROC>
typealias PFNGLGETVERTEXATTRIBDVARBPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETVERTEXATTRIBFVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVARBPROC>
typealias PFNGLGETVERTEXATTRIBFVARBPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVERTEXATTRIBIVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVARBPROC>
typealias PFNGLGETVERTEXATTRIBIVARBPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXATTRIBPOINTERVARBPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVARBPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVARBPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLBINDATTRIBLOCATIONARBPROCVar = CPointerVarOf<PFNGLBINDATTRIBLOCATIONARBPROC>
typealias PFNGLBINDATTRIBLOCATIONARBPROC = CPointer<CFunction<CFunctionType75>>

typealias PFNGLGETACTIVEATTRIBARBPROCVar = CPointerVarOf<PFNGLGETACTIVEATTRIBARBPROC>
typealias PFNGLGETACTIVEATTRIBARBPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLGETATTRIBLOCATIONARBPROCVar = CPointerVarOf<PFNGLGETATTRIBLOCATIONARBPROC>
typealias PFNGLGETATTRIBLOCATIONARBPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLWINDOWPOS2DARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DARBPROC>
typealias PFNGLWINDOWPOS2DARBPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLWINDOWPOS2DVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVARBPROC>
typealias PFNGLWINDOWPOS2DVARBPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS2FARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FARBPROC>
typealias PFNGLWINDOWPOS2FARBPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLWINDOWPOS2FVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVARBPROC>
typealias PFNGLWINDOWPOS2FVARBPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS2IARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IARBPROC>
typealias PFNGLWINDOWPOS2IARBPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLWINDOWPOS2IVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVARBPROC>
typealias PFNGLWINDOWPOS2IVARBPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS2SARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SARBPROC>
typealias PFNGLWINDOWPOS2SARBPROC = CPointer<CFunction<CFunctionType61>>

typealias PFNGLWINDOWPOS2SVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVARBPROC>
typealias PFNGLWINDOWPOS2SVARBPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLWINDOWPOS3DARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DARBPROC>
typealias PFNGLWINDOWPOS3DARBPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLWINDOWPOS3DVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVARBPROC>
typealias PFNGLWINDOWPOS3DVARBPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS3FARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FARBPROC>
typealias PFNGLWINDOWPOS3FARBPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLWINDOWPOS3FVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVARBPROC>
typealias PFNGLWINDOWPOS3FVARBPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS3IARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IARBPROC>
typealias PFNGLWINDOWPOS3IARBPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLWINDOWPOS3IVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVARBPROC>
typealias PFNGLWINDOWPOS3IVARBPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS3SARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SARBPROC>
typealias PFNGLWINDOWPOS3SARBPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLWINDOWPOS3SVARBPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVARBPROC>
typealias PFNGLWINDOWPOS3SVARBPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLBLENDBARRIERKHRPROCVar = CPointerVarOf<PFNGLBLENDBARRIERKHRPROC>
typealias PFNGLBLENDBARRIERKHRPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLMULTITEXCOORD1BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1BOESPROC>
typealias PFNGLMULTITEXCOORD1BOESPROC = CPointer<CFunction<CFunctionType318>>

typealias PFNGLMULTITEXCOORD1BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1BVOESPROC>
typealias PFNGLMULTITEXCOORD1BVOESPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLMULTITEXCOORD2BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2BOESPROC>
typealias PFNGLMULTITEXCOORD2BOESPROC = CPointer<CFunction<CFunctionType319>>

typealias PFNGLMULTITEXCOORD2BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2BVOESPROC>
typealias PFNGLMULTITEXCOORD2BVOESPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLMULTITEXCOORD3BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3BOESPROC>
typealias PFNGLMULTITEXCOORD3BOESPROC = CPointer<CFunction<CFunctionType320>>

typealias PFNGLMULTITEXCOORD3BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3BVOESPROC>
typealias PFNGLMULTITEXCOORD3BVOESPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLMULTITEXCOORD4BOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4BOESPROC>
typealias PFNGLMULTITEXCOORD4BOESPROC = CPointer<CFunction<CFunctionType321>>

typealias PFNGLMULTITEXCOORD4BVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4BVOESPROC>
typealias PFNGLMULTITEXCOORD4BVOESPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLTEXCOORD1BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1BOESPROC>
typealias PFNGLTEXCOORD1BOESPROC = CPointer<CFunction<CFunctionType322>>

typealias PFNGLTEXCOORD1BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1BVOESPROC>
typealias PFNGLTEXCOORD1BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLTEXCOORD2BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2BOESPROC>
typealias PFNGLTEXCOORD2BOESPROC = CPointer<CFunction<CFunctionType323>>

typealias PFNGLTEXCOORD2BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2BVOESPROC>
typealias PFNGLTEXCOORD2BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLTEXCOORD3BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3BOESPROC>
typealias PFNGLTEXCOORD3BOESPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLTEXCOORD3BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3BVOESPROC>
typealias PFNGLTEXCOORD3BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLTEXCOORD4BOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4BOESPROC>
typealias PFNGLTEXCOORD4BOESPROC = CPointer<CFunction<CFunctionType324>>

typealias PFNGLTEXCOORD4BVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4BVOESPROC>
typealias PFNGLTEXCOORD4BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLVERTEX2BOESPROCVar = CPointerVarOf<PFNGLVERTEX2BOESPROC>
typealias PFNGLVERTEX2BOESPROC = CPointer<CFunction<CFunctionType323>>

typealias PFNGLVERTEX2BVOESPROCVar = CPointerVarOf<PFNGLVERTEX2BVOESPROC>
typealias PFNGLVERTEX2BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLVERTEX3BOESPROCVar = CPointerVarOf<PFNGLVERTEX3BOESPROC>
typealias PFNGLVERTEX3BOESPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLVERTEX3BVOESPROCVar = CPointerVarOf<PFNGLVERTEX3BVOESPROC>
typealias PFNGLVERTEX3BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLVERTEX4BOESPROCVar = CPointerVarOf<PFNGLVERTEX4BOESPROC>
typealias PFNGLVERTEX4BOESPROC = CPointer<CFunction<CFunctionType324>>

typealias PFNGLVERTEX4BVOESPROCVar = CPointerVarOf<PFNGLVERTEX4BVOESPROC>
typealias PFNGLVERTEX4BVOESPROC = CPointer<CFunction<CFunctionType44>>

typealias GLfixedVar = IntVarOf<GLfixed>
typealias GLfixed = GLint

typealias PFNGLALPHAFUNCXOESPROCVar = CPointerVarOf<PFNGLALPHAFUNCXOESPROC>
typealias PFNGLALPHAFUNCXOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLCLEARCOLORXOESPROCVar = CPointerVarOf<PFNGLCLEARCOLORXOESPROC>
typealias PFNGLCLEARCOLORXOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLCLEARDEPTHXOESPROCVar = CPointerVarOf<PFNGLCLEARDEPTHXOESPROC>
typealias PFNGLCLEARDEPTHXOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLCLIPPLANEXOESPROCVar = CPointerVarOf<PFNGLCLIPPLANEXOESPROC>
typealias PFNGLCLIPPLANEXOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLCOLOR4XOESPROCVar = CPointerVarOf<PFNGLCOLOR4XOESPROC>
typealias PFNGLCOLOR4XOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLDEPTHRANGEXOESPROCVar = CPointerVarOf<PFNGLDEPTHRANGEXOESPROC>
typealias PFNGLDEPTHRANGEXOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLFOGXOESPROCVar = CPointerVarOf<PFNGLFOGXOESPROC>
typealias PFNGLFOGXOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLFOGXVOESPROCVar = CPointerVarOf<PFNGLFOGXVOESPROC>
typealias PFNGLFOGXVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLFRUSTUMXOESPROCVar = CPointerVarOf<PFNGLFRUSTUMXOESPROC>
typealias PFNGLFRUSTUMXOESPROC = CPointer<CFunction<CFunctionType325>>

typealias PFNGLGETCLIPPLANEXOESPROCVar = CPointerVarOf<PFNGLGETCLIPPLANEXOESPROC>
typealias PFNGLGETCLIPPLANEXOESPROC = CPointer<CFunction<CFunctionType326>>

typealias PFNGLGETFIXEDVOESPROCVar = CPointerVarOf<PFNGLGETFIXEDVOESPROC>
typealias PFNGLGETFIXEDVOESPROC = CPointer<CFunction<CFunctionType326>>

typealias PFNGLGETTEXENVXVOESPROCVar = CPointerVarOf<PFNGLGETTEXENVXVOESPROC>
typealias PFNGLGETTEXENVXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTEXPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERXVOESPROC>
typealias PFNGLGETTEXPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLLIGHTMODELXOESPROCVar = CPointerVarOf<PFNGLLIGHTMODELXOESPROC>
typealias PFNGLLIGHTMODELXOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLLIGHTMODELXVOESPROCVar = CPointerVarOf<PFNGLLIGHTMODELXVOESPROC>
typealias PFNGLLIGHTMODELXVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLLIGHTXOESPROCVar = CPointerVarOf<PFNGLLIGHTXOESPROC>
typealias PFNGLLIGHTXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLLIGHTXVOESPROCVar = CPointerVarOf<PFNGLLIGHTXVOESPROC>
typealias PFNGLLIGHTXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLLINEWIDTHXOESPROCVar = CPointerVarOf<PFNGLLINEWIDTHXOESPROC>
typealias PFNGLLINEWIDTHXOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLLOADMATRIXXOESPROCVar = CPointerVarOf<PFNGLLOADMATRIXXOESPROC>
typealias PFNGLLOADMATRIXXOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLMATERIALXOESPROCVar = CPointerVarOf<PFNGLMATERIALXOESPROC>
typealias PFNGLMATERIALXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLMATERIALXVOESPROCVar = CPointerVarOf<PFNGLMATERIALXVOESPROC>
typealias PFNGLMATERIALXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLMULTMATRIXXOESPROCVar = CPointerVarOf<PFNGLMULTMATRIXXOESPROC>
typealias PFNGLMULTMATRIXXOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLMULTITEXCOORD4XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4XOESPROC>
typealias PFNGLMULTITEXCOORD4XOESPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLNORMAL3XOESPROCVar = CPointerVarOf<PFNGLNORMAL3XOESPROC>
typealias PFNGLNORMAL3XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLORTHOXOESPROCVar = CPointerVarOf<PFNGLORTHOXOESPROC>
typealias PFNGLORTHOXOESPROC = CPointer<CFunction<CFunctionType325>>

typealias PFNGLPOINTPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERXVOESPROC>
typealias PFNGLPOINTPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLPOINTSIZEXOESPROCVar = CPointerVarOf<PFNGLPOINTSIZEXOESPROC>
typealias PFNGLPOINTSIZEXOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLPOLYGONOFFSETXOESPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETXOESPROC>
typealias PFNGLPOLYGONOFFSETXOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLROTATEXOESPROCVar = CPointerVarOf<PFNGLROTATEXOESPROC>
typealias PFNGLROTATEXOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLSCALEXOESPROCVar = CPointerVarOf<PFNGLSCALEXOESPROC>
typealias PFNGLSCALEXOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLTEXENVXOESPROCVar = CPointerVarOf<PFNGLTEXENVXOESPROC>
typealias PFNGLTEXENVXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLTEXENVXVOESPROCVar = CPointerVarOf<PFNGLTEXENVXVOESPROC>
typealias PFNGLTEXENVXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLTEXPARAMETERXOESPROCVar = CPointerVarOf<PFNGLTEXPARAMETERXOESPROC>
typealias PFNGLTEXPARAMETERXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLTEXPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLTEXPARAMETERXVOESPROC>
typealias PFNGLTEXPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLTRANSLATEXOESPROCVar = CPointerVarOf<PFNGLTRANSLATEXOESPROC>
typealias PFNGLTRANSLATEXOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLACCUMXOESPROCVar = CPointerVarOf<PFNGLACCUMXOESPROC>
typealias PFNGLACCUMXOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLBITMAPXOESPROCVar = CPointerVarOf<PFNGLBITMAPXOESPROC>
typealias PFNGLBITMAPXOESPROC = CPointer<CFunction<CFunctionType327>>

typealias PFNGLBLENDCOLORXOESPROCVar = CPointerVarOf<PFNGLBLENDCOLORXOESPROC>
typealias PFNGLBLENDCOLORXOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLCLEARACCUMXOESPROCVar = CPointerVarOf<PFNGLCLEARACCUMXOESPROC>
typealias PFNGLCLEARACCUMXOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLCOLOR3XOESPROCVar = CPointerVarOf<PFNGLCOLOR3XOESPROC>
typealias PFNGLCOLOR3XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLCOLOR3XVOESPROCVar = CPointerVarOf<PFNGLCOLOR3XVOESPROC>
typealias PFNGLCOLOR3XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLCOLOR4XVOESPROCVar = CPointerVarOf<PFNGLCOLOR4XVOESPROC>
typealias PFNGLCOLOR4XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLCONVOLUTIONPARAMETERXOESPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERXOESPROC>
typealias PFNGLCONVOLUTIONPARAMETERXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLCONVOLUTIONPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERXVOESPROC>
typealias PFNGLCONVOLUTIONPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLEVALCOORD1XOESPROCVar = CPointerVarOf<PFNGLEVALCOORD1XOESPROC>
typealias PFNGLEVALCOORD1XOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLEVALCOORD1XVOESPROCVar = CPointerVarOf<PFNGLEVALCOORD1XVOESPROC>
typealias PFNGLEVALCOORD1XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLEVALCOORD2XOESPROCVar = CPointerVarOf<PFNGLEVALCOORD2XOESPROC>
typealias PFNGLEVALCOORD2XOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLEVALCOORD2XVOESPROCVar = CPointerVarOf<PFNGLEVALCOORD2XVOESPROC>
typealias PFNGLEVALCOORD2XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLFEEDBACKBUFFERXOESPROCVar = CPointerVarOf<PFNGLFEEDBACKBUFFERXOESPROC>
typealias PFNGLFEEDBACKBUFFERXOESPROC = CPointer<CFunction<CFunctionType328>>

typealias PFNGLGETCONVOLUTIONPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERXVOESPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETHISTOGRAMPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERXVOESPROC>
typealias PFNGLGETHISTOGRAMPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETLIGHTXOESPROCVar = CPointerVarOf<PFNGLGETLIGHTXOESPROC>
typealias PFNGLGETLIGHTXOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETMAPXVOESPROCVar = CPointerVarOf<PFNGLGETMAPXVOESPROC>
typealias PFNGLGETMAPXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETMATERIALXOESPROCVar = CPointerVarOf<PFNGLGETMATERIALXOESPROC>
typealias PFNGLGETMATERIALXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLGETPIXELMAPXVPROCVar = CPointerVarOf<PFNGLGETPIXELMAPXVPROC>
typealias PFNGLGETPIXELMAPXVPROC = CPointer<CFunction<CFunctionType83>>

typealias PFNGLGETTEXGENXVOESPROCVar = CPointerVarOf<PFNGLGETTEXGENXVOESPROC>
typealias PFNGLGETTEXGENXVOESPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTEXLEVELPARAMETERXVOESPROCVar = CPointerVarOf<PFNGLGETTEXLEVELPARAMETERXVOESPROC>
typealias PFNGLGETTEXLEVELPARAMETERXVOESPROC = CPointer<CFunction<CFunctionType238>>

typealias PFNGLINDEXXOESPROCVar = CPointerVarOf<PFNGLINDEXXOESPROC>
typealias PFNGLINDEXXOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLINDEXXVOESPROCVar = CPointerVarOf<PFNGLINDEXXVOESPROC>
typealias PFNGLINDEXXVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLLOADTRANSPOSEMATRIXXOESPROCVar = CPointerVarOf<PFNGLLOADTRANSPOSEMATRIXXOESPROC>
typealias PFNGLLOADTRANSPOSEMATRIXXOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLMAP1XOESPROCVar = CPointerVarOf<PFNGLMAP1XOESPROC>
typealias PFNGLMAP1XOESPROC = CPointer<CFunction<CFunctionType188>>

typealias PFNGLMAP2XOESPROCVar = CPointerVarOf<PFNGLMAP2XOESPROC>
typealias PFNGLMAP2XOESPROC = CPointer<CFunction<CFunctionType329>>

typealias PFNGLMAPGRID1XOESPROCVar = CPointerVarOf<PFNGLMAPGRID1XOESPROC>
typealias PFNGLMAPGRID1XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLMAPGRID2XOESPROCVar = CPointerVarOf<PFNGLMAPGRID2XOESPROC>
typealias PFNGLMAPGRID2XOESPROC = CPointer<CFunction<CFunctionType92>>

typealias PFNGLMULTTRANSPOSEMATRIXXOESPROCVar = CPointerVarOf<PFNGLMULTTRANSPOSEMATRIXXOESPROC>
typealias PFNGLMULTTRANSPOSEMATRIXXOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLMULTITEXCOORD1XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1XOESPROC>
typealias PFNGLMULTITEXCOORD1XOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLMULTITEXCOORD1XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1XVOESPROC>
typealias PFNGLMULTITEXCOORD1XVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD2XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2XOESPROC>
typealias PFNGLMULTITEXCOORD2XOESPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLMULTITEXCOORD2XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2XVOESPROC>
typealias PFNGLMULTITEXCOORD2XVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD3XOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3XOESPROC>
typealias PFNGLMULTITEXCOORD3XOESPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLMULTITEXCOORD3XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3XVOESPROC>
typealias PFNGLMULTITEXCOORD3XVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLMULTITEXCOORD4XVOESPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4XVOESPROC>
typealias PFNGLMULTITEXCOORD4XVOESPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLNORMAL3XVOESPROCVar = CPointerVarOf<PFNGLNORMAL3XVOESPROC>
typealias PFNGLNORMAL3XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLPASSTHROUGHXOESPROCVar = CPointerVarOf<PFNGLPASSTHROUGHXOESPROC>
typealias PFNGLPASSTHROUGHXOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLPIXELMAPXPROCVar = CPointerVarOf<PFNGLPIXELMAPXPROC>
typealias PFNGLPIXELMAPXPROC = CPointer<CFunction<CFunctionType116>>

typealias PFNGLPIXELSTOREXPROCVar = CPointerVarOf<PFNGLPIXELSTOREXPROC>
typealias PFNGLPIXELSTOREXPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPIXELTRANSFERXOESPROCVar = CPointerVarOf<PFNGLPIXELTRANSFERXOESPROC>
typealias PFNGLPIXELTRANSFERXOESPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPIXELZOOMXOESPROCVar = CPointerVarOf<PFNGLPIXELZOOMXOESPROC>
typealias PFNGLPIXELZOOMXOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLPRIORITIZETEXTURESXOESPROCVar = CPointerVarOf<PFNGLPRIORITIZETEXTURESXOESPROC>
typealias PFNGLPRIORITIZETEXTURESXOESPROC = CPointer<CFunction<CFunctionType330>>

typealias PFNGLRASTERPOS2XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS2XOESPROC>
typealias PFNGLRASTERPOS2XOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLRASTERPOS2XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS2XVOESPROC>
typealias PFNGLRASTERPOS2XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLRASTERPOS3XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS3XOESPROC>
typealias PFNGLRASTERPOS3XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLRASTERPOS3XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS3XVOESPROC>
typealias PFNGLRASTERPOS3XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLRASTERPOS4XOESPROCVar = CPointerVarOf<PFNGLRASTERPOS4XOESPROC>
typealias PFNGLRASTERPOS4XOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLRASTERPOS4XVOESPROCVar = CPointerVarOf<PFNGLRASTERPOS4XVOESPROC>
typealias PFNGLRASTERPOS4XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLRECTXOESPROCVar = CPointerVarOf<PFNGLRECTXOESPROC>
typealias PFNGLRECTXOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLRECTXVOESPROCVar = CPointerVarOf<PFNGLRECTXVOESPROC>
typealias PFNGLRECTXVOESPROC = CPointer<CFunction<CFunctionType331>>

typealias PFNGLTEXCOORD1XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1XOESPROC>
typealias PFNGLTEXCOORD1XOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLTEXCOORD1XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD1XVOESPROC>
typealias PFNGLTEXCOORD1XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLTEXCOORD2XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2XOESPROC>
typealias PFNGLTEXCOORD2XOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLTEXCOORD2XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD2XVOESPROC>
typealias PFNGLTEXCOORD2XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLTEXCOORD3XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3XOESPROC>
typealias PFNGLTEXCOORD3XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLTEXCOORD3XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD3XVOESPROC>
typealias PFNGLTEXCOORD3XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLTEXCOORD4XOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4XOESPROC>
typealias PFNGLTEXCOORD4XOESPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLTEXCOORD4XVOESPROCVar = CPointerVarOf<PFNGLTEXCOORD4XVOESPROC>
typealias PFNGLTEXCOORD4XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLTEXGENXOESPROCVar = CPointerVarOf<PFNGLTEXGENXOESPROC>
typealias PFNGLTEXGENXOESPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLTEXGENXVOESPROCVar = CPointerVarOf<PFNGLTEXGENXVOESPROC>
typealias PFNGLTEXGENXVOESPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLVERTEX2XOESPROCVar = CPointerVarOf<PFNGLVERTEX2XOESPROC>
typealias PFNGLVERTEX2XOESPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLVERTEX2XVOESPROCVar = CPointerVarOf<PFNGLVERTEX2XVOESPROC>
typealias PFNGLVERTEX2XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLVERTEX3XOESPROCVar = CPointerVarOf<PFNGLVERTEX3XOESPROC>
typealias PFNGLVERTEX3XOESPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLVERTEX3XVOESPROCVar = CPointerVarOf<PFNGLVERTEX3XVOESPROC>
typealias PFNGLVERTEX3XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLVERTEX4XOESPROCVar = CPointerVarOf<PFNGLVERTEX4XOESPROC>
typealias PFNGLVERTEX4XOESPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLVERTEX4XVOESPROCVar = CPointerVarOf<PFNGLVERTEX4XVOESPROC>
typealias PFNGLVERTEX4XVOESPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLQUERYMATRIXXOESPROCVar = CPointerVarOf<PFNGLQUERYMATRIXXOESPROC>
typealias PFNGLQUERYMATRIXXOESPROC = CPointer<CFunction<CFunctionType332>>

typealias PFNGLCLEARDEPTHFOESPROCVar = CPointerVarOf<PFNGLCLEARDEPTHFOESPROC>
typealias PFNGLCLEARDEPTHFOESPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLCLIPPLANEFOESPROCVar = CPointerVarOf<PFNGLCLIPPLANEFOESPROC>
typealias PFNGLCLIPPLANEFOESPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLDEPTHRANGEFOESPROCVar = CPointerVarOf<PFNGLDEPTHRANGEFOESPROC>
typealias PFNGLDEPTHRANGEFOESPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLFRUSTUMFOESPROCVar = CPointerVarOf<PFNGLFRUSTUMFOESPROC>
typealias PFNGLFRUSTUMFOESPROC = CPointer<CFunction<CFunctionType333>>

typealias PFNGLGETCLIPPLANEFOESPROCVar = CPointerVarOf<PFNGLGETCLIPPLANEFOESPROC>
typealias PFNGLGETCLIPPLANEFOESPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLORTHOFOESPROCVar = CPointerVarOf<PFNGLORTHOFOESPROC>
typealias PFNGLORTHOFOESPROC = CPointer<CFunction<CFunctionType333>>

typealias PFNGLTBUFFERMASK3DFXPROCVar = CPointerVarOf<PFNGLTBUFFERMASK3DFXPROC>
typealias PFNGLTBUFFERMASK3DFXPROC = CPointer<CFunction<CFunctionType6>>

typealias GLDEBUGPROCAMDVar = CPointerVarOf<GLDEBUGPROCAMD>
typealias GLDEBUGPROCAMD = CPointer<CFunction<CFunctionType335>>

typealias PFNGLDEBUGMESSAGEENABLEAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEENABLEAMDPROC>
typealias PFNGLDEBUGMESSAGEENABLEAMDPROC = CPointer<CFunction<CFunctionType336>>

typealias PFNGLDEBUGMESSAGEINSERTAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGEINSERTAMDPROC>
typealias PFNGLDEBUGMESSAGEINSERTAMDPROC = CPointer<CFunction<CFunctionType337>>

typealias PFNGLDEBUGMESSAGECALLBACKAMDPROCVar = CPointerVarOf<PFNGLDEBUGMESSAGECALLBACKAMDPROC>
typealias PFNGLDEBUGMESSAGECALLBACKAMDPROC = CPointer<CFunction<CFunctionType338>>

typealias PFNGLGETDEBUGMESSAGELOGAMDPROCVar = CPointerVarOf<PFNGLGETDEBUGMESSAGELOGAMDPROC>
typealias PFNGLGETDEBUGMESSAGELOGAMDPROC = CPointer<CFunction<CFunctionType339>>

typealias PFNGLBLENDFUNCINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDFUNCINDEXEDAMDPROC>
typealias PFNGLBLENDFUNCINDEXEDAMDPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC>
typealias PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLBLENDEQUATIONINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONINDEXEDAMDPROC>
typealias PFNGLBLENDEQUATIONINDEXEDAMDPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC>
typealias PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC = CPointer<CFunction<CFunctionType53>>

typealias GLint64EXTVar = LongVarOf<GLint64EXT>
typealias GLint64EXT = int64_t

typealias PFNGLUNIFORM1I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM1I64NVPROC>
typealias PFNGLUNIFORM1I64NVPROC = CPointer<CFunction<CFunctionType280>>

typealias PFNGLUNIFORM2I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM2I64NVPROC>
typealias PFNGLUNIFORM2I64NVPROC = CPointer<CFunction<CFunctionType281>>

typealias PFNGLUNIFORM3I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM3I64NVPROC>
typealias PFNGLUNIFORM3I64NVPROC = CPointer<CFunction<CFunctionType282>>

typealias PFNGLUNIFORM4I64NVPROCVar = CPointerVarOf<PFNGLUNIFORM4I64NVPROC>
typealias PFNGLUNIFORM4I64NVPROC = CPointer<CFunction<CFunctionType283>>

typealias PFNGLUNIFORM1I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM1I64VNVPROC>
typealias PFNGLUNIFORM1I64VNVPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM2I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM2I64VNVPROC>
typealias PFNGLUNIFORM2I64VNVPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM3I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM3I64VNVPROC>
typealias PFNGLUNIFORM3I64VNVPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM4I64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM4I64VNVPROC>
typealias PFNGLUNIFORM4I64VNVPROC = CPointer<CFunction<CFunctionType284>>

typealias PFNGLUNIFORM1UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64NVPROC>
typealias PFNGLUNIFORM1UI64NVPROC = CPointer<CFunction<CFunctionType265>>

typealias PFNGLUNIFORM2UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64NVPROC>
typealias PFNGLUNIFORM2UI64NVPROC = CPointer<CFunction<CFunctionType285>>

typealias PFNGLUNIFORM3UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64NVPROC>
typealias PFNGLUNIFORM3UI64NVPROC = CPointer<CFunction<CFunctionType286>>

typealias PFNGLUNIFORM4UI64NVPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64NVPROC>
typealias PFNGLUNIFORM4UI64NVPROC = CPointer<CFunction<CFunctionType287>>

typealias PFNGLUNIFORM1UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM1UI64VNVPROC>
typealias PFNGLUNIFORM1UI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM2UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM2UI64VNVPROC>
typealias PFNGLUNIFORM2UI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM3UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM3UI64VNVPROC>
typealias PFNGLUNIFORM3UI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLUNIFORM4UI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORM4UI64VNVPROC>
typealias PFNGLUNIFORM4UI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLGETUNIFORMI64VNVPROCVar = CPointerVarOf<PFNGLGETUNIFORMI64VNVPROC>
typealias PFNGLGETUNIFORMI64VNVPROC = CPointer<CFunction<CFunctionType288>>

typealias PFNGLGETUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLGETUNIFORMUI64VNVPROC>
typealias PFNGLGETUNIFORMUI64VNVPROC = CPointer<CFunction<CFunctionType289>>

typealias PFNGLPROGRAMUNIFORM1I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64NVPROC>
typealias PFNGLPROGRAMUNIFORM1I64NVPROC = CPointer<CFunction<CFunctionType292>>

typealias PFNGLPROGRAMUNIFORM2I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64NVPROC>
typealias PFNGLPROGRAMUNIFORM2I64NVPROC = CPointer<CFunction<CFunctionType293>>

typealias PFNGLPROGRAMUNIFORM3I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64NVPROC>
typealias PFNGLPROGRAMUNIFORM3I64NVPROC = CPointer<CFunction<CFunctionType294>>

typealias PFNGLPROGRAMUNIFORM4I64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64NVPROC>
typealias PFNGLPROGRAMUNIFORM4I64NVPROC = CPointer<CFunction<CFunctionType295>>

typealias PFNGLPROGRAMUNIFORM1I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM1I64VNVPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM2I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM2I64VNVPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM3I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM3I64VNVPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM4I64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4I64VNVPROC>
typealias PFNGLPROGRAMUNIFORM4I64VNVPROC = CPointer<CFunction<CFunctionType296>>

typealias PFNGLPROGRAMUNIFORM1UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM1UI64NVPROC = CPointer<CFunction<CFunctionType267>>

typealias PFNGLPROGRAMUNIFORM2UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM2UI64NVPROC = CPointer<CFunction<CFunctionType297>>

typealias PFNGLPROGRAMUNIFORM3UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM3UI64NVPROC = CPointer<CFunction<CFunctionType298>>

typealias PFNGLPROGRAMUNIFORM4UI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64NVPROC>
typealias PFNGLPROGRAMUNIFORM4UI64NVPROC = CPointer<CFunction<CFunctionType299>>

typealias PFNGLPROGRAMUNIFORM1UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM1UI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM2UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM2UI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM3UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM3UI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLPROGRAMUNIFORM4UI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UI64VNVPROC>
typealias PFNGLPROGRAMUNIFORM4UI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLVERTEXATTRIBPARAMETERIAMDPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPARAMETERIAMDPROC>
typealias PFNGLVERTEXATTRIBPARAMETERIAMDPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTAMDPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTAMDPROC = CPointer<CFunction<CFunctionType210>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC = CPointer<CFunction<CFunctionType211>>

typealias PFNGLGENNAMESAMDPROCVar = CPointerVarOf<PFNGLGENNAMESAMDPROC>
typealias PFNGLGENNAMESAMDPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLDELETENAMESAMDPROCVar = CPointerVarOf<PFNGLDELETENAMESAMDPROC>
typealias PFNGLDELETENAMESAMDPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLISNAMEAMDPROCVar = CPointerVarOf<PFNGLISNAMEAMDPROC>
typealias PFNGLISNAMEAMDPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLQUERYOBJECTPARAMETERUIAMDPROCVar = CPointerVarOf<PFNGLQUERYOBJECTPARAMETERUIAMDPROC>
typealias PFNGLQUERYOBJECTPARAMETERUIAMDPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLGETPERFMONITORGROUPSAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORGROUPSAMDPROC>
typealias PFNGLGETPERFMONITORGROUPSAMDPROC = CPointer<CFunction<CFunctionType340>>

typealias PFNGLGETPERFMONITORCOUNTERSAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERSAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERSAMDPROC = CPointer<CFunction<CFunctionType341>>

typealias PFNGLGETPERFMONITORGROUPSTRINGAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORGROUPSTRINGAMDPROC>
typealias PFNGLGETPERFMONITORGROUPSTRINGAMDPROC = CPointer<CFunction<CFunctionType81>>

typealias PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERSTRINGAMDPROC = CPointer<CFunction<CFunctionType134>>

typealias PFNGLGETPERFMONITORCOUNTERINFOAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERINFOAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERINFOAMDPROC = CPointer<CFunction<CFunctionType342>>

typealias PFNGLGENPERFMONITORSAMDPROCVar = CPointerVarOf<PFNGLGENPERFMONITORSAMDPROC>
typealias PFNGLGENPERFMONITORSAMDPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETEPERFMONITORSAMDPROCVar = CPointerVarOf<PFNGLDELETEPERFMONITORSAMDPROC>
typealias PFNGLDELETEPERFMONITORSAMDPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLSELECTPERFMONITORCOUNTERSAMDPROCVar = CPointerVarOf<PFNGLSELECTPERFMONITORCOUNTERSAMDPROC>
typealias PFNGLSELECTPERFMONITORCOUNTERSAMDPROC = CPointer<CFunction<CFunctionType343>>

typealias PFNGLBEGINPERFMONITORAMDPROCVar = CPointerVarOf<PFNGLBEGINPERFMONITORAMDPROC>
typealias PFNGLBEGINPERFMONITORAMDPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDPERFMONITORAMDPROCVar = CPointerVarOf<PFNGLENDPERFMONITORAMDPROC>
typealias PFNGLENDPERFMONITORAMDPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETPERFMONITORCOUNTERDATAAMDPROCVar = CPointerVarOf<PFNGLGETPERFMONITORCOUNTERDATAAMDPROC>
typealias PFNGLGETPERFMONITORCOUNTERDATAAMDPROC = CPointer<CFunction<CFunctionType344>>

typealias PFNGLSETMULTISAMPLEFVAMDPROCVar = CPointerVarOf<PFNGLSETMULTISAMPLEFVAMDPROC>
typealias PFNGLSETMULTISAMPLEFVAMDPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLTEXSTORAGESPARSEAMDPROCVar = CPointerVarOf<PFNGLTEXSTORAGESPARSEAMDPROC>
typealias PFNGLTEXSTORAGESPARSEAMDPROC = CPointer<CFunction<CFunctionType345>>

typealias PFNGLTEXTURESTORAGESPARSEAMDPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGESPARSEAMDPROC>
typealias PFNGLTEXTURESTORAGESPARSEAMDPROC = CPointer<CFunction<CFunctionType346>>

typealias PFNGLSTENCILOPVALUEAMDPROCVar = CPointerVarOf<PFNGLSTENCILOPVALUEAMDPROC>
typealias PFNGLSTENCILOPVALUEAMDPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTESSELLATIONFACTORAMDPROCVar = CPointerVarOf<PFNGLTESSELLATIONFACTORAMDPROC>
typealias PFNGLTESSELLATIONFACTORAMDPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLTESSELLATIONMODEAMDPROCVar = CPointerVarOf<PFNGLTESSELLATIONMODEAMDPROC>
typealias PFNGLTESSELLATIONMODEAMDPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLELEMENTPOINTERAPPLEPROCVar = CPointerVarOf<PFNGLELEMENTPOINTERAPPLEPROC>
typealias PFNGLELEMENTPOINTERAPPLEPROC = CPointer<CFunction<CFunctionType157>>

typealias PFNGLDRAWELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLDRAWELEMENTARRAYAPPLEPROC>
typealias PFNGLDRAWELEMENTARRAYAPPLEPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLDRAWRANGEELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTARRAYAPPLEPROC>
typealias PFNGLDRAWRANGEELEMENTARRAYAPPLEPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLMULTIDRAWELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTARRAYAPPLEPROC>
typealias PFNGLMULTIDRAWELEMENTARRAYAPPLEPROC = CPointer<CFunction<CFunctionType36>>

typealias PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROCVar = CPointerVarOf<PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC>
typealias PFNGLMULTIDRAWRANGEELEMENTARRAYAPPLEPROC = CPointer<CFunction<CFunctionType347>>

typealias PFNGLGENFENCESAPPLEPROCVar = CPointerVarOf<PFNGLGENFENCESAPPLEPROC>
typealias PFNGLGENFENCESAPPLEPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETEFENCESAPPLEPROCVar = CPointerVarOf<PFNGLDELETEFENCESAPPLEPROC>
typealias PFNGLDELETEFENCESAPPLEPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLSETFENCEAPPLEPROCVar = CPointerVarOf<PFNGLSETFENCEAPPLEPROC>
typealias PFNGLSETFENCEAPPLEPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLISFENCEAPPLEPROCVar = CPointerVarOf<PFNGLISFENCEAPPLEPROC>
typealias PFNGLISFENCEAPPLEPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLTESTFENCEAPPLEPROCVar = CPointerVarOf<PFNGLTESTFENCEAPPLEPROC>
typealias PFNGLTESTFENCEAPPLEPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLFINISHFENCEAPPLEPROCVar = CPointerVarOf<PFNGLFINISHFENCEAPPLEPROC>
typealias PFNGLFINISHFENCEAPPLEPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTESTOBJECTAPPLEPROCVar = CPointerVarOf<PFNGLTESTOBJECTAPPLEPROC>
typealias PFNGLTESTOBJECTAPPLEPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLFINISHOBJECTAPPLEPROCVar = CPointerVarOf<PFNGLFINISHOBJECTAPPLEPROC>
typealias PFNGLFINISHOBJECTAPPLEPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLBUFFERPARAMETERIAPPLEPROCVar = CPointerVarOf<PFNGLBUFFERPARAMETERIAPPLEPROC>
typealias PFNGLBUFFERPARAMETERIAPPLEPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC>
typealias PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLOBJECTPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTPURGEABLEAPPLEPROC = CPointer<CFunction<CFunctionType348>>

typealias PFNGLOBJECTUNPURGEABLEAPPLEPROCVar = CPointerVarOf<PFNGLOBJECTUNPURGEABLEAPPLEPROC>
typealias PFNGLOBJECTUNPURGEABLEAPPLEPROC = CPointer<CFunction<CFunctionType348>>

typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROCVar = CPointerVarOf<PFNGLGETOBJECTPARAMETERIVAPPLEPROC>
typealias PFNGLGETOBJECTPARAMETERIVAPPLEPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLTEXTURERANGEAPPLEPROCVar = CPointerVarOf<PFNGLTEXTURERANGEAPPLEPROC>
typealias PFNGLTEXTURERANGEAPPLEPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC>
typealias PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLBINDVERTEXARRAYAPPLEPROCVar = CPointerVarOf<PFNGLBINDVERTEXARRAYAPPLEPROC>
typealias PFNGLBINDVERTEXARRAYAPPLEPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDELETEVERTEXARRAYSAPPLEPROCVar = CPointerVarOf<PFNGLDELETEVERTEXARRAYSAPPLEPROC>
typealias PFNGLDELETEVERTEXARRAYSAPPLEPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENVERTEXARRAYSAPPLEPROCVar = CPointerVarOf<PFNGLGENVERTEXARRAYSAPPLEPROC>
typealias PFNGLGENVERTEXARRAYSAPPLEPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISVERTEXARRAYAPPLEPROCVar = CPointerVarOf<PFNGLISVERTEXARRAYAPPLEPROC>
typealias PFNGLISVERTEXARRAYAPPLEPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLVERTEXARRAYRANGEAPPLEPROCVar = CPointerVarOf<PFNGLVERTEXARRAYRANGEAPPLEPROC>
typealias PFNGLVERTEXARRAYRANGEAPPLEPROC = CPointer<CFunction<CFunctionType349>>

typealias PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROCVar = CPointerVarOf<PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROC>
typealias PFNGLFLUSHVERTEXARRAYRANGEAPPLEPROC = CPointer<CFunction<CFunctionType349>>

typealias PFNGLVERTEXARRAYPARAMETERIAPPLEPROCVar = CPointerVarOf<PFNGLVERTEXARRAYPARAMETERIAPPLEPROC>
typealias PFNGLVERTEXARRAYPARAMETERIAPPLEPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLENABLEVERTEXATTRIBAPPLEPROCVar = CPointerVarOf<PFNGLENABLEVERTEXATTRIBAPPLEPROC>
typealias PFNGLENABLEVERTEXATTRIBAPPLEPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEVERTEXATTRIBAPPLEPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXATTRIBAPPLEPROC>
typealias PFNGLDISABLEVERTEXATTRIBAPPLEPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLISVERTEXATTRIBENABLEDAPPLEPROCVar = CPointerVarOf<PFNGLISVERTEXATTRIBENABLEDAPPLEPROC>
typealias PFNGLISVERTEXATTRIBENABLEDAPPLEPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLMAPVERTEXATTRIB1DAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB1DAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB1DAPPLEPROC = CPointer<CFunction<CFunctionType350>>

typealias PFNGLMAPVERTEXATTRIB1FAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB1FAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB1FAPPLEPROC = CPointer<CFunction<CFunctionType351>>

typealias PFNGLMAPVERTEXATTRIB2DAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB2DAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB2DAPPLEPROC = CPointer<CFunction<CFunctionType352>>

typealias PFNGLMAPVERTEXATTRIB2FAPPLEPROCVar = CPointerVarOf<PFNGLMAPVERTEXATTRIB2FAPPLEPROC>
typealias PFNGLMAPVERTEXATTRIB2FAPPLEPROC = CPointer<CFunction<CFunctionType353>>

typealias PFNGLDRAWBUFFERSATIPROCVar = CPointerVarOf<PFNGLDRAWBUFFERSATIPROC>
typealias PFNGLDRAWBUFFERSATIPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLELEMENTPOINTERATIPROCVar = CPointerVarOf<PFNGLELEMENTPOINTERATIPROC>
typealias PFNGLELEMENTPOINTERATIPROC = CPointer<CFunction<CFunctionType157>>

typealias PFNGLDRAWELEMENTARRAYATIPROCVar = CPointerVarOf<PFNGLDRAWELEMENTARRAYATIPROC>
typealias PFNGLDRAWELEMENTARRAYATIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLDRAWRANGEELEMENTARRAYATIPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTARRAYATIPROC>
typealias PFNGLDRAWRANGEELEMENTARRAYATIPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLTEXBUMPPARAMETERIVATIPROCVar = CPointerVarOf<PFNGLTEXBUMPPARAMETERIVATIPROC>
typealias PFNGLTEXBUMPPARAMETERIVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLTEXBUMPPARAMETERFVATIPROCVar = CPointerVarOf<PFNGLTEXBUMPPARAMETERFVATIPROC>
typealias PFNGLTEXBUMPPARAMETERFVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLGETTEXBUMPPARAMETERIVATIPROCVar = CPointerVarOf<PFNGLGETTEXBUMPPARAMETERIVATIPROC>
typealias PFNGLGETTEXBUMPPARAMETERIVATIPROC = CPointer<CFunction<CFunctionType326>>

typealias PFNGLGETTEXBUMPPARAMETERFVATIPROCVar = CPointerVarOf<PFNGLGETTEXBUMPPARAMETERFVATIPROC>
typealias PFNGLGETTEXBUMPPARAMETERFVATIPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLGENFRAGMENTSHADERSATIPROCVar = CPointerVarOf<PFNGLGENFRAGMENTSHADERSATIPROC>
typealias PFNGLGENFRAGMENTSHADERSATIPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLBINDFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLBINDFRAGMENTSHADERATIPROC>
typealias PFNGLBINDFRAGMENTSHADERATIPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDELETEFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLDELETEFRAGMENTSHADERATIPROC>
typealias PFNGLDELETEFRAGMENTSHADERATIPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBEGINFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLBEGINFRAGMENTSHADERATIPROC>
typealias PFNGLBEGINFRAGMENTSHADERATIPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLENDFRAGMENTSHADERATIPROCVar = CPointerVarOf<PFNGLENDFRAGMENTSHADERATIPROC>
typealias PFNGLENDFRAGMENTSHADERATIPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLPASSTEXCOORDATIPROCVar = CPointerVarOf<PFNGLPASSTEXCOORDATIPROC>
typealias PFNGLPASSTEXCOORDATIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLSAMPLEMAPATIPROCVar = CPointerVarOf<PFNGLSAMPLEMAPATIPROC>
typealias PFNGLSAMPLEMAPATIPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLCOLORFRAGMENTOP1ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP1ATIPROC>
typealias PFNGLCOLORFRAGMENTOP1ATIPROC = CPointer<CFunction<CFunctionType354>>

typealias PFNGLCOLORFRAGMENTOP2ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP2ATIPROC>
typealias PFNGLCOLORFRAGMENTOP2ATIPROC = CPointer<CFunction<CFunctionType355>>

typealias PFNGLCOLORFRAGMENTOP3ATIPROCVar = CPointerVarOf<PFNGLCOLORFRAGMENTOP3ATIPROC>
typealias PFNGLCOLORFRAGMENTOP3ATIPROC = CPointer<CFunction<CFunctionType356>>

typealias PFNGLALPHAFRAGMENTOP1ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP1ATIPROC>
typealias PFNGLALPHAFRAGMENTOP1ATIPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLALPHAFRAGMENTOP2ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP2ATIPROC>
typealias PFNGLALPHAFRAGMENTOP2ATIPROC = CPointer<CFunction<CFunctionType357>>

typealias PFNGLALPHAFRAGMENTOP3ATIPROCVar = CPointerVarOf<PFNGLALPHAFRAGMENTOP3ATIPROC>
typealias PFNGLALPHAFRAGMENTOP3ATIPROC = CPointer<CFunction<CFunctionType358>>

typealias PFNGLSETFRAGMENTSHADERCONSTANTATIPROCVar = CPointerVarOf<PFNGLSETFRAGMENTSHADERCONSTANTATIPROC>
typealias PFNGLSETFRAGMENTSHADERCONSTANTATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMAPOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLMAPOBJECTBUFFERATIPROC>
typealias PFNGLMAPOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType359>>

typealias PFNGLUNMAPOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLUNMAPOBJECTBUFFERATIPROC>
typealias PFNGLUNMAPOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPNTRIANGLESIATIPROCVar = CPointerVarOf<PFNGLPNTRIANGLESIATIPROC>
typealias PFNGLPNTRIANGLESIATIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPNTRIANGLESFATIPROCVar = CPointerVarOf<PFNGLPNTRIANGLESFATIPROC>
typealias PFNGLPNTRIANGLESFATIPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLSTENCILOPSEPARATEATIPROCVar = CPointerVarOf<PFNGLSTENCILOPSEPARATEATIPROC>
typealias PFNGLSTENCILOPSEPARATEATIPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLSTENCILFUNCSEPARATEATIPROCVar = CPointerVarOf<PFNGLSTENCILFUNCSEPARATEATIPROC>
typealias PFNGLSTENCILFUNCSEPARATEATIPROC = CPointer<CFunction<CFunctionType74>>

typealias PFNGLNEWOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLNEWOBJECTBUFFERATIPROC>
typealias PFNGLNEWOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType360>>

typealias PFNGLISOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLISOBJECTBUFFERATIPROC>
typealias PFNGLISOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLUPDATEOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLUPDATEOBJECTBUFFERATIPROC>
typealias PFNGLUPDATEOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType361>>

typealias PFNGLGETOBJECTBUFFERFVATIPROCVar = CPointerVarOf<PFNGLGETOBJECTBUFFERFVATIPROC>
typealias PFNGLGETOBJECTBUFFERFVATIPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETOBJECTBUFFERIVATIPROCVar = CPointerVarOf<PFNGLGETOBJECTBUFFERIVATIPROC>
typealias PFNGLGETOBJECTBUFFERIVATIPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLFREEOBJECTBUFFERATIPROCVar = CPointerVarOf<PFNGLFREEOBJECTBUFFERATIPROC>
typealias PFNGLFREEOBJECTBUFFERATIPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLARRAYOBJECTATIPROC>
typealias PFNGLARRAYOBJECTATIPROC = CPointer<CFunction<CFunctionType362>>

typealias PFNGLGETARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETARRAYOBJECTFVATIPROC>
typealias PFNGLGETARRAYOBJECTFVATIPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETARRAYOBJECTIVATIPROC>
typealias PFNGLGETARRAYOBJECTIVATIPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLVARIANTARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLVARIANTARRAYOBJECTATIPROC>
typealias PFNGLVARIANTARRAYOBJECTATIPROC = CPointer<CFunction<CFunctionType242>>

typealias PFNGLGETVARIANTARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETVARIANTARRAYOBJECTFVATIPROC>
typealias PFNGLGETVARIANTARRAYOBJECTFVATIPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVARIANTARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETVARIANTARRAYOBJECTIVATIPROC>
typealias PFNGLGETVARIANTARRAYOBJECTIVATIPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLVERTEXATTRIBARRAYOBJECTATIPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBARRAYOBJECTATIPROC>
typealias PFNGLVERTEXATTRIBARRAYOBJECTATIPROC = CPointer<CFunction<CFunctionType363>>

typealias PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROC>
typealias PFNGLGETVERTEXATTRIBARRAYOBJECTFVATIPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROC>
typealias PFNGLGETVERTEXATTRIBARRAYOBJECTIVATIPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLVERTEXSTREAM1SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1SATIPROC>
typealias PFNGLVERTEXSTREAM1SATIPROC = CPointer<CFunction<CFunctionType21>>

typealias PFNGLVERTEXSTREAM1SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1SVATIPROC>
typealias PFNGLVERTEXSTREAM1SVATIPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXSTREAM1IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1IATIPROC>
typealias PFNGLVERTEXSTREAM1IATIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLVERTEXSTREAM1IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1IVATIPROC>
typealias PFNGLVERTEXSTREAM1IVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXSTREAM1FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1FATIPROC>
typealias PFNGLVERTEXSTREAM1FATIPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLVERTEXSTREAM1FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1FVATIPROC>
typealias PFNGLVERTEXSTREAM1FVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXSTREAM1DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1DATIPROC>
typealias PFNGLVERTEXSTREAM1DATIPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXSTREAM1DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM1DVATIPROC>
typealias PFNGLVERTEXSTREAM1DVATIPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXSTREAM2SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2SATIPROC>
typealias PFNGLVERTEXSTREAM2SATIPROC = CPointer<CFunction<CFunctionType26>>

typealias PFNGLVERTEXSTREAM2SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2SVATIPROC>
typealias PFNGLVERTEXSTREAM2SVATIPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXSTREAM2IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2IATIPROC>
typealias PFNGLVERTEXSTREAM2IATIPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLVERTEXSTREAM2IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2IVATIPROC>
typealias PFNGLVERTEXSTREAM2IVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXSTREAM2FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2FATIPROC>
typealias PFNGLVERTEXSTREAM2FATIPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLVERTEXSTREAM2FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2FVATIPROC>
typealias PFNGLVERTEXSTREAM2FVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXSTREAM2DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2DATIPROC>
typealias PFNGLVERTEXSTREAM2DATIPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXSTREAM2DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM2DVATIPROC>
typealias PFNGLVERTEXSTREAM2DVATIPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXSTREAM3SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3SATIPROC>
typealias PFNGLVERTEXSTREAM3SATIPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLVERTEXSTREAM3SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3SVATIPROC>
typealias PFNGLVERTEXSTREAM3SVATIPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXSTREAM3IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3IATIPROC>
typealias PFNGLVERTEXSTREAM3IATIPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLVERTEXSTREAM3IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3IVATIPROC>
typealias PFNGLVERTEXSTREAM3IVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXSTREAM3FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3FATIPROC>
typealias PFNGLVERTEXSTREAM3FATIPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLVERTEXSTREAM3FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3FVATIPROC>
typealias PFNGLVERTEXSTREAM3FVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXSTREAM3DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3DATIPROC>
typealias PFNGLVERTEXSTREAM3DATIPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXSTREAM3DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM3DVATIPROC>
typealias PFNGLVERTEXSTREAM3DVATIPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXSTREAM4SATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4SATIPROC>
typealias PFNGLVERTEXSTREAM4SATIPROC = CPointer<CFunction<CFunctionType34>>

typealias PFNGLVERTEXSTREAM4SVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4SVATIPROC>
typealias PFNGLVERTEXSTREAM4SVATIPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXSTREAM4IATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4IATIPROC>
typealias PFNGLVERTEXSTREAM4IATIPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLVERTEXSTREAM4IVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4IVATIPROC>
typealias PFNGLVERTEXSTREAM4IVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXSTREAM4FATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4FATIPROC>
typealias PFNGLVERTEXSTREAM4FATIPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLVERTEXSTREAM4FVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4FVATIPROC>
typealias PFNGLVERTEXSTREAM4FVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXSTREAM4DATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4DATIPROC>
typealias PFNGLVERTEXSTREAM4DATIPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXSTREAM4DVATIPROCVar = CPointerVarOf<PFNGLVERTEXSTREAM4DVATIPROC>
typealias PFNGLVERTEXSTREAM4DVATIPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLNORMALSTREAM3BATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3BATIPROC>
typealias PFNGLNORMALSTREAM3BATIPROC = CPointer<CFunction<CFunctionType320>>

typealias PFNGLNORMALSTREAM3BVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3BVATIPROC>
typealias PFNGLNORMALSTREAM3BVATIPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLNORMALSTREAM3SATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3SATIPROC>
typealias PFNGLNORMALSTREAM3SATIPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLNORMALSTREAM3SVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3SVATIPROC>
typealias PFNGLNORMALSTREAM3SVATIPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLNORMALSTREAM3IATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3IATIPROC>
typealias PFNGLNORMALSTREAM3IATIPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLNORMALSTREAM3IVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3IVATIPROC>
typealias PFNGLNORMALSTREAM3IVATIPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLNORMALSTREAM3FATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3FATIPROC>
typealias PFNGLNORMALSTREAM3FATIPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLNORMALSTREAM3FVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3FVATIPROC>
typealias PFNGLNORMALSTREAM3FVATIPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLNORMALSTREAM3DATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3DATIPROC>
typealias PFNGLNORMALSTREAM3DATIPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLNORMALSTREAM3DVATIPROCVar = CPointerVarOf<PFNGLNORMALSTREAM3DVATIPROC>
typealias PFNGLNORMALSTREAM3DVATIPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLCLIENTACTIVEVERTEXSTREAMATIPROCVar = CPointerVarOf<PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC>
typealias PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLVERTEXBLENDENVIATIPROCVar = CPointerVarOf<PFNGLVERTEXBLENDENVIATIPROC>
typealias PFNGLVERTEXBLENDENVIATIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLVERTEXBLENDENVFATIPROCVar = CPointerVarOf<PFNGLVERTEXBLENDENVFATIPROC>
typealias PFNGLVERTEXBLENDENVFATIPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLUNIFORMBUFFEREXTPROCVar = CPointerVarOf<PFNGLUNIFORMBUFFEREXTPROC>
typealias PFNGLUNIFORMBUFFEREXTPROC = CPointer<CFunction<CFunctionType180>>

typealias PFNGLGETUNIFORMBUFFERSIZEEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMBUFFERSIZEEXTPROC>
typealias PFNGLGETUNIFORMBUFFERSIZEEXTPROC = CPointer<CFunction<CFunctionType364>>

typealias PFNGLGETUNIFORMOFFSETEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMOFFSETEXTPROC>
typealias PFNGLGETUNIFORMOFFSETEXTPROC = CPointer<CFunction<CFunctionType365>>

typealias PFNGLBLENDCOLOREXTPROCVar = CPointerVarOf<PFNGLBLENDCOLOREXTPROC>
typealias PFNGLBLENDCOLOREXTPROC = CPointer<CFunction<CFunctionType62>>

typealias PFNGLBLENDEQUATIONSEPARATEEXTPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEEXTPROC>
typealias PFNGLBLENDEQUATIONSEPARATEEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLBLENDFUNCSEPARATEEXTPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEEXTPROC>
typealias PFNGLBLENDFUNCSEPARATEEXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLBLENDEQUATIONEXTPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONEXTPROC>
typealias PFNGLBLENDEQUATIONEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOLORSUBTABLEEXTPROCVar = CPointerVarOf<PFNGLCOLORSUBTABLEEXTPROC>
typealias PFNGLCOLORSUBTABLEEXTPROC = CPointer<CFunction<CFunctionType366>>

typealias PFNGLCOPYCOLORSUBTABLEEXTPROCVar = CPointerVarOf<PFNGLCOPYCOLORSUBTABLEEXTPROC>
typealias PFNGLCOPYCOLORSUBTABLEEXTPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLLOCKARRAYSEXTPROCVar = CPointerVarOf<PFNGLLOCKARRAYSEXTPROC>
typealias PFNGLLOCKARRAYSEXTPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLUNLOCKARRAYSEXTPROCVar = CPointerVarOf<PFNGLUNLOCKARRAYSEXTPROC>
typealias PFNGLUNLOCKARRAYSEXTPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLCONVOLUTIONFILTER1DEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONFILTER1DEXTPROC>
typealias PFNGLCONVOLUTIONFILTER1DEXTPROC = CPointer<CFunction<CFunctionType367>>

typealias PFNGLCONVOLUTIONFILTER2DEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONFILTER2DEXTPROC>
typealias PFNGLCONVOLUTIONFILTER2DEXTPROC = CPointer<CFunction<CFunctionType368>>

typealias PFNGLCONVOLUTIONPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERFEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERFEXTPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLCONVOLUTIONPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERFVEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLCONVOLUTIONPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERIEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLCONVOLUTIONPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLCONVOLUTIONPARAMETERIVEXTPROC>
typealias PFNGLCONVOLUTIONPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLCOPYCONVOLUTIONFILTER1DEXTPROCVar = CPointerVarOf<PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC>
typealias PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC = CPointer<CFunction<CFunctionType369>>

typealias PFNGLCOPYCONVOLUTIONFILTER2DEXTPROCVar = CPointerVarOf<PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC>
typealias PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC = CPointer<CFunction<CFunctionType370>>

typealias PFNGLGETCONVOLUTIONFILTEREXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONFILTEREXTPROC>
typealias PFNGLGETCONVOLUTIONFILTEREXTPROC = CPointer<CFunction<CFunctionType342>>

typealias PFNGLGETCONVOLUTIONPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERFVEXTPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETCONVOLUTIONPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC>
typealias PFNGLGETCONVOLUTIONPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETSEPARABLEFILTEREXTPROCVar = CPointerVarOf<PFNGLGETSEPARABLEFILTEREXTPROC>
typealias PFNGLGETSEPARABLEFILTEREXTPROC = CPointer<CFunction<CFunctionType371>>

typealias PFNGLSEPARABLEFILTER2DEXTPROCVar = CPointerVarOf<PFNGLSEPARABLEFILTER2DEXTPROC>
typealias PFNGLSEPARABLEFILTER2DEXTPROC = CPointer<CFunction<CFunctionType372>>

typealias PFNGLTANGENT3BEXTPROCVar = CPointerVarOf<PFNGLTANGENT3BEXTPROC>
typealias PFNGLTANGENT3BEXTPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLTANGENT3BVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3BVEXTPROC>
typealias PFNGLTANGENT3BVEXTPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLTANGENT3DEXTPROCVar = CPointerVarOf<PFNGLTANGENT3DEXTPROC>
typealias PFNGLTANGENT3DEXTPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLTANGENT3DVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3DVEXTPROC>
typealias PFNGLTANGENT3DVEXTPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLTANGENT3FEXTPROCVar = CPointerVarOf<PFNGLTANGENT3FEXTPROC>
typealias PFNGLTANGENT3FEXTPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLTANGENT3FVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3FVEXTPROC>
typealias PFNGLTANGENT3FVEXTPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLTANGENT3IEXTPROCVar = CPointerVarOf<PFNGLTANGENT3IEXTPROC>
typealias PFNGLTANGENT3IEXTPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLTANGENT3IVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3IVEXTPROC>
typealias PFNGLTANGENT3IVEXTPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLTANGENT3SEXTPROCVar = CPointerVarOf<PFNGLTANGENT3SEXTPROC>
typealias PFNGLTANGENT3SEXTPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLTANGENT3SVEXTPROCVar = CPointerVarOf<PFNGLTANGENT3SVEXTPROC>
typealias PFNGLTANGENT3SVEXTPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLBINORMAL3BEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3BEXTPROC>
typealias PFNGLBINORMAL3BEXTPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLBINORMAL3BVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3BVEXTPROC>
typealias PFNGLBINORMAL3BVEXTPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLBINORMAL3DEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3DEXTPROC>
typealias PFNGLBINORMAL3DEXTPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLBINORMAL3DVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3DVEXTPROC>
typealias PFNGLBINORMAL3DVEXTPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLBINORMAL3FEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3FEXTPROC>
typealias PFNGLBINORMAL3FEXTPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLBINORMAL3FVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3FVEXTPROC>
typealias PFNGLBINORMAL3FVEXTPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLBINORMAL3IEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3IEXTPROC>
typealias PFNGLBINORMAL3IEXTPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLBINORMAL3IVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3IVEXTPROC>
typealias PFNGLBINORMAL3IVEXTPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLBINORMAL3SEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3SEXTPROC>
typealias PFNGLBINORMAL3SEXTPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLBINORMAL3SVEXTPROCVar = CPointerVarOf<PFNGLBINORMAL3SVEXTPROC>
typealias PFNGLBINORMAL3SVEXTPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLTANGENTPOINTEREXTPROCVar = CPointerVarOf<PFNGLTANGENTPOINTEREXTPROC>
typealias PFNGLTANGENTPOINTEREXTPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLBINORMALPOINTEREXTPROCVar = CPointerVarOf<PFNGLBINORMALPOINTEREXTPROC>
typealias PFNGLBINORMALPOINTEREXTPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLCOPYTEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType373>>

typealias PFNGLCOPYTEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType374>>

typealias PFNGLCOPYTEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType188>>

typealias PFNGLCOPYTEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType208>>

typealias PFNGLCOPYTEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOPYTEXSUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType5>>

typealias PFNGLCULLPARAMETERDVEXTPROCVar = CPointerVarOf<PFNGLCULLPARAMETERDVEXTPROC>
typealias PFNGLCULLPARAMETERDVEXTPROC = CPointer<CFunction<CFunctionType375>>

typealias PFNGLCULLPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLCULLPARAMETERFVEXTPROC>
typealias PFNGLCULLPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLLABELOBJECTEXTPROCVar = CPointerVarOf<PFNGLLABELOBJECTEXTPROC>
typealias PFNGLLABELOBJECTEXTPROC = CPointer<CFunction<CFunctionType220>>

typealias PFNGLGETOBJECTLABELEXTPROCVar = CPointerVarOf<PFNGLGETOBJECTLABELEXTPROC>
typealias PFNGLGETOBJECTLABELEXTPROC = CPointer<CFunction<CFunctionType134>>

typealias PFNGLINSERTEVENTMARKEREXTPROCVar = CPointerVarOf<PFNGLINSERTEVENTMARKEREXTPROC>
typealias PFNGLINSERTEVENTMARKEREXTPROC = CPointer<CFunction<CFunctionType307>>

typealias PFNGLPUSHGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPUSHGROUPMARKEREXTPROC>
typealias PFNGLPUSHGROUPMARKEREXTPROC = CPointer<CFunction<CFunctionType307>>

typealias PFNGLPOPGROUPMARKEREXTPROCVar = CPointerVarOf<PFNGLPOPGROUPMARKEREXTPROC>
typealias PFNGLPOPGROUPMARKEREXTPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLDEPTHBOUNDSEXTPROCVar = CPointerVarOf<PFNGLDEPTHBOUNDSEXTPROC>
typealias PFNGLDEPTHBOUNDSEXTPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLMATRIXLOADFEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADFEXTPROC>
typealias PFNGLMATRIXLOADFEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXLOADDEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADDEXTPROC>
typealias PFNGLMATRIXLOADDEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMATRIXMULTFEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTFEXTPROC>
typealias PFNGLMATRIXMULTFEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXMULTDEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTDEXTPROC>
typealias PFNGLMATRIXMULTDEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMATRIXLOADIDENTITYEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADIDENTITYEXTPROC>
typealias PFNGLMATRIXLOADIDENTITYEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLMATRIXROTATEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXROTATEFEXTPROC>
typealias PFNGLMATRIXROTATEFEXTPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLMATRIXROTATEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXROTATEDEXTPROC>
typealias PFNGLMATRIXROTATEDEXTPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLMATRIXSCALEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXSCALEFEXTPROC>
typealias PFNGLMATRIXSCALEFEXTPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLMATRIXSCALEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXSCALEDEXTPROC>
typealias PFNGLMATRIXSCALEDEXTPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLMATRIXTRANSLATEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXTRANSLATEFEXTPROC>
typealias PFNGLMATRIXTRANSLATEFEXTPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLMATRIXTRANSLATEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXTRANSLATEDEXTPROC>
typealias PFNGLMATRIXTRANSLATEDEXTPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLMATRIXFRUSTUMEXTPROCVar = CPointerVarOf<PFNGLMATRIXFRUSTUMEXTPROC>
typealias PFNGLMATRIXFRUSTUMEXTPROC = CPointer<CFunction<CFunctionType376>>

typealias PFNGLMATRIXORTHOEXTPROCVar = CPointerVarOf<PFNGLMATRIXORTHOEXTPROC>
typealias PFNGLMATRIXORTHOEXTPROC = CPointer<CFunction<CFunctionType376>>

typealias PFNGLMATRIXPOPEXTPROCVar = CPointerVarOf<PFNGLMATRIXPOPEXTPROC>
typealias PFNGLMATRIXPOPEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLMATRIXPUSHEXTPROCVar = CPointerVarOf<PFNGLMATRIXPUSHEXTPROC>
typealias PFNGLMATRIXPUSHEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCLIENTATTRIBDEFAULTEXTPROCVar = CPointerVarOf<PFNGLCLIENTATTRIBDEFAULTEXTPROC>
typealias PFNGLCLIENTATTRIBDEFAULTEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROCVar = CPointerVarOf<PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC>
typealias PFNGLPUSHCLIENTATTRIBDEFAULTEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTEXTUREPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFEXTPROC>
typealias PFNGLTEXTUREPARAMETERFEXTPROC = CPointer<CFunction<CFunctionType377>>

typealias PFNGLTEXTUREPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERFVEXTPROC>
typealias PFNGLTEXTUREPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLTEXTUREPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIEXTPROC>
typealias PFNGLTEXTUREPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLTEXTUREPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE1DEXTPROC>
typealias PFNGLTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType380>>

typealias PFNGLTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DEXTPROC>
typealias PFNGLTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType381>>

typealias PFNGLTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType382>>

typealias PFNGLTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType381>>

typealias PFNGLCOPYTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTUREIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType383>>

typealias PFNGLCOPYTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTUREIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType384>>

typealias PFNGLCOPYTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType385>>

typealias PFNGLCOPYTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType386>>

typealias PFNGLGETTEXTUREIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREIMAGEEXTPROC>
typealias PFNGLGETTEXTUREIMAGEEXTPROC = CPointer<CFunction<CFunctionType387>>

typealias PFNGLGETTEXTUREPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERFVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETTEXTUREPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETTEXTURELEVELPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType389>>

typealias PFNGLGETTEXTURELEVELPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC>
typealias PFNGLGETTEXTURELEVELPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType390>>

typealias PFNGLTEXTUREIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DEXTPROC>
typealias PFNGLTEXTUREIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType391>>

typealias PFNGLTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType392>>

typealias PFNGLCOPYTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLCOPYTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType393>>

typealias PFNGLBINDMULTITEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDMULTITEXTUREEXTPROC>
typealias PFNGLBINDMULTITEXTUREEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXCOORDPOINTEREXTPROC>
typealias PFNGLMULTITEXCOORDPOINTEREXTPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLMULTITEXENVFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVFEXTPROC>
typealias PFNGLMULTITEXENVFEXTPROC = CPointer<CFunction<CFunctionType377>>

typealias PFNGLMULTITEXENVFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVFVEXTPROC>
typealias PFNGLMULTITEXENVFVEXTPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLMULTITEXENVIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVIEXTPROC>
typealias PFNGLMULTITEXENVIEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLMULTITEXENVIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXENVIVEXTPROC>
typealias PFNGLMULTITEXENVIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLMULTITEXGENDEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENDEXTPROC>
typealias PFNGLMULTITEXGENDEXTPROC = CPointer<CFunction<CFunctionType394>>

typealias PFNGLMULTITEXGENDVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENDVEXTPROC>
typealias PFNGLMULTITEXGENDVEXTPROC = CPointer<CFunction<CFunctionType395>>

typealias PFNGLMULTITEXGENFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENFEXTPROC>
typealias PFNGLMULTITEXGENFEXTPROC = CPointer<CFunction<CFunctionType377>>

typealias PFNGLMULTITEXGENFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENFVEXTPROC>
typealias PFNGLMULTITEXGENFVEXTPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLMULTITEXGENIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENIEXTPROC>
typealias PFNGLMULTITEXGENIEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLMULTITEXGENIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXGENIVEXTPROC>
typealias PFNGLMULTITEXGENIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLGETMULTITEXENVFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXENVFVEXTPROC>
typealias PFNGLGETMULTITEXENVFVEXTPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETMULTITEXENVIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXENVIVEXTPROC>
typealias PFNGLGETMULTITEXENVIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETMULTITEXGENDVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENDVEXTPROC>
typealias PFNGLGETMULTITEXGENDVEXTPROC = CPointer<CFunction<CFunctionType396>>

typealias PFNGLGETMULTITEXGENFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENFVEXTPROC>
typealias PFNGLGETMULTITEXGENFVEXTPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETMULTITEXGENIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXGENIVEXTPROC>
typealias PFNGLGETMULTITEXGENIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLMULTITEXPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIEXTPROC>
typealias PFNGLMULTITEXPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLMULTITEXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLMULTITEXPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERFEXTPROC>
typealias PFNGLMULTITEXPARAMETERFEXTPROC = CPointer<CFunction<CFunctionType377>>

typealias PFNGLMULTITEXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERFVEXTPROC>
typealias PFNGLMULTITEXPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE1DEXTPROC>
typealias PFNGLMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType380>>

typealias PFNGLMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE2DEXTPROC>
typealias PFNGLMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType381>>

typealias PFNGLMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType382>>

typealias PFNGLMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType381>>

typealias PFNGLCOPYMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXIMAGE1DEXTPROC>
typealias PFNGLCOPYMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType383>>

typealias PFNGLCOPYMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXIMAGE2DEXTPROC>
typealias PFNGLCOPYMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType384>>

typealias PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType385>>

typealias PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType386>>

typealias PFNGLGETMULTITEXIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXIMAGEEXTPROC>
typealias PFNGLGETMULTITEXIMAGEEXTPROC = CPointer<CFunction<CFunctionType387>>

typealias PFNGLGETMULTITEXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERFVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETMULTITEXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROC>
typealias PFNGLGETMULTITEXLEVELPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType389>>

typealias PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC>
typealias PFNGLGETMULTITEXLEVELPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType390>>

typealias PFNGLMULTITEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXIMAGE3DEXTPROC>
typealias PFNGLMULTITEXIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType391>>

typealias PFNGLMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType392>>

typealias PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType393>>

typealias PFNGLENABLECLIENTSTATEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLENABLECLIENTSTATEINDEXEDEXTPROC>
typealias PFNGLENABLECLIENTSTATEINDEXEDEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLECLIENTSTATEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC>
typealias PFNGLDISABLECLIENTSTATEINDEXEDEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETFLOATINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETFLOATINDEXEDVEXTPROC>
typealias PFNGLGETFLOATINDEXEDVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETDOUBLEINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETDOUBLEINDEXEDVEXTPROC>
typealias PFNGLGETDOUBLEINDEXEDVEXTPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETPOINTERINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERINDEXEDVEXTPROC>
typealias PFNGLGETPOINTERINDEXEDVEXTPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLENABLEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLENABLEINDEXEDEXTPROC>
typealias PFNGLENABLEINDEXEDEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEINDEXEDEXTPROCVar = CPointerVarOf<PFNGLDISABLEINDEXEDEXTPROC>
typealias PFNGLDISABLEINDEXEDEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLISENABLEDINDEXEDEXTPROCVar = CPointerVarOf<PFNGLISENABLEDINDEXEDEXTPROC>
typealias PFNGLISENABLEDINDEXEDEXTPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLGETINTEGERINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETINTEGERINDEXEDVEXTPROC>
typealias PFNGLGETINTEGERINDEXEDVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETBOOLEANINDEXEDVEXTPROCVar = CPointerVarOf<PFNGLGETBOOLEANINDEXEDVEXTPROC>
typealias PFNGLGETBOOLEANINDEXEDVEXTPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType397>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType398>>

typealias PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType399>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType400>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType401>>

typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDTEXTURESUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType402>>

typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROC>
typealias PFNGLGETCOMPRESSEDTEXTUREIMAGEEXTPROC = CPointer<CFunction<CFunctionType403>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType397>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType398>>

typealias PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType399>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType400>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType401>>

typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC>
typealias PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType402>>

typealias PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROCVar = CPointerVarOf<PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC>
typealias PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC = CPointer<CFunction<CFunctionType403>>

typealias PFNGLMATRIXLOADTRANSPOSEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSEFEXTPROC>
typealias PFNGLMATRIXLOADTRANSPOSEFEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXLOADTRANSPOSEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSEDEXTPROC>
typealias PFNGLMATRIXLOADTRANSPOSEDEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLMATRIXMULTTRANSPOSEFEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSEFEXTPROC>
typealias PFNGLMATRIXMULTTRANSPOSEFEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXMULTTRANSPOSEDEXTPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSEDEXTPROC>
typealias PFNGLMATRIXMULTTRANSPOSEDEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLNAMEDBUFFERDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERDATAEXTPROC>
typealias PFNGLNAMEDBUFFERDATAEXTPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<CFunctionType70>>

typealias PFNGLMAPNAMEDBUFFEREXTPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFEREXTPROC>
typealias PFNGLMAPNAMEDBUFFEREXTPROC = CPointer<CFunction<CFunctionType72>>

typealias PFNGLUNMAPNAMEDBUFFEREXTPROCVar = CPointerVarOf<PFNGLUNMAPNAMEDBUFFEREXTPROC>
typealias PFNGLUNMAPNAMEDBUFFEREXTPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETNAMEDBUFFERPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPOINTERVEXTPROC>
typealias PFNGLGETNAMEDBUFFERPOINTERVEXTPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLGETNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLGETNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<CFunctionType71>>

typealias PFNGLPROGRAMUNIFORM1FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FEXTPROC>
typealias PFNGLPROGRAMUNIFORM1FEXTPROC = CPointer<CFunction<CFunctionType176>>

typealias PFNGLPROGRAMUNIFORM2FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FEXTPROC>
typealias PFNGLPROGRAMUNIFORM2FEXTPROC = CPointer<CFunction<CFunctionType182>>

typealias PFNGLPROGRAMUNIFORM3FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FEXTPROC>
typealias PFNGLPROGRAMUNIFORM3FEXTPROC = CPointer<CFunction<CFunctionType185>>

typealias PFNGLPROGRAMUNIFORM4FEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FEXTPROC>
typealias PFNGLPROGRAMUNIFORM4FEXTPROC = CPointer<CFunction<CFunctionType189>>

typealias PFNGLPROGRAMUNIFORM1IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IEXTPROC>
typealias PFNGLPROGRAMUNIFORM1IEXTPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLPROGRAMUNIFORM2IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IEXTPROC>
typealias PFNGLPROGRAMUNIFORM2IEXTPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLPROGRAMUNIFORM3IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IEXTPROC>
typealias PFNGLPROGRAMUNIFORM3IEXTPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLPROGRAMUNIFORM4IEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IEXTPROC>
typealias PFNGLPROGRAMUNIFORM4IEXTPROC = CPointer<CFunction<CFunctionType188>>

typealias PFNGLPROGRAMUNIFORM1FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1FVEXTPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2FVEXTPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3FVEXTPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4FVEXTPROC = CPointer<CFunction<CFunctionType177>>

typealias PFNGLPROGRAMUNIFORM1IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1IVEXTPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM2IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2IVEXTPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM3IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3IVEXTPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORM4IVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4IVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4IVEXTPROC = CPointer<CFunction<CFunctionType175>>

typealias PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC = CPointer<CFunction<CFunctionType192>>

typealias PFNGLTEXTUREBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFEREXTPROC>
typealias PFNGLTEXTUREBUFFEREXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLMULTITEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXBUFFEREXTPROC>
typealias PFNGLMULTITEXBUFFEREXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLTEXTUREPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLTEXTUREPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPARAMETERIUIVEXTPROC>
typealias PFNGLTEXTUREPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType404>>

typealias PFNGLGETTEXTUREPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETTEXTUREPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXTUREPARAMETERIUIVEXTPROC>
typealias PFNGLGETTEXTUREPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType405>>

typealias PFNGLMULTITEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLMULTITEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLMULTITEXPARAMETERIUIVEXTPROC>
typealias PFNGLMULTITEXPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType404>>

typealias PFNGLGETMULTITEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETMULTITEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETMULTITEXPARAMETERIUIVEXTPROC>
typealias PFNGLGETMULTITEXPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType405>>

typealias PFNGLPROGRAMUNIFORM1UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM1UIEXTPROC = CPointer<CFunction<CFunctionType180>>

typealias PFNGLPROGRAMUNIFORM2UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM2UIEXTPROC = CPointer<CFunction<CFunctionType184>>

typealias PFNGLPROGRAMUNIFORM3UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM3UIEXTPROC = CPointer<CFunction<CFunctionType187>>

typealias PFNGLPROGRAMUNIFORM4UIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIEXTPROC>
typealias PFNGLPROGRAMUNIFORM4UIEXTPROC = CPointer<CFunction<CFunctionType191>>

typealias PFNGLPROGRAMUNIFORM1UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1UIVEXTPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM2UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2UIVEXTPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM3UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3UIVEXTPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLPROGRAMUNIFORM4UIVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4UIVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4UIVEXTPROC = CPointer<CFunction<CFunctionType181>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC = CPointer<CFunction<CFunctionType406>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC = CPointer<CFunction<CFunctionType407>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC = CPointer<CFunction<CFunctionType408>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIEXTPROC = CPointer<CFunction<CFunctionType354>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERI4UIVEXTPROC = CPointer<CFunction<CFunctionType404>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETERSI4UIVEXTPROC = CPointer<CFunction<CFunctionType409>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType405>>

typealias PFNGLENABLECLIENTSTATEIEXTPROCVar = CPointerVarOf<PFNGLENABLECLIENTSTATEIEXTPROC>
typealias PFNGLENABLECLIENTSTATEIEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLECLIENTSTATEIEXTPROCVar = CPointerVarOf<PFNGLDISABLECLIENTSTATEIEXTPROC>
typealias PFNGLDISABLECLIENTSTATEIEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETFLOATI_VEXTPROCVar = CPointerVarOf<PFNGLGETFLOATI_VEXTPROC>
typealias PFNGLGETFLOATI_VEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETDOUBLEI_VEXTPROCVar = CPointerVarOf<PFNGLGETDOUBLEI_VEXTPROC>
typealias PFNGLGETDOUBLEI_VEXTPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETPOINTERI_VEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERI_VEXTPROC>
typealias PFNGLGETPOINTERI_VEXTPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLNAMEDPROGRAMSTRINGEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMSTRINGEXTPROC>
typealias PFNGLNAMEDPROGRAMSTRINGEXTPROC = CPointer<CFunction<CFunctionType410>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC = CPointer<CFunction<CFunctionType411>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4DVEXTPROC = CPointer<CFunction<CFunctionType395>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FEXTPROC = CPointer<CFunction<CFunctionType412>>

typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROCVar = CPointerVarOf<PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC>
typealias PFNGLNAMEDPROGRAMLOCALPARAMETER4FVEXTPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERDVEXTPROC = CPointer<CFunction<CFunctionType396>>

typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMLOCALPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETNAMEDPROGRAMIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMIVEXTPROC>
typealias PFNGLGETNAMEDPROGRAMIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETNAMEDPROGRAMSTRINGEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDPROGRAMSTRINGEXTPROC>
typealias PFNGLGETNAMEDPROGRAMSTRINGEXTPROC = CPointer<CFunction<CFunctionType342>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEEXTPROC = CPointer<CFunction<CFunctionType121>>

typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDRENDERBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC>
typealias PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC = CPointer<CFunction<CFunctionType413>>

typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROCVar = CPointerVarOf<PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC>
typealias PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE1DEXTPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE2DEXTPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURE3DEXTPROC = CPointer<CFunction<CFunctionType123>>

typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERRENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGENERATETEXTUREMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATETEXTUREMIPMAPEXTPROC>
typealias PFNGLGENERATETEXTUREMIPMAPEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGENERATEMULTITEXMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATEMULTITEXMIPMAPEXTPROC>
typealias PFNGLGENERATEMULTITEXMIPMAPEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLFRAMEBUFFERDRAWBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERDRAWBUFFEREXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC>
typealias PFNGLFRAMEBUFFERDRAWBUFFERSEXTPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLFRAMEBUFFERREADBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERREADBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERREADBUFFEREXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETFRAMEBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC>
typealias PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC = CPointer<CFunction<CFunctionType131>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERTEXTUREFACEEXTPROC = CPointer<CFunction<CFunctionType279>>

typealias PFNGLTEXTURERENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXTURERENDERBUFFEREXTPROC>
typealias PFNGLTEXTURERENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLMULTITEXRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLMULTITEXRENDERBUFFEREXTPROC>
typealias PFNGLMULTITEXRENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXARRAYVERTEXOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXOFFSETEXTPROC = CPointer<CFunction<CFunctionType414>>

typealias PFNGLVERTEXARRAYCOLOROFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYCOLOROFFSETEXTPROC>
typealias PFNGLVERTEXARRAYCOLOROFFSETEXTPROC = CPointer<CFunction<CFunctionType414>>

typealias PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYEDGEFLAGOFFSETEXTPROC = CPointer<CFunction<CFunctionType415>>

typealias PFNGLVERTEXARRAYINDEXOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYINDEXOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYINDEXOFFSETEXTPROC = CPointer<CFunction<CFunctionType416>>

typealias PFNGLVERTEXARRAYNORMALOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYNORMALOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYNORMALOFFSETEXTPROC = CPointer<CFunction<CFunctionType416>>

typealias PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYTEXCOORDOFFSETEXTPROC = CPointer<CFunction<CFunctionType414>>

typealias PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYMULTITEXCOORDOFFSETEXTPROC = CPointer<CFunction<CFunctionType417>>

typealias PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC = CPointer<CFunction<CFunctionType416>>

typealias PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC>
typealias PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC = CPointer<CFunction<CFunctionType414>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC = CPointer<CFunction<CFunctionType418>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBIOFFSETEXTPROC = CPointer<CFunction<CFunctionType417>>

typealias PFNGLENABLEVERTEXARRAYEXTPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYEXTPROC>
typealias PFNGLENABLEVERTEXARRAYEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEVERTEXARRAYEXTPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYEXTPROC>
typealias PFNGLDISABLEVERTEXARRAYEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENABLEVERTEXARRAYATTRIBEXTPROCVar = CPointerVarOf<PFNGLENABLEVERTEXARRAYATTRIBEXTPROC>
typealias PFNGLENABLEVERTEXARRAYATTRIBEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDISABLEVERTEXARRAYATTRIBEXTPROCVar = CPointerVarOf<PFNGLDISABLEVERTEXARRAYATTRIBEXTPROC>
typealias PFNGLDISABLEVERTEXARRAYATTRIBEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETVERTEXARRAYINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINTEGERVEXTPROC>
typealias PFNGLGETVERTEXARRAYINTEGERVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXARRAYPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYPOINTERVEXTPROC>
typealias PFNGLGETVERTEXARRAYPOINTERVEXTPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLGETVERTEXARRAYINTEGERI_VEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYINTEGERI_VEXTPROC>
typealias PFNGLGETVERTEXARRAYINTEGERI_VEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETVERTEXARRAYPOINTERI_VEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC>
typealias PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC = CPointer<CFunction<CFunctionType419>>

typealias PFNGLMAPNAMEDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLMAPNAMEDBUFFERRANGEEXTPROC>
typealias PFNGLMAPNAMEDBUFFERRANGEEXTPROC = CPointer<CFunction<CFunctionType128>>

typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC>
typealias PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLNAMEDBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLNAMEDBUFFERSTORAGEEXTPROC>
typealias PFNGLNAMEDBUFFERSTORAGEEXTPROC = CPointer<CFunction<CFunctionType69>>

typealias PFNGLCLEARNAMEDBUFFERDATAEXTPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERDATAEXTPROC>
typealias PFNGLCLEARNAMEDBUFFERDATAEXTPROC = CPointer<CFunction<CFunctionType203>>

typealias PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROCVar = CPointerVarOf<PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC>
typealias PFNGLCLEARNAMEDBUFFERSUBDATAEXTPROC = CPointer<CFunction<CFunctionType204>>

typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC>
typealias PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLPROGRAMUNIFORM1DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DEXTPROC>
typealias PFNGLPROGRAMUNIFORM1DEXTPROC = CPointer<CFunction<CFunctionType178>>

typealias PFNGLPROGRAMUNIFORM2DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DEXTPROC>
typealias PFNGLPROGRAMUNIFORM2DEXTPROC = CPointer<CFunction<CFunctionType183>>

typealias PFNGLPROGRAMUNIFORM3DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DEXTPROC>
typealias PFNGLPROGRAMUNIFORM3DEXTPROC = CPointer<CFunction<CFunctionType186>>

typealias PFNGLPROGRAMUNIFORM4DEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DEXTPROC>
typealias PFNGLPROGRAMUNIFORM4DEXTPROC = CPointer<CFunction<CFunctionType190>>

typealias PFNGLPROGRAMUNIFORM1DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM1DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM1DVEXTPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM2DVEXTPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM3DVEXTPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORM4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORM4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORM4DVEXTPROC = CPointer<CFunction<CFunctionType179>>

typealias PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X3DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX2X4DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X2DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX3X4DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X2DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROC>
typealias PFNGLPROGRAMUNIFORMMATRIX4X3DVEXTPROC = CPointer<CFunction<CFunctionType193>>

typealias PFNGLTEXTUREBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLTEXTUREBUFFERRANGEEXTPROC>
typealias PFNGLTEXTUREBUFFERRANGEEXTPROC = CPointer<CFunction<CFunctionType420>>

typealias PFNGLTEXTURESTORAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE1DEXTPROC>
typealias PFNGLTEXTURESTORAGE1DEXTPROC = CPointer<CFunction<CFunctionType421>>

typealias PFNGLTEXTURESTORAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DEXTPROC>
typealias PFNGLTEXTURESTORAGE2DEXTPROC = CPointer<CFunction<CFunctionType422>>

typealias PFNGLTEXTURESTORAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DEXTPROC>
typealias PFNGLTEXTURESTORAGE3DEXTPROC = CPointer<CFunction<CFunctionType423>>

typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGE2DMULTISAMPLEEXTPROC = CPointer<CFunction<CFunctionType424>>

typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC>
typealias PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC = CPointer<CFunction<CFunctionType425>>

typealias PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC>
typealias PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC = CPointer<CFunction<CFunctionType239>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC = CPointer<CFunction<CFunctionType241>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC = CPointer<CFunction<CFunctionType242>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBLFORMATEXTPROC = CPointer<CFunction<CFunctionType242>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBBINDINGEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROC>
typealias PFNGLVERTEXARRAYVERTEXBINDINGDIVISOREXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC = CPointer<CFunction<CFunctionType417>>

typealias PFNGLTEXTUREPAGECOMMITMENTEXTPROCVar = CPointerVarOf<PFNGLTEXTUREPAGECOMMITMENTEXTPROC>
typealias PFNGLTEXTUREPAGECOMMITMENTEXTPROC = CPointer<CFunction<CFunctionType312>>

typealias PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROCVar = CPointerVarOf<PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC>
typealias PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLCOLORMASKINDEXEDEXTPROCVar = CPointerVarOf<PFNGLCOLORMASKINDEXEDEXTPROC>
typealias PFNGLCOLORMASKINDEXEDEXTPROC = CPointer<CFunction<CFunctionType97>>

typealias PFNGLDRAWARRAYSINSTANCEDEXTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSINSTANCEDEXTPROC>
typealias PFNGLDRAWARRAYSINSTANCEDEXTPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLDRAWELEMENTSINSTANCEDEXTPROCVar = CPointerVarOf<PFNGLDRAWELEMENTSINSTANCEDEXTPROC>
typealias PFNGLDRAWELEMENTSINSTANCEDEXTPROC = CPointer<CFunction<CFunctionType130>>

typealias PFNGLDRAWRANGEELEMENTSEXTPROCVar = CPointerVarOf<PFNGLDRAWRANGEELEMENTSEXTPROC>
typealias PFNGLDRAWRANGEELEMENTSEXTPROC = CPointer<CFunction<CFunctionType2>>

typealias PFNGLFOGCOORDFEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDFEXTPROC>
typealias PFNGLFOGCOORDFEXTPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLFOGCOORDFVEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDFVEXTPROC>
typealias PFNGLFOGCOORDFVEXTPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLFOGCOORDDEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDDEXTPROC>
typealias PFNGLFOGCOORDDEXTPROC = CPointer<CFunction<CFunctionType40>>

typealias PFNGLFOGCOORDDVEXTPROCVar = CPointerVarOf<PFNGLFOGCOORDDVEXTPROC>
typealias PFNGLFOGCOORDDVEXTPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLFOGCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTEREXTPROC>
typealias PFNGLFOGCOORDPOINTEREXTPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLBLITFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLBLITFRAMEBUFFEREXTPROC>
typealias PFNGLBLITFRAMEBUFFEREXTPROC = CPointer<CFunction<CFunctionType125>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC = CPointer<CFunction<CFunctionType126>>

typealias PFNGLISRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLISRENDERBUFFEREXTPROC>
typealias PFNGLISRENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBINDRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLBINDRENDERBUFFEREXTPROC>
typealias PFNGLBINDRENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETERENDERBUFFERSEXTPROCVar = CPointerVarOf<PFNGLDELETERENDERBUFFERSEXTPROC>
typealias PFNGLDELETERENDERBUFFERSEXTPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENRENDERBUFFERSEXTPROCVar = CPointerVarOf<PFNGLGENRENDERBUFFERSEXTPROC>
typealias PFNGLGENRENDERBUFFERSEXTPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLRENDERBUFFERSTORAGEEXTPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEEXTPROC>
typealias PFNGLRENDERBUFFERSTORAGEEXTPROC = CPointer<CFunction<CFunctionType121>>

typealias PFNGLGETRENDERBUFFERPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETRENDERBUFFERPARAMETERIVEXTPROC>
typealias PFNGLGETRENDERBUFFERPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLISFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLISFRAMEBUFFEREXTPROC>
typealias PFNGLISFRAMEBUFFEREXTPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBINDFRAMEBUFFEREXTPROCVar = CPointerVarOf<PFNGLBINDFRAMEBUFFEREXTPROC>
typealias PFNGLBINDFRAMEBUFFEREXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEFRAMEBUFFERSEXTPROCVar = CPointerVarOf<PFNGLDELETEFRAMEBUFFERSEXTPROC>
typealias PFNGLDELETEFRAMEBUFFERSEXTPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENFRAMEBUFFERSEXTPROCVar = CPointerVarOf<PFNGLGENFRAMEBUFFERSEXTPROC>
typealias PFNGLGENFRAMEBUFFERSEXTPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLCHECKFRAMEBUFFERSTATUSEXTPROCVar = CPointerVarOf<PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC>
typealias PFNGLCHECKFRAMEBUFFERSTATUSEXTPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLFRAMEBUFFERTEXTURE1DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE1DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE1DEXTPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLFRAMEBUFFERTEXTURE2DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE2DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE2DEXTPROC = CPointer<CFunction<CFunctionType122>>

typealias PFNGLFRAMEBUFFERTEXTURE3DEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURE3DEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURE3DEXTPROC = CPointer<CFunction<CFunctionType123>>

typealias PFNGLFRAMEBUFFERRENDERBUFFEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC>
typealias PFNGLFRAMEBUFFERRENDERBUFFEREXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC>
typealias PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGENERATEMIPMAPEXTPROCVar = CPointerVarOf<PFNGLGENERATEMIPMAPEXTPROC>
typealias PFNGLGENERATEMIPMAPEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPROGRAMPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERIEXTPROC>
typealias PFNGLPROGRAMPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLPROGRAMENVPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERS4FVEXTPROC>
typealias PFNGLPROGRAMENVPARAMETERS4FVEXTPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROC>
typealias PFNGLPROGRAMLOCALPARAMETERS4FVEXTPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLGETUNIFORMUIVEXTPROCVar = CPointerVarOf<PFNGLGETUNIFORMUIVEXTPROC>
typealias PFNGLGETUNIFORMUIVEXTPROC = CPointer<CFunction<CFunctionType108>>

typealias PFNGLBINDFRAGDATALOCATIONEXTPROCVar = CPointerVarOf<PFNGLBINDFRAGDATALOCATIONEXTPROC>
typealias PFNGLBINDFRAGDATALOCATIONEXTPROC = CPointer<CFunction<CFunctionType75>>

typealias PFNGLGETFRAGDATALOCATIONEXTPROCVar = CPointerVarOf<PFNGLGETFRAGDATALOCATIONEXTPROC>
typealias PFNGLGETFRAGDATALOCATIONEXTPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLUNIFORM1UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM1UIEXTPROC>
typealias PFNGLUNIFORM1UIEXTPROC = CPointer<CFunction<CFunctionType109>>

typealias PFNGLUNIFORM2UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM2UIEXTPROC>
typealias PFNGLUNIFORM2UIEXTPROC = CPointer<CFunction<CFunctionType110>>

typealias PFNGLUNIFORM3UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM3UIEXTPROC>
typealias PFNGLUNIFORM3UIEXTPROC = CPointer<CFunction<CFunctionType111>>

typealias PFNGLUNIFORM4UIEXTPROCVar = CPointerVarOf<PFNGLUNIFORM4UIEXTPROC>
typealias PFNGLUNIFORM4UIEXTPROC = CPointer<CFunction<CFunctionType112>>

typealias PFNGLUNIFORM1UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM1UIVEXTPROC>
typealias PFNGLUNIFORM1UIVEXTPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM2UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM2UIVEXTPROC>
typealias PFNGLUNIFORM2UIVEXTPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM3UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM3UIVEXTPROC>
typealias PFNGLUNIFORM3UIVEXTPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLUNIFORM4UIVEXTPROCVar = CPointerVarOf<PFNGLUNIFORM4UIVEXTPROC>
typealias PFNGLUNIFORM4UIVEXTPROC = CPointer<CFunction<CFunctionType113>>

typealias PFNGLGETHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMEXTPROC>
typealias PFNGLGETHISTOGRAMEXTPROC = CPointer<CFunction<CFunctionType426>>

typealias PFNGLGETHISTOGRAMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERFVEXTPROC>
typealias PFNGLGETHISTOGRAMPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETHISTOGRAMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETHISTOGRAMPARAMETERIVEXTPROC>
typealias PFNGLGETHISTOGRAMPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETMINMAXEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXEXTPROC>
typealias PFNGLGETMINMAXEXTPROC = CPointer<CFunction<CFunctionType426>>

typealias PFNGLGETMINMAXPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXPARAMETERFVEXTPROC>
typealias PFNGLGETMINMAXPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETMINMAXPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETMINMAXPARAMETERIVEXTPROC>
typealias PFNGLGETMINMAXPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLHISTOGRAMEXTPROC>
typealias PFNGLHISTOGRAMEXTPROC = CPointer<CFunction<CFunctionType427>>

typealias PFNGLMINMAXEXTPROCVar = CPointerVarOf<PFNGLMINMAXEXTPROC>
typealias PFNGLMINMAXEXTPROC = CPointer<CFunction<CFunctionType428>>

typealias PFNGLRESETHISTOGRAMEXTPROCVar = CPointerVarOf<PFNGLRESETHISTOGRAMEXTPROC>
typealias PFNGLRESETHISTOGRAMEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLRESETMINMAXEXTPROCVar = CPointerVarOf<PFNGLRESETMINMAXEXTPROC>
typealias PFNGLRESETMINMAXEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLINDEXFUNCEXTPROCVar = CPointerVarOf<PFNGLINDEXFUNCEXTPROC>
typealias PFNGLINDEXFUNCEXTPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLINDEXMATERIALEXTPROCVar = CPointerVarOf<PFNGLINDEXMATERIALEXTPROC>
typealias PFNGLINDEXMATERIALEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLAPPLYTEXTUREEXTPROCVar = CPointerVarOf<PFNGLAPPLYTEXTUREEXTPROC>
typealias PFNGLAPPLYTEXTUREEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTEXTURELIGHTEXTPROCVar = CPointerVarOf<PFNGLTEXTURELIGHTEXTPROC>
typealias PFNGLTEXTURELIGHTEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTEXTUREMATERIALEXTPROCVar = CPointerVarOf<PFNGLTEXTUREMATERIALEXTPROC>
typealias PFNGLTEXTUREMATERIALEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLMULTIDRAWARRAYSEXTPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSEXTPROC>
typealias PFNGLMULTIDRAWARRAYSEXTPROC = CPointer<CFunction<CFunctionType36>>

typealias PFNGLMULTIDRAWELEMENTSEXTPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSEXTPROC>
typealias PFNGLMULTIDRAWELEMENTSEXTPROC = CPointer<CFunction<CFunctionType37>>

typealias PFNGLSAMPLEMASKEXTPROCVar = CPointerVarOf<PFNGLSAMPLEMASKEXTPROC>
typealias PFNGLSAMPLEMASKEXTPROC = CPointer<CFunction<CFunctionType7>>

typealias PFNGLSAMPLEPATTERNEXTPROCVar = CPointerVarOf<PFNGLSAMPLEPATTERNEXTPROC>
typealias PFNGLSAMPLEPATTERNEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOLORTABLEEXTPROCVar = CPointerVarOf<PFNGLCOLORTABLEEXTPROC>
typealias PFNGLCOLORTABLEEXTPROC = CPointer<CFunction<CFunctionType367>>

typealias PFNGLGETCOLORTABLEEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEEXTPROC>
typealias PFNGLGETCOLORTABLEEXTPROC = CPointer<CFunction<CFunctionType342>>

typealias PFNGLGETCOLORTABLEPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERIVEXTPROC>
typealias PFNGLGETCOLORTABLEPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETCOLORTABLEPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERFVEXTPROC>
typealias PFNGLGETCOLORTABLEPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLPIXELTRANSFORMPARAMETERIEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERIEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERIEXTPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLPIXELTRANSFORMPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERFEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERFEXTPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLPIXELTRANSFORMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLPIXELTRANSFORMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC>
typealias PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROCVar = CPointerVarOf<PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROC>
typealias PFNGLGETPIXELTRANSFORMPARAMETERIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROC>
typealias PFNGLGETPIXELTRANSFORMPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLPOINTPARAMETERFEXTPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFEXTPROC>
typealias PFNGLPOINTPARAMETERFEXTPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLPOINTPARAMETERFVEXTPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVEXTPROC>
typealias PFNGLPOINTPARAMETERFVEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLPOLYGONOFFSETEXTPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETEXTPROC>
typealias PFNGLPOLYGONOFFSETEXTPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLPOLYGONOFFSETCLAMPEXTPROCVar = CPointerVarOf<PFNGLPOLYGONOFFSETCLAMPEXTPROC>
typealias PFNGLPOLYGONOFFSETCLAMPEXTPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLPROVOKINGVERTEXEXTPROCVar = CPointerVarOf<PFNGLPROVOKINGVERTEXEXTPROC>
typealias PFNGLPROVOKINGVERTEXEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLRASTERSAMPLESEXTPROCVar = CPointerVarOf<PFNGLRASTERSAMPLESEXTPROC>
typealias PFNGLRASTERSAMPLESEXTPROC = CPointer<CFunction<CFunctionType429>>

typealias PFNGLSECONDARYCOLOR3BEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BEXTPROC>
typealias PFNGLSECONDARYCOLOR3BEXTPROC = CPointer<CFunction<CFunctionType43>>

typealias PFNGLSECONDARYCOLOR3BVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3BVEXTPROC>
typealias PFNGLSECONDARYCOLOR3BVEXTPROC = CPointer<CFunction<CFunctionType44>>

typealias PFNGLSECONDARYCOLOR3DEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DEXTPROC>
typealias PFNGLSECONDARYCOLOR3DEXTPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLSECONDARYCOLOR3DVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3DVEXTPROC>
typealias PFNGLSECONDARYCOLOR3DVEXTPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLSECONDARYCOLOR3FEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FEXTPROC>
typealias PFNGLSECONDARYCOLOR3FEXTPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLSECONDARYCOLOR3FVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3FVEXTPROC>
typealias PFNGLSECONDARYCOLOR3FVEXTPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLSECONDARYCOLOR3IEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IEXTPROC>
typealias PFNGLSECONDARYCOLOR3IEXTPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLSECONDARYCOLOR3IVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3IVEXTPROC>
typealias PFNGLSECONDARYCOLOR3IVEXTPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLSECONDARYCOLOR3SEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SEXTPROC>
typealias PFNGLSECONDARYCOLOR3SEXTPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLSECONDARYCOLOR3SVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3SVEXTPROC>
typealias PFNGLSECONDARYCOLOR3SVEXTPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLSECONDARYCOLOR3UBEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBEXTPROC>
typealias PFNGLSECONDARYCOLOR3UBEXTPROC = CPointer<CFunction<CFunctionType51>>

typealias PFNGLSECONDARYCOLOR3UBVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UBVEXTPROC>
typealias PFNGLSECONDARYCOLOR3UBVEXTPROC = CPointer<CFunction<CFunctionType52>>

typealias PFNGLSECONDARYCOLOR3UIEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIEXTPROC>
typealias PFNGLSECONDARYCOLOR3UIEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLSECONDARYCOLOR3UIVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3UIVEXTPROC>
typealias PFNGLSECONDARYCOLOR3UIVEXTPROC = CPointer<CFunction<CFunctionType54>>

typealias PFNGLSECONDARYCOLOR3USEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USEXTPROC>
typealias PFNGLSECONDARYCOLOR3USEXTPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLSECONDARYCOLOR3USVEXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3USVEXTPROC>
typealias PFNGLSECONDARYCOLOR3USVEXTPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLSECONDARYCOLORPOINTEREXTPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTEREXTPROC>
typealias PFNGLSECONDARYCOLORPOINTEREXTPROC = CPointer<CFunction<CFunctionType57>>

typealias PFNGLUSESHADERPROGRAMEXTPROCVar = CPointerVarOf<PFNGLUSESHADERPROGRAMEXTPROC>
typealias PFNGLUSESHADERPROGRAMEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLACTIVEPROGRAMEXTPROCVar = CPointerVarOf<PFNGLACTIVEPROGRAMEXTPROC>
typealias PFNGLACTIVEPROGRAMEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCREATESHADERPROGRAMEXTPROCVar = CPointerVarOf<PFNGLCREATESHADERPROGRAMEXTPROC>
typealias PFNGLCREATESHADERPROGRAMEXTPROC = CPointer<CFunction<CFunctionType135>>

typealias PFNGLBINDIMAGETEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDIMAGETEXTUREEXTPROC>
typealias PFNGLBINDIMAGETEXTUREEXTPROC = CPointer<CFunction<CFunctionType430>>

typealias PFNGLMEMORYBARRIEREXTPROCVar = CPointerVarOf<PFNGLMEMORYBARRIEREXTPROC>
typealias PFNGLMEMORYBARRIEREXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLSTENCILCLEARTAGEXTPROCVar = CPointerVarOf<PFNGLSTENCILCLEARTAGEXTPROC>
typealias PFNGLSTENCILCLEARTAGEXTPROC = CPointer<CFunction<CFunctionType109>>

typealias PFNGLACTIVESTENCILFACEEXTPROCVar = CPointerVarOf<PFNGLACTIVESTENCILFACEEXTPROC>
typealias PFNGLACTIVESTENCILFACEEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLTEXSUBIMAGE1DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE1DEXTPROC>
typealias PFNGLTEXSUBIMAGE1DEXTPROC = CPointer<CFunction<CFunctionType233>>

typealias PFNGLTEXSUBIMAGE2DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE2DEXTPROC>
typealias PFNGLTEXSUBIMAGE2DEXTPROC = CPointer<CFunction<CFunctionType234>>

typealias PFNGLTEXIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DEXTPROC>
typealias PFNGLTEXIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType431>>

typealias PFNGLTEXSUBIMAGE3DEXTPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE3DEXTPROC>
typealias PFNGLTEXSUBIMAGE3DEXTPROC = CPointer<CFunction<CFunctionType4>>

typealias PFNGLFRAMEBUFFERTEXTURELAYEREXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC>
typealias PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC = CPointer<CFunction<CFunctionType127>>

typealias PFNGLTEXBUFFEREXTPROCVar = CPointerVarOf<PFNGLTEXBUFFEREXTPROC>
typealias PFNGLTEXBUFFEREXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIIVEXTPROC>
typealias PFNGLTEXPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLTEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLTEXPARAMETERIUIVEXTPROC>
typealias PFNGLTEXPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLGETTEXPARAMETERIIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIIVEXTPROC>
typealias PFNGLGETTEXPARAMETERIIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETTEXPARAMETERIUIVEXTPROCVar = CPointerVarOf<PFNGLGETTEXPARAMETERIUIVEXTPROC>
typealias PFNGLGETTEXPARAMETERIUIVEXTPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLCLEARCOLORIIEXTPROCVar = CPointerVarOf<PFNGLCLEARCOLORIIEXTPROC>
typealias PFNGLCLEARCOLORIIEXTPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLCLEARCOLORIUIEXTPROCVar = CPointerVarOf<PFNGLCLEARCOLORIUIEXTPROC>
typealias PFNGLCLEARCOLORIUIEXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLARETEXTURESRESIDENTEXTPROCVar = CPointerVarOf<PFNGLARETEXTURESRESIDENTEXTPROC>
typealias PFNGLARETEXTURESRESIDENTEXTPROC = CPointer<CFunction<CFunctionType432>>

typealias PFNGLBINDTEXTUREEXTPROCVar = CPointerVarOf<PFNGLBINDTEXTUREEXTPROC>
typealias PFNGLBINDTEXTUREEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETETEXTURESEXTPROCVar = CPointerVarOf<PFNGLDELETETEXTURESEXTPROC>
typealias PFNGLDELETETEXTURESEXTPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENTEXTURESEXTPROCVar = CPointerVarOf<PFNGLGENTEXTURESEXTPROC>
typealias PFNGLGENTEXTURESEXTPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISTEXTUREEXTPROCVar = CPointerVarOf<PFNGLISTEXTUREEXTPROC>
typealias PFNGLISTEXTUREEXTPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLPRIORITIZETEXTURESEXTPROCVar = CPointerVarOf<PFNGLPRIORITIZETEXTURESEXTPROC>
typealias PFNGLPRIORITIZETEXTURESEXTPROC = CPointer<CFunction<CFunctionType433>>

typealias PFNGLTEXTURENORMALEXTPROCVar = CPointerVarOf<PFNGLTEXTURENORMALEXTPROC>
typealias PFNGLTEXTURENORMALEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETQUERYOBJECTI64VEXTPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTI64VEXTPROC>
typealias PFNGLGETQUERYOBJECTI64VEXTPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETQUERYOBJECTUI64VEXTPROCVar = CPointerVarOf<PFNGLGETQUERYOBJECTUI64VEXTPROC>
typealias PFNGLGETQUERYOBJECTUI64VEXTPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLBEGINTRANSFORMFEEDBACKEXTPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKEXTPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDTRANSFORMFEEDBACKEXTPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKEXTPROC>
typealias PFNGLENDTRANSFORMFEEDBACKEXTPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLBINDBUFFERRANGEEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGEEXTPROC>
typealias PFNGLBINDBUFFERRANGEEXTPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLBINDBUFFEROFFSETEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFEROFFSETEXTPROC>
typealias PFNGLBINDBUFFEROFFSETEXTPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLBINDBUFFERBASEEXTPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASEEXTPROC>
typealias PFNGLBINDBUFFERBASEEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSEXTPROC = CPointer<CFunction<CFunctionType105>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGEXTPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLARRAYELEMENTEXTPROCVar = CPointerVarOf<PFNGLARRAYELEMENTEXTPROC>
typealias PFNGLARRAYELEMENTEXTPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLCOLORPOINTEREXTPROCVar = CPointerVarOf<PFNGLCOLORPOINTEREXTPROC>
typealias PFNGLCOLORPOINTEREXTPROC = CPointer<CFunction<CFunctionType434>>

typealias PFNGLDRAWARRAYSEXTPROCVar = CPointerVarOf<PFNGLDRAWARRAYSEXTPROC>
typealias PFNGLDRAWARRAYSEXTPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLEDGEFLAGPOINTEREXTPROCVar = CPointerVarOf<PFNGLEDGEFLAGPOINTEREXTPROC>
typealias PFNGLEDGEFLAGPOINTEREXTPROC = CPointer<CFunction<CFunctionType435>>

typealias PFNGLGETPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETPOINTERVEXTPROC>
typealias PFNGLGETPOINTERVEXTPROC = CPointer<CFunction<CFunctionType436>>

typealias PFNGLINDEXPOINTEREXTPROCVar = CPointerVarOf<PFNGLINDEXPOINTEREXTPROC>
typealias PFNGLINDEXPOINTEREXTPROC = CPointer<CFunction<CFunctionType437>>

typealias PFNGLNORMALPOINTEREXTPROCVar = CPointerVarOf<PFNGLNORMALPOINTEREXTPROC>
typealias PFNGLNORMALPOINTEREXTPROC = CPointer<CFunction<CFunctionType437>>

typealias PFNGLTEXCOORDPOINTEREXTPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTEREXTPROC>
typealias PFNGLTEXCOORDPOINTEREXTPROC = CPointer<CFunction<CFunctionType434>>

typealias PFNGLVERTEXPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXPOINTEREXTPROC>
typealias PFNGLVERTEXPOINTEREXTPROC = CPointer<CFunction<CFunctionType434>>

typealias PFNGLVERTEXATTRIBL1DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DEXTPROC>
typealias PFNGLVERTEXATTRIBL1DEXTPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXATTRIBL2DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DEXTPROC>
typealias PFNGLVERTEXATTRIBL2DEXTPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXATTRIBL3DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DEXTPROC>
typealias PFNGLVERTEXATTRIBL3DEXTPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXATTRIBL4DEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DEXTPROC>
typealias PFNGLVERTEXATTRIBL4DEXTPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXATTRIBL1DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1DVEXTPROC>
typealias PFNGLVERTEXATTRIBL1DVEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL2DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2DVEXTPROC>
typealias PFNGLVERTEXATTRIBL2DVEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL3DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3DVEXTPROC>
typealias PFNGLVERTEXATTRIBL3DVEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBL4DVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4DVEXTPROC>
typealias PFNGLVERTEXATTRIBL4DVEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIBLPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLPOINTEREXTPROC>
typealias PFNGLVERTEXATTRIBLPOINTEREXTPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLGETVERTEXATTRIBLDVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLDVEXTPROC>
typealias PFNGLGETVERTEXATTRIBLDVEXTPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLBEGINVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLBEGINVERTEXSHADEREXTPROC>
typealias PFNGLBEGINVERTEXSHADEREXTPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLENDVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLENDVERTEXSHADEREXTPROC>
typealias PFNGLENDVERTEXSHADEREXTPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLBINDVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLBINDVERTEXSHADEREXTPROC>
typealias PFNGLBINDVERTEXSHADEREXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGENVERTEXSHADERSEXTPROCVar = CPointerVarOf<PFNGLGENVERTEXSHADERSEXTPROC>
typealias PFNGLGENVERTEXSHADERSEXTPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLDELETEVERTEXSHADEREXTPROCVar = CPointerVarOf<PFNGLDELETEVERTEXSHADEREXTPROC>
typealias PFNGLDELETEVERTEXSHADEREXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLSHADEROP1EXTPROCVar = CPointerVarOf<PFNGLSHADEROP1EXTPROC>
typealias PFNGLSHADEROP1EXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLSHADEROP2EXTPROCVar = CPointerVarOf<PFNGLSHADEROP2EXTPROC>
typealias PFNGLSHADEROP2EXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLSHADEROP3EXTPROCVar = CPointerVarOf<PFNGLSHADEROP3EXTPROC>
typealias PFNGLSHADEROP3EXTPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLSWIZZLEEXTPROCVar = CPointerVarOf<PFNGLSWIZZLEEXTPROC>
typealias PFNGLSWIZZLEEXTPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLWRITEMASKEXTPROCVar = CPointerVarOf<PFNGLWRITEMASKEXTPROC>
typealias PFNGLWRITEMASKEXTPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLINSERTCOMPONENTEXTPROCVar = CPointerVarOf<PFNGLINSERTCOMPONENTEXTPROC>
typealias PFNGLINSERTCOMPONENTEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLEXTRACTCOMPONENTEXTPROCVar = CPointerVarOf<PFNGLEXTRACTCOMPONENTEXTPROC>
typealias PFNGLEXTRACTCOMPONENTEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLGENSYMBOLSEXTPROCVar = CPointerVarOf<PFNGLGENSYMBOLSEXTPROC>
typealias PFNGLGENSYMBOLSEXTPROC = CPointer<CFunction<CFunctionType438>>

typealias PFNGLSETINVARIANTEXTPROCVar = CPointerVarOf<PFNGLSETINVARIANTEXTPROC>
typealias PFNGLSETINVARIANTEXTPROC = CPointer<CFunction<CFunctionType158>>

typealias PFNGLSETLOCALCONSTANTEXTPROCVar = CPointerVarOf<PFNGLSETLOCALCONSTANTEXTPROC>
typealias PFNGLSETLOCALCONSTANTEXTPROC = CPointer<CFunction<CFunctionType158>>

typealias PFNGLVARIANTBVEXTPROCVar = CPointerVarOf<PFNGLVARIANTBVEXTPROC>
typealias PFNGLVARIANTBVEXTPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVARIANTSVEXTPROCVar = CPointerVarOf<PFNGLVARIANTSVEXTPROC>
typealias PFNGLVARIANTSVEXTPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVARIANTIVEXTPROCVar = CPointerVarOf<PFNGLVARIANTIVEXTPROC>
typealias PFNGLVARIANTIVEXTPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVARIANTFVEXTPROCVar = CPointerVarOf<PFNGLVARIANTFVEXTPROC>
typealias PFNGLVARIANTFVEXTPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVARIANTDVEXTPROCVar = CPointerVarOf<PFNGLVARIANTDVEXTPROC>
typealias PFNGLVARIANTDVEXTPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVARIANTUBVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUBVEXTPROC>
typealias PFNGLVARIANTUBVEXTPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVARIANTUSVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUSVEXTPROC>
typealias PFNGLVARIANTUSVEXTPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVARIANTUIVEXTPROCVar = CPointerVarOf<PFNGLVARIANTUIVEXTPROC>
typealias PFNGLVARIANTUIVEXTPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVARIANTPOINTEREXTPROCVar = CPointerVarOf<PFNGLVARIANTPOINTEREXTPROC>
typealias PFNGLVARIANTPOINTEREXTPROC = CPointer<CFunction<CFunctionType439>>

typealias PFNGLENABLEVARIANTCLIENTSTATEEXTPROCVar = CPointerVarOf<PFNGLENABLEVARIANTCLIENTSTATEEXTPROC>
typealias PFNGLENABLEVARIANTCLIENTSTATEEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDISABLEVARIANTCLIENTSTATEEXTPROCVar = CPointerVarOf<PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC>
typealias PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBINDLIGHTPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDLIGHTPARAMETEREXTPROC>
typealias PFNGLBINDLIGHTPARAMETEREXTPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLBINDMATERIALPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDMATERIALPARAMETEREXTPROC>
typealias PFNGLBINDMATERIALPARAMETEREXTPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLBINDTEXGENPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDTEXGENPARAMETEREXTPROC>
typealias PFNGLBINDTEXGENPARAMETEREXTPROC = CPointer<CFunction<CFunctionType348>>

typealias PFNGLBINDTEXTUREUNITPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDTEXTUREUNITPARAMETEREXTPROC>
typealias PFNGLBINDTEXTUREUNITPARAMETEREXTPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLBINDPARAMETEREXTPROCVar = CPointerVarOf<PFNGLBINDPARAMETEREXTPROC>
typealias PFNGLBINDPARAMETEREXTPROC = CPointer<CFunction<CFunctionType77>>

typealias PFNGLISVARIANTENABLEDEXTPROCVar = CPointerVarOf<PFNGLISVARIANTENABLEDEXTPROC>
typealias PFNGLISVARIANTENABLEDEXTPROC = CPointer<CFunction<CFunctionType103>>

typealias PFNGLGETVARIANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTBOOLEANVEXTPROC>
typealias PFNGLGETVARIANTBOOLEANVEXTPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLGETVARIANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTINTEGERVEXTPROC>
typealias PFNGLGETVARIANTINTEGERVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVARIANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTFLOATVEXTPROC>
typealias PFNGLGETVARIANTFLOATVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVARIANTPOINTERVEXTPROCVar = CPointerVarOf<PFNGLGETVARIANTPOINTERVEXTPROC>
typealias PFNGLGETVARIANTPOINTERVEXTPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLGETINVARIANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTBOOLEANVEXTPROC>
typealias PFNGLGETINVARIANTBOOLEANVEXTPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLGETINVARIANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTINTEGERVEXTPROC>
typealias PFNGLGETINVARIANTINTEGERVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETINVARIANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETINVARIANTFLOATVEXTPROC>
typealias PFNGLGETINVARIANTFLOATVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETLOCALCONSTANTBOOLEANVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC>
typealias PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLGETLOCALCONSTANTINTEGERVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTINTEGERVEXTPROC>
typealias PFNGLGETLOCALCONSTANTINTEGERVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETLOCALCONSTANTFLOATVEXTPROCVar = CPointerVarOf<PFNGLGETLOCALCONSTANTFLOATVEXTPROC>
typealias PFNGLGETLOCALCONSTANTFLOATVEXTPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLVERTEXWEIGHTFEXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTFEXTPROC>
typealias PFNGLVERTEXWEIGHTFEXTPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLVERTEXWEIGHTFVEXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTFVEXTPROC>
typealias PFNGLVERTEXWEIGHTFVEXTPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLVERTEXWEIGHTPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTPOINTEREXTPROC>
typealias PFNGLVERTEXWEIGHTPOINTEREXTPROC = CPointer<CFunction<CFunctionType57>>

typealias PFNGLWINDOWRECTANGLESEXTPROCVar = CPointerVarOf<PFNGLWINDOWRECTANGLESEXTPROC>
typealias PFNGLWINDOWRECTANGLESEXTPROC = CPointer<CFunction<CFunctionType116>>

typealias PFNGLIMPORTSYNCEXTPROCVar = CPointerVarOf<PFNGLIMPORTSYNCEXTPROC>
typealias PFNGLIMPORTSYNCEXTPROC = CPointer<CFunction<CFunctionType440>>

typealias PFNGLFRAMETERMINATORGREMEDYPROCVar = CPointerVarOf<PFNGLFRAMETERMINATORGREMEDYPROC>
typealias PFNGLFRAMETERMINATORGREMEDYPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLSTRINGMARKERGREMEDYPROCVar = CPointerVarOf<PFNGLSTRINGMARKERGREMEDYPROC>
typealias PFNGLSTRINGMARKERGREMEDYPROC = CPointer<CFunction<CFunctionType441>>

typealias PFNGLIMAGETRANSFORMPARAMETERIHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERIHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERIHPPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLIMAGETRANSFORMPARAMETERFHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERFHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERFHPPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLIMAGETRANSFORMPARAMETERIVHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERIVHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERIVHPPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLIMAGETRANSFORMPARAMETERFVHPPROCVar = CPointerVarOf<PFNGLIMAGETRANSFORMPARAMETERFVHPPROC>
typealias PFNGLIMAGETRANSFORMPARAMETERFVHPPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROCVar = CPointerVarOf<PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROC>
typealias PFNGLGETIMAGETRANSFORMPARAMETERIVHPPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROCVar = CPointerVarOf<PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC>
typealias PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLMULTIMODEDRAWARRAYSIBMPROCVar = CPointerVarOf<PFNGLMULTIMODEDRAWARRAYSIBMPROC>
typealias PFNGLMULTIMODEDRAWARRAYSIBMPROC = CPointer<CFunction<CFunctionType442>>

typealias PFNGLMULTIMODEDRAWELEMENTSIBMPROCVar = CPointerVarOf<PFNGLMULTIMODEDRAWELEMENTSIBMPROC>
typealias PFNGLMULTIMODEDRAWELEMENTSIBMPROC = CPointer<CFunction<CFunctionType443>>

typealias PFNGLFLUSHSTATICDATAIBMPROCVar = CPointerVarOf<PFNGLFLUSHSTATICDATAIBMPROC>
typealias PFNGLFLUSHSTATICDATAIBMPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOLORPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLCOLORPOINTERLISTIBMPROC>
typealias PFNGLCOLORPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType444>>

typealias PFNGLSECONDARYCOLORPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORPOINTERLISTIBMPROC>
typealias PFNGLSECONDARYCOLORPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType444>>

typealias PFNGLEDGEFLAGPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLEDGEFLAGPOINTERLISTIBMPROC>
typealias PFNGLEDGEFLAGPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType445>>

typealias PFNGLFOGCOORDPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLFOGCOORDPOINTERLISTIBMPROC>
typealias PFNGLFOGCOORDPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType446>>

typealias PFNGLINDEXPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLINDEXPOINTERLISTIBMPROC>
typealias PFNGLINDEXPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType446>>

typealias PFNGLNORMALPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLNORMALPOINTERLISTIBMPROC>
typealias PFNGLNORMALPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType446>>

typealias PFNGLTEXCOORDPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTERLISTIBMPROC>
typealias PFNGLTEXCOORDPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType444>>

typealias PFNGLVERTEXPOINTERLISTIBMPROCVar = CPointerVarOf<PFNGLVERTEXPOINTERLISTIBMPROC>
typealias PFNGLVERTEXPOINTERLISTIBMPROC = CPointer<CFunction<CFunctionType444>>

typealias PFNGLBLENDFUNCSEPARATEINGRPROCVar = CPointerVarOf<PFNGLBLENDFUNCSEPARATEINGRPROC>
typealias PFNGLBLENDFUNCSEPARATEINGRPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROCVar = CPointerVarOf<PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC>
typealias PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLSYNCTEXTUREINTELPROCVar = CPointerVarOf<PFNGLSYNCTEXTUREINTELPROC>
typealias PFNGLSYNCTEXTUREINTELPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLUNMAPTEXTURE2DINTELPROCVar = CPointerVarOf<PFNGLUNMAPTEXTURE2DINTELPROC>
typealias PFNGLUNMAPTEXTURE2DINTELPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLMAPTEXTURE2DINTELPROCVar = CPointerVarOf<PFNGLMAPTEXTURE2DINTELPROC>
typealias PFNGLMAPTEXTURE2DINTELPROC = CPointer<CFunction<CFunctionType447>>

typealias PFNGLVERTEXPOINTERVINTELPROCVar = CPointerVarOf<PFNGLVERTEXPOINTERVINTELPROC>
typealias PFNGLVERTEXPOINTERVINTELPROC = CPointer<CFunction<CFunctionType448>>

typealias PFNGLNORMALPOINTERVINTELPROCVar = CPointerVarOf<PFNGLNORMALPOINTERVINTELPROC>
typealias PFNGLNORMALPOINTERVINTELPROC = CPointer<CFunction<CFunctionType449>>

typealias PFNGLCOLORPOINTERVINTELPROCVar = CPointerVarOf<PFNGLCOLORPOINTERVINTELPROC>
typealias PFNGLCOLORPOINTERVINTELPROC = CPointer<CFunction<CFunctionType448>>

typealias PFNGLTEXCOORDPOINTERVINTELPROCVar = CPointerVarOf<PFNGLTEXCOORDPOINTERVINTELPROC>
typealias PFNGLTEXCOORDPOINTERVINTELPROC = CPointer<CFunction<CFunctionType448>>

typealias PFNGLBEGINPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLBEGINPERFQUERYINTELPROC>
typealias PFNGLBEGINPERFQUERYINTELPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCREATEPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLCREATEPERFQUERYINTELPROC>
typealias PFNGLCREATEPERFQUERYINTELPROC = CPointer<CFunction<CFunctionType450>>

typealias PFNGLDELETEPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLDELETEPERFQUERYINTELPROC>
typealias PFNGLDELETEPERFQUERYINTELPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDPERFQUERYINTELPROCVar = CPointerVarOf<PFNGLENDPERFQUERYINTELPROC>
typealias PFNGLENDPERFQUERYINTELPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETFIRSTPERFQUERYIDINTELPROCVar = CPointerVarOf<PFNGLGETFIRSTPERFQUERYIDINTELPROC>
typealias PFNGLGETFIRSTPERFQUERYIDINTELPROC = CPointer<CFunction<CFunctionType451>>

typealias PFNGLGETNEXTPERFQUERYIDINTELPROCVar = CPointerVarOf<PFNGLGETNEXTPERFQUERYIDINTELPROC>
typealias PFNGLGETNEXTPERFQUERYIDINTELPROC = CPointer<CFunction<CFunctionType450>>

typealias PFNGLGETPERFCOUNTERINFOINTELPROCVar = CPointerVarOf<PFNGLGETPERFCOUNTERINFOINTELPROC>
typealias PFNGLGETPERFCOUNTERINFOINTELPROC = CPointer<CFunction<CFunctionType452>>

typealias PFNGLGETPERFQUERYDATAINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYDATAINTELPROC>
typealias PFNGLGETPERFQUERYDATAINTELPROC = CPointer<CFunction<CFunctionType453>>

typealias PFNGLGETPERFQUERYIDBYNAMEINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYIDBYNAMEINTELPROC>
typealias PFNGLGETPERFQUERYIDBYNAMEINTELPROC = CPointer<CFunction<CFunctionType454>>

typealias PFNGLGETPERFQUERYINFOINTELPROCVar = CPointerVarOf<PFNGLGETPERFQUERYINFOINTELPROC>
typealias PFNGLGETPERFQUERYINFOINTELPROC = CPointer<CFunction<CFunctionType455>>

typealias PFNGLRESIZEBUFFERSMESAPROCVar = CPointerVarOf<PFNGLRESIZEBUFFERSMESAPROC>
typealias PFNGLRESIZEBUFFERSMESAPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLWINDOWPOS2DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DMESAPROC>
typealias PFNGLWINDOWPOS2DMESAPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLWINDOWPOS2DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2DVMESAPROC>
typealias PFNGLWINDOWPOS2DVMESAPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS2FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FMESAPROC>
typealias PFNGLWINDOWPOS2FMESAPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLWINDOWPOS2FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2FVMESAPROC>
typealias PFNGLWINDOWPOS2FVMESAPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS2IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IMESAPROC>
typealias PFNGLWINDOWPOS2IMESAPROC = CPointer<CFunction<CFunctionType60>>

typealias PFNGLWINDOWPOS2IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2IVMESAPROC>
typealias PFNGLWINDOWPOS2IVMESAPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS2SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SMESAPROC>
typealias PFNGLWINDOWPOS2SMESAPROC = CPointer<CFunction<CFunctionType61>>

typealias PFNGLWINDOWPOS2SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS2SVMESAPROC>
typealias PFNGLWINDOWPOS2SVMESAPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLWINDOWPOS3DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DMESAPROC>
typealias PFNGLWINDOWPOS3DMESAPROC = CPointer<CFunction<CFunctionType45>>

typealias PFNGLWINDOWPOS3DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3DVMESAPROC>
typealias PFNGLWINDOWPOS3DVMESAPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS3FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FMESAPROC>
typealias PFNGLWINDOWPOS3FMESAPROC = CPointer<CFunction<CFunctionType46>>

typealias PFNGLWINDOWPOS3FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3FVMESAPROC>
typealias PFNGLWINDOWPOS3FVMESAPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS3IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IMESAPROC>
typealias PFNGLWINDOWPOS3IMESAPROC = CPointer<CFunction<CFunctionType47>>

typealias PFNGLWINDOWPOS3IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3IVMESAPROC>
typealias PFNGLWINDOWPOS3IVMESAPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS3SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SMESAPROC>
typealias PFNGLWINDOWPOS3SMESAPROC = CPointer<CFunction<CFunctionType49>>

typealias PFNGLWINDOWPOS3SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS3SVMESAPROC>
typealias PFNGLWINDOWPOS3SVMESAPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLWINDOWPOS4DMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4DMESAPROC>
typealias PFNGLWINDOWPOS4DMESAPROC = CPointer<CFunction<CFunctionType456>>

typealias PFNGLWINDOWPOS4DVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4DVMESAPROC>
typealias PFNGLWINDOWPOS4DVMESAPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLWINDOWPOS4FMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4FMESAPROC>
typealias PFNGLWINDOWPOS4FMESAPROC = CPointer<CFunction<CFunctionType62>>

typealias PFNGLWINDOWPOS4FVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4FVMESAPROC>
typealias PFNGLWINDOWPOS4FVMESAPROC = CPointer<CFunction<CFunctionType39>>

typealias PFNGLWINDOWPOS4IMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4IMESAPROC>
typealias PFNGLWINDOWPOS4IMESAPROC = CPointer<CFunction<CFunctionType91>>

typealias PFNGLWINDOWPOS4IVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4IVMESAPROC>
typealias PFNGLWINDOWPOS4IVMESAPROC = CPointer<CFunction<CFunctionType48>>

typealias PFNGLWINDOWPOS4SMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4SMESAPROC>
typealias PFNGLWINDOWPOS4SMESAPROC = CPointer<CFunction<CFunctionType457>>

typealias PFNGLWINDOWPOS4SVMESAPROCVar = CPointerVarOf<PFNGLWINDOWPOS4SVMESAPROC>
typealias PFNGLWINDOWPOS4SVMESAPROC = CPointer<CFunction<CFunctionType50>>

typealias PFNGLBEGINCONDITIONALRENDERNVXPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERNVXPROC>
typealias PFNGLBEGINCONDITIONALRENDERNVXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDCONDITIONALRENDERNVXPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERNVXPROC>
typealias PFNGLENDCONDITIONALRENDERNVXPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC = CPointer<CFunction<CFunctionType458>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSNVPROC = CPointer<CFunction<CFunctionType459>>

typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROC>
typealias PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSCOUNTNVPROC = CPointer<CFunction<CFunctionType460>>

typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROCVar = CPointerVarOf<PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC>
typealias PFNGLMULTIDRAWELEMENTSINDIRECTBINDLESSCOUNTNVPROC = CPointer<CFunction<CFunctionType461>>

typealias PFNGLGETTEXTUREHANDLENVPROCVar = CPointerVarOf<PFNGLGETTEXTUREHANDLENVPROC>
typealias PFNGLGETTEXTUREHANDLENVPROC = CPointer<CFunction<CFunctionType260>>

typealias PFNGLGETTEXTURESAMPLERHANDLENVPROCVar = CPointerVarOf<PFNGLGETTEXTURESAMPLERHANDLENVPROC>
typealias PFNGLGETTEXTURESAMPLERHANDLENVPROC = CPointer<CFunction<CFunctionType261>>

typealias PFNGLMAKETEXTUREHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLERESIDENTNVPROC>
typealias PFNGLMAKETEXTUREHANDLERESIDENTNVPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC>
typealias PFNGLMAKETEXTUREHANDLENONRESIDENTNVPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLGETIMAGEHANDLENVPROCVar = CPointerVarOf<PFNGLGETIMAGEHANDLENVPROC>
typealias PFNGLGETIMAGEHANDLENVPROC = CPointer<CFunction<CFunctionType263>>

typealias PFNGLMAKEIMAGEHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLERESIDENTNVPROC>
typealias PFNGLMAKEIMAGEHANDLERESIDENTNVPROC = CPointer<CFunction<CFunctionType264>>

typealias PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC>
typealias PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC = CPointer<CFunction<CFunctionType262>>

typealias PFNGLUNIFORMHANDLEUI64NVPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64NVPROC>
typealias PFNGLUNIFORMHANDLEUI64NVPROC = CPointer<CFunction<CFunctionType265>>

typealias PFNGLUNIFORMHANDLEUI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORMHANDLEUI64VNVPROC>
typealias PFNGLUNIFORMHANDLEUI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64NVPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64NVPROC = CPointer<CFunction<CFunctionType267>>

typealias PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROC>
typealias PFNGLPROGRAMUNIFORMHANDLEUI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLISTEXTUREHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLISTEXTUREHANDLERESIDENTNVPROC>
typealias PFNGLISTEXTUREHANDLERESIDENTNVPROC = CPointer<CFunction<CFunctionType269>>

typealias PFNGLISIMAGEHANDLERESIDENTNVPROCVar = CPointerVarOf<PFNGLISIMAGEHANDLERESIDENTNVPROC>
typealias PFNGLISIMAGEHANDLERESIDENTNVPROC = CPointer<CFunction<CFunctionType269>>

typealias PFNGLBLENDPARAMETERINVPROCVar = CPointerVarOf<PFNGLBLENDPARAMETERINVPROC>
typealias PFNGLBLENDPARAMETERINVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLBLENDBARRIERNVPROCVar = CPointerVarOf<PFNGLBLENDBARRIERNVPROC>
typealias PFNGLBLENDBARRIERNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLVIEWPORTPOSITIONWSCALENVPROCVar = CPointerVarOf<PFNGLVIEWPORTPOSITIONWSCALENVPROC>
typealias PFNGLVIEWPORTPOSITIONWSCALENVPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLCREATESTATESNVPROCVar = CPointerVarOf<PFNGLCREATESTATESNVPROC>
typealias PFNGLCREATESTATESNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETESTATESNVPROCVar = CPointerVarOf<PFNGLDELETESTATESNVPROC>
typealias PFNGLDELETESTATESNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISSTATENVPROCVar = CPointerVarOf<PFNGLISSTATENVPROC>
typealias PFNGLISSTATENVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLSTATECAPTURENVPROCVar = CPointerVarOf<PFNGLSTATECAPTURENVPROC>
typealias PFNGLSTATECAPTURENVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETCOMMANDHEADERNVPROCVar = CPointerVarOf<PFNGLGETCOMMANDHEADERNVPROC>
typealias PFNGLGETCOMMANDHEADERNVPROC = CPointer<CFunction<CFunctionType232>>

typealias PFNGLGETSTAGEINDEXNVPROCVar = CPointerVarOf<PFNGLGETSTAGEINDEXNVPROC>
typealias PFNGLGETSTAGEINDEXNVPROC = CPointer<CFunction<CFunctionType462>>

typealias PFNGLDRAWCOMMANDSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSNVPROC>
typealias PFNGLDRAWCOMMANDSNVPROC = CPointer<CFunction<CFunctionType463>>

typealias PFNGLDRAWCOMMANDSADDRESSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSADDRESSNVPROC>
typealias PFNGLDRAWCOMMANDSADDRESSNVPROC = CPointer<CFunction<CFunctionType464>>

typealias PFNGLDRAWCOMMANDSSTATESNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSSTATESNVPROC>
typealias PFNGLDRAWCOMMANDSSTATESNVPROC = CPointer<CFunction<CFunctionType465>>

typealias PFNGLDRAWCOMMANDSSTATESADDRESSNVPROCVar = CPointerVarOf<PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC>
typealias PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC = CPointer<CFunction<CFunctionType466>>

typealias PFNGLCREATECOMMANDLISTSNVPROCVar = CPointerVarOf<PFNGLCREATECOMMANDLISTSNVPROC>
typealias PFNGLCREATECOMMANDLISTSNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETECOMMANDLISTSNVPROCVar = CPointerVarOf<PFNGLDELETECOMMANDLISTSNVPROC>
typealias PFNGLDELETECOMMANDLISTSNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISCOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLISCOMMANDLISTNVPROC>
typealias PFNGLISCOMMANDLISTNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROCVar = CPointerVarOf<PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROC>
typealias PFNGLLISTDRAWCOMMANDSSTATESCLIENTNVPROC = CPointer<CFunction<CFunctionType467>>

typealias PFNGLCOMMANDLISTSEGMENTSNVPROCVar = CPointerVarOf<PFNGLCOMMANDLISTSEGMENTSNVPROC>
typealias PFNGLCOMMANDLISTSEGMENTSNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCOMPILECOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLCOMPILECOMMANDLISTNVPROC>
typealias PFNGLCOMPILECOMMANDLISTNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCALLCOMMANDLISTNVPROCVar = CPointerVarOf<PFNGLCALLCOMMANDLISTNVPROC>
typealias PFNGLCALLCOMMANDLISTNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBEGINCONDITIONALRENDERNVPROCVar = CPointerVarOf<PFNGLBEGINCONDITIONALRENDERNVPROC>
typealias PFNGLBEGINCONDITIONALRENDERNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLENDCONDITIONALRENDERNVPROCVar = CPointerVarOf<PFNGLENDCONDITIONALRENDERNVPROC>
typealias PFNGLENDCONDITIONALRENDERNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLSUBPIXELPRECISIONBIASNVPROCVar = CPointerVarOf<PFNGLSUBPIXELPRECISIONBIASNVPROC>
typealias PFNGLSUBPIXELPRECISIONBIASNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCONSERVATIVERASTERPARAMETERFNVPROCVar = CPointerVarOf<PFNGLCONSERVATIVERASTERPARAMETERFNVPROC>
typealias PFNGLCONSERVATIVERASTERPARAMETERFNVPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLCONSERVATIVERASTERPARAMETERINVPROCVar = CPointerVarOf<PFNGLCONSERVATIVERASTERPARAMETERINVPROC>
typealias PFNGLCONSERVATIVERASTERPARAMETERINVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLCOPYIMAGESUBDATANVPROCVar = CPointerVarOf<PFNGLCOPYIMAGESUBDATANVPROC>
typealias PFNGLCOPYIMAGESUBDATANVPROC = CPointer<CFunction<CFunctionType206>>

typealias PFNGLDEPTHRANGEDNVPROCVar = CPointerVarOf<PFNGLDEPTHRANGEDNVPROC>
typealias PFNGLDEPTHRANGEDNVPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLCLEARDEPTHDNVPROCVar = CPointerVarOf<PFNGLCLEARDEPTHDNVPROC>
typealias PFNGLCLEARDEPTHDNVPROC = CPointer<CFunction<CFunctionType40>>

typealias PFNGLDEPTHBOUNDSDNVPROCVar = CPointerVarOf<PFNGLDEPTHBOUNDSDNVPROC>
typealias PFNGLDEPTHBOUNDSDNVPROC = CPointer<CFunction<CFunctionType58>>

typealias PFNGLDRAWTEXTURENVPROCVar = CPointerVarOf<PFNGLDRAWTEXTURENVPROC>
typealias PFNGLDRAWTEXTURENVPROC = CPointer<CFunction<CFunctionType468>>

typealias PFNGLMAPCONTROLPOINTSNVPROCVar = CPointerVarOf<PFNGLMAPCONTROLPOINTSNVPROC>
typealias PFNGLMAPCONTROLPOINTSNVPROC = CPointer<CFunction<CFunctionType469>>

typealias PFNGLMAPPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLMAPPARAMETERIVNVPROC>
typealias PFNGLMAPPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLMAPPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLMAPPARAMETERFVNVPROC>
typealias PFNGLMAPPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGETMAPCONTROLPOINTSNVPROCVar = CPointerVarOf<PFNGLGETMAPCONTROLPOINTSNVPROC>
typealias PFNGLGETMAPCONTROLPOINTSNVPROC = CPointer<CFunction<CFunctionType470>>

typealias PFNGLGETMAPPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETMAPPARAMETERIVNVPROC>
typealias PFNGLGETMAPPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETMAPPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETMAPPARAMETERFVNVPROC>
typealias PFNGLGETMAPPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETMAPATTRIBPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETMAPATTRIBPARAMETERIVNVPROC>
typealias PFNGLGETMAPATTRIBPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETMAPATTRIBPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETMAPATTRIBPARAMETERFVNVPROC>
typealias PFNGLGETMAPATTRIBPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLEVALMAPSNVPROCVar = CPointerVarOf<PFNGLEVALMAPSNVPROC>
typealias PFNGLEVALMAPSNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLGETMULTISAMPLEFVNVPROCVar = CPointerVarOf<PFNGLGETMULTISAMPLEFVNVPROC>
typealias PFNGLGETMULTISAMPLEFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLSAMPLEMASKINDEXEDNVPROCVar = CPointerVarOf<PFNGLSAMPLEMASKINDEXEDNVPROC>
typealias PFNGLSAMPLEMASKINDEXEDNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLTEXRENDERBUFFERNVPROCVar = CPointerVarOf<PFNGLTEXRENDERBUFFERNVPROC>
typealias PFNGLTEXRENDERBUFFERNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEFENCESNVPROCVar = CPointerVarOf<PFNGLDELETEFENCESNVPROC>
typealias PFNGLDELETEFENCESNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENFENCESNVPROCVar = CPointerVarOf<PFNGLGENFENCESNVPROC>
typealias PFNGLGENFENCESNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISFENCENVPROCVar = CPointerVarOf<PFNGLISFENCENVPROC>
typealias PFNGLISFENCENVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLTESTFENCENVPROCVar = CPointerVarOf<PFNGLTESTFENCENVPROC>
typealias PFNGLTESTFENCENVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETFENCEIVNVPROCVar = CPointerVarOf<PFNGLGETFENCEIVNVPROC>
typealias PFNGLGETFENCEIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLFINISHFENCENVPROCVar = CPointerVarOf<PFNGLFINISHFENCENVPROC>
typealias PFNGLFINISHFENCENVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLSETFENCENVPROCVar = CPointerVarOf<PFNGLSETFENCENVPROC>
typealias PFNGLSETFENCENVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLFRAGMENTCOVERAGECOLORNVPROCVar = CPointerVarOf<PFNGLFRAGMENTCOVERAGECOLORNVPROC>
typealias PFNGLFRAGMENTCOVERAGECOLORNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPROGRAMNAMEDPARAMETER4FNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4FNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4FNVPROC = CPointer<CFunction<CFunctionType471>>

typealias PFNGLPROGRAMNAMEDPARAMETER4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4FVNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4FVNVPROC = CPointer<CFunction<CFunctionType472>>

typealias PFNGLPROGRAMNAMEDPARAMETER4DNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4DNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4DNVPROC = CPointer<CFunction<CFunctionType473>>

typealias PFNGLPROGRAMNAMEDPARAMETER4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMNAMEDPARAMETER4DVNVPROC>
typealias PFNGLPROGRAMNAMEDPARAMETER4DVNVPROC = CPointer<CFunction<CFunctionType474>>

typealias PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC>
typealias PFNGLGETPROGRAMNAMEDPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType475>>

typealias PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROC>
typealias PFNGLGETPROGRAMNAMEDPARAMETERDVNVPROC = CPointer<CFunction<CFunctionType476>>

typealias PFNGLCOVERAGEMODULATIONTABLENVPROCVar = CPointerVarOf<PFNGLCOVERAGEMODULATIONTABLENVPROC>
typealias PFNGLCOVERAGEMODULATIONTABLENVPROC = CPointer<CFunction<CFunctionType316>>

typealias PFNGLGETCOVERAGEMODULATIONTABLENVPROCVar = CPointerVarOf<PFNGLGETCOVERAGEMODULATIONTABLENVPROC>
typealias PFNGLGETCOVERAGEMODULATIONTABLENVPROC = CPointer<CFunction<CFunctionType477>>

typealias PFNGLCOVERAGEMODULATIONNVPROCVar = CPointerVarOf<PFNGLCOVERAGEMODULATIONNVPROC>
typealias PFNGLCOVERAGEMODULATIONNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC>
typealias PFNGLRENDERBUFFERSTORAGEMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<CFunctionType413>>

typealias PFNGLPROGRAMVERTEXLIMITNVPROCVar = CPointerVarOf<PFNGLPROGRAMVERTEXLIMITNVPROC>
typealias PFNGLPROGRAMVERTEXLIMITNVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLFRAMEBUFFERTEXTUREEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTUREEXTPROC = CPointer<CFunction<CFunctionType147>>

typealias PFNGLFRAMEBUFFERTEXTUREFACEEXTPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC>
typealias PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC = CPointer<CFunction<CFunctionType279>>

typealias PFNGLPROGRAMLOCALPARAMETERI4INVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4INVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4INVPROC = CPointer<CFunction<CFunctionType370>>

typealias PFNGLPROGRAMLOCALPARAMETERI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC = CPointer<CFunction<CFunctionType228>>

typealias PFNGLPROGRAMLOCALPARAMETERI4UINVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4UINVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4UINVPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERI4UIVNVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC>
typealias PFNGLPROGRAMLOCALPARAMETERSI4UIVNVPROC = CPointer<CFunction<CFunctionType224>>

typealias PFNGLPROGRAMENVPARAMETERI4INVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4INVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4INVPROC = CPointer<CFunction<CFunctionType370>>

typealias PFNGLPROGRAMENVPARAMETERI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4IVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4IVNVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLPROGRAMENVPARAMETERSI4IVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERSI4IVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERSI4IVNVPROC = CPointer<CFunction<CFunctionType228>>

typealias PFNGLPROGRAMENVPARAMETERI4UINVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4UINVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4UINVPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLPROGRAMENVPARAMETERI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERI4UIVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERI4UIVNVPROC = CPointer<CFunction<CFunctionType115>>

typealias PFNGLPROGRAMENVPARAMETERSI4UIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC>
typealias PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC = CPointer<CFunction<CFunctionType224>>

typealias PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC>
typealias PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLGETPROGRAMENVPARAMETERIIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERIIVNVPROC>
typealias PFNGLGETPROGRAMENVPARAMETERIIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPROGRAMENVPARAMETERIUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMENVPARAMETERIUIVNVPROC>
typealias PFNGLGETPROGRAMENVPARAMETERIUIVNVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROC>
typealias PFNGLPROGRAMSUBROUTINEPARAMETERSUIVNVPROC = CPointer<CFunction<CFunctionType117>>

typealias PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC>
typealias PFNGLGETPROGRAMSUBROUTINEPARAMETERUIVNVPROC = CPointer<CFunction<CFunctionType68>>

typealias GLhalfNVVar = ShortVarOf<GLhalfNV>
typealias GLhalfNV = Short

typealias PFNGLVERTEX2HNVPROCVar = CPointerVarOf<PFNGLVERTEX2HNVPROC>
typealias PFNGLVERTEX2HNVPROC = CPointer<CFunction<CFunctionType478>>

typealias PFNGLVERTEX2HVNVPROCVar = CPointerVarOf<PFNGLVERTEX2HVNVPROC>
typealias PFNGLVERTEX2HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLVERTEX3HNVPROCVar = CPointerVarOf<PFNGLVERTEX3HNVPROC>
typealias PFNGLVERTEX3HNVPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLVERTEX3HVNVPROCVar = CPointerVarOf<PFNGLVERTEX3HVNVPROC>
typealias PFNGLVERTEX3HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLVERTEX4HNVPROCVar = CPointerVarOf<PFNGLVERTEX4HNVPROC>
typealias PFNGLVERTEX4HNVPROC = CPointer<CFunction<CFunctionType479>>

typealias PFNGLVERTEX4HVNVPROCVar = CPointerVarOf<PFNGLVERTEX4HVNVPROC>
typealias PFNGLVERTEX4HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLNORMAL3HNVPROCVar = CPointerVarOf<PFNGLNORMAL3HNVPROC>
typealias PFNGLNORMAL3HNVPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLNORMAL3HVNVPROCVar = CPointerVarOf<PFNGLNORMAL3HVNVPROC>
typealias PFNGLNORMAL3HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLCOLOR3HNVPROCVar = CPointerVarOf<PFNGLCOLOR3HNVPROC>
typealias PFNGLCOLOR3HNVPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLCOLOR3HVNVPROCVar = CPointerVarOf<PFNGLCOLOR3HVNVPROC>
typealias PFNGLCOLOR3HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLCOLOR4HNVPROCVar = CPointerVarOf<PFNGLCOLOR4HNVPROC>
typealias PFNGLCOLOR4HNVPROC = CPointer<CFunction<CFunctionType479>>

typealias PFNGLCOLOR4HVNVPROCVar = CPointerVarOf<PFNGLCOLOR4HVNVPROC>
typealias PFNGLCOLOR4HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLTEXCOORD1HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD1HNVPROC>
typealias PFNGLTEXCOORD1HNVPROC = CPointer<CFunction<CFunctionType480>>

typealias PFNGLTEXCOORD1HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD1HVNVPROC>
typealias PFNGLTEXCOORD1HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLTEXCOORD2HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD2HNVPROC>
typealias PFNGLTEXCOORD2HNVPROC = CPointer<CFunction<CFunctionType478>>

typealias PFNGLTEXCOORD2HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD2HVNVPROC>
typealias PFNGLTEXCOORD2HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLTEXCOORD3HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD3HNVPROC>
typealias PFNGLTEXCOORD3HNVPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLTEXCOORD3HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD3HVNVPROC>
typealias PFNGLTEXCOORD3HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLTEXCOORD4HNVPROCVar = CPointerVarOf<PFNGLTEXCOORD4HNVPROC>
typealias PFNGLTEXCOORD4HNVPROC = CPointer<CFunction<CFunctionType479>>

typealias PFNGLTEXCOORD4HVNVPROCVar = CPointerVarOf<PFNGLTEXCOORD4HVNVPROC>
typealias PFNGLTEXCOORD4HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLMULTITEXCOORD1HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1HNVPROC>
typealias PFNGLMULTITEXCOORD1HNVPROC = CPointer<CFunction<CFunctionType481>>

typealias PFNGLMULTITEXCOORD1HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD1HVNVPROC>
typealias PFNGLMULTITEXCOORD1HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLMULTITEXCOORD2HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2HNVPROC>
typealias PFNGLMULTITEXCOORD2HNVPROC = CPointer<CFunction<CFunctionType482>>

typealias PFNGLMULTITEXCOORD2HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD2HVNVPROC>
typealias PFNGLMULTITEXCOORD2HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLMULTITEXCOORD3HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3HNVPROC>
typealias PFNGLMULTITEXCOORD3HNVPROC = CPointer<CFunction<CFunctionType483>>

typealias PFNGLMULTITEXCOORD3HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD3HVNVPROC>
typealias PFNGLMULTITEXCOORD3HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLMULTITEXCOORD4HNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4HNVPROC>
typealias PFNGLMULTITEXCOORD4HNVPROC = CPointer<CFunction<CFunctionType484>>

typealias PFNGLMULTITEXCOORD4HVNVPROCVar = CPointerVarOf<PFNGLMULTITEXCOORD4HVNVPROC>
typealias PFNGLMULTITEXCOORD4HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLFOGCOORDHNVPROCVar = CPointerVarOf<PFNGLFOGCOORDHNVPROC>
typealias PFNGLFOGCOORDHNVPROC = CPointer<CFunction<CFunctionType480>>

typealias PFNGLFOGCOORDHVNVPROCVar = CPointerVarOf<PFNGLFOGCOORDHVNVPROC>
typealias PFNGLFOGCOORDHVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLSECONDARYCOLOR3HNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3HNVPROC>
typealias PFNGLSECONDARYCOLOR3HNVPROC = CPointer<CFunction<CFunctionType55>>

typealias PFNGLSECONDARYCOLOR3HVNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLOR3HVNVPROC>
typealias PFNGLSECONDARYCOLOR3HVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLVERTEXWEIGHTHNVPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTHNVPROC>
typealias PFNGLVERTEXWEIGHTHNVPROC = CPointer<CFunction<CFunctionType480>>

typealias PFNGLVERTEXWEIGHTHVNVPROCVar = CPointerVarOf<PFNGLVERTEXWEIGHTHVNVPROC>
typealias PFNGLVERTEXWEIGHTHVNVPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLVERTEXATTRIB1HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1HNVPROC>
typealias PFNGLVERTEXATTRIB1HNVPROC = CPointer<CFunction<CFunctionType481>>

typealias PFNGLVERTEXATTRIB1HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1HVNVPROC>
typealias PFNGLVERTEXATTRIB1HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIB2HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2HNVPROC>
typealias PFNGLVERTEXATTRIB2HNVPROC = CPointer<CFunction<CFunctionType482>>

typealias PFNGLVERTEXATTRIB2HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2HVNVPROC>
typealias PFNGLVERTEXATTRIB2HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIB3HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3HNVPROC>
typealias PFNGLVERTEXATTRIB3HNVPROC = CPointer<CFunction<CFunctionType483>>

typealias PFNGLVERTEXATTRIB3HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3HVNVPROC>
typealias PFNGLVERTEXATTRIB3HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIB4HNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4HNVPROC>
typealias PFNGLVERTEXATTRIB4HNVPROC = CPointer<CFunction<CFunctionType484>>

typealias PFNGLVERTEXATTRIB4HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4HVNVPROC>
typealias PFNGLVERTEXATTRIB4HVNVPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIBS1HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1HVNVPROC>
typealias PFNGLVERTEXATTRIBS1HVNVPROC = CPointer<CFunction<CFunctionType485>>

typealias PFNGLVERTEXATTRIBS2HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2HVNVPROC>
typealias PFNGLVERTEXATTRIBS2HVNVPROC = CPointer<CFunction<CFunctionType485>>

typealias PFNGLVERTEXATTRIBS3HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3HVNVPROC>
typealias PFNGLVERTEXATTRIBS3HVNVPROC = CPointer<CFunction<CFunctionType485>>

typealias PFNGLVERTEXATTRIBS4HVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4HVNVPROC>
typealias PFNGLVERTEXATTRIBS4HVNVPROC = CPointer<CFunction<CFunctionType485>>

typealias PFNGLGETINTERNALFORMATSAMPLEIVNVPROCVar = CPointerVarOf<PFNGLGETINTERNALFORMATSAMPLEIVNVPROC>
typealias PFNGLGETINTERNALFORMATSAMPLEIVNVPROC = CPointer<CFunction<CFunctionType486>>

typealias PFNGLGENOCCLUSIONQUERIESNVPROCVar = CPointerVarOf<PFNGLGENOCCLUSIONQUERIESNVPROC>
typealias PFNGLGENOCCLUSIONQUERIESNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLDELETEOCCLUSIONQUERIESNVPROCVar = CPointerVarOf<PFNGLDELETEOCCLUSIONQUERIESNVPROC>
typealias PFNGLDELETEOCCLUSIONQUERIESNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLISOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLISOCCLUSIONQUERYNVPROC>
typealias PFNGLISOCCLUSIONQUERYNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLBEGINOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLBEGINOCCLUSIONQUERYNVPROC>
typealias PFNGLBEGINOCCLUSIONQUERYNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDOCCLUSIONQUERYNVPROCVar = CPointerVarOf<PFNGLENDOCCLUSIONQUERYNVPROC>
typealias PFNGLENDOCCLUSIONQUERYNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLGETOCCLUSIONQUERYIVNVPROCVar = CPointerVarOf<PFNGLGETOCCLUSIONQUERYIVNVPROC>
typealias PFNGLGETOCCLUSIONQUERYIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETOCCLUSIONQUERYUIVNVPROCVar = CPointerVarOf<PFNGLGETOCCLUSIONQUERYUIVNVPROC>
typealias PFNGLGETOCCLUSIONQUERYUIVNVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLPROGRAMBUFFERPARAMETERSFVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSFVNVPROC = CPointer<CFunction<CFunctionType406>>

typealias PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSIIVNVPROC = CPointer<CFunction<CFunctionType408>>

typealias PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROCVar = CPointerVarOf<PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC>
typealias PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC = CPointer<CFunction<CFunctionType409>>

typealias PFNGLGENPATHSNVPROCVar = CPointerVarOf<PFNGLGENPATHSNVPROC>
typealias PFNGLGENPATHSNVPROC = CPointer<CFunction<CFunctionType487>>

typealias PFNGLDELETEPATHSNVPROCVar = CPointerVarOf<PFNGLDELETEPATHSNVPROC>
typealias PFNGLDELETEPATHSNVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLISPATHNVPROCVar = CPointerVarOf<PFNGLISPATHNVPROC>
typealias PFNGLISPATHNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLPATHCOMMANDSNVPROCVar = CPointerVarOf<PFNGLPATHCOMMANDSNVPROC>
typealias PFNGLPATHCOMMANDSNVPROC = CPointer<CFunction<CFunctionType488>>

typealias PFNGLPATHCOORDSNVPROCVar = CPointerVarOf<PFNGLPATHCOORDSNVPROC>
typealias PFNGLPATHCOORDSNVPROC = CPointer<CFunction<CFunctionType489>>

typealias PFNGLPATHSUBCOMMANDSNVPROCVar = CPointerVarOf<PFNGLPATHSUBCOMMANDSNVPROC>
typealias PFNGLPATHSUBCOMMANDSNVPROC = CPointer<CFunction<CFunctionType490>>

typealias PFNGLPATHSUBCOORDSNVPROCVar = CPointerVarOf<PFNGLPATHSUBCOORDSNVPROC>
typealias PFNGLPATHSUBCOORDSNVPROC = CPointer<CFunction<CFunctionType491>>

typealias PFNGLPATHSTRINGNVPROCVar = CPointerVarOf<PFNGLPATHSTRINGNVPROC>
typealias PFNGLPATHSTRINGNVPROC = CPointer<CFunction<CFunctionType274>>

typealias PFNGLPATHGLYPHSNVPROCVar = CPointerVarOf<PFNGLPATHGLYPHSNVPROC>
typealias PFNGLPATHGLYPHSNVPROC = CPointer<CFunction<CFunctionType492>>

typealias PFNGLPATHGLYPHRANGENVPROCVar = CPointerVarOf<PFNGLPATHGLYPHRANGENVPROC>
typealias PFNGLPATHGLYPHRANGENVPROC = CPointer<CFunction<CFunctionType493>>

typealias PFNGLWEIGHTPATHSNVPROCVar = CPointerVarOf<PFNGLWEIGHTPATHSNVPROC>
typealias PFNGLWEIGHTPATHSNVPROC = CPointer<CFunction<CFunctionType494>>

typealias PFNGLCOPYPATHNVPROCVar = CPointerVarOf<PFNGLCOPYPATHNVPROC>
typealias PFNGLCOPYPATHNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLINTERPOLATEPATHSNVPROCVar = CPointerVarOf<PFNGLINTERPOLATEPATHSNVPROC>
typealias PFNGLINTERPOLATEPATHSNVPROC = CPointer<CFunction<CFunctionType377>>

typealias PFNGLTRANSFORMPATHNVPROCVar = CPointerVarOf<PFNGLTRANSFORMPATHNVPROC>
typealias PFNGLTRANSFORMPATHNVPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLPATHPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERIVNVPROC>
typealias PFNGLPATHPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLPATHPARAMETERINVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERINVPROC>
typealias PFNGLPATHPARAMETERINVPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLPATHPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERFVNVPROC>
typealias PFNGLPATHPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLPATHPARAMETERFNVPROCVar = CPointerVarOf<PFNGLPATHPARAMETERFNVPROC>
typealias PFNGLPATHPARAMETERFNVPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLPATHDASHARRAYNVPROCVar = CPointerVarOf<PFNGLPATHDASHARRAYNVPROC>
typealias PFNGLPATHDASHARRAYNVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLPATHSTENCILFUNCNVPROCVar = CPointerVarOf<PFNGLPATHSTENCILFUNCNVPROC>
typealias PFNGLPATHSTENCILFUNCNVPROC = CPointer<CFunction<CFunctionType180>>

typealias PFNGLPATHSTENCILDEPTHOFFSETNVPROCVar = CPointerVarOf<PFNGLPATHSTENCILDEPTHOFFSETNVPROC>
typealias PFNGLPATHSTENCILDEPTHOFFSETNVPROC = CPointer<CFunction<CFunctionType59>>

typealias PFNGLSTENCILFILLPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILFILLPATHNVPROC>
typealias PFNGLSTENCILFILLPATHNVPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLSTENCILSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILSTROKEPATHNVPROC>
typealias PFNGLSTENCILSTROKEPATHNVPROC = CPointer<CFunction<CFunctionType180>>

typealias PFNGLSTENCILFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILFILLPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILFILLPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType495>>

typealias PFNGLSTENCILSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType496>>

typealias PFNGLPATHCOVERDEPTHFUNCNVPROCVar = CPointerVarOf<PFNGLPATHCOVERDEPTHFUNCNVPROC>
typealias PFNGLPATHCOVERDEPTHFUNCNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOVERFILLPATHNVPROCVar = CPointerVarOf<PFNGLCOVERFILLPATHNVPROC>
typealias PFNGLCOVERFILLPATHNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCOVERSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLCOVERSTROKEPATHNVPROC>
typealias PFNGLCOVERSTROKEPATHNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLCOVERFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLCOVERFILLPATHINSTANCEDNVPROC>
typealias PFNGLCOVERFILLPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType497>>

typealias PFNGLCOVERSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLCOVERSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLCOVERSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType497>>

typealias PFNGLGETPATHPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETPATHPARAMETERIVNVPROC>
typealias PFNGLGETPATHPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPATHPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPATHPARAMETERFVNVPROC>
typealias PFNGLGETPATHPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETPATHCOMMANDSNVPROCVar = CPointerVarOf<PFNGLGETPATHCOMMANDSNVPROC>
typealias PFNGLGETPATHCOMMANDSNVPROC = CPointer<CFunction<CFunctionType498>>

typealias PFNGLGETPATHCOORDSNVPROCVar = CPointerVarOf<PFNGLGETPATHCOORDSNVPROC>
typealias PFNGLGETPATHCOORDSNVPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLGETPATHDASHARRAYNVPROCVar = CPointerVarOf<PFNGLGETPATHDASHARRAYNVPROC>
typealias PFNGLGETPATHDASHARRAYNVPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLGETPATHMETRICSNVPROCVar = CPointerVarOf<PFNGLGETPATHMETRICSNVPROC>
typealias PFNGLGETPATHMETRICSNVPROC = CPointer<CFunction<CFunctionType499>>

typealias PFNGLGETPATHMETRICRANGENVPROCVar = CPointerVarOf<PFNGLGETPATHMETRICRANGENVPROC>
typealias PFNGLGETPATHMETRICRANGENVPROC = CPointer<CFunction<CFunctionType500>>

typealias PFNGLGETPATHSPACINGNVPROCVar = CPointerVarOf<PFNGLGETPATHSPACINGNVPROC>
typealias PFNGLGETPATHSPACINGNVPROC = CPointer<CFunction<CFunctionType501>>

typealias PFNGLISPOINTINFILLPATHNVPROCVar = CPointerVarOf<PFNGLISPOINTINFILLPATHNVPROC>
typealias PFNGLISPOINTINFILLPATHNVPROC = CPointer<CFunction<CFunctionType502>>

typealias PFNGLISPOINTINSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLISPOINTINSTROKEPATHNVPROC>
typealias PFNGLISPOINTINSTROKEPATHNVPROC = CPointer<CFunction<CFunctionType503>>

typealias PFNGLGETPATHLENGTHNVPROCVar = CPointerVarOf<PFNGLGETPATHLENGTHNVPROC>
typealias PFNGLGETPATHLENGTHNVPROC = CPointer<CFunction<CFunctionType504>>

typealias PFNGLPOINTALONGPATHNVPROCVar = CPointerVarOf<PFNGLPOINTALONGPATHNVPROC>
typealias PFNGLPOINTALONGPATHNVPROC = CPointer<CFunction<CFunctionType505>>

typealias PFNGLMATRIXLOAD3X2FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOAD3X2FNVPROC>
typealias PFNGLMATRIXLOAD3X2FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXLOAD3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOAD3X3FNVPROC>
typealias PFNGLMATRIXLOAD3X3FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXLOADTRANSPOSE3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC>
typealias PFNGLMATRIXLOADTRANSPOSE3X3FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXMULT3X2FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULT3X2FNVPROC>
typealias PFNGLMATRIXMULT3X2FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXMULT3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULT3X3FNVPROC>
typealias PFNGLMATRIXMULT3X3FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLMATRIXMULTTRANSPOSE3X3FNVPROCVar = CPointerVarOf<PFNGLMATRIXMULTTRANSPOSE3X3FNVPROC>
typealias PFNGLMATRIXMULTTRANSPOSE3X3FNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLSTENCILTHENCOVERFILLPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERFILLPATHNVPROC>
typealias PFNGLSTENCILTHENCOVERFILLPATHNVPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLSTENCILTHENCOVERSTROKEPATHNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERSTROKEPATHNVPROC>
typealias PFNGLSTENCILTHENCOVERSTROKEPATHNVPROC = CPointer<CFunction<CFunctionType184>>

typealias PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILTHENCOVERFILLPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType506>>

typealias PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROCVar = CPointerVarOf<PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC>
typealias PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC = CPointer<CFunction<CFunctionType507>>

typealias PFNGLPATHGLYPHINDEXRANGENVPROCVar = CPointerVarOf<PFNGLPATHGLYPHINDEXRANGENVPROC>
typealias PFNGLPATHGLYPHINDEXRANGENVPROC = CPointer<CFunction<CFunctionType508>>

typealias PFNGLPATHGLYPHINDEXARRAYNVPROCVar = CPointerVarOf<PFNGLPATHGLYPHINDEXARRAYNVPROC>
typealias PFNGLPATHGLYPHINDEXARRAYNVPROC = CPointer<CFunction<CFunctionType509>>

typealias PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROCVar = CPointerVarOf<PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC>
typealias PFNGLPATHMEMORYGLYPHINDEXARRAYNVPROC = CPointer<CFunction<CFunctionType510>>

typealias PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROCVar = CPointerVarOf<PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC>
typealias PFNGLPROGRAMPATHFRAGMENTINPUTGENNVPROC = CPointer<CFunction<CFunctionType511>>

typealias PFNGLGETPROGRAMRESOURCEFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMRESOURCEFVNVPROC>
typealias PFNGLGETPROGRAMRESOURCEFVNVPROC = CPointer<CFunction<CFunctionType512>>

typealias PFNGLPATHCOLORGENNVPROCVar = CPointerVarOf<PFNGLPATHCOLORGENNVPROC>
typealias PFNGLPATHCOLORGENNVPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLPATHTEXGENNVPROCVar = CPointerVarOf<PFNGLPATHTEXGENNVPROC>
typealias PFNGLPATHTEXGENNVPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLPATHFOGGENNVPROCVar = CPointerVarOf<PFNGLPATHFOGGENNVPROC>
typealias PFNGLPATHFOGGENNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETPATHCOLORGENIVNVPROCVar = CPointerVarOf<PFNGLGETPATHCOLORGENIVNVPROC>
typealias PFNGLGETPATHCOLORGENIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPATHCOLORGENFVNVPROCVar = CPointerVarOf<PFNGLGETPATHCOLORGENFVNVPROC>
typealias PFNGLGETPATHCOLORGENFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETPATHTEXGENIVNVPROCVar = CPointerVarOf<PFNGLGETPATHTEXGENIVNVPROC>
typealias PFNGLGETPATHTEXGENIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPATHTEXGENFVNVPROCVar = CPointerVarOf<PFNGLGETPATHTEXGENFVNVPROC>
typealias PFNGLGETPATHTEXGENFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLPIXELDATARANGENVPROCVar = CPointerVarOf<PFNGLPIXELDATARANGENVPROC>
typealias PFNGLPIXELDATARANGENVPROC = CPointer<CFunction<CFunctionType42>>

typealias PFNGLFLUSHPIXELDATARANGENVPROCVar = CPointerVarOf<PFNGLFLUSHPIXELDATARANGENVPROC>
typealias PFNGLFLUSHPIXELDATARANGENVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPOINTPARAMETERINVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERINVPROC>
typealias PFNGLPOINTPARAMETERINVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPOINTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERIVNVPROC>
typealias PFNGLPOINTPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLPRESENTFRAMEKEYEDNVPROCVar = CPointerVarOf<PFNGLPRESENTFRAMEKEYEDNVPROC>
typealias PFNGLPRESENTFRAMEKEYEDNVPROC = CPointer<CFunction<CFunctionType513>>

typealias PFNGLPRESENTFRAMEDUALFILLNVPROCVar = CPointerVarOf<PFNGLPRESENTFRAMEDUALFILLNVPROC>
typealias PFNGLPRESENTFRAMEDUALFILLNVPROC = CPointer<CFunction<CFunctionType514>>

typealias PFNGLGETVIDEOIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOIVNVPROC>
typealias PFNGLGETVIDEOIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVIDEOUIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOUIVNVPROC>
typealias PFNGLGETVIDEOUIVNVPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLGETVIDEOI64VNVPROCVar = CPointerVarOf<PFNGLGETVIDEOI64VNVPROC>
typealias PFNGLGETVIDEOI64VNVPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETVIDEOUI64VNVPROCVar = CPointerVarOf<PFNGLGETVIDEOUI64VNVPROC>
typealias PFNGLGETVIDEOUI64VNVPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLPRIMITIVERESTARTNVPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTNVPROC>
typealias PFNGLPRIMITIVERESTARTNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLPRIMITIVERESTARTINDEXNVPROCVar = CPointerVarOf<PFNGLPRIMITIVERESTARTINDEXNVPROC>
typealias PFNGLPRIMITIVERESTARTINDEXNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLCOMBINERPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERFVNVPROC>
typealias PFNGLCOMBINERPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLCOMBINERPARAMETERFNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERFNVPROC>
typealias PFNGLCOMBINERPARAMETERFNVPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLCOMBINERPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERIVNVPROC>
typealias PFNGLCOMBINERPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLCOMBINERPARAMETERINVPROCVar = CPointerVarOf<PFNGLCOMBINERPARAMETERINVPROC>
typealias PFNGLCOMBINERPARAMETERINVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLCOMBINERINPUTNVPROCVar = CPointerVarOf<PFNGLCOMBINERINPUTNVPROC>
typealias PFNGLCOMBINERINPUTNVPROC = CPointer<CFunction<CFunctionType273>>

typealias PFNGLCOMBINEROUTPUTNVPROCVar = CPointerVarOf<PFNGLCOMBINEROUTPUTNVPROC>
typealias PFNGLCOMBINEROUTPUTNVPROC = CPointer<CFunction<CFunctionType515>>

typealias PFNGLFINALCOMBINERINPUTNVPROCVar = CPointerVarOf<PFNGLFINALCOMBINERINPUTNVPROC>
typealias PFNGLFINALCOMBINERINPUTNVPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLGETCOMBINERINPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType516>>

typealias PFNGLGETCOMBINERINPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC>
typealias PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType168>>

typealias PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC>
typealias PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC>
typealias PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC>
typealias PFNGLGETFINALCOMBINERINPUTPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLCOMBINERSTAGEPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLCOMBINERSTAGEPARAMETERFVNVPROC>
typealias PFNGLCOMBINERSTAGEPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC>
typealias PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC>
typealias PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROCVar = CPointerVarOf<PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC>
typealias PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLRESOLVEDEPTHVALUESNVPROCVar = CPointerVarOf<PFNGLRESOLVEDEPTHVALUESNVPROC>
typealias PFNGLRESOLVEDEPTHVALUESNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLMAKEBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEBUFFERRESIDENTNVPROC>
typealias PFNGLMAKEBUFFERRESIDENTNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLMAKEBUFFERNONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKEBUFFERNONRESIDENTNVPROC>
typealias PFNGLMAKEBUFFERNONRESIDENTNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLISBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLISBUFFERRESIDENTNVPROC>
typealias PFNGLISBUFFERRESIDENTNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLMAKENAMEDBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKENAMEDBUFFERRESIDENTNVPROC>
typealias PFNGLMAKENAMEDBUFFERRESIDENTNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROCVar = CPointerVarOf<PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC>
typealias PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLISNAMEDBUFFERRESIDENTNVPROCVar = CPointerVarOf<PFNGLISNAMEDBUFFERRESIDENTNVPROC>
typealias PFNGLISNAMEDBUFFERRESIDENTNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLGETBUFFERPARAMETERUI64VNVPROCVar = CPointerVarOf<PFNGLGETBUFFERPARAMETERUI64VNVPROC>
typealias PFNGLGETBUFFERPARAMETERUI64VNVPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROCVar = CPointerVarOf<PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC>
typealias PFNGLGETNAMEDBUFFERPARAMETERUI64VNVPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLGETINTEGERUI64VNVPROCVar = CPointerVarOf<PFNGLGETINTEGERUI64VNVPROC>
typealias PFNGLGETINTEGERUI64VNVPROC = CPointer<CFunction<CFunctionType517>>

typealias PFNGLUNIFORMUI64NVPROCVar = CPointerVarOf<PFNGLUNIFORMUI64NVPROC>
typealias PFNGLUNIFORMUI64NVPROC = CPointer<CFunction<CFunctionType265>>

typealias PFNGLUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLUNIFORMUI64VNVPROC>
typealias PFNGLUNIFORMUI64VNVPROC = CPointer<CFunction<CFunctionType266>>

typealias PFNGLPROGRAMUNIFORMUI64NVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMUI64NVPROC>
typealias PFNGLPROGRAMUNIFORMUI64NVPROC = CPointer<CFunction<CFunctionType267>>

typealias PFNGLPROGRAMUNIFORMUI64VNVPROCVar = CPointerVarOf<PFNGLPROGRAMUNIFORMUI64VNVPROC>
typealias PFNGLPROGRAMUNIFORMUI64VNVPROC = CPointer<CFunction<CFunctionType268>>

typealias PFNGLTEXTUREBARRIERNVPROCVar = CPointerVarOf<PFNGLTEXTUREBARRIERNVPROC>
typealias PFNGLTEXTUREBARRIERNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXIMAGE2DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<CFunctionType518>>

typealias PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXIMAGE3DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<CFunctionType519>>

typealias PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC>
typealias PFNGLTEXTUREIMAGE2DMULTISAMPLENVPROC = CPointer<CFunction<CFunctionType520>>

typealias PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROC>
typealias PFNGLTEXTUREIMAGE3DMULTISAMPLENVPROC = CPointer<CFunction<CFunctionType521>>

typealias PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXTUREIMAGE2DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<CFunctionType521>>

typealias PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROCVar = CPointerVarOf<PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROC>
typealias PFNGLTEXTUREIMAGE3DMULTISAMPLECOVERAGENVPROC = CPointer<CFunction<CFunctionType522>>

typealias PFNGLBEGINTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLBEGINTRANSFORMFEEDBACKNVPROC>
typealias PFNGLBEGINTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLENDTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLENDTRANSFORMFEEDBACKNVPROC>
typealias PFNGLENDTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLTRANSFORMFEEDBACKATTRIBSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC = CPointer<CFunction<CFunctionType523>>

typealias PFNGLBINDBUFFERRANGENVPROCVar = CPointerVarOf<PFNGLBINDBUFFERRANGENVPROC>
typealias PFNGLBINDBUFFERRANGENVPROC = CPointer<CFunction<CFunctionType104>>

typealias PFNGLBINDBUFFEROFFSETNVPROCVar = CPointerVarOf<PFNGLBINDBUFFEROFFSETNVPROC>
typealias PFNGLBINDBUFFEROFFSETNVPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLBINDBUFFERBASENVPROCVar = CPointerVarOf<PFNGLBINDBUFFERBASENVPROC>
typealias PFNGLBINDBUFFERBASENVPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLTRANSFORMFEEDBACKVARYINGSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKVARYINGSNVPROC = CPointer<CFunction<CFunctionType524>>

typealias PFNGLACTIVEVARYINGNVPROCVar = CPointerVarOf<PFNGLACTIVEVARYINGNVPROC>
typealias PFNGLACTIVEVARYINGNVPROC = CPointer<CFunction<CFunctionType525>>

typealias PFNGLGETVARYINGLOCATIONNVPROCVar = CPointerVarOf<PFNGLGETVARYINGLOCATIONNVPROC>
typealias PFNGLGETVARYINGLOCATIONNVPROC = CPointer<CFunction<CFunctionType80>>

typealias PFNGLGETACTIVEVARYINGNVPROCVar = CPointerVarOf<PFNGLGETACTIVEVARYINGNVPROC>
typealias PFNGLGETACTIVEVARYINGNVPROC = CPointer<CFunction<CFunctionType78>>

typealias PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROCVar = CPointerVarOf<PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC>
typealias PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROCVar = CPointerVarOf<PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC>
typealias PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC = CPointer<CFunction<CFunctionType526>>

typealias PFNGLBINDTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLBINDTRANSFORMFEEDBACKNVPROC>
typealias PFNGLBINDTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETETRANSFORMFEEDBACKSNVPROCVar = CPointerVarOf<PFNGLDELETETRANSFORMFEEDBACKSNVPROC>
typealias PFNGLDELETETRANSFORMFEEDBACKSNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLGENTRANSFORMFEEDBACKSNVPROCVar = CPointerVarOf<PFNGLGENTRANSFORMFEEDBACKSNVPROC>
typealias PFNGLGENTRANSFORMFEEDBACKSNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLISTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLISTRANSFORMFEEDBACKNVPROC>
typealias PFNGLISTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLPAUSETRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLPAUSETRANSFORMFEEDBACKNVPROC>
typealias PFNGLPAUSETRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLRESUMETRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLRESUMETRANSFORMFEEDBACKNVPROC>
typealias PFNGLRESUMETRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLDRAWTRANSFORMFEEDBACKNVPROCVar = CPointerVarOf<PFNGLDRAWTRANSFORMFEEDBACKNVPROC>
typealias PFNGLDRAWTRANSFORMFEEDBACKNVPROC = CPointer<CFunction<CFunctionType66>>

typealias GLvdpauSurfaceNVVar = LongVarOf<GLvdpauSurfaceNV>
typealias GLvdpauSurfaceNV = GLintptr

typealias PFNGLVDPAUINITNVPROCVar = CPointerVarOf<PFNGLVDPAUINITNVPROC>
typealias PFNGLVDPAUINITNVPROC = CPointer<CFunction<CFunctionType527>>

typealias PFNGLVDPAUFININVPROCVar = CPointerVarOf<PFNGLVDPAUFININVPROC>
typealias PFNGLVDPAUFININVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLVDPAUREGISTERVIDEOSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUREGISTERVIDEOSURFACENVPROC>
typealias PFNGLVDPAUREGISTERVIDEOSURFACENVPROC = CPointer<CFunction<CFunctionType528>>

typealias PFNGLVDPAUREGISTEROUTPUTSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC>
typealias PFNGLVDPAUREGISTEROUTPUTSURFACENVPROC = CPointer<CFunction<CFunctionType528>>

typealias PFNGLVDPAUISSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUISSURFACENVPROC>
typealias PFNGLVDPAUISSURFACENVPROC = CPointer<CFunction<CFunctionType529>>

typealias PFNGLVDPAUUNREGISTERSURFACENVPROCVar = CPointerVarOf<PFNGLVDPAUUNREGISTERSURFACENVPROC>
typealias PFNGLVDPAUUNREGISTERSURFACENVPROC = CPointer<CFunction<CFunctionType205>>

typealias PFNGLVDPAUGETSURFACEIVNVPROCVar = CPointerVarOf<PFNGLVDPAUGETSURFACEIVNVPROC>
typealias PFNGLVDPAUGETSURFACEIVNVPROC = CPointer<CFunction<CFunctionType530>>

typealias PFNGLVDPAUSURFACEACCESSNVPROCVar = CPointerVarOf<PFNGLVDPAUSURFACEACCESSNVPROC>
typealias PFNGLVDPAUSURFACEACCESSNVPROC = CPointer<CFunction<CFunctionType531>>

typealias PFNGLVDPAUMAPSURFACESNVPROCVar = CPointerVarOf<PFNGLVDPAUMAPSURFACESNVPROC>
typealias PFNGLVDPAUMAPSURFACESNVPROC = CPointer<CFunction<CFunctionType532>>

typealias PFNGLVDPAUUNMAPSURFACESNVPROCVar = CPointerVarOf<PFNGLVDPAUUNMAPSURFACESNVPROC>
typealias PFNGLVDPAUUNMAPSURFACESNVPROC = CPointer<CFunction<CFunctionType532>>

typealias PFNGLFLUSHVERTEXARRAYRANGENVPROCVar = CPointerVarOf<PFNGLFLUSHVERTEXARRAYRANGENVPROC>
typealias PFNGLFLUSHVERTEXARRAYRANGENVPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLVERTEXARRAYRANGENVPROCVar = CPointerVarOf<PFNGLVERTEXARRAYRANGENVPROC>
typealias PFNGLVERTEXARRAYRANGENVPROC = CPointer<CFunction<CFunctionType441>>

typealias PFNGLVERTEXATTRIBL1I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1I64NVPROC>
typealias PFNGLVERTEXATTRIBL1I64NVPROC = CPointer<CFunction<CFunctionType533>>

typealias PFNGLVERTEXATTRIBL2I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2I64NVPROC>
typealias PFNGLVERTEXATTRIBL2I64NVPROC = CPointer<CFunction<CFunctionType129>>

typealias PFNGLVERTEXATTRIBL3I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3I64NVPROC>
typealias PFNGLVERTEXATTRIBL3I64NVPROC = CPointer<CFunction<CFunctionType534>>

typealias PFNGLVERTEXATTRIBL4I64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4I64NVPROC>
typealias PFNGLVERTEXATTRIBL4I64NVPROC = CPointer<CFunction<CFunctionType535>>

typealias PFNGLVERTEXATTRIBL1I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1I64VNVPROC>
typealias PFNGLVERTEXATTRIBL1I64VNVPROC = CPointer<CFunction<CFunctionType536>>

typealias PFNGLVERTEXATTRIBL2I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2I64VNVPROC>
typealias PFNGLVERTEXATTRIBL2I64VNVPROC = CPointer<CFunction<CFunctionType536>>

typealias PFNGLVERTEXATTRIBL3I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3I64VNVPROC>
typealias PFNGLVERTEXATTRIBL3I64VNVPROC = CPointer<CFunction<CFunctionType536>>

typealias PFNGLVERTEXATTRIBL4I64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4I64VNVPROC>
typealias PFNGLVERTEXATTRIBL4I64VNVPROC = CPointer<CFunction<CFunctionType536>>

typealias PFNGLVERTEXATTRIBL1UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64NVPROC>
typealias PFNGLVERTEXATTRIBL1UI64NVPROC = CPointer<CFunction<CFunctionType270>>

typealias PFNGLVERTEXATTRIBL2UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2UI64NVPROC>
typealias PFNGLVERTEXATTRIBL2UI64NVPROC = CPointer<CFunction<CFunctionType537>>

typealias PFNGLVERTEXATTRIBL3UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3UI64NVPROC>
typealias PFNGLVERTEXATTRIBL3UI64NVPROC = CPointer<CFunction<CFunctionType538>>

typealias PFNGLVERTEXATTRIBL4UI64NVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4UI64NVPROC>
typealias PFNGLVERTEXATTRIBL4UI64NVPROC = CPointer<CFunction<CFunctionType539>>

typealias PFNGLVERTEXATTRIBL1UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL1UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL1UI64VNVPROC = CPointer<CFunction<CFunctionType271>>

typealias PFNGLVERTEXATTRIBL2UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL2UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL2UI64VNVPROC = CPointer<CFunction<CFunctionType271>>

typealias PFNGLVERTEXATTRIBL3UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL3UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL3UI64VNVPROC = CPointer<CFunction<CFunctionType271>>

typealias PFNGLVERTEXATTRIBL4UI64VNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBL4UI64VNVPROC>
typealias PFNGLVERTEXATTRIBL4UI64VNVPROC = CPointer<CFunction<CFunctionType271>>

typealias PFNGLGETVERTEXATTRIBLI64VNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLI64VNVPROC>
typealias PFNGLGETVERTEXATTRIBLI64VNVPROC = CPointer<CFunction<CFunctionType146>>

typealias PFNGLGETVERTEXATTRIBLUI64VNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBLUI64VNVPROC>
typealias PFNGLGETVERTEXATTRIBLUI64VNVPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLVERTEXATTRIBLFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBLFORMATNVPROC>
typealias PFNGLVERTEXATTRIBLFORMATNVPROC = CPointer<CFunction<CFunctionType200>>

typealias PFNGLBUFFERADDRESSRANGENVPROCVar = CPointerVarOf<PFNGLBUFFERADDRESSRANGENVPROC>
typealias PFNGLBUFFERADDRESSRANGENVPROC = CPointer<CFunction<CFunctionType540>>

typealias PFNGLVERTEXFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXFORMATNVPROC>
typealias PFNGLVERTEXFORMATNVPROC = CPointer<CFunction<CFunctionType541>>

typealias PFNGLNORMALFORMATNVPROCVar = CPointerVarOf<PFNGLNORMALFORMATNVPROC>
typealias PFNGLNORMALFORMATNVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLCOLORFORMATNVPROCVar = CPointerVarOf<PFNGLCOLORFORMATNVPROC>
typealias PFNGLCOLORFORMATNVPROC = CPointer<CFunction<CFunctionType541>>

typealias PFNGLINDEXFORMATNVPROCVar = CPointerVarOf<PFNGLINDEXFORMATNVPROC>
typealias PFNGLINDEXFORMATNVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLTEXCOORDFORMATNVPROCVar = CPointerVarOf<PFNGLTEXCOORDFORMATNVPROC>
typealias PFNGLTEXCOORDFORMATNVPROC = CPointer<CFunction<CFunctionType541>>

typealias PFNGLEDGEFLAGFORMATNVPROCVar = CPointerVarOf<PFNGLEDGEFLAGFORMATNVPROC>
typealias PFNGLEDGEFLAGFORMATNVPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLSECONDARYCOLORFORMATNVPROCVar = CPointerVarOf<PFNGLSECONDARYCOLORFORMATNVPROC>
typealias PFNGLSECONDARYCOLORFORMATNVPROC = CPointer<CFunction<CFunctionType541>>

typealias PFNGLFOGCOORDFORMATNVPROCVar = CPointerVarOf<PFNGLFOGCOORDFORMATNVPROC>
typealias PFNGLFOGCOORDFORMATNVPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLVERTEXATTRIBFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBFORMATNVPROC>
typealias PFNGLVERTEXATTRIBFORMATNVPROC = CPointer<CFunction<CFunctionType542>>

typealias PFNGLVERTEXATTRIBIFORMATNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIFORMATNVPROC>
typealias PFNGLVERTEXATTRIBIFORMATNVPROC = CPointer<CFunction<CFunctionType200>>

typealias PFNGLGETINTEGERUI64I_VNVPROCVar = CPointerVarOf<PFNGLGETINTEGERUI64I_VNVPROC>
typealias PFNGLGETINTEGERUI64I_VNVPROC = CPointer<CFunction<CFunctionType154>>

typealias PFNGLAREPROGRAMSRESIDENTNVPROCVar = CPointerVarOf<PFNGLAREPROGRAMSRESIDENTNVPROC>
typealias PFNGLAREPROGRAMSRESIDENTNVPROC = CPointer<CFunction<CFunctionType432>>

typealias PFNGLBINDPROGRAMNVPROCVar = CPointerVarOf<PFNGLBINDPROGRAMNVPROC>
typealias PFNGLBINDPROGRAMNVPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLDELETEPROGRAMSNVPROCVar = CPointerVarOf<PFNGLDELETEPROGRAMSNVPROC>
typealias PFNGLDELETEPROGRAMSNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLEXECUTEPROGRAMNVPROCVar = CPointerVarOf<PFNGLEXECUTEPROGRAMNVPROC>
typealias PFNGLEXECUTEPROGRAMNVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLGENPROGRAMSNVPROCVar = CPointerVarOf<PFNGLGENPROGRAMSNVPROC>
typealias PFNGLGENPROGRAMSNVPROC = CPointer<CFunction<CFunctionType63>>

typealias PFNGLGETPROGRAMPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPARAMETERDVNVPROC>
typealias PFNGLGETPROGRAMPARAMETERDVNVPROC = CPointer<CFunction<CFunctionType396>>

typealias PFNGLGETPROGRAMPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMPARAMETERFVNVPROC>
typealias PFNGLGETPROGRAMPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETPROGRAMIVNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMIVNVPROC>
typealias PFNGLGETPROGRAMIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETPROGRAMSTRINGNVPROCVar = CPointerVarOf<PFNGLGETPROGRAMSTRINGNVPROC>
typealias PFNGLGETPROGRAMSTRINGNVPROC = CPointer<CFunction<CFunctionType102>>

typealias PFNGLGETTRACKMATRIXIVNVPROCVar = CPointerVarOf<PFNGLGETTRACKMATRIXIVNVPROC>
typealias PFNGLGETTRACKMATRIXIVNVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETVERTEXATTRIBDVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBDVNVPROC>
typealias PFNGLGETVERTEXATTRIBDVNVPROC = CPointer<CFunction<CFunctionType84>>

typealias PFNGLGETVERTEXATTRIBFVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBFVNVPROC>
typealias PFNGLGETVERTEXATTRIBFVNVPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETVERTEXATTRIBIVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIVNVPROC>
typealias PFNGLGETVERTEXATTRIBIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXATTRIBPOINTERVNVPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBPOINTERVNVPROC>
typealias PFNGLGETVERTEXATTRIBPOINTERVNVPROC = CPointer<CFunction<CFunctionType73>>

typealias PFNGLISPROGRAMNVPROCVar = CPointerVarOf<PFNGLISPROGRAMNVPROC>
typealias PFNGLISPROGRAMNVPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLLOADPROGRAMNVPROCVar = CPointerVarOf<PFNGLLOADPROGRAMNVPROC>
typealias PFNGLLOADPROGRAMNVPROC = CPointer<CFunction<CFunctionType543>>

typealias PFNGLPROGRAMPARAMETER4DNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4DNVPROC>
typealias PFNGLPROGRAMPARAMETER4DNVPROC = CPointer<CFunction<CFunctionType275>>

typealias PFNGLPROGRAMPARAMETER4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4DVNVPROC>
typealias PFNGLPROGRAMPARAMETER4DVNVPROC = CPointer<CFunction<CFunctionType276>>

typealias PFNGLPROGRAMPARAMETER4FNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4FNVPROC>
typealias PFNGLPROGRAMPARAMETER4FNVPROC = CPointer<CFunction<CFunctionType277>>

typealias PFNGLPROGRAMPARAMETER4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETER4FVNVPROC>
typealias PFNGLPROGRAMPARAMETER4FVNVPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLPROGRAMPARAMETERS4DVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERS4DVNVPROC>
typealias PFNGLPROGRAMPARAMETERS4DVNVPROC = CPointer<CFunction<CFunctionType544>>

typealias PFNGLPROGRAMPARAMETERS4FVNVPROCVar = CPointerVarOf<PFNGLPROGRAMPARAMETERS4FVNVPROC>
typealias PFNGLPROGRAMPARAMETERS4FVNVPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLREQUESTRESIDENTPROGRAMSNVPROCVar = CPointerVarOf<PFNGLREQUESTRESIDENTPROGRAMSNVPROC>
typealias PFNGLREQUESTRESIDENTPROGRAMSNVPROC = CPointer<CFunction<CFunctionType64>>

typealias PFNGLTRACKMATRIXNVPROCVar = CPointerVarOf<PFNGLTRACKMATRIXNVPROC>
typealias PFNGLTRACKMATRIXNVPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLVERTEXATTRIBPOINTERNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBPOINTERNVPROC>
typealias PFNGLVERTEXATTRIBPOINTERNVPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLVERTEXATTRIB1DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DNVPROC>
typealias PFNGLVERTEXATTRIB1DNVPROC = CPointer<CFunction<CFunctionType15>>

typealias PFNGLVERTEXATTRIB1DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1DVNVPROC>
typealias PFNGLVERTEXATTRIB1DVNVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB1FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FNVPROC>
typealias PFNGLVERTEXATTRIB1FNVPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLVERTEXATTRIB1FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1FVNVPROC>
typealias PFNGLVERTEXATTRIB1FVNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB1SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SNVPROC>
typealias PFNGLVERTEXATTRIB1SNVPROC = CPointer<CFunction<CFunctionType21>>

typealias PFNGLVERTEXATTRIB1SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB1SVNVPROC>
typealias PFNGLVERTEXATTRIB1SVNVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB2DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DNVPROC>
typealias PFNGLVERTEXATTRIB2DNVPROC = CPointer<CFunction<CFunctionType23>>

typealias PFNGLVERTEXATTRIB2DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2DVNVPROC>
typealias PFNGLVERTEXATTRIB2DVNVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB2FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FNVPROC>
typealias PFNGLVERTEXATTRIB2FNVPROC = CPointer<CFunction<CFunctionType24>>

typealias PFNGLVERTEXATTRIB2FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2FVNVPROC>
typealias PFNGLVERTEXATTRIB2FVNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB2SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SNVPROC>
typealias PFNGLVERTEXATTRIB2SNVPROC = CPointer<CFunction<CFunctionType26>>

typealias PFNGLVERTEXATTRIB2SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB2SVNVPROC>
typealias PFNGLVERTEXATTRIB2SVNVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB3DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DNVPROC>
typealias PFNGLVERTEXATTRIB3DNVPROC = CPointer<CFunction<CFunctionType27>>

typealias PFNGLVERTEXATTRIB3DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3DVNVPROC>
typealias PFNGLVERTEXATTRIB3DVNVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB3FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FNVPROC>
typealias PFNGLVERTEXATTRIB3FNVPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLVERTEXATTRIB3FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3FVNVPROC>
typealias PFNGLVERTEXATTRIB3FVNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB3SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SNVPROC>
typealias PFNGLVERTEXATTRIB3SNVPROC = CPointer<CFunction<CFunctionType30>>

typealias PFNGLVERTEXATTRIB3SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB3SVNVPROC>
typealias PFNGLVERTEXATTRIB3SVNVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4DNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DNVPROC>
typealias PFNGLVERTEXATTRIB4DNVPROC = CPointer<CFunction<CFunctionType31>>

typealias PFNGLVERTEXATTRIB4DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4DVNVPROC>
typealias PFNGLVERTEXATTRIB4DVNVPROC = CPointer<CFunction<CFunctionType16>>

typealias PFNGLVERTEXATTRIB4FNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FNVPROC>
typealias PFNGLVERTEXATTRIB4FNVPROC = CPointer<CFunction<CFunctionType32>>

typealias PFNGLVERTEXATTRIB4FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4FVNVPROC>
typealias PFNGLVERTEXATTRIB4FVNVPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLVERTEXATTRIB4SNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SNVPROC>
typealias PFNGLVERTEXATTRIB4SNVPROC = CPointer<CFunction<CFunctionType34>>

typealias PFNGLVERTEXATTRIB4SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4SVNVPROC>
typealias PFNGLVERTEXATTRIB4SVNVPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIB4UBNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBNVPROC>
typealias PFNGLVERTEXATTRIB4UBNVPROC = CPointer<CFunction<CFunctionType97>>

typealias PFNGLVERTEXATTRIB4UBVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIB4UBVNVPROC>
typealias PFNGLVERTEXATTRIB4UBVNVPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIBS1DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1DVNVPROC>
typealias PFNGLVERTEXATTRIBS1DVNVPROC = CPointer<CFunction<CFunctionType194>>

typealias PFNGLVERTEXATTRIBS1FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1FVNVPROC>
typealias PFNGLVERTEXATTRIBS1FVNVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLVERTEXATTRIBS1SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS1SVNVPROC>
typealias PFNGLVERTEXATTRIBS1SVNVPROC = CPointer<CFunction<CFunctionType545>>

typealias PFNGLVERTEXATTRIBS2DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2DVNVPROC>
typealias PFNGLVERTEXATTRIBS2DVNVPROC = CPointer<CFunction<CFunctionType194>>

typealias PFNGLVERTEXATTRIBS2FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2FVNVPROC>
typealias PFNGLVERTEXATTRIBS2FVNVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLVERTEXATTRIBS2SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS2SVNVPROC>
typealias PFNGLVERTEXATTRIBS2SVNVPROC = CPointer<CFunction<CFunctionType545>>

typealias PFNGLVERTEXATTRIBS3DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3DVNVPROC>
typealias PFNGLVERTEXATTRIBS3DVNVPROC = CPointer<CFunction<CFunctionType194>>

typealias PFNGLVERTEXATTRIBS3FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3FVNVPROC>
typealias PFNGLVERTEXATTRIBS3FVNVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLVERTEXATTRIBS3SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS3SVNVPROC>
typealias PFNGLVERTEXATTRIBS3SVNVPROC = CPointer<CFunction<CFunctionType545>>

typealias PFNGLVERTEXATTRIBS4DVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4DVNVPROC>
typealias PFNGLVERTEXATTRIBS4DVNVPROC = CPointer<CFunction<CFunctionType194>>

typealias PFNGLVERTEXATTRIBS4FVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4FVNVPROC>
typealias PFNGLVERTEXATTRIBS4FVNVPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLVERTEXATTRIBS4SVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4SVNVPROC>
typealias PFNGLVERTEXATTRIBS4SVNVPROC = CPointer<CFunction<CFunctionType545>>

typealias PFNGLVERTEXATTRIBS4UBVNVPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBS4UBVNVPROC>
typealias PFNGLVERTEXATTRIBS4UBVNVPROC = CPointer<CFunction<CFunctionType546>>

typealias PFNGLVERTEXATTRIBI1IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IEXTPROC>
typealias PFNGLVERTEXATTRIBI1IEXTPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLVERTEXATTRIBI2IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IEXTPROC>
typealias PFNGLVERTEXATTRIBI2IEXTPROC = CPointer<CFunction<CFunctionType25>>

typealias PFNGLVERTEXATTRIBI3IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IEXTPROC>
typealias PFNGLVERTEXATTRIBI3IEXTPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLVERTEXATTRIBI4IEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IEXTPROC>
typealias PFNGLVERTEXATTRIBI4IEXTPROC = CPointer<CFunction<CFunctionType33>>

typealias PFNGLVERTEXATTRIBI1UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIEXTPROC>
typealias PFNGLVERTEXATTRIBI1UIEXTPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLVERTEXATTRIBI2UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIEXTPROC>
typealias PFNGLVERTEXATTRIBI2UIEXTPROC = CPointer<CFunction<CFunctionType53>>

typealias PFNGLVERTEXATTRIBI3UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIEXTPROC>
typealias PFNGLVERTEXATTRIBI3UIEXTPROC = CPointer<CFunction<CFunctionType35>>

typealias PFNGLVERTEXATTRIBI4UIEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIEXTPROC>
typealias PFNGLVERTEXATTRIBI4UIEXTPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLVERTEXATTRIBI1IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1IVEXTPROC>
typealias PFNGLVERTEXATTRIBI1IVEXTPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI2IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2IVEXTPROC>
typealias PFNGLVERTEXATTRIBI2IVEXTPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI3IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3IVEXTPROC>
typealias PFNGLVERTEXATTRIBI3IVEXTPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI4IVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4IVEXTPROC>
typealias PFNGLVERTEXATTRIBI4IVEXTPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLVERTEXATTRIBI1UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI1UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI1UIVEXTPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI2UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI2UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI2UIVEXTPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI3UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI3UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI3UIVEXTPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI4UIVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UIVEXTPROC>
typealias PFNGLVERTEXATTRIBI4UIVEXTPROC = CPointer<CFunction<CFunctionType99>>

typealias PFNGLVERTEXATTRIBI4BVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4BVEXTPROC>
typealias PFNGLVERTEXATTRIBI4BVEXTPROC = CPointer<CFunction<CFunctionType96>>

typealias PFNGLVERTEXATTRIBI4SVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4SVEXTPROC>
typealias PFNGLVERTEXATTRIBI4SVEXTPROC = CPointer<CFunction<CFunctionType22>>

typealias PFNGLVERTEXATTRIBI4UBVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4UBVEXTPROC>
typealias PFNGLVERTEXATTRIBI4UBVEXTPROC = CPointer<CFunction<CFunctionType98>>

typealias PFNGLVERTEXATTRIBI4USVEXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBI4USVEXTPROC>
typealias PFNGLVERTEXATTRIBI4USVEXTPROC = CPointer<CFunction<CFunctionType100>>

typealias PFNGLVERTEXATTRIBIPOINTEREXTPROCVar = CPointerVarOf<PFNGLVERTEXATTRIBIPOINTEREXTPROC>
typealias PFNGLVERTEXATTRIBIPOINTEREXTPROC = CPointer<CFunction<CFunctionType106>>

typealias PFNGLGETVERTEXATTRIBIIVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIIVEXTPROC>
typealias PFNGLGETVERTEXATTRIBIIVEXTPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVERTEXATTRIBIUIVEXTPROCVar = CPointerVarOf<PFNGLGETVERTEXATTRIBIUIVEXTPROC>
typealias PFNGLGETVERTEXATTRIBIUIVEXTPROC = CPointer<CFunction<CFunctionType68>>

typealias PFNGLBEGINVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLBEGINVIDEOCAPTURENVPROC>
typealias PFNGLBEGINVIDEOCAPTURENVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROCVar = CPointerVarOf<PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC>
typealias PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC = CPointer<CFunction<CFunctionType243>>

typealias PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROCVar = CPointerVarOf<PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC>
typealias PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLENDVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLENDVIDEOCAPTURENVPROC>
typealias PFNGLENDVIDEOCAPTURENVPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLGETVIDEOCAPTUREIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTUREIVNVPROC>
typealias PFNGLGETVIDEOCAPTUREIVNVPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETVIDEOCAPTURESTREAMIVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMIVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMIVNVPROC = CPointer<CFunction<CFunctionType124>>

typealias PFNGLGETVIDEOCAPTURESTREAMFVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMFVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMFVNVPROC = CPointer<CFunction<CFunctionType388>>

typealias PFNGLGETVIDEOCAPTURESTREAMDVNVPROCVar = CPointerVarOf<PFNGLGETVIDEOCAPTURESTREAMDVNVPROC>
typealias PFNGLGETVIDEOCAPTURESTREAMDVNVPROC = CPointer<CFunction<CFunctionType396>>

typealias PFNGLVIDEOCAPTURENVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURENVPROC>
typealias PFNGLVIDEOCAPTURENVPROC = CPointer<CFunction<CFunctionType547>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERIVNVPROC = CPointer<CFunction<CFunctionType379>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERFVNVPROC = CPointer<CFunction<CFunctionType378>>

typealias PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROCVar = CPointerVarOf<PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROC>
typealias PFNGLVIDEOCAPTURESTREAMPARAMETERDVNVPROC = CPointer<CFunction<CFunctionType395>>

typealias PFNGLVIEWPORTSWIZZLENVPROCVar = CPointerVarOf<PFNGLVIEWPORTSWIZZLENVPROC>
typealias PFNGLVIEWPORTSWIZZLENVPROC = CPointer<CFunction<CFunctionType107>>

typealias PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROCVar = CPointerVarOf<PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC>
typealias PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC = CPointer<CFunction<CFunctionType548>>

typealias PFNGLHINTPGIPROCVar = CPointerVarOf<PFNGLHINTPGIPROC>
typealias PFNGLHINTPGIPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLDETAILTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLDETAILTEXFUNCSGISPROC>
typealias PFNGLDETAILTEXFUNCSGISPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLGETDETAILTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLGETDETAILTEXFUNCSGISPROC>
typealias PFNGLGETDETAILTEXFUNCSGISPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLFOGFUNCSGISPROCVar = CPointerVarOf<PFNGLFOGFUNCSGISPROC>
typealias PFNGLFOGFUNCSGISPROC = CPointer<CFunction<CFunctionType316>>

typealias PFNGLGETFOGFUNCSGISPROCVar = CPointerVarOf<PFNGLGETFOGFUNCSGISPROC>
typealias PFNGLGETFOGFUNCSGISPROC = CPointer<CFunction<CFunctionType549>>

typealias PFNGLSAMPLEMASKSGISPROCVar = CPointerVarOf<PFNGLSAMPLEMASKSGISPROC>
typealias PFNGLSAMPLEMASKSGISPROC = CPointer<CFunction<CFunctionType7>>

typealias PFNGLSAMPLEPATTERNSGISPROCVar = CPointerVarOf<PFNGLSAMPLEPATTERNSGISPROC>
typealias PFNGLSAMPLEPATTERNSGISPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLPIXELTEXGENPARAMETERISGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERISGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERISGISPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLPIXELTEXGENPARAMETERIVSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERIVSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERIVSGISPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLPIXELTEXGENPARAMETERFSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERFSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERFSGISPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLPIXELTEXGENPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLPIXELTEXGENPARAMETERFVSGISPROC>
typealias PFNGLPIXELTEXGENPARAMETERFVSGISPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLGETPIXELTEXGENPARAMETERIVSGISPROCVar = CPointerVarOf<PFNGLGETPIXELTEXGENPARAMETERIVSGISPROC>
typealias PFNGLGETPIXELTEXGENPARAMETERIVSGISPROC = CPointer<CFunction<CFunctionType326>>

typealias PFNGLGETPIXELTEXGENPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLGETPIXELTEXGENPARAMETERFVSGISPROC>
typealias PFNGLGETPIXELTEXGENPARAMETERFVSGISPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLPOINTPARAMETERFSGISPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFSGISPROC>
typealias PFNGLPOINTPARAMETERFSGISPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLPOINTPARAMETERFVSGISPROCVar = CPointerVarOf<PFNGLPOINTPARAMETERFVSGISPROC>
typealias PFNGLPOINTPARAMETERFVSGISPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLSHARPENTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLSHARPENTEXFUNCSGISPROC>
typealias PFNGLSHARPENTEXFUNCSGISPROC = CPointer<CFunction<CFunctionType118>>

typealias PFNGLGETSHARPENTEXFUNCSGISPROCVar = CPointerVarOf<PFNGLGETSHARPENTEXFUNCSGISPROC>
typealias PFNGLGETSHARPENTEXFUNCSGISPROC = CPointer<CFunction<CFunctionType334>>

typealias PFNGLTEXIMAGE4DSGISPROCVar = CPointerVarOf<PFNGLTEXIMAGE4DSGISPROC>
typealias PFNGLTEXIMAGE4DSGISPROC = CPointer<CFunction<CFunctionType550>>

typealias PFNGLTEXSUBIMAGE4DSGISPROCVar = CPointerVarOf<PFNGLTEXSUBIMAGE4DSGISPROC>
typealias PFNGLTEXSUBIMAGE4DSGISPROC = CPointer<CFunction<CFunctionType551>>

typealias PFNGLTEXTURECOLORMASKSGISPROCVar = CPointerVarOf<PFNGLTEXTURECOLORMASKSGISPROC>
typealias PFNGLTEXTURECOLORMASKSGISPROC = CPointer<CFunction<CFunctionType552>>

typealias PFNGLGETTEXFILTERFUNCSGISPROCVar = CPointerVarOf<PFNGLGETTEXFILTERFUNCSGISPROC>
typealias PFNGLGETTEXFILTERFUNCSGISPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLTEXFILTERFUNCSGISPROCVar = CPointerVarOf<PFNGLTEXFILTERFUNCSGISPROC>
typealias PFNGLTEXFILTERFUNCSGISPROC = CPointer<CFunction<CFunctionType229>>

typealias PFNGLASYNCMARKERSGIXPROCVar = CPointerVarOf<PFNGLASYNCMARKERSGIXPROC>
typealias PFNGLASYNCMARKERSGIXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLFINISHASYNCSGIXPROCVar = CPointerVarOf<PFNGLFINISHASYNCSGIXPROC>
typealias PFNGLFINISHASYNCSGIXPROC = CPointer<CFunction<CFunctionType553>>

typealias PFNGLPOLLASYNCSGIXPROCVar = CPointerVarOf<PFNGLPOLLASYNCSGIXPROC>
typealias PFNGLPOLLASYNCSGIXPROC = CPointer<CFunction<CFunctionType553>>

typealias PFNGLGENASYNCMARKERSSGIXPROCVar = CPointerVarOf<PFNGLGENASYNCMARKERSSGIXPROC>
typealias PFNGLGENASYNCMARKERSSGIXPROC = CPointer<CFunction<CFunctionType487>>

typealias PFNGLDELETEASYNCMARKERSSGIXPROCVar = CPointerVarOf<PFNGLDELETEASYNCMARKERSSGIXPROC>
typealias PFNGLDELETEASYNCMARKERSSGIXPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLISASYNCMARKERSGIXPROCVar = CPointerVarOf<PFNGLISASYNCMARKERSGIXPROC>
typealias PFNGLISASYNCMARKERSGIXPROC = CPointer<CFunction<CFunctionType65>>

typealias PFNGLFLUSHRASTERSGIXPROCVar = CPointerVarOf<PFNGLFLUSHRASTERSGIXPROC>
typealias PFNGLFLUSHRASTERSGIXPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLFRAGMENTCOLORMATERIALSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTCOLORMATERIALSGIXPROC>
typealias PFNGLFRAGMENTCOLORMATERIALSGIXPROC = CPointer<CFunction<CFunctionType66>>

typealias PFNGLFRAGMENTLIGHTFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTFSGIXPROC>
typealias PFNGLFRAGMENTLIGHTFSGIXPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLFRAGMENTLIGHTFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTFVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTFVSGIXPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLFRAGMENTLIGHTISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTISGIXPROC>
typealias PFNGLFRAGMENTLIGHTISGIXPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLFRAGMENTLIGHTIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTIVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTIVSGIXPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLFRAGMENTLIGHTMODELFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELFSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELFSGIXPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLFRAGMENTLIGHTMODELFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELFVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELFVSGIXPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLFRAGMENTLIGHTMODELISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELISGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELISGIXPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLFRAGMENTLIGHTMODELIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTLIGHTMODELIVSGIXPROC>
typealias PFNGLFRAGMENTLIGHTMODELIVSGIXPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLFRAGMENTMATERIALFSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALFSGIXPROC>
typealias PFNGLFRAGMENTMATERIALFSGIXPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLFRAGMENTMATERIALFVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALFVSGIXPROC>
typealias PFNGLFRAGMENTMATERIALFVSGIXPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLFRAGMENTMATERIALISGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALISGIXPROC>
typealias PFNGLFRAGMENTMATERIALISGIXPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLFRAGMENTMATERIALIVSGIXPROCVar = CPointerVarOf<PFNGLFRAGMENTMATERIALIVSGIXPROC>
typealias PFNGLFRAGMENTMATERIALIVSGIXPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLGETFRAGMENTLIGHTFVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTLIGHTFVSGIXPROC>
typealias PFNGLGETFRAGMENTLIGHTFVSGIXPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETFRAGMENTLIGHTIVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTLIGHTIVSGIXPROC>
typealias PFNGLGETFRAGMENTLIGHTIVSGIXPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLGETFRAGMENTMATERIALFVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTMATERIALFVSGIXPROC>
typealias PFNGLGETFRAGMENTMATERIALFVSGIXPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETFRAGMENTMATERIALIVSGIXPROCVar = CPointerVarOf<PFNGLGETFRAGMENTMATERIALIVSGIXPROC>
typealias PFNGLGETFRAGMENTMATERIALIVSGIXPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLLIGHTENVISGIXPROCVar = CPointerVarOf<PFNGLLIGHTENVISGIXPROC>
typealias PFNGLLIGHTENVISGIXPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLFRAMEZOOMSGIXPROCVar = CPointerVarOf<PFNGLFRAMEZOOMSGIXPROC>
typealias PFNGLFRAMEZOOMSGIXPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLIGLOOINTERFACESGIXPROCVar = CPointerVarOf<PFNGLIGLOOINTERFACESGIXPROC>
typealias PFNGLIGLOOINTERFACESGIXPROC = CPointer<CFunction<CFunctionType157>>

typealias PFNGLGETINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLGETINSTRUMENTSSGIXPROC>
typealias PFNGLGETINSTRUMENTSSGIXPROC = CPointer<CFunction<CFunctionType554>>

typealias PFNGLINSTRUMENTSBUFFERSGIXPROCVar = CPointerVarOf<PFNGLINSTRUMENTSBUFFERSGIXPROC>
typealias PFNGLINSTRUMENTSBUFFERSGIXPROC = CPointer<CFunction<CFunctionType555>>

typealias PFNGLPOLLINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLPOLLINSTRUMENTSSGIXPROC>
typealias PFNGLPOLLINSTRUMENTSSGIXPROC = CPointer<CFunction<CFunctionType556>>

typealias PFNGLREADINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLREADINSTRUMENTSSGIXPROC>
typealias PFNGLREADINSTRUMENTSSGIXPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLSTARTINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLSTARTINSTRUMENTSSGIXPROC>
typealias PFNGLSTARTINSTRUMENTSSGIXPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLSTOPINSTRUMENTSSGIXPROCVar = CPointerVarOf<PFNGLSTOPINSTRUMENTSSGIXPROC>
typealias PFNGLSTOPINSTRUMENTSSGIXPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLGETLISTPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLGETLISTPARAMETERFVSGIXPROC>
typealias PFNGLGETLISTPARAMETERFVSGIXPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETLISTPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLGETLISTPARAMETERIVSGIXPROC>
typealias PFNGLGETLISTPARAMETERIVSGIXPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLLISTPARAMETERFSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERFSGIXPROC>
typealias PFNGLLISTPARAMETERFSGIXPROC = CPointer<CFunction<CFunctionType152>>

typealias PFNGLLISTPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERFVSGIXPROC>
typealias PFNGLLISTPARAMETERFVSGIXPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLLISTPARAMETERISGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERISGIXPROC>
typealias PFNGLLISTPARAMETERISGIXPROC = CPointer<CFunction<CFunctionType151>>

typealias PFNGLLISTPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLLISTPARAMETERIVSGIXPROC>
typealias PFNGLLISTPARAMETERIVSGIXPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLPIXELTEXGENSGIXPROCVar = CPointerVarOf<PFNGLPIXELTEXGENSGIXPROC>
typealias PFNGLPIXELTEXGENSGIXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDEFORMATIONMAP3DSGIXPROCVar = CPointerVarOf<PFNGLDEFORMATIONMAP3DSGIXPROC>
typealias PFNGLDEFORMATIONMAP3DSGIXPROC = CPointer<CFunction<CFunctionType557>>

typealias PFNGLDEFORMATIONMAP3FSGIXPROCVar = CPointerVarOf<PFNGLDEFORMATIONMAP3FSGIXPROC>
typealias PFNGLDEFORMATIONMAP3FSGIXPROC = CPointer<CFunction<CFunctionType558>>

typealias PFNGLDEFORMSGIXPROCVar = CPointerVarOf<PFNGLDEFORMSGIXPROC>
typealias PFNGLDEFORMSGIXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROCVar = CPointerVarOf<PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC>
typealias PFNGLLOADIDENTITYDEFORMATIONMAPSGIXPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLREFERENCEPLANESGIXPROCVar = CPointerVarOf<PFNGLREFERENCEPLANESGIXPROC>
typealias PFNGLREFERENCEPLANESGIXPROC = CPointer<CFunction<CFunctionType41>>

typealias PFNGLSPRITEPARAMETERFSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERFSGIXPROC>
typealias PFNGLSPRITEPARAMETERFSGIXPROC = CPointer<CFunction<CFunctionType17>>

typealias PFNGLSPRITEPARAMETERFVSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERFVSGIXPROC>
typealias PFNGLSPRITEPARAMETERFVSGIXPROC = CPointer<CFunction<CFunctionType18>>

typealias PFNGLSPRITEPARAMETERISGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERISGIXPROC>
typealias PFNGLSPRITEPARAMETERISGIXPROC = CPointer<CFunction<CFunctionType19>>

typealias PFNGLSPRITEPARAMETERIVSGIXPROCVar = CPointerVarOf<PFNGLSPRITEPARAMETERIVSGIXPROC>
typealias PFNGLSPRITEPARAMETERIVSGIXPROC = CPointer<CFunction<CFunctionType20>>

typealias PFNGLTAGSAMPLEBUFFERSGIXPROCVar = CPointerVarOf<PFNGLTAGSAMPLEBUFFERSGIXPROC>
typealias PFNGLTAGSAMPLEBUFFERSGIXPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLCOLORTABLESGIPROC>
typealias PFNGLCOLORTABLESGIPROC = CPointer<CFunction<CFunctionType367>>

typealias PFNGLCOLORTABLEPARAMETERFVSGIPROCVar = CPointerVarOf<PFNGLCOLORTABLEPARAMETERFVSGIPROC>
typealias PFNGLCOLORTABLEPARAMETERFVSGIPROC = CPointer<CFunction<CFunctionType153>>

typealias PFNGLCOLORTABLEPARAMETERIVSGIPROCVar = CPointerVarOf<PFNGLCOLORTABLEPARAMETERIVSGIPROC>
typealias PFNGLCOLORTABLEPARAMETERIVSGIPROC = CPointer<CFunction<CFunctionType114>>

typealias PFNGLCOPYCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLCOPYCOLORTABLESGIPROC>
typealias PFNGLCOPYCOLORTABLESGIPROC = CPointer<CFunction<CFunctionType369>>

typealias PFNGLGETCOLORTABLESGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLESGIPROC>
typealias PFNGLGETCOLORTABLESGIPROC = CPointer<CFunction<CFunctionType342>>

typealias PFNGLGETCOLORTABLEPARAMETERFVSGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERFVSGIPROC>
typealias PFNGLGETCOLORTABLEPARAMETERFVSGIPROC = CPointer<CFunction<CFunctionType85>>

typealias PFNGLGETCOLORTABLEPARAMETERIVSGIPROCVar = CPointerVarOf<PFNGLGETCOLORTABLEPARAMETERIVSGIPROC>
typealias PFNGLGETCOLORTABLEPARAMETERIVSGIPROC = CPointer<CFunction<CFunctionType67>>

typealias PFNGLFINISHTEXTURESUNXPROCVar = CPointerVarOf<PFNGLFINISHTEXTURESUNXPROC>
typealias PFNGLFINISHTEXTURESUNXPROC = CPointer<CFunction<CFunctionType1>>

typealias PFNGLGLOBALALPHAFACTORBSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORBSUNPROC>
typealias PFNGLGLOBALALPHAFACTORBSUNPROC = CPointer<CFunction<CFunctionType322>>

typealias PFNGLGLOBALALPHAFACTORSSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORSSUNPROC>
typealias PFNGLGLOBALALPHAFACTORSSUNPROC = CPointer<CFunction<CFunctionType559>>

typealias PFNGLGLOBALALPHAFACTORISUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORISUNPROC>
typealias PFNGLGLOBALALPHAFACTORISUNPROC = CPointer<CFunction<CFunctionType302>>

typealias PFNGLGLOBALALPHAFACTORFSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORFSUNPROC>
typealias PFNGLGLOBALALPHAFACTORFSUNPROC = CPointer<CFunction<CFunctionType38>>

typealias PFNGLGLOBALALPHAFACTORDSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORDSUNPROC>
typealias PFNGLGLOBALALPHAFACTORDSUNPROC = CPointer<CFunction<CFunctionType40>>

typealias PFNGLGLOBALALPHAFACTORUBSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUBSUNPROC>
typealias PFNGLGLOBALALPHAFACTORUBSUNPROC = CPointer<CFunction<CFunctionType560>>

typealias PFNGLGLOBALALPHAFACTORUSSUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUSSUNPROC>
typealias PFNGLGLOBALALPHAFACTORUSSUNPROC = CPointer<CFunction<CFunctionType480>>

typealias PFNGLGLOBALALPHAFACTORUISUNPROCVar = CPointerVarOf<PFNGLGLOBALALPHAFACTORUISUNPROC>
typealias PFNGLGLOBALALPHAFACTORUISUNPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLDRAWMESHARRAYSSUNPROCVar = CPointerVarOf<PFNGLDRAWMESHARRAYSSUNPROC>
typealias PFNGLDRAWMESHARRAYSSUNPROC = CPointer<CFunction<CFunctionType29>>

typealias PFNGLREPLACEMENTCODEUISUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUISUNPROC>
typealias PFNGLREPLACEMENTCODEUISUNPROC = CPointer<CFunction<CFunctionType6>>

typealias PFNGLREPLACEMENTCODEUSSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUSSUNPROC>
typealias PFNGLREPLACEMENTCODEUSSUNPROC = CPointer<CFunction<CFunctionType480>>

typealias PFNGLREPLACEMENTCODEUBSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUBSUNPROC>
typealias PFNGLREPLACEMENTCODEUBSUNPROC = CPointer<CFunction<CFunctionType560>>

typealias PFNGLREPLACEMENTCODEUIVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVSUNPROC = CPointer<CFunction<CFunctionType54>>

typealias PFNGLREPLACEMENTCODEUSVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUSVSUNPROC>
typealias PFNGLREPLACEMENTCODEUSVSUNPROC = CPointer<CFunction<CFunctionType56>>

typealias PFNGLREPLACEMENTCODEUBVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUBVSUNPROC>
typealias PFNGLREPLACEMENTCODEUBVSUNPROC = CPointer<CFunction<CFunctionType52>>

typealias PFNGLREPLACEMENTCODEPOINTERSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEPOINTERSUNPROC>
typealias PFNGLREPLACEMENTCODEPOINTERSUNPROC = CPointer<CFunction<CFunctionType561>>

typealias PFNGLCOLOR4UBVERTEX2FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX2FSUNPROC>
typealias PFNGLCOLOR4UBVERTEX2FSUNPROC = CPointer<CFunction<CFunctionType562>>

typealias PFNGLCOLOR4UBVERTEX2FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX2FVSUNPROC>
typealias PFNGLCOLOR4UBVERTEX2FVSUNPROC = CPointer<CFunction<CFunctionType563>>

typealias PFNGLCOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLCOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType564>>

typealias PFNGLCOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLCOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType563>>

typealias PFNGLCOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR3FVERTEX3FSUNPROC>
typealias PFNGLCOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType333>>

typealias PFNGLCOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLCOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType565>>

typealias PFNGLNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType333>>

typealias PFNGLNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType565>>

typealias PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType566>>

typealias PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType567>>

typealias PFNGLTEXCOORD2FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType568>>

typealias PFNGLTEXCOORD2FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType565>>

typealias PFNGLTEXCOORD4FVERTEX4FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FVERTEX4FSUNPROC>
typealias PFNGLTEXCOORD4FVERTEX4FSUNPROC = CPointer<CFunction<CFunctionType259>>

typealias PFNGLTEXCOORD4FVERTEX4FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FVERTEX4FVSUNPROC>
typealias PFNGLTEXCOORD4FVERTEX4FVSUNPROC = CPointer<CFunction<CFunctionType565>>

typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType569>>

typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType570>>

typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType259>>

typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType567>>

typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType259>>

typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType567>>

typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType571>>

typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLTEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType572>>

typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC>
typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC = CPointer<CFunction<CFunctionType573>>

typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROCVar = CPointerVarOf<PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC>
typealias PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC = CPointer<CFunction<CFunctionType572>>

typealias PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType28>>

typealias PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUIVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType574>>

typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType575>>

typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4UBVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType576>>

typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType577>>

typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType578>>

typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType577>>

typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUINORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType578>>

typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType579>>

typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUICOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType580>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType581>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType578>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType582>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType580>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FSUNPROC = CPointer<CFunction<CFunctionType583>>

typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROCVar = CPointerVarOf<PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC>
typealias PFNGLREPLACEMENTCODEUITEXCOORD2FCOLOR4FNORMAL3FVERTEX3FVSUNPROC = CPointer<CFunction<CFunctionType584>>

typealias PFNGLBLENDEQUATIONSEPARATEATIPROCVar = CPointerVarOf<PFNGLBLENDEQUATIONSEPARATEATIPROC>
typealias PFNGLBLENDEQUATIONSEPARATEATIPROC = CPointer<CFunction<CFunctionType66>>

typealias GLeglImageOESVar = CPointerVarOf<GLeglImageOES>
typealias GLeglImageOES = COpaquePointer

typealias PFNGLEGLIMAGETARGETTEXTURE2DOESPROCVar = CPointerVarOf<PFNGLEGLIMAGETARGETTEXTURE2DOESPROC>
typealias PFNGLEGLIMAGETARGETTEXTURE2DOESPROC = CPointer<CFunction<CFunctionType585>>

typealias PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROCVar = CPointerVarOf<PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC>
typealias PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC = CPointer<CFunction<CFunctionType585>>

typealias GLUnurbsObj = GLUnurbs

typealias GLUquadricObj = GLUquadric

typealias GLUtesselatorObj = GLUtesselator

typealias GLUtriangulatorObj = GLUtesselator

typealias _GLUfuncptrVar = CPointerVarOf<_GLUfuncptr>
typealias _GLUfuncptr = CPointer<CFunction<CFunctionType1>>

object CFunctionType1 : CTriviallyAdaptedFunctionType<() -> Unit>()

object CFunctionType2 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType3 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType4 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType5 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType6 : CTriviallyAdaptedFunctionType<(Int) -> Unit>()

object CFunctionType7 : CTriviallyAdaptedFunctionType<(Float, Byte) -> Unit>()

object CFunctionType8 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType9 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType10 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType11 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType12 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType13 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType14 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType15 : CTriviallyAdaptedFunctionType<(Int, Double) -> Unit>()

object CFunctionType16 : CTriviallyAdaptedFunctionType<(Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType17 : CTriviallyAdaptedFunctionType<(Int, Float) -> Unit>()

object CFunctionType18 : CTriviallyAdaptedFunctionType<(Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType19 : CTriviallyAdaptedFunctionType<(Int, Int) -> Unit>()

object CFunctionType20 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType21 : CTriviallyAdaptedFunctionType<(Int, Short) -> Unit>()

object CFunctionType22 : CTriviallyAdaptedFunctionType<(Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType23 : CTriviallyAdaptedFunctionType<(Int, Double, Double) -> Unit>()

object CFunctionType24 : CTriviallyAdaptedFunctionType<(Int, Float, Float) -> Unit>()

object CFunctionType25 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType26 : CTriviallyAdaptedFunctionType<(Int, Short, Short) -> Unit>()

object CFunctionType27 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Double) -> Unit>()

object CFunctionType28 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float) -> Unit>()

object CFunctionType29 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType30 : CTriviallyAdaptedFunctionType<(Int, Short, Short, Short) -> Unit>()

object CFunctionType31 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Double, Double) -> Unit>()

object CFunctionType32 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float) -> Unit>()

object CFunctionType33 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType34 : CTriviallyAdaptedFunctionType<(Int, Short, Short, Short, Short) -> Unit>()

object CFunctionType35 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType36 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType37 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, Int, CPointer<COpaquePointerVar>?, Int) -> Unit>()

object CFunctionType38 : CTriviallyAdaptedFunctionType<(Float) -> Unit>()

object CFunctionType39 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?) -> Unit>()

object CFunctionType40 : CTriviallyAdaptedFunctionType<(Double) -> Unit>()

object CFunctionType41 : CTriviallyAdaptedFunctionType<(CPointer<DoubleVar>?) -> Unit>()

object CFunctionType42 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType43 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte) -> Unit>()

object CFunctionType44 : CTriviallyAdaptedFunctionType<(CPointer<ByteVar>?) -> Unit>()

object CFunctionType45 : CTriviallyAdaptedFunctionType<(Double, Double, Double) -> Unit>()

object CFunctionType46 : CTriviallyAdaptedFunctionType<(Float, Float, Float) -> Unit>()

object CFunctionType47 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType48 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?) -> Unit>()

object CFunctionType49 : CTriviallyAdaptedFunctionType<(Short, Short, Short) -> Unit>()

object CFunctionType50 : CTriviallyAdaptedFunctionType<(CPointer<ShortVar>?) -> Unit>()

object CFunctionType51 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte) -> Unit>()

object CFunctionType52 : CTriviallyAdaptedFunctionType<(CPointer<ByteVar>?) -> Unit>()

object CFunctionType53 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType54 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?) -> Unit>()

object CFunctionType55 : CTriviallyAdaptedFunctionType<(Short, Short, Short) -> Unit>()

object CFunctionType56 : CTriviallyAdaptedFunctionType<(CPointer<ShortVar>?) -> Unit>()

object CFunctionType57 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType58 : CTriviallyAdaptedFunctionType<(Double, Double) -> Unit>()

object CFunctionType59 : CTriviallyAdaptedFunctionType<(Float, Float) -> Unit>()

object CFunctionType60 : CTriviallyAdaptedFunctionType<(Int, Int) -> Unit>()

object CFunctionType61 : CTriviallyAdaptedFunctionType<(Short, Short) -> Unit>()

object CFunctionType62 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float) -> Unit>()

object CFunctionType63 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType64 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType65 : CTriviallyAdaptedFunctionType<(Int) -> Byte>()

object CFunctionType66 : CTriviallyAdaptedFunctionType<(Int, Int) -> Unit>()

object CFunctionType67 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType68 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType69 : CTriviallyAdaptedFunctionType<(Int, Long, COpaquePointer?, Int) -> Unit>()

object CFunctionType70 : CTriviallyAdaptedFunctionType<(Int, Long, Long, COpaquePointer?) -> Unit>()

object CFunctionType71 : CTriviallyAdaptedFunctionType<(Int, Long, Long, COpaquePointer?) -> Unit>()

object CFunctionType72 : CTriviallyAdaptedFunctionType<(Int, Int) -> COpaquePointer?>()

object CFunctionType73 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType74 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType75 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType76 : CTriviallyAdaptedFunctionType<() -> Int>()

object CFunctionType77 : CTriviallyAdaptedFunctionType<(Int) -> Int>()

object CFunctionType78 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType79 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType80 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Int>()

object CFunctionType81 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType82 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType83 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType84 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType85 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType86 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType87 : CTriviallyAdaptedFunctionType<(Int, Float) -> Unit>()

object CFunctionType88 : CTriviallyAdaptedFunctionType<(Int, Float, Float) -> Unit>()

object CFunctionType89 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float) -> Unit>()

object CFunctionType90 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float) -> Unit>()

object CFunctionType91 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType92 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType93 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType94 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType95 : CTriviallyAdaptedFunctionType<(Int, Int, Byte, CPointer<FloatVar>?) -> Unit>()

object CFunctionType96 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType97 : CTriviallyAdaptedFunctionType<(Int, Byte, Byte, Byte, Byte) -> Unit>()

object CFunctionType98 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType99 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType100 : CTriviallyAdaptedFunctionType<(Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType101 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int, COpaquePointer?) -> Unit>()

object CFunctionType102 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType103 : CTriviallyAdaptedFunctionType<(Int, Int) -> Byte>()

object CFunctionType104 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Long, Long) -> Unit>()

object CFunctionType105 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<CPointerVar<ByteVar>>?, Int) -> Unit>()

object CFunctionType106 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType107 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType108 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType109 : CTriviallyAdaptedFunctionType<(Int, Int) -> Unit>()

object CFunctionType110 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType111 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType112 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType113 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType114 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType115 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType116 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType117 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType118 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType119 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Int) -> Unit>()

object CFunctionType120 : CTriviallyAdaptedFunctionType<(Int, Int) -> CPointer<ByteVar>?>()

object CFunctionType121 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType122 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType123 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType124 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType125 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType126 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType127 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType128 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Int) -> COpaquePointer?>()

object CFunctionType129 : CTriviallyAdaptedFunctionType<(Int, Long, Long) -> Unit>()

object CFunctionType130 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int) -> Unit>()

object CFunctionType131 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Long) -> Unit>()

object CFunctionType132 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType133 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType134 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType135 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Int>()

object CFunctionType136 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?, Int) -> Unit>()

object CFunctionType137 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int, Int) -> Unit>()

object CFunctionType138 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, Int, CPointer<COpaquePointerVar>?, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType139 : CTriviallyAdaptedFunctionType<(Int, Int) -> CPointer<__GLsync>?>()

object CFunctionType140 : CTriviallyAdaptedFunctionType<(CPointer<__GLsync>?) -> Byte>()

object CFunctionType141 : CTriviallyAdaptedFunctionType<(CPointer<__GLsync>?) -> Unit>()

object CFunctionType142 : CTriviallyAdaptedFunctionType<(CPointer<__GLsync>?, Int, Long) -> Int>()

object CFunctionType143 : CTriviallyAdaptedFunctionType<(CPointer<__GLsync>?, Int, Long) -> Unit>()

object CFunctionType144 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType145 : CTriviallyAdaptedFunctionType<(CPointer<__GLsync>?, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType146 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType147 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType148 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType149 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType150 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType151 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType152 : CTriviallyAdaptedFunctionType<(Int, Int, Float) -> Unit>()

object CFunctionType153 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType154 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType155 : CTriviallyAdaptedFunctionType<(Int, Int, Byte, Int) -> Unit>()

object CFunctionType156 : CTriviallyAdaptedFunctionType<(Int, Int, Byte, CPointer<IntVar>?) -> Unit>()

object CFunctionType157 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?) -> Unit>()

object CFunctionType158 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType159 : CTriviallyAdaptedFunctionType<(Int, Double) -> Unit>()

object CFunctionType160 : CTriviallyAdaptedFunctionType<(Int, Double, Double) -> Unit>()

object CFunctionType161 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Double) -> Unit>()

object CFunctionType162 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Double, Double) -> Unit>()

object CFunctionType163 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType164 : CTriviallyAdaptedFunctionType<(Int, Int, Byte, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType165 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType166 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Int>()

object CFunctionType167 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Int>()

object CFunctionType168 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType169 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType170 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, Int, COpaquePointer?, Int) -> Unit>()

object CFunctionType171 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType172 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<IntVar>?, COpaquePointer?) -> Unit>()

object CFunctionType173 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int) -> Unit>()

object CFunctionType174 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<CPointerVar<ByteVar>>?) -> Int>()

object CFunctionType175 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType176 : CTriviallyAdaptedFunctionType<(Int, Int, Float) -> Unit>()

object CFunctionType177 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType178 : CTriviallyAdaptedFunctionType<(Int, Int, Double) -> Unit>()

object CFunctionType179 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType180 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType181 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType182 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float) -> Unit>()

object CFunctionType183 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double) -> Unit>()

object CFunctionType184 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType185 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Float) -> Unit>()

object CFunctionType186 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double, Double) -> Unit>()

object CFunctionType187 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType188 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType189 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Float, Float) -> Unit>()

object CFunctionType190 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double, Double, Double) -> Unit>()

object CFunctionType191 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType192 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, CPointer<FloatVar>?) -> Unit>()

object CFunctionType193 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType194 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType195 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType196 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int, Int) -> Unit>()

object CFunctionType197 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int, Int, Int) -> Unit>()

object CFunctionType198 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType199 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int, Int, Int) -> Unit>()

object CFunctionType200 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Unit>()

object CFunctionType201 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType202 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, CPointer<ByteVar>?, COpaquePointer?) -> Unit>()

object CFunctionType203 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType204 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType205 : CTriviallyAdaptedFunctionType<(Long) -> Unit>()

object CFunctionType206 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType207 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType208 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType209 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, Int, Int, Int, Int) -> Unit>()

object CFunctionType210 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?, Int, Int) -> Unit>()

object CFunctionType211 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int) -> Unit>()

object CFunctionType212 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType213 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType214 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Int) -> Unit>()

object CFunctionType215 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int) -> Unit>()

object CFunctionType216 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?, Byte) -> Unit>()

object CFunctionType217 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType218 : CTriviallyAdaptedFunctionType<(CPointer<CFunction<CFunctionType202>>?, COpaquePointer?) -> Unit>()

object CFunctionType219 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<ByteVar>?) -> Int>()

object CFunctionType220 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType221 : CTriviallyAdaptedFunctionType<(COpaquePointer?, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType222 : CTriviallyAdaptedFunctionType<(COpaquePointer?, Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType223 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType224 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType225 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<LongVar>?, CPointer<LongVar>?) -> Unit>()

object CFunctionType226 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<LongVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType227 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType228 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType229 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType230 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Float, Int) -> Unit>()

object CFunctionType231 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType232 : CTriviallyAdaptedFunctionType<(Int, Int) -> Int>()

object CFunctionType233 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType234 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType235 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType236 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType237 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType238 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType239 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Long, Int) -> Unit>()

object CFunctionType240 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<LongVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType241 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Byte, Int) -> Unit>()

object CFunctionType242 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType243 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Long) -> Unit>()

object CFunctionType244 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType245 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType246 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType247 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType248 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType249 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType250 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType251 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType252 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType253 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType254 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType255 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType256 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType257 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?, Int, COpaquePointer?, COpaquePointer?) -> Unit>()

object CFunctionType258 : CTriviallyAdaptedFunctionType<(Int, Byte, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType259 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType260 : CTriviallyAdaptedFunctionType<(Int) -> Long>()

object CFunctionType261 : CTriviallyAdaptedFunctionType<(Int, Int) -> Long>()

object CFunctionType262 : CTriviallyAdaptedFunctionType<(Long) -> Unit>()

object CFunctionType263 : CTriviallyAdaptedFunctionType<(Int, Int, Byte, Int, Int) -> Long>()

object CFunctionType264 : CTriviallyAdaptedFunctionType<(Long, Int) -> Unit>()

object CFunctionType265 : CTriviallyAdaptedFunctionType<(Int, Long) -> Unit>()

object CFunctionType266 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType267 : CTriviallyAdaptedFunctionType<(Int, Int, Long) -> Unit>()

object CFunctionType268 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType269 : CTriviallyAdaptedFunctionType<(Long) -> Byte>()

object CFunctionType270 : CTriviallyAdaptedFunctionType<(Int, Long) -> Unit>()

object CFunctionType271 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType272 : CTriviallyAdaptedFunctionType<(CPointer<_cl_context>?, CPointer<_cl_event>?, Int) -> CPointer<__GLsync>?>()

object CFunctionType273 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType274 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType275 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double, Double, Double) -> Unit>()

object CFunctionType276 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType277 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Float, Float) -> Unit>()

object CFunctionType278 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType279 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType280 : CTriviallyAdaptedFunctionType<(Int, Long) -> Unit>()

object CFunctionType281 : CTriviallyAdaptedFunctionType<(Int, Long, Long) -> Unit>()

object CFunctionType282 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long) -> Unit>()

object CFunctionType283 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType284 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType285 : CTriviallyAdaptedFunctionType<(Int, Long, Long) -> Unit>()

object CFunctionType286 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long) -> Unit>()

object CFunctionType287 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType288 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType289 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType290 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType291 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType292 : CTriviallyAdaptedFunctionType<(Int, Int, Long) -> Unit>()

object CFunctionType293 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long) -> Unit>()

object CFunctionType294 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Long) -> Unit>()

object CFunctionType295 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType296 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType297 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long) -> Unit>()

object CFunctionType298 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Long) -> Unit>()

object CFunctionType299 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType300 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Int, Int) -> Unit>()

object CFunctionType301 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long, Int, Int) -> Unit>()

object CFunctionType302 : CTriviallyAdaptedFunctionType<(Int) -> Unit>()

object CFunctionType303 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType304 : CTriviallyAdaptedFunctionType<(Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType305 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<CPointerVar<ByteVar>>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType306 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType307 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType308 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Byte>()

object CFunctionType309 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?, Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Unit>()

object CFunctionType310 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType311 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Byte) -> Unit>()

object CFunctionType312 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType313 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType314 : CTriviallyAdaptedFunctionType<(Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType315 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType316 : CTriviallyAdaptedFunctionType<(Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType317 : CTriviallyAdaptedFunctionType<(Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType318 : CTriviallyAdaptedFunctionType<(Int, Byte) -> Unit>()

object CFunctionType319 : CTriviallyAdaptedFunctionType<(Int, Byte, Byte) -> Unit>()

object CFunctionType320 : CTriviallyAdaptedFunctionType<(Int, Byte, Byte, Byte) -> Unit>()

object CFunctionType321 : CTriviallyAdaptedFunctionType<(Int, Byte, Byte, Byte, Byte) -> Unit>()

object CFunctionType322 : CTriviallyAdaptedFunctionType<(Byte) -> Unit>()

object CFunctionType323 : CTriviallyAdaptedFunctionType<(Byte, Byte) -> Unit>()

object CFunctionType324 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte, Byte) -> Unit>()

object CFunctionType325 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType326 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType327 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType328 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType329 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType330 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType331 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType332 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<IntVar>?) -> Int>()

object CFunctionType333 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType334 : CTriviallyAdaptedFunctionType<(Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType335 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<ByteVar>?, COpaquePointer?) -> Unit>()

object CFunctionType336 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, Byte) -> Unit>()

object CFunctionType337 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType338 : CTriviallyAdaptedFunctionType<(CPointer<CFunction<CFunctionType335>>?, COpaquePointer?) -> Unit>()

object CFunctionType339 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<ByteVar>?) -> Int>()

object CFunctionType340 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType341 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<IntVar>?, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType342 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType343 : CTriviallyAdaptedFunctionType<(Int, Byte, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType344 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType345 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType346 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType347 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType348 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Int>()

object CFunctionType349 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?) -> Unit>()

object CFunctionType350 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType351 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType352 : CTriviallyAdaptedFunctionType<(Int, Int, Double, Double, Int, Int, Double, Double, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType353 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Int, Int, Float, Float, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType354 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType355 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType356 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType357 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType358 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType359 : CTriviallyAdaptedFunctionType<(Int) -> COpaquePointer?>()

object CFunctionType360 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?, Int) -> Int>()

object CFunctionType361 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int) -> Unit>()

object CFunctionType362 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType363 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int, Int, Int) -> Unit>()

object CFunctionType364 : CTriviallyAdaptedFunctionType<(Int, Int) -> Int>()

object CFunctionType365 : CTriviallyAdaptedFunctionType<(Int, Int) -> Long>()

object CFunctionType366 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType367 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType368 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType369 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType370 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType371 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Unit>()

object CFunctionType372 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, COpaquePointer?, COpaquePointer?) -> Unit>()

object CFunctionType373 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType374 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType375 : CTriviallyAdaptedFunctionType<(Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType376 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Double, Double, Double, Double) -> Unit>()

object CFunctionType377 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Float) -> Unit>()

object CFunctionType378 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType379 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType380 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType381 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType382 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType383 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType384 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType385 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType386 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType387 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType388 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType389 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType390 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType391 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType392 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType393 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType394 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Double) -> Unit>()

object CFunctionType395 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType396 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType397 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType398 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType399 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType400 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType401 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType402 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType403 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType404 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType405 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType406 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType407 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType408 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType409 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType410 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType411 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Double, Double, Double, Double) -> Unit>()

object CFunctionType412 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Float, Float, Float, Float) -> Unit>()

object CFunctionType413 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType414 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Long) -> Unit>()

object CFunctionType415 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Long) -> Unit>()

object CFunctionType416 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Long) -> Unit>()

object CFunctionType417 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Long) -> Unit>()

object CFunctionType418 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Byte, Int, Long) -> Unit>()

object CFunctionType419 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType420 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Long, Long) -> Unit>()

object CFunctionType421 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType422 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType423 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType424 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType425 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType426 : CTriviallyAdaptedFunctionType<(Int, Byte, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType427 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte) -> Unit>()

object CFunctionType428 : CTriviallyAdaptedFunctionType<(Int, Int, Byte) -> Unit>()

object CFunctionType429 : CTriviallyAdaptedFunctionType<(Int, Byte) -> Unit>()

object CFunctionType430 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int, Int, Int) -> Unit>()

object CFunctionType431 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType432 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<ByteVar>?) -> Byte>()

object CFunctionType433 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType434 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType435 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType436 : CTriviallyAdaptedFunctionType<(Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType437 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType438 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int) -> Int>()

object CFunctionType439 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType440 : CTriviallyAdaptedFunctionType<(Int, Long, Int) -> CPointer<__GLsync>?>()

object CFunctionType441 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?) -> Unit>()

object CFunctionType442 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, Int, Int) -> Unit>()

object CFunctionType443 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<IntVar>?, Int, CPointer<COpaquePointerVar>?, Int, Int) -> Unit>()

object CFunctionType444 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<COpaquePointerVar>?, Int) -> Unit>()

object CFunctionType445 : CTriviallyAdaptedFunctionType<(Int, CPointer<CPointerVar<ByteVar>>?, Int) -> Unit>()

object CFunctionType446 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<COpaquePointerVar>?, Int) -> Unit>()

object CFunctionType447 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> COpaquePointer?>()

object CFunctionType448 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType449 : CTriviallyAdaptedFunctionType<(Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType450 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType451 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?) -> Unit>()

object CFunctionType452 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<ByteVar>?, Int, CPointer<ByteVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<LongVar>?) -> Unit>()

object CFunctionType453 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, CPointer<IntVar>?) -> Unit>()

object CFunctionType454 : CTriviallyAdaptedFunctionType<(CPointer<ByteVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType455 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType456 : CTriviallyAdaptedFunctionType<(Double, Double, Double, Double) -> Unit>()

object CFunctionType457 : CTriviallyAdaptedFunctionType<(Short, Short, Short, Short) -> Unit>()

object CFunctionType458 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?, Int, Int, Int) -> Unit>()

object CFunctionType459 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int) -> Unit>()

object CFunctionType460 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?, Int, Int, Int, Int) -> Unit>()

object CFunctionType461 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int) -> Unit>()

object CFunctionType462 : CTriviallyAdaptedFunctionType<(Int) -> Short>()

object CFunctionType463 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<LongVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType464 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType465 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType466 : CTriviallyAdaptedFunctionType<(CPointer<LongVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType467 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<COpaquePointerVar>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType468 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType469 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Byte, COpaquePointer?) -> Unit>()

object CFunctionType470 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Byte, COpaquePointer?) -> Unit>()

object CFunctionType471 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, Float, Float, Float, Float) -> Unit>()

object CFunctionType472 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType473 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, Double, Double, Double, Double) -> Unit>()

object CFunctionType474 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType475 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType476 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType477 : CTriviallyAdaptedFunctionType<(Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType478 : CTriviallyAdaptedFunctionType<(Short, Short) -> Unit>()

object CFunctionType479 : CTriviallyAdaptedFunctionType<(Short, Short, Short, Short) -> Unit>()

object CFunctionType480 : CTriviallyAdaptedFunctionType<(Short) -> Unit>()

object CFunctionType481 : CTriviallyAdaptedFunctionType<(Int, Short) -> Unit>()

object CFunctionType482 : CTriviallyAdaptedFunctionType<(Int, Short, Short) -> Unit>()

object CFunctionType483 : CTriviallyAdaptedFunctionType<(Int, Short, Short, Short) -> Unit>()

object CFunctionType484 : CTriviallyAdaptedFunctionType<(Int, Short, Short, Short, Short) -> Unit>()

object CFunctionType485 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType486 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType487 : CTriviallyAdaptedFunctionType<(Int) -> Int>()

object CFunctionType488 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType489 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType490 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<ByteVar>?, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType491 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType492 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, COpaquePointer?, Int, Int, Float) -> Unit>()

object CFunctionType493 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, Int, Float) -> Unit>()

object CFunctionType494 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType495 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType496 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType497 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType498 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType499 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType500 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType501 : CTriviallyAdaptedFunctionType<(Int, Int, Int, COpaquePointer?, Int, Float, Float, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType502 : CTriviallyAdaptedFunctionType<(Int, Int, Float, Float) -> Byte>()

object CFunctionType503 : CTriviallyAdaptedFunctionType<(Int, Float, Float) -> Byte>()

object CFunctionType504 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Float>()

object CFunctionType505 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Float, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Byte>()

object CFunctionType506 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType507 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType508 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?, Int, Int, Float, CPointer<IntVar>?) -> Int>()

object CFunctionType509 : CTriviallyAdaptedFunctionType<(Int, Int, COpaquePointer?, Int, Int, Int, Int, Float) -> Int>()

object CFunctionType510 : CTriviallyAdaptedFunctionType<(Int, Int, Long, COpaquePointer?, Int, Int, Int, Int, Float) -> Int>()

object CFunctionType511 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType512 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<IntVar>?, Int, CPointer<IntVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType513 : CTriviallyAdaptedFunctionType<(Int, Long, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType514 : CTriviallyAdaptedFunctionType<(Int, Long, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType515 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Byte, Byte, Byte) -> Unit>()

object CFunctionType516 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType517 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType518 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType519 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType520 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType521 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType522 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Byte) -> Unit>()

object CFunctionType523 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType524 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType525 : CTriviallyAdaptedFunctionType<(Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType526 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, Int, CPointer<IntVar>?, Int) -> Unit>()

object CFunctionType527 : CTriviallyAdaptedFunctionType<(COpaquePointer?, COpaquePointer?) -> Unit>()

object CFunctionType528 : CTriviallyAdaptedFunctionType<(COpaquePointer?, Int, Int, CPointer<IntVar>?) -> Long>()

object CFunctionType529 : CTriviallyAdaptedFunctionType<(Long) -> Byte>()

object CFunctionType530 : CTriviallyAdaptedFunctionType<(Long, Int, Int, CPointer<IntVar>?, CPointer<IntVar>?) -> Unit>()

object CFunctionType531 : CTriviallyAdaptedFunctionType<(Long, Int) -> Unit>()

object CFunctionType532 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType533 : CTriviallyAdaptedFunctionType<(Int, Long) -> Unit>()

object CFunctionType534 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long) -> Unit>()

object CFunctionType535 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType536 : CTriviallyAdaptedFunctionType<(Int, CPointer<LongVar>?) -> Unit>()

object CFunctionType537 : CTriviallyAdaptedFunctionType<(Int, Long, Long) -> Unit>()

object CFunctionType538 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long) -> Unit>()

object CFunctionType539 : CTriviallyAdaptedFunctionType<(Int, Long, Long, Long, Long) -> Unit>()

object CFunctionType540 : CTriviallyAdaptedFunctionType<(Int, Int, Long, Long) -> Unit>()

object CFunctionType541 : CTriviallyAdaptedFunctionType<(Int, Int, Int) -> Unit>()

object CFunctionType542 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Byte, Int) -> Unit>()

object CFunctionType543 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType544 : CTriviallyAdaptedFunctionType<(Int, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType545 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ShortVar>?) -> Unit>()

object CFunctionType546 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<ByteVar>?) -> Unit>()

object CFunctionType547 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?, CPointer<LongVar>?) -> Int>()

object CFunctionType548 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int) -> Unit>()

object CFunctionType549 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?) -> Unit>()

object CFunctionType550 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType551 : CTriviallyAdaptedFunctionType<(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, COpaquePointer?) -> Unit>()

object CFunctionType552 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte, Byte) -> Unit>()

object CFunctionType553 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?) -> Int>()

object CFunctionType554 : CTriviallyAdaptedFunctionType<() -> Int>()

object CFunctionType555 : CTriviallyAdaptedFunctionType<(Int, CPointer<IntVar>?) -> Unit>()

object CFunctionType556 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?) -> Int>()

object CFunctionType557 : CTriviallyAdaptedFunctionType<(Int, Double, Double, Int, Int, Double, Double, Int, Int, Double, Double, Int, Int, CPointer<DoubleVar>?) -> Unit>()

object CFunctionType558 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Int, Int, Float, Float, Int, Int, Float, Float, Int, Int, CPointer<FloatVar>?) -> Unit>()

object CFunctionType559 : CTriviallyAdaptedFunctionType<(Short) -> Unit>()

object CFunctionType560 : CTriviallyAdaptedFunctionType<(Byte) -> Unit>()

object CFunctionType561 : CTriviallyAdaptedFunctionType<(Int, Int, CPointer<COpaquePointerVar>?) -> Unit>()

object CFunctionType562 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte, Byte, Float, Float) -> Unit>()

object CFunctionType563 : CTriviallyAdaptedFunctionType<(CPointer<ByteVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType564 : CTriviallyAdaptedFunctionType<(Byte, Byte, Byte, Byte, Float, Float, Float) -> Unit>()

object CFunctionType565 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType566 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType567 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType568 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType569 : CTriviallyAdaptedFunctionType<(Float, Float, Byte, Byte, Byte, Byte, Float, Float, Float) -> Unit>()

object CFunctionType570 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?, CPointer<ByteVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType571 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType572 : CTriviallyAdaptedFunctionType<(CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType573 : CTriviallyAdaptedFunctionType<(Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType574 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType575 : CTriviallyAdaptedFunctionType<(Int, Byte, Byte, Byte, Byte, Float, Float, Float) -> Unit>()

object CFunctionType576 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<ByteVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType577 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType578 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType579 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType580 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType581 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType582 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType583 : CTriviallyAdaptedFunctionType<(Int, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float) -> Unit>()

object CFunctionType584 : CTriviallyAdaptedFunctionType<(CPointer<IntVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?, CPointer<FloatVar>?) -> Unit>()

object CFunctionType585 : CTriviallyAdaptedFunctionType<(Int, COpaquePointer?) -> Unit>()

