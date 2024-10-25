package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SourceAndDestinationField : Field

object SourceAndDestinationFields {
    val ALL: FieldsList<SourceAndDestinationField> = fieldsList("*")
	val dimension: FieldsList<SourceAndDestinationField> get() = fieldsList("dimension")
	val fillLength: FieldsList<SourceAndDestinationField> get() = fieldsList("fillLength")
	val source = object : SourceAndDestinationFieldGridRange("source") {}
}

abstract class SourceAndDestinationFieldGridRange(private val path: String) : FieldsList<SourceAndDestinationField>(path) {
	val endColumnIndex: FieldsList<SourceAndDestinationField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SourceAndDestinationField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SourceAndDestinationField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SourceAndDestinationField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SourceAndDestinationField> get() = fieldsList("${path}/startRowIndex")
}

