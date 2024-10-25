package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BaselineValueFormatField : Field

object BaselineValueFormatFields {
    val ALL: FieldsList<BaselineValueFormatField> = fieldsList("*")
	val comparisonType: FieldsList<BaselineValueFormatField> get() = fieldsList("comparisonType")
	val description: FieldsList<BaselineValueFormatField> get() = fieldsList("description")
	val negativeColor = object : BaselineValueFormatFieldColor("negativeColor") {}
	val negativeColorStyle = object : BaselineValueFormatFieldColorStyle("negativeColorStyle") {}
	val position = object : BaselineValueFormatFieldTextPosition("position") {}
	val positiveColor = object : BaselineValueFormatFieldColor("positiveColor") {}
	val positiveColorStyle = object : BaselineValueFormatFieldColorStyle("positiveColorStyle") {}
	val textFormat = object : BaselineValueFormatFieldTextFormat("textFormat") {}
}

abstract class BaselineValueFormatFieldColor(private val path: String) : FieldsList<BaselineValueFormatField>(path) {
	val alpha: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/green")
	val red: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/red")
}

abstract class BaselineValueFormatFieldColorStyle(private val path: String) : FieldsList<BaselineValueFormatField>(path) {
	val rgbColor by lazy { object : BaselineValueFormatFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/themeColor")
}

abstract class BaselineValueFormatFieldTextPosition(private val path: String) : FieldsList<BaselineValueFormatField>(path) {
	val horizontalAlignment: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class BaselineValueFormatFieldTextFormat(private val path: String) : FieldsList<BaselineValueFormatField>(path) {
	val bold: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BaselineValueFormatFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BaselineValueFormatFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BaselineValueFormatFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/underline")
}

abstract class BaselineValueFormatFieldLink(private val path: String) : FieldsList<BaselineValueFormatField>(path) {
	val uri: FieldsList<BaselineValueFormatField> get() = fieldsList("${path}/uri")
}

