package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppendDimensionRequestField : Field

object AppendDimensionRequestFields {
    val ALL: FieldsList<AppendDimensionRequestField> = fieldsList("*")
	val dimension: FieldsList<AppendDimensionRequestField> get() = fieldsList("dimension")
	val length: FieldsList<AppendDimensionRequestField> get() = fieldsList("length")
	val sheetId: FieldsList<AppendDimensionRequestField> get() = fieldsList("sheetId")
}

