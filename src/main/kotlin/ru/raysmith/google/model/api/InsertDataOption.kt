package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets

/** Determines how existing data is changed when new data is input. */
enum class InsertDataOption {

    /** The new data overwrites existing data in the areas it is written. (Note: adding data to the end of the sheet will still insert new rows or columns so the data can be written.) */
    OVERWRITE,

    /** Rows are inserted for the new data. */
    INSERT_ROWS
}

/** How the input data should be inserted. */
fun Sheets.Spreadsheets.Values.Append.setInsertDataOption(insertDataOption: InsertDataOption) =
    setInsertDataOption(insertDataOption.name)

/** How the input data should be inserted. */
var Sheets.Spreadsheets.Values.Append.insertDataOptionE: InsertDataOption?
    get() = insertDataOption?.let { InsertDataOption.valueOf(it) }
    set(value) { insertDataOption = value?.name }