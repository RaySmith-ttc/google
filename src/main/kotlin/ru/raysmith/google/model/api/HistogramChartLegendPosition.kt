package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.HistogramChartSpec

/** Where the legend of the chart should be positioned. */
enum class HistogramChartLegendPosition  {

    /** Default value, do not use. */
    HISTOGRAM_CHART_LEGEND_POSITION_UNSPECIFIED,

    /** The legend is rendered on the bottom of the chart. */
    BOTTOM_LEGEND,

    /** The legend is rendered on the left of the chart. */
    LEFT_LEGEND,

    /** The legend is rendered on the right of the chart. */
    RIGHT_LEGEND,

    /** The legend is rendered on the top of the chart. */
    TOP_LEGEND,

    /** No legend is rendered. */
    NO_LEGEND,

    /** The legend is rendered inside the chart area. */
    INSIDE_LEGEND,

}

/** The position of the chart legend. */
fun HistogramChartSpec.setLegendPosition(legendPosition: HistogramChartLegendPosition) = setLegendPosition(legendPosition.name)

/** The position of the chart legend. */
var HistogramChartSpec.legendPositionE: HistogramChartLegendPosition?
    get() = legendPosition?.let { HistogramChartLegendPosition.valueOf(it) }
    set(value) { legendPosition = value?.name }