package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDimensionRequestField : Field

object DeleteDimensionRequestFields {
    val ALL: FieldsList<DeleteDimensionRequestField> = fieldsList("*")
	val range = object : DeleteDimensionRequestFieldDimensionRange("range") {}
}

abstract class DeleteDimensionRequestFieldDimensionRange(private val path: String) : FieldsList<DeleteDimensionRequestField>(path) {
	val dimension: FieldsList<DeleteDimensionRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDimensionRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDimensionRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDimensionRequestField> get() = fieldsList("${path}/startIndex")
}

