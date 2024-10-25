package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MergeCellsRequestField : Field

object MergeCellsRequestFields {
    val ALL: FieldsList<MergeCellsRequestField> = fieldsList("*")
	val mergeType: FieldsList<MergeCellsRequestField> get() = fieldsList("mergeType")
	val range = object : MergeCellsRequestFieldGridRange("range") {}
}

abstract class MergeCellsRequestFieldGridRange(private val path: String) : FieldsList<MergeCellsRequestField>(path) {
	val endColumnIndex: FieldsList<MergeCellsRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<MergeCellsRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<MergeCellsRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<MergeCellsRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<MergeCellsRequestField> get() = fieldsList("${path}/startRowIndex")
}

