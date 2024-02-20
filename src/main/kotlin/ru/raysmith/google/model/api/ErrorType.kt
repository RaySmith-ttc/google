package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ErrorValue

/** The type of error. */
enum class ErrorType {

    /** The default error type, do not use this. */
    ERROR_TYPE_UNSPECIFIED,

    /** Corresponds to the #ERROR! error. */
    ERROR,

    /** Corresponds to the #NULL! error. */
    NULL_VALUE,

    /** Corresponds to the #DIV/0 error. */
    DIVIDE_BY_ZERO,

    /** Corresponds to the #VALUE! error. */
    VALUE,

    /** Corresponds to the #REF! error. */
    REF,

    /** Corresponds to the #NAME? error. */
    NAME,

    /** Corresponds to the #NUM! error. */
    NUM,

    /** Corresponds to the #N/A error. */
    N_A,

    /** Corresponds to the Loading... state. */
    LOADING,
}

/** The type of error. */
fun ErrorValue.setType(errorType: ErrorType) = setType(errorType.name)

/** The type of error. */
var ErrorValue.typeE: ErrorType?
    get() = type?.let { ErrorType.valueOf(it) }
    set(value) { type = value?.name }