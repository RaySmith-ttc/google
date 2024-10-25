package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NumberFormatField : Field

object NumberFormatFields {
    val ALL: FieldsList<NumberFormatField> = fieldsList("*")
	val pattern: FieldsList<NumberFormatField> get() = fieldsList("pattern")
	val type: FieldsList<NumberFormatField> get() = fieldsList("type")
}

