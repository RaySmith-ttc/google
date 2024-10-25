package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertRangeRequestField : Field

object InsertRangeRequestFields {
    val ALL: FieldsList<InsertRangeRequestField> = fieldsList("*")
	val range = object : InsertRangeRequestFieldGridRange("range") {}
	val shiftDimension: FieldsList<InsertRangeRequestField> get() = fieldsList("shiftDimension")
}

abstract class InsertRangeRequestFieldGridRange(private val path: String) : FieldsList<InsertRangeRequestField>(path) {
	val endColumnIndex: FieldsList<InsertRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<InsertRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<InsertRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<InsertRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<InsertRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

