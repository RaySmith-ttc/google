package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BordersField : Field

object BordersFields {
    val ALL: FieldsList<BordersField> = fieldsList("*")
	val bottom = object : BordersFieldBorder("bottom") {}
	val left = object : BordersFieldBorder("left") {}
	val right = object : BordersFieldBorder("right") {}
	val top = object : BordersFieldBorder("top") {}
}

abstract class BordersFieldBorder(private val path: String) : FieldsList<BordersField>(path) {
	val color by lazy { object : BordersFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BordersFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<BordersField> get() = fieldsList("${path}/style")
	val width: FieldsList<BordersField> get() = fieldsList("${path}/width")
}

abstract class BordersFieldColor(private val path: String) : FieldsList<BordersField>(path) {
	val alpha: FieldsList<BordersField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BordersField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BordersField> get() = fieldsList("${path}/green")
	val red: FieldsList<BordersField> get() = fieldsList("${path}/red")
}

abstract class BordersFieldColorStyle(private val path: String) : FieldsList<BordersField>(path) {
	val rgbColor by lazy { object : BordersFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BordersField> get() = fieldsList("${path}/themeColor")
}

