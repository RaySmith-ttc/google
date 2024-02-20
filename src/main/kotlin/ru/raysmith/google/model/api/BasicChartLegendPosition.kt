package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BasicChartSpec

/** Where the legend of the chart should be positioned. */
enum class BasicChartLegendPosition {

    /** Default value, do not use. */
    BASIC_CHART_LEGEND_POSITION_UNSPECIFIED,

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

}

/** The position of the chart legend. */
fun BasicChartSpec.setLegendPosition(legendPosition: BasicChartLegendPosition) =
    setLegendPosition(legendPosition.name)

/** The position of the chart legend. */
var BasicChartSpec.legendPositionE: BasicChartLegendPosition?
    get() = legendPosition?.let { BasicChartLegendPosition.valueOf(it) }
    set(value) { legendPosition = value?.name }