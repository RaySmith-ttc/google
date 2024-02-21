package ru.raysmith.google.sheets.utils

object GoogleSheetWriter {
    fun <T> sync(lock: Any = this, block: () -> T) = synchronized(lock) {
        block()
    }
}