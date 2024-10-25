package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RefreshDataSourceResponseField : Field

object RefreshDataSourceResponseFields {
    val ALL: FieldsList<RefreshDataSourceResponseField> = fieldsList("*")
	val statuses = object : RefreshDataSourceResponseFieldRefreshDataSourceObjectExecutionStatus("statuses") {}
}

abstract class RefreshDataSourceResponseFieldRefreshDataSourceObjectExecutionStatus(private val path: String) : FieldsList<RefreshDataSourceResponseField>(path) {
	val dataExecutionStatus by lazy { object : RefreshDataSourceResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val reference by lazy { object : RefreshDataSourceResponseFieldDataSourceObjectReference("${path}/reference") {} }
}

abstract class RefreshDataSourceResponseFieldDataExecutionStatus(private val path: String) : FieldsList<RefreshDataSourceResponseField>(path) {
	val errorCode: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/state")
}

abstract class RefreshDataSourceResponseFieldDataSourceObjectReference(private val path: String) : FieldsList<RefreshDataSourceResponseField>(path) {
	val chartId: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : RefreshDataSourceResponseFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : RefreshDataSourceResponseFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : RefreshDataSourceResponseFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class RefreshDataSourceResponseFieldGridCoordinate(private val path: String) : FieldsList<RefreshDataSourceResponseField>(path) {
	val columnIndex: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<RefreshDataSourceResponseField> get() = fieldsList("${path}/sheetId")
}

