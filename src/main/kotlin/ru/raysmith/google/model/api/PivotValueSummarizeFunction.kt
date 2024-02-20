package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PivotValue

/** A function to summarize a pivot value. */
enum class PivotValueSummarizeFunction {

    /** The default, do not use. */
    PIVOT_STANDARD_VALUE_FUNCTION_UNSPECIFIED,

    /** Corresponds to the SUM function. */
    SUM,

    /** Corresponds to the COUNTA function. */
    COUNTA,

    /** Corresponds to the COUNT function. */
    COUNT,

    /** Corresponds to the COUNTUNIQUE function. */
    COUNTUNIQUE,

    /** Corresponds to the AVERAGE function. */
    AVERAGE,

    /** Corresponds to the MAX function. */
    MAX,

    /** Corresponds to the MIN function. */
    MIN,

    /** Corresponds to the MEDIAN function. */
    MEDIAN,

    /** Corresponds to the PRODUCT function. */
    PRODUCT,

    /** Corresponds to the STDEV function. */
    STDEV,

    /** Corresponds to the STDEVP function. */
    STDEVP,

    /** Corresponds to the VAR function. */
    VAR,

    /** Corresponds to the VARP function. */
    VARP,

    /** Indicates the formula should be used as-is. Only valid if [PivotValue.formula] was set. */
    CUSTOM,

}

/** A function to summarize the value. If formula is set, the only supported values are
 * [PivotValueSummarizeFunction.SUM] and [PivotValueSummarizeFunction.CUSTOM].
 * If [PivotValue.sourceColumnOffset] is set, then [PivotValueSummarizeFunction.CUSTOM] is not supported.
 * */
fun PivotValue.setSummarizeFunction(summarizeFunction: PivotValueSummarizeFunction) = setSummarizeFunction(summarizeFunction.name)

/** A function to summarize the value. If formula is set, the only supported values are
 * [PivotValueSummarizeFunction.SUM] and [PivotValueSummarizeFunction.CUSTOM].
 * If [PivotValue.sourceColumnOffset] is set, then [PivotValueSummarizeFunction.CUSTOM] is not supported.
 * */
var PivotValue.summarizeFunctionE: PivotValueSummarizeFunction?
    get() = summarizeFunction?.let { PivotValueSummarizeFunction.valueOf(it) }
    set(value) { summarizeFunction = value?.name }