package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.SpreadsheetProperties

/** An enumeration of the possible recalculation interval options. */
enum class RecalculationInterval {

    /** Default value. This value must not be used. */
    RECALCULATION_INTERVAL_UNSPECIFIED,

    /** Volatile functions are updated on every change. */
    ON_CHANGE,

    /** Volatile functions are updated on every change and every minute. */
    MINUTE,

    /** Volatile functions are updated on every change and hourly. */
    HOUR,
}

/** The amount of time to wait before volatile functions are recalculated. */
fun SpreadsheetProperties.setAutoRecalc(autoRecalc: RecalculationInterval) = setAutoRecalc(autoRecalc.name)

/** The amount of time to wait before volatile functions are recalculated. */
var SpreadsheetProperties.autoRecalcE: RecalculationInterval?
    get() = autoRecalc?.let { RecalculationInterval.valueOf(it) }
    set(value) { autoRecalc = value?.name }