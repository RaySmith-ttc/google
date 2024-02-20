package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BasicChartAxis
import com.google.api.services.sheets.v4.model.BasicChartSeries

/** The position of a chart axis. */
enum class BasicChartAxisPosition {

    /** Default value, do not use. */
    BASIC_CHART_AXIS_POSITION_UNSPECIFIED,

    /** The axis rendered at the bottom of a chart. For most charts, this is the standard major axis. For bar charts, this is a minor axis. */
    BOTTOM_AXIS,

    /** The axis rendered at the left of a chart. For most charts, this is a minor axis. For bar charts, this is the standard major axis. */
    LEFT_AXIS,

    /** The axis rendered at the right of a chart. For most charts, this is a minor axis. For bar charts, this is an unusual major axis. */
    RIGHT_AXIS,
}

/** The position of this axis. */
fun BasicChartAxis.setPosition(position: BasicChartAxisPosition) =
    setPosition(position.name)

/** The position of this axis. */
var BasicChartAxis.positionE: BasicChartAxisPosition?
    get() = position?.let { BasicChartAxisPosition.valueOf(it) }
    set(value) { position = value?.name }

/**
 * The minor axis that will specify the range of values for this series. For example, if charting stocks over time,
 * the "Volume" series may want to be pinned to the right with the prices pinned to the left, because the scale of
 * trading volume is different than the scale of prices. It is an error to specify an axis that isn't
 * a valid minor axis for the chart's type.
 * */
fun BasicChartSeries.setTargetAxis(targetAxis: BasicChartAxisPosition) =
    setTargetAxis(targetAxis.name)



/**
 * The minor axis that will specify the range of values for this series. For example, if charting stocks over time,
 * the "Volume" series may want to be pinned to the right with the prices pinned to the left, because the scale of
 * trading volume is different than the scale of prices. It is an error to specify an axis that isn't
 * a valid minor axis for the chart's type.
 * */
var BasicChartSeries.targetAxisE: BasicChartAxisPosition?
    get() = targetAxis?.let { BasicChartAxisPosition.valueOf(it) }
    set(value) { targetAxis = value?.name }