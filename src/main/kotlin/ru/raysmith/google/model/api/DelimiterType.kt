package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.TextToColumnsRequest

/** The delimiter to split on. */
enum class DelimiterType {

    /** Default value. This value must not be used. */
    DELIMITER_TYPE_UNSPECIFIED,

    /** "," */
    COMMA,

    /** ";" */
    SEMICOLON,

    /** "." */
    PERIOD,

    /** " " */
    SPACE,

    /** A custom value as defined in delimiter. */
    CUSTOM,

    /** Automatically detect columns. */
    AUTODETECT,

}

/** The delimiter type to use. */
fun TextToColumnsRequest.setDelimiterType(delimiterType: DelimiterType) = setDelimiterType(delimiterType.name)

/** The delimiter type to use. */
var TextToColumnsRequest.delimiterTypeE: DelimiterType?
    get() = delimiterType?.let { DelimiterType.valueOf(it) }
    set(value) { delimiterType = value?.name }
