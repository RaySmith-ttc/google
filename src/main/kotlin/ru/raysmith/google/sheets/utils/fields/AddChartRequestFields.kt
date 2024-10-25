package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddChartRequestField : Field

object AddChartRequestFields {
    val ALL: FieldsList<AddChartRequestField> = fieldsList("*")
	val chart = object : AddChartRequestFieldEmbeddedChart("chart") {}
}

abstract class AddChartRequestFieldEmbeddedChart(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val border by lazy { object : AddChartRequestFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<AddChartRequestField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : AddChartRequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : AddChartRequestFieldChartSpec("${path}/spec") {} }
}

abstract class AddChartRequestFieldEmbeddedObjectBorder(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val color by lazy { object : AddChartRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/colorStyle") {} }
}

abstract class AddChartRequestFieldEmbeddedObjectPosition(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val newSheet: FieldsList<AddChartRequestField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : AddChartRequestFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<AddChartRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class AddChartRequestFieldChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val altText: FieldsList<AddChartRequestField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : AddChartRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : AddChartRequestFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : AddChartRequestFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : AddChartRequestFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : AddChartRequestFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : AddChartRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<AddChartRequestField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : AddChartRequestFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<AddChartRequestField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : AddChartRequestFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : AddChartRequestFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : AddChartRequestFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : AddChartRequestFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<AddChartRequestField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : AddChartRequestFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<AddChartRequestField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : AddChartRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : AddChartRequestFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : AddChartRequestFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class AddChartRequestFieldColor(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val alpha: FieldsList<AddChartRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddChartRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddChartRequestField> get() = fieldsList("${path}/red")
}

abstract class AddChartRequestFieldColorStyle(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val rgbColor by lazy { object : AddChartRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddChartRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AddChartRequestFieldOverlayPosition(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val anchorCell by lazy { object : AddChartRequestFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/widthPixels")
}

abstract class AddChartRequestFieldBasicChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val axis by lazy { object : AddChartRequestFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<AddChartRequestField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : AddChartRequestFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<AddChartRequestField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<AddChartRequestField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<AddChartRequestField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<AddChartRequestField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : AddChartRequestFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<AddChartRequestField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : AddChartRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class AddChartRequestFieldBubbleChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val bubbleBorderColor by lazy { object : AddChartRequestFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : AddChartRequestFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<AddChartRequestField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : AddChartRequestFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : AddChartRequestFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : AddChartRequestFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : AddChartRequestFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<AddChartRequestField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : AddChartRequestFieldChartData("${path}/series") {} }
}

abstract class AddChartRequestFieldCandlestickChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val data by lazy { object : AddChartRequestFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : AddChartRequestFieldCandlestickDomain("${path}/domain") {} }
}

abstract class AddChartRequestFieldDataSourceChartProperties(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val dataExecutionStatus by lazy { object : AddChartRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AddChartRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class AddChartRequestFieldFilterSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val columnIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : AddChartRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AddChartRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AddChartRequestFieldHistogramChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val bucketSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<AddChartRequestField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<AddChartRequestField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : AddChartRequestFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<AddChartRequestField> get() = fieldsList("${path}/showItemDividers")
}

abstract class AddChartRequestFieldOrgChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val labels by lazy { object : AddChartRequestFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : AddChartRequestFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : AddChartRequestFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : AddChartRequestFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : AddChartRequestFieldChartData("${path}/tooltips") {} }
}

abstract class AddChartRequestFieldPieChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val domain by lazy { object : AddChartRequestFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<AddChartRequestField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<AddChartRequestField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : AddChartRequestFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<AddChartRequestField> get() = fieldsList("${path}/threeDimensional")
}

abstract class AddChartRequestFieldScorecardChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val aggregateType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : AddChartRequestFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : AddChartRequestFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : AddChartRequestFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : AddChartRequestFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : AddChartRequestFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<AddChartRequestField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<AddChartRequestField> get() = fieldsList("${path}/scaleFactor")
}

abstract class AddChartRequestFieldSortSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val backgroundColor by lazy { object : AddChartRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : AddChartRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : AddChartRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<AddChartRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class AddChartRequestFieldTextFormat(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val bold: FieldsList<AddChartRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AddChartRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AddChartRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AddChartRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AddChartRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AddChartRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AddChartRequestField> get() = fieldsList("${path}/underline")
}

abstract class AddChartRequestFieldTextPosition(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val horizontalAlignment: FieldsList<AddChartRequestField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class AddChartRequestFieldTreemapChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val colorData by lazy { object : AddChartRequestFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : AddChartRequestFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : AddChartRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : AddChartRequestFieldChartData("${path}/labels") {} }
	val levels: FieldsList<AddChartRequestField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : AddChartRequestFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : AddChartRequestFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartRequestFieldWaterfallChartSpec(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val connectorLineStyle by lazy { object : AddChartRequestFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : AddChartRequestFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<AddChartRequestField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : AddChartRequestFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : AddChartRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class AddChartRequestFieldGridCoordinate(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val columnIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<AddChartRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class AddChartRequestFieldBasicChartAxis(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val format by lazy { object : AddChartRequestFieldTextFormat("${path}/format") {} }
	val position: FieldsList<AddChartRequestField> get() = fieldsList("${path}/position")
	val title: FieldsList<AddChartRequestField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : AddChartRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : AddChartRequestFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class AddChartRequestFieldBasicChartDomain(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val domain by lazy { object : AddChartRequestFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<AddChartRequestField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartRequestFieldBasicChartSeries(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val color by lazy { object : AddChartRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : AddChartRequestFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : AddChartRequestFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : AddChartRequestFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : AddChartRequestFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : AddChartRequestFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<AddChartRequestField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<AddChartRequestField> get() = fieldsList("${path}/type")
}

abstract class AddChartRequestFieldDataLabel(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val customLabelData by lazy { object : AddChartRequestFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<AddChartRequestField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<AddChartRequestField> get() = fieldsList("${path}/type")
}

abstract class AddChartRequestFieldChartData(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val aggregateType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : AddChartRequestFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : AddChartRequestFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : AddChartRequestFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class AddChartRequestFieldCandlestickData(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val closeSeries by lazy { object : AddChartRequestFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : AddChartRequestFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : AddChartRequestFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : AddChartRequestFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class AddChartRequestFieldCandlestickDomain(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val data by lazy { object : AddChartRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<AddChartRequestField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartRequestFieldDataExecutionStatus(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val errorCode: FieldsList<AddChartRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AddChartRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AddChartRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AddChartRequestField> get() = fieldsList("${path}/state")
}

abstract class AddChartRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val name: FieldsList<AddChartRequestField> get() = fieldsList("${path}/name")
}

abstract class AddChartRequestFieldFilterCriteria(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val condition by lazy { object : AddChartRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddChartRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddChartRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddChartRequestFieldHistogramSeries(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val barColor by lazy { object : AddChartRequestFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : AddChartRequestFieldChartData("${path}/data") {} }
}

abstract class AddChartRequestFieldBaselineValueFormat(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val comparisonType: FieldsList<AddChartRequestField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<AddChartRequestField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : AddChartRequestFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : AddChartRequestFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : AddChartRequestFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartRequestFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val prefix: FieldsList<AddChartRequestField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<AddChartRequestField> get() = fieldsList("${path}/suffix")
}

abstract class AddChartRequestFieldKeyValueFormat(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val position by lazy { object : AddChartRequestFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : AddChartRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class AddChartRequestFieldLink(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val uri: FieldsList<AddChartRequestField> get() = fieldsList("${path}/uri")
}

abstract class AddChartRequestFieldTreemapChartColorScale(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val maxValueColor by lazy { object : AddChartRequestFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : AddChartRequestFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : AddChartRequestFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : AddChartRequestFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class AddChartRequestFieldLineStyle(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val type: FieldsList<AddChartRequestField> get() = fieldsList("${path}/type")
	val width: FieldsList<AddChartRequestField> get() = fieldsList("${path}/width")
}

abstract class AddChartRequestFieldWaterfallChartDomain(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val data by lazy { object : AddChartRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<AddChartRequestField> get() = fieldsList("${path}/reversed")
}

abstract class AddChartRequestFieldWaterfallChartSeries(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val customSubtotals by lazy { object : AddChartRequestFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : AddChartRequestFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : AddChartRequestFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<AddChartRequestField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : AddChartRequestFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : AddChartRequestFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : AddChartRequestFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class AddChartRequestFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val viewWindowMax: FieldsList<AddChartRequestField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<AddChartRequestField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<AddChartRequestField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class AddChartRequestFieldPointStyle(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val shape: FieldsList<AddChartRequestField> get() = fieldsList("${path}/shape")
	val size: FieldsList<AddChartRequestField> get() = fieldsList("${path}/size")
}

abstract class AddChartRequestFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val color by lazy { object : AddChartRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<AddChartRequestField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : AddChartRequestFieldPointStyle("${path}/pointStyle") {} }
}

abstract class AddChartRequestFieldChartGroupRule(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val dateTimeRule by lazy { object : AddChartRequestFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : AddChartRequestFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class AddChartRequestFieldChartSourceRange(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val sources by lazy { object : AddChartRequestFieldGridRange("${path}/sources") {} }
}

abstract class AddChartRequestFieldCandlestickSeries(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val data by lazy { object : AddChartRequestFieldChartData("${path}/data") {} }
}

abstract class AddChartRequestFieldBooleanCondition(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val type: FieldsList<AddChartRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddChartRequestFieldConditionValue("${path}/values") {} }
}

abstract class AddChartRequestFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val dataIsSubtotal: FieldsList<AddChartRequestField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<AddChartRequestField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class AddChartRequestFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val color by lazy { object : AddChartRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AddChartRequestFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<AddChartRequestField> get() = fieldsList("${path}/label")
}

abstract class AddChartRequestFieldChartDateTimeRule(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val type: FieldsList<AddChartRequestField> get() = fieldsList("${path}/type")
}

abstract class AddChartRequestFieldChartHistogramRule(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val intervalSize: FieldsList<AddChartRequestField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/minValue")
}

abstract class AddChartRequestFieldGridRange(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val endColumnIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddChartRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddChartRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddChartRequestFieldConditionValue(private val path: String) : FieldsList<AddChartRequestField>(path) {
	val relativeDate: FieldsList<AddChartRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddChartRequestField> get() = fieldsList("${path}/userEnteredValue")
}

