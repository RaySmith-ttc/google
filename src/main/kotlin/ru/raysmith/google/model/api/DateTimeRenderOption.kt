package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets.Spreadsheets
import com.google.api.services.sheets.v4.Sheets.Spreadsheets.Values.BatchUpdateByDataFilter
import com.google.api.services.sheets.v4.model.BatchGetValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest
import ru.raysmith.google.snakeCased

/** Determines how dates should be rendered in the output. */
enum class DateTimeRenderOption {
    /** Instructs date, time, datetime, and duration fields to be output as doubles in "serial number" format, as popularized by Lotus 1-2-3. The whole number portion of the value (left of the decimal) counts the days since December 30th 1899. The fractional portion (right of the decimal) counts the time as a fraction of the day. For example, January 1st 1900 at noon would be 2.5, 2 because it's 2 days after December 30st 1899, and .5 because noon is half a day. February 1st 1900 at 3pm would be 33.625. This correctly treats the year 1900 as not a leap year. */
    SERIAL_NUMBER,

    /** Instructs date, time, datetime, and duration fields to be output as strings in their given number format (which is dependent on the spreadsheet locale). */
    FORMATTED_STRING
}

fun Spreadsheets.Values.Get.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) {
    setDateTimeRenderOption(dateTimeRenderOption.snakeCased())
}

var Spreadsheets.Values.Get.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.snakeCased() }

fun Spreadsheets.Values.BatchGet.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) {
    setDateTimeRenderOption(dateTimeRenderOption.snakeCased())
}

var Spreadsheets.Values.BatchGet.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.snakeCased() }

fun BatchGetValuesByDataFilterRequest.setDateTimeRenderOption(dateTimeRenderOption: DateTimeRenderOption) {
    setDateTimeRenderOption(dateTimeRenderOption.snakeCased())
}

var BatchGetValuesByDataFilterRequest.dateTimeRenderOptionE: DateTimeRenderOption?
    get() = dateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { dateTimeRenderOption = value?.snakeCased() }

fun Spreadsheets.Values.Update.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) {
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.snakeCased())
}

var BatchUpdateValuesRequest.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.snakeCased() }

fun BatchUpdateValuesRequest.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) {
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.snakeCased())
}

var BatchUpdateValuesByDataFilterRequest.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.snakeCased() }

fun BatchUpdateValuesByDataFilterRequest.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) {
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.snakeCased())
}

var Spreadsheets.Values.Update.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.snakeCased() }

fun Spreadsheets.Values.Append.setResponseDateTimeRenderOption(responseDateTimeRenderOption: DateTimeRenderOption) {
    setResponseDateTimeRenderOption(responseDateTimeRenderOption.snakeCased())
}

var Spreadsheets.Values.Append.responseDateTimeRenderOptionE: DateTimeRenderOption?
    get() = responseDateTimeRenderOption?.let { DateTimeRenderOption.valueOf(it) }
    set(value) { responseDateTimeRenderOption = value?.snakeCased() }