package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BubbleChartSpec

/** Where the legend of the chart should be positioned. */
enum class BubbleChartLegendPosition {

    /** Default value, do not use. */
    BUBBLE_CHART_LEGEND_POSITION_UNSPECIFIED,

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

/** Where the legend of the chart should be drawn. */
fun BubbleChartSpec.setLegendPosition(shape: BubbleChartLegendPosition) = setLegendPosition(shape.name)

/** Where the legend of the chart should be drawn. */
var BubbleChartSpec.legendPositionE: BubbleChartLegendPosition?
    get() = legendPosition?.let { BubbleChartLegendPosition.valueOf(it) }
    set(value) { legendPosition = value?.name }