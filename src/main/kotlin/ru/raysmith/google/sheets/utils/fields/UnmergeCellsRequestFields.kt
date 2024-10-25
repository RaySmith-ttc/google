package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UnmergeCellsRequestField : Field

object UnmergeCellsRequestFields {
    val ALL: FieldsList<UnmergeCellsRequestField> = fieldsList("*")
	val range = object : UnmergeCellsRequestFieldGridRange("range") {}
}

abstract class UnmergeCellsRequestFieldGridRange(private val path: String) : FieldsList<UnmergeCellsRequestField>(path) {
	val endColumnIndex: FieldsList<UnmergeCellsRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UnmergeCellsRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UnmergeCellsRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UnmergeCellsRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UnmergeCellsRequestField> get() = fieldsList("${path}/startRowIndex")
}

