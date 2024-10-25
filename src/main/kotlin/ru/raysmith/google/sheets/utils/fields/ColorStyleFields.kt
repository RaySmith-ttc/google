package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ColorStyleField : Field

object ColorStyleFields {
    val ALL: FieldsList<ColorStyleField> = fieldsList("*")
	val rgbColor = object : ColorStyleFieldColor("rgbColor") {}
	val themeColor: FieldsList<ColorStyleField> get() = fieldsList("themeColor")
}

abstract class ColorStyleFieldColor(private val path: String) : FieldsList<ColorStyleField>(path) {
	val alpha: FieldsList<ColorStyleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ColorStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ColorStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<ColorStyleField> get() = fieldsList("${path}/red")
}

