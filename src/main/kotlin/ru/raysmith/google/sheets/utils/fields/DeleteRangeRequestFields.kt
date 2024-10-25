package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteRangeRequestField : Field

object DeleteRangeRequestFields {
    val ALL: FieldsList<DeleteRangeRequestField> = fieldsList("*")
	val range = object : DeleteRangeRequestFieldGridRange("range") {}
	val shiftDimension: FieldsList<DeleteRangeRequestField> get() = fieldsList("shiftDimension")
}

abstract class DeleteRangeRequestFieldGridRange(private val path: String) : FieldsList<DeleteRangeRequestField>(path) {
	val endColumnIndex: FieldsList<DeleteRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DeleteRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DeleteRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DeleteRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DeleteRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

