package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataLabel

/** The placement of a data label relative to the labeled data. */
enum class DataLabelPlacement {

    /** The positioning is determined automatically by the renderer. */
    DATA_LABEL_PLACEMENT_UNSPECIFIED,

    /** Center within a bar or column, both horizontally and vertically. */
    CENTER,

    /** To the left of a data point. */
    LEFT,

    /** To the right of a data point. */
    RIGHT,

    /** Above a data point. */
    ABOVE,

    /** Below a data point. */
    BELOW,

    /** Inside a bar or column at the end (top if positive, bottom if negative). */
    INSIDE_END,

    /** Inside a bar or column at the base. */
    INSIDE_BASE,

    /** Outside a bar or column at the end. */
    OUTSIDE_END,

}

/** The type of the data label. */
fun DataLabel.setPlacement(placement: DataLabelPlacement) = setPlacement(placement.name)

/** The type of the data label. */
var DataLabel.placementE: DataLabelPlacement?
    get() = placement?.let { DataLabelPlacement.valueOf(it) }
    set(value) { placement = value?.name }