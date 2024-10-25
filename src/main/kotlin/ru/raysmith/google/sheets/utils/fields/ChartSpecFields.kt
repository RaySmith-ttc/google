package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartSpecField : Field

object ChartSpecFields {
    val ALL: FieldsList<ChartSpecField> = fieldsList("*")
	val altText: FieldsList<ChartSpecField> get() = fieldsList("altText")
	val backgroundColor = object : ChartSpecFieldColor("backgroundColor") {}
	val backgroundColorStyle = object : ChartSpecFieldColorStyle("backgroundColorStyle") {}
	val basicChart = object : ChartSpecFieldBasicChartSpec("basicChart") {}
	val bubbleChart = object : ChartSpecFieldBubbleChartSpec("bubbleChart") {}
	val candlestickChart = object : ChartSpecFieldCandlestickChartSpec("candlestickChart") {}
	val dataSourceChartProperties = object : ChartSpecFieldDataSourceChartProperties("dataSourceChartProperties") {}
	val filterSpecs = object : ChartSpecFieldFilterSpec("filterSpecs") {}
	val fontName: FieldsList<ChartSpecField> get() = fieldsList("fontName")
	val hiddenDimensionStrategy: FieldsList<ChartSpecField> get() = fieldsList("hiddenDimensionStrategy")
	val histogramChart = object : ChartSpecFieldHistogramChartSpec("histogramChart") {}
	val maximized: FieldsList<ChartSpecField> get() = fieldsList("maximized")
	val orgChart = object : ChartSpecFieldOrgChartSpec("orgChart") {}
	val pieChart = object : ChartSpecFieldPieChartSpec("pieChart") {}
	val scorecardChart = object : ChartSpecFieldScorecardChartSpec("scorecardChart") {}
	val sortSpecs = object : ChartSpecFieldSortSpec("sortSpecs") {}
	val subtitle: FieldsList<ChartSpecField> get() = fieldsList("subtitle")
	val subtitleTextFormat = object : ChartSpecFieldTextFormat("subtitleTextFormat") {}
	val subtitleTextPosition = object : ChartSpecFieldTextPosition("subtitleTextPosition") {}
	val title: FieldsList<ChartSpecField> get() = fieldsList("title")
	val titleTextFormat = object : ChartSpecFieldTextFormat("titleTextFormat") {}
	val titleTextPosition = object : ChartSpecFieldTextPosition("titleTextPosition") {}
	val treemapChart = object : ChartSpecFieldTreemapChartSpec("treemapChart") {}
	val waterfallChart = object : ChartSpecFieldWaterfallChartSpec("waterfallChart") {}
}

abstract class ChartSpecFieldColor(private val path: String) : FieldsList<ChartSpecField>(path) {
	val alpha: FieldsList<ChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<ChartSpecField> get() = fieldsList("${path}/red")
}

abstract class ChartSpecFieldColorStyle(private val path: String) : FieldsList<ChartSpecField>(path) {
	val rgbColor by lazy { object : ChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<ChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class ChartSpecFieldBasicChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val axis by lazy { object : ChartSpecFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<ChartSpecField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<ChartSpecField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : ChartSpecFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<ChartSpecField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<ChartSpecField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<ChartSpecField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<ChartSpecField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : ChartSpecFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<ChartSpecField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<ChartSpecField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : ChartSpecFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class ChartSpecFieldBubbleChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val bubbleBorderColor by lazy { object : ChartSpecFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : ChartSpecFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<ChartSpecField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : ChartSpecFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : ChartSpecFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : ChartSpecFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : ChartSpecFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<ChartSpecField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : ChartSpecFieldChartData("${path}/series") {} }
}

abstract class ChartSpecFieldCandlestickChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val data by lazy { object : ChartSpecFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : ChartSpecFieldCandlestickDomain("${path}/domain") {} }
}

abstract class ChartSpecFieldDataSourceChartProperties(private val path: String) : FieldsList<ChartSpecField>(path) {
	val dataExecutionStatus by lazy { object : ChartSpecFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<ChartSpecField> get() = fieldsList("${path}/dataSourceId")
}

abstract class ChartSpecFieldFilterSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val columnIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : ChartSpecFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : ChartSpecFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class ChartSpecFieldHistogramChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val bucketSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<ChartSpecField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<ChartSpecField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : ChartSpecFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<ChartSpecField> get() = fieldsList("${path}/showItemDividers")
}

abstract class ChartSpecFieldOrgChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val labels by lazy { object : ChartSpecFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : ChartSpecFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : ChartSpecFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : ChartSpecFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : ChartSpecFieldChartData("${path}/tooltips") {} }
}

abstract class ChartSpecFieldPieChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val domain by lazy { object : ChartSpecFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<ChartSpecField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<ChartSpecField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : ChartSpecFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<ChartSpecField> get() = fieldsList("${path}/threeDimensional")
}

abstract class ChartSpecFieldScorecardChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val aggregateType: FieldsList<ChartSpecField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : ChartSpecFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : ChartSpecFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : ChartSpecFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : ChartSpecFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : ChartSpecFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<ChartSpecField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<ChartSpecField> get() = fieldsList("${path}/scaleFactor")
}

abstract class ChartSpecFieldSortSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val backgroundColor by lazy { object : ChartSpecFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : ChartSpecFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : ChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<ChartSpecField> get() = fieldsList("${path}/sortOrder")
}

abstract class ChartSpecFieldTextFormat(private val path: String) : FieldsList<ChartSpecField>(path) {
	val bold: FieldsList<ChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<ChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : ChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<ChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<ChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class ChartSpecFieldTextPosition(private val path: String) : FieldsList<ChartSpecField>(path) {
	val horizontalAlignment: FieldsList<ChartSpecField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class ChartSpecFieldTreemapChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val colorData by lazy { object : ChartSpecFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : ChartSpecFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : ChartSpecFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<ChartSpecField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<ChartSpecField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : ChartSpecFieldChartData("${path}/labels") {} }
	val levels: FieldsList<ChartSpecField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<ChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ChartSpecField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : ChartSpecFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : ChartSpecFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : ChartSpecFieldTextFormat("${path}/textFormat") {} }
}

abstract class ChartSpecFieldWaterfallChartSpec(private val path: String) : FieldsList<ChartSpecField>(path) {
	val connectorLineStyle by lazy { object : ChartSpecFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : ChartSpecFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<ChartSpecField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<ChartSpecField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : ChartSpecFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<ChartSpecField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : ChartSpecFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class ChartSpecFieldBasicChartAxis(private val path: String) : FieldsList<ChartSpecField>(path) {
	val format by lazy { object : ChartSpecFieldTextFormat("${path}/format") {} }
	val position: FieldsList<ChartSpecField> get() = fieldsList("${path}/position")
	val title: FieldsList<ChartSpecField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : ChartSpecFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : ChartSpecFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class ChartSpecFieldBasicChartDomain(private val path: String) : FieldsList<ChartSpecField>(path) {
	val domain by lazy { object : ChartSpecFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<ChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class ChartSpecFieldBasicChartSeries(private val path: String) : FieldsList<ChartSpecField>(path) {
	val color by lazy { object : ChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : ChartSpecFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : ChartSpecFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : ChartSpecFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : ChartSpecFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : ChartSpecFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<ChartSpecField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<ChartSpecField> get() = fieldsList("${path}/type")
}

abstract class ChartSpecFieldDataLabel(private val path: String) : FieldsList<ChartSpecField>(path) {
	val customLabelData by lazy { object : ChartSpecFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<ChartSpecField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : ChartSpecFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<ChartSpecField> get() = fieldsList("${path}/type")
}

abstract class ChartSpecFieldChartData(private val path: String) : FieldsList<ChartSpecField>(path) {
	val aggregateType: FieldsList<ChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : ChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : ChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : ChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class ChartSpecFieldCandlestickData(private val path: String) : FieldsList<ChartSpecField>(path) {
	val closeSeries by lazy { object : ChartSpecFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : ChartSpecFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : ChartSpecFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : ChartSpecFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class ChartSpecFieldCandlestickDomain(private val path: String) : FieldsList<ChartSpecField>(path) {
	val data by lazy { object : ChartSpecFieldChartData("${path}/data") {} }
	val reversed: FieldsList<ChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class ChartSpecFieldDataExecutionStatus(private val path: String) : FieldsList<ChartSpecField>(path) {
	val errorCode: FieldsList<ChartSpecField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<ChartSpecField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<ChartSpecField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<ChartSpecField> get() = fieldsList("${path}/state")
}

abstract class ChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<ChartSpecField>(path) {
	val name: FieldsList<ChartSpecField> get() = fieldsList("${path}/name")
}

abstract class ChartSpecFieldFilterCriteria(private val path: String) : FieldsList<ChartSpecField>(path) {
	val condition by lazy { object : ChartSpecFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<ChartSpecField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : ChartSpecFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : ChartSpecFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class ChartSpecFieldHistogramSeries(private val path: String) : FieldsList<ChartSpecField>(path) {
	val barColor by lazy { object : ChartSpecFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : ChartSpecFieldChartData("${path}/data") {} }
}

abstract class ChartSpecFieldBaselineValueFormat(private val path: String) : FieldsList<ChartSpecField>(path) {
	val comparisonType: FieldsList<ChartSpecField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<ChartSpecField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : ChartSpecFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : ChartSpecFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : ChartSpecFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : ChartSpecFieldTextFormat("${path}/textFormat") {} }
}

abstract class ChartSpecFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<ChartSpecField>(path) {
	val prefix: FieldsList<ChartSpecField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<ChartSpecField> get() = fieldsList("${path}/suffix")
}

abstract class ChartSpecFieldKeyValueFormat(private val path: String) : FieldsList<ChartSpecField>(path) {
	val position by lazy { object : ChartSpecFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : ChartSpecFieldTextFormat("${path}/textFormat") {} }
}

abstract class ChartSpecFieldLink(private val path: String) : FieldsList<ChartSpecField>(path) {
	val uri: FieldsList<ChartSpecField> get() = fieldsList("${path}/uri")
}

abstract class ChartSpecFieldTreemapChartColorScale(private val path: String) : FieldsList<ChartSpecField>(path) {
	val maxValueColor by lazy { object : ChartSpecFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : ChartSpecFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : ChartSpecFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : ChartSpecFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class ChartSpecFieldLineStyle(private val path: String) : FieldsList<ChartSpecField>(path) {
	val type: FieldsList<ChartSpecField> get() = fieldsList("${path}/type")
	val width: FieldsList<ChartSpecField> get() = fieldsList("${path}/width")
}

abstract class ChartSpecFieldWaterfallChartDomain(private val path: String) : FieldsList<ChartSpecField>(path) {
	val data by lazy { object : ChartSpecFieldChartData("${path}/data") {} }
	val reversed: FieldsList<ChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class ChartSpecFieldWaterfallChartSeries(private val path: String) : FieldsList<ChartSpecField>(path) {
	val customSubtotals by lazy { object : ChartSpecFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : ChartSpecFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : ChartSpecFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<ChartSpecField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : ChartSpecFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : ChartSpecFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : ChartSpecFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class ChartSpecFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<ChartSpecField>(path) {
	val viewWindowMax: FieldsList<ChartSpecField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<ChartSpecField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<ChartSpecField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class ChartSpecFieldPointStyle(private val path: String) : FieldsList<ChartSpecField>(path) {
	val shape: FieldsList<ChartSpecField> get() = fieldsList("${path}/shape")
	val size: FieldsList<ChartSpecField> get() = fieldsList("${path}/size")
}

abstract class ChartSpecFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<ChartSpecField>(path) {
	val color by lazy { object : ChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<ChartSpecField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : ChartSpecFieldPointStyle("${path}/pointStyle") {} }
}

abstract class ChartSpecFieldChartGroupRule(private val path: String) : FieldsList<ChartSpecField>(path) {
	val dateTimeRule by lazy { object : ChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : ChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class ChartSpecFieldChartSourceRange(private val path: String) : FieldsList<ChartSpecField>(path) {
	val sources by lazy { object : ChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class ChartSpecFieldCandlestickSeries(private val path: String) : FieldsList<ChartSpecField>(path) {
	val data by lazy { object : ChartSpecFieldChartData("${path}/data") {} }
}

abstract class ChartSpecFieldBooleanCondition(private val path: String) : FieldsList<ChartSpecField>(path) {
	val type: FieldsList<ChartSpecField> get() = fieldsList("${path}/type")
	val values by lazy { object : ChartSpecFieldConditionValue("${path}/values") {} }
}

abstract class ChartSpecFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<ChartSpecField>(path) {
	val dataIsSubtotal: FieldsList<ChartSpecField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<ChartSpecField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class ChartSpecFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<ChartSpecField>(path) {
	val color by lazy { object : ChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<ChartSpecField> get() = fieldsList("${path}/label")
}

abstract class ChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<ChartSpecField>(path) {
	val type: FieldsList<ChartSpecField> get() = fieldsList("${path}/type")
}

abstract class ChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<ChartSpecField>(path) {
	val intervalSize: FieldsList<ChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<ChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class ChartSpecFieldGridRange(private val path: String) : FieldsList<ChartSpecField>(path) {
	val endColumnIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

abstract class ChartSpecFieldConditionValue(private val path: String) : FieldsList<ChartSpecField>(path) {
	val relativeDate: FieldsList<ChartSpecField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<ChartSpecField> get() = fieldsList("${path}/userEnteredValue")
}

