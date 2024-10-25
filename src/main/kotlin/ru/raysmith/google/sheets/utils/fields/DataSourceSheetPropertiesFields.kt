package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceSheetPropertiesField : Field

object DataSourceSheetPropertiesFields {
    val ALL: FieldsList<DataSourceSheetPropertiesField> = fieldsList("*")
	val columns = object : DataSourceSheetPropertiesFieldDataSourceColumn("columns") {}
	val dataExecutionStatus = object : DataSourceSheetPropertiesFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSourceId: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("dataSourceId")
}

abstract class DataSourceSheetPropertiesFieldDataSourceColumn(private val path: String) : FieldsList<DataSourceSheetPropertiesField>(path) {
	val formula: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : DataSourceSheetPropertiesFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class DataSourceSheetPropertiesFieldDataExecutionStatus(private val path: String) : FieldsList<DataSourceSheetPropertiesField>(path) {
	val errorCode: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/state")
}

abstract class DataSourceSheetPropertiesFieldDataSourceColumnReference(private val path: String) : FieldsList<DataSourceSheetPropertiesField>(path) {
	val name: FieldsList<DataSourceSheetPropertiesField> get() = fieldsList("${path}/name")
}

