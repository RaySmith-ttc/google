package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MoveDimensionRequestField : Field

object MoveDimensionRequestFields {
    val ALL: FieldsList<MoveDimensionRequestField> = fieldsList("*")
	val destinationIndex: FieldsList<MoveDimensionRequestField> get() = fieldsList("destinationIndex")
	val source = object : MoveDimensionRequestFieldDimensionRange("source") {}
}

abstract class MoveDimensionRequestFieldDimensionRange(private val path: String) : FieldsList<MoveDimensionRequestField>(path) {
	val dimension: FieldsList<MoveDimensionRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<MoveDimensionRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<MoveDimensionRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<MoveDimensionRequestField> get() = fieldsList("${path}/startIndex")
}

