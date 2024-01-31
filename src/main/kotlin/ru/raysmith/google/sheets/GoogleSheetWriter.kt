package ru.raysmith.google.sheets

object GoogleSheetWriter {
    fun <T> sync(lock: Any = this, block: () -> T) = synchronized(lock) {
        block()
    }
}