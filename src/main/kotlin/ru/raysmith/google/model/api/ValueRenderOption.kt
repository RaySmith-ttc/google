package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest

/** Determines how values should be rendered in the output. */
enum class ValueRenderOption {
    /** Values will be calculated & formatted in the reply according to the cell's formatting. Formatting is based on the spreadsheet's locale, not the requesting user's locale. For example, if A1 is 1.23 and A2 is =A1 and formatted as currency, then A2 would return "$1.23". */
    FORMATTED_VALUE,

    /** Values will be calculated, but not formatted in the reply. For example, if A1 is 1.23 and A2 is =A1 and formatted as currency, then A2 would return the number 1.23. */
    UNFORMATTED_VALUE,

    /** Values will not be calculated. The reply will include the formulas. For example, if A1 is 1.23 and A2 is =A1 and formatted as currency, then A2 would return "=A1". */
    FORMULA
}

/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
fun Sheets.Spreadsheets.Values.Append.setResponseValueRenderOption(responseValueRenderOption: ValueRenderOption) =
    setResponseValueRenderOption(responseValueRenderOption.name)

/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
var Sheets.Spreadsheets.Values.Append.responseValueRenderOptionE: ValueRenderOption?
    get() = responseValueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { responseValueRenderOption = value?.name }



/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
fun Sheets.Spreadsheets.Values.BatchGet.setValueRenderOption(valueRenderOption: ValueRenderOption) =
    setValueRenderOption(valueRenderOption.name)

/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
var Sheets.Spreadsheets.Values.BatchGet.valueRenderOptionE: ValueRenderOption?
    get() = valueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { valueRenderOption = value?.name }



/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
fun BatchGetValuesByDataFilterRequest.setValueRenderOption(valueRenderOption: ValueRenderOption) =
    setValueRenderOption(valueRenderOption.name)

/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
var BatchGetValuesByDataFilterRequest.valueRenderOptionE: ValueRenderOption?
    get() = valueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { valueRenderOption = value?.name }



/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
fun BatchUpdateValuesRequest.setResponseValueRenderOption(responseValueRenderOption: ValueRenderOption) =
    setResponseValueRenderOption(responseValueRenderOption.name)

/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
var BatchUpdateValuesRequest.responseValueRenderOptionE: ValueRenderOption?
    get() = responseValueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { responseValueRenderOption = value?.name }



/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
fun BatchUpdateValuesByDataFilterRequest.setResponseValueRenderOption(responseValueRenderOption: ValueRenderOption) =
    setResponseValueRenderOption(responseValueRenderOption.name)

/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
var BatchUpdateValuesByDataFilterRequest.responseValueRenderOptionE: ValueRenderOption?
    get() = responseValueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { responseValueRenderOption = value?.name }



/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
fun Sheets.Spreadsheets.Values.Get.setValueRenderOption(valueRenderOption: ValueRenderOption) =
    setValueRenderOption(valueRenderOption.name)

/** How values should be represented in the output. The default render option is [ValueRenderOption.FORMATTED_VALUE]. */
var Sheets.Spreadsheets.Values.Get.valueRenderOptionE: ValueRenderOption?
    get() = valueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { valueRenderOption = value?.name }



/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
fun Sheets.Spreadsheets.Values.Update.setResponseValueRenderOption(responseValueRenderOption: ValueRenderOption) =
    setResponseValueRenderOption(responseValueRenderOption.name)

/**
 * Determines how values in the response should be rendered.
 * The default render option is [ValueRenderOption.FORMATTED_VALUE].
 * */
var Sheets.Spreadsheets.Values.Update.responseValueRenderOptionE: ValueRenderOption?
    get() = responseValueRenderOption?.let { ValueRenderOption.valueOf(it) }
    set(value) { responseValueRenderOption = value?.name }