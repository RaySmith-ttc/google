package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.InterpolationPoint

/** The kind of interpolation point. */
enum class InterpolationPointType {

    /** The default value, do not use. */
    INTERPOLATION_POINT_TYPE_UNSPECIFIED,

    /** The interpolation point uses the minimum value in the cells over the range of the conditional format. */
    MIN,

    /** The interpolation point uses the maximum value in the cells over the range of the conditional format. */
    MAX,

    /** The interpolation point uses exactly the value in InterpolationPoint.value. */
    NUMBER,

    /** The interpolation point is the given percentage over all the cells in the range of the conditional format. This is equivalent to NUMBER if the value was: =(MAX(FLATTEN(range)) * (value / 100)) + (MIN(FLATTEN(range)) * (1 - (value / 100))) (where errors in the range are ignored when flattening). */
    PERCENT,

    /** The interpolation point is the given percentile over all the cells in the range of the conditional format. This is equivalent to NUMBER if the value was: =PERCENTILE(FLATTEN(range), value / 100) (where errors in the range are ignored when flattening). */
    PERCENTILE,
    
}

/** How the value should be interpreted. */
fun InterpolationPoint.setType(type: DateTimeRenderOption) = setType(type.name)

/** How the value should be interpreted. */
var InterpolationPoint.typeE: InterpolationPointType?
    get() = type?.let { InterpolationPointType.valueOf(it) }
    set(value) { type = value?.name }