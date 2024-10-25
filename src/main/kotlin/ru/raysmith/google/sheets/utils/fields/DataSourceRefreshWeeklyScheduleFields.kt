package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceRefreshWeeklyScheduleField : Field

object DataSourceRefreshWeeklyScheduleFields {
    val ALL: FieldsList<DataSourceRefreshWeeklyScheduleField> = fieldsList("*")
	val daysOfWeek: FieldsList<DataSourceRefreshWeeklyScheduleField> get() = fieldsList("daysOfWeek")
	val startTime = object : DataSourceRefreshWeeklyScheduleFieldTimeOfDay("startTime") {}
}

abstract class DataSourceRefreshWeeklyScheduleFieldTimeOfDay(private val path: String) : FieldsList<DataSourceRefreshWeeklyScheduleField>(path) {
	val hours: FieldsList<DataSourceRefreshWeeklyScheduleField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<DataSourceRefreshWeeklyScheduleField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<DataSourceRefreshWeeklyScheduleField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<DataSourceRefreshWeeklyScheduleField> get() = fieldsList("${path}/seconds")
}

