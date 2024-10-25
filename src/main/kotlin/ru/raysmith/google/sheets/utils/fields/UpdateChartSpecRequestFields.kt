package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateChartSpecRequestField : Field

object UpdateChartSpecRequestFields {
    val ALL: FieldsList<UpdateChartSpecRequestField> = fieldsList("*")
	val chartId: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("chartId")
	val spec = object : UpdateChartSpecRequestFieldChartSpec("spec") {}
}

abstract class UpdateChartSpecRequestFieldChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val altText: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : UpdateChartSpecRequestFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : UpdateChartSpecRequestFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : UpdateChartSpecRequestFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : UpdateChartSpecRequestFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : UpdateChartSpecRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : UpdateChartSpecRequestFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : UpdateChartSpecRequestFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : UpdateChartSpecRequestFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : UpdateChartSpecRequestFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : UpdateChartSpecRequestFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : UpdateChartSpecRequestFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : UpdateChartSpecRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : UpdateChartSpecRequestFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : UpdateChartSpecRequestFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class UpdateChartSpecRequestFieldColor(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val alpha: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateChartSpecRequestFieldColorStyle(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val rgbColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateChartSpecRequestFieldBasicChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val axis by lazy { object : UpdateChartSpecRequestFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : UpdateChartSpecRequestFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : UpdateChartSpecRequestFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : UpdateChartSpecRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class UpdateChartSpecRequestFieldBubbleChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val bubbleBorderColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/series") {} }
}

abstract class UpdateChartSpecRequestFieldCandlestickChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val data by lazy { object : UpdateChartSpecRequestFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : UpdateChartSpecRequestFieldCandlestickDomain("${path}/domain") {} }
}

abstract class UpdateChartSpecRequestFieldDataSourceChartProperties(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val dataExecutionStatus by lazy { object : UpdateChartSpecRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class UpdateChartSpecRequestFieldFilterSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val columnIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : UpdateChartSpecRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : UpdateChartSpecRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class UpdateChartSpecRequestFieldHistogramChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val bucketSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : UpdateChartSpecRequestFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/showItemDividers")
}

abstract class UpdateChartSpecRequestFieldOrgChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val labels by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/tooltips") {} }
}

abstract class UpdateChartSpecRequestFieldPieChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val domain by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/threeDimensional")
}

abstract class UpdateChartSpecRequestFieldScorecardChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val aggregateType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : UpdateChartSpecRequestFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : UpdateChartSpecRequestFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : UpdateChartSpecRequestFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/scaleFactor")
}

abstract class UpdateChartSpecRequestFieldSortSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val backgroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : UpdateChartSpecRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class UpdateChartSpecRequestFieldTextFormat(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val bold: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateChartSpecRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/underline")
}

abstract class UpdateChartSpecRequestFieldTextPosition(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val horizontalAlignment: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class UpdateChartSpecRequestFieldTreemapChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val colorData by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : UpdateChartSpecRequestFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/labels") {} }
	val levels: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class UpdateChartSpecRequestFieldWaterfallChartSpec(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val connectorLineStyle by lazy { object : UpdateChartSpecRequestFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : UpdateChartSpecRequestFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : UpdateChartSpecRequestFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : UpdateChartSpecRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class UpdateChartSpecRequestFieldBasicChartAxis(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val format by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/format") {} }
	val position: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/position")
	val title: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : UpdateChartSpecRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : UpdateChartSpecRequestFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class UpdateChartSpecRequestFieldBasicChartDomain(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val domain by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/reversed")
}

abstract class UpdateChartSpecRequestFieldBasicChartSeries(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val color by lazy { object : UpdateChartSpecRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : UpdateChartSpecRequestFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : UpdateChartSpecRequestFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : UpdateChartSpecRequestFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : UpdateChartSpecRequestFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateChartSpecRequestFieldDataLabel(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val customLabelData by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateChartSpecRequestFieldChartData(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val aggregateType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : UpdateChartSpecRequestFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : UpdateChartSpecRequestFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : UpdateChartSpecRequestFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class UpdateChartSpecRequestFieldCandlestickData(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val closeSeries by lazy { object : UpdateChartSpecRequestFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : UpdateChartSpecRequestFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : UpdateChartSpecRequestFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : UpdateChartSpecRequestFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class UpdateChartSpecRequestFieldCandlestickDomain(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val data by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/reversed")
}

abstract class UpdateChartSpecRequestFieldDataExecutionStatus(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val errorCode: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/state")
}

abstract class UpdateChartSpecRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val name: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/name")
}

abstract class UpdateChartSpecRequestFieldFilterCriteria(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val condition by lazy { object : UpdateChartSpecRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class UpdateChartSpecRequestFieldHistogramSeries(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val barColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/data") {} }
}

abstract class UpdateChartSpecRequestFieldBaselineValueFormat(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val comparisonType: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : UpdateChartSpecRequestFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class UpdateChartSpecRequestFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val prefix: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/suffix")
}

abstract class UpdateChartSpecRequestFieldKeyValueFormat(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val position by lazy { object : UpdateChartSpecRequestFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : UpdateChartSpecRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class UpdateChartSpecRequestFieldLink(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val uri: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/uri")
}

abstract class UpdateChartSpecRequestFieldTreemapChartColorScale(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val maxValueColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : UpdateChartSpecRequestFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class UpdateChartSpecRequestFieldLineStyle(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val type: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/type")
	val width: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/width")
}

abstract class UpdateChartSpecRequestFieldWaterfallChartDomain(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val data by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/reversed")
}

abstract class UpdateChartSpecRequestFieldWaterfallChartSeries(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val customSubtotals by lazy { object : UpdateChartSpecRequestFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : UpdateChartSpecRequestFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : UpdateChartSpecRequestFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : UpdateChartSpecRequestFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : UpdateChartSpecRequestFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class UpdateChartSpecRequestFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val viewWindowMax: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class UpdateChartSpecRequestFieldPointStyle(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val shape: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/shape")
	val size: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/size")
}

abstract class UpdateChartSpecRequestFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val color by lazy { object : UpdateChartSpecRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : UpdateChartSpecRequestFieldPointStyle("${path}/pointStyle") {} }
}

abstract class UpdateChartSpecRequestFieldChartGroupRule(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val dateTimeRule by lazy { object : UpdateChartSpecRequestFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : UpdateChartSpecRequestFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class UpdateChartSpecRequestFieldChartSourceRange(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val sources by lazy { object : UpdateChartSpecRequestFieldGridRange("${path}/sources") {} }
}

abstract class UpdateChartSpecRequestFieldCandlestickSeries(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val data by lazy { object : UpdateChartSpecRequestFieldChartData("${path}/data") {} }
}

abstract class UpdateChartSpecRequestFieldBooleanCondition(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val type: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateChartSpecRequestFieldConditionValue("${path}/values") {} }
}

abstract class UpdateChartSpecRequestFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val dataIsSubtotal: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class UpdateChartSpecRequestFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val color by lazy { object : UpdateChartSpecRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateChartSpecRequestFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/label")
}

abstract class UpdateChartSpecRequestFieldChartDateTimeRule(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val type: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateChartSpecRequestFieldChartHistogramRule(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val intervalSize: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/minValue")
}

abstract class UpdateChartSpecRequestFieldGridRange(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateChartSpecRequestFieldConditionValue(private val path: String) : FieldsList<UpdateChartSpecRequestField>(path) {
	val relativeDate: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateChartSpecRequestField> get() = fieldsList("${path}/userEnteredValue")
}

