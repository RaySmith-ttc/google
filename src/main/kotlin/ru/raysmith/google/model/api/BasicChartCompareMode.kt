package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BasicChartSpec

/** The compare mode type, which describes the behavior of tooltips and data highlighting when hovering on data and chart area. */
enum class BasicChartCompareMode {

    /** Default value, do not use. */
    BASIC_CHART_COMPARE_MODE_UNSPECIFIED,

    /** Only the focused data element is highlighted and shown in the tooltip. */
    DATUM,

    /** All data elements with the same category (e.g., domain value) are highlighted and shown in the tooltip. */
    CATEGORY,
}

/** The behavior of tooltips and data highlighting when hovering on data and chart area. */
fun BasicChartSpec.setStackedType(compareMode: BasicChartCompareMode) =
    setStackedType(compareMode.name)

/** The behavior of tooltips and data highlighting when hovering on data and chart area. */
var BasicChartSpec.compareModeE: BasicChartCompareMode?
    get() = compareMode?.let { BasicChartCompareMode.valueOf(it) }
    set(value) { compareMode = value?.name }