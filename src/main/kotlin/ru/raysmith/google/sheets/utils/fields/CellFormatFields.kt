package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CellFormatField : Field

object CellFormatFields {
    val ALL: FieldsList<CellFormatField> = fieldsList("*")
	val backgroundColor = object : CellFormatFieldColor("backgroundColor") {}
	val backgroundColorStyle = object : CellFormatFieldColorStyle("backgroundColorStyle") {}
	val borders = object : CellFormatFieldBorders("borders") {}
	val horizontalAlignment: FieldsList<CellFormatField> get() = fieldsList("horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<CellFormatField> get() = fieldsList("hyperlinkDisplayType")
	val numberFormat = object : CellFormatFieldNumberFormat("numberFormat") {}
	val padding = object : CellFormatFieldPadding("padding") {}
	val textDirection: FieldsList<CellFormatField> get() = fieldsList("textDirection")
	val textFormat = object : CellFormatFieldTextFormat("textFormat") {}
	val textRotation = object : CellFormatFieldTextRotation("textRotation") {}
	val verticalAlignment: FieldsList<CellFormatField> get() = fieldsList("verticalAlignment")
	val wrapStrategy: FieldsList<CellFormatField> get() = fieldsList("wrapStrategy")
}

abstract class CellFormatFieldColor(private val path: String) : FieldsList<CellFormatField>(path) {
	val alpha: FieldsList<CellFormatField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<CellFormatField> get() = fieldsList("${path}/blue")
	val green: FieldsList<CellFormatField> get() = fieldsList("${path}/green")
	val red: FieldsList<CellFormatField> get() = fieldsList("${path}/red")
}

abstract class CellFormatFieldColorStyle(private val path: String) : FieldsList<CellFormatField>(path) {
	val rgbColor by lazy { object : CellFormatFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<CellFormatField> get() = fieldsList("${path}/themeColor")
}

abstract class CellFormatFieldBorders(private val path: String) : FieldsList<CellFormatField>(path) {
	val bottom by lazy { object : CellFormatFieldBorder("${path}/bottom") {} }
	val left by lazy { object : CellFormatFieldBorder("${path}/left") {} }
	val right by lazy { object : CellFormatFieldBorder("${path}/right") {} }
	val top by lazy { object : CellFormatFieldBorder("${path}/top") {} }
}

abstract class CellFormatFieldNumberFormat(private val path: String) : FieldsList<CellFormatField>(path) {
	val pattern: FieldsList<CellFormatField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<CellFormatField> get() = fieldsList("${path}/type")
}

abstract class CellFormatFieldPadding(private val path: String) : FieldsList<CellFormatField>(path) {
	val bottom: FieldsList<CellFormatField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<CellFormatField> get() = fieldsList("${path}/left")
	val right: FieldsList<CellFormatField> get() = fieldsList("${path}/right")
	val top: FieldsList<CellFormatField> get() = fieldsList("${path}/top")
}

abstract class CellFormatFieldTextFormat(private val path: String) : FieldsList<CellFormatField>(path) {
	val bold: FieldsList<CellFormatField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<CellFormatField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<CellFormatField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : CellFormatFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : CellFormatFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<CellFormatField> get() = fieldsList("${path}/italic")
	val link by lazy { object : CellFormatFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<CellFormatField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<CellFormatField> get() = fieldsList("${path}/underline")
}

abstract class CellFormatFieldTextRotation(private val path: String) : FieldsList<CellFormatField>(path) {
	val angle: FieldsList<CellFormatField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<CellFormatField> get() = fieldsList("${path}/vertical")
}

abstract class CellFormatFieldBorder(private val path: String) : FieldsList<CellFormatField>(path) {
	val color by lazy { object : CellFormatFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : CellFormatFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<CellFormatField> get() = fieldsList("${path}/style")
	val width: FieldsList<CellFormatField> get() = fieldsList("${path}/width")
}

abstract class CellFormatFieldLink(private val path: String) : FieldsList<CellFormatField>(path) {
	val uri: FieldsList<CellFormatField> get() = fieldsList("${path}/uri")
}

