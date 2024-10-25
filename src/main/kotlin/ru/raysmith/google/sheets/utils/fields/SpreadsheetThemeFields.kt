package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SpreadsheetThemeField : Field

object SpreadsheetThemeFields {
    val ALL: FieldsList<SpreadsheetThemeField> = fieldsList("*")
	val primaryFontFamily: FieldsList<SpreadsheetThemeField> get() = fieldsList("primaryFontFamily")
	val themeColors = object : SpreadsheetThemeFieldThemeColorPair("themeColors") {}
}

abstract class SpreadsheetThemeFieldThemeColorPair(private val path: String) : FieldsList<SpreadsheetThemeField>(path) {
	val color by lazy { object : SpreadsheetThemeFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/colorType")
}

abstract class SpreadsheetThemeFieldColorStyle(private val path: String) : FieldsList<SpreadsheetThemeField>(path) {
	val rgbColor by lazy { object : SpreadsheetThemeFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/themeColor")
}

abstract class SpreadsheetThemeFieldColor(private val path: String) : FieldsList<SpreadsheetThemeField>(path) {
	val alpha: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/green")
	val red: FieldsList<SpreadsheetThemeField> get() = fieldsList("${path}/red")
}

