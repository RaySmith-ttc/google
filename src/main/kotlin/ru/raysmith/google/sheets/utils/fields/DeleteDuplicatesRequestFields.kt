package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDuplicatesRequestField : Field

object DeleteDuplicatesRequestFields {
    val ALL: FieldsList<DeleteDuplicatesRequestField> = fieldsList("*")
	val comparisonColumns = object : DeleteDuplicatesRequestFieldDimensionRange("comparisonColumns") {}
	val range = object : DeleteDuplicatesRequestFieldGridRange("range") {}
}

abstract class DeleteDuplicatesRequestFieldDimensionRange(private val path: String) : FieldsList<DeleteDuplicatesRequestField>(path) {
	val dimension: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class DeleteDuplicatesRequestFieldGridRange(private val path: String) : FieldsList<DeleteDuplicatesRequestField>(path) {
	val endColumnIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DeleteDuplicatesRequestField> get() = fieldsList("${path}/startRowIndex")
}

