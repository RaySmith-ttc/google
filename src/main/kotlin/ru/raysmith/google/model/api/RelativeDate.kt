package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ConditionValue

/** Controls how a date condition is evaluated. */
enum class RelativeDate {

    /** Default value, do not use. */
    RELATIVE_DATE_UNSPECIFIED,

    /** The value is one year before today. */
    PAST_YEAR,

    /** The value is one month before today. */
    PAST_MONTH,

    /** The value is one week before today. */
    PAST_WEEK,

    /** The value is yesterday. */
    YESTERDAY,

    /** The value is today. */
    TODAY,

    /** The value is tomorrow. */
    TOMORROW,

}

/**
 * A relative date (based on the current date). Valid only if the type is [ConditionType.DATE_BEFORE],
 * [ConditionType.DATE_AFTER], [ConditionType.DATE_ON_OR_BEFORE] or [ConditionType.DATE_ON_OR_AFTER].
 * Relative dates are not supported in data validation.
 * They are supported only in conditional formatting and conditional filters.
 * */
fun ConditionValue.setRelativeDate(relativeDate: RelativeDate) = setRelativeDate(relativeDate.name)

/**
 * A relative date (based on the current date). Valid only if the type is [ConditionType.DATE_BEFORE],
 * [ConditionType.DATE_AFTER], [ConditionType.DATE_ON_OR_BEFORE] or [ConditionType.DATE_ON_OR_AFTER].
 * Relative dates are not supported in data validation.
 * They are supported only in conditional formatting and conditional filters.
 * */
var ConditionValue.relativeDateE: RelativeDate?
    get() = relativeDate?.let { RelativeDate.valueOf(it) }
    set(value) { relativeDate = value?.name }