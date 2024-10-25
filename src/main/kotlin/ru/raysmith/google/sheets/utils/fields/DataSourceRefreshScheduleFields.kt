package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceRefreshScheduleField : Field

object DataSourceRefreshScheduleFields {
    val ALL: FieldsList<DataSourceRefreshScheduleField> = fieldsList("*")
	val dailySchedule = object : DataSourceRefreshScheduleFieldDataSourceRefreshDailySchedule("dailySchedule") {}
	val enabled: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("enabled")
	val monthlySchedule = object : DataSourceRefreshScheduleFieldDataSourceRefreshMonthlySchedule("monthlySchedule") {}
	val nextRun = object : DataSourceRefreshScheduleFieldInterval("nextRun") {}
	val refreshScope: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("refreshScope")
	val weeklySchedule = object : DataSourceRefreshScheduleFieldDataSourceRefreshWeeklySchedule("weeklySchedule") {}
}

abstract class DataSourceRefreshScheduleFieldDataSourceRefreshDailySchedule(private val path: String) : FieldsList<DataSourceRefreshScheduleField>(path) {
	val startTime by lazy { object : DataSourceRefreshScheduleFieldTimeOfDay("${path}/startTime") {} }
}

abstract class DataSourceRefreshScheduleFieldDataSourceRefreshMonthlySchedule(private val path: String) : FieldsList<DataSourceRefreshScheduleField>(path) {
	val daysOfMonth: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/daysOfMonth")
	val startTime by lazy { object : DataSourceRefreshScheduleFieldTimeOfDay("${path}/startTime") {} }
}

abstract class DataSourceRefreshScheduleFieldInterval(private val path: String) : FieldsList<DataSourceRefreshScheduleField>(path) {
	val endTime: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/endTime")
	val startTime: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/startTime")
}

abstract class DataSourceRefreshScheduleFieldDataSourceRefreshWeeklySchedule(private val path: String) : FieldsList<DataSourceRefreshScheduleField>(path) {
	val daysOfWeek: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/daysOfWeek")
	val startTime by lazy { object : DataSourceRefreshScheduleFieldTimeOfDay("${path}/startTime") {} }
}

abstract class DataSourceRefreshScheduleFieldTimeOfDay(private val path: String) : FieldsList<DataSourceRefreshScheduleField>(path) {
	val hours: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<DataSourceRefreshScheduleField> get() = fieldsList("${path}/seconds")
}

