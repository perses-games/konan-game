package games.perses.rand

import stdio.rand

object Rand {

    fun getInt(): Int = rand()

    fun getFloat(): Float = (getInt().toDouble() / Int.MAX_VALUE.toDouble()).toFloat()

}
