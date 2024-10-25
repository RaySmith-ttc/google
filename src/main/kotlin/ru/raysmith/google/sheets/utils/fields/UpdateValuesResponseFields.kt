package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateValuesResponseField : Field

object UpdateValuesResponseFields {
    val ALL: FieldsList<UpdateValuesResponseField> = fieldsList("*")
	val spreadsheetId: FieldsList<UpdateValuesResponseField> get() = fieldsList("spreadsheetId")
	val updatedCells: FieldsList<UpdateValuesResponseField> get() = fieldsList("updatedCells")
	val updatedColumns: FieldsList<UpdateValuesResponseField> get() = fieldsList("updatedColumns")
	val updatedData = object : UpdateValuesResponseFieldValueRange("updatedData") {}
	val updatedRange: FieldsList<UpdateValuesResponseField> get() = fieldsList("updatedRange")
	val updatedRows: FieldsList<UpdateValuesResponseField> get() = fieldsList("updatedRows")
}

abstract class UpdateValuesResponseFieldValueRange(private val path: String) : FieldsList<UpdateValuesResponseField>(path) {
	val majorDimension: FieldsList<UpdateValuesResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<UpdateValuesResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<UpdateValuesResponseField> get() = fieldsList("${path}/values")
}

