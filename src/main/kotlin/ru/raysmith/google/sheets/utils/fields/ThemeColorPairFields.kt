package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ThemeColorPairField : Field

object ThemeColorPairFields {
    val ALL: FieldsList<ThemeColorPairField> = fieldsList("*")
	val color = object : ThemeColorPairFieldColorStyle("color") {}
	val colorType: FieldsList<ThemeColorPairField> get() = fieldsList("colorType")
}

abstract class ThemeColorPairFieldColorStyle(private val path: String) : FieldsList<ThemeColorPairField>(path) {
	val rgbColor by lazy { object : ThemeColorPairFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<ThemeColorPairField> get() = fieldsList("${path}/themeColor")
}

abstract class ThemeColorPairFieldColor(private val path: String) : FieldsList<ThemeColorPairField>(path) {
	val alpha: FieldsList<ThemeColorPairField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ThemeColorPairField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ThemeColorPairField> get() = fieldsList("${path}/green")
	val red: FieldsList<ThemeColorPairField> get() = fieldsList("${path}/red")
}

