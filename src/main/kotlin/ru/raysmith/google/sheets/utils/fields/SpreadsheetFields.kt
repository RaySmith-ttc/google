package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SpreadsheetField : Field

object SpreadsheetFields {
    val ALL: FieldsList<SpreadsheetField> = fieldsList("*")
	val dataSourceSchedules = object : SpreadsheetFieldDataSourceRefreshSchedule("dataSourceSchedules") {}
	val dataSources = object : SpreadsheetFieldDataSource("dataSources") {}
	val developerMetadata = object : SpreadsheetFieldDeveloperMetadata("developerMetadata") {}
	val namedRanges = object : SpreadsheetFieldNamedRange("namedRanges") {}
	val properties = object : SpreadsheetFieldSpreadsheetProperties("properties") {}
	val sheets = object : SpreadsheetFieldSheet("sheets") {}
	val spreadsheetId: FieldsList<SpreadsheetField> get() = fieldsList("spreadsheetId")
	val spreadsheetUrl: FieldsList<SpreadsheetField> get() = fieldsList("spreadsheetUrl")
}

abstract class SpreadsheetFieldDataSourceRefreshSchedule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dailySchedule by lazy { object : SpreadsheetFieldDataSourceRefreshDailySchedule("${path}/dailySchedule") {} }
	val enabled: FieldsList<SpreadsheetField> get() = fieldsList("${path}/enabled")
	val monthlySchedule by lazy { object : SpreadsheetFieldDataSourceRefreshMonthlySchedule("${path}/monthlySchedule") {} }
	val nextRun by lazy { object : SpreadsheetFieldInterval("${path}/nextRun") {} }
	val refreshScope: FieldsList<SpreadsheetField> get() = fieldsList("${path}/refreshScope")
	val weeklySchedule by lazy { object : SpreadsheetFieldDataSourceRefreshWeeklySchedule("${path}/weeklySchedule") {} }
}

abstract class SpreadsheetFieldDataSource(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val calculatedColumns by lazy { object : SpreadsheetFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : SpreadsheetFieldDataSourceSpec("${path}/spec") {} }
}

abstract class SpreadsheetFieldDeveloperMetadata(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val location by lazy { object : SpreadsheetFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<SpreadsheetField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<SpreadsheetField> get() = fieldsList("${path}/visibility")
}

abstract class SpreadsheetFieldNamedRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val name: FieldsList<SpreadsheetField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
}

abstract class SpreadsheetFieldSpreadsheetProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val autoRecalc: FieldsList<SpreadsheetField> get() = fieldsList("${path}/autoRecalc")
	val defaultFormat by lazy { object : SpreadsheetFieldCellFormat("${path}/defaultFormat") {} }
	val importFunctionsExternalUrlAccessAllowed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings by lazy { object : SpreadsheetFieldIterativeCalculationSettings("${path}/iterativeCalculationSettings") {} }
	val locale: FieldsList<SpreadsheetField> get() = fieldsList("${path}/locale")
	val spreadsheetTheme by lazy { object : SpreadsheetFieldSpreadsheetTheme("${path}/spreadsheetTheme") {} }
	val timeZone: FieldsList<SpreadsheetField> get() = fieldsList("${path}/timeZone")
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
}

abstract class SpreadsheetFieldSheet(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bandedRanges by lazy { object : SpreadsheetFieldBandedRange("${path}/bandedRanges") {} }
	val basicFilter by lazy { object : SpreadsheetFieldBasicFilter("${path}/basicFilter") {} }
	val charts by lazy { object : SpreadsheetFieldEmbeddedChart("${path}/charts") {} }
	val columnGroups by lazy { object : SpreadsheetFieldDimensionGroup("${path}/columnGroups") {} }
	val conditionalFormats by lazy { object : SpreadsheetFieldConditionalFormatRule("${path}/conditionalFormats") {} }
	val data by lazy { object : SpreadsheetFieldGridData("${path}/data") {} }
	val developerMetadata by lazy { object : SpreadsheetFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val filterViews by lazy { object : SpreadsheetFieldFilterView("${path}/filterViews") {} }
	val merges by lazy { object : SpreadsheetFieldGridRange("${path}/merges") {} }
	val properties by lazy { object : SpreadsheetFieldSheetProperties("${path}/properties") {} }
	val protectedRanges by lazy { object : SpreadsheetFieldProtectedRange("${path}/protectedRanges") {} }
	val rowGroups by lazy { object : SpreadsheetFieldDimensionGroup("${path}/rowGroups") {} }
	val slicers by lazy { object : SpreadsheetFieldSlicer("${path}/slicers") {} }
}

abstract class SpreadsheetFieldDataSourceRefreshDailySchedule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val startTime by lazy { object : SpreadsheetFieldTimeOfDay("${path}/startTime") {} }
}

abstract class SpreadsheetFieldDataSourceRefreshMonthlySchedule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val daysOfMonth: FieldsList<SpreadsheetField> get() = fieldsList("${path}/daysOfMonth")
	val startTime by lazy { object : SpreadsheetFieldTimeOfDay("${path}/startTime") {} }
}

abstract class SpreadsheetFieldInterval(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val endTime: FieldsList<SpreadsheetField> get() = fieldsList("${path}/endTime")
	val startTime: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startTime")
}

abstract class SpreadsheetFieldDataSourceRefreshWeeklySchedule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val daysOfWeek: FieldsList<SpreadsheetField> get() = fieldsList("${path}/daysOfWeek")
	val startTime by lazy { object : SpreadsheetFieldTimeOfDay("${path}/startTime") {} }
}

abstract class SpreadsheetFieldDataSourceColumn(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val formula: FieldsList<SpreadsheetField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class SpreadsheetFieldDataSourceSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bigQuery by lazy { object : SpreadsheetFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : SpreadsheetFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : SpreadsheetFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class SpreadsheetFieldDeveloperMetadataLocation(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dimensionRange by lazy { object : SpreadsheetFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<SpreadsheetField> get() = fieldsList("${path}/spreadsheet")
}

abstract class SpreadsheetFieldGridRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val endColumnIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SpreadsheetFieldCellFormat(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val backgroundColor by lazy { object : SpreadsheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : SpreadsheetFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<SpreadsheetField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : SpreadsheetFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : SpreadsheetFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<SpreadsheetField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : SpreadsheetFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<SpreadsheetField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<SpreadsheetField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class SpreadsheetFieldIterativeCalculationSettings(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val convergenceThreshold: FieldsList<SpreadsheetField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<SpreadsheetField> get() = fieldsList("${path}/maxIterations")
}

abstract class SpreadsheetFieldSpreadsheetTheme(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val primaryFontFamily: FieldsList<SpreadsheetField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : SpreadsheetFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class SpreadsheetFieldBandedRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bandedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : SpreadsheetFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : SpreadsheetFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class SpreadsheetFieldBasicFilter(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val criteria by lazy { object : SpreadsheetFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : SpreadsheetFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : SpreadsheetFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class SpreadsheetFieldEmbeddedChart(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val border by lazy { object : SpreadsheetFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : SpreadsheetFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : SpreadsheetFieldChartSpec("${path}/spec") {} }
}

abstract class SpreadsheetFieldDimensionGroup(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val collapsed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<SpreadsheetField> get() = fieldsList("${path}/depth")
	val range by lazy { object : SpreadsheetFieldDimensionRange("${path}/range") {} }
}

abstract class SpreadsheetFieldConditionalFormatRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val booleanRule by lazy { object : SpreadsheetFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : SpreadsheetFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : SpreadsheetFieldGridRange("${path}/ranges") {} }
}

abstract class SpreadsheetFieldGridData(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnMetadata by lazy { object : SpreadsheetFieldDimensionProperties("${path}/columnMetadata") {} }
	val rowData by lazy { object : SpreadsheetFieldRowData("${path}/rowData") {} }
	val rowMetadata by lazy { object : SpreadsheetFieldDimensionProperties("${path}/rowMetadata") {} }
	val startColumn: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startColumn")
	val startRow: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startRow")
}

abstract class SpreadsheetFieldFilterView(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val criteria by lazy { object : SpreadsheetFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : SpreadsheetFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : SpreadsheetFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
}

abstract class SpreadsheetFieldSheetProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataSourceSheetProperties by lazy { object : SpreadsheetFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : SpreadsheetFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<SpreadsheetField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : SpreadsheetFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
}

abstract class SpreadsheetFieldProtectedRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val description: FieldsList<SpreadsheetField> get() = fieldsList("${path}/description")
	val editors by lazy { object : SpreadsheetFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<SpreadsheetField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : SpreadsheetFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<SpreadsheetField> get() = fieldsList("${path}/warningOnly")
}

abstract class SpreadsheetFieldSlicer(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val position by lazy { object : SpreadsheetFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : SpreadsheetFieldSlicerSpec("${path}/spec") {} }
}

abstract class SpreadsheetFieldTimeOfDay(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val hours: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<SpreadsheetField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<SpreadsheetField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<SpreadsheetField> get() = fieldsList("${path}/seconds")
}

abstract class SpreadsheetFieldDataSourceColumnReference(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val name: FieldsList<SpreadsheetField> get() = fieldsList("${path}/name")
}

abstract class SpreadsheetFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val projectId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : SpreadsheetFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : SpreadsheetFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class SpreadsheetFieldLookerDataSourceSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val explore: FieldsList<SpreadsheetField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<SpreadsheetField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<SpreadsheetField> get() = fieldsList("${path}/model")
}

abstract class SpreadsheetFieldDataSourceParameter(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val name: FieldsList<SpreadsheetField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : SpreadsheetFieldGridRange("${path}/range") {} }
}

abstract class SpreadsheetFieldDimensionRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dimension: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startIndex")
}

abstract class SpreadsheetFieldColor(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val alpha: FieldsList<SpreadsheetField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SpreadsheetField> get() = fieldsList("${path}/green")
	val red: FieldsList<SpreadsheetField> get() = fieldsList("${path}/red")
}

abstract class SpreadsheetFieldColorStyle(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val rgbColor by lazy { object : SpreadsheetFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SpreadsheetField> get() = fieldsList("${path}/themeColor")
}

abstract class SpreadsheetFieldBorders(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bottom by lazy { object : SpreadsheetFieldBorder("${path}/bottom") {} }
	val left by lazy { object : SpreadsheetFieldBorder("${path}/left") {} }
	val right by lazy { object : SpreadsheetFieldBorder("${path}/right") {} }
	val top by lazy { object : SpreadsheetFieldBorder("${path}/top") {} }
}

abstract class SpreadsheetFieldNumberFormat(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val pattern: FieldsList<SpreadsheetField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldPadding(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bottom: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<SpreadsheetField> get() = fieldsList("${path}/left")
	val right: FieldsList<SpreadsheetField> get() = fieldsList("${path}/right")
	val top: FieldsList<SpreadsheetField> get() = fieldsList("${path}/top")
}

abstract class SpreadsheetFieldTextFormat(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bold: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<SpreadsheetField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : SpreadsheetFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<SpreadsheetField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SpreadsheetFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<SpreadsheetField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SpreadsheetField> get() = fieldsList("${path}/underline")
}

abstract class SpreadsheetFieldTextRotation(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val angle: FieldsList<SpreadsheetField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<SpreadsheetField> get() = fieldsList("${path}/vertical")
}

abstract class SpreadsheetFieldThemeColorPair(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/colorType")
}

abstract class SpreadsheetFieldBandingProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val firstBandColor by lazy { object : SpreadsheetFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : SpreadsheetFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : SpreadsheetFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : SpreadsheetFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class SpreadsheetFieldFilterCriteria(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val condition by lazy { object : SpreadsheetFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : SpreadsheetFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : SpreadsheetFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class SpreadsheetFieldFilterSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : SpreadsheetFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class SpreadsheetFieldSortSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val backgroundColor by lazy { object : SpreadsheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : SpreadsheetFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sortOrder")
}

abstract class SpreadsheetFieldEmbeddedObjectBorder(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
}

abstract class SpreadsheetFieldEmbeddedObjectPosition(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val newSheet: FieldsList<SpreadsheetField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : SpreadsheetFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
}

abstract class SpreadsheetFieldChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val altText: FieldsList<SpreadsheetField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : SpreadsheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : SpreadsheetFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : SpreadsheetFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : SpreadsheetFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : SpreadsheetFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : SpreadsheetFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<SpreadsheetField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : SpreadsheetFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<SpreadsheetField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : SpreadsheetFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : SpreadsheetFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : SpreadsheetFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : SpreadsheetFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<SpreadsheetField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : SpreadsheetFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : SpreadsheetFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : SpreadsheetFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : SpreadsheetFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class SpreadsheetFieldBooleanRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val condition by lazy { object : SpreadsheetFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : SpreadsheetFieldCellFormat("${path}/format") {} }
}

abstract class SpreadsheetFieldGradientRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val maxpoint by lazy { object : SpreadsheetFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : SpreadsheetFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : SpreadsheetFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class SpreadsheetFieldDimensionProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : SpreadsheetFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/pixelSize")
}

abstract class SpreadsheetFieldRowData(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val values by lazy { object : SpreadsheetFieldCellData("${path}/values") {} }
}

abstract class SpreadsheetFieldDataSourceSheetProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columns by lazy { object : SpreadsheetFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : SpreadsheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SpreadsheetFieldGridProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnCount: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<SpreadsheetField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<SpreadsheetField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class SpreadsheetFieldEditors(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val domainUsersCanEdit: FieldsList<SpreadsheetField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<SpreadsheetField> get() = fieldsList("${path}/groups")
	val users: FieldsList<SpreadsheetField> get() = fieldsList("${path}/users")
}

abstract class SpreadsheetFieldSlicerSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val applyToPivotTables: FieldsList<SpreadsheetField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : SpreadsheetFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : SpreadsheetFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : SpreadsheetFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<SpreadsheetField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
}

abstract class SpreadsheetFieldBigQueryQuerySpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val rawQuery: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rawQuery")
}

abstract class SpreadsheetFieldBigQueryTableSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val datasetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/tableProjectId")
}

abstract class SpreadsheetFieldBorder(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<SpreadsheetField> get() = fieldsList("${path}/style")
	val width: FieldsList<SpreadsheetField> get() = fieldsList("${path}/width")
}

abstract class SpreadsheetFieldLink(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val uri: FieldsList<SpreadsheetField> get() = fieldsList("${path}/uri")
}

abstract class SpreadsheetFieldBooleanCondition(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
	val values by lazy { object : SpreadsheetFieldConditionValue("${path}/values") {} }
}

abstract class SpreadsheetFieldOverlayPosition(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val anchorCell by lazy { object : SpreadsheetFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/widthPixels")
}

abstract class SpreadsheetFieldBasicChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val axis by lazy { object : SpreadsheetFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<SpreadsheetField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : SpreadsheetFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<SpreadsheetField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<SpreadsheetField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<SpreadsheetField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<SpreadsheetField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : SpreadsheetFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<SpreadsheetField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : SpreadsheetFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class SpreadsheetFieldBubbleChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bubbleBorderColor by lazy { object : SpreadsheetFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : SpreadsheetFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : SpreadsheetFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : SpreadsheetFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : SpreadsheetFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : SpreadsheetFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<SpreadsheetField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : SpreadsheetFieldChartData("${path}/series") {} }
}

abstract class SpreadsheetFieldCandlestickChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val data by lazy { object : SpreadsheetFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : SpreadsheetFieldCandlestickDomain("${path}/domain") {} }
}

abstract class SpreadsheetFieldDataSourceChartProperties(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataExecutionStatus by lazy { object : SpreadsheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SpreadsheetFieldHistogramChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val bucketSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<SpreadsheetField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<SpreadsheetField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : SpreadsheetFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<SpreadsheetField> get() = fieldsList("${path}/showItemDividers")
}

abstract class SpreadsheetFieldOrgChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val labels by lazy { object : SpreadsheetFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : SpreadsheetFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : SpreadsheetFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : SpreadsheetFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : SpreadsheetFieldChartData("${path}/tooltips") {} }
}

abstract class SpreadsheetFieldPieChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val domain by lazy { object : SpreadsheetFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<SpreadsheetField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<SpreadsheetField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : SpreadsheetFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<SpreadsheetField> get() = fieldsList("${path}/threeDimensional")
}

abstract class SpreadsheetFieldScorecardChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val aggregateType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : SpreadsheetFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : SpreadsheetFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : SpreadsheetFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : SpreadsheetFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : SpreadsheetFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<SpreadsheetField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<SpreadsheetField> get() = fieldsList("${path}/scaleFactor")
}

abstract class SpreadsheetFieldTextPosition(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val horizontalAlignment: FieldsList<SpreadsheetField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class SpreadsheetFieldTreemapChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val colorData by lazy { object : SpreadsheetFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : SpreadsheetFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : SpreadsheetFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : SpreadsheetFieldChartData("${path}/labels") {} }
	val levels: FieldsList<SpreadsheetField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : SpreadsheetFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : SpreadsheetFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SpreadsheetFieldWaterfallChartSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val connectorLineStyle by lazy { object : SpreadsheetFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : SpreadsheetFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<SpreadsheetField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : SpreadsheetFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : SpreadsheetFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class SpreadsheetFieldInterpolationPoint(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
	val value: FieldsList<SpreadsheetField> get() = fieldsList("${path}/value")
}

abstract class SpreadsheetFieldCellData(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataSourceFormula by lazy { object : SpreadsheetFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : SpreadsheetFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : SpreadsheetFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : SpreadsheetFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : SpreadsheetFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<SpreadsheetField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : SpreadsheetFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : SpreadsheetFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : SpreadsheetFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : SpreadsheetFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class SpreadsheetFieldDataExecutionStatus(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val errorCode: FieldsList<SpreadsheetField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<SpreadsheetField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<SpreadsheetField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<SpreadsheetField> get() = fieldsList("${path}/state")
}

abstract class SpreadsheetFieldConditionValue(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val relativeDate: FieldsList<SpreadsheetField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class SpreadsheetFieldGridCoordinate(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sheetId")
}

abstract class SpreadsheetFieldBasicChartAxis(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val format by lazy { object : SpreadsheetFieldTextFormat("${path}/format") {} }
	val position: FieldsList<SpreadsheetField> get() = fieldsList("${path}/position")
	val title: FieldsList<SpreadsheetField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : SpreadsheetFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : SpreadsheetFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class SpreadsheetFieldBasicChartDomain(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val domain by lazy { object : SpreadsheetFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/reversed")
}

abstract class SpreadsheetFieldBasicChartSeries(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : SpreadsheetFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : SpreadsheetFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : SpreadsheetFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : SpreadsheetFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : SpreadsheetFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<SpreadsheetField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldDataLabel(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val customLabelData by lazy { object : SpreadsheetFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<SpreadsheetField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldChartData(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val aggregateType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : SpreadsheetFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : SpreadsheetFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class SpreadsheetFieldCandlestickData(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val closeSeries by lazy { object : SpreadsheetFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : SpreadsheetFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : SpreadsheetFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : SpreadsheetFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class SpreadsheetFieldCandlestickDomain(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val data by lazy { object : SpreadsheetFieldChartData("${path}/data") {} }
	val reversed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/reversed")
}

abstract class SpreadsheetFieldHistogramSeries(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val barColor by lazy { object : SpreadsheetFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : SpreadsheetFieldChartData("${path}/data") {} }
}

abstract class SpreadsheetFieldBaselineValueFormat(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val comparisonType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<SpreadsheetField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : SpreadsheetFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : SpreadsheetFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : SpreadsheetFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SpreadsheetFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val prefix: FieldsList<SpreadsheetField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<SpreadsheetField> get() = fieldsList("${path}/suffix")
}

abstract class SpreadsheetFieldKeyValueFormat(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val position by lazy { object : SpreadsheetFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : SpreadsheetFieldTextFormat("${path}/textFormat") {} }
}

abstract class SpreadsheetFieldTreemapChartColorScale(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val maxValueColor by lazy { object : SpreadsheetFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : SpreadsheetFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : SpreadsheetFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : SpreadsheetFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class SpreadsheetFieldLineStyle(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
	val width: FieldsList<SpreadsheetField> get() = fieldsList("${path}/width")
}

abstract class SpreadsheetFieldWaterfallChartDomain(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val data by lazy { object : SpreadsheetFieldChartData("${path}/data") {} }
	val reversed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/reversed")
}

abstract class SpreadsheetFieldWaterfallChartSeries(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val customSubtotals by lazy { object : SpreadsheetFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : SpreadsheetFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : SpreadsheetFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<SpreadsheetField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : SpreadsheetFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : SpreadsheetFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : SpreadsheetFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class SpreadsheetFieldDataSourceFormula(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataExecutionStatus by lazy { object : SpreadsheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SpreadsheetFieldDataSourceTable(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnSelectionType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : SpreadsheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : SpreadsheetFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<SpreadsheetField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : SpreadsheetFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class SpreadsheetFieldDataValidationRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val condition by lazy { object : SpreadsheetFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<SpreadsheetField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<SpreadsheetField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<SpreadsheetField> get() = fieldsList("${path}/strict")
}

abstract class SpreadsheetFieldExtendedValue(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val boolValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : SpreadsheetFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/stringValue")
}

abstract class SpreadsheetFieldPivotTable(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columns by lazy { object : SpreadsheetFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : SpreadsheetFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : SpreadsheetFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : SpreadsheetFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : SpreadsheetFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : SpreadsheetFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<SpreadsheetField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : SpreadsheetFieldPivotValue("${path}/values") {} }
}

abstract class SpreadsheetFieldTextFormatRun(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val format by lazy { object : SpreadsheetFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/startIndex")
}

abstract class SpreadsheetFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val viewWindowMax: FieldsList<SpreadsheetField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<SpreadsheetField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<SpreadsheetField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class SpreadsheetFieldPointStyle(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val shape: FieldsList<SpreadsheetField> get() = fieldsList("${path}/shape")
	val size: FieldsList<SpreadsheetField> get() = fieldsList("${path}/size")
}

abstract class SpreadsheetFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<SpreadsheetField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : SpreadsheetFieldPointStyle("${path}/pointStyle") {} }
}

abstract class SpreadsheetFieldChartGroupRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dateTimeRule by lazy { object : SpreadsheetFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : SpreadsheetFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class SpreadsheetFieldChartSourceRange(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val sources by lazy { object : SpreadsheetFieldGridRange("${path}/sources") {} }
}

abstract class SpreadsheetFieldCandlestickSeries(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val data by lazy { object : SpreadsheetFieldChartData("${path}/data") {} }
}

abstract class SpreadsheetFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataIsSubtotal: FieldsList<SpreadsheetField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<SpreadsheetField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class SpreadsheetFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val color by lazy { object : SpreadsheetFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : SpreadsheetFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<SpreadsheetField> get() = fieldsList("${path}/label")
}

abstract class SpreadsheetFieldErrorValue(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val message: FieldsList<SpreadsheetField> get() = fieldsList("${path}/message")
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldPivotGroup(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : SpreadsheetFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : SpreadsheetFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<SpreadsheetField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<SpreadsheetField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<SpreadsheetField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : SpreadsheetFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : SpreadsheetFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class SpreadsheetFieldPivotFilterCriteria(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val condition by lazy { object : SpreadsheetFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<SpreadsheetField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<SpreadsheetField> get() = fieldsList("${path}/visibleValues")
}

abstract class SpreadsheetFieldPivotFilterSpec(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val columnOffsetIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : SpreadsheetFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class SpreadsheetFieldPivotValue(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val calculatedDisplayType: FieldsList<SpreadsheetField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : SpreadsheetFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<SpreadsheetField> get() = fieldsList("${path}/formula")
	val name: FieldsList<SpreadsheetField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<SpreadsheetField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<SpreadsheetField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class SpreadsheetFieldChartDateTimeRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldChartHistogramRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val intervalSize: FieldsList<SpreadsheetField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<SpreadsheetField> get() = fieldsList("${path}/minValue")
}

abstract class SpreadsheetFieldPivotGroupLimit(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val applyOrder: FieldsList<SpreadsheetField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<SpreadsheetField> get() = fieldsList("${path}/countLimit")
}

abstract class SpreadsheetFieldPivotGroupRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val dateTimeRule by lazy { object : SpreadsheetFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : SpreadsheetFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : SpreadsheetFieldManualRule("${path}/manualRule") {} }
}

abstract class SpreadsheetFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val buckets by lazy { object : SpreadsheetFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<SpreadsheetField> get() = fieldsList("${path}/valuesIndex")
}

abstract class SpreadsheetFieldPivotGroupValueMetadata(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val collapsed: FieldsList<SpreadsheetField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : SpreadsheetFieldExtendedValue("${path}/value") {} }
}

abstract class SpreadsheetFieldDateTimeRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val type: FieldsList<SpreadsheetField> get() = fieldsList("${path}/type")
}

abstract class SpreadsheetFieldHistogramRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val end: FieldsList<SpreadsheetField> get() = fieldsList("${path}/end")
	val interval: FieldsList<SpreadsheetField> get() = fieldsList("${path}/interval")
	val start: FieldsList<SpreadsheetField> get() = fieldsList("${path}/start")
}

abstract class SpreadsheetFieldManualRule(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val groups by lazy { object : SpreadsheetFieldManualRuleGroup("${path}/groups") {} }
}

abstract class SpreadsheetFieldManualRuleGroup(private val path: String) : FieldsList<SpreadsheetField>(path) {
	val groupName by lazy { object : SpreadsheetFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : SpreadsheetFieldExtendedValue("${path}/items") {} }
}

