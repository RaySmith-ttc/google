package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchUpdateValuesByDataFilterRequest
import com.google.api.services.sheets.v4.model.DataFilterValueRange
import com.google.api.services.sheets.v4.model.DimensionRange
import com.google.api.services.sheets.v4.model.ValueRange
import ru.raysmith.google.snakeCased

/**
 * The major dimension of the values.
 *
 * For output, if the spreadsheet data is: A1=1,B1=2,A2=3,B2=4, then requesting range=A1:B2,majorDimension=ROWS will return [[1,2],[3,4]], whereas requesting range=A1:B2,majorDimension=COLUMNS will return [[1,3],[2,4]].
 *
 * For input, with range=A1:B2,majorDimension=ROWS then [[1,2],[3,4]] will set A1=1,B1=2,A2=3,B2=4. With range=A1:B2,majorDimension=COLUMNS then [[1,2],[3,4]] will set A1=1,B1=3,A2=2,B2=4.
 *
 * When writing, if this field is not set, it defaults to ROWS.
 * */
enum class Dimension {
    /** The default value, do not use. */
    DIMENSION_UNSPECIFIED,

    /** Operates on the rows of a sheet. */
    ROWS,

    /** Operates on the columns of a sheet. */
    COLUMNS
}

fun ValueRange.setDimension(majorDimension: Dimension) {
    setMajorDimension(majorDimension.snakeCased())
}

var ValueRange.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.snakeCased() }

fun DimensionRange.setDimension(dimension: Dimension) {
    setDimension(dimension.snakeCased())
}

var DimensionRange.dimensionE: Dimension?
    get() = dimension?.let { Dimension.valueOf(it) }
    set(value) { dimension = value?.snakeCased() }

fun Sheets.Spreadsheets.Values.Get.setMajorDimension(majorDimension: Dimension) {
    setMajorDimension(majorDimension.snakeCased())
}

var Sheets.Spreadsheets.Values.Get.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.snakeCased() }


fun DataFilterValueRange.setMajorDimension(majorDimension: Dimension) {
    setMajorDimension(majorDimension.snakeCased())
}

var DataFilterValueRange.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.snakeCased() }

