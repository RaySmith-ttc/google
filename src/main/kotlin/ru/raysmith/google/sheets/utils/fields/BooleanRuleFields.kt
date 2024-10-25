package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BooleanRuleField : Field

object BooleanRuleFields {
    val ALL: FieldsList<BooleanRuleField> = fieldsList("*")
	val condition = object : BooleanRuleFieldBooleanCondition("condition") {}
	val format = object : BooleanRuleFieldCellFormat("format") {}
}

abstract class BooleanRuleFieldBooleanCondition(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val type: FieldsList<BooleanRuleField> get() = fieldsList("${path}/type")
	val values by lazy { object : BooleanRuleFieldConditionValue("${path}/values") {} }
}

abstract class BooleanRuleFieldCellFormat(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val backgroundColor by lazy { object : BooleanRuleFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BooleanRuleFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : BooleanRuleFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<BooleanRuleField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<BooleanRuleField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : BooleanRuleFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : BooleanRuleFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<BooleanRuleField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : BooleanRuleFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : BooleanRuleFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<BooleanRuleField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<BooleanRuleField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class BooleanRuleFieldConditionValue(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val relativeDate: FieldsList<BooleanRuleField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<BooleanRuleField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class BooleanRuleFieldColor(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val alpha: FieldsList<BooleanRuleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BooleanRuleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BooleanRuleField> get() = fieldsList("${path}/green")
	val red: FieldsList<BooleanRuleField> get() = fieldsList("${path}/red")
}

abstract class BooleanRuleFieldColorStyle(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val rgbColor by lazy { object : BooleanRuleFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BooleanRuleField> get() = fieldsList("${path}/themeColor")
}

abstract class BooleanRuleFieldBorders(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val bottom by lazy { object : BooleanRuleFieldBorder("${path}/bottom") {} }
	val left by lazy { object : BooleanRuleFieldBorder("${path}/left") {} }
	val right by lazy { object : BooleanRuleFieldBorder("${path}/right") {} }
	val top by lazy { object : BooleanRuleFieldBorder("${path}/top") {} }
}

abstract class BooleanRuleFieldNumberFormat(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val pattern: FieldsList<BooleanRuleField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<BooleanRuleField> get() = fieldsList("${path}/type")
}

abstract class BooleanRuleFieldPadding(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val bottom: FieldsList<BooleanRuleField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<BooleanRuleField> get() = fieldsList("${path}/left")
	val right: FieldsList<BooleanRuleField> get() = fieldsList("${path}/right")
	val top: FieldsList<BooleanRuleField> get() = fieldsList("${path}/top")
}

abstract class BooleanRuleFieldTextFormat(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val bold: FieldsList<BooleanRuleField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BooleanRuleField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BooleanRuleField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BooleanRuleFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BooleanRuleFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BooleanRuleField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BooleanRuleFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BooleanRuleField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BooleanRuleField> get() = fieldsList("${path}/underline")
}

abstract class BooleanRuleFieldTextRotation(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val angle: FieldsList<BooleanRuleField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<BooleanRuleField> get() = fieldsList("${path}/vertical")
}

abstract class BooleanRuleFieldBorder(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val color by lazy { object : BooleanRuleFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BooleanRuleFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<BooleanRuleField> get() = fieldsList("${path}/style")
	val width: FieldsList<BooleanRuleField> get() = fieldsList("${path}/width")
}

abstract class BooleanRuleFieldLink(private val path: String) : FieldsList<BooleanRuleField>(path) {
	val uri: FieldsList<BooleanRuleField> get() = fieldsList("${path}/uri")
}

