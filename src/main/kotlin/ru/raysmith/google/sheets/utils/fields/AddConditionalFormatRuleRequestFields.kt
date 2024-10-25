package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddConditionalFormatRuleRequestField : Field

object AddConditionalFormatRuleRequestFields {
    val ALL: FieldsList<AddConditionalFormatRuleRequestField> = fieldsList("*")
	val index: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("index")
	val rule = object : AddConditionalFormatRuleRequestFieldConditionalFormatRule("rule") {}
}

abstract class AddConditionalFormatRuleRequestFieldConditionalFormatRule(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val booleanRule by lazy { object : AddConditionalFormatRuleRequestFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : AddConditionalFormatRuleRequestFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : AddConditionalFormatRuleRequestFieldGridRange("${path}/ranges") {} }
}

abstract class AddConditionalFormatRuleRequestFieldBooleanRule(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val condition by lazy { object : AddConditionalFormatRuleRequestFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : AddConditionalFormatRuleRequestFieldCellFormat("${path}/format") {} }
}

abstract class AddConditionalFormatRuleRequestFieldGradientRule(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val maxpoint by lazy { object : AddConditionalFormatRuleRequestFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : AddConditionalFormatRuleRequestFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : AddConditionalFormatRuleRequestFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class AddConditionalFormatRuleRequestFieldGridRange(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val endColumnIndex: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddConditionalFormatRuleRequestFieldBooleanCondition(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val type: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddConditionalFormatRuleRequestFieldConditionValue("${path}/values") {} }
}

abstract class AddConditionalFormatRuleRequestFieldCellFormat(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val backgroundColor by lazy { object : AddConditionalFormatRuleRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddConditionalFormatRuleRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : AddConditionalFormatRuleRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : AddConditionalFormatRuleRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : AddConditionalFormatRuleRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : AddConditionalFormatRuleRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : AddConditionalFormatRuleRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class AddConditionalFormatRuleRequestFieldInterpolationPoint(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val color by lazy { object : AddConditionalFormatRuleRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddConditionalFormatRuleRequestFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
	val value: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/value")
}

abstract class AddConditionalFormatRuleRequestFieldConditionValue(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val relativeDate: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class AddConditionalFormatRuleRequestFieldColor(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val alpha: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/red")
}

abstract class AddConditionalFormatRuleRequestFieldColorStyle(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val rgbColor by lazy { object : AddConditionalFormatRuleRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AddConditionalFormatRuleRequestFieldBorders(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val bottom by lazy { object : AddConditionalFormatRuleRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : AddConditionalFormatRuleRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : AddConditionalFormatRuleRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : AddConditionalFormatRuleRequestFieldBorder("${path}/top") {} }
}

abstract class AddConditionalFormatRuleRequestFieldNumberFormat(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val pattern: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/type")
}

abstract class AddConditionalFormatRuleRequestFieldPadding(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val bottom: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/top")
}

abstract class AddConditionalFormatRuleRequestFieldTextFormat(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val bold: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AddConditionalFormatRuleRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddConditionalFormatRuleRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AddConditionalFormatRuleRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/underline")
}

abstract class AddConditionalFormatRuleRequestFieldTextRotation(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val angle: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/vertical")
}

abstract class AddConditionalFormatRuleRequestFieldBorder(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val color by lazy { object : AddConditionalFormatRuleRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddConditionalFormatRuleRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/width")
}

abstract class AddConditionalFormatRuleRequestFieldLink(private val path: String) : FieldsList<AddConditionalFormatRuleRequestField>(path) {
	val uri: FieldsList<AddConditionalFormatRuleRequestField> get() = fieldsList("${path}/uri")
}

