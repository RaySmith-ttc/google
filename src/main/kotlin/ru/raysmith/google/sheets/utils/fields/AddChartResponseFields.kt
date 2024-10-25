package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddChartResponseField : Field

object AddChartResponseFields {
    val ALL: FieldsList<AddChartResponseField> = fieldsList("*")
	val chart = object : AddChartResponseFieldEmbeddedChart("chart") {}
}

abstract class AddChartResponseFieldEmbeddedChart(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val border by lazy { object : AddChartResponseFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<AddChartResponseField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : AddChartResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : AddChartResponseFieldChartSpec("${path}/spec") {} }
}

abstract class AddChartResponseFieldEmbeddedObjectBorder(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val color by lazy { object : AddChartResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/colorStyle") {} }
}

abstract class AddChartResponseFieldEmbeddedObjectPosition(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val newSheet: FieldsList<AddChartResponseField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : AddChartResponseFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<AddChartResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class AddChartResponseFieldChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val altText: FieldsList<AddChartResponseField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : AddChartResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : AddChartResponseFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : AddChartResponseFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : AddChartResponseFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : AddChartResponseFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : AddChartResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<AddChartResponseField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : AddChartResponseFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<AddChartResponseField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : AddChartResponseFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : AddChartResponseFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : AddChartResponseFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : AddChartResponseFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<AddChartResponseField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : AddChartResponseFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<AddChartResponseField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : AddChartResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : AddChartResponseFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : AddChartResponseFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class AddChartResponseFieldColor(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val alpha: FieldsList<AddChartResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddChartResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddChartResponseField> get() = fieldsList("${path}/red")
}

abstract class AddChartResponseFieldColorStyle(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val rgbColor by lazy { object : AddChartResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddChartResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class AddChartResponseFieldOverlayPosition(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val anchorCell by lazy { object : AddChartResponseFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/widthPixels")
}

abstract class AddChartResponseFieldBasicChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val axis by lazy { object : AddChartResponseFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<AddChartResponseField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : AddChartResponseFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<AddChartResponseField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<AddChartResponseField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<AddChartResponseField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<AddChartResponseField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : AddChartResponseFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<AddChartResponseField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : AddChartResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class AddChartResponseFieldBubbleChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val bubbleBorderColor by lazy { object : AddChartResponseFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : AddChartResponseFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<AddChartResponseField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : AddChartResponseFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : AddChartResponseFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : AddChartResponseFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : AddChartResponseFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<AddChartResponseField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : AddChartResponseFieldChartData("${path}/series") {} }
}

abstract class AddChartResponseFieldCandlestickChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val data by lazy { object : AddChartResponseFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : AddChartResponseFieldCandlestickDomain("${path}/domain") {} }
}

abstract class AddChartResponseFieldDataSourceChartProperties(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val dataExecutionStatus by lazy { object : AddChartResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AddChartResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class AddChartResponseFieldFilterSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val columnIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : AddChartResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AddChartResponseFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AddChartResponseFieldHistogramChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val bucketSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<AddChartResponseField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<AddChartResponseField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : AddChartResponseFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<AddChartResponseField> get() = fieldsList("${path}/showItemDividers")
}

abstract class AddChartResponseFieldOrgChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val labels by lazy { object : AddChartResponseFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : AddChartResponseFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : AddChartResponseFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : AddChartResponseFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : AddChartResponseFieldChartData("${path}/tooltips") {} }
}

abstract class AddChartResponseFieldPieChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val domain by lazy { object : AddChartResponseFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<AddChartResponseField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<AddChartResponseField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : AddChartResponseFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<AddChartResponseField> get() = fieldsList("${path}/threeDimensional")
}

abstract class AddChartResponseFieldScorecardChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val aggregateType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : AddChartResponseFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : AddChartResponseFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : AddChartResponseFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : AddChartResponseFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : AddChartResponseFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<AddChartResponseField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<AddChartResponseField> get() = fieldsList("${path}/scaleFactor")
}

abstract class AddChartResponseFieldSortSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val backgroundColor by lazy { object : AddChartResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : AddChartResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : AddChartResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<AddChartResponseField> get() = fieldsList("${path}/sortOrder")
}

abstract class AddChartResponseFieldTextFormat(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val bold: FieldsList<AddChartResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AddChartResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AddChartResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AddChartResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AddChartResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AddChartResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AddChartResponseField> get() = fieldsList("${path}/underline")
}

abstract class AddChartResponseFieldTextPosition(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val horizontalAlignment: FieldsList<AddChartResponseField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class AddChartResponseFieldTreemapChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val colorData by lazy { object : AddChartResponseFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : AddChartResponseFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : AddChartResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : AddChartResponseFieldChartData("${path}/labels") {} }
	val levels: FieldsList<AddChartResponseField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : AddChartResponseFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : AddChartResponseFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartResponseFieldWaterfallChartSpec(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val connectorLineStyle by lazy { object : AddChartResponseFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : AddChartResponseFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<AddChartResponseField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : AddChartResponseFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : AddChartResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class AddChartResponseFieldGridCoordinate(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val columnIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<AddChartResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class AddChartResponseFieldBasicChartAxis(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val format by lazy { object : AddChartResponseFieldTextFormat("${path}/format") {} }
	val position: FieldsList<AddChartResponseField> get() = fieldsList("${path}/position")
	val title: FieldsList<AddChartResponseField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : AddChartResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : AddChartResponseFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class AddChartResponseFieldBasicChartDomain(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val domain by lazy { object : AddChartResponseFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<AddChartResponseField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartResponseFieldBasicChartSeries(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val color by lazy { object : AddChartResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : AddChartResponseFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : AddChartResponseFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : AddChartResponseFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : AddChartResponseFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : AddChartResponseFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<AddChartResponseField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<AddChartResponseField> get() = fieldsList("${path}/type")
}

abstract class AddChartResponseFieldDataLabel(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val customLabelData by lazy { object : AddChartResponseFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<AddChartResponseField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<AddChartResponseField> get() = fieldsList("${path}/type")
}

abstract class AddChartResponseFieldChartData(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val aggregateType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : AddChartResponseFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : AddChartResponseFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : AddChartResponseFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class AddChartResponseFieldCandlestickData(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val closeSeries by lazy { object : AddChartResponseFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : AddChartResponseFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : AddChartResponseFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : AddChartResponseFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class AddChartResponseFieldCandlestickDomain(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val data by lazy { object : AddChartResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<AddChartResponseField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartResponseFieldDataExecutionStatus(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val errorCode: FieldsList<AddChartResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AddChartResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AddChartResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AddChartResponseField> get() = fieldsList("${path}/state")
}

abstract class AddChartResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val name: FieldsList<AddChartResponseField> get() = fieldsList("${path}/name")
}

abstract class AddChartResponseFieldFilterCriteria(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val condition by lazy { object : AddChartResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddChartResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddChartResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddChartResponseFieldHistogramSeries(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val barColor by lazy { object : AddChartResponseFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : AddChartResponseFieldChartData("${path}/data") {} }
}

abstract class AddChartResponseFieldBaselineValueFormat(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val comparisonType: FieldsList<AddChartResponseField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<AddChartResponseField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : AddChartResponseFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : AddChartResponseFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : AddChartResponseFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartResponseFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val prefix: FieldsList<AddChartResponseField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<AddChartResponseField> get() = fieldsList("${path}/suffix")
}

abstract class AddChartResponseFieldKeyValueFormat(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val position by lazy { object : AddChartResponseFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : AddChartResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartResponseFieldLink(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val uri: FieldsList<AddChartResponseField> get() = fieldsList("${path}/uri")
}

abstract class AddChartResponseFieldTreemapChartColorScale(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val maxValueColor by lazy { object : AddChartResponseFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : AddChartResponseFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : AddChartResponseFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : AddChartResponseFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class AddChartResponseFieldLineStyle(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val type: FieldsList<AddChartResponseField> get() = fieldsList("${path}/type")
	val width: FieldsList<AddChartResponseField> get() = fieldsList("${path}/width")
}

abstract class AddChartResponseFieldWaterfallChartDomain(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val data by lazy { object : AddChartResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<AddChartResponseField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartResponseFieldWaterfallChartSeries(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val customSubtotals by lazy { object : AddChartResponseFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : AddChartResponseFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : AddChartResponseFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<AddChartResponseField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : AddChartResponseFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : AddChartResponseFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : AddChartResponseFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class AddChartResponseFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val viewWindowMax: FieldsList<AddChartResponseField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<AddChartResponseField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<AddChartResponseField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class AddChartResponseFieldPointStyle(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val shape: FieldsList<AddChartResponseField> get() = fieldsList("${path}/shape")
	val size: FieldsList<AddChartResponseField> get() = fieldsList("${path}/size")
}

abstract class AddChartResponseFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val color by lazy { object : AddChartResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<AddChartResponseField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : AddChartResponseFieldPointStyle("${path}/pointStyle") {} }
}

abstract class AddChartResponseFieldChartGroupRule(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val dateTimeRule by lazy { object : AddChartResponseFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : AddChartResponseFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class AddChartResponseFieldChartSourceRange(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val sources by lazy { object : AddChartResponseFieldGridRange("${path}/sources") {} }
}

abstract class AddChartResponseFieldCandlestickSeries(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val data by lazy { object : AddChartResponseFieldChartData("${path}/data") {} }
}

abstract class AddChartResponseFieldBooleanCondition(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val type: FieldsList<AddChartResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddChartResponseFieldConditionValue("${path}/values") {} }
}

abstract class AddChartResponseFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val dataIsSubtotal: FieldsList<AddChartResponseField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<AddChartResponseField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class AddChartResponseFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val color by lazy { object : AddChartResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartResponseFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<AddChartResponseField> get() = fieldsList("${path}/label")
}

abstract class AddChartResponseFieldChartDateTimeRule(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val type: FieldsList<AddChartResponseField> get() = fieldsList("${path}/type")
}

abstract class AddChartResponseFieldChartHistogramRule(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val intervalSize: FieldsList<AddChartResponseField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/minValue")
}

abstract class AddChartResponseFieldGridRange(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val endColumnIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddChartResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddChartResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddChartResponseFieldConditionValue(private val path: String) : FieldsList<AddChartResponseField>(path) {
	val relativeDate: FieldsList<AddChartResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddChartResponseField> get() = fieldsList("${path}/userEnteredValue")
}

