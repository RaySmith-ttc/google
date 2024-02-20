package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PivotValue

/** The possible ways that pivot values may be calculated for display. */
enum class PivotValueCalculatedDisplayType {

    /** Default value, do not use. */
    PIVOT_VALUE_CALCULATED_DISPLAY_TYPE_UNSPECIFIED,

    /** Shows the pivot values as percentage of the row total values. */
    PERCENT_OF_ROW_TOTAL,

    /** Shows the pivot values as percentage of the column total values. */
    PERCENT_OF_COLUMN_TOTAL,

    /** Shows the pivot values as percentage of the grand total values. */
    PERCENT_OF_GRAND_TOTAL,

}

/**
 * If specified, indicates that pivot values should be displayed as the result of a calculation with another pivot
 * value. For example, if [PivotValue.calculatedDisplayType] is specified as
 * [PivotValueCalculatedDisplayType.PERCENT_OF_GRAND_TOTAL], all the pivot values are displayed as the percentage of
 * the grand total. In the Sheets editor, this is referred to as "Show As" in the value section of a pivot table.
 * */
fun PivotValue.setCalculatedDisplayType(calculatedDisplayType: PivotValueCalculatedDisplayType) = setCalculatedDisplayType(calculatedDisplayType.name)

/**
 * If specified, indicates that pivot values should be displayed as the result of a calculation with another pivot
 * value. For example, if [PivotValue.calculatedDisplayType] is specified as
 * [PivotValueCalculatedDisplayType.PERCENT_OF_GRAND_TOTAL], all the pivot values are displayed as the percentage of
 * the grand total. In the Sheets editor, this is referred to as "Show As" in the value section of a pivot table.
 * */
var PivotValue.calculatedDisplayTypeE: PivotValueCalculatedDisplayType?
    get() = calculatedDisplayType?.let { PivotValueCalculatedDisplayType.valueOf(it) }
    set(value) { calculatedDisplayType = value?.name }