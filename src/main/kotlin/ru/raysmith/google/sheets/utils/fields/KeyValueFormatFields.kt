package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface KeyValueFormatField : Field

object KeyValueFormatFields {
    val ALL: FieldsList<KeyValueFormatField> = fieldsList("*")
	val position = object : KeyValueFormatFieldTextPosition("position") {}
	val textFormat = object : KeyValueFormatFieldTextFormat("textFormat") {}
}

abstract class KeyValueFormatFieldTextPosition(private val path: String) : FieldsList<KeyValueFormatField>(path) {
	val horizontalAlignment: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class KeyValueFormatFieldTextFormat(private val path: String) : FieldsList<KeyValueFormatField>(path) {
	val bold: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : KeyValueFormatFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : KeyValueFormatFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/italic")
	val link by lazy { object : KeyValueFormatFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/underline")
}

abstract class KeyValueFormatFieldColor(private val path: String) : FieldsList<KeyValueFormatField>(path) {
	val alpha: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/blue")
	val green: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/green")
	val red: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/red")
}

abstract class KeyValueFormatFieldColorStyle(private val path: String) : FieldsList<KeyValueFormatField>(path) {
	val rgbColor by lazy { object : KeyValueFormatFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/themeColor")
}

abstract class KeyValueFormatFieldLink(private val path: String) : FieldsList<KeyValueFormatField>(path) {
	val uri: FieldsList<KeyValueFormatField> get() = fieldsList("${path}/uri")
}

