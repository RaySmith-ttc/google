package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceRefreshMonthlyScheduleField : Field

object DataSourceRefreshMonthlyScheduleFields {
    val ALL: FieldsList<DataSourceRefreshMonthlyScheduleField> = fieldsList("*")
	val daysOfMonth: FieldsList<DataSourceRefreshMonthlyScheduleField> get() = fieldsList("daysOfMonth")
	val startTime = object : DataSourceRefreshMonthlyScheduleFieldTimeOfDay("startTime") {}
}

abstract class DataSourceRefreshMonthlyScheduleFieldTimeOfDay(private val path: String) : FieldsList<DataSourceRefreshMonthlyScheduleField>(path) {
	val hours: FieldsList<DataSourceRefreshMonthlyScheduleField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<DataSourceRefreshMonthlyScheduleField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<DataSourceRefreshMonthlyScheduleField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<DataSourceRefreshMonthlyScheduleField> get() = fieldsList("${path}/seconds")
}

