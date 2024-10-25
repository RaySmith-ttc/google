package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextFormatRunField : Field

object TextFormatRunFields {
    val ALL: FieldsList<TextFormatRunField> = fieldsList("*")
	val format = object : TextFormatRunFieldTextFormat("format") {}
	val startIndex: FieldsList<TextFormatRunField> get() = fieldsList("startIndex")
}

abstract class TextFormatRunFieldTextFormat(private val path: String) : FieldsList<TextFormatRunField>(path) {
	val bold: FieldsList<TextFormatRunField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<TextFormatRunField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<TextFormatRunField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : TextFormatRunFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : TextFormatRunFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<TextFormatRunField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TextFormatRunFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<TextFormatRunField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TextFormatRunField> get() = fieldsList("${path}/underline")
}

abstract class TextFormatRunFieldColor(private val path: String) : FieldsList<TextFormatRunField>(path) {
	val alpha: FieldsList<TextFormatRunField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<TextFormatRunField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TextFormatRunField> get() = fieldsList("${path}/green")
	val red: FieldsList<TextFormatRunField> get() = fieldsList("${path}/red")
}

abstract class TextFormatRunFieldColorStyle(private val path: String) : FieldsList<TextFormatRunField>(path) {
	val rgbColor by lazy { object : TextFormatRunFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<TextFormatRunField> get() = fieldsList("${path}/themeColor")
}

abstract class TextFormatRunFieldLink(private val path: String) : FieldsList<TextFormatRunField>(path) {
	val uri: FieldsList<TextFormatRunField> get() = fieldsList("${path}/uri")
}

