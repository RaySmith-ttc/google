package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BasicChartSpec

/**
 * When charts are stacked, range (vertical axis) values are rendered on top of one another rather than from the
 * horizontal axis. For example, the two values 20 and 80 would be drawn from 0,
 * with 80 being 80 units away fromthe horizontal axis.
 * If they were stacked, 80 would be rendered from 20, putting it 100 units away from the horizontal axis.
 * */
enum class BasicChartStackedType {

    /** Default value, do not use. */
    BASIC_CHART_STACKED_TYPE_UNSPECIFIED,

    /** Series are not stacked. */
    NOT_STACKED,

    /** Series values are stacked, each value is rendered vertically beginning from the top of the value below it. */
    STACKED,

    /** Vertical stacks are stretched to reach the top of the chart, with values laid out as percentages of each other. */
    PERCENT_STACKED,

}

/**
 * The stacked type for charts that support vertical stacking.
 * Applies to Area, Bar, Column, Combo, and Stepped Area charts.
 * */
fun BasicChartSpec.setStackedType(stackedType: BasicChartStackedType) =
    setStackedType(stackedType.name)

/**
 * The stacked type for charts that support vertical stacking.
 * Applies to Area, Bar, Column, Combo, and Stepped Area charts.
 * */
var BasicChartSpec.stackedTypeE: BasicChartStackedType?
    get() = stackedType?.let { BasicChartStackedType.valueOf(it) }
    set(value) { stackedType = value?.name }