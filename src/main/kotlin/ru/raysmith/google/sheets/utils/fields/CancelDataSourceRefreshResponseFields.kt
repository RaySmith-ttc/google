package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CancelDataSourceRefreshResponseField : Field

object CancelDataSourceRefreshResponseFields {
    val ALL: FieldsList<CancelDataSourceRefreshResponseField> = fieldsList("*")
	val statuses = object : CancelDataSourceRefreshResponseFieldCancelDataSourceRefreshStatus("statuses") {}
}

abstract class CancelDataSourceRefreshResponseFieldCancelDataSourceRefreshStatus(private val path: String) : FieldsList<CancelDataSourceRefreshResponseField>(path) {
	val reference by lazy { object : CancelDataSourceRefreshResponseFieldDataSourceObjectReference("${path}/reference") {} }
	val refreshCancellationStatus by lazy { object : CancelDataSourceRefreshResponseFieldRefreshCancellationStatus("${path}/refreshCancellationStatus") {} }
}

abstract class CancelDataSourceRefreshResponseFieldDataSourceObjectReference(private val path: String) : FieldsList<CancelDataSourceRefreshResponseField>(path) {
	val chartId: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : CancelDataSourceRefreshResponseFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : CancelDataSourceRefreshResponseFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : CancelDataSourceRefreshResponseFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class CancelDataSourceRefreshResponseFieldRefreshCancellationStatus(private val path: String) : FieldsList<CancelDataSourceRefreshResponseField>(path) {
	val errorCode: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/errorCode")
	val state: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/state")
}

abstract class CancelDataSourceRefreshResponseFieldGridCoordinate(private val path: String) : FieldsList<CancelDataSourceRefreshResponseField>(path) {
	val columnIndex: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<CancelDataSourceRefreshResponseField> get() = fieldsList("${path}/sheetId")
}

