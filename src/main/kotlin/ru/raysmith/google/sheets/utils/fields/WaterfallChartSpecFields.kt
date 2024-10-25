package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WaterfallChartSpecField : Field

object WaterfallChartSpecFields {
    val ALL: FieldsList<WaterfallChartSpecField> = fieldsList("*")
	val connectorLineStyle = object : WaterfallChartSpecFieldLineStyle("connectorLineStyle") {}
	val domain = object : WaterfallChartSpecFieldWaterfallChartDomain("domain") {}
	val firstValueIsTotal: FieldsList<WaterfallChartSpecField> get() = fieldsList("firstValueIsTotal")
	val hideConnectorLines: FieldsList<WaterfallChartSpecField> get() = fieldsList("hideConnectorLines")
	val series = object : WaterfallChartSpecFieldWaterfallChartSeries("series") {}
	val stackedType: FieldsList<WaterfallChartSpecField> get() = fieldsList("stackedType")
	val totalDataLabel = object : WaterfallChartSpecFieldDataLabel("totalDataLabel") {}
}

abstract class WaterfallChartSpecFieldLineStyle(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val type: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/type")
	val width: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/width")
}

abstract class WaterfallChartSpecFieldWaterfallChartDomain(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val data by lazy { object : WaterfallChartSpecFieldChartData("${path}/data") {} }
	val reversed: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class WaterfallChartSpecFieldWaterfallChartSeries(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val customSubtotals by lazy { object : WaterfallChartSpecFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : WaterfallChartSpecFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : WaterfallChartSpecFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : WaterfallChartSpecFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : WaterfallChartSpecFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : WaterfallChartSpecFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class WaterfallChartSpecFieldDataLabel(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val customLabelData by lazy { object : WaterfallChartSpecFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : WaterfallChartSpecFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/type")
}

abstract class WaterfallChartSpecFieldChartData(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val aggregateType: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : WaterfallChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : WaterfallChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : WaterfallChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class WaterfallChartSpecFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val dataIsSubtotal: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class WaterfallChartSpecFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val color by lazy { object : WaterfallChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : WaterfallChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/label")
}

abstract class WaterfallChartSpecFieldTextFormat(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val bold: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : WaterfallChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : WaterfallChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : WaterfallChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class WaterfallChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val name: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/name")
}

abstract class WaterfallChartSpecFieldChartGroupRule(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val dateTimeRule by lazy { object : WaterfallChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : WaterfallChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class WaterfallChartSpecFieldChartSourceRange(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val sources by lazy { object : WaterfallChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class WaterfallChartSpecFieldColor(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val alpha: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/red")
}

abstract class WaterfallChartSpecFieldColorStyle(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val rgbColor by lazy { object : WaterfallChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class WaterfallChartSpecFieldLink(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val uri: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/uri")
}

abstract class WaterfallChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val type: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/type")
}

abstract class WaterfallChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val intervalSize: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class WaterfallChartSpecFieldGridRange(private val path: String) : FieldsList<WaterfallChartSpecField>(path) {
	val endColumnIndex: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<WaterfallChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

