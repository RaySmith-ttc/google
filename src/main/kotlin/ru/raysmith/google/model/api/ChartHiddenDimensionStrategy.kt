package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ChartSpec

/**
 * Determines how charts should handle source rows that are hidden.
 * Hidden rows include both manually hidden and hidden by a filter.
 * */
enum class ChartHiddenDimensionStrategy {

    /** Default value, do not use. */
    CHART_HIDDEN_DIMENSION_STRATEGY_UNSPECIFIED,

    /** Charts will skip hidden rows and columns. */
    SKIP_HIDDEN_ROWS_AND_COLUMNS,

    /** Charts will skip hidden rows only. */
    SKIP_HIDDEN_ROWS,

    /** Charts will skip hidden columns only. */
    SKIP_HIDDEN_COLUMNS,

    /** Charts will not skip any hidden rows or columns. */
    SHOW_ALL,

}

/** Determines how the charts will use hidden rows or columns. */
fun ChartSpec.setHiddenDimensionStrategy(hiddenDimensionStrategy: ChartHiddenDimensionStrategy) = setHiddenDimensionStrategy(hiddenDimensionStrategy.name)

/** Determines how the charts will use hidden rows or columns. */
var ChartSpec.hiddenDimensionStrategyE: ChartHiddenDimensionStrategy?
    get() = hiddenDimensionStrategy?.let { ChartHiddenDimensionStrategy.valueOf(it) }
    set(value) { hiddenDimensionStrategy = value?.name }