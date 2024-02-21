package ru.raysmith.google.sheets.utils

data class Range(val sheet: String? = null, val cells: String? = null) {
    companion object {
        val DEFAULT = Range("Sheet1", null)
    }

    override fun toString(): String = "${sheet?.let { "'$it'" } ?: ""}${if (sheet != null && cells != null) "!" else ""}${cells ?: ""}"
}
enum class RangeMode {
    SHEET, CELLS
}
fun String.toRange(mode: RangeMode = RangeMode.SHEET) = when(mode) {
    RangeMode.SHEET -> Range(this, null)
    RangeMode.CELLS -> Range(null, this)
}