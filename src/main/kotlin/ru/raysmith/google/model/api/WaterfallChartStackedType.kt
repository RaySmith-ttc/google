package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.WaterfallChartSpec

/** Stacked type options for waterfall charts. */
enum class WaterfallChartStackedType {

    /** Default value, do not use. */
    WATERFALL_STACKED_TYPE_UNSPECIFIED,

    /** Values corresponding to the same domain (horizontal axis) value will be stacked vertically. */
    STACKED,

    /** Series will spread out along the horizontal axis. */
    SEQUENTIAL,

}

/** The stacked type. */
fun WaterfallChartSpec.setStackedType(stackedType: WaterfallChartStackedType) = setStackedType(stackedType.name)

/** The stacked type. */
var WaterfallChartSpec.stackedTypeE: WaterfallChartStackedType?
    get() = stackedType?.let { WaterfallChartStackedType.valueOf(it) }
    set(value) { stackedType = value?.name }