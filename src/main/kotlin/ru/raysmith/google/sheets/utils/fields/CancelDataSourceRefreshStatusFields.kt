package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CancelDataSourceRefreshStatusField : Field

object CancelDataSourceRefreshStatusFields {
    val ALL: FieldsList<CancelDataSourceRefreshStatusField> = fieldsList("*")
	val reference = object : CancelDataSourceRefreshStatusFieldDataSourceObjectReference("reference") {}
	val refreshCancellationStatus = object : CancelDataSourceRefreshStatusFieldRefreshCancellationStatus("refreshCancellationStatus") {}
}

abstract class CancelDataSourceRefreshStatusFieldDataSourceObjectReference(private val path: String) : FieldsList<CancelDataSourceRefreshStatusField>(path) {
	val chartId: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : CancelDataSourceRefreshStatusFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : CancelDataSourceRefreshStatusFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : CancelDataSourceRefreshStatusFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/sheetId")
}

abstract class CancelDataSourceRefreshStatusFieldRefreshCancellationStatus(private val path: String) : FieldsList<CancelDataSourceRefreshStatusField>(path) {
	val errorCode: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/errorCode")
	val state: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/state")
}

abstract class CancelDataSourceRefreshStatusFieldGridCoordinate(private val path: String) : FieldsList<CancelDataSourceRefreshStatusField>(path) {
	val columnIndex: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<CancelDataSourceRefreshStatusField> get() = fieldsList("${path}/sheetId")
}

