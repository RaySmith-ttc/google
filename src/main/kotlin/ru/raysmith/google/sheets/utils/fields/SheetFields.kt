package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SheetField : Field

object SheetFields {
    val ALL: FieldsList<SheetField> = fieldsList("*")
	val bandedRanges = object : SheetFieldBandedRange("bandedRanges") {}
	val basicFilter = object : SheetFieldBasicFilter("basicFilter") {}
	val charts = object : SheetFieldEmbeddedChart("charts") {}
	val columnGroups = object : SheetFieldDimensionGroup("columnGroups") {}
	val conditionalFormats = object : SheetFieldConditionalFormatRule("conditionalFormats") {}
	val data = object : SheetFieldGridData("data") {}
	val developerMetadata = object : SheetFieldDeveloperMetadata("developerMetadata") {}
	val filterViews = object : SheetFieldFilterView("filterViews") {}
	val merges = object : SheetFieldGridRange("merges") {}
	val properties = object : SheetFieldSheetProperties("properties") {}
	val protectedRanges = object : SheetFieldProtectedRange("protectedRanges") {}
	val rowGroups = object : SheetFieldDimensionGroup("rowGroups") {}
	val slicers = object : SheetFieldSlicer("slicers") {}
}

abstract class SheetFieldBandedRange(private val path: String) : FieldsList<SheetField>(path) {
	val bandedRangeId: FieldsList<SheetField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : SheetFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : SheetFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : SheetFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class SheetFieldBasicFilter(private val path: String) : FieldsList<SheetField>(path) {
	val criteria by lazy { object : SheetFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : SheetFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : SheetFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : SheetFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class SheetFieldEmbeddedChart(private val path: String) : FieldsList<SheetField>(path) {
	val border by lazy { object : SheetFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<SheetField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : SheetFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : SheetFieldChartSpec("${path}/spec") {} }
}

abstract class SheetFieldDimensionGroup(private val path: String) : FieldsList<SheetField>(path) {
	val collapsed: FieldsList<SheetField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<SheetField> get() = fieldsList("${path}/depth")
	val range by lazy { object : SheetFieldDimensionRange("${path}/range") {} }
}

abstract class SheetFieldConditionalFormatRule(private val path: String) : FieldsList<SheetField>(path) {
	val booleanRule by lazy { object : SheetFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : SheetFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : SheetFieldGridRange("${path}/ranges") {} }
}

abstract class SheetFieldGridData(private val path: String) : FieldsList<SheetField>(path) {
	val columnMetadata by lazy { object : SheetFieldDimensionProperties("${path}/columnMetadata") {} }
	val rowData by lazy { object : SheetFieldRowData("${path}/rowData") {} }
	val rowMetadata by lazy { object : SheetFieldDimensionProperties("${path}/rowMetadata") {} }
	val startColumn: FieldsList<SheetField> get() = fieldsList("${path}/startColumn")
	val startRow: FieldsList<SheetField> get() = fieldsList("${path}/startRow")
}

abstract class SheetFieldDeveloperMetadata(private val path: String) : FieldsList<SheetField>(path) {
	val location by lazy { object : SheetFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<SheetField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<SheetField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<SheetField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<SheetField> get() = fieldsList("${path}/visibility")
}

abstract class SheetFieldFilterView(private val path: String) : FieldsList<SheetField>(path) {
	val criteria by lazy { object : SheetFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : SheetFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<SheetField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<SheetField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : SheetFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : SheetFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<SheetField> get() = fieldsList("${path}/title")
}

abstract class SheetFieldGridRange(private val path: String) : FieldsList<SheetField>(path) {
	val endColumnIndex: FieldsList<SheetField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SheetField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SheetField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SheetField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SheetFieldSheetProperties(private val path: String) : FieldsList<SheetField>(path) {
	val dataSourceSheetProperties by lazy { object : SheetFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : SheetFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<SheetField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<SheetField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<SheetField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<SheetField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : SheetFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : SheetFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<SheetField> get() = fieldsList("${path}/title")
}

abstract class SheetFieldProtectedRange(private val path: String) : FieldsList<SheetField>(path) {
	val description: FieldsList<SheetField> get() = fieldsList("${path}/description")
	val editors by lazy { object : SheetFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<SheetField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<SheetField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : SheetFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<SheetField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : SheetFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<SheetField> get() = fieldsList("${path}/warningOnly")
}

abstract class SheetFieldSlicer(private val path: String) : FieldsList<SheetField>(path) {
	val position by lazy { object : SheetFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<SheetField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : SheetFieldSlicerSpec("${path}/spec") {} }
}

abstract class SheetFieldBandingProperties(private val path: String) : FieldsList<SheetField>(path) {
	val firstBandColor by lazy { object : SheetFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : SheetFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : SheetFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : SheetFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : SheetFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : SheetFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : SheetFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : SheetFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class SheetFieldFilterCriteria(private val path: String) : FieldsList<SheetField>(path) {
	val condition by lazy { object : SheetFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<SheetField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : SheetFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : SheetFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class SheetFieldFilterSpec(private val path: String) : FieldsList<SheetField>(path) {
	val columnIndex: FieldsList<SheetField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : SheetFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class SheetFieldSortSpec(private val path: String) : FieldsList<SheetField>(path) {
	val backgroundColor by lazy { object : SheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<SheetField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : SheetFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<SheetField> get() = fieldsList("${path}/sortOrder")
}

abstract class SheetFieldEmbeddedObjectBorder(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
}

abstract class SheetFieldEmbeddedObjectPosition(private val path: String) : FieldsList<SheetField>(path) {
	val newSheet: FieldsList<SheetField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : SheetFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
}

abstract class SheetFieldChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val altText: FieldsList<SheetField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : SheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : SheetFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : SheetFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : SheetFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : SheetFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : SheetFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<SheetField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<SheetField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : SheetFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<SheetField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : SheetFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : SheetFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : SheetFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : SheetFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<SheetField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : SheetFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : SheetFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<SheetField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : SheetFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : SheetFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : SheetFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : SheetFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class SheetFieldDimensionRange(private val path: String) : FieldsList<SheetField>(path) {
	val dimension: FieldsList<SheetField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<SheetField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<SheetField> get() = fieldsList("${path}/startIndex")
}

abstract class SheetFieldBooleanRule(private val path: String) : FieldsList<SheetField>(path) {
	val condition by lazy { object : SheetFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : SheetFieldCellFormat("${path}/format") {} }
}

abstract class SheetFieldGradientRule(private val path: String) : FieldsList<SheetField>(path) {
	val maxpoint by lazy { object : SheetFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : SheetFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : SheetFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class SheetFieldDimensionProperties(private val path: String) : FieldsList<SheetField>(path) {
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : SheetFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<SheetField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<SheetField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<SheetField> get() = fieldsList("${path}/pixelSize")
}

abstract class SheetFieldRowData(private val path: String) : FieldsList<SheetField>(path) {
	val values by lazy { object : SheetFieldCellData("${path}/values") {} }
}

abstract class SheetFieldDeveloperMetadataLocation(private val path: String) : FieldsList<SheetField>(path) {
	val dimensionRange by lazy { object : SheetFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<SheetField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<SheetField> get() = fieldsList("${path}/spreadsheet")
}

abstract class SheetFieldDataSourceSheetProperties(private val path: String) : FieldsList<SheetField>(path) {
	val columns by lazy { object : SheetFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : SheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SheetFieldGridProperties(private val path: String) : FieldsList<SheetField>(path) {
	val columnCount: FieldsList<SheetField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<SheetField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<SheetField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<SheetField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<SheetField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<SheetField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<SheetField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class SheetFieldColor(private val path: String) : FieldsList<SheetField>(path) {
	val alpha: FieldsList<SheetField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SheetField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SheetField> get() = fieldsList("${path}/green")
	val red: FieldsList<SheetField> get() = fieldsList("${path}/red")
}

abstract class SheetFieldColorStyle(private val path: String) : FieldsList<SheetField>(path) {
	val rgbColor by lazy { object : SheetFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SheetField> get() = fieldsList("${path}/themeColor")
}

abstract class SheetFieldEditors(private val path: String) : FieldsList<SheetField>(path) {
	val domainUsersCanEdit: FieldsList<SheetField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<SheetField> get() = fieldsList("${path}/groups")
	val users: FieldsList<SheetField> get() = fieldsList("${path}/users")
}

abstract class SheetFieldSlicerSpec(private val path: String) : FieldsList<SheetField>(path) {
	val applyToPivotTables: FieldsList<SheetField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : SheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<SheetField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : SheetFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : SheetFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<SheetField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<SheetField> get() = fieldsList("${path}/title")
}

abstract class SheetFieldBooleanCondition(private val path: String) : FieldsList<SheetField>(path) {
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
	val values by lazy { object : SheetFieldConditionValue("${path}/values") {} }
}

abstract class SheetFieldDataSourceColumnReference(private val path: String) : FieldsList<SheetField>(path) {
	val name: FieldsList<SheetField> get() = fieldsList("${path}/name")
}

abstract class SheetFieldOverlayPosition(private val path: String) : FieldsList<SheetField>(path) {
	val anchorCell by lazy { object : SheetFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<SheetField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<SheetField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<SheetField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<SheetField> get() = fieldsList("${path}/widthPixels")
}

abstract class SheetFieldBasicChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val axis by lazy { object : SheetFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<SheetField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<SheetField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : SheetFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<SheetField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<SheetField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<SheetField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<SheetField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : SheetFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<SheetField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<SheetField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : SheetFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class SheetFieldBubbleChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val bubbleBorderColor by lazy { object : SheetFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : SheetFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : SheetFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<SheetField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<SheetField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<SheetField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : SheetFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : SheetFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : SheetFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : SheetFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<SheetField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : SheetFieldChartData("${path}/series") {} }
}

abstract class SheetFieldCandlestickChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val data by lazy { object : SheetFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : SheetFieldCandlestickDomain("${path}/domain") {} }
}

abstract class SheetFieldDataSourceChartProperties(private val path: String) : FieldsList<SheetField>(path) {
	val dataExecutionStatus by lazy { object : SheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SheetFieldHistogramChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val bucketSize: FieldsList<SheetField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<SheetField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<SheetField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : SheetFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<SheetField> get() = fieldsList("${path}/showItemDividers")
}

abstract class SheetFieldOrgChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val labels by lazy { object : SheetFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : SheetFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : SheetFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<SheetField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : SheetFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : SheetFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : SheetFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : SheetFieldChartData("${path}/tooltips") {} }
}

abstract class SheetFieldPieChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val domain by lazy { object : SheetFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<SheetField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<SheetField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : SheetFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<SheetField> get() = fieldsList("${path}/threeDimensional")
}

abstract class SheetFieldScorecardChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val aggregateType: FieldsList<SheetField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : SheetFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : SheetFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : SheetFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : SheetFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : SheetFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<SheetField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<SheetField> get() = fieldsList("${path}/scaleFactor")
}

abstract class SheetFieldTextFormat(private val path: String) : FieldsList<SheetField>(path) {
	val bold: FieldsList<SheetField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<SheetField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<SheetField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : SheetFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<SheetField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SheetFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<SheetField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SheetField> get() = fieldsList("${path}/underline")
}

abstract class SheetFieldTextPosition(private val path: String) : FieldsList<SheetField>(path) {
	val horizontalAlignment: FieldsList<SheetField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class SheetFieldTreemapChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val colorData by lazy { object : SheetFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : SheetFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : SheetFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : SheetFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<SheetField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<SheetField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : SheetFieldChartData("${path}/labels") {} }
	val levels: FieldsList<SheetField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<SheetField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<SheetField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : SheetFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : SheetFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SheetFieldWaterfallChartSpec(private val path: String) : FieldsList<SheetField>(path) {
	val connectorLineStyle by lazy { object : SheetFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : SheetFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<SheetField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<SheetField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : SheetFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<SheetField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : SheetFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class SheetFieldCellFormat(private val path: String) : FieldsList<SheetField>(path) {
	val backgroundColor by lazy { object : SheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : SheetFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<SheetField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<SheetField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : SheetFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : SheetFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<SheetField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : SheetFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<SheetField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<SheetField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class SheetFieldInterpolationPoint(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
	val value: FieldsList<SheetField> get() = fieldsList("${path}/value")
}

abstract class SheetFieldCellData(private val path: String) : FieldsList<SheetField>(path) {
	val dataSourceFormula by lazy { object : SheetFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : SheetFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : SheetFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : SheetFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : SheetFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<SheetField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<SheetField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<SheetField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : SheetFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : SheetFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : SheetFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : SheetFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class SheetFieldDataSourceColumn(private val path: String) : FieldsList<SheetField>(path) {
	val formula: FieldsList<SheetField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : SheetFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class SheetFieldDataExecutionStatus(private val path: String) : FieldsList<SheetField>(path) {
	val errorCode: FieldsList<SheetField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<SheetField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<SheetField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<SheetField> get() = fieldsList("${path}/state")
}

abstract class SheetFieldConditionValue(private val path: String) : FieldsList<SheetField>(path) {
	val relativeDate: FieldsList<SheetField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SheetField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class SheetFieldGridCoordinate(private val path: String) : FieldsList<SheetField>(path) {
	val columnIndex: FieldsList<SheetField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<SheetField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<SheetField> get() = fieldsList("${path}/sheetId")
}

abstract class SheetFieldBasicChartAxis(private val path: String) : FieldsList<SheetField>(path) {
	val format by lazy { object : SheetFieldTextFormat("${path}/format") {} }
	val position: FieldsList<SheetField> get() = fieldsList("${path}/position")
	val title: FieldsList<SheetField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : SheetFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : SheetFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class SheetFieldBasicChartDomain(private val path: String) : FieldsList<SheetField>(path) {
	val domain by lazy { object : SheetFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<SheetField> get() = fieldsList("${path}/reversed")
}

abstract class SheetFieldBasicChartSeries(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : SheetFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : SheetFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : SheetFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : SheetFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : SheetFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<SheetField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldDataLabel(private val path: String) : FieldsList<SheetField>(path) {
	val customLabelData by lazy { object : SheetFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<SheetField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldChartData(private val path: String) : FieldsList<SheetField>(path) {
	val aggregateType: FieldsList<SheetField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : SheetFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : SheetFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class SheetFieldCandlestickData(private val path: String) : FieldsList<SheetField>(path) {
	val closeSeries by lazy { object : SheetFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : SheetFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : SheetFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : SheetFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class SheetFieldCandlestickDomain(private val path: String) : FieldsList<SheetField>(path) {
	val data by lazy { object : SheetFieldChartData("${path}/data") {} }
	val reversed: FieldsList<SheetField> get() = fieldsList("${path}/reversed")
}

abstract class SheetFieldHistogramSeries(private val path: String) : FieldsList<SheetField>(path) {
	val barColor by lazy { object : SheetFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : SheetFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : SheetFieldChartData("${path}/data") {} }
}

abstract class SheetFieldBaselineValueFormat(private val path: String) : FieldsList<SheetField>(path) {
	val comparisonType: FieldsList<SheetField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<SheetField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : SheetFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : SheetFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : SheetFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : SheetFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : SheetFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SheetFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<SheetField>(path) {
	val prefix: FieldsList<SheetField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<SheetField> get() = fieldsList("${path}/suffix")
}

abstract class SheetFieldKeyValueFormat(private val path: String) : FieldsList<SheetField>(path) {
	val position by lazy { object : SheetFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : SheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SheetFieldLink(private val path: String) : FieldsList<SheetField>(path) {
	val uri: FieldsList<SheetField> get() = fieldsList("${path}/uri")
}

abstract class SheetFieldTreemapChartColorScale(private val path: String) : FieldsList<SheetField>(path) {
	val maxValueColor by lazy { object : SheetFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : SheetFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : SheetFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : SheetFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : SheetFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : SheetFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : SheetFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : SheetFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class SheetFieldLineStyle(private val path: String) : FieldsList<SheetField>(path) {
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
	val width: FieldsList<SheetField> get() = fieldsList("${path}/width")
}

abstract class SheetFieldWaterfallChartDomain(private val path: String) : FieldsList<SheetField>(path) {
	val data by lazy { object : SheetFieldChartData("${path}/data") {} }
	val reversed: FieldsList<SheetField> get() = fieldsList("${path}/reversed")
}

abstract class SheetFieldWaterfallChartSeries(private val path: String) : FieldsList<SheetField>(path) {
	val customSubtotals by lazy { object : SheetFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : SheetFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : SheetFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<SheetField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : SheetFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : SheetFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : SheetFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class SheetFieldBorders(private val path: String) : FieldsList<SheetField>(path) {
	val bottom by lazy { object : SheetFieldBorder("${path}/bottom") {} }
	val left by lazy { object : SheetFieldBorder("${path}/left") {} }
	val right by lazy { object : SheetFieldBorder("${path}/right") {} }
	val top by lazy { object : SheetFieldBorder("${path}/top") {} }
}

abstract class SheetFieldNumberFormat(private val path: String) : FieldsList<SheetField>(path) {
	val pattern: FieldsList<SheetField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldPadding(private val path: String) : FieldsList<SheetField>(path) {
	val bottom: FieldsList<SheetField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<SheetField> get() = fieldsList("${path}/left")
	val right: FieldsList<SheetField> get() = fieldsList("${path}/right")
	val top: FieldsList<SheetField> get() = fieldsList("${path}/top")
}

abstract class SheetFieldTextRotation(private val path: String) : FieldsList<SheetField>(path) {
	val angle: FieldsList<SheetField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<SheetField> get() = fieldsList("${path}/vertical")
}

abstract class SheetFieldDataSourceFormula(private val path: String) : FieldsList<SheetField>(path) {
	val dataExecutionStatus by lazy { object : SheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SheetFieldDataSourceTable(private val path: String) : FieldsList<SheetField>(path) {
	val columnSelectionType: FieldsList<SheetField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : SheetFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : SheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : SheetFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<SheetField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : SheetFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class SheetFieldDataValidationRule(private val path: String) : FieldsList<SheetField>(path) {
	val condition by lazy { object : SheetFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<SheetField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<SheetField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<SheetField> get() = fieldsList("${path}/strict")
}

abstract class SheetFieldExtendedValue(private val path: String) : FieldsList<SheetField>(path) {
	val boolValue: FieldsList<SheetField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : SheetFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<SheetField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<SheetField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<SheetField> get() = fieldsList("${path}/stringValue")
}

abstract class SheetFieldPivotTable(private val path: String) : FieldsList<SheetField>(path) {
	val columns by lazy { object : SheetFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : SheetFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : SheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : SheetFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : SheetFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : SheetFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<SheetField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : SheetFieldPivotValue("${path}/values") {} }
}

abstract class SheetFieldTextFormatRun(private val path: String) : FieldsList<SheetField>(path) {
	val format by lazy { object : SheetFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<SheetField> get() = fieldsList("${path}/startIndex")
}

abstract class SheetFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<SheetField>(path) {
	val viewWindowMax: FieldsList<SheetField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<SheetField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<SheetField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class SheetFieldPointStyle(private val path: String) : FieldsList<SheetField>(path) {
	val shape: FieldsList<SheetField> get() = fieldsList("${path}/shape")
	val size: FieldsList<SheetField> get() = fieldsList("${path}/size")
}

abstract class SheetFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<SheetField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : SheetFieldPointStyle("${path}/pointStyle") {} }
}

abstract class SheetFieldChartGroupRule(private val path: String) : FieldsList<SheetField>(path) {
	val dateTimeRule by lazy { object : SheetFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : SheetFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class SheetFieldChartSourceRange(private val path: String) : FieldsList<SheetField>(path) {
	val sources by lazy { object : SheetFieldGridRange("${path}/sources") {} }
}

abstract class SheetFieldCandlestickSeries(private val path: String) : FieldsList<SheetField>(path) {
	val data by lazy { object : SheetFieldChartData("${path}/data") {} }
}

abstract class SheetFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<SheetField>(path) {
	val dataIsSubtotal: FieldsList<SheetField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<SheetField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<SheetField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class SheetFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<SheetField> get() = fieldsList("${path}/label")
}

abstract class SheetFieldBorder(private val path: String) : FieldsList<SheetField>(path) {
	val color by lazy { object : SheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SheetFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<SheetField> get() = fieldsList("${path}/style")
	val width: FieldsList<SheetField> get() = fieldsList("${path}/width")
}

abstract class SheetFieldErrorValue(private val path: String) : FieldsList<SheetField>(path) {
	val message: FieldsList<SheetField> get() = fieldsList("${path}/message")
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldPivotGroup(private val path: String) : FieldsList<SheetField>(path) {
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : SheetFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : SheetFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<SheetField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<SheetField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<SheetField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<SheetField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<SheetField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : SheetFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : SheetFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class SheetFieldPivotFilterCriteria(private val path: String) : FieldsList<SheetField>(path) {
	val condition by lazy { object : SheetFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<SheetField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<SheetField> get() = fieldsList("${path}/visibleValues")
}

abstract class SheetFieldPivotFilterSpec(private val path: String) : FieldsList<SheetField>(path) {
	val columnOffsetIndex: FieldsList<SheetField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : SheetFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class SheetFieldPivotValue(private val path: String) : FieldsList<SheetField>(path) {
	val calculatedDisplayType: FieldsList<SheetField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : SheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<SheetField> get() = fieldsList("${path}/formula")
	val name: FieldsList<SheetField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<SheetField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<SheetField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class SheetFieldChartDateTimeRule(private val path: String) : FieldsList<SheetField>(path) {
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldChartHistogramRule(private val path: String) : FieldsList<SheetField>(path) {
	val intervalSize: FieldsList<SheetField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<SheetField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<SheetField> get() = fieldsList("${path}/minValue")
}

abstract class SheetFieldPivotGroupLimit(private val path: String) : FieldsList<SheetField>(path) {
	val applyOrder: FieldsList<SheetField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<SheetField> get() = fieldsList("${path}/countLimit")
}

abstract class SheetFieldPivotGroupRule(private val path: String) : FieldsList<SheetField>(path) {
	val dateTimeRule by lazy { object : SheetFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : SheetFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : SheetFieldManualRule("${path}/manualRule") {} }
}

abstract class SheetFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<SheetField>(path) {
	val buckets by lazy { object : SheetFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<SheetField> get() = fieldsList("${path}/valuesIndex")
}

abstract class SheetFieldPivotGroupValueMetadata(private val path: String) : FieldsList<SheetField>(path) {
	val collapsed: FieldsList<SheetField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : SheetFieldExtendedValue("${path}/value") {} }
}

abstract class SheetFieldDateTimeRule(private val path: String) : FieldsList<SheetField>(path) {
	val type: FieldsList<SheetField> get() = fieldsList("${path}/type")
}

abstract class SheetFieldHistogramRule(private val path: String) : FieldsList<SheetField>(path) {
	val end: FieldsList<SheetField> get() = fieldsList("${path}/end")
	val interval: FieldsList<SheetField> get() = fieldsList("${path}/interval")
	val start: FieldsList<SheetField> get() = fieldsList("${path}/start")
}

abstract class SheetFieldManualRule(private val path: String) : FieldsList<SheetField>(path) {
	val groups by lazy { object : SheetFieldManualRuleGroup("${path}/groups") {} }
}

abstract class SheetFieldManualRuleGroup(private val path: String) : FieldsList<SheetField>(path) {
	val groupName by lazy { object : SheetFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : SheetFieldExtendedValue("${path}/items") {} }
}

