package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TrimWhitespaceRequestField : Field

object TrimWhitespaceRequestFields {
    val ALL: FieldsList<TrimWhitespaceRequestField> = fieldsList("*")
	val range = object : TrimWhitespaceRequestFieldGridRange("range") {}
}

abstract class TrimWhitespaceRequestFieldGridRange(private val path: String) : FieldsList<TrimWhitespaceRequestField>(path) {
	val endColumnIndex: FieldsList<TrimWhitespaceRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<TrimWhitespaceRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<TrimWhitespaceRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<TrimWhitespaceRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<TrimWhitespaceRequestField> get() = fieldsList("${path}/startRowIndex")
}

