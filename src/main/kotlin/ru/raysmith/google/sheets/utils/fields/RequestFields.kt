package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RequestField : Field

object RequestFields {
    val ALL: FieldsList<RequestField> = fieldsList("*")
	val addBanding = object : RequestFieldAddBandingRequest("addBanding") {}
	val addChart = object : RequestFieldAddChartRequest("addChart") {}
	val addConditionalFormatRule = object : RequestFieldAddConditionalFormatRuleRequest("addConditionalFormatRule") {}
	val addDataSource = object : RequestFieldAddDataSourceRequest("addDataSource") {}
	val addDimensionGroup = object : RequestFieldAddDimensionGroupRequest("addDimensionGroup") {}
	val addFilterView = object : RequestFieldAddFilterViewRequest("addFilterView") {}
	val addNamedRange = object : RequestFieldAddNamedRangeRequest("addNamedRange") {}
	val addProtectedRange = object : RequestFieldAddProtectedRangeRequest("addProtectedRange") {}
	val addSheet = object : RequestFieldAddSheetRequest("addSheet") {}
	val addSlicer = object : RequestFieldAddSlicerRequest("addSlicer") {}
	val appendCells = object : RequestFieldAppendCellsRequest("appendCells") {}
	val appendDimension = object : RequestFieldAppendDimensionRequest("appendDimension") {}
	val autoFill = object : RequestFieldAutoFillRequest("autoFill") {}
	val autoResizeDimensions = object : RequestFieldAutoResizeDimensionsRequest("autoResizeDimensions") {}
	val cancelDataSourceRefresh = object : RequestFieldCancelDataSourceRefreshRequest("cancelDataSourceRefresh") {}
	val clearBasicFilter = object : RequestFieldClearBasicFilterRequest("clearBasicFilter") {}
	val copyPaste = object : RequestFieldCopyPasteRequest("copyPaste") {}
	val createDeveloperMetadata = object : RequestFieldCreateDeveloperMetadataRequest("createDeveloperMetadata") {}
	val cutPaste = object : RequestFieldCutPasteRequest("cutPaste") {}
	val deleteBanding = object : RequestFieldDeleteBandingRequest("deleteBanding") {}
	val deleteConditionalFormatRule = object : RequestFieldDeleteConditionalFormatRuleRequest("deleteConditionalFormatRule") {}
	val deleteDataSource = object : RequestFieldDeleteDataSourceRequest("deleteDataSource") {}
	val deleteDeveloperMetadata = object : RequestFieldDeleteDeveloperMetadataRequest("deleteDeveloperMetadata") {}
	val deleteDimension = object : RequestFieldDeleteDimensionRequest("deleteDimension") {}
	val deleteDimensionGroup = object : RequestFieldDeleteDimensionGroupRequest("deleteDimensionGroup") {}
	val deleteDuplicates = object : RequestFieldDeleteDuplicatesRequest("deleteDuplicates") {}
	val deleteEmbeddedObject = object : RequestFieldDeleteEmbeddedObjectRequest("deleteEmbeddedObject") {}
	val deleteFilterView = object : RequestFieldDeleteFilterViewRequest("deleteFilterView") {}
	val deleteNamedRange = object : RequestFieldDeleteNamedRangeRequest("deleteNamedRange") {}
	val deleteProtectedRange = object : RequestFieldDeleteProtectedRangeRequest("deleteProtectedRange") {}
	val deleteRange = object : RequestFieldDeleteRangeRequest("deleteRange") {}
	val deleteSheet = object : RequestFieldDeleteSheetRequest("deleteSheet") {}
	val duplicateFilterView = object : RequestFieldDuplicateFilterViewRequest("duplicateFilterView") {}
	val duplicateSheet = object : RequestFieldDuplicateSheetRequest("duplicateSheet") {}
	val findReplace = object : RequestFieldFindReplaceRequest("findReplace") {}
	val insertDimension = object : RequestFieldInsertDimensionRequest("insertDimension") {}
	val insertRange = object : RequestFieldInsertRangeRequest("insertRange") {}
	val mergeCells = object : RequestFieldMergeCellsRequest("mergeCells") {}
	val moveDimension = object : RequestFieldMoveDimensionRequest("moveDimension") {}
	val pasteData = object : RequestFieldPasteDataRequest("pasteData") {}
	val randomizeRange = object : RequestFieldRandomizeRangeRequest("randomizeRange") {}
	val refreshDataSource = object : RequestFieldRefreshDataSourceRequest("refreshDataSource") {}
	val repeatCell = object : RequestFieldRepeatCellRequest("repeatCell") {}
	val setBasicFilter = object : RequestFieldSetBasicFilterRequest("setBasicFilter") {}
	val setDataValidation = object : RequestFieldSetDataValidationRequest("setDataValidation") {}
	val sortRange = object : RequestFieldSortRangeRequest("sortRange") {}
	val textToColumns = object : RequestFieldTextToColumnsRequest("textToColumns") {}
	val trimWhitespace = object : RequestFieldTrimWhitespaceRequest("trimWhitespace") {}
	val unmergeCells = object : RequestFieldUnmergeCellsRequest("unmergeCells") {}
	val updateBanding = object : RequestFieldUpdateBandingRequest("updateBanding") {}
	val updateBorders = object : RequestFieldUpdateBordersRequest("updateBorders") {}
	val updateCells = object : RequestFieldUpdateCellsRequest("updateCells") {}
	val updateChartSpec = object : RequestFieldUpdateChartSpecRequest("updateChartSpec") {}
	val updateConditionalFormatRule = object : RequestFieldUpdateConditionalFormatRuleRequest("updateConditionalFormatRule") {}
	val updateDataSource = object : RequestFieldUpdateDataSourceRequest("updateDataSource") {}
	val updateDeveloperMetadata = object : RequestFieldUpdateDeveloperMetadataRequest("updateDeveloperMetadata") {}
	val updateDimensionGroup = object : RequestFieldUpdateDimensionGroupRequest("updateDimensionGroup") {}
	val updateDimensionProperties = object : RequestFieldUpdateDimensionPropertiesRequest("updateDimensionProperties") {}
	val updateEmbeddedObjectBorder = object : RequestFieldUpdateEmbeddedObjectBorderRequest("updateEmbeddedObjectBorder") {}
	val updateEmbeddedObjectPosition = object : RequestFieldUpdateEmbeddedObjectPositionRequest("updateEmbeddedObjectPosition") {}
	val updateFilterView = object : RequestFieldUpdateFilterViewRequest("updateFilterView") {}
	val updateNamedRange = object : RequestFieldUpdateNamedRangeRequest("updateNamedRange") {}
	val updateProtectedRange = object : RequestFieldUpdateProtectedRangeRequest("updateProtectedRange") {}
	val updateSheetProperties = object : RequestFieldUpdateSheetPropertiesRequest("updateSheetProperties") {}
	val updateSlicerSpec = object : RequestFieldUpdateSlicerSpecRequest("updateSlicerSpec") {}
	val updateSpreadsheetProperties = object : RequestFieldUpdateSpreadsheetPropertiesRequest("updateSpreadsheetProperties") {}
}

abstract class RequestFieldAddBandingRequest(private val path: String) : FieldsList<RequestField>(path) {
	val bandedRange by lazy { object : RequestFieldBandedRange("${path}/bandedRange") {} }
}

abstract class RequestFieldAddChartRequest(private val path: String) : FieldsList<RequestField>(path) {
	val chart by lazy { object : RequestFieldEmbeddedChart("${path}/chart") {} }
}

abstract class RequestFieldAddConditionalFormatRuleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val rule by lazy { object : RequestFieldConditionalFormatRule("${path}/rule") {} }
}

abstract class RequestFieldAddDataSourceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSource by lazy { object : RequestFieldDataSource("${path}/dataSource") {} }
}

abstract class RequestFieldAddDimensionGroupRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldAddFilterViewRequest(private val path: String) : FieldsList<RequestField>(path) {
	val filter by lazy { object : RequestFieldFilterView("${path}/filter") {} }
}

abstract class RequestFieldAddNamedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val namedRange by lazy { object : RequestFieldNamedRange("${path}/namedRange") {} }
}

abstract class RequestFieldAddProtectedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val protectedRange by lazy { object : RequestFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class RequestFieldAddSheetRequest(private val path: String) : FieldsList<RequestField>(path) {
	val properties by lazy { object : RequestFieldSheetProperties("${path}/properties") {} }
}

abstract class RequestFieldAddSlicerRequest(private val path: String) : FieldsList<RequestField>(path) {
	val slicer by lazy { object : RequestFieldSlicer("${path}/slicer") {} }
}

abstract class RequestFieldAppendCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val rows by lazy { object : RequestFieldRowData("${path}/rows") {} }
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldAppendDimensionRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dimension: FieldsList<RequestField> get() = fieldsList("${path}/dimension")
	val length: FieldsList<RequestField> get() = fieldsList("${path}/length")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldAutoFillRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val sourceAndDestination by lazy { object : RequestFieldSourceAndDestination("${path}/sourceAndDestination") {} }
	val useAlternateSeries: FieldsList<RequestField> get() = fieldsList("${path}/useAlternateSeries")
}

abstract class RequestFieldAutoResizeDimensionsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceSheetDimensions by lazy { object : RequestFieldDataSourceSheetDimensionRange("${path}/dataSourceSheetDimensions") {} }
	val dimensions by lazy { object : RequestFieldDimensionRange("${path}/dimensions") {} }
}

abstract class RequestFieldCancelDataSourceRefreshRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
	val isAll: FieldsList<RequestField> get() = fieldsList("${path}/isAll")
	val references by lazy { object : RequestFieldDataSourceObjectReferences("${path}/references") {} }
}

abstract class RequestFieldClearBasicFilterRequest(private val path: String) : FieldsList<RequestField>(path) {
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldCopyPasteRequest(private val path: String) : FieldsList<RequestField>(path) {
	val destination by lazy { object : RequestFieldGridRange("${path}/destination") {} }
	val pasteOrientation: FieldsList<RequestField> get() = fieldsList("${path}/pasteOrientation")
	val pasteType: FieldsList<RequestField> get() = fieldsList("${path}/pasteType")
	val source by lazy { object : RequestFieldGridRange("${path}/source") {} }
}

abstract class RequestFieldCreateDeveloperMetadataRequest(private val path: String) : FieldsList<RequestField>(path) {
	val developerMetadata by lazy { object : RequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class RequestFieldCutPasteRequest(private val path: String) : FieldsList<RequestField>(path) {
	val destination by lazy { object : RequestFieldGridCoordinate("${path}/destination") {} }
	val pasteType: FieldsList<RequestField> get() = fieldsList("${path}/pasteType")
	val source by lazy { object : RequestFieldGridRange("${path}/source") {} }
}

abstract class RequestFieldDeleteBandingRequest(private val path: String) : FieldsList<RequestField>(path) {
	val bandedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/bandedRangeId")
}

abstract class RequestFieldDeleteConditionalFormatRuleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldDeleteDataSourceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RequestFieldDeleteDeveloperMetadataRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataFilter by lazy { object : RequestFieldDataFilter("${path}/dataFilter") {} }
}

abstract class RequestFieldDeleteDimensionRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldDeleteDimensionGroupRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldDeleteDuplicatesRequest(private val path: String) : FieldsList<RequestField>(path) {
	val comparisonColumns by lazy { object : RequestFieldDimensionRange("${path}/comparisonColumns") {} }
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldDeleteEmbeddedObjectRequest(private val path: String) : FieldsList<RequestField>(path) {
	val objectId: FieldsList<RequestField> get() = fieldsList("${path}/objectId")
}

abstract class RequestFieldDeleteFilterViewRequest(private val path: String) : FieldsList<RequestField>(path) {
	val filterId: FieldsList<RequestField> get() = fieldsList("${path}/filterId")
}

abstract class RequestFieldDeleteNamedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
}

abstract class RequestFieldDeleteProtectedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val protectedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/protectedRangeId")
}

abstract class RequestFieldDeleteRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val shiftDimension: FieldsList<RequestField> get() = fieldsList("${path}/shiftDimension")
}

abstract class RequestFieldDeleteSheetRequest(private val path: String) : FieldsList<RequestField>(path) {
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldDuplicateFilterViewRequest(private val path: String) : FieldsList<RequestField>(path) {
	val filterId: FieldsList<RequestField> get() = fieldsList("${path}/filterId")
}

abstract class RequestFieldDuplicateSheetRequest(private val path: String) : FieldsList<RequestField>(path) {
	val insertSheetIndex: FieldsList<RequestField> get() = fieldsList("${path}/insertSheetIndex")
	val newSheetId: FieldsList<RequestField> get() = fieldsList("${path}/newSheetId")
	val newSheetName: FieldsList<RequestField> get() = fieldsList("${path}/newSheetName")
	val sourceSheetId: FieldsList<RequestField> get() = fieldsList("${path}/sourceSheetId")
}

abstract class RequestFieldFindReplaceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val allSheets: FieldsList<RequestField> get() = fieldsList("${path}/allSheets")
	val find: FieldsList<RequestField> get() = fieldsList("${path}/find")
	val includeFormulas: FieldsList<RequestField> get() = fieldsList("${path}/includeFormulas")
	val matchCase: FieldsList<RequestField> get() = fieldsList("${path}/matchCase")
	val matchEntireCell: FieldsList<RequestField> get() = fieldsList("${path}/matchEntireCell")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val replacement: FieldsList<RequestField> get() = fieldsList("${path}/replacement")
	val searchByRegex: FieldsList<RequestField> get() = fieldsList("${path}/searchByRegex")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldInsertDimensionRequest(private val path: String) : FieldsList<RequestField>(path) {
	val inheritFromBefore: FieldsList<RequestField> get() = fieldsList("${path}/inheritFromBefore")
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldInsertRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val shiftDimension: FieldsList<RequestField> get() = fieldsList("${path}/shiftDimension")
}

abstract class RequestFieldMergeCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val mergeType: FieldsList<RequestField> get() = fieldsList("${path}/mergeType")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldMoveDimensionRequest(private val path: String) : FieldsList<RequestField>(path) {
	val destinationIndex: FieldsList<RequestField> get() = fieldsList("${path}/destinationIndex")
	val source by lazy { object : RequestFieldDimensionRange("${path}/source") {} }
}

abstract class RequestFieldPasteDataRequest(private val path: String) : FieldsList<RequestField>(path) {
	val coordinate by lazy { object : RequestFieldGridCoordinate("${path}/coordinate") {} }
	val data: FieldsList<RequestField> get() = fieldsList("${path}/data")
	val delimiter: FieldsList<RequestField> get() = fieldsList("${path}/delimiter")
	val html: FieldsList<RequestField> get() = fieldsList("${path}/html")
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldRandomizeRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldRefreshDataSourceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
	val force: FieldsList<RequestField> get() = fieldsList("${path}/force")
	val isAll: FieldsList<RequestField> get() = fieldsList("${path}/isAll")
	val references by lazy { object : RequestFieldDataSourceObjectReferences("${path}/references") {} }
}

abstract class RequestFieldRepeatCellRequest(private val path: String) : FieldsList<RequestField>(path) {
	val cell by lazy { object : RequestFieldCellData("${path}/cell") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldSetBasicFilterRequest(private val path: String) : FieldsList<RequestField>(path) {
	val filter by lazy { object : RequestFieldBasicFilter("${path}/filter") {} }
}

abstract class RequestFieldSetDataValidationRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val rule by lazy { object : RequestFieldDataValidationRule("${path}/rule") {} }
}

abstract class RequestFieldSortRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : RequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class RequestFieldTextToColumnsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val delimiter: FieldsList<RequestField> get() = fieldsList("${path}/delimiter")
	val delimiterType: FieldsList<RequestField> get() = fieldsList("${path}/delimiterType")
	val source by lazy { object : RequestFieldGridRange("${path}/source") {} }
}

abstract class RequestFieldTrimWhitespaceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldUnmergeCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldUpdateBandingRequest(private val path: String) : FieldsList<RequestField>(path) {
	val bandedRange by lazy { object : RequestFieldBandedRange("${path}/bandedRange") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
}

abstract class RequestFieldUpdateBordersRequest(private val path: String) : FieldsList<RequestField>(path) {
	val bottom by lazy { object : RequestFieldBorder("${path}/bottom") {} }
	val innerHorizontal by lazy { object : RequestFieldBorder("${path}/innerHorizontal") {} }
	val innerVertical by lazy { object : RequestFieldBorder("${path}/innerVertical") {} }
	val left by lazy { object : RequestFieldBorder("${path}/left") {} }
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val right by lazy { object : RequestFieldBorder("${path}/right") {} }
	val top by lazy { object : RequestFieldBorder("${path}/top") {} }
}

abstract class RequestFieldUpdateCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val rows by lazy { object : RequestFieldRowData("${path}/rows") {} }
	val start by lazy { object : RequestFieldGridCoordinate("${path}/start") {} }
}

abstract class RequestFieldUpdateChartSpecRequest(private val path: String) : FieldsList<RequestField>(path) {
	val chartId: FieldsList<RequestField> get() = fieldsList("${path}/chartId")
	val spec by lazy { object : RequestFieldChartSpec("${path}/spec") {} }
}

abstract class RequestFieldUpdateConditionalFormatRuleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val newIndex: FieldsList<RequestField> get() = fieldsList("${path}/newIndex")
	val rule by lazy { object : RequestFieldConditionalFormatRule("${path}/rule") {} }
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldUpdateDataSourceRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSource by lazy { object : RequestFieldDataSource("${path}/dataSource") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
}

abstract class RequestFieldUpdateDeveloperMetadataRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataFilters by lazy { object : RequestFieldDataFilter("${path}/dataFilters") {} }
	val developerMetadata by lazy { object : RequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
}

abstract class RequestFieldUpdateDimensionGroupRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dimensionGroup by lazy { object : RequestFieldDimensionGroup("${path}/dimensionGroup") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
}

abstract class RequestFieldUpdateDimensionPropertiesRequest(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceSheetRange by lazy { object : RequestFieldDataSourceSheetDimensionRange("${path}/dataSourceSheetRange") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : RequestFieldDimensionProperties("${path}/properties") {} }
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldUpdateEmbeddedObjectBorderRequest(private val path: String) : FieldsList<RequestField>(path) {
	val border by lazy { object : RequestFieldEmbeddedObjectBorder("${path}/border") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val objectId: FieldsList<RequestField> get() = fieldsList("${path}/objectId")
}

abstract class RequestFieldUpdateEmbeddedObjectPositionRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val newPosition by lazy { object : RequestFieldEmbeddedObjectPosition("${path}/newPosition") {} }
	val objectId: FieldsList<RequestField> get() = fieldsList("${path}/objectId")
}

abstract class RequestFieldUpdateFilterViewRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val filter by lazy { object : RequestFieldFilterView("${path}/filter") {} }
}

abstract class RequestFieldUpdateNamedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val namedRange by lazy { object : RequestFieldNamedRange("${path}/namedRange") {} }
}

abstract class RequestFieldUpdateProtectedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val protectedRange by lazy { object : RequestFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class RequestFieldUpdateSheetPropertiesRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : RequestFieldSheetProperties("${path}/properties") {} }
}

abstract class RequestFieldUpdateSlicerSpecRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val slicerId: FieldsList<RequestField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : RequestFieldSlicerSpec("${path}/spec") {} }
}

abstract class RequestFieldUpdateSpreadsheetPropertiesRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : RequestFieldSpreadsheetProperties("${path}/properties") {} }
}

abstract class RequestFieldBandedRange(private val path: String) : FieldsList<RequestField>(path) {
	val bandedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : RequestFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : RequestFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class RequestFieldEmbeddedChart(private val path: String) : FieldsList<RequestField>(path) {
	val border by lazy { object : RequestFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<RequestField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : RequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : RequestFieldChartSpec("${path}/spec") {} }
}

abstract class RequestFieldConditionalFormatRule(private val path: String) : FieldsList<RequestField>(path) {
	val booleanRule by lazy { object : RequestFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : RequestFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : RequestFieldGridRange("${path}/ranges") {} }
}

abstract class RequestFieldDataSource(private val path: String) : FieldsList<RequestField>(path) {
	val calculatedColumns by lazy { object : RequestFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : RequestFieldDataSourceSpec("${path}/spec") {} }
}

abstract class RequestFieldDimensionRange(private val path: String) : FieldsList<RequestField>(path) {
	val dimension: FieldsList<RequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<RequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<RequestField> get() = fieldsList("${path}/startIndex")
}

abstract class RequestFieldFilterView(private val path: String) : FieldsList<RequestField>(path) {
	val criteria by lazy { object : RequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : RequestFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<RequestField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : RequestFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
}

abstract class RequestFieldNamedRange(private val path: String) : FieldsList<RequestField>(path) {
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldProtectedRange(private val path: String) : FieldsList<RequestField>(path) {
	val description: FieldsList<RequestField> get() = fieldsList("${path}/description")
	val editors by lazy { object : RequestFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<RequestField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : RequestFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<RequestField> get() = fieldsList("${path}/warningOnly")
}

abstract class RequestFieldSheetProperties(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceSheetProperties by lazy { object : RequestFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : RequestFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<RequestField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<RequestField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<RequestField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : RequestFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : RequestFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
}

abstract class RequestFieldSlicer(private val path: String) : FieldsList<RequestField>(path) {
	val position by lazy { object : RequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<RequestField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : RequestFieldSlicerSpec("${path}/spec") {} }
}

abstract class RequestFieldRowData(private val path: String) : FieldsList<RequestField>(path) {
	val values by lazy { object : RequestFieldCellData("${path}/values") {} }
}

abstract class RequestFieldGridRange(private val path: String) : FieldsList<RequestField>(path) {
	val endColumnIndex: FieldsList<RequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<RequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<RequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<RequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class RequestFieldSourceAndDestination(private val path: String) : FieldsList<RequestField>(path) {
	val dimension: FieldsList<RequestField> get() = fieldsList("${path}/dimension")
	val fillLength: FieldsList<RequestField> get() = fieldsList("${path}/fillLength")
	val source by lazy { object : RequestFieldGridRange("${path}/source") {} }
}

abstract class RequestFieldDataSourceSheetDimensionRange(private val path: String) : FieldsList<RequestField>(path) {
	val columnReferences by lazy { object : RequestFieldDataSourceColumnReference("${path}/columnReferences") {} }
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldDataSourceObjectReferences(private val path: String) : FieldsList<RequestField>(path) {
	val references by lazy { object : RequestFieldDataSourceObjectReference("${path}/references") {} }
}

abstract class RequestFieldDeveloperMetadata(private val path: String) : FieldsList<RequestField>(path) {
	val location by lazy { object : RequestFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<RequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<RequestField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<RequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<RequestField> get() = fieldsList("${path}/visibility")
}

abstract class RequestFieldGridCoordinate(private val path: String) : FieldsList<RequestField>(path) {
	val columnIndex: FieldsList<RequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<RequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldDataFilter(private val path: String) : FieldsList<RequestField>(path) {
	val a1Range: FieldsList<RequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : RequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : RequestFieldGridRange("${path}/gridRange") {} }
}

abstract class RequestFieldCellData(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceFormula by lazy { object : RequestFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : RequestFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : RequestFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : RequestFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : RequestFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<RequestField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<RequestField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<RequestField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : RequestFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : RequestFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : RequestFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : RequestFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class RequestFieldBasicFilter(private val path: String) : FieldsList<RequestField>(path) {
	val criteria by lazy { object : RequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : RequestFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : RequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class RequestFieldDataValidationRule(private val path: String) : FieldsList<RequestField>(path) {
	val condition by lazy { object : RequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<RequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<RequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<RequestField> get() = fieldsList("${path}/strict")
}

abstract class RequestFieldSortSpec(private val path: String) : FieldsList<RequestField>(path) {
	val backgroundColor by lazy { object : RequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<RequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : RequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<RequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class RequestFieldBorder(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<RequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<RequestField> get() = fieldsList("${path}/width")
}

abstract class RequestFieldChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val altText: FieldsList<RequestField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : RequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : RequestFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : RequestFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : RequestFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : RequestFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : RequestFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<RequestField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<RequestField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : RequestFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<RequestField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : RequestFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : RequestFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : RequestFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : RequestFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<RequestField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : RequestFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : RequestFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : RequestFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : RequestFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : RequestFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : RequestFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class RequestFieldDimensionGroup(private val path: String) : FieldsList<RequestField>(path) {
	val collapsed: FieldsList<RequestField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<RequestField> get() = fieldsList("${path}/depth")
	val range by lazy { object : RequestFieldDimensionRange("${path}/range") {} }
}

abstract class RequestFieldDimensionProperties(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : RequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<RequestField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<RequestField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<RequestField> get() = fieldsList("${path}/pixelSize")
}

abstract class RequestFieldEmbeddedObjectBorder(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
}

abstract class RequestFieldEmbeddedObjectPosition(private val path: String) : FieldsList<RequestField>(path) {
	val newSheet: FieldsList<RequestField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : RequestFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldSlicerSpec(private val path: String) : FieldsList<RequestField>(path) {
	val applyToPivotTables: FieldsList<RequestField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : RequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<RequestField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : RequestFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : RequestFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<RequestField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
}

abstract class RequestFieldSpreadsheetProperties(private val path: String) : FieldsList<RequestField>(path) {
	val autoRecalc: FieldsList<RequestField> get() = fieldsList("${path}/autoRecalc")
	val defaultFormat by lazy { object : RequestFieldCellFormat("${path}/defaultFormat") {} }
	val importFunctionsExternalUrlAccessAllowed: FieldsList<RequestField> get() = fieldsList("${path}/importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings by lazy { object : RequestFieldIterativeCalculationSettings("${path}/iterativeCalculationSettings") {} }
	val locale: FieldsList<RequestField> get() = fieldsList("${path}/locale")
	val spreadsheetTheme by lazy { object : RequestFieldSpreadsheetTheme("${path}/spreadsheetTheme") {} }
	val timeZone: FieldsList<RequestField> get() = fieldsList("${path}/timeZone")
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
}

abstract class RequestFieldBandingProperties(private val path: String) : FieldsList<RequestField>(path) {
	val firstBandColor by lazy { object : RequestFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : RequestFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : RequestFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : RequestFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : RequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : RequestFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : RequestFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : RequestFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class RequestFieldBooleanRule(private val path: String) : FieldsList<RequestField>(path) {
	val condition by lazy { object : RequestFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : RequestFieldCellFormat("${path}/format") {} }
}

abstract class RequestFieldGradientRule(private val path: String) : FieldsList<RequestField>(path) {
	val maxpoint by lazy { object : RequestFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : RequestFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : RequestFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class RequestFieldDataSourceColumn(private val path: String) : FieldsList<RequestField>(path) {
	val formula: FieldsList<RequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : RequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class RequestFieldDataSourceSpec(private val path: String) : FieldsList<RequestField>(path) {
	val bigQuery by lazy { object : RequestFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : RequestFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : RequestFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class RequestFieldFilterCriteria(private val path: String) : FieldsList<RequestField>(path) {
	val condition by lazy { object : RequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<RequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : RequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : RequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class RequestFieldFilterSpec(private val path: String) : FieldsList<RequestField>(path) {
	val columnIndex: FieldsList<RequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RequestFieldEditors(private val path: String) : FieldsList<RequestField>(path) {
	val domainUsersCanEdit: FieldsList<RequestField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<RequestField> get() = fieldsList("${path}/groups")
	val users: FieldsList<RequestField> get() = fieldsList("${path}/users")
}

abstract class RequestFieldDataSourceSheetProperties(private val path: String) : FieldsList<RequestField>(path) {
	val columns by lazy { object : RequestFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : RequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RequestFieldGridProperties(private val path: String) : FieldsList<RequestField>(path) {
	val columnCount: FieldsList<RequestField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<RequestField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<RequestField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<RequestField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<RequestField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<RequestField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<RequestField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class RequestFieldColor(private val path: String) : FieldsList<RequestField>(path) {
	val alpha: FieldsList<RequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<RequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<RequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<RequestField> get() = fieldsList("${path}/red")
}

abstract class RequestFieldColorStyle(private val path: String) : FieldsList<RequestField>(path) {
	val rgbColor by lazy { object : RequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<RequestField> get() = fieldsList("${path}/themeColor")
}

abstract class RequestFieldDataSourceColumnReference(private val path: String) : FieldsList<RequestField>(path) {
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
}

abstract class RequestFieldDataSourceObjectReference(private val path: String) : FieldsList<RequestField>(path) {
	val chartId: FieldsList<RequestField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : RequestFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : RequestFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : RequestFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
}

abstract class RequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<RequestField>(path) {
	val dimensionRange by lazy { object : RequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<RequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<RequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<RequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class RequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<RequestField>(path) {
	val locationMatchingStrategy: FieldsList<RequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<RequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<RequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<RequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : RequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<RequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<RequestField> get() = fieldsList("${path}/visibility")
}

abstract class RequestFieldDataSourceFormula(private val path: String) : FieldsList<RequestField>(path) {
	val dataExecutionStatus by lazy { object : RequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RequestFieldDataSourceTable(private val path: String) : FieldsList<RequestField>(path) {
	val columnSelectionType: FieldsList<RequestField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : RequestFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : RequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RequestFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<RequestField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : RequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class RequestFieldCellFormat(private val path: String) : FieldsList<RequestField>(path) {
	val backgroundColor by lazy { object : RequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : RequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<RequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<RequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : RequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : RequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<RequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : RequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<RequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<RequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class RequestFieldExtendedValue(private val path: String) : FieldsList<RequestField>(path) {
	val boolValue: FieldsList<RequestField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : RequestFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<RequestField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<RequestField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<RequestField> get() = fieldsList("${path}/stringValue")
}

abstract class RequestFieldPivotTable(private val path: String) : FieldsList<RequestField>(path) {
	val columns by lazy { object : RequestFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : RequestFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : RequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RequestFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : RequestFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : RequestFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<RequestField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : RequestFieldPivotValue("${path}/values") {} }
}

abstract class RequestFieldTextFormatRun(private val path: String) : FieldsList<RequestField>(path) {
	val format by lazy { object : RequestFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<RequestField> get() = fieldsList("${path}/startIndex")
}

abstract class RequestFieldBooleanCondition(private val path: String) : FieldsList<RequestField>(path) {
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : RequestFieldConditionValue("${path}/values") {} }
}

abstract class RequestFieldBasicChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val axis by lazy { object : RequestFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<RequestField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<RequestField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : RequestFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<RequestField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<RequestField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<RequestField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<RequestField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : RequestFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<RequestField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<RequestField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : RequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class RequestFieldBubbleChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val bubbleBorderColor by lazy { object : RequestFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : RequestFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : RequestFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<RequestField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<RequestField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<RequestField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : RequestFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : RequestFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : RequestFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : RequestFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<RequestField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : RequestFieldChartData("${path}/series") {} }
}

abstract class RequestFieldCandlestickChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val data by lazy { object : RequestFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : RequestFieldCandlestickDomain("${path}/domain") {} }
}

abstract class RequestFieldDataSourceChartProperties(private val path: String) : FieldsList<RequestField>(path) {
	val dataExecutionStatus by lazy { object : RequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RequestFieldHistogramChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val bucketSize: FieldsList<RequestField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<RequestField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<RequestField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : RequestFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<RequestField> get() = fieldsList("${path}/showItemDividers")
}

abstract class RequestFieldOrgChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val labels by lazy { object : RequestFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : RequestFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : RequestFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<RequestField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : RequestFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : RequestFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : RequestFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : RequestFieldChartData("${path}/tooltips") {} }
}

abstract class RequestFieldPieChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val domain by lazy { object : RequestFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<RequestField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<RequestField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : RequestFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<RequestField> get() = fieldsList("${path}/threeDimensional")
}

abstract class RequestFieldScorecardChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val aggregateType: FieldsList<RequestField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : RequestFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : RequestFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : RequestFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : RequestFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : RequestFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<RequestField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<RequestField> get() = fieldsList("${path}/scaleFactor")
}

abstract class RequestFieldTextFormat(private val path: String) : FieldsList<RequestField>(path) {
	val bold: FieldsList<RequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<RequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<RequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : RequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<RequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : RequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<RequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<RequestField> get() = fieldsList("${path}/underline")
}

abstract class RequestFieldTextPosition(private val path: String) : FieldsList<RequestField>(path) {
	val horizontalAlignment: FieldsList<RequestField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class RequestFieldTreemapChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val colorData by lazy { object : RequestFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : RequestFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : RequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : RequestFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<RequestField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<RequestField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : RequestFieldChartData("${path}/labels") {} }
	val levels: FieldsList<RequestField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<RequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<RequestField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : RequestFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : RequestFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class RequestFieldWaterfallChartSpec(private val path: String) : FieldsList<RequestField>(path) {
	val connectorLineStyle by lazy { object : RequestFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : RequestFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<RequestField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<RequestField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : RequestFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<RequestField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : RequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class RequestFieldOverlayPosition(private val path: String) : FieldsList<RequestField>(path) {
	val anchorCell by lazy { object : RequestFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<RequestField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<RequestField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<RequestField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<RequestField> get() = fieldsList("${path}/widthPixels")
}

abstract class RequestFieldIterativeCalculationSettings(private val path: String) : FieldsList<RequestField>(path) {
	val convergenceThreshold: FieldsList<RequestField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<RequestField> get() = fieldsList("${path}/maxIterations")
}

abstract class RequestFieldSpreadsheetTheme(private val path: String) : FieldsList<RequestField>(path) {
	val primaryFontFamily: FieldsList<RequestField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : RequestFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class RequestFieldInterpolationPoint(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
	val value: FieldsList<RequestField> get() = fieldsList("${path}/value")
}

abstract class RequestFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<RequestField>(path) {
	val projectId: FieldsList<RequestField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : RequestFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : RequestFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class RequestFieldLookerDataSourceSpec(private val path: String) : FieldsList<RequestField>(path) {
	val explore: FieldsList<RequestField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<RequestField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<RequestField> get() = fieldsList("${path}/model")
}

abstract class RequestFieldDataSourceParameter(private val path: String) : FieldsList<RequestField>(path) {
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : RequestFieldGridRange("${path}/range") {} }
}

abstract class RequestFieldDataExecutionStatus(private val path: String) : FieldsList<RequestField>(path) {
	val errorCode: FieldsList<RequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<RequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<RequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<RequestField> get() = fieldsList("${path}/state")
}

abstract class RequestFieldBorders(private val path: String) : FieldsList<RequestField>(path) {
	val bottom by lazy { object : RequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : RequestFieldBorder("${path}/left") {} }
	val right by lazy { object : RequestFieldBorder("${path}/right") {} }
	val top by lazy { object : RequestFieldBorder("${path}/top") {} }
}

abstract class RequestFieldNumberFormat(private val path: String) : FieldsList<RequestField>(path) {
	val pattern: FieldsList<RequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldPadding(private val path: String) : FieldsList<RequestField>(path) {
	val bottom: FieldsList<RequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<RequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<RequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<RequestField> get() = fieldsList("${path}/top")
}

abstract class RequestFieldTextRotation(private val path: String) : FieldsList<RequestField>(path) {
	val angle: FieldsList<RequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<RequestField> get() = fieldsList("${path}/vertical")
}

abstract class RequestFieldErrorValue(private val path: String) : FieldsList<RequestField>(path) {
	val message: FieldsList<RequestField> get() = fieldsList("${path}/message")
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldPivotGroup(private val path: String) : FieldsList<RequestField>(path) {
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : RequestFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : RequestFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<RequestField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<RequestField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<RequestField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<RequestField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<RequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : RequestFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : RequestFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class RequestFieldPivotFilterCriteria(private val path: String) : FieldsList<RequestField>(path) {
	val condition by lazy { object : RequestFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<RequestField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<RequestField> get() = fieldsList("${path}/visibleValues")
}

abstract class RequestFieldPivotFilterSpec(private val path: String) : FieldsList<RequestField>(path) {
	val columnOffsetIndex: FieldsList<RequestField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RequestFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RequestFieldPivotValue(private val path: String) : FieldsList<RequestField>(path) {
	val calculatedDisplayType: FieldsList<RequestField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<RequestField> get() = fieldsList("${path}/formula")
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<RequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<RequestField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class RequestFieldConditionValue(private val path: String) : FieldsList<RequestField>(path) {
	val relativeDate: FieldsList<RequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<RequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class RequestFieldBasicChartAxis(private val path: String) : FieldsList<RequestField>(path) {
	val format by lazy { object : RequestFieldTextFormat("${path}/format") {} }
	val position: FieldsList<RequestField> get() = fieldsList("${path}/position")
	val title: FieldsList<RequestField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : RequestFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : RequestFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class RequestFieldBasicChartDomain(private val path: String) : FieldsList<RequestField>(path) {
	val domain by lazy { object : RequestFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<RequestField> get() = fieldsList("${path}/reversed")
}

abstract class RequestFieldBasicChartSeries(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : RequestFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : RequestFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : RequestFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : RequestFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : RequestFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<RequestField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldDataLabel(private val path: String) : FieldsList<RequestField>(path) {
	val customLabelData by lazy { object : RequestFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<RequestField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldChartData(private val path: String) : FieldsList<RequestField>(path) {
	val aggregateType: FieldsList<RequestField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : RequestFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : RequestFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : RequestFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class RequestFieldCandlestickData(private val path: String) : FieldsList<RequestField>(path) {
	val closeSeries by lazy { object : RequestFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : RequestFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : RequestFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : RequestFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class RequestFieldCandlestickDomain(private val path: String) : FieldsList<RequestField>(path) {
	val data by lazy { object : RequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<RequestField> get() = fieldsList("${path}/reversed")
}

abstract class RequestFieldHistogramSeries(private val path: String) : FieldsList<RequestField>(path) {
	val barColor by lazy { object : RequestFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : RequestFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : RequestFieldChartData("${path}/data") {} }
}

abstract class RequestFieldBaselineValueFormat(private val path: String) : FieldsList<RequestField>(path) {
	val comparisonType: FieldsList<RequestField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<RequestField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : RequestFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : RequestFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : RequestFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : RequestFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : RequestFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class RequestFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<RequestField>(path) {
	val prefix: FieldsList<RequestField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<RequestField> get() = fieldsList("${path}/suffix")
}

abstract class RequestFieldKeyValueFormat(private val path: String) : FieldsList<RequestField>(path) {
	val position by lazy { object : RequestFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : RequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class RequestFieldLink(private val path: String) : FieldsList<RequestField>(path) {
	val uri: FieldsList<RequestField> get() = fieldsList("${path}/uri")
}

abstract class RequestFieldTreemapChartColorScale(private val path: String) : FieldsList<RequestField>(path) {
	val maxValueColor by lazy { object : RequestFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : RequestFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : RequestFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : RequestFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : RequestFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : RequestFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : RequestFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : RequestFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class RequestFieldLineStyle(private val path: String) : FieldsList<RequestField>(path) {
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
	val width: FieldsList<RequestField> get() = fieldsList("${path}/width")
}

abstract class RequestFieldWaterfallChartDomain(private val path: String) : FieldsList<RequestField>(path) {
	val data by lazy { object : RequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<RequestField> get() = fieldsList("${path}/reversed")
}

abstract class RequestFieldWaterfallChartSeries(private val path: String) : FieldsList<RequestField>(path) {
	val customSubtotals by lazy { object : RequestFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : RequestFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : RequestFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<RequestField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : RequestFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : RequestFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : RequestFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class RequestFieldThemeColorPair(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<RequestField> get() = fieldsList("${path}/colorType")
}

abstract class RequestFieldBigQueryQuerySpec(private val path: String) : FieldsList<RequestField>(path) {
	val rawQuery: FieldsList<RequestField> get() = fieldsList("${path}/rawQuery")
}

abstract class RequestFieldBigQueryTableSpec(private val path: String) : FieldsList<RequestField>(path) {
	val datasetId: FieldsList<RequestField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<RequestField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<RequestField> get() = fieldsList("${path}/tableProjectId")
}

abstract class RequestFieldPivotGroupLimit(private val path: String) : FieldsList<RequestField>(path) {
	val applyOrder: FieldsList<RequestField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<RequestField> get() = fieldsList("${path}/countLimit")
}

abstract class RequestFieldPivotGroupRule(private val path: String) : FieldsList<RequestField>(path) {
	val dateTimeRule by lazy { object : RequestFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : RequestFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : RequestFieldManualRule("${path}/manualRule") {} }
}

abstract class RequestFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<RequestField>(path) {
	val buckets by lazy { object : RequestFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<RequestField> get() = fieldsList("${path}/valuesIndex")
}

abstract class RequestFieldPivotGroupValueMetadata(private val path: String) : FieldsList<RequestField>(path) {
	val collapsed: FieldsList<RequestField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : RequestFieldExtendedValue("${path}/value") {} }
}

abstract class RequestFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<RequestField>(path) {
	val viewWindowMax: FieldsList<RequestField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<RequestField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<RequestField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class RequestFieldPointStyle(private val path: String) : FieldsList<RequestField>(path) {
	val shape: FieldsList<RequestField> get() = fieldsList("${path}/shape")
	val size: FieldsList<RequestField> get() = fieldsList("${path}/size")
}

abstract class RequestFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : RequestFieldPointStyle("${path}/pointStyle") {} }
}

abstract class RequestFieldChartGroupRule(private val path: String) : FieldsList<RequestField>(path) {
	val dateTimeRule by lazy { object : RequestFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : RequestFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class RequestFieldChartSourceRange(private val path: String) : FieldsList<RequestField>(path) {
	val sources by lazy { object : RequestFieldGridRange("${path}/sources") {} }
}

abstract class RequestFieldCandlestickSeries(private val path: String) : FieldsList<RequestField>(path) {
	val data by lazy { object : RequestFieldChartData("${path}/data") {} }
}

abstract class RequestFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<RequestField>(path) {
	val dataIsSubtotal: FieldsList<RequestField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<RequestField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<RequestField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class RequestFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RequestFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<RequestField> get() = fieldsList("${path}/label")
}

abstract class RequestFieldDateTimeRule(private val path: String) : FieldsList<RequestField>(path) {
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldHistogramRule(private val path: String) : FieldsList<RequestField>(path) {
	val end: FieldsList<RequestField> get() = fieldsList("${path}/end")
	val interval: FieldsList<RequestField> get() = fieldsList("${path}/interval")
	val start: FieldsList<RequestField> get() = fieldsList("${path}/start")
}

abstract class RequestFieldManualRule(private val path: String) : FieldsList<RequestField>(path) {
	val groups by lazy { object : RequestFieldManualRuleGroup("${path}/groups") {} }
}

abstract class RequestFieldChartDateTimeRule(private val path: String) : FieldsList<RequestField>(path) {
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldChartHistogramRule(private val path: String) : FieldsList<RequestField>(path) {
	val intervalSize: FieldsList<RequestField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<RequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<RequestField> get() = fieldsList("${path}/minValue")
}

abstract class RequestFieldManualRuleGroup(private val path: String) : FieldsList<RequestField>(path) {
	val groupName by lazy { object : RequestFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : RequestFieldExtendedValue("${path}/items") {} }
}

