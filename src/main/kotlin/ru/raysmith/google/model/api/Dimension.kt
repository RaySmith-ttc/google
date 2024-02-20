package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*

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


/**
 * The major dimension of the values. For output, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
 * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting
 * `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`. For input, with `range=A1:B2,majorDimension=ROWS`
 * then `[[1,2],[3,4]]` will set `A1=1,B1=2,A2=3,B2=4`. With `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]`
 * will set `A1=1,B1=3,A2=2,B2=4`. When writing, if this field is not set, it defaults to [Dimension.ROWS].
 * */
fun ValueRange.setMajorDimension(majorDimension: Dimension) = setMajorDimension(majorDimension.name)

/**
 * The major dimension of the values. For output, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
 * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting
 * `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`. For input, with `range=A1:B2,majorDimension=ROWS`
 * then `[[1,2],[3,4]]` will set `A1=1,B1=2,A2=3,B2=4`. With `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]`
 * will set `A1=1,B1=3,A2=2,B2=4`. When writing, if this field is not set, it defaults to [Dimension.ROWS].
 * */
var ValueRange.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.name }

/** The dimension of the span. */
fun DimensionRange.setDimension(dimension: Dimension) = setDimension(dimension.name)

/** The dimension of the span. */
var DimensionRange.dimensionE: Dimension?
    get() = dimension?.let { Dimension.valueOf(it) }
    set(value) { dimension = value?.name }

/** The major dimension of the values. */
fun DataFilterValueRange.setMajorDimension(majorDimension: Dimension) = setMajorDimension(majorDimension.name)

/** The major dimension of the values. */
var DataFilterValueRange.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.name }

/** The dimension that data should be filled into. */
fun SourceAndDestination.setDimension(dimension: Dimension) = setDimension(dimension.name)

/** The dimension that data should be filled into. */
var SourceAndDestination.dimensionE: Dimension?
    get() = dimension?.let { Dimension.valueOf(it) }
    set(value) { dimension = value?.name }



/**
 * The dimension which will be shifted when inserting cells. If [Dimension.ROWS], existing cells will be shifted down.
 * If [Dimension.COLUMNS], existing cells will be shifted right.
 * */
fun InsertRangeRequest.setShiftDimension(dimension: Dimension) = setShiftDimension(dimension.name)

/**
 * The dimension which will be shifted when inserting cells. If [Dimension.ROWS], existing cells will be shifted down.
 * If [Dimension.COLUMNS], existing cells will be shifted right.
 * */
var InsertRangeRequest.shiftDimensionE: Dimension?
    get() = shiftDimension?.let { Dimension.valueOf(it) }
    set(value) { shiftDimension = value?.name }



/**
 * The dimension from which deleted cells will be replaced with. If [Dimension.ROWS], existing cells will be shifted
 * upward to replace the deleted cells. If COLUMNS, existing cells will be shifted left to replace the deleted cells.
 * */
fun DeleteRangeRequest.setShiftDimension(dimension: Dimension) = setShiftDimension(dimension.name)

/**
 * The dimension from which deleted cells will be replaced with. If [Dimension.ROWS], existing cells will be shifted
 * upward to replace the deleted cells. If COLUMNS, existing cells will be shifted left to replace the deleted cells.
 * */
var DeleteRangeRequest.shiftDimensionE: Dimension?
    get() = shiftDimension?.let { Dimension.valueOf(it) }
    set(value) { shiftDimension = value?.name }



/** Whether rows or columns should be appended. */
fun AppendDimensionRequest.setDimension(dimension: Dimension) = setDimension(dimension.name)

/** Whether rows or columns should be appended. */
var AppendDimensionRequest.dimensionE: Dimension?
    get() = dimension?.let { Dimension.valueOf(it) }
    set(value) { dimension = value?.name }



/**
 * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
 * then requesting `ranges=["A1:B2"],majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas requesting `ranges=["A1:B2"],majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
fun Sheets.Spreadsheets.Values.BatchGet.setMajorDimension(majorDimension: Dimension) =
    setMajorDimension(majorDimension.name)

/**
 * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
 * then requesting `ranges=["A1:B2"],majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas requesting `ranges=["A1:B2"],majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
var Sheets.Spreadsheets.Values.BatchGet.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.name }



/**
 * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
 * then a request that selects that range and sets `majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas a request that sets `majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
fun BatchGetValuesByDataFilterRequest.setMajorDimension(majorDimension: Dimension) =
    setMajorDimension(majorDimension.name)

/**
 * The major dimension that results should use. For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
 * then a request that selects that range and sets `majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas a request that sets `majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
var BatchGetValuesByDataFilterRequest.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.name }



/**
 * The major dimension that results should use. For example, if the spreadsheet data in Sheet1 is:
 * `A1=1,B1=2,A2=3,B2=4`, then requesting `range=Sheet1!A1:B2?majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas requesting `range=Sheet1!A1:B2?majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
fun Sheets.Spreadsheets.Values.Get.setMajorDimension(majorDimension: Dimension) =
    setMajorDimension(majorDimension.name)

/**
 * The major dimension that results should use. For example, if the spreadsheet data in Sheet1 is:
 * `A1=1,B1=2,A2=3,B2=4`, then requesting `range=Sheet1!A1:B2?majorDimension=ROWS` returns `[[1,2],[3,4]]`,
 * whereas requesting `range=Sheet1!A1:B2?majorDimension=COLUMNS` returns `[[1,3],[2,4]]`.
 * */
var Sheets.Spreadsheets.Values.Get.majorDimensionE: Dimension?
    get() = majorDimension?.let { Dimension.valueOf(it) }
    set(value) { majorDimension = value?.name }