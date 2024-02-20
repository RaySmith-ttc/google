package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ChartData
import com.google.api.services.sheets.v4.model.ScorecardChartSpec

/** The type of aggregation for chart series. */
enum class ChartAggregateType {

    /** Default value, do not use. */
    CHART_AGGREGATE_TYPE_UNSPECIFIED,

    /** Average aggregate function. */
    AVERAGE,

    /** Count aggregate function. */
    COUNT,

    /** Maximum aggregate function. */
    MAX,

    /** Median aggregate function. */
    MEDIAN,

    /** Minimum aggregate function. */
    MIN,

    /** Sum aggregate function. */
    SUM,

}

/** The aggregation type for the series of a data source chart. Only supported for data source charts. */
fun ChartData.setAggregateType(aggregateType: ChartAggregateType) = setAggregateType(aggregateType.name)

/** The aggregation type for the series of a data source chart. Only supported for data source charts. */
var ChartData.aggregateTypeE: ChartAggregateType?
    get() = aggregateType?.let { ChartAggregateType.valueOf(it) }
    set(value) { aggregateType = value?.name }



/**
 * The aggregation type for key and baseline chart data in scorecard chart. This field is not supported for data source
 * charts. Use the [ScorecardChartSpec.aggregateType] field of the [ScorecardChartSpec.keyValueData] or
 * [ScorecardChartSpec.baselineValueData] instead for data source charts. This field is optional.
 * */
fun ScorecardChartSpec.setAggregateType(aggregateType: ChartAggregateType) = setAggregateType(aggregateType.name)

/**
 * The aggregation type for key and baseline chart data in scorecard chart. This field is not supported for data source
 * charts. Use the [ScorecardChartSpec.aggregateType] field of the [ScorecardChartSpec.keyValueData] or
 * [ScorecardChartSpec.baselineValueData] instead for data source charts. This field is optional.
 * */
var ScorecardChartSpec.aggregateTypeE: ChartAggregateType?
    get() = aggregateType?.let { ChartAggregateType.valueOf(it) }
    set(value) { aggregateType = value?.name }