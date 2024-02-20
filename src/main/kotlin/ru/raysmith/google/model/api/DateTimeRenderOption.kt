package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest

/** Determines how dates should be rendered in the output. */
enum class DateTimeRenderOption {
    /** Instructs date, time, datetime, and duration fields to be output as doubles in "serial number" format, as popularized by Lotus 1-2-3. The whole number portion of the value (left of the decimal) counts the days since December 30th 1899. The fractional portion (right of the decimal) counts the time as a fraction of the day. For example, January 1st 1900 at noon would be 2.5, 2 because it's 2 days after December 30st 1899, and .5 because noon is half a day. February 1st 1900 at 3pm would be 33.625. This correctly treats the year 1900 as not a leap year. */
    SERIAL_NUMBER,

    /** Instructs date, time, datetime, and duration fields to be output as strings in their given number format (which is dependent on the spreadsheet locale). */
    FORMATTED_STRING
}

/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun Sheets.Spreadsheets.Values.Append.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) =
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.name)

/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var Sheets.Spreadsheets.Values.Append.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.name }



/**
 * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun Sheets.Spreadsheets.Values.BatchGet.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) =
    setDateTimeRenderOption(dateTimeRenderOption.name)

/**
 * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var Sheets.Spreadsheets.Values.BatchGet.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.name }



/**
 * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun BatchGetValuesByDataFilterRequest.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) =
    setDateTimeRenderOption(dateTimeRenderOption.name)

/**
 * How dates, times, and durations should be represented in the output. This is ignored if value_render_option is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var BatchGetValuesByDataFilterRequest.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.name }



/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun BatchUpdateValuesRequest.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) =
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.name)

/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var BatchUpdateValuesRequest.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.name }



/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun BatchUpdateValuesByDataFilterRequest.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) =
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.name)

/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var BatchUpdateValuesByDataFilterRequest.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.name }



/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun Sheets.Spreadsheets.Values.Get.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) =
    setDateTimeRenderOption(dateTimeRenderOption.name)

/**
 * How dates, times, and durations should be represented in the output. This is ignored if value_render_option
 * is [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var Sheets.Spreadsheets.Values.Get.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.name }



/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
fun Sheets.Spreadsheets.Values.Update.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) =
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.name)

/**
 * Determines how dates, times, and durations in the response should be rendered. This is ignored if
 * [responseValueRenderOption][Sheets.Spreadsheets.Values.Append.responseValueRenderOption] is
 * [ValueRenderOption.FORMATTED_VALUE]. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
 * */
var Sheets.Spreadsheets.Values.Update.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.name }