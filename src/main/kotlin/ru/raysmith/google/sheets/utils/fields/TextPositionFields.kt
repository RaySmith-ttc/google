package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextPositionField : Field

object TextPositionFields {
    val ALL: FieldsList<TextPositionField> = fieldsList("*")
	val horizontalAlignment: FieldsList<TextPositionField> get() = fieldsList("horizontalAlignment")
}

