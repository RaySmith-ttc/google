package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceRefreshDailyScheduleField : Field

object DataSourceRefreshDailyScheduleFields {
    val ALL: FieldsList<DataSourceRefreshDailyScheduleField> = fieldsList("*")
	val startTime = object : DataSourceRefreshDailyScheduleFieldTimeOfDay("startTime") {}
}

abstract class DataSourceRefreshDailyScheduleFieldTimeOfDay(private val path: String) : FieldsList<DataSourceRefreshDailyScheduleField>(path) {
	val hours: FieldsList<DataSourceRefreshDailyScheduleField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<DataSourceRefreshDailyScheduleField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<DataSourceRefreshDailyScheduleField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<DataSourceRefreshDailyScheduleField> get() = fieldsList("${path}/seconds")
}

