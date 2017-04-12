@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package math

import konan.SymbolName
import kotlinx.cinterop.*

@SymbolName("kni_math_acos")
external fun acos(__x: Double): Double

@SymbolName("kni_math___acos")
external fun __acos(__x: Double): Double

@SymbolName("kni_math_asin")
external fun asin(__x: Double): Double

@SymbolName("kni_math___asin")
external fun __asin(__x: Double): Double

@SymbolName("kni_math_atan")
external fun atan(__x: Double): Double

@SymbolName("kni_math___atan")
external fun __atan(__x: Double): Double

@SymbolName("kni_math_atan2")
external fun atan2(__y: Double, __x: Double): Double

@SymbolName("kni_math___atan2")
external fun __atan2(__y: Double, __x: Double): Double

@SymbolName("kni_math_cos")
external fun cos(__x: Double): Double

@SymbolName("kni_math___cos")
external fun __cos(__x: Double): Double

@SymbolName("kni_math_sin")
external fun sin(__x: Double): Double

@SymbolName("kni_math___sin")
external fun __sin(__x: Double): Double

@SymbolName("kni_math_tan")
external fun tan(__x: Double): Double

@SymbolName("kni_math___tan")
external fun __tan(__x: Double): Double

@SymbolName("kni_math_cosh")
external fun cosh(__x: Double): Double

@SymbolName("kni_math___cosh")
external fun __cosh(__x: Double): Double

@SymbolName("kni_math_sinh")
external fun sinh(__x: Double): Double

@SymbolName("kni_math___sinh")
external fun __sinh(__x: Double): Double

@SymbolName("kni_math_tanh")
external fun tanh(__x: Double): Double

@SymbolName("kni_math___tanh")
external fun __tanh(__x: Double): Double

@SymbolName("kni_math_acosh")
external fun acosh(__x: Double): Double

@SymbolName("kni_math___acosh")
external fun __acosh(__x: Double): Double

@SymbolName("kni_math_asinh")
external fun asinh(__x: Double): Double

@SymbolName("kni_math___asinh")
external fun __asinh(__x: Double): Double

@SymbolName("kni_math_atanh")
external fun atanh(__x: Double): Double

@SymbolName("kni_math___atanh")
external fun __atanh(__x: Double): Double

@SymbolName("kni_math_exp")
external fun exp(__x: Double): Double

@SymbolName("kni_math___exp")
external fun __exp(__x: Double): Double

fun frexp(__x: Double, __exponent: CValuesRef<IntVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___exponent = __exponent?.getPointer(memScope).rawValue
        val res = kni_frexp(___x, ___exponent)
        res
    }
}

fun __frexp(__x: Double, __exponent: CValuesRef<IntVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___exponent = __exponent?.getPointer(memScope).rawValue
        val res = kni___frexp(___x, ___exponent)
        res
    }
}

@SymbolName("kni_math_ldexp")
external fun ldexp(__x: Double, __exponent: Int): Double

@SymbolName("kni_math___ldexp")
external fun __ldexp(__x: Double, __exponent: Int): Double

@SymbolName("kni_math_log")
external fun log(__x: Double): Double

@SymbolName("kni_math___log")
external fun __log(__x: Double): Double

@SymbolName("kni_math_log10")
external fun log10(__x: Double): Double

@SymbolName("kni_math___log10")
external fun __log10(__x: Double): Double

fun modf(__x: Double, __iptr: CValuesRef<DoubleVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___iptr = __iptr?.getPointer(memScope).rawValue
        val res = kni_modf(___x, ___iptr)
        res
    }
}

fun __modf(__x: Double, __iptr: CValuesRef<DoubleVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___iptr = __iptr?.getPointer(memScope).rawValue
        val res = kni___modf(___x, ___iptr)
        res
    }
}

@SymbolName("kni_math_expm1")
external fun expm1(__x: Double): Double

@SymbolName("kni_math___expm1")
external fun __expm1(__x: Double): Double

@SymbolName("kni_math_log1p")
external fun log1p(__x: Double): Double

@SymbolName("kni_math___log1p")
external fun __log1p(__x: Double): Double

@SymbolName("kni_math_logb")
external fun logb(__x: Double): Double

@SymbolName("kni_math___logb")
external fun __logb(__x: Double): Double

@SymbolName("kni_math_exp2")
external fun exp2(__x: Double): Double

@SymbolName("kni_math___exp2")
external fun __exp2(__x: Double): Double

@SymbolName("kni_math_log2")
external fun log2(__x: Double): Double

@SymbolName("kni_math___log2")
external fun __log2(__x: Double): Double

@SymbolName("kni_math_pow")
external fun pow(__x: Double, __y: Double): Double

@SymbolName("kni_math___pow")
external fun __pow(__x: Double, __y: Double): Double

@SymbolName("kni_math_sqrt")
external fun sqrt(__x: Double): Double

@SymbolName("kni_math___sqrt")
external fun __sqrt(__x: Double): Double

@SymbolName("kni_math_hypot")
external fun hypot(__x: Double, __y: Double): Double

@SymbolName("kni_math___hypot")
external fun __hypot(__x: Double, __y: Double): Double

@SymbolName("kni_math_cbrt")
external fun cbrt(__x: Double): Double

@SymbolName("kni_math___cbrt")
external fun __cbrt(__x: Double): Double

@SymbolName("kni_math_ceil")
external fun ceil(__x: Double): Double

@SymbolName("kni_math___ceil")
external fun __ceil(__x: Double): Double

@SymbolName("kni_math_fabs")
external fun fabs(__x: Double): Double

@SymbolName("kni_math___fabs")
external fun __fabs(__x: Double): Double

@SymbolName("kni_math_floor")
external fun floor(__x: Double): Double

@SymbolName("kni_math___floor")
external fun __floor(__x: Double): Double

@SymbolName("kni_math_fmod")
external fun fmod(__x: Double, __y: Double): Double

@SymbolName("kni_math___fmod")
external fun __fmod(__x: Double, __y: Double): Double

@SymbolName("kni_math___isinf")
external fun __isinf(__value: Double): Int

@SymbolName("kni_math___finite")
external fun __finite(__value: Double): Int

@SymbolName("kni_math_copysign")
external fun copysign(__x: Double, __y: Double): Double

@SymbolName("kni_math___copysign")
external fun __copysign(__x: Double, __y: Double): Double

fun nan(__tagb: String?): Double {
    return memScoped {
        val ___tagb = __tagb?.cstr?.getPointer(memScope).rawValue
        val res = kni_nan(___tagb)
        res
    }
}

fun __nan(__tagb: String?): Double {
    return memScoped {
        val ___tagb = __tagb?.cstr?.getPointer(memScope).rawValue
        val res = kni___nan(___tagb)
        res
    }
}

@SymbolName("kni_math___isnan")
external fun __isnan(__value: Double): Int

@SymbolName("kni_math_erf")
external fun erf(arg0: Double): Double

@SymbolName("kni_math___erf")
external fun __erf(arg0: Double): Double

@SymbolName("kni_math_erfc")
external fun erfc(arg0: Double): Double

@SymbolName("kni_math___erfc")
external fun __erfc(arg0: Double): Double

@SymbolName("kni_math_lgamma")
external fun lgamma(arg0: Double): Double

@SymbolName("kni_math___lgamma")
external fun __lgamma(arg0: Double): Double

@SymbolName("kni_math_tgamma")
external fun tgamma(arg0: Double): Double

@SymbolName("kni_math___tgamma")
external fun __tgamma(arg0: Double): Double

@SymbolName("kni_math_rint")
external fun rint(__x: Double): Double

@SymbolName("kni_math___rint")
external fun __rint(__x: Double): Double

@SymbolName("kni_math_nextafter")
external fun nextafter(__x: Double, __y: Double): Double

@SymbolName("kni_math___nextafter")
external fun __nextafter(__x: Double, __y: Double): Double

@SymbolName("kni_math_remainder")
external fun remainder(__x: Double, __y: Double): Double

@SymbolName("kni_math___remainder")
external fun __remainder(__x: Double, __y: Double): Double

@SymbolName("kni_math_scalbn")
external fun scalbn(__x: Double, __n: Int): Double

@SymbolName("kni_math___scalbn")
external fun __scalbn(__x: Double, __n: Int): Double

@SymbolName("kni_math_ilogb")
external fun ilogb(__x: Double): Int

@SymbolName("kni_math___ilogb")
external fun __ilogb(__x: Double): Int

@SymbolName("kni_math_scalbln")
external fun scalbln(__x: Double, __n: Long): Double

@SymbolName("kni_math___scalbln")
external fun __scalbln(__x: Double, __n: Long): Double

@SymbolName("kni_math_nearbyint")
external fun nearbyint(__x: Double): Double

@SymbolName("kni_math___nearbyint")
external fun __nearbyint(__x: Double): Double

@SymbolName("kni_math_round")
external fun round(__x: Double): Double

@SymbolName("kni_math___round")
external fun __round(__x: Double): Double

@SymbolName("kni_math_trunc")
external fun trunc(__x: Double): Double

@SymbolName("kni_math___trunc")
external fun __trunc(__x: Double): Double

fun remquo(__x: Double, __y: Double, __quo: CValuesRef<IntVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___y = __y
        val ___quo = __quo?.getPointer(memScope).rawValue
        val res = kni_remquo(___x, ___y, ___quo)
        res
    }
}

fun __remquo(__x: Double, __y: Double, __quo: CValuesRef<IntVar>?): Double {
    return memScoped {
        val ___x = __x
        val ___y = __y
        val ___quo = __quo?.getPointer(memScope).rawValue
        val res = kni___remquo(___x, ___y, ___quo)
        res
    }
}

@SymbolName("kni_math_lrint")
external fun lrint(__x: Double): Long

@SymbolName("kni_math___lrint")
external fun __lrint(__x: Double): Long

@SymbolName("kni_math_llrint")
external fun llrint(__x: Double): Long

@SymbolName("kni_math___llrint")
external fun __llrint(__x: Double): Long

@SymbolName("kni_math_lround")
external fun lround(__x: Double): Long

@SymbolName("kni_math___lround")
external fun __lround(__x: Double): Long

@SymbolName("kni_math_llround")
external fun llround(__x: Double): Long

@SymbolName("kni_math___llround")
external fun __llround(__x: Double): Long

@SymbolName("kni_math_fdim")
external fun fdim(__x: Double, __y: Double): Double

@SymbolName("kni_math___fdim")
external fun __fdim(__x: Double, __y: Double): Double

@SymbolName("kni_math_fmax")
external fun fmax(__x: Double, __y: Double): Double

@SymbolName("kni_math___fmax")
external fun __fmax(__x: Double, __y: Double): Double

@SymbolName("kni_math_fmin")
external fun fmin(__x: Double, __y: Double): Double

@SymbolName("kni_math___fmin")
external fun __fmin(__x: Double, __y: Double): Double

@SymbolName("kni_math___fpclassify")
external fun __fpclassify(__value: Double): Int

@SymbolName("kni_math___signbit")
external fun __signbit(__value: Double): Int

@SymbolName("kni_math_fma")
external fun fma(__x: Double, __y: Double, __z: Double): Double

@SymbolName("kni_math___fma")
external fun __fma(__x: Double, __y: Double, __z: Double): Double

@SymbolName("kni_math_acosf")
external fun acosf(__x: Float): Float

@SymbolName("kni_math___acosf")
external fun __acosf(__x: Float): Float

@SymbolName("kni_math_asinf")
external fun asinf(__x: Float): Float

@SymbolName("kni_math___asinf")
external fun __asinf(__x: Float): Float

@SymbolName("kni_math_atanf")
external fun atanf(__x: Float): Float

@SymbolName("kni_math___atanf")
external fun __atanf(__x: Float): Float

@SymbolName("kni_math_atan2f")
external fun atan2f(__y: Float, __x: Float): Float

@SymbolName("kni_math___atan2f")
external fun __atan2f(__y: Float, __x: Float): Float

@SymbolName("kni_math_cosf")
external fun cosf(__x: Float): Float

@SymbolName("kni_math___cosf")
external fun __cosf(__x: Float): Float

@SymbolName("kni_math_sinf")
external fun sinf(__x: Float): Float

@SymbolName("kni_math___sinf")
external fun __sinf(__x: Float): Float

@SymbolName("kni_math_tanf")
external fun tanf(__x: Float): Float

@SymbolName("kni_math___tanf")
external fun __tanf(__x: Float): Float

@SymbolName("kni_math_coshf")
external fun coshf(__x: Float): Float

@SymbolName("kni_math___coshf")
external fun __coshf(__x: Float): Float

@SymbolName("kni_math_sinhf")
external fun sinhf(__x: Float): Float

@SymbolName("kni_math___sinhf")
external fun __sinhf(__x: Float): Float

@SymbolName("kni_math_tanhf")
external fun tanhf(__x: Float): Float

@SymbolName("kni_math___tanhf")
external fun __tanhf(__x: Float): Float

@SymbolName("kni_math_acoshf")
external fun acoshf(__x: Float): Float

@SymbolName("kni_math___acoshf")
external fun __acoshf(__x: Float): Float

@SymbolName("kni_math_asinhf")
external fun asinhf(__x: Float): Float

@SymbolName("kni_math___asinhf")
external fun __asinhf(__x: Float): Float

@SymbolName("kni_math_atanhf")
external fun atanhf(__x: Float): Float

@SymbolName("kni_math___atanhf")
external fun __atanhf(__x: Float): Float

@SymbolName("kni_math_expf")
external fun expf(__x: Float): Float

@SymbolName("kni_math___expf")
external fun __expf(__x: Float): Float

fun frexpf(__x: Float, __exponent: CValuesRef<IntVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___exponent = __exponent?.getPointer(memScope).rawValue
        val res = kni_frexpf(___x, ___exponent)
        res
    }
}

fun __frexpf(__x: Float, __exponent: CValuesRef<IntVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___exponent = __exponent?.getPointer(memScope).rawValue
        val res = kni___frexpf(___x, ___exponent)
        res
    }
}

@SymbolName("kni_math_ldexpf")
external fun ldexpf(__x: Float, __exponent: Int): Float

@SymbolName("kni_math___ldexpf")
external fun __ldexpf(__x: Float, __exponent: Int): Float

@SymbolName("kni_math_logf")
external fun logf(__x: Float): Float

@SymbolName("kni_math___logf")
external fun __logf(__x: Float): Float

@SymbolName("kni_math_log10f")
external fun log10f(__x: Float): Float

@SymbolName("kni_math___log10f")
external fun __log10f(__x: Float): Float

fun modff(__x: Float, __iptr: CValuesRef<FloatVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___iptr = __iptr?.getPointer(memScope).rawValue
        val res = kni_modff(___x, ___iptr)
        res
    }
}

fun __modff(__x: Float, __iptr: CValuesRef<FloatVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___iptr = __iptr?.getPointer(memScope).rawValue
        val res = kni___modff(___x, ___iptr)
        res
    }
}

@SymbolName("kni_math_expm1f")
external fun expm1f(__x: Float): Float

@SymbolName("kni_math___expm1f")
external fun __expm1f(__x: Float): Float

@SymbolName("kni_math_log1pf")
external fun log1pf(__x: Float): Float

@SymbolName("kni_math___log1pf")
external fun __log1pf(__x: Float): Float

@SymbolName("kni_math_logbf")
external fun logbf(__x: Float): Float

@SymbolName("kni_math___logbf")
external fun __logbf(__x: Float): Float

@SymbolName("kni_math_exp2f")
external fun exp2f(__x: Float): Float

@SymbolName("kni_math___exp2f")
external fun __exp2f(__x: Float): Float

@SymbolName("kni_math_log2f")
external fun log2f(__x: Float): Float

@SymbolName("kni_math___log2f")
external fun __log2f(__x: Float): Float

@SymbolName("kni_math_powf")
external fun powf(__x: Float, __y: Float): Float

@SymbolName("kni_math___powf")
external fun __powf(__x: Float, __y: Float): Float

@SymbolName("kni_math_sqrtf")
external fun sqrtf(__x: Float): Float

@SymbolName("kni_math___sqrtf")
external fun __sqrtf(__x: Float): Float

@SymbolName("kni_math_hypotf")
external fun hypotf(__x: Float, __y: Float): Float

@SymbolName("kni_math___hypotf")
external fun __hypotf(__x: Float, __y: Float): Float

@SymbolName("kni_math_cbrtf")
external fun cbrtf(__x: Float): Float

@SymbolName("kni_math___cbrtf")
external fun __cbrtf(__x: Float): Float

@SymbolName("kni_math_ceilf")
external fun ceilf(__x: Float): Float

@SymbolName("kni_math___ceilf")
external fun __ceilf(__x: Float): Float

@SymbolName("kni_math_fabsf")
external fun fabsf(__x: Float): Float

@SymbolName("kni_math___fabsf")
external fun __fabsf(__x: Float): Float

@SymbolName("kni_math_floorf")
external fun floorf(__x: Float): Float

@SymbolName("kni_math___floorf")
external fun __floorf(__x: Float): Float

@SymbolName("kni_math_fmodf")
external fun fmodf(__x: Float, __y: Float): Float

@SymbolName("kni_math___fmodf")
external fun __fmodf(__x: Float, __y: Float): Float

@SymbolName("kni_math___isinff")
external fun __isinff(__value: Float): Int

@SymbolName("kni_math___finitef")
external fun __finitef(__value: Float): Int

@SymbolName("kni_math_copysignf")
external fun copysignf(__x: Float, __y: Float): Float

@SymbolName("kni_math___copysignf")
external fun __copysignf(__x: Float, __y: Float): Float

fun nanf(__tagb: String?): Float {
    return memScoped {
        val ___tagb = __tagb?.cstr?.getPointer(memScope).rawValue
        val res = kni_nanf(___tagb)
        res
    }
}

fun __nanf(__tagb: String?): Float {
    return memScoped {
        val ___tagb = __tagb?.cstr?.getPointer(memScope).rawValue
        val res = kni___nanf(___tagb)
        res
    }
}

@SymbolName("kni_math___isnanf")
external fun __isnanf(__value: Float): Int

@SymbolName("kni_math_erff")
external fun erff(arg0: Float): Float

@SymbolName("kni_math___erff")
external fun __erff(arg0: Float): Float

@SymbolName("kni_math_erfcf")
external fun erfcf(arg0: Float): Float

@SymbolName("kni_math___erfcf")
external fun __erfcf(arg0: Float): Float

@SymbolName("kni_math_lgammaf")
external fun lgammaf(arg0: Float): Float

@SymbolName("kni_math___lgammaf")
external fun __lgammaf(arg0: Float): Float

@SymbolName("kni_math_tgammaf")
external fun tgammaf(arg0: Float): Float

@SymbolName("kni_math___tgammaf")
external fun __tgammaf(arg0: Float): Float

@SymbolName("kni_math_rintf")
external fun rintf(__x: Float): Float

@SymbolName("kni_math___rintf")
external fun __rintf(__x: Float): Float

@SymbolName("kni_math_nextafterf")
external fun nextafterf(__x: Float, __y: Float): Float

@SymbolName("kni_math___nextafterf")
external fun __nextafterf(__x: Float, __y: Float): Float

@SymbolName("kni_math_remainderf")
external fun remainderf(__x: Float, __y: Float): Float

@SymbolName("kni_math___remainderf")
external fun __remainderf(__x: Float, __y: Float): Float

@SymbolName("kni_math_scalbnf")
external fun scalbnf(__x: Float, __n: Int): Float

@SymbolName("kni_math___scalbnf")
external fun __scalbnf(__x: Float, __n: Int): Float

@SymbolName("kni_math_ilogbf")
external fun ilogbf(__x: Float): Int

@SymbolName("kni_math___ilogbf")
external fun __ilogbf(__x: Float): Int

@SymbolName("kni_math_scalblnf")
external fun scalblnf(__x: Float, __n: Long): Float

@SymbolName("kni_math___scalblnf")
external fun __scalblnf(__x: Float, __n: Long): Float

@SymbolName("kni_math_nearbyintf")
external fun nearbyintf(__x: Float): Float

@SymbolName("kni_math___nearbyintf")
external fun __nearbyintf(__x: Float): Float

@SymbolName("kni_math_roundf")
external fun roundf(__x: Float): Float

@SymbolName("kni_math___roundf")
external fun __roundf(__x: Float): Float

@SymbolName("kni_math_truncf")
external fun truncf(__x: Float): Float

@SymbolName("kni_math___truncf")
external fun __truncf(__x: Float): Float

fun remquof(__x: Float, __y: Float, __quo: CValuesRef<IntVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___y = __y
        val ___quo = __quo?.getPointer(memScope).rawValue
        val res = kni_remquof(___x, ___y, ___quo)
        res
    }
}

fun __remquof(__x: Float, __y: Float, __quo: CValuesRef<IntVar>?): Float {
    return memScoped {
        val ___x = __x
        val ___y = __y
        val ___quo = __quo?.getPointer(memScope).rawValue
        val res = kni___remquof(___x, ___y, ___quo)
        res
    }
}

@SymbolName("kni_math_lrintf")
external fun lrintf(__x: Float): Long

@SymbolName("kni_math___lrintf")
external fun __lrintf(__x: Float): Long

@SymbolName("kni_math_llrintf")
external fun llrintf(__x: Float): Long

@SymbolName("kni_math___llrintf")
external fun __llrintf(__x: Float): Long

@SymbolName("kni_math_lroundf")
external fun lroundf(__x: Float): Long

@SymbolName("kni_math___lroundf")
external fun __lroundf(__x: Float): Long

@SymbolName("kni_math_llroundf")
external fun llroundf(__x: Float): Long

@SymbolName("kni_math___llroundf")
external fun __llroundf(__x: Float): Long

@SymbolName("kni_math_fdimf")
external fun fdimf(__x: Float, __y: Float): Float

@SymbolName("kni_math___fdimf")
external fun __fdimf(__x: Float, __y: Float): Float

@SymbolName("kni_math_fmaxf")
external fun fmaxf(__x: Float, __y: Float): Float

@SymbolName("kni_math___fmaxf")
external fun __fmaxf(__x: Float, __y: Float): Float

@SymbolName("kni_math_fminf")
external fun fminf(__x: Float, __y: Float): Float

@SymbolName("kni_math___fminf")
external fun __fminf(__x: Float, __y: Float): Float

@SymbolName("kni_math___fpclassifyf")
external fun __fpclassifyf(__value: Float): Int

@SymbolName("kni_math___signbitf")
external fun __signbitf(__value: Float): Int

@SymbolName("kni_math_fmaf")
external fun fmaf(__x: Float, __y: Float, __z: Float): Float

@SymbolName("kni_math___fmaf")
external fun __fmaf(__x: Float, __y: Float, __z: Float): Float

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
val _POSIX_SOURCE: Int = 1
val _MATH_H: Int = 1
val _FEATURES_H: Int = 1
val __USE_ISOC11: Int = 1
val __USE_ISOC99: Int = 1
val __USE_ISOC95: Int = 1
val __USE_POSIX: Int = 1
val __USE_FORTIFY_LEVEL: Int = 0
val _STDC_PREDEF_H: Int = 1
val __STDC_IEC_559__: Int = 1
val __STDC_IEC_559_COMPLEX__: Int = 1
val __STDC_ISO_10646__: Long = 201103
val __STDC_NO_THREADS__: Int = 1
val __GNU_LIBRARY__: Int = 6
val __GLIBC__: Int = 2
val __GLIBC_MINOR__: Int = 19
val _SYS_CDEFS_H: Int = 1
val __WORDSIZE: Int = 64
val __WORDSIZE_TIME64_COMPAT32: Int = 1
val __SYSCALL_WORDSIZE: Int = 64
val HUGE_VAL: Double = bitsToDouble(9218868437227405312) /* == Infinity */
val HUGE_VALF: Float = bitsToFloat(2139095040) /* == Infinity */
val INFINITY: Float = bitsToFloat(2139095040) /* == Infinity */
val NAN: Float = bitsToFloat(2143289344) /* == NaN */
val _MATH_H_MATHDEF: Int = 1
val FP_ILOGB0: Int = -2147483648
val FP_ILOGBNAN: Int = -2147483648
val __MATH_DECLARE_LDOUBLE: Int = 1
val FP_NAN: Int = 0
val FP_INFINITE: Int = 1
val FP_ZERO: Int = 2
val FP_SUBNORMAL: Int = 3
val FP_NORMAL: Int = 4
val MATH_ERRNO: Int = 1
val MATH_ERREXCEPT: Int = 2
val math_errhandling: Int = 3


typealias float_tVar = FloatVarOf<float_t>
typealias float_t = Float

typealias double_tVar = DoubleVarOf<double_t>
typealias double_t = Double

@SymbolName("kni_math_frexp")
private external fun kni_frexp(__x: Double, __exponent: NativePtr): Double

@SymbolName("kni_math___frexp")
private external fun kni___frexp(__x: Double, __exponent: NativePtr): Double

@SymbolName("kni_math_modf")
private external fun kni_modf(__x: Double, __iptr: NativePtr): Double

@SymbolName("kni_math___modf")
private external fun kni___modf(__x: Double, __iptr: NativePtr): Double

@SymbolName("kni_math_nan")
private external fun kni_nan(__tagb: NativePtr): Double

@SymbolName("kni_math___nan")
private external fun kni___nan(__tagb: NativePtr): Double

@SymbolName("kni_math_remquo")
private external fun kni_remquo(__x: Double, __y: Double, __quo: NativePtr): Double

@SymbolName("kni_math___remquo")
private external fun kni___remquo(__x: Double, __y: Double, __quo: NativePtr): Double

@SymbolName("kni_math_frexpf")
private external fun kni_frexpf(__x: Float, __exponent: NativePtr): Float

@SymbolName("kni_math___frexpf")
private external fun kni___frexpf(__x: Float, __exponent: NativePtr): Float

@SymbolName("kni_math_modff")
private external fun kni_modff(__x: Float, __iptr: NativePtr): Float

@SymbolName("kni_math___modff")
private external fun kni___modff(__x: Float, __iptr: NativePtr): Float

@SymbolName("kni_math_nanf")
private external fun kni_nanf(__tagb: NativePtr): Float

@SymbolName("kni_math___nanf")
private external fun kni___nanf(__tagb: NativePtr): Float

@SymbolName("kni_math_remquof")
private external fun kni_remquof(__x: Float, __y: Float, __quo: NativePtr): Float

@SymbolName("kni_math___remquof")
private external fun kni___remquof(__x: Float, __y: Float, __quo: NativePtr): Float

