package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BorderField : Field

object BorderFields {
    val ALL: FieldsList<BorderField> = fieldsList("*")
	val color = object : BorderFieldColor("color") {}
	val colorStyle = object : BorderFieldColorStyle("colorStyle") {}
	val style: FieldsList<BorderField> get() = fieldsList("style")
	val width: FieldsList<BorderField> get() = fieldsList("width")
}

abstract class BorderFieldColor(private val path: String) : FieldsList<BorderField>(path) {
	val alpha: FieldsList<BorderField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BorderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BorderField> get() = fieldsList("${path}/green")
	val red: FieldsList<BorderField> get() = fieldsList("${path}/red")
}

abstract class BorderFieldColorStyle(private val path: String) : FieldsList<BorderField>(path) {
	val rgbColor by lazy { object : BorderFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BorderField> get() = fieldsList("${path}/themeColor")
}

