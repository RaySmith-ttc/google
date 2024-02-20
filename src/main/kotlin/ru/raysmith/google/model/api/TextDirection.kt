package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat

/** The direction of text in a cell. */
enum class TextDirection {

    /** The text direction is not specified. Do not use this. */
    TEXT_DIRECTION_UNSPECIFIED,

    /** The text direction of left-to-right was set by the user. */
    LEFT_TO_RIGHT,

    /** The text direction of right-to-left was set by the user. */
    RIGHT_TO_LEFT,

}


fun CellFormat.setTextDirection(textDirection: TextDirection) = setTextDirection(textDirection.name)
var CellFormat.textDirectionE: TextDirection?
    get() = this.textDirection?.let { TextDirection.valueOf(it) }
    set(value) {
        this.textDirection = value?.name
    }