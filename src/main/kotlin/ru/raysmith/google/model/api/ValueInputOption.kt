package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest
import ru.raysmith.google.snakeCased

/** Determines how input data should be interpreted. */
enum class ValueInputOption {
    /** Default input value. This value must not be used. */
    INPUT_VALUE_OPTION_UNSPECIFIED,

    /** The values the user has entered will not be parsed and will be stored as-is. */
    RAW,

    /** The values will be parsed as if the user typed them into the UI. Numbers will stay as numbers, but strings may be converted to numbers, dates, etc. following the same rules that are applied when entering text into a cell via the Google Sheets UI. */
    USER_ENTERED
}

fun Sheets.Spreadsheets.Values.Update.setValueInputOption(valueInputOption: ValueInputOption) {
    setValueInputOption(valueInputOption.snakeCased())
}

var Sheets.Spreadsheets.Values.Update.dateTimeRenderOptionE: ValueInputOption?
    get() = valueInputOption?.let { ValueInputOption.valueOf(it) }
    set(value) { valueInputOption = value?.snakeCased() }


fun BatchUpdateValuesByDataFilterRequest.setValueInputOption(valueInputOption: ValueInputOption) {
    setValueInputOption(valueInputOption.snakeCased())
}

var BatchUpdateValuesByDataFilterRequest.dateTimeRenderOptionE: ValueInputOption?
    get() = valueInputOption?.let { ValueInputOption.valueOf(it) }
    set(value) { valueInputOption = value?.snakeCased() }

fun Sheets.Spreadsheets.Values.Append.setValueInputOption(valueInputOption: ValueInputOption) {
    setValueInputOption(valueInputOption.snakeCased())
}

var Sheets.Spreadsheets.Values.Append.dateTimeRenderOptionE: ValueInputOption?
    get() = valueInputOption?.let { ValueInputOption.valueOf(it) }
    set(value) { valueInputOption = value?.snakeCased() }

fun BatchUpdateValuesRequest.setValueInputOption(valueInputOption: ValueInputOption) {
    setValueInputOption(valueInputOption.snakeCased())
}

var BatchUpdateValuesRequest.dateTimeRenderOptionE: ValueInputOption?
    get() = valueInputOption?.let { ValueInputOption.valueOf(it) }
    set(value) { valueInputOption = value?.snakeCased() }