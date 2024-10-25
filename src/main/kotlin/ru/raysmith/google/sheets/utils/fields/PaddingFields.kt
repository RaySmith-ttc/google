package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PaddingField : Field

object PaddingFields {
    val ALL: FieldsList<PaddingField> = fieldsList("*")
	val bottom: FieldsList<PaddingField> get() = fieldsList("bottom")
	val left: FieldsList<PaddingField> get() = fieldsList("left")
	val right: FieldsList<PaddingField> get() = fieldsList("right")
	val top: FieldsList<PaddingField> get() = fieldsList("top")
}

