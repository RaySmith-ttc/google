package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RefreshDataSourceObjectExecutionStatusField : Field

object RefreshDataSourceObjectExecutionStatusFields {
    val ALL: FieldsList<RefreshDataSourceObjectExecutionStatusField> = fieldsList("*")
	val dataExecutionStatus = object : RefreshDataSourceObjectExecutionStatusFieldDataExecutionStatus("dataExecutionStatus") {}
	val reference = object : RefreshDataSourceObjectExecutionStatusFieldDataSourceObjectReference("reference") {}
}

abstract class RefreshDataSourceObjectExecutionStatusFieldDataExecutionStatus(private val path: String) : FieldsList<RefreshDataSourceObjectExecutionStatusField>(path) {
	val errorCode: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/state")
}

abstract class RefreshDataSourceObjectExecutionStatusFieldDataSourceObjectReference(private val path: String) : FieldsList<RefreshDataSourceObjectExecutionStatusField>(path) {
	val chartId: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : RefreshDataSourceObjectExecutionStatusFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : RefreshDataSourceObjectExecutionStatusFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : RefreshDataSourceObjectExecutionStatusFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/sheetId")
}

abstract class RefreshDataSourceObjectExecutionStatusFieldGridCoordinate(private val path: String) : FieldsList<RefreshDataSourceObjectExecutionStatusField>(path) {
	val columnIndex: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<RefreshDataSourceObjectExecutionStatusField> get() = fieldsList("${path}/sheetId")
}

