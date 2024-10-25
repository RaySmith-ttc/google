package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchGetValuesResponseField : Field

object BatchGetValuesResponseFields {
    val ALL: FieldsList<BatchGetValuesResponseField> = fieldsList("*")
	val spreadsheetId: FieldsList<BatchGetValuesResponseField> get() = fieldsList("spreadsheetId")
	val valueRanges = object : BatchGetValuesResponseFieldValueRange("valueRanges") {}
}

abstract class BatchGetValuesResponseFieldValueRange(private val path: String) : FieldsList<BatchGetValuesResponseField>(path) {
	val majorDimension: FieldsList<BatchGetValuesResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<BatchGetValuesResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<BatchGetValuesResponseField> get() = fieldsList("${path}/values")
}

