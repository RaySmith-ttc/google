package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ScorecardChartSpecField : Field

object ScorecardChartSpecFields {
    val ALL: FieldsList<ScorecardChartSpecField> = fieldsList("*")
	val aggregateType: FieldsList<ScorecardChartSpecField> get() = fieldsList("aggregateType")
	val baselineValueData = object : ScorecardChartSpecFieldChartData("baselineValueData") {}
	val baselineValueFormat = object : ScorecardChartSpecFieldBaselineValueFormat("baselineValueFormat") {}
	val customFormatOptions = object : ScorecardChartSpecFieldChartCustomNumberFormatOptions("customFormatOptions") {}
	val keyValueData = object : ScorecardChartSpecFieldChartData("keyValueData") {}
	val keyValueFormat = object : ScorecardChartSpecFieldKeyValueFormat("keyValueFormat") {}
	val numberFormatSource: FieldsList<ScorecardChartSpecField> get() = fieldsList("numberFormatSource")
	val scaleFactor: FieldsList<ScorecardChartSpecField> get() = fieldsList("scaleFactor")
}

abstract class ScorecardChartSpecFieldChartData(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val aggregateType: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : ScorecardChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : ScorecardChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : ScorecardChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class ScorecardChartSpecFieldBaselineValueFormat(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val comparisonType: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : ScorecardChartSpecFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : ScorecardChartSpecFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : ScorecardChartSpecFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : ScorecardChartSpecFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : ScorecardChartSpecFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : ScorecardChartSpecFieldTextFormat("${path}/textFormat") {} }
}

abstract class ScorecardChartSpecFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val prefix: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/suffix")
}

abstract class ScorecardChartSpecFieldKeyValueFormat(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val position by lazy { object : ScorecardChartSpecFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : ScorecardChartSpecFieldTextFormat("${path}/textFormat") {} }
}

abstract class ScorecardChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val name: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/name")
}

abstract class ScorecardChartSpecFieldChartGroupRule(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val dateTimeRule by lazy { object : ScorecardChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : ScorecardChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class ScorecardChartSpecFieldChartSourceRange(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val sources by lazy { object : ScorecardChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class ScorecardChartSpecFieldColor(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val alpha: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/red")
}

abstract class ScorecardChartSpecFieldColorStyle(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val rgbColor by lazy { object : ScorecardChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class ScorecardChartSpecFieldTextPosition(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val horizontalAlignment: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class ScorecardChartSpecFieldTextFormat(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val bold: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : ScorecardChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ScorecardChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ScorecardChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class ScorecardChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val type: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/type")
}

abstract class ScorecardChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val intervalSize: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class ScorecardChartSpecFieldGridRange(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val endColumnIndex: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

abstract class ScorecardChartSpecFieldLink(private val path: String) : FieldsList<ScorecardChartSpecField>(path) {
	val uri: FieldsList<ScorecardChartSpecField> get() = fieldsList("${path}/uri")
}

