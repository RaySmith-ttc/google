package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface OverlayPositionField : Field

object OverlayPositionFields {
    val ALL: FieldsList<OverlayPositionField> = fieldsList("*")
	val anchorCell = object : OverlayPositionFieldGridCoordinate("anchorCell") {}
	val heightPixels: FieldsList<OverlayPositionField> get() = fieldsList("heightPixels")
	val offsetXPixels: FieldsList<OverlayPositionField> get() = fieldsList("offsetXPixels")
	val offsetYPixels: FieldsList<OverlayPositionField> get() = fieldsList("offsetYPixels")
	val widthPixels: FieldsList<OverlayPositionField> get() = fieldsList("widthPixels")
}

abstract class OverlayPositionFieldGridCoordinate(private val path: String) : FieldsList<OverlayPositionField>(path) {
	val columnIndex: FieldsList<OverlayPositionField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<OverlayPositionField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<OverlayPositionField> get() = fieldsList("${path}/sheetId")
}

