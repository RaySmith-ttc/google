package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WaterfallChartSeriesField : Field

object WaterfallChartSeriesFields {
    val ALL: FieldsList<WaterfallChartSeriesField> = fieldsList("*")
	val customSubtotals = object : WaterfallChartSeriesFieldWaterfallChartCustomSubtotal("customSubtotals") {}
	val data = object : WaterfallChartSeriesFieldChartData("data") {}
	val dataLabel = object : WaterfallChartSeriesFieldDataLabel("dataLabel") {}
	val hideTrailingSubtotal: FieldsList<WaterfallChartSeriesField> get() = fieldsList("hideTrailingSubtotal")
	val negativeColumnsStyle = object : WaterfallChartSeriesFieldWaterfallChartColumnStyle("negativeColumnsStyle") {}
	val positiveColumnsStyle = object : WaterfallChartSeriesFieldWaterfallChartColumnStyle("positiveColumnsStyle") {}
	val subtotalColumnsStyle = object : WaterfallChartSeriesFieldWaterfallChartColumnStyle("subtotalColumnsStyle") {}
}

abstract class WaterfallChartSeriesFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val dataIsSubtotal: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class WaterfallChartSeriesFieldChartData(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val aggregateType: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : WaterfallChartSeriesFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : WaterfallChartSeriesFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : WaterfallChartSeriesFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class WaterfallChartSeriesFieldDataLabel(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val customLabelData by lazy { object : WaterfallChartSeriesFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : WaterfallChartSeriesFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/type")
}

abstract class WaterfallChartSeriesFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val color by lazy { object : WaterfallChartSeriesFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : WaterfallChartSeriesFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/label")
}

abstract class WaterfallChartSeriesFieldDataSourceColumnReference(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val name: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/name")
}

abstract class WaterfallChartSeriesFieldChartGroupRule(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val dateTimeRule by lazy { object : WaterfallChartSeriesFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : WaterfallChartSeriesFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class WaterfallChartSeriesFieldChartSourceRange(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val sources by lazy { object : WaterfallChartSeriesFieldGridRange("${path}/sources") {} }
}

abstract class WaterfallChartSeriesFieldTextFormat(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val bold: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : WaterfallChartSeriesFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : WaterfallChartSeriesFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : WaterfallChartSeriesFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/underline")
}

abstract class WaterfallChartSeriesFieldColor(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val alpha: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/green")
	val red: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/red")
}

abstract class WaterfallChartSeriesFieldColorStyle(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val rgbColor by lazy { object : WaterfallChartSeriesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/themeColor")
}

abstract class WaterfallChartSeriesFieldChartDateTimeRule(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val type: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/type")
}

abstract class WaterfallChartSeriesFieldChartHistogramRule(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val intervalSize: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/minValue")
}

abstract class WaterfallChartSeriesFieldGridRange(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val endColumnIndex: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/startRowIndex")
}

abstract class WaterfallChartSeriesFieldLink(private val path: String) : FieldsList<WaterfallChartSeriesField>(path) {
	val uri: FieldsList<WaterfallChartSeriesField> get() = fieldsList("${path}/uri")
}

