package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ColorField : Field

object ColorFields {
    val ALL: FieldsList<ColorField> = fieldsList("*")
	val alpha: FieldsList<ColorField> get() = fieldsList("alpha")
	val blue: FieldsList<ColorField> get() = fieldsList("blue")
	val green: FieldsList<ColorField> get() = fieldsList("green")
	val red: FieldsList<ColorField> get() = fieldsList("red")
}

