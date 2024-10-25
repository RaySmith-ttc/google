package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ResponseField : Field

object ResponseFields {
    val ALL: FieldsList<ResponseField> = fieldsList("*")
	val addBanding = object : ResponseFieldAddBandingResponse("addBanding") {}
	val addChart = object : ResponseFieldAddChartResponse("addChart") {}
	val addDataSource = object : ResponseFieldAddDataSourceResponse("addDataSource") {}
	val addDimensionGroup = object : ResponseFieldAddDimensionGroupResponse("addDimensionGroup") {}
	val addFilterView = object : ResponseFieldAddFilterViewResponse("addFilterView") {}
	val addNamedRange = object : ResponseFieldAddNamedRangeResponse("addNamedRange") {}
	val addProtectedRange = object : ResponseFieldAddProtectedRangeResponse("addProtectedRange") {}
	val addSheet = object : ResponseFieldAddSheetResponse("addSheet") {}
	val addSlicer = object : ResponseFieldAddSlicerResponse("addSlicer") {}
	val cancelDataSourceRefresh = object : ResponseFieldCancelDataSourceRefreshResponse("cancelDataSourceRefresh") {}
	val createDeveloperMetadata = object : ResponseFieldCreateDeveloperMetadataResponse("createDeveloperMetadata") {}
	val deleteConditionalFormatRule = object : ResponseFieldDeleteConditionalFormatRuleResponse("deleteConditionalFormatRule") {}
	val deleteDeveloperMetadata = object : ResponseFieldDeleteDeveloperMetadataResponse("deleteDeveloperMetadata") {}
	val deleteDimensionGroup = object : ResponseFieldDeleteDimensionGroupResponse("deleteDimensionGroup") {}
	val deleteDuplicates = object : ResponseFieldDeleteDuplicatesResponse("deleteDuplicates") {}
	val duplicateFilterView = object : ResponseFieldDuplicateFilterViewResponse("duplicateFilterView") {}
	val duplicateSheet = object : ResponseFieldDuplicateSheetResponse("duplicateSheet") {}
	val findReplace = object : ResponseFieldFindReplaceResponse("findReplace") {}
	val refreshDataSource = object : ResponseFieldRefreshDataSourceResponse("refreshDataSource") {}
	val trimWhitespace = object : ResponseFieldTrimWhitespaceResponse("trimWhitespace") {}
	val updateConditionalFormatRule = object : ResponseFieldUpdateConditionalFormatRuleResponse("updateConditionalFormatRule") {}
	val updateDataSource = object : ResponseFieldUpdateDataSourceResponse("updateDataSource") {}
	val updateDeveloperMetadata = object : ResponseFieldUpdateDeveloperMetadataResponse("updateDeveloperMetadata") {}
	val updateEmbeddedObjectPosition = object : ResponseFieldUpdateEmbeddedObjectPositionResponse("updateEmbeddedObjectPosition") {}
}

abstract class ResponseFieldAddBandingResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val bandedRange by lazy { object : ResponseFieldBandedRange("${path}/bandedRange") {} }
}

abstract class ResponseFieldAddChartResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val chart by lazy { object : ResponseFieldEmbeddedChart("${path}/chart") {} }
}

abstract class ResponseFieldAddDataSourceResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val dataExecutionStatus by lazy { object : ResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSource by lazy { object : ResponseFieldDataSource("${path}/dataSource") {} }
}

abstract class ResponseFieldAddDimensionGroupResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val dimensionGroups by lazy { object : ResponseFieldDimensionGroup("${path}/dimensionGroups") {} }
}

abstract class ResponseFieldAddFilterViewResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val filter by lazy { object : ResponseFieldFilterView("${path}/filter") {} }
}

abstract class ResponseFieldAddNamedRangeResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val namedRange by lazy { object : ResponseFieldNamedRange("${path}/namedRange") {} }
}

abstract class ResponseFieldAddProtectedRangeResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val protectedRange by lazy { object : ResponseFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class ResponseFieldAddSheetResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val properties by lazy { object : ResponseFieldSheetProperties("${path}/properties") {} }
}

abstract class ResponseFieldAddSlicerResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val slicer by lazy { object : ResponseFieldSlicer("${path}/slicer") {} }
}

abstract class ResponseFieldCancelDataSourceRefreshResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val statuses by lazy { object : ResponseFieldCancelDataSourceRefreshStatus("${path}/statuses") {} }
}

abstract class ResponseFieldCreateDeveloperMetadataResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val developerMetadata by lazy { object : ResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class ResponseFieldDeleteConditionalFormatRuleResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val rule by lazy { object : ResponseFieldConditionalFormatRule("${path}/rule") {} }
}

abstract class ResponseFieldDeleteDeveloperMetadataResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val deletedDeveloperMetadata by lazy { object : ResponseFieldDeveloperMetadata("${path}/deletedDeveloperMetadata") {} }
}

abstract class ResponseFieldDeleteDimensionGroupResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val dimensionGroups by lazy { object : ResponseFieldDimensionGroup("${path}/dimensionGroups") {} }
}

abstract class ResponseFieldDeleteDuplicatesResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val duplicatesRemovedCount: FieldsList<ResponseField> get() = fieldsList("${path}/duplicatesRemovedCount")
}

abstract class ResponseFieldDuplicateFilterViewResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val filter by lazy { object : ResponseFieldFilterView("${path}/filter") {} }
}

abstract class ResponseFieldDuplicateSheetResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val properties by lazy { object : ResponseFieldSheetProperties("${path}/properties") {} }
}

abstract class ResponseFieldFindReplaceResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val formulasChanged: FieldsList<ResponseField> get() = fieldsList("${path}/formulasChanged")
	val occurrencesChanged: FieldsList<ResponseField> get() = fieldsList("${path}/occurrencesChanged")
	val rowsChanged: FieldsList<ResponseField> get() = fieldsList("${path}/rowsChanged")
	val sheetsChanged: FieldsList<ResponseField> get() = fieldsList("${path}/sheetsChanged")
	val valuesChanged: FieldsList<ResponseField> get() = fieldsList("${path}/valuesChanged")
}

abstract class ResponseFieldRefreshDataSourceResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val statuses by lazy { object : ResponseFieldRefreshDataSourceObjectExecutionStatus("${path}/statuses") {} }
}

abstract class ResponseFieldTrimWhitespaceResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val cellsChangedCount: FieldsList<ResponseField> get() = fieldsList("${path}/cellsChangedCount")
}

abstract class ResponseFieldUpdateConditionalFormatRuleResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val newIndex: FieldsList<ResponseField> get() = fieldsList("${path}/newIndex")
	val newRule by lazy { object : ResponseFieldConditionalFormatRule("${path}/newRule") {} }
	val oldIndex: FieldsList<ResponseField> get() = fieldsList("${path}/oldIndex")
	val oldRule by lazy { object : ResponseFieldConditionalFormatRule("${path}/oldRule") {} }
}

abstract class ResponseFieldUpdateDataSourceResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val dataExecutionStatus by lazy { object : ResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSource by lazy { object : ResponseFieldDataSource("${path}/dataSource") {} }
}

abstract class ResponseFieldUpdateDeveloperMetadataResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val developerMetadata by lazy { object : ResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class ResponseFieldUpdateEmbeddedObjectPositionResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val position by lazy { object : ResponseFieldEmbeddedObjectPosition("${path}/position") {} }
}

abstract class ResponseFieldBandedRange(private val path: String) : FieldsList<ResponseField>(path) {
	val bandedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : ResponseFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : ResponseFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : ResponseFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class ResponseFieldEmbeddedChart(private val path: String) : FieldsList<ResponseField>(path) {
	val border by lazy { object : ResponseFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<ResponseField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : ResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : ResponseFieldChartSpec("${path}/spec") {} }
}

abstract class ResponseFieldDataExecutionStatus(private val path: String) : FieldsList<ResponseField>(path) {
	val errorCode: FieldsList<ResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<ResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<ResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<ResponseField> get() = fieldsList("${path}/state")
}

abstract class ResponseFieldDataSource(private val path: String) : FieldsList<ResponseField>(path) {
	val calculatedColumns by lazy { object : ResponseFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<ResponseField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : ResponseFieldDataSourceSpec("${path}/spec") {} }
}

abstract class ResponseFieldDimensionGroup(private val path: String) : FieldsList<ResponseField>(path) {
	val collapsed: FieldsList<ResponseField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<ResponseField> get() = fieldsList("${path}/depth")
	val range by lazy { object : ResponseFieldDimensionRange("${path}/range") {} }
}

abstract class ResponseFieldFilterView(private val path: String) : FieldsList<ResponseField>(path) {
	val criteria by lazy { object : ResponseFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : ResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<ResponseField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : ResponseFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : ResponseFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<ResponseField> get() = fieldsList("${path}/title")
}

abstract class ResponseFieldNamedRange(private val path: String) : FieldsList<ResponseField>(path) {
	val name: FieldsList<ResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : ResponseFieldGridRange("${path}/range") {} }
}

abstract class ResponseFieldProtectedRange(private val path: String) : FieldsList<ResponseField>(path) {
	val description: FieldsList<ResponseField> get() = fieldsList("${path}/description")
	val editors by lazy { object : ResponseFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : ResponseFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<ResponseField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : ResponseFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<ResponseField> get() = fieldsList("${path}/warningOnly")
}

abstract class ResponseFieldSheetProperties(private val path: String) : FieldsList<ResponseField>(path) {
	val dataSourceSheetProperties by lazy { object : ResponseFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : ResponseFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<ResponseField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<ResponseField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<ResponseField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<ResponseField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : ResponseFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : ResponseFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<ResponseField> get() = fieldsList("${path}/title")
}

abstract class ResponseFieldSlicer(private val path: String) : FieldsList<ResponseField>(path) {
	val position by lazy { object : ResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<ResponseField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : ResponseFieldSlicerSpec("${path}/spec") {} }
}

abstract class ResponseFieldCancelDataSourceRefreshStatus(private val path: String) : FieldsList<ResponseField>(path) {
	val reference by lazy { object : ResponseFieldDataSourceObjectReference("${path}/reference") {} }
	val refreshCancellationStatus by lazy { object : ResponseFieldRefreshCancellationStatus("${path}/refreshCancellationStatus") {} }
}

abstract class ResponseFieldDeveloperMetadata(private val path: String) : FieldsList<ResponseField>(path) {
	val location by lazy { object : ResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<ResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<ResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<ResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<ResponseField> get() = fieldsList("${path}/visibility")
}

abstract class ResponseFieldConditionalFormatRule(private val path: String) : FieldsList<ResponseField>(path) {
	val booleanRule by lazy { object : ResponseFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : ResponseFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : ResponseFieldGridRange("${path}/ranges") {} }
}

abstract class ResponseFieldRefreshDataSourceObjectExecutionStatus(private val path: String) : FieldsList<ResponseField>(path) {
	val dataExecutionStatus by lazy { object : ResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val reference by lazy { object : ResponseFieldDataSourceObjectReference("${path}/reference") {} }
}

abstract class ResponseFieldEmbeddedObjectPosition(private val path: String) : FieldsList<ResponseField>(path) {
	val newSheet: FieldsList<ResponseField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : ResponseFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class ResponseFieldBandingProperties(private val path: String) : FieldsList<ResponseField>(path) {
	val firstBandColor by lazy { object : ResponseFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : ResponseFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : ResponseFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : ResponseFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : ResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : ResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : ResponseFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : ResponseFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class ResponseFieldGridRange(private val path: String) : FieldsList<ResponseField>(path) {
	val endColumnIndex: FieldsList<ResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class ResponseFieldEmbeddedObjectBorder(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
}

abstract class ResponseFieldChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val altText: FieldsList<ResponseField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : ResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : ResponseFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : ResponseFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : ResponseFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : ResponseFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : ResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<ResponseField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<ResponseField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : ResponseFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<ResponseField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : ResponseFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : ResponseFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : ResponseFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : ResponseFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<ResponseField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : ResponseFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : ResponseFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<ResponseField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : ResponseFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : ResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : ResponseFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : ResponseFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class ResponseFieldDataSourceColumn(private val path: String) : FieldsList<ResponseField>(path) {
	val formula: FieldsList<ResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : ResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class ResponseFieldDataSourceSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val bigQuery by lazy { object : ResponseFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : ResponseFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : ResponseFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class ResponseFieldDimensionRange(private val path: String) : FieldsList<ResponseField>(path) {
	val dimension: FieldsList<ResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<ResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<ResponseField> get() = fieldsList("${path}/startIndex")
}

abstract class ResponseFieldFilterCriteria(private val path: String) : FieldsList<ResponseField>(path) {
	val condition by lazy { object : ResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<ResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : ResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : ResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class ResponseFieldFilterSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val columnIndex: FieldsList<ResponseField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : ResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : ResponseFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class ResponseFieldSortSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val backgroundColor by lazy { object : ResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : ResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<ResponseField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : ResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<ResponseField> get() = fieldsList("${path}/sortOrder")
}

abstract class ResponseFieldEditors(private val path: String) : FieldsList<ResponseField>(path) {
	val domainUsersCanEdit: FieldsList<ResponseField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<ResponseField> get() = fieldsList("${path}/groups")
	val users: FieldsList<ResponseField> get() = fieldsList("${path}/users")
}

abstract class ResponseFieldDataSourceSheetProperties(private val path: String) : FieldsList<ResponseField>(path) {
	val columns by lazy { object : ResponseFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : ResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<ResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class ResponseFieldGridProperties(private val path: String) : FieldsList<ResponseField>(path) {
	val columnCount: FieldsList<ResponseField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<ResponseField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<ResponseField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<ResponseField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<ResponseField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<ResponseField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<ResponseField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class ResponseFieldColor(private val path: String) : FieldsList<ResponseField>(path) {
	val alpha: FieldsList<ResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<ResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<ResponseField> get() = fieldsList("${path}/red")
}

abstract class ResponseFieldColorStyle(private val path: String) : FieldsList<ResponseField>(path) {
	val rgbColor by lazy { object : ResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<ResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class ResponseFieldSlicerSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val applyToPivotTables: FieldsList<ResponseField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : ResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<ResponseField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : ResponseFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : ResponseFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<ResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<ResponseField> get() = fieldsList("${path}/title")
}

abstract class ResponseFieldDataSourceObjectReference(private val path: String) : FieldsList<ResponseField>(path) {
	val chartId: FieldsList<ResponseField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : ResponseFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : ResponseFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : ResponseFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class ResponseFieldRefreshCancellationStatus(private val path: String) : FieldsList<ResponseField>(path) {
	val errorCode: FieldsList<ResponseField> get() = fieldsList("${path}/errorCode")
	val state: FieldsList<ResponseField> get() = fieldsList("${path}/state")
}

abstract class ResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<ResponseField>(path) {
	val dimensionRange by lazy { object : ResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<ResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<ResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class ResponseFieldBooleanRule(private val path: String) : FieldsList<ResponseField>(path) {
	val condition by lazy { object : ResponseFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : ResponseFieldCellFormat("${path}/format") {} }
}

abstract class ResponseFieldGradientRule(private val path: String) : FieldsList<ResponseField>(path) {
	val maxpoint by lazy { object : ResponseFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : ResponseFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : ResponseFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class ResponseFieldOverlayPosition(private val path: String) : FieldsList<ResponseField>(path) {
	val anchorCell by lazy { object : ResponseFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<ResponseField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<ResponseField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<ResponseField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<ResponseField> get() = fieldsList("${path}/widthPixels")
}

abstract class ResponseFieldBasicChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val axis by lazy { object : ResponseFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<ResponseField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<ResponseField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : ResponseFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<ResponseField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<ResponseField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<ResponseField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<ResponseField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : ResponseFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<ResponseField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<ResponseField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : ResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class ResponseFieldBubbleChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val bubbleBorderColor by lazy { object : ResponseFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : ResponseFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : ResponseFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<ResponseField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<ResponseField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<ResponseField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : ResponseFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : ResponseFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : ResponseFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : ResponseFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<ResponseField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : ResponseFieldChartData("${path}/series") {} }
}

abstract class ResponseFieldCandlestickChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val data by lazy { object : ResponseFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : ResponseFieldCandlestickDomain("${path}/domain") {} }
}

abstract class ResponseFieldDataSourceChartProperties(private val path: String) : FieldsList<ResponseField>(path) {
	val dataExecutionStatus by lazy { object : ResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<ResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class ResponseFieldHistogramChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val bucketSize: FieldsList<ResponseField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<ResponseField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<ResponseField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : ResponseFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<ResponseField> get() = fieldsList("${path}/showItemDividers")
}

abstract class ResponseFieldOrgChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val labels by lazy { object : ResponseFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : ResponseFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : ResponseFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<ResponseField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : ResponseFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : ResponseFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : ResponseFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : ResponseFieldChartData("${path}/tooltips") {} }
}

abstract class ResponseFieldPieChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val domain by lazy { object : ResponseFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<ResponseField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<ResponseField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : ResponseFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<ResponseField> get() = fieldsList("${path}/threeDimensional")
}

abstract class ResponseFieldScorecardChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val aggregateType: FieldsList<ResponseField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : ResponseFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : ResponseFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : ResponseFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : ResponseFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : ResponseFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<ResponseField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<ResponseField> get() = fieldsList("${path}/scaleFactor")
}

abstract class ResponseFieldTextFormat(private val path: String) : FieldsList<ResponseField>(path) {
	val bold: FieldsList<ResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<ResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<ResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : ResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<ResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<ResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ResponseField> get() = fieldsList("${path}/underline")
}

abstract class ResponseFieldTextPosition(private val path: String) : FieldsList<ResponseField>(path) {
	val horizontalAlignment: FieldsList<ResponseField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class ResponseFieldTreemapChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val colorData by lazy { object : ResponseFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : ResponseFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : ResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : ResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<ResponseField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<ResponseField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : ResponseFieldChartData("${path}/labels") {} }
	val levels: FieldsList<ResponseField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<ResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ResponseField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : ResponseFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : ResponseFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class ResponseFieldWaterfallChartSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val connectorLineStyle by lazy { object : ResponseFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : ResponseFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<ResponseField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<ResponseField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : ResponseFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<ResponseField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : ResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class ResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<ResponseField>(path) {
	val name: FieldsList<ResponseField> get() = fieldsList("${path}/name")
}

abstract class ResponseFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val projectId: FieldsList<ResponseField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : ResponseFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : ResponseFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class ResponseFieldLookerDataSourceSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val explore: FieldsList<ResponseField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<ResponseField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<ResponseField> get() = fieldsList("${path}/model")
}

abstract class ResponseFieldDataSourceParameter(private val path: String) : FieldsList<ResponseField>(path) {
	val name: FieldsList<ResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : ResponseFieldGridRange("${path}/range") {} }
}

abstract class ResponseFieldBooleanCondition(private val path: String) : FieldsList<ResponseField>(path) {
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : ResponseFieldConditionValue("${path}/values") {} }
}

abstract class ResponseFieldGridCoordinate(private val path: String) : FieldsList<ResponseField>(path) {
	val columnIndex: FieldsList<ResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<ResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<ResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class ResponseFieldCellFormat(private val path: String) : FieldsList<ResponseField>(path) {
	val backgroundColor by lazy { object : ResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : ResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : ResponseFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<ResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<ResponseField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : ResponseFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : ResponseFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<ResponseField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : ResponseFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<ResponseField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<ResponseField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class ResponseFieldInterpolationPoint(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
	val value: FieldsList<ResponseField> get() = fieldsList("${path}/value")
}

abstract class ResponseFieldBasicChartAxis(private val path: String) : FieldsList<ResponseField>(path) {
	val format by lazy { object : ResponseFieldTextFormat("${path}/format") {} }
	val position: FieldsList<ResponseField> get() = fieldsList("${path}/position")
	val title: FieldsList<ResponseField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : ResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : ResponseFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class ResponseFieldBasicChartDomain(private val path: String) : FieldsList<ResponseField>(path) {
	val domain by lazy { object : ResponseFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<ResponseField> get() = fieldsList("${path}/reversed")
}

abstract class ResponseFieldBasicChartSeries(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : ResponseFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : ResponseFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : ResponseFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : ResponseFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : ResponseFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<ResponseField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
}

abstract class ResponseFieldDataLabel(private val path: String) : FieldsList<ResponseField>(path) {
	val customLabelData by lazy { object : ResponseFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<ResponseField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
}

abstract class ResponseFieldChartData(private val path: String) : FieldsList<ResponseField>(path) {
	val aggregateType: FieldsList<ResponseField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : ResponseFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : ResponseFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : ResponseFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class ResponseFieldCandlestickData(private val path: String) : FieldsList<ResponseField>(path) {
	val closeSeries by lazy { object : ResponseFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : ResponseFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : ResponseFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : ResponseFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class ResponseFieldCandlestickDomain(private val path: String) : FieldsList<ResponseField>(path) {
	val data by lazy { object : ResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<ResponseField> get() = fieldsList("${path}/reversed")
}

abstract class ResponseFieldHistogramSeries(private val path: String) : FieldsList<ResponseField>(path) {
	val barColor by lazy { object : ResponseFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : ResponseFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : ResponseFieldChartData("${path}/data") {} }
}

abstract class ResponseFieldBaselineValueFormat(private val path: String) : FieldsList<ResponseField>(path) {
	val comparisonType: FieldsList<ResponseField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<ResponseField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : ResponseFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : ResponseFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : ResponseFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : ResponseFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : ResponseFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class ResponseFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<ResponseField>(path) {
	val prefix: FieldsList<ResponseField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<ResponseField> get() = fieldsList("${path}/suffix")
}

abstract class ResponseFieldKeyValueFormat(private val path: String) : FieldsList<ResponseField>(path) {
	val position by lazy { object : ResponseFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : ResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class ResponseFieldLink(private val path: String) : FieldsList<ResponseField>(path) {
	val uri: FieldsList<ResponseField> get() = fieldsList("${path}/uri")
}

abstract class ResponseFieldTreemapChartColorScale(private val path: String) : FieldsList<ResponseField>(path) {
	val maxValueColor by lazy { object : ResponseFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : ResponseFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : ResponseFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : ResponseFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : ResponseFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : ResponseFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : ResponseFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : ResponseFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class ResponseFieldLineStyle(private val path: String) : FieldsList<ResponseField>(path) {
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
	val width: FieldsList<ResponseField> get() = fieldsList("${path}/width")
}

abstract class ResponseFieldWaterfallChartDomain(private val path: String) : FieldsList<ResponseField>(path) {
	val data by lazy { object : ResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<ResponseField> get() = fieldsList("${path}/reversed")
}

abstract class ResponseFieldWaterfallChartSeries(private val path: String) : FieldsList<ResponseField>(path) {
	val customSubtotals by lazy { object : ResponseFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : ResponseFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : ResponseFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<ResponseField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : ResponseFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : ResponseFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : ResponseFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class ResponseFieldBigQueryQuerySpec(private val path: String) : FieldsList<ResponseField>(path) {
	val rawQuery: FieldsList<ResponseField> get() = fieldsList("${path}/rawQuery")
}

abstract class ResponseFieldBigQueryTableSpec(private val path: String) : FieldsList<ResponseField>(path) {
	val datasetId: FieldsList<ResponseField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<ResponseField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<ResponseField> get() = fieldsList("${path}/tableProjectId")
}

abstract class ResponseFieldConditionValue(private val path: String) : FieldsList<ResponseField>(path) {
	val relativeDate: FieldsList<ResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<ResponseField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class ResponseFieldBorders(private val path: String) : FieldsList<ResponseField>(path) {
	val bottom by lazy { object : ResponseFieldBorder("${path}/bottom") {} }
	val left by lazy { object : ResponseFieldBorder("${path}/left") {} }
	val right by lazy { object : ResponseFieldBorder("${path}/right") {} }
	val top by lazy { object : ResponseFieldBorder("${path}/top") {} }
}

abstract class ResponseFieldNumberFormat(private val path: String) : FieldsList<ResponseField>(path) {
	val pattern: FieldsList<ResponseField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
}

abstract class ResponseFieldPadding(private val path: String) : FieldsList<ResponseField>(path) {
	val bottom: FieldsList<ResponseField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<ResponseField> get() = fieldsList("${path}/left")
	val right: FieldsList<ResponseField> get() = fieldsList("${path}/right")
	val top: FieldsList<ResponseField> get() = fieldsList("${path}/top")
}

abstract class ResponseFieldTextRotation(private val path: String) : FieldsList<ResponseField>(path) {
	val angle: FieldsList<ResponseField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<ResponseField> get() = fieldsList("${path}/vertical")
}

abstract class ResponseFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<ResponseField>(path) {
	val viewWindowMax: FieldsList<ResponseField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<ResponseField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<ResponseField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class ResponseFieldPointStyle(private val path: String) : FieldsList<ResponseField>(path) {
	val shape: FieldsList<ResponseField> get() = fieldsList("${path}/shape")
	val size: FieldsList<ResponseField> get() = fieldsList("${path}/size")
}

abstract class ResponseFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<ResponseField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : ResponseFieldPointStyle("${path}/pointStyle") {} }
}

abstract class ResponseFieldChartGroupRule(private val path: String) : FieldsList<ResponseField>(path) {
	val dateTimeRule by lazy { object : ResponseFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : ResponseFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class ResponseFieldChartSourceRange(private val path: String) : FieldsList<ResponseField>(path) {
	val sources by lazy { object : ResponseFieldGridRange("${path}/sources") {} }
}

abstract class ResponseFieldCandlestickSeries(private val path: String) : FieldsList<ResponseField>(path) {
	val data by lazy { object : ResponseFieldChartData("${path}/data") {} }
}

abstract class ResponseFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<ResponseField>(path) {
	val dataIsSubtotal: FieldsList<ResponseField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<ResponseField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<ResponseField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class ResponseFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<ResponseField> get() = fieldsList("${path}/label")
}

abstract class ResponseFieldBorder(private val path: String) : FieldsList<ResponseField>(path) {
	val color by lazy { object : ResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : ResponseFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<ResponseField> get() = fieldsList("${path}/style")
	val width: FieldsList<ResponseField> get() = fieldsList("${path}/width")
}

abstract class ResponseFieldChartDateTimeRule(private val path: String) : FieldsList<ResponseField>(path) {
	val type: FieldsList<ResponseField> get() = fieldsList("${path}/type")
}

abstract class ResponseFieldChartHistogramRule(private val path: String) : FieldsList<ResponseField>(path) {
	val intervalSize: FieldsList<ResponseField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<ResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ResponseField> get() = fieldsList("${path}/minValue")
}

