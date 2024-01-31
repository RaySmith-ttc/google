package ru.raysmith.google.model.api

/**
 * The major dimension of the values.
 *
 * For output, if the spreadsheet data is: A1=1,B1=2,A2=3,B2=4, then requesting range=A1:B2,majorDimension=ROWS will return [[1,2],[3,4]], whereas requesting range=A1:B2,majorDimension=COLUMNS will return [[1,3],[2,4]].
 *
 * For input, with range=A1:B2,majorDimension=ROWS then [[1,2],[3,4]] will set A1=1,B1=2,A2=3,B2=4. With range=A1:B2,majorDimension=COLUMNS then [[1,2],[3,4]] will set A1=1,B1=3,A2=2,B2=4.
 *
 * When writing, if this field is not set, it defaults to ROWS.
 * */
enum class MajorDimension {
    /** The default value, do not use. */
    DIMENSION_UNSPECIFIED,

    /** Operates on the rows of a sheet. */
    ROWS,

    /** Operates on the columns of a sheet. */
    COLUMNS
}