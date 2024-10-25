package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextRotationField : Field

object TextRotationFields {
    val ALL: FieldsList<TextRotationField> = fieldsList("*")
	val angle: FieldsList<TextRotationField> get() = fieldsList("angle")
	val vertical: FieldsList<TextRotationField> get() = fieldsList("vertical")
}

