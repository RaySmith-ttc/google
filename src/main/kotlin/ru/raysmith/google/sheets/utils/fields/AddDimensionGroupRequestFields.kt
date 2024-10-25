package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddDimensionGroupRequestField : Field

object AddDimensionGroupRequestFields {
    val ALL: FieldsList<AddDimensionGroupRequestField> = fieldsList("*")
	val range = object : AddDimensionGroupRequestFieldDimensionRange("range") {}
}

abstract class AddDimensionGroupRequestFieldDimensionRange(private val path: String) : FieldsList<AddDimensionGroupRequestField>(path) {
	val dimension: FieldsList<AddDimensionGroupRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<AddDimensionGroupRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<AddDimensionGroupRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<AddDimensionGroupRequestField> get() = fieldsList("${path}/startIndex")
}

