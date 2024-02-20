package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PieChartSpec

/** Where the legend of the chart should be positioned. */
enum class PieChartLegendPosition {

    /** Default value, do not use. */
    PIE_CHART_LEGEND_POSITION_UNSPECIFIED,

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

    /** Each pie slice has a label attached to it. */
    LABELED_LEGEND,

}

/** Where the legend of the pie chart should be drawn. */
fun PieChartSpec.setLegendPosition(shape: PieChartLegendPosition) = setLegendPosition(shape.name)

/** Where the legend of the pie chart should be drawn. */
var PieChartSpec.legendPositionE: PieChartLegendPosition?
    get() = legendPosition?.let { PieChartLegendPosition.valueOf(it) }
    set(value) { legendPosition = value?.name }