package games.perses.sfml

/**
 * Add callbacks to be called when the program is done
 * used by several objects to cleanup stuff
 *
 * You have to call destroy() yourself at shutdown.
 */
object Cleanup {

    private val destroyables: MutableList<() -> Unit> = ArrayList()

    fun add(cb: () -> Unit) {
        destroyables.add(cb)
    }

    fun destroy() {
        for(destroyer in destroyables) {
            destroyer()
        }
    }

}
