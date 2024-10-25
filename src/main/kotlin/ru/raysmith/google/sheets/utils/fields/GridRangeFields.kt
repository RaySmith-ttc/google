package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GridRangeField : Field

object GridRangeFields {
    val ALL: FieldsList<GridRangeField> = fieldsList("*")
	val endColumnIndex: FieldsList<GridRangeField> get() = fieldsList("endColumnIndex")
	val endRowIndex: FieldsList<GridRangeField> get() = fieldsList("endRowIndex")
	val sheetId: FieldsList<GridRangeField> get() = fieldsList("sheetId")
	val startColumnIndex: FieldsList<GridRangeField> get() = fieldsList("startColumnIndex")
	val startRowIndex: FieldsList<GridRangeField> get() = fieldsList("startRowIndex")
}

