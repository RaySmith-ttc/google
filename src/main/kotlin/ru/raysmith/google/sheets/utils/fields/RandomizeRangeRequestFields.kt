package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RandomizeRangeRequestField : Field

object RandomizeRangeRequestFields {
    val ALL: FieldsList<RandomizeRangeRequestField> = fieldsList("*")
	val range = object : RandomizeRangeRequestFieldGridRange("range") {}
}

abstract class RandomizeRangeRequestFieldGridRange(private val path: String) : FieldsList<RandomizeRangeRequestField>(path) {
	val endColumnIndex: FieldsList<RandomizeRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<RandomizeRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<RandomizeRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<RandomizeRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<RandomizeRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

