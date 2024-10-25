package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ErrorValueField : Field

object ErrorValueFields {
    val ALL: FieldsList<ErrorValueField> = fieldsList("*")
	val message: FieldsList<ErrorValueField> get() = fieldsList("message")
	val type: FieldsList<ErrorValueField> get() = fieldsList("type")
}

