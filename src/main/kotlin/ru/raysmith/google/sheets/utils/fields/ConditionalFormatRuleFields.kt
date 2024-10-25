package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ConditionalFormatRuleField : Field

object ConditionalFormatRuleFields {
    val ALL: FieldsList<ConditionalFormatRuleField> = fieldsList("*")
	val booleanRule = object : ConditionalFormatRuleFieldBooleanRule("booleanRule") {}
	val gradientRule = object : ConditionalFormatRuleFieldGradientRule("gradientRule") {}
	val ranges = object : ConditionalFormatRuleFieldGridRange("ranges") {}
}

abstract class ConditionalFormatRuleFieldBooleanRule(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val condition by lazy { object : ConditionalFormatRuleFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : ConditionalFormatRuleFieldCellFormat("${path}/format") {} }
}

abstract class ConditionalFormatRuleFieldGradientRule(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val maxpoint by lazy { object : ConditionalFormatRuleFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : ConditionalFormatRuleFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : ConditionalFormatRuleFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class ConditionalFormatRuleFieldGridRange(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val endColumnIndex: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/startRowIndex")
}

abstract class ConditionalFormatRuleFieldBooleanCondition(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val type: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/type")
	val values by lazy { object : ConditionalFormatRuleFieldConditionValue("${path}/values") {} }
}

abstract class ConditionalFormatRuleFieldCellFormat(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val backgroundColor by lazy { object : ConditionalFormatRuleFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ConditionalFormatRuleFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : ConditionalFormatRuleFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : ConditionalFormatRuleFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : ConditionalFormatRuleFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : ConditionalFormatRuleFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : ConditionalFormatRuleFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class ConditionalFormatRuleFieldInterpolationPoint(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val color by lazy { object : ConditionalFormatRuleFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ConditionalFormatRuleFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/type")
	val value: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/value")
}

abstract class ConditionalFormatRuleFieldConditionValue(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val relativeDate: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class ConditionalFormatRuleFieldColor(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val alpha: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/green")
	val red: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/red")
}

abstract class ConditionalFormatRuleFieldColorStyle(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val rgbColor by lazy { object : ConditionalFormatRuleFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/themeColor")
}

abstract class ConditionalFormatRuleFieldBorders(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val bottom by lazy { object : ConditionalFormatRuleFieldBorder("${path}/bottom") {} }
	val left by lazy { object : ConditionalFormatRuleFieldBorder("${path}/left") {} }
	val right by lazy { object : ConditionalFormatRuleFieldBorder("${path}/right") {} }
	val top by lazy { object : ConditionalFormatRuleFieldBorder("${path}/top") {} }
}

abstract class ConditionalFormatRuleFieldNumberFormat(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val pattern: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/type")
}

abstract class ConditionalFormatRuleFieldPadding(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val bottom: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/left")
	val right: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/right")
	val top: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/top")
}

abstract class ConditionalFormatRuleFieldTextFormat(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val bold: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : ConditionalFormatRuleFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ConditionalFormatRuleFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ConditionalFormatRuleFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/underline")
}

abstract class ConditionalFormatRuleFieldTextRotation(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val angle: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/vertical")
}

abstract class ConditionalFormatRuleFieldBorder(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val color by lazy { object : ConditionalFormatRuleFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ConditionalFormatRuleFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/style")
	val width: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/width")
}

abstract class ConditionalFormatRuleFieldLink(private val path: String) : FieldsList<ConditionalFormatRuleField>(path) {
	val uri: FieldsList<ConditionalFormatRuleField> get() = fieldsList("${path}/uri")
}

