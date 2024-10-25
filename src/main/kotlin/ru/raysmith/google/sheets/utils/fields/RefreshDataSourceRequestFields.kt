package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RefreshDataSourceRequestField : Field

object RefreshDataSourceRequestFields {
    val ALL: FieldsList<RefreshDataSourceRequestField> = fieldsList("*")
	val dataSourceId: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("dataSourceId")
	val force: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("force")
	val isAll: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("isAll")
	val references = object : RefreshDataSourceRequestFieldDataSourceObjectReferences("references") {}
}

abstract class RefreshDataSourceRequestFieldDataSourceObjectReferences(private val path: String) : FieldsList<RefreshDataSourceRequestField>(path) {
	val references by lazy { object : RefreshDataSourceRequestFieldDataSourceObjectReference("${path}/references") {} }
}

abstract class RefreshDataSourceRequestFieldDataSourceObjectReference(private val path: String) : FieldsList<RefreshDataSourceRequestField>(path) {
	val chartId: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : RefreshDataSourceRequestFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : RefreshDataSourceRequestFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : RefreshDataSourceRequestFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RefreshDataSourceRequestFieldGridCoordinate(private val path: String) : FieldsList<RefreshDataSourceRequestField>(path) {
	val columnIndex: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<RefreshDataSourceRequestField> get() = fieldsList("${path}/sheetId")
}

