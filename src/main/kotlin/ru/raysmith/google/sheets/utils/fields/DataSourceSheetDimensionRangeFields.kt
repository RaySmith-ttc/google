package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceSheetDimensionRangeField : Field

object DataSourceSheetDimensionRangeFields {
    val ALL: FieldsList<DataSourceSheetDimensionRangeField> = fieldsList("*")
	val columnReferences = object : DataSourceSheetDimensionRangeFieldDataSourceColumnReference("columnReferences") {}
	val sheetId: FieldsList<DataSourceSheetDimensionRangeField> get() = fieldsList("sheetId")
}

abstract class DataSourceSheetDimensionRangeFieldDataSourceColumnReference(private val path: String) : FieldsList<DataSourceSheetDimensionRangeField>(path) {
	val name: FieldsList<DataSourceSheetDimensionRangeField> get() = fieldsList("${path}/name")
}

