package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CopyPasteRequestField : Field

object CopyPasteRequestFields {
    val ALL: FieldsList<CopyPasteRequestField> = fieldsList("*")
	val destination = object : CopyPasteRequestFieldGridRange("destination") {}
	val pasteOrientation: FieldsList<CopyPasteRequestField> get() = fieldsList("pasteOrientation")
	val pasteType: FieldsList<CopyPasteRequestField> get() = fieldsList("pasteType")
	val source = object : CopyPasteRequestFieldGridRange("source") {}
}

abstract class CopyPasteRequestFieldGridRange(private val path: String) : FieldsList<CopyPasteRequestField>(path) {
	val endColumnIndex: FieldsList<CopyPasteRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CopyPasteRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CopyPasteRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CopyPasteRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CopyPasteRequestField> get() = fieldsList("${path}/startRowIndex")
}

