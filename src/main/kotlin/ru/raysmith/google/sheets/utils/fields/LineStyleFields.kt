package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LineStyleField : Field

object LineStyleFields {
    val ALL: FieldsList<LineStyleField> = fieldsList("*")
	val type: FieldsList<LineStyleField> get() = fieldsList("type")
	val width: FieldsList<LineStyleField> get() = fieldsList("width")
}

