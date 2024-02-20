package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DateTimeRule

/**
 * The available types of date-time grouping rules. This documentation assumes the spreadsheet locale is "en-US",
 * though the actual rendering of the dates and times uses the locale of the spreadsheet for some rule types.
 * */
enum class DateTimeRuleType {

    /** The default type, do not use. */
    DATE_TIME_RULE_TYPE_UNSPECIFIED,

    /** Group dates by second, from 0 to 59. */
    SECOND,

    /** Group dates by minute, from 0 to 59. */
    MINUTE,

    /** Group dates by hour using a 24-hour system, from 0 to 23. */
    HOUR,

    /** Group dates by hour and minute using a 24-hour system, for example 19:45. */
    HOUR_MINUTE,

    /** Group dates by hour and minute using a 12-hour system, for example 7:45 PM. The AM/PM designation is translated based on the spreadsheet locale. */
    HOUR_MINUTE_AMPM,

    /** Group dates by day of week, for example Sunday. The days of the week will be translated based on the spreadsheet locale. */
    DAY_OF_WEEK,

    /** Group dates by day of year, from 1 to 366. Note that dates after Feb. 29 fall in different buckets in leap years than in non-leap years. */
    DAY_OF_YEAR,

    /** Group dates by day of month, from 1 to 31. */
    DAY_OF_MONTH,

    /** Group dates by day and month, for example 22-Nov. The month is translated based on the spreadsheet locale. */
    DAY_MONTH,

    /** Group dates by month, for example Nov. The month is translated based on the spreadsheet locale. */
    MONTH,

    /** Group dates by quarter, for example Q1 (which represents Jan-Mar). */
    QUARTER,

    /** Group dates by year, for example 2008. */
    YEAR,

    /** Group dates by year and month, for example 2008-Nov. The month is translated based on the spreadsheet locale. */
    YEAR_MONTH,

    /** Group dates by year and quarter, for example 2008 Q4. */
    YEAR_QUARTER,

    /** Group dates by year, month, and day, for example 2008-11-22. */
    YEAR_MONTH_DAY,

}

/** The type of date-time grouping to apply. */
fun DateTimeRule.setType(type: DateTimeRuleType) = setType(type.name)

/** The type of date-time grouping to apply. */
var DateTimeRule.typeE: DateTimeRuleType?
    get() = type?.let { DateTimeRuleType.valueOf(it) }
    set(value) { type = value?.name }