package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateConditionalFormatRuleResponseField : Field

object UpdateConditionalFormatRuleResponseFields {
    val ALL: FieldsList<UpdateConditionalFormatRuleResponseField> = fieldsList("*")
	val newIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("newIndex")
	val newRule = object : UpdateConditionalFormatRuleResponseFieldConditionalFormatRule("newRule") {}
	val oldIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("oldIndex")
	val oldRule = object : UpdateConditionalFormatRuleResponseFieldConditionalFormatRule("oldRule") {}
}

abstract class UpdateConditionalFormatRuleResponseFieldConditionalFormatRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val booleanRule by lazy { object : UpdateConditionalFormatRuleResponseFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : UpdateConditionalFormatRuleResponseFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : UpdateConditionalFormatRuleResponseFieldGridRange("${path}/ranges") {} }
}

abstract class UpdateConditionalFormatRuleResponseFieldBooleanRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val condition by lazy { object : UpdateConditionalFormatRuleResponseFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : UpdateConditionalFormatRuleResponseFieldCellFormat("${path}/format") {} }
}

abstract class UpdateConditionalFormatRuleResponseFieldGradientRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val maxpoint by lazy { object : UpdateConditionalFormatRuleResponseFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : UpdateConditionalFormatRuleResponseFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : UpdateConditionalFormatRuleResponseFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class UpdateConditionalFormatRuleResponseFieldGridRange(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val endColumnIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateConditionalFormatRuleResponseFieldBooleanCondition(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val type: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateConditionalFormatRuleResponseFieldConditionValue("${path}/values") {} }
}

abstract class UpdateConditionalFormatRuleResponseFieldCellFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val backgroundColor by lazy { object : UpdateConditionalFormatRuleResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateConditionalFormatRuleResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : UpdateConditionalFormatRuleResponseFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : UpdateConditionalFormatRuleResponseFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : UpdateConditionalFormatRuleResponseFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : UpdateConditionalFormatRuleResponseFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : UpdateConditionalFormatRuleResponseFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class UpdateConditionalFormatRuleResponseFieldInterpolationPoint(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val color by lazy { object : UpdateConditionalFormatRuleResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateConditionalFormatRuleResponseFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
	val value: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/value")
}

abstract class UpdateConditionalFormatRuleResponseFieldConditionValue(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val relativeDate: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class UpdateConditionalFormatRuleResponseFieldColor(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val alpha: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/red")
}

abstract class UpdateConditionalFormatRuleResponseFieldColorStyle(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val rgbColor by lazy { object : UpdateConditionalFormatRuleResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateConditionalFormatRuleResponseFieldBorders(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val bottom by lazy { object : UpdateConditionalFormatRuleResponseFieldBorder("${path}/bottom") {} }
	val left by lazy { object : UpdateConditionalFormatRuleResponseFieldBorder("${path}/left") {} }
	val right by lazy { object : UpdateConditionalFormatRuleResponseFieldBorder("${path}/right") {} }
	val top by lazy { object : UpdateConditionalFormatRuleResponseFieldBorder("${path}/top") {} }
}

abstract class UpdateConditionalFormatRuleResponseFieldNumberFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val pattern: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/type")
}

abstract class UpdateConditionalFormatRuleResponseFieldPadding(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val bottom: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/left")
	val right: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/right")
	val top: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/top")
}

abstract class UpdateConditionalFormatRuleResponseFieldTextFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val bold: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateConditionalFormatRuleResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateConditionalFormatRuleResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateConditionalFormatRuleResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/underline")
}

abstract class UpdateConditionalFormatRuleResponseFieldTextRotation(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val angle: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/vertical")
}

abstract class UpdateConditionalFormatRuleResponseFieldBorder(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val color by lazy { object : UpdateConditionalFormatRuleResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateConditionalFormatRuleResponseFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/style")
	val width: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/width")
}

abstract class UpdateConditionalFormatRuleResponseFieldLink(private val path: String) : FieldsList<UpdateConditionalFormatRuleResponseField>(path) {
	val uri: FieldsList<UpdateConditionalFormatRuleResponseField> get() = fieldsList("${path}/uri")
}

