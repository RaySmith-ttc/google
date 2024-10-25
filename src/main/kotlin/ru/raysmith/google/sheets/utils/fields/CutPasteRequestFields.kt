package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CutPasteRequestField : Field

object CutPasteRequestFields {
    val ALL: FieldsList<CutPasteRequestField> = fieldsList("*")
	val destination = object : CutPasteRequestFieldGridCoordinate("destination") {}
	val pasteType: FieldsList<CutPasteRequestField> get() = fieldsList("pasteType")
	val source = object : CutPasteRequestFieldGridRange("source") {}
}

abstract class CutPasteRequestFieldGridCoordinate(private val path: String) : FieldsList<CutPasteRequestField>(path) {
	val columnIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class CutPasteRequestFieldGridRange(private val path: String) : FieldsList<CutPasteRequestField>(path) {
	val endColumnIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CutPasteRequestField> get() = fieldsList("${path}/startRowIndex")
}

