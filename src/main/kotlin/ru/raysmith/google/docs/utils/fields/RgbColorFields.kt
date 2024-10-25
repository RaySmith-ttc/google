package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RgbColorField : Field

object RgbColorFields {
    val ALL: FieldsList<RgbColorField> = fieldsList("*")
	val blue: FieldsList<RgbColorField> get() = fieldsList("blue")
	val green: FieldsList<RgbColorField> get() = fieldsList("green")
	val red: FieldsList<RgbColorField> get() = fieldsList("red")
}

