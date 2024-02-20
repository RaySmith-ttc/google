package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataExecutionStatus

/** An enumeration of data execution error code. */
enum class DataExecutionErrorCode {


    /** Default value, do not use. */
    DATA_EXECUTION_ERROR_CODE_UNSPECIFIED,

    /** The data execution timed out. */
    TIMED_OUT,

    /** The data execution returns more rows than the limit. */
    TOO_MANY_ROWS,

    /** The data execution returns more columns than the limit. */
    TOO_MANY_COLUMNS,

    /** The data execution returns more cells than the limit. */
    TOO_MANY_CELLS,

    /** Error is received from the backend data execution engine (e.g. BigQuery). Check errorMessage for details. */
    ENGINE,

    /** One or some of the provided data source parameters are invalid. */
    PARAMETER_INVALID,

    /** The data execution returns an unsupported data type. */
    UNSUPPORTED_DATA_TYPE,

    /** The data execution returns duplicate column names or aliases. */
    DUPLICATE_COLUMN_NAMES,

    /** The data execution is interrupted. Please refresh later. */
    INTERRUPTED,

    /** The data execution is currently in progress, can not be refreshed until it completes. */
    CONCURRENT_QUERY,

    /** Other errors. */
    OTHER,

    /** The data execution returns values that exceed the maximum characters allowed in a single cell. */
    TOO_MANY_CHARS_PER_CELL,

    /** The database referenced by the data source is not found. */
    DATA_NOT_FOUND,

    /** The user does not have access to the database referenced by the data source. */
    PERMISSION_DENIED,

    /** The data execution returns columns with missing aliases. */
    MISSING_COLUMN_ALIAS,

    /** The data source object does not exist. */
    OBJECT_NOT_FOUND,

    /** The data source object is currently in error state. To force refresh, set force in RefreshDataSourceRequest. */
    OBJECT_IN_ERROR_STATE,

    /** The data source object specification is invalid. */
    OBJECT_SPEC_INVALID,

}

/** The error code. */
fun DataExecutionStatus.setErrorCode(errorCode: DataExecutionErrorCode) = setErrorCode(errorCode.name)

/** The error code. */
var DataExecutionStatus.errorCodeE: DataExecutionErrorCode?
    get() = errorCode?.let { DataExecutionErrorCode.valueOf(it) }
    set(value) { errorCode = value?.name }