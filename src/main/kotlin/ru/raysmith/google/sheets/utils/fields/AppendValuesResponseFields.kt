package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppendValuesResponseField : Field

object AppendValuesResponseFields {
    val ALL: FieldsList<AppendValuesResponseField> = fieldsList("*")
	val spreadsheetId: FieldsList<AppendValuesResponseField> get() = fieldsList("spreadsheetId")
	val tableRange: FieldsList<AppendValuesResponseField> get() = fieldsList("tableRange")
	val updates = object : AppendValuesResponseFieldUpdateValuesResponse("updates") {}
}

abstract class AppendValuesResponseFieldUpdateValuesResponse(private val path: String) : FieldsList<AppendValuesResponseField>(path) {
	val spreadsheetId: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/spreadsheetId")
	val updatedCells: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/updatedCells")
	val updatedColumns: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/updatedColumns")
	val updatedData by lazy { object : AppendValuesResponseFieldValueRange("${path}/updatedData") {} }
	val updatedRange: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/updatedRange")
	val updatedRows: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/updatedRows")
}

abstract class AppendValuesResponseFieldValueRange(private val path: String) : FieldsList<AppendValuesResponseField>(path) {
	val majorDimension: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<AppendValuesResponseField> get() = fieldsList("${path}/values")
}

