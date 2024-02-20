package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat

/** The vertical alignment of text in a cell. */
enum class VerticalAlign  {
    /** The vertical alignment is not specified. Do not use this. */
    VERTICAL_ALIGN_UNSPECIFIED,

    /** The text is explicitly aligned to the top of the cell. */
    TOP,

    /** The text is explicitly aligned to the middle of the cell. */
    MIDDLE,

    /** The text is explicitly aligned to the bottom of the cell. */
    BOTTOM
}

fun CellFormat.setVerticalAlignment(verticalAlignment: VerticalAlign) = setVerticalAlignment(verticalAlignment.name)

var CellFormat.verticalAlignmentE: VerticalAlign?
    get() = this.verticalAlignment?.let { VerticalAlign.valueOf(it) }
    set(value) {
        this.verticalAlignment = value?.name
    }