package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat

/** Whether to explicitly render a hyperlink. If not specified, the hyperlink is linked. */
enum class HyperlinkDisplayType {

    /** The default value: the hyperlink is rendered. Do not use this. */
    HYPERLINK_DISPLAY_TYPE_UNSPECIFIED,

    /** A hyperlink should be explicitly rendered. */
    LINKED,

    /** A hyperlink should not be rendered. */
    PLAIN_TEXT,

}

/** If one exists, how a hyperlink should be displayed in the cell. */
fun CellFormat.setHyperlinkDisplayType(hyperlinkDisplayType: HyperlinkDisplayType) = setHyperlinkDisplayType(hyperlinkDisplayType.name)

/** If one exists, how a hyperlink should be displayed in the cell. */
var CellFormat.hyperlinkDisplayTypeE: HyperlinkDisplayType?
    get() = hyperlinkDisplayType?.let { HyperlinkDisplayType.valueOf(it) }
    set(value) { hyperlinkDisplayType = value?.name }