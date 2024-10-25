package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertDimensionRequestField : Field

object InsertDimensionRequestFields {
    val ALL: FieldsList<InsertDimensionRequestField> = fieldsList("*")
	val inheritFromBefore: FieldsList<InsertDimensionRequestField> get() = fieldsList("inheritFromBefore")
	val range = object : InsertDimensionRequestFieldDimensionRange("range") {}
}

abstract class InsertDimensionRequestFieldDimensionRange(private val path: String) : FieldsList<InsertDimensionRequestField>(path) {
	val dimension: FieldsList<InsertDimensionRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<InsertDimensionRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<InsertDimensionRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<InsertDimensionRequestField> get() = fieldsList("${path}/startIndex")
}

