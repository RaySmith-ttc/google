package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CancelDataSourceRefreshRequestField : Field

object CancelDataSourceRefreshRequestFields {
    val ALL: FieldsList<CancelDataSourceRefreshRequestField> = fieldsList("*")
	val dataSourceId: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("dataSourceId")
	val isAll: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("isAll")
	val references = object : CancelDataSourceRefreshRequestFieldDataSourceObjectReferences("references") {}
}

abstract class CancelDataSourceRefreshRequestFieldDataSourceObjectReferences(private val path: String) : FieldsList<CancelDataSourceRefreshRequestField>(path) {
	val references by lazy { object : CancelDataSourceRefreshRequestFieldDataSourceObjectReference("${path}/references") {} }
}

abstract class CancelDataSourceRefreshRequestFieldDataSourceObjectReference(private val path: String) : FieldsList<CancelDataSourceRefreshRequestField>(path) {
	val chartId: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : CancelDataSourceRefreshRequestFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : CancelDataSourceRefreshRequestFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : CancelDataSourceRefreshRequestFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class CancelDataSourceRefreshRequestFieldGridCoordinate(private val path: String) : FieldsList<CancelDataSourceRefreshRequestField>(path) {
	val columnIndex: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<CancelDataSourceRefreshRequestField> get() = fieldsList("${path}/sheetId")
}

