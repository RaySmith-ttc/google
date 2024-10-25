package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateSpreadsheetPropertiesRequestField : Field

object UpdateSpreadsheetPropertiesRequestFields {
    val ALL: FieldsList<UpdateSpreadsheetPropertiesRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("fields")
	val properties = object : UpdateSpreadsheetPropertiesRequestFieldSpreadsheetProperties("properties") {}
}

abstract class UpdateSpreadsheetPropertiesRequestFieldSpreadsheetProperties(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val autoRecalc: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/autoRecalc")
	val defaultFormat by lazy { object : UpdateSpreadsheetPropertiesRequestFieldCellFormat("${path}/defaultFormat") {} }
	val importFunctionsExternalUrlAccessAllowed: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings by lazy { object : UpdateSpreadsheetPropertiesRequestFieldIterativeCalculationSettings("${path}/iterativeCalculationSettings") {} }
	val locale: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/locale")
	val spreadsheetTheme by lazy { object : UpdateSpreadsheetPropertiesRequestFieldSpreadsheetTheme("${path}/spreadsheetTheme") {} }
	val timeZone: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/timeZone")
	val title: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/title")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldCellFormat(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val backgroundColor by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : UpdateSpreadsheetPropertiesRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : UpdateSpreadsheetPropertiesRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : UpdateSpreadsheetPropertiesRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : UpdateSpreadsheetPropertiesRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : UpdateSpreadsheetPropertiesRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldIterativeCalculationSettings(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val convergenceThreshold: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/maxIterations")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldSpreadsheetTheme(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val primaryFontFamily: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : UpdateSpreadsheetPropertiesRequestFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class UpdateSpreadsheetPropertiesRequestFieldColor(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val alpha: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldColorStyle(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val rgbColor by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldBorders(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val bottom by lazy { object : UpdateSpreadsheetPropertiesRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : UpdateSpreadsheetPropertiesRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : UpdateSpreadsheetPropertiesRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : UpdateSpreadsheetPropertiesRequestFieldBorder("${path}/top") {} }
}

abstract class UpdateSpreadsheetPropertiesRequestFieldNumberFormat(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val pattern: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldPadding(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val bottom: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/top")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldTextFormat(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val bold: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateSpreadsheetPropertiesRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/underline")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldTextRotation(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val angle: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/vertical")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldThemeColorPair(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val color by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/colorType")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldBorder(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val color by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateSpreadsheetPropertiesRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/width")
}

abstract class UpdateSpreadsheetPropertiesRequestFieldLink(private val path: String) : FieldsList<UpdateSpreadsheetPropertiesRequestField>(path) {
	val uri: FieldsList<UpdateSpreadsheetPropertiesRequestField> get() = fieldsList("${path}/uri")
}

