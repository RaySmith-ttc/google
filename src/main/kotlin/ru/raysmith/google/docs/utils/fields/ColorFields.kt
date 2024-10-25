package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ColorField : Field

object ColorFields {
    val ALL: FieldsList<ColorField> = fieldsList("*")
	val rgbColor = object : ColorFieldRgbColor("rgbColor") {}
}

abstract class ColorFieldRgbColor(private val path: String) : FieldsList<ColorField>(path) {
	val blue: FieldsList<ColorField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ColorField> get() = fieldsList("${path}/green")
	val red: FieldsList<ColorField> get() = fieldsList("${path}/red")
}

