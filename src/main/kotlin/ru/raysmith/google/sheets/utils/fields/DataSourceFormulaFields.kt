package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceFormulaField : Field

object DataSourceFormulaFields {
    val ALL: FieldsList<DataSourceFormulaField> = fieldsList("*")
	val dataExecutionStatus = object : DataSourceFormulaFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSourceId: FieldsList<DataSourceFormulaField> get() = fieldsList("dataSourceId")
}

abstract class DataSourceFormulaFieldDataExecutionStatus(private val path: String) : FieldsList<DataSourceFormulaField>(path) {
	val errorCode: FieldsList<DataSourceFormulaField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<DataSourceFormulaField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<DataSourceFormulaField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<DataSourceFormulaField> get() = fieldsList("${path}/state")
}

