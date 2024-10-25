package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BubbleChartSpecField : Field

object BubbleChartSpecFields {
    val ALL: FieldsList<BubbleChartSpecField> = fieldsList("*")
	val bubbleBorderColor = object : BubbleChartSpecFieldColor("bubbleBorderColor") {}
	val bubbleBorderColorStyle = object : BubbleChartSpecFieldColorStyle("bubbleBorderColorStyle") {}
	val bubbleLabels = object : BubbleChartSpecFieldChartData("bubbleLabels") {}
	val bubbleMaxRadiusSize: FieldsList<BubbleChartSpecField> get() = fieldsList("bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<BubbleChartSpecField> get() = fieldsList("bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<BubbleChartSpecField> get() = fieldsList("bubbleOpacity")
	val bubbleSizes = object : BubbleChartSpecFieldChartData("bubbleSizes") {}
	val bubbleTextStyle = object : BubbleChartSpecFieldTextFormat("bubbleTextStyle") {}
	val domain = object : BubbleChartSpecFieldChartData("domain") {}
	val groupIds = object : BubbleChartSpecFieldChartData("groupIds") {}
	val legendPosition: FieldsList<BubbleChartSpecField> get() = fieldsList("legendPosition")
	val series = object : BubbleChartSpecFieldChartData("series") {}
}

abstract class BubbleChartSpecFieldColor(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val alpha: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/red")
}

abstract class BubbleChartSpecFieldColorStyle(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val rgbColor by lazy { object : BubbleChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class BubbleChartSpecFieldChartData(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val aggregateType: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BubbleChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BubbleChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BubbleChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BubbleChartSpecFieldTextFormat(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val bold: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BubbleChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BubbleChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BubbleChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class BubbleChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val name: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/name")
}

abstract class BubbleChartSpecFieldChartGroupRule(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val dateTimeRule by lazy { object : BubbleChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BubbleChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BubbleChartSpecFieldChartSourceRange(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val sources by lazy { object : BubbleChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class BubbleChartSpecFieldLink(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val uri: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/uri")
}

abstract class BubbleChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val type: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/type")
}

abstract class BubbleChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val intervalSize: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class BubbleChartSpecFieldGridRange(private val path: String) : FieldsList<BubbleChartSpecField>(path) {
	val endColumnIndex: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BubbleChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

