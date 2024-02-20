package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ChartCustomNumberFormatOptions
import com.google.api.services.sheets.v4.model.ScorecardChartSpec

/** The number formatting source options for chart attributes. */
enum class ChartNumberFormatSource {

    /** Default value, do not use. */
    CHART_NUMBER_FORMAT_SOURCE_UNDEFINED,

    /** Inherit number formatting from data. */
    FROM_DATA,

    /** Apply custom formatting as specified by [ChartCustomNumberFormatOptions]. */
    CUSTOM,

}

/** The number format source used in the scorecard chart. This field is optional. */
fun ScorecardChartSpec.setNumberFormatSource(numberFormatSource: ChartNumberFormatSource) = setNumberFormatSource(numberFormatSource.name)

/** The number format source used in the scorecard chart. This field is optional. */
var ScorecardChartSpec.numberFormatSourceE: ChartNumberFormatSource?
    get() = numberFormatSource?.let { ChartNumberFormatSource.valueOf(it) }
    set(value) { numberFormatSource = value?.name }