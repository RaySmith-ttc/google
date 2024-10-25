package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceParameterField : Field

object DataSourceParameterFields {
    val ALL: FieldsList<DataSourceParameterField> = fieldsList("*")
	val name: FieldsList<DataSourceParameterField> get() = fieldsList("name")
	val namedRangeId: FieldsList<DataSourceParameterField> get() = fieldsList("namedRangeId")
	val range = object : DataSourceParameterFieldGridRange("range") {}
}

abstract class DataSourceParameterFieldGridRange(private val path: String) : FieldsList<DataSourceParameterField>(path) {
	val endColumnIndex: FieldsList<DataSourceParameterField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataSourceParameterField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataSourceParameterField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataSourceParameterField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataSourceParameterField> get() = fieldsList("${path}/startRowIndex")
}

