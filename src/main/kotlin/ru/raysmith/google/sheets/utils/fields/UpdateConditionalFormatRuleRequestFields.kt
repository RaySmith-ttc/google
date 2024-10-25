package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateConditionalFormatRuleRequestField : Field

object UpdateConditionalFormatRuleRequestFields {
    val ALL: FieldsList<UpdateConditionalFormatRuleRequestField> = fieldsList("*")
	val index: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("index")
	val newIndex: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("newIndex")
	val rule = object : UpdateConditionalFormatRuleRequestFieldConditionalFormatRule("rule") {}
	val sheetId: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("sheetId")
}

abstract class UpdateConditionalFormatRuleRequestFieldConditionalFormatRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val booleanRule by lazy { object : UpdateConditionalFormatRuleRequestFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : UpdateConditionalFormatRuleRequestFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : UpdateConditionalFormatRuleRequestFieldGridRange("${path}/ranges") {} }
}

abstract class UpdateConditionalFormatRuleRequestFieldBooleanRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val condition by lazy { object : UpdateConditionalFormatRuleRequestFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : UpdateConditionalFormatRuleRequestFieldCellFormat("${path}/format") {} }
}

abstract class UpdateConditionalFormatRuleRequestFieldGradientRule(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val maxpoint by lazy { object : UpdateConditionalFormatRuleRequestFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : UpdateConditionalFormatRuleRequestFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : UpdateConditionalFormatRuleRequestFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class UpdateConditionalFormatRuleRequestFieldGridRange(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateConditionalFormatRuleRequestFieldBooleanCondition(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val type: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateConditionalFormatRuleRequestFieldConditionValue("${path}/values") {} }
}

abstract class UpdateConditionalFormatRuleRequestFieldCellFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val backgroundColor by lazy { object : UpdateConditionalFormatRuleRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateConditionalFormatRuleRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : UpdateConditionalFormatRuleRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : UpdateConditionalFormatRuleRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : UpdateConditionalFormatRuleRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : UpdateConditionalFormatRuleRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : UpdateConditionalFormatRuleRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class UpdateConditionalFormatRuleRequestFieldInterpolationPoint(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val color by lazy { object : UpdateConditionalFormatRuleRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateConditionalFormatRuleRequestFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
	val value: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/value")
}

abstract class UpdateConditionalFormatRuleRequestFieldConditionValue(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val relativeDate: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class UpdateConditionalFormatRuleRequestFieldColor(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val alpha: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateConditionalFormatRuleRequestFieldColorStyle(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val rgbColor by lazy { object : UpdateConditionalFormatRuleRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateConditionalFormatRuleRequestFieldBorders(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val bottom by lazy { object : UpdateConditionalFormatRuleRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : UpdateConditionalFormatRuleRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : UpdateConditionalFormatRuleRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : UpdateConditionalFormatRuleRequestFieldBorder("${path}/top") {} }
}

abstract class UpdateConditionalFormatRuleRequestFieldNumberFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val pattern: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateConditionalFormatRuleRequestFieldPadding(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val bottom: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/top")
}

abstract class UpdateConditionalFormatRuleRequestFieldTextFormat(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val bold: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateConditionalFormatRuleRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateConditionalFormatRuleRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateConditionalFormatRuleRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/underline")
}

abstract class UpdateConditionalFormatRuleRequestFieldTextRotation(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val angle: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/vertical")
}

abstract class UpdateConditionalFormatRuleRequestFieldBorder(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val color by lazy { object : UpdateConditionalFormatRuleRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateConditionalFormatRuleRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/width")
}

abstract class UpdateConditionalFormatRuleRequestFieldLink(private val path: String) : FieldsList<UpdateConditionalFormatRuleRequestField>(path) {
	val uri: FieldsList<UpdateConditionalFormatRuleRequestField> get() = fieldsList("${path}/uri")
}

