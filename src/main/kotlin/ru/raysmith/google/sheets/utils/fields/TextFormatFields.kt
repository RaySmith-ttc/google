package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextFormatField : Field

object TextFormatFields {
    val ALL: FieldsList<TextFormatField> = fieldsList("*")
	val bold: FieldsList<TextFormatField> get() = fieldsList("bold")
	val fontFamily: FieldsList<TextFormatField> get() = fieldsList("fontFamily")
	val fontSize: FieldsList<TextFormatField> get() = fieldsList("fontSize")
	val foregroundColor = object : TextFormatFieldColor("foregroundColor") {}
	val foregroundColorStyle = object : TextFormatFieldColorStyle("foregroundColorStyle") {}
	val italic: FieldsList<TextFormatField> get() = fieldsList("italic")
	val link = object : TextFormatFieldLink("link") {}
	val strikethrough: FieldsList<TextFormatField> get() = fieldsList("strikethrough")
	val underline: FieldsList<TextFormatField> get() = fieldsList("underline")
}

abstract class TextFormatFieldColor(private val path: String) : FieldsList<TextFormatField>(path) {
	val alpha: FieldsList<TextFormatField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<TextFormatField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TextFormatField> get() = fieldsList("${path}/green")
	val red: FieldsList<TextFormatField> get() = fieldsList("${path}/red")
}

abstract class TextFormatFieldColorStyle(private val path: String) : FieldsList<TextFormatField>(path) {
	val rgbColor by lazy { object : TextFormatFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<TextFormatField> get() = fieldsList("${path}/themeColor")
}

abstract class TextFormatFieldLink(private val path: String) : FieldsList<TextFormatField>(path) {
	val uri: FieldsList<TextFormatField> get() = fieldsList("${path}/uri")
}

