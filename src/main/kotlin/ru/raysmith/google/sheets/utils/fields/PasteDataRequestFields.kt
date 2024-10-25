package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PasteDataRequestField : Field

object PasteDataRequestFields {
    val ALL: FieldsList<PasteDataRequestField> = fieldsList("*")
	val coordinate = object : PasteDataRequestFieldGridCoordinate("coordinate") {}
	val data: FieldsList<PasteDataRequestField> get() = fieldsList("data")
	val delimiter: FieldsList<PasteDataRequestField> get() = fieldsList("delimiter")
	val html: FieldsList<PasteDataRequestField> get() = fieldsList("html")
	val type: FieldsList<PasteDataRequestField> get() = fieldsList("type")
}

abstract class PasteDataRequestFieldGridCoordinate(private val path: String) : FieldsList<PasteDataRequestField>(path) {
	val columnIndex: FieldsList<PasteDataRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<PasteDataRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<PasteDataRequestField> get() = fieldsList("${path}/sheetId")
}

