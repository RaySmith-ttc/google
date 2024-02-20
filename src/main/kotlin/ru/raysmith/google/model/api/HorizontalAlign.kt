package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat
import com.google.api.services.sheets.v4.model.SlicerSpec
import com.google.api.services.sheets.v4.model.TextPosition

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

/** The horizontal alignment of the value in the cell. */
fun CellFormat.setHorizontalAlignment(horizontalAlign: HorizontalAlign) =
    setHorizontalAlignment(horizontalAlign.name)

/** The horizontal alignment of the value in the cell. */
var CellFormat.horizontalAlignmentE: HorizontalAlign?
    get() = horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) { horizontalAlignment = value?.name }



/** Horizontal alignment setting for the piece of text. */
fun TextPosition.setHorizontalAlignment(horizontalAlign: HorizontalAlign) =
    setHorizontalAlignment(horizontalAlign.name)

/** Horizontal alignment setting for the piece of text. */
var TextPosition.horizontalAlignmentE: HorizontalAlign?
    get() = horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) { horizontalAlignment = value?.name }



/** The horizontal alignment of title in the slicer. If unspecified, defaults to [HorizontalAlign.LEFT] */
fun SlicerSpec.setHorizontalAlignment(horizontalAlign: HorizontalAlign) =
    setHorizontalAlignment(horizontalAlign.name)

/** The horizontal alignment of title in the slicer. If unspecified, defaults to [HorizontalAlign.LEFT] */
var SlicerSpec.horizontalAlignmentE: HorizontalAlign?
    get() = horizontalAlignment?.let { HorizontalAlign.valueOf(it) }
    set(value) { horizontalAlignment = value?.name }