package ru.raysmith.google.model.api

/** Specific error code indicating what went wrong. */
enum class ErrorCode {

    /** General API error - no additional details to add. */
    ERROR_CODE_UNSPECIFIED,

    /** Indicates that a document is too large to continue editing. Making a copy of the spreadsheet may fix the issue. */
    DOCUMENT_TOO_LARGE_TO_EDIT,

    /** Indicates that a document is too large to load. Making a copy of the spreadsheet may fix the issue. */
    DOCUMENT_TOO_LARGE_TO_LOAD,

}