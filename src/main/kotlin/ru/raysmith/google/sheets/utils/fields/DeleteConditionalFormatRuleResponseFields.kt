package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteConditionalFormatRuleResponseField : Field

object DeleteConditionalFormatRuleResponseFields {
    val ALL: FieldsList<DeleteConditionalFormatRuleResponseField> = fieldsList("*")
	val rule = object : DeleteConditionalFormatRuleResponseFieldConditionalFormatRule("rule") {}
}

abstract class DeleteConditionalFormatRuleResponseFieldConditionalFormatRule(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val booleanRule by lazy { object : DeleteConditionalFormatRuleResponseFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : DeleteConditionalFormatRuleResponseFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : DeleteConditionalFormatRuleResponseFieldGridRange("${path}/ranges") {} }
}

abstract class DeleteConditionalFormatRuleResponseFieldBooleanRule(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val condition by lazy { object : DeleteConditionalFormatRuleResponseFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : DeleteConditionalFormatRuleResponseFieldCellFormat("${path}/format") {} }
}

abstract class DeleteConditionalFormatRuleResponseFieldGradientRule(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val maxpoint by lazy { object : DeleteConditionalFormatRuleResponseFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : DeleteConditionalFormatRuleResponseFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : DeleteConditionalFormatRuleResponseFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class DeleteConditionalFormatRuleResponseFieldGridRange(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val endColumnIndex: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class DeleteConditionalFormatRuleResponseFieldBooleanCondition(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val type: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : DeleteConditionalFormatRuleResponseFieldConditionValue("${path}/values") {} }
}

abstract class DeleteConditionalFormatRuleResponseFieldCellFormat(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val backgroundColor by lazy { object : DeleteConditionalFormatRuleResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : DeleteConditionalFormatRuleResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : DeleteConditionalFormatRuleResponseFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : DeleteConditionalFormatRuleResponseFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : DeleteConditionalFormatRuleResponseFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : DeleteConditionalFormatRuleResponseFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : DeleteConditionalFormatRuleResponseFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class DeleteConditionalFormatRuleResponseFieldInterpolationPoint(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val color by lazy { object : DeleteConditionalFormatRuleResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : DeleteConditionalFormatRuleResponseFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
	val value: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/value")
}

abstract class DeleteConditionalFormatRuleResponseFieldConditionValue(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val relativeDate: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class DeleteConditionalFormatRuleResponseFieldColor(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val alpha: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/red")
}

abstract class DeleteConditionalFormatRuleResponseFieldColorStyle(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val rgbColor by lazy { object : DeleteConditionalFormatRuleResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class DeleteConditionalFormatRuleResponseFieldBorders(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val bottom by lazy { object : DeleteConditionalFormatRuleResponseFieldBorder("${path}/bottom") {} }
	val left by lazy { object : DeleteConditionalFormatRuleResponseFieldBorder("${path}/left") {} }
	val right by lazy { object : DeleteConditionalFormatRuleResponseFieldBorder("${path}/right") {} }
	val top by lazy { object : DeleteConditionalFormatRuleResponseFieldBorder("${path}/top") {} }
}

abstract class DeleteConditionalFormatRuleResponseFieldNumberFormat(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val pattern: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
}

abstract class DeleteConditionalFormatRuleResponseFieldPadding(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val bottom: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/left")
	val right: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/right")
	val top: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/top")
}

abstract class DeleteConditionalFormatRuleResponseFieldTextFormat(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val bold: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : DeleteConditionalFormatRuleResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : DeleteConditionalFormatRuleResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : DeleteConditionalFormatRuleResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/underline")
}

abstract class DeleteConditionalFormatRuleResponseFieldTextRotation(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val angle: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/vertical")
}

abstract class DeleteConditionalFormatRuleResponseFieldBorder(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val color by lazy { object : DeleteConditionalFormatRuleResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : DeleteConditionalFormatRuleResponseFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/style")
	val width: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/width")
}

abstract class DeleteConditionalFormatRuleResponseFieldLink(private val path: String) : FieldsList<DeleteConditionalFormatRuleResponseField>(path) {
	val uri: FieldsList<DeleteConditionalFormatRuleResponseField> get() = fieldsList("${path}/uri")
}

