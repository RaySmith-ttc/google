package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedChartField : Field

object EmbeddedChartFields {
    val ALL: FieldsList<EmbeddedChartField> = fieldsList("*")
	val border = object : EmbeddedChartFieldEmbeddedObjectBorder("border") {}
	val chartId: FieldsList<EmbeddedChartField> get() = fieldsList("chartId")
	val position = object : EmbeddedChartFieldEmbeddedObjectPosition("position") {}
	val spec = object : EmbeddedChartFieldChartSpec("spec") {}
}

abstract class EmbeddedChartFieldEmbeddedObjectBorder(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val color by lazy { object : EmbeddedChartFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/colorStyle") {} }
}

abstract class EmbeddedChartFieldEmbeddedObjectPosition(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val newSheet: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : EmbeddedChartFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/sheetId")
}

abstract class EmbeddedChartFieldChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val altText: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : EmbeddedChartFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : EmbeddedChartFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : EmbeddedChartFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : EmbeddedChartFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : EmbeddedChartFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : EmbeddedChartFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : EmbeddedChartFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : EmbeddedChartFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : EmbeddedChartFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : EmbeddedChartFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : EmbeddedChartFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : EmbeddedChartFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : EmbeddedChartFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : EmbeddedChartFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : EmbeddedChartFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class EmbeddedChartFieldColor(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val alpha: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/blue")
	val green: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/green")
	val red: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/red")
}

abstract class EmbeddedChartFieldColorStyle(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val rgbColor by lazy { object : EmbeddedChartFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/themeColor")
}

abstract class EmbeddedChartFieldOverlayPosition(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val anchorCell by lazy { object : EmbeddedChartFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/widthPixels")
}

abstract class EmbeddedChartFieldBasicChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val axis by lazy { object : EmbeddedChartFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : EmbeddedChartFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : EmbeddedChartFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : EmbeddedChartFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class EmbeddedChartFieldBubbleChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val bubbleBorderColor by lazy { object : EmbeddedChartFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : EmbeddedChartFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : EmbeddedChartFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : EmbeddedChartFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : EmbeddedChartFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : EmbeddedChartFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : EmbeddedChartFieldChartData("${path}/series") {} }
}

abstract class EmbeddedChartFieldCandlestickChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val data by lazy { object : EmbeddedChartFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : EmbeddedChartFieldCandlestickDomain("${path}/domain") {} }
}

abstract class EmbeddedChartFieldDataSourceChartProperties(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val dataExecutionStatus by lazy { object : EmbeddedChartFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/dataSourceId")
}

abstract class EmbeddedChartFieldFilterSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val columnIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : EmbeddedChartFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : EmbeddedChartFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class EmbeddedChartFieldHistogramChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val bucketSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : EmbeddedChartFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/showItemDividers")
}

abstract class EmbeddedChartFieldOrgChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val labels by lazy { object : EmbeddedChartFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : EmbeddedChartFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : EmbeddedChartFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : EmbeddedChartFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : EmbeddedChartFieldChartData("${path}/tooltips") {} }
}

abstract class EmbeddedChartFieldPieChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val domain by lazy { object : EmbeddedChartFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : EmbeddedChartFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/threeDimensional")
}

abstract class EmbeddedChartFieldScorecardChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val aggregateType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : EmbeddedChartFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : EmbeddedChartFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : EmbeddedChartFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : EmbeddedChartFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : EmbeddedChartFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/scaleFactor")
}

abstract class EmbeddedChartFieldSortSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val backgroundColor by lazy { object : EmbeddedChartFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : EmbeddedChartFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : EmbeddedChartFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/sortOrder")
}

abstract class EmbeddedChartFieldTextFormat(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val bold: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : EmbeddedChartFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/italic")
	val link by lazy { object : EmbeddedChartFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/underline")
}

abstract class EmbeddedChartFieldTextPosition(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val horizontalAlignment: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class EmbeddedChartFieldTreemapChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val colorData by lazy { object : EmbeddedChartFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : EmbeddedChartFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : EmbeddedChartFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : EmbeddedChartFieldChartData("${path}/labels") {} }
	val levels: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : EmbeddedChartFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : EmbeddedChartFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/textFormat") {} }
}

abstract class EmbeddedChartFieldWaterfallChartSpec(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val connectorLineStyle by lazy { object : EmbeddedChartFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : EmbeddedChartFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : EmbeddedChartFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : EmbeddedChartFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class EmbeddedChartFieldGridCoordinate(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val columnIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/sheetId")
}

abstract class EmbeddedChartFieldBasicChartAxis(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val format by lazy { object : EmbeddedChartFieldTextFormat("${path}/format") {} }
	val position: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/position")
	val title: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : EmbeddedChartFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : EmbeddedChartFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class EmbeddedChartFieldBasicChartDomain(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val domain by lazy { object : EmbeddedChartFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/reversed")
}

abstract class EmbeddedChartFieldBasicChartSeries(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val color by lazy { object : EmbeddedChartFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : EmbeddedChartFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : EmbeddedChartFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : EmbeddedChartFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : EmbeddedChartFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : EmbeddedChartFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/type")
}

abstract class EmbeddedChartFieldDataLabel(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val customLabelData by lazy { object : EmbeddedChartFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/type")
}

abstract class EmbeddedChartFieldChartData(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val aggregateType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : EmbeddedChartFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : EmbeddedChartFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : EmbeddedChartFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class EmbeddedChartFieldCandlestickData(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val closeSeries by lazy { object : EmbeddedChartFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : EmbeddedChartFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : EmbeddedChartFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : EmbeddedChartFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class EmbeddedChartFieldCandlestickDomain(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val data by lazy { object : EmbeddedChartFieldChartData("${path}/data") {} }
	val reversed: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/reversed")
}

abstract class EmbeddedChartFieldDataExecutionStatus(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val errorCode: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/state")
}

abstract class EmbeddedChartFieldDataSourceColumnReference(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val name: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/name")
}

abstract class EmbeddedChartFieldFilterCriteria(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val condition by lazy { object : EmbeddedChartFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : EmbeddedChartFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : EmbeddedChartFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class EmbeddedChartFieldHistogramSeries(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val barColor by lazy { object : EmbeddedChartFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : EmbeddedChartFieldChartData("${path}/data") {} }
}

abstract class EmbeddedChartFieldBaselineValueFormat(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val comparisonType: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : EmbeddedChartFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : EmbeddedChartFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : EmbeddedChartFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/textFormat") {} }
}

abstract class EmbeddedChartFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val prefix: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/suffix")
}

abstract class EmbeddedChartFieldKeyValueFormat(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val position by lazy { object : EmbeddedChartFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : EmbeddedChartFieldTextFormat("${path}/textFormat") {} }
}

abstract class EmbeddedChartFieldLink(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val uri: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/uri")
}

abstract class EmbeddedChartFieldTreemapChartColorScale(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val maxValueColor by lazy { object : EmbeddedChartFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : EmbeddedChartFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : EmbeddedChartFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : EmbeddedChartFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class EmbeddedChartFieldLineStyle(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val type: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/type")
	val width: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/width")
}

abstract class EmbeddedChartFieldWaterfallChartDomain(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val data by lazy { object : EmbeddedChartFieldChartData("${path}/data") {} }
	val reversed: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/reversed")
}

abstract class EmbeddedChartFieldWaterfallChartSeries(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val customSubtotals by lazy { object : EmbeddedChartFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : EmbeddedChartFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : EmbeddedChartFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : EmbeddedChartFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : EmbeddedChartFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : EmbeddedChartFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class EmbeddedChartFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val viewWindowMax: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class EmbeddedChartFieldPointStyle(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val shape: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/shape")
	val size: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/size")
}

abstract class EmbeddedChartFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val color by lazy { object : EmbeddedChartFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : EmbeddedChartFieldPointStyle("${path}/pointStyle") {} }
}

abstract class EmbeddedChartFieldChartGroupRule(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val dateTimeRule by lazy { object : EmbeddedChartFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : EmbeddedChartFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class EmbeddedChartFieldChartSourceRange(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val sources by lazy { object : EmbeddedChartFieldGridRange("${path}/sources") {} }
}

abstract class EmbeddedChartFieldCandlestickSeries(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val data by lazy { object : EmbeddedChartFieldChartData("${path}/data") {} }
}

abstract class EmbeddedChartFieldBooleanCondition(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val type: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/type")
	val values by lazy { object : EmbeddedChartFieldConditionValue("${path}/values") {} }
}

abstract class EmbeddedChartFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val dataIsSubtotal: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class EmbeddedChartFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val color by lazy { object : EmbeddedChartFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : EmbeddedChartFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/label")
}

abstract class EmbeddedChartFieldChartDateTimeRule(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val type: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/type")
}

abstract class EmbeddedChartFieldChartHistogramRule(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val intervalSize: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/minValue")
}

abstract class EmbeddedChartFieldGridRange(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val endColumnIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/startRowIndex")
}

abstract class EmbeddedChartFieldConditionValue(private val path: String) : FieldsList<EmbeddedChartField>(path) {
	val relativeDate: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<EmbeddedChartField> get() = fieldsList("${path}/userEnteredValue")
}

