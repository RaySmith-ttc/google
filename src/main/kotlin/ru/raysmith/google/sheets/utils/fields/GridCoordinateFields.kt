package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GridCoordinateField : Field

object GridCoordinateFields {
    val ALL: FieldsList<GridCoordinateField> = fieldsList("*")
	val columnIndex: FieldsList<GridCoordinateField> get() = fieldsList("columnIndex")
	val rowIndex: FieldsList<GridCoordinateField> get() = fieldsList("rowIndex")
	val sheetId: FieldsList<GridCoordinateField> get() = fieldsList("sheetId")
}

