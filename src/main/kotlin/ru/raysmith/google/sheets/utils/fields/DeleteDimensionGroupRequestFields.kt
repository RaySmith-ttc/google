package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDimensionGroupRequestField : Field

object DeleteDimensionGroupRequestFields {
    val ALL: FieldsList<DeleteDimensionGroupRequestField> = fieldsList("*")
	val range = object : DeleteDimensionGroupRequestFieldDimensionRange("range") {}
}

abstract class DeleteDimensionGroupRequestFieldDimensionRange(private val path: String) : FieldsList<DeleteDimensionGroupRequestField>(path) {
	val dimension: FieldsList<DeleteDimensionGroupRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDimensionGroupRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDimensionGroupRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDimensionGroupRequestField> get() = fieldsList("${path}/startIndex")
}

