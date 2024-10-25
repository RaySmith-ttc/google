package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceChartPropertiesField : Field

object DataSourceChartPropertiesFields {
    val ALL: FieldsList<DataSourceChartPropertiesField> = fieldsList("*")
	val dataExecutionStatus = object : DataSourceChartPropertiesFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSourceId: FieldsList<DataSourceChartPropertiesField> get() = fieldsList("dataSourceId")
}

abstract class DataSourceChartPropertiesFieldDataExecutionStatus(private val path: String) : FieldsList<DataSourceChartPropertiesField>(path) {
	val errorCode: FieldsList<DataSourceChartPropertiesField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<DataSourceChartPropertiesField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<DataSourceChartPropertiesField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<DataSourceChartPropertiesField> get() = fieldsList("${path}/state")
}

