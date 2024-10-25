package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SpreadsheetPropertiesField : Field

object SpreadsheetPropertiesFields {
    val ALL: FieldsList<SpreadsheetPropertiesField> = fieldsList("*")
	val autoRecalc: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("autoRecalc")
	val defaultFormat = object : SpreadsheetPropertiesFieldCellFormat("defaultFormat") {}
	val importFunctionsExternalUrlAccessAllowed: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings = object : SpreadsheetPropertiesFieldIterativeCalculationSettings("iterativeCalculationSettings") {}
	val locale: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("locale")
	val spreadsheetTheme = object : SpreadsheetPropertiesFieldSpreadsheetTheme("spreadsheetTheme") {}
	val timeZone: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("timeZone")
	val title: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("title")
}

abstract class SpreadsheetPropertiesFieldCellFormat(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val backgroundColor by lazy { object : SpreadsheetPropertiesFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SpreadsheetPropertiesFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : SpreadsheetPropertiesFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : SpreadsheetPropertiesFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : SpreadsheetPropertiesFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : SpreadsheetPropertiesFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : SpreadsheetPropertiesFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class SpreadsheetPropertiesFieldIterativeCalculationSettings(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val convergenceThreshold: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/maxIterations")
}

abstract class SpreadsheetPropertiesFieldSpreadsheetTheme(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val primaryFontFamily: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : SpreadsheetPropertiesFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class SpreadsheetPropertiesFieldColor(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val alpha: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/red")
}

abstract class SpreadsheetPropertiesFieldColorStyle(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val rgbColor by lazy { object : SpreadsheetPropertiesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/themeColor")
}

abstract class SpreadsheetPropertiesFieldBorders(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val bottom by lazy { object : SpreadsheetPropertiesFieldBorder("${path}/bottom") {} }
	val left by lazy { object : SpreadsheetPropertiesFieldBorder("${path}/left") {} }
	val right by lazy { object : SpreadsheetPropertiesFieldBorder("${path}/right") {} }
	val top by lazy { object : SpreadsheetPropertiesFieldBorder("${path}/top") {} }
}

abstract class SpreadsheetPropertiesFieldNumberFormat(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val pattern: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetPropertiesFieldPadding(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val bottom: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/left")
	val right: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/right")
	val top: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/top")
}

abstract class SpreadsheetPropertiesFieldTextFormat(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val bold: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : SpreadsheetPropertiesFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SpreadsheetPropertiesFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SpreadsheetPropertiesFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/underline")
}

abstract class SpreadsheetPropertiesFieldTextRotation(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val angle: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/vertical")
}

abstract class SpreadsheetPropertiesFieldThemeColorPair(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val color by lazy { object : SpreadsheetPropertiesFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/colorType")
}

abstract class SpreadsheetPropertiesFieldBorder(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val color by lazy { object : SpreadsheetPropertiesFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetPropertiesFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/style")
	val width: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/width")
}

abstract class SpreadsheetPropertiesFieldLink(private val path: String) : FieldsList<SpreadsheetPropertiesField>(path) {
	val uri: FieldsList<SpreadsheetPropertiesField> get() = fieldsList("${path}/uri")
}

