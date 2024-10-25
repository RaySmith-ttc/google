package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceObjectReferencesField : Field

object DataSourceObjectReferencesFields {
    val ALL: FieldsList<DataSourceObjectReferencesField> = fieldsList("*")
	val references = object : DataSourceObjectReferencesFieldDataSourceObjectReference("references") {}
}

abstract class DataSourceObjectReferencesFieldDataSourceObjectReference(private val path: String) : FieldsList<DataSourceObjectReferencesField>(path) {
	val chartId: FieldsList<DataSourceObjectReferencesField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : DataSourceObjectReferencesFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : DataSourceObjectReferencesFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : DataSourceObjectReferencesFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<DataSourceObjectReferencesField> get() = fieldsList("${path}/sheetId")
}

abstract class DataSourceObjectReferencesFieldGridCoordinate(private val path: String) : FieldsList<DataSourceObjectReferencesField>(path) {
	val columnIndex: FieldsList<DataSourceObjectReferencesField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<DataSourceObjectReferencesField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<DataSourceObjectReferencesField> get() = fieldsList("${path}/sheetId")
}

