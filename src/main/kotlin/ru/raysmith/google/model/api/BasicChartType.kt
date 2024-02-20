package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BasicChartSeries
import com.google.api.services.sheets.v4.model.BasicChartSpec

/** How the chart should be visualized. */
enum class BasicChartType {

    /** Default value, do not use. */
    BASIC_CHART_TYPE_UNSPECIFIED,

    /** A [bar chart](https://developers.google.com/chart/interactive/docs/gallery/barchart). */
    BAR,

    /** A [line chart](https://developers.google.com/chart/interactive/docs/gallery/linechart). */
    LINE,

    /** An [area chart](https://developers.google.com/chart/interactive/docs/gallery/areachart). */
    AREA,

    /** A [column chart](https://developers.google.com/chart/interactive/docs/gallery/columnchart). */
    COLUMN,

    /** A [scatter chart](https://developers.google.com/chart/interactive/docs/gallery/scatterchart). */
    SCATTER,

    /** A [combo chart](https://developers.google.com/chart/interactive/docs/gallery/scatterchart). */
    COMBO,

    /** A [stepped area chart](https://developers.google.com/chart/interactive/docs/gallery/steppedareachart). */
    STEPPED_AREA,

}

/** The type of the chart. */
fun BasicChartSpec.setChartType(chartType: BasicChartType) = setChartType(chartType.name)

/** The type of the chart. */
var BasicChartSpec.chartTypeE: BasicChartType?
    get() = chartType?.let { BasicChartType.valueOf(it) }
    set(value) { chartType = value?.name }



/**
 * The type of this series. Valid only if the chartType is [BasicChartType.COMBO].
 * Different types will change the way the series is visualized. Only [BasicChartType.LINE], [BasicChartType.AREA],
 * and [BasicChartType.COLUMN] are supported.
 * */
fun BasicChartSeries.setType(type: BasicChartType) = setType(type.name)

/**
 * The type of this series. Valid only if the chartType is [BasicChartType.COMBO].
 * Different types will change the way the series is visualized. Only [BasicChartType.LINE], [BasicChartType.AREA],
 * and [BasicChartType.COLUMN] are supported.
 * */
var BasicChartSeries.typeE: BasicChartType?
    get() = type?.let { BasicChartType.valueOf(it) }
    set(value) { type = value?.name }