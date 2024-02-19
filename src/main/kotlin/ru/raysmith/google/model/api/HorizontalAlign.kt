package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat
import com.google.api.services.sheets.v4.model.SlicerSpec
import com.google.api.services.sheets.v4.model.TextPosition
import ru.raysmith.google.snakeCased

/** The horizontal alignment of text in a cell. */
enum class HorizontalAlign {
    /** The horizontal alignment is not specified. Do not use this. */
    HORIZONTAL_ALIGN_UNSPECIFIED,

    /** The text is explicitly aligned to the left of the cell. */
    LEFT,

    /** The text is explicitly aligned to the center of the cell. */
    CENTER,

    /** The text is explicitly aligned to the right of the cell. */
    RIGHT
}

fun CellFormat.setHorizontalAlignment(horizontalAlign: HorizontalAlign) {
    setHorizontalAlignment(horizontalAlign.snakeCased())
}

var CellFormat.horizontalAlignmentE: HorizontalAlign?
    get() = this.horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) {
        this.horizontalAlignment = value?.name
    }

fun TextPosition.setHorizontalAlignment(horizontalAlign: HorizontalAlign) {
    setHorizontalAlignment(horizontalAlign.snakeCased())
}

var TextPosition.horizontalAlignmentE: HorizontalAlign?
    get() = this.horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) {
        this.horizontalAlignment = value?.name
    }

fun SlicerSpec.setHorizontalAlignment(horizontalAlign: HorizontalAlign) {
    setHorizontalAlignment(horizontalAlign.snakeCased())
}

var SlicerSpec.horizontalAlignmentE: HorizontalAlign?
    get() = this.horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) {
        this.horizontalAlignment = value?.name
    }