package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextToColumnsRequestField : Field

object TextToColumnsRequestFields {
    val ALL: FieldsList<TextToColumnsRequestField> = fieldsList("*")
	val delimiter: FieldsList<TextToColumnsRequestField> get() = fieldsList("delimiter")
	val delimiterType: FieldsList<TextToColumnsRequestField> get() = fieldsList("delimiterType")
	val source = object : TextToColumnsRequestFieldGridRange("source") {}
}

abstract class TextToColumnsRequestFieldGridRange(private val path: String) : FieldsList<TextToColumnsRequestField>(path) {
	val endColumnIndex: FieldsList<TextToColumnsRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<TextToColumnsRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<TextToColumnsRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<TextToColumnsRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<TextToColumnsRequestField> get() = fieldsList("${path}/startRowIndex")
}

