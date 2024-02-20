package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataSourceRefreshWeeklySchedule

/** Represents a day of the week. */
enum class DayOfWeek {

    /** The day of the week is unspecified. */
    AY_OF_WEEK_UNSPECIFIED,

    /** Monday */
    MONDAY,

    /** Tuesday */
    TUESDAY,

    /** Wednesday */
    WEDNESDAY,

    /** Thursday */
    THURSDAY,

    /** Friday */
    FRIDAY,

    /** Saturday */
    SATURDAY,

    /** Sunday */
    SUNDAY,
    
}

/** Days of the week to refresh. At least one day must be specified. */
fun DataSourceRefreshWeeklySchedule.setDaysOfWeek(daysOfWeek: List<DayOfWeek>) =
    setDaysOfWeek(daysOfWeek.map { it.name })

/** Days of the week to refresh. At least one day must be specified. */
var DataSourceRefreshWeeklySchedule.daysOfWeekE
    get() = daysOfWeek.map { DayOfWeek.valueOf(it) }
    set(value) { daysOfWeek = value.map { it.name } }