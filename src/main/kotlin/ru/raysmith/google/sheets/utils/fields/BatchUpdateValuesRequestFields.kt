package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateValuesRequestField : Field

object BatchUpdateValuesRequestFields {
    val ALL: FieldsList<BatchUpdateValuesRequestField> = fieldsList("*")
	val data = object : BatchUpdateValuesRequestFieldValueRange("data") {}
	val includeValuesInResponse: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("includeValuesInResponse")
	val responseDateTimeRenderOption: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("responseDateTimeRenderOption")
	val responseValueRenderOption: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("responseValueRenderOption")
	val valueInputOption: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("valueInputOption")
}

abstract class BatchUpdateValuesRequestFieldValueRange(private val path: String) : FieldsList<BatchUpdateValuesRequestField>(path) {
	val majorDimension: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("${path}/range")
	val values: FieldsList<BatchUpdateValuesRequestField> get() = fieldsList("${path}/values")
}

