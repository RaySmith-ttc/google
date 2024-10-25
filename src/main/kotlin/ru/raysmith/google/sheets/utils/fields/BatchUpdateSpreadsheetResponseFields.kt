package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateSpreadsheetResponseField : Field

object BatchUpdateSpreadsheetResponseFields {
    val ALL: FieldsList<BatchUpdateSpreadsheetResponseField> = fieldsList("*")
	val replies = object : BatchUpdateSpreadsheetResponseFieldResponse("replies") {}
	val spreadsheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("spreadsheetId")
	val updatedSpreadsheet = object : BatchUpdateSpreadsheetResponseFieldSpreadsheet("updatedSpreadsheet") {}
}

abstract class BatchUpdateSpreadsheetResponseFieldResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val addBanding by lazy { object : BatchUpdateSpreadsheetResponseFieldAddBandingResponse("${path}/addBanding") {} }
	val addChart by lazy { object : BatchUpdateSpreadsheetResponseFieldAddChartResponse("${path}/addChart") {} }
	val addDataSource by lazy { object : BatchUpdateSpreadsheetResponseFieldAddDataSourceResponse("${path}/addDataSource") {} }
	val addDimensionGroup by lazy { object : BatchUpdateSpreadsheetResponseFieldAddDimensionGroupResponse("${path}/addDimensionGroup") {} }
	val addFilterView by lazy { object : BatchUpdateSpreadsheetResponseFieldAddFilterViewResponse("${path}/addFilterView") {} }
	val addNamedRange by lazy { object : BatchUpdateSpreadsheetResponseFieldAddNamedRangeResponse("${path}/addNamedRange") {} }
	val addProtectedRange by lazy { object : BatchUpdateSpreadsheetResponseFieldAddProtectedRangeResponse("${path}/addProtectedRange") {} }
	val addSheet by lazy { object : BatchUpdateSpreadsheetResponseFieldAddSheetResponse("${path}/addSheet") {} }
	val addSlicer by lazy { object : BatchUpdateSpreadsheetResponseFieldAddSlicerResponse("${path}/addSlicer") {} }
	val cancelDataSourceRefresh by lazy { object : BatchUpdateSpreadsheetResponseFieldCancelDataSourceRefreshResponse("${path}/cancelDataSourceRefresh") {} }
	val createDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldCreateDeveloperMetadataResponse("${path}/createDeveloperMetadata") {} }
	val deleteConditionalFormatRule by lazy { object : BatchUpdateSpreadsheetResponseFieldDeleteConditionalFormatRuleResponse("${path}/deleteConditionalFormatRule") {} }
	val deleteDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeleteDeveloperMetadataResponse("${path}/deleteDeveloperMetadata") {} }
	val deleteDimensionGroup by lazy { object : BatchUpdateSpreadsheetResponseFieldDeleteDimensionGroupResponse("${path}/deleteDimensionGroup") {} }
	val deleteDuplicates by lazy { object : BatchUpdateSpreadsheetResponseFieldDeleteDuplicatesResponse("${path}/deleteDuplicates") {} }
	val duplicateFilterView by lazy { object : BatchUpdateSpreadsheetResponseFieldDuplicateFilterViewResponse("${path}/duplicateFilterView") {} }
	val duplicateSheet by lazy { object : BatchUpdateSpreadsheetResponseFieldDuplicateSheetResponse("${path}/duplicateSheet") {} }
	val findReplace by lazy { object : BatchUpdateSpreadsheetResponseFieldFindReplaceResponse("${path}/findReplace") {} }
	val refreshDataSource by lazy { object : BatchUpdateSpreadsheetResponseFieldRefreshDataSourceResponse("${path}/refreshDataSource") {} }
	val trimWhitespace by lazy { object : BatchUpdateSpreadsheetResponseFieldTrimWhitespaceResponse("${path}/trimWhitespace") {} }
	val updateConditionalFormatRule by lazy { object : BatchUpdateSpreadsheetResponseFieldUpdateConditionalFormatRuleResponse("${path}/updateConditionalFormatRule") {} }
	val updateDataSource by lazy { object : BatchUpdateSpreadsheetResponseFieldUpdateDataSourceResponse("${path}/updateDataSource") {} }
	val updateDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldUpdateDeveloperMetadataResponse("${path}/updateDeveloperMetadata") {} }
	val updateEmbeddedObjectPosition by lazy { object : BatchUpdateSpreadsheetResponseFieldUpdateEmbeddedObjectPositionResponse("${path}/updateEmbeddedObjectPosition") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldSpreadsheet(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataSourceSchedules by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceRefreshSchedule("${path}/dataSourceSchedules") {} }
	val dataSources by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSource("${path}/dataSources") {} }
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val namedRanges by lazy { object : BatchUpdateSpreadsheetResponseFieldNamedRange("${path}/namedRanges") {} }
	val properties by lazy { object : BatchUpdateSpreadsheetResponseFieldSpreadsheetProperties("${path}/properties") {} }
	val sheets by lazy { object : BatchUpdateSpreadsheetResponseFieldSheet("${path}/sheets") {} }
	val spreadsheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/spreadsheetId")
	val spreadsheetUrl: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/spreadsheetUrl")
}

abstract class BatchUpdateSpreadsheetResponseFieldAddBandingResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bandedRange by lazy { object : BatchUpdateSpreadsheetResponseFieldBandedRange("${path}/bandedRange") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddChartResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val chart by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedChart("${path}/chart") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddDataSourceResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSource by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSource("${path}/dataSource") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddDimensionGroupResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dimensionGroups by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionGroup("${path}/dimensionGroups") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddFilterViewResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val filter by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterView("${path}/filter") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddNamedRangeResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val namedRange by lazy { object : BatchUpdateSpreadsheetResponseFieldNamedRange("${path}/namedRange") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddProtectedRangeResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val protectedRange by lazy { object : BatchUpdateSpreadsheetResponseFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddSheetResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val properties by lazy { object : BatchUpdateSpreadsheetResponseFieldSheetProperties("${path}/properties") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldAddSlicerResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val slicer by lazy { object : BatchUpdateSpreadsheetResponseFieldSlicer("${path}/slicer") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCancelDataSourceRefreshResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val statuses by lazy { object : BatchUpdateSpreadsheetResponseFieldCancelDataSourceRefreshStatus("${path}/statuses") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCreateDeveloperMetadataResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeleteConditionalFormatRuleResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val rule by lazy { object : BatchUpdateSpreadsheetResponseFieldConditionalFormatRule("${path}/rule") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeleteDeveloperMetadataResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val deletedDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/deletedDeveloperMetadata") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeleteDimensionGroupResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dimensionGroups by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionGroup("${path}/dimensionGroups") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeleteDuplicatesResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val duplicatesRemovedCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/duplicatesRemovedCount")
}

abstract class BatchUpdateSpreadsheetResponseFieldDuplicateFilterViewResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val filter by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterView("${path}/filter") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDuplicateSheetResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val properties by lazy { object : BatchUpdateSpreadsheetResponseFieldSheetProperties("${path}/properties") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldFindReplaceResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val formulasChanged: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/formulasChanged")
	val occurrencesChanged: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/occurrencesChanged")
	val rowsChanged: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rowsChanged")
	val sheetsChanged: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetsChanged")
	val valuesChanged: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/valuesChanged")
}

abstract class BatchUpdateSpreadsheetResponseFieldRefreshDataSourceResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val statuses by lazy { object : BatchUpdateSpreadsheetResponseFieldRefreshDataSourceObjectExecutionStatus("${path}/statuses") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldTrimWhitespaceResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val cellsChangedCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/cellsChangedCount")
}

abstract class BatchUpdateSpreadsheetResponseFieldUpdateConditionalFormatRuleResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val newIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/newIndex")
	val newRule by lazy { object : BatchUpdateSpreadsheetResponseFieldConditionalFormatRule("${path}/newRule") {} }
	val oldIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/oldIndex")
	val oldRule by lazy { object : BatchUpdateSpreadsheetResponseFieldConditionalFormatRule("${path}/oldRule") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldUpdateDataSourceResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSource by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSource("${path}/dataSource") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldUpdateDeveloperMetadataResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldUpdateEmbeddedObjectPositionResponse(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val position by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedObjectPosition("${path}/position") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceRefreshSchedule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dailySchedule by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceRefreshDailySchedule("${path}/dailySchedule") {} }
	val enabled: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/enabled")
	val monthlySchedule by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceRefreshMonthlySchedule("${path}/monthlySchedule") {} }
	val nextRun by lazy { object : BatchUpdateSpreadsheetResponseFieldInterval("${path}/nextRun") {} }
	val refreshScope: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/refreshScope")
	val weeklySchedule by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceRefreshWeeklySchedule("${path}/weeklySchedule") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSource(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val calculatedColumns by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeveloperMetadata(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val location by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/visibility")
}

abstract class BatchUpdateSpreadsheetResponseFieldNamedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldSpreadsheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val autoRecalc: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/autoRecalc")
	val defaultFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldCellFormat("${path}/defaultFormat") {} }
	val importFunctionsExternalUrlAccessAllowed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings by lazy { object : BatchUpdateSpreadsheetResponseFieldIterativeCalculationSettings("${path}/iterativeCalculationSettings") {} }
	val locale: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/locale")
	val spreadsheetTheme by lazy { object : BatchUpdateSpreadsheetResponseFieldSpreadsheetTheme("${path}/spreadsheetTheme") {} }
	val timeZone: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/timeZone")
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetResponseFieldSheet(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bandedRanges by lazy { object : BatchUpdateSpreadsheetResponseFieldBandedRange("${path}/bandedRanges") {} }
	val basicFilter by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicFilter("${path}/basicFilter") {} }
	val charts by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedChart("${path}/charts") {} }
	val columnGroups by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionGroup("${path}/columnGroups") {} }
	val conditionalFormats by lazy { object : BatchUpdateSpreadsheetResponseFieldConditionalFormatRule("${path}/conditionalFormats") {} }
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldGridData("${path}/data") {} }
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val filterViews by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterView("${path}/filterViews") {} }
	val merges by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/merges") {} }
	val properties by lazy { object : BatchUpdateSpreadsheetResponseFieldSheetProperties("${path}/properties") {} }
	val protectedRanges by lazy { object : BatchUpdateSpreadsheetResponseFieldProtectedRange("${path}/protectedRanges") {} }
	val rowGroups by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionGroup("${path}/rowGroups") {} }
	val slicers by lazy { object : BatchUpdateSpreadsheetResponseFieldSlicer("${path}/slicers") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBandedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bandedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : BatchUpdateSpreadsheetResponseFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : BatchUpdateSpreadsheetResponseFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldEmbeddedChart(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val border by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : BatchUpdateSpreadsheetResponseFieldChartSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataExecutionStatus(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val errorCode: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/state")
}

abstract class BatchUpdateSpreadsheetResponseFieldDimensionGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val collapsed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/depth")
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldFilterView(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val criteria by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetResponseFieldProtectedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val description: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/description")
	val editors by lazy { object : BatchUpdateSpreadsheetResponseFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/warningOnly")
}

abstract class BatchUpdateSpreadsheetResponseFieldSheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataSourceSheetProperties by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : BatchUpdateSpreadsheetResponseFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetResponseFieldSlicer(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val position by lazy { object : BatchUpdateSpreadsheetResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : BatchUpdateSpreadsheetResponseFieldSlicerSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCancelDataSourceRefreshStatus(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val reference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceObjectReference("${path}/reference") {} }
	val refreshCancellationStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldRefreshCancellationStatus("${path}/refreshCancellationStatus") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldConditionalFormatRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val booleanRule by lazy { object : BatchUpdateSpreadsheetResponseFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : BatchUpdateSpreadsheetResponseFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/ranges") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldRefreshDataSourceObjectExecutionStatus(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val reference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceObjectReference("${path}/reference") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldEmbeddedObjectPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val newSheet: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : BatchUpdateSpreadsheetResponseFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceRefreshDailySchedule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val startTime by lazy { object : BatchUpdateSpreadsheetResponseFieldTimeOfDay("${path}/startTime") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceRefreshMonthlySchedule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val daysOfMonth: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/daysOfMonth")
	val startTime by lazy { object : BatchUpdateSpreadsheetResponseFieldTimeOfDay("${path}/startTime") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldInterval(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val endTime: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/endTime")
	val startTime: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startTime")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceRefreshWeeklySchedule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val daysOfWeek: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/daysOfWeek")
	val startTime by lazy { object : BatchUpdateSpreadsheetResponseFieldTimeOfDay("${path}/startTime") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceColumn(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val formula: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bigQuery by lazy { object : BatchUpdateSpreadsheetResponseFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : BatchUpdateSpreadsheetResponseFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dimensionRange by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchUpdateSpreadsheetResponseFieldGridRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val endColumnIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchUpdateSpreadsheetResponseFieldCellFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : BatchUpdateSpreadsheetResponseFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : BatchUpdateSpreadsheetResponseFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : BatchUpdateSpreadsheetResponseFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class BatchUpdateSpreadsheetResponseFieldIterativeCalculationSettings(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val convergenceThreshold: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/maxIterations")
}

abstract class BatchUpdateSpreadsheetResponseFieldSpreadsheetTheme(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val primaryFontFamily: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : BatchUpdateSpreadsheetResponseFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicFilter(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val criteria by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldGridData(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionProperties("${path}/columnMetadata") {} }
	val rowData by lazy { object : BatchUpdateSpreadsheetResponseFieldRowData("${path}/rowData") {} }
	val rowMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDimensionProperties("${path}/rowMetadata") {} }
	val startColumn: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startColumn")
	val startRow: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startRow")
}

abstract class BatchUpdateSpreadsheetResponseFieldBandingProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val firstBandColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldEmbeddedObjectBorder(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val altText: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : BatchUpdateSpreadsheetResponseFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : BatchUpdateSpreadsheetResponseFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : BatchUpdateSpreadsheetResponseFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : BatchUpdateSpreadsheetResponseFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : BatchUpdateSpreadsheetResponseFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : BatchUpdateSpreadsheetResponseFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : BatchUpdateSpreadsheetResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : BatchUpdateSpreadsheetResponseFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDimensionRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dimension: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startIndex")
}

abstract class BatchUpdateSpreadsheetResponseFieldFilterCriteria(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldFilterSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldSortSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sortOrder")
}

abstract class BatchUpdateSpreadsheetResponseFieldEditors(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val domainUsersCanEdit: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/groups")
	val users: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/users")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceSheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columns by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetResponseFieldGridProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class BatchUpdateSpreadsheetResponseFieldColor(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val alpha: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/red")
}

abstract class BatchUpdateSpreadsheetResponseFieldColorStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val rgbColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class BatchUpdateSpreadsheetResponseFieldSlicerSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val applyToPivotTables: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceObjectReference(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val chartId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : BatchUpdateSpreadsheetResponseFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : BatchUpdateSpreadsheetResponseFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : BatchUpdateSpreadsheetResponseFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetResponseFieldRefreshCancellationStatus(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val errorCode: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/errorCode")
	val state: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/state")
}

abstract class BatchUpdateSpreadsheetResponseFieldBooleanRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetResponseFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : BatchUpdateSpreadsheetResponseFieldCellFormat("${path}/format") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldGradientRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val maxpoint by lazy { object : BatchUpdateSpreadsheetResponseFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : BatchUpdateSpreadsheetResponseFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : BatchUpdateSpreadsheetResponseFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldOverlayPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val anchorCell by lazy { object : BatchUpdateSpreadsheetResponseFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/widthPixels")
}

abstract class BatchUpdateSpreadsheetResponseFieldTimeOfDay(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val hours: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hours")
	val minutes: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/minutes")
	val nanos: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/nanos")
	val seconds: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/seconds")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/name")
}

abstract class BatchUpdateSpreadsheetResponseFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val projectId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : BatchUpdateSpreadsheetResponseFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : BatchUpdateSpreadsheetResponseFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldLookerDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val explore: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/model")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceParameter(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBorders(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bottom by lazy { object : BatchUpdateSpreadsheetResponseFieldBorder("${path}/bottom") {} }
	val left by lazy { object : BatchUpdateSpreadsheetResponseFieldBorder("${path}/left") {} }
	val right by lazy { object : BatchUpdateSpreadsheetResponseFieldBorder("${path}/right") {} }
	val top by lazy { object : BatchUpdateSpreadsheetResponseFieldBorder("${path}/top") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldNumberFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val pattern: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldPadding(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bottom: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/left")
	val right: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/right")
	val top: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/top")
}

abstract class BatchUpdateSpreadsheetResponseFieldTextFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bold: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BatchUpdateSpreadsheetResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/underline")
}

abstract class BatchUpdateSpreadsheetResponseFieldTextRotation(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val angle: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/vertical")
}

abstract class BatchUpdateSpreadsheetResponseFieldThemeColorPair(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/colorType")
}

abstract class BatchUpdateSpreadsheetResponseFieldDimensionProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/pixelSize")
}

abstract class BatchUpdateSpreadsheetResponseFieldRowData(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val values by lazy { object : BatchUpdateSpreadsheetResponseFieldCellData("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val axis by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : BatchUpdateSpreadsheetResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBubbleChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bubbleBorderColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/series") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCandlestickChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickDomain("${path}/domain") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceChartProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetResponseFieldHistogramChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val bucketSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/showItemDividers")
}

abstract class BatchUpdateSpreadsheetResponseFieldOrgChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val labels by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/tooltips") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldPieChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val domain by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/threeDimensional")
}

abstract class BatchUpdateSpreadsheetResponseFieldScorecardChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val aggregateType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : BatchUpdateSpreadsheetResponseFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/scaleFactor")
}

abstract class BatchUpdateSpreadsheetResponseFieldTextPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class BatchUpdateSpreadsheetResponseFieldTreemapChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val colorData by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : BatchUpdateSpreadsheetResponseFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/labels") {} }
	val levels: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldWaterfallChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val connectorLineStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : BatchUpdateSpreadsheetResponseFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBooleanCondition(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : BatchUpdateSpreadsheetResponseFieldConditionValue("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldGridCoordinate(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetResponseFieldInterpolationPoint(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
	val value: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/value")
}

abstract class BatchUpdateSpreadsheetResponseFieldBigQueryQuerySpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val rawQuery: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rawQuery")
}

abstract class BatchUpdateSpreadsheetResponseFieldBigQueryTableSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val datasetId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/tableProjectId")
}

abstract class BatchUpdateSpreadsheetResponseFieldBorder(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/style")
	val width: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/width")
}

abstract class BatchUpdateSpreadsheetResponseFieldLink(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val uri: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/uri")
}

abstract class BatchUpdateSpreadsheetResponseFieldCellData(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataSourceFormula by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : BatchUpdateSpreadsheetResponseFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicChartAxis(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val format by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/format") {} }
	val position: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/position")
	val title: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : BatchUpdateSpreadsheetResponseFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : BatchUpdateSpreadsheetResponseFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicChartDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val domain by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicChartSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : BatchUpdateSpreadsheetResponseFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : BatchUpdateSpreadsheetResponseFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataLabel(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val customLabelData by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldChartData(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val aggregateType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BatchUpdateSpreadsheetResponseFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BatchUpdateSpreadsheetResponseFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCandlestickData(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val closeSeries by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : BatchUpdateSpreadsheetResponseFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCandlestickDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetResponseFieldHistogramSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val barColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/data") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldBaselineValueFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val comparisonType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : BatchUpdateSpreadsheetResponseFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val prefix: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/suffix")
}

abstract class BatchUpdateSpreadsheetResponseFieldKeyValueFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val position by lazy { object : BatchUpdateSpreadsheetResponseFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldTreemapChartColorScale(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val maxValueColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldLineStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
	val width: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/width")
}

abstract class BatchUpdateSpreadsheetResponseFieldWaterfallChartDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/data") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetResponseFieldWaterfallChartSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val customSubtotals by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : BatchUpdateSpreadsheetResponseFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldConditionValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val relativeDate: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceFormula(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetResponseFieldDataSourceTable(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnSelectionType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDataValidationRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetResponseFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/strict")
}

abstract class BatchUpdateSpreadsheetResponseFieldExtendedValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val boolValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : BatchUpdateSpreadsheetResponseFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/stringValue")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotTable(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columns by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotValue("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldTextFormatRun(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val format by lazy { object : BatchUpdateSpreadsheetResponseFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/startIndex")
}

abstract class BatchUpdateSpreadsheetResponseFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val viewWindowMax: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class BatchUpdateSpreadsheetResponseFieldPointStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val shape: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/shape")
	val size: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/size")
}

abstract class BatchUpdateSpreadsheetResponseFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldPointStyle("${path}/pointStyle") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldChartGroupRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dateTimeRule by lazy { object : BatchUpdateSpreadsheetResponseFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BatchUpdateSpreadsheetResponseFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldChartSourceRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val sources by lazy { object : BatchUpdateSpreadsheetResponseFieldGridRange("${path}/sources") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldCandlestickSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetResponseFieldChartData("${path}/data") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataIsSubtotal: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class BatchUpdateSpreadsheetResponseFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetResponseFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetResponseFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/label")
}

abstract class BatchUpdateSpreadsheetResponseFieldErrorValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val message: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/message")
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotFilterCriteria(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetResponseFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/visibleValues")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotFilterSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val columnOffsetIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetResponseFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val calculatedDisplayType: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/formula")
	val name: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class BatchUpdateSpreadsheetResponseFieldChartDateTimeRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldChartHistogramRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val intervalSize: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/minValue")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotGroupLimit(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val applyOrder: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/countLimit")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotGroupRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val dateTimeRule by lazy { object : BatchUpdateSpreadsheetResponseFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BatchUpdateSpreadsheetResponseFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : BatchUpdateSpreadsheetResponseFieldManualRule("${path}/manualRule") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val buckets by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/valuesIndex")
}

abstract class BatchUpdateSpreadsheetResponseFieldPivotGroupValueMetadata(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val collapsed: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/value") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldDateTimeRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetResponseFieldHistogramRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val end: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/end")
	val interval: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/interval")
	val start: FieldsList<BatchUpdateSpreadsheetResponseField> get() = fieldsList("${path}/start")
}

abstract class BatchUpdateSpreadsheetResponseFieldManualRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val groups by lazy { object : BatchUpdateSpreadsheetResponseFieldManualRuleGroup("${path}/groups") {} }
}

abstract class BatchUpdateSpreadsheetResponseFieldManualRuleGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetResponseField>(path) {
	val groupName by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : BatchUpdateSpreadsheetResponseFieldExtendedValue("${path}/items") {} }
}

