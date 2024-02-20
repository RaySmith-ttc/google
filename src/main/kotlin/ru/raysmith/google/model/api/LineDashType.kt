package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.LineStyle

/** The dash type of a line. */
enum class LineDashType {

    /** Default value, do not use. */
    LINE_DASH_TYPE_UNSPECIFIED,

    /** No dash type, which is equivalent to a non-visible line. */
    INVISIBLE,

    /** A custom dash for a line. Modifying the exact custom dash style is currently unsupported. */
    CUSTOM,

    /** A solid line. */
    SOLID,

    /** A dotted line. */
    DOTTED,

    /** A dashed line where the dashes have "medium" length. */
    MEDIUM_DASHED,

    /** A line that alternates between a "medium" dash and a dot. */
    MEDIUM_DASHED_DOTTED,

    /** A dashed line where the dashes have "long" length. */
    LONG_DASHED,

    /** A line that alternates between a "long" dash and a dot. */
    LONG_DASHED_DOTTED,

}

/** The dash type of the line. */
fun LineStyle.setChartType(type: LineDashType) = setType(type.name)

/** The dash type of the line. */
var LineStyle.typeE: LineDashType?
    get() = type?.let { LineDashType.valueOf(it) }
    set(value) { type = value?.name }