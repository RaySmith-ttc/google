package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceObjectReferenceField : Field

object DataSourceObjectReferenceFields {
    val ALL: FieldsList<DataSourceObjectReferenceField> = fieldsList("*")
	val chartId: FieldsList<DataSourceObjectReferenceField> get() = fieldsList("chartId")
	val dataSourceFormulaCell = object : DataSourceObjectReferenceFieldGridCoordinate("dataSourceFormulaCell") {}
	val dataSourcePivotTableAnchorCell = object : DataSourceObjectReferenceFieldGridCoordinate("dataSourcePivotTableAnchorCell") {}
	val dataSourceTableAnchorCell = object : DataSourceObjectReferenceFieldGridCoordinate("dataSourceTableAnchorCell") {}
	val sheetId: FieldsList<DataSourceObjectReferenceField> get() = fieldsList("sheetId")
}

abstract class DataSourceObjectReferenceFieldGridCoordinate(private val path: String) : FieldsList<DataSourceObjectReferenceField>(path) {
	val columnIndex: FieldsList<DataSourceObjectReferenceField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<DataSourceObjectReferenceField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<DataSourceObjectReferenceField> get() = fieldsList("${path}/sheetId")
}

