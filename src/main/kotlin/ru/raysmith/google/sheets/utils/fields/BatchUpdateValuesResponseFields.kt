package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateValuesResponseField : Field

object BatchUpdateValuesResponseFields {
    val ALL: FieldsList<BatchUpdateValuesResponseField> = fieldsList("*")
	val responses = object : BatchUpdateValuesResponseFieldUpdateValuesResponse("responses") {}
	val spreadsheetId: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("spreadsheetId")
	val totalUpdatedCells: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("totalUpdatedCells")
	val totalUpdatedColumns: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("totalUpdatedColumns")
	val totalUpdatedRows: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("totalUpdatedRows")
	val totalUpdatedSheets: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("totalUpdatedSheets")
}

abstract class BatchUpdateValuesResponseFieldUpdateValuesResponse(private val path: String) : FieldsList<BatchUpdateValuesResponseField>(path) {
	val spreadsheetId: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/spreadsheetId")
	val updatedCells: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/updatedCells")
	val updatedColumns: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/updatedColumns")
	val updatedData by lazy { object : BatchUpdateValuesResponseFieldValueRange("${path}/updatedData") {} }
	val updatedRange: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/updatedRange")
	val updatedRows: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/updatedRows")
}

abstract class BatchUpdateValuesResponseFieldValueRange(private val path: String) : FieldsList<BatchUpdateValuesResponseField>(path) {
	val majorDimension: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<BatchUpdateValuesResponseField> get() = fieldsList("${path}/values")
}

