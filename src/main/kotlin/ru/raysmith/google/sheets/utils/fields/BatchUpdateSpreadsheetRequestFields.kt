package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateSpreadsheetRequestField : Field

object BatchUpdateSpreadsheetRequestFields {
    val ALL: FieldsList<BatchUpdateSpreadsheetRequestField> = fieldsList("*")
	val includeSpreadsheetInResponse: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("includeSpreadsheetInResponse")
	val requests = object : BatchUpdateSpreadsheetRequestFieldRequest("requests") {}
	val responseIncludeGridData: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("responseIncludeGridData")
	val responseRanges: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("responseRanges")
}

abstract class BatchUpdateSpreadsheetRequestFieldRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val addBanding by lazy { object : BatchUpdateSpreadsheetRequestFieldAddBandingRequest("${path}/addBanding") {} }
	val addChart by lazy { object : BatchUpdateSpreadsheetRequestFieldAddChartRequest("${path}/addChart") {} }
	val addConditionalFormatRule by lazy { object : BatchUpdateSpreadsheetRequestFieldAddConditionalFormatRuleRequest("${path}/addConditionalFormatRule") {} }
	val addDataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldAddDataSourceRequest("${path}/addDataSource") {} }
	val addDimensionGroup by lazy { object : BatchUpdateSpreadsheetRequestFieldAddDimensionGroupRequest("${path}/addDimensionGroup") {} }
	val addFilterView by lazy { object : BatchUpdateSpreadsheetRequestFieldAddFilterViewRequest("${path}/addFilterView") {} }
	val addNamedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldAddNamedRangeRequest("${path}/addNamedRange") {} }
	val addProtectedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldAddProtectedRangeRequest("${path}/addProtectedRange") {} }
	val addSheet by lazy { object : BatchUpdateSpreadsheetRequestFieldAddSheetRequest("${path}/addSheet") {} }
	val addSlicer by lazy { object : BatchUpdateSpreadsheetRequestFieldAddSlicerRequest("${path}/addSlicer") {} }
	val appendCells by lazy { object : BatchUpdateSpreadsheetRequestFieldAppendCellsRequest("${path}/appendCells") {} }
	val appendDimension by lazy { object : BatchUpdateSpreadsheetRequestFieldAppendDimensionRequest("${path}/appendDimension") {} }
	val autoFill by lazy { object : BatchUpdateSpreadsheetRequestFieldAutoFillRequest("${path}/autoFill") {} }
	val autoResizeDimensions by lazy { object : BatchUpdateSpreadsheetRequestFieldAutoResizeDimensionsRequest("${path}/autoResizeDimensions") {} }
	val cancelDataSourceRefresh by lazy { object : BatchUpdateSpreadsheetRequestFieldCancelDataSourceRefreshRequest("${path}/cancelDataSourceRefresh") {} }
	val clearBasicFilter by lazy { object : BatchUpdateSpreadsheetRequestFieldClearBasicFilterRequest("${path}/clearBasicFilter") {} }
	val copyPaste by lazy { object : BatchUpdateSpreadsheetRequestFieldCopyPasteRequest("${path}/copyPaste") {} }
	val createDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldCreateDeveloperMetadataRequest("${path}/createDeveloperMetadata") {} }
	val cutPaste by lazy { object : BatchUpdateSpreadsheetRequestFieldCutPasteRequest("${path}/cutPaste") {} }
	val deleteBanding by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteBandingRequest("${path}/deleteBanding") {} }
	val deleteConditionalFormatRule by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteConditionalFormatRuleRequest("${path}/deleteConditionalFormatRule") {} }
	val deleteDataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteDataSourceRequest("${path}/deleteDataSource") {} }
	val deleteDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteDeveloperMetadataRequest("${path}/deleteDeveloperMetadata") {} }
	val deleteDimension by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteDimensionRequest("${path}/deleteDimension") {} }
	val deleteDimensionGroup by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteDimensionGroupRequest("${path}/deleteDimensionGroup") {} }
	val deleteDuplicates by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteDuplicatesRequest("${path}/deleteDuplicates") {} }
	val deleteEmbeddedObject by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteEmbeddedObjectRequest("${path}/deleteEmbeddedObject") {} }
	val deleteFilterView by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteFilterViewRequest("${path}/deleteFilterView") {} }
	val deleteNamedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteNamedRangeRequest("${path}/deleteNamedRange") {} }
	val deleteProtectedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteProtectedRangeRequest("${path}/deleteProtectedRange") {} }
	val deleteRange by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteRangeRequest("${path}/deleteRange") {} }
	val deleteSheet by lazy { object : BatchUpdateSpreadsheetRequestFieldDeleteSheetRequest("${path}/deleteSheet") {} }
	val duplicateFilterView by lazy { object : BatchUpdateSpreadsheetRequestFieldDuplicateFilterViewRequest("${path}/duplicateFilterView") {} }
	val duplicateSheet by lazy { object : BatchUpdateSpreadsheetRequestFieldDuplicateSheetRequest("${path}/duplicateSheet") {} }
	val findReplace by lazy { object : BatchUpdateSpreadsheetRequestFieldFindReplaceRequest("${path}/findReplace") {} }
	val insertDimension by lazy { object : BatchUpdateSpreadsheetRequestFieldInsertDimensionRequest("${path}/insertDimension") {} }
	val insertRange by lazy { object : BatchUpdateSpreadsheetRequestFieldInsertRangeRequest("${path}/insertRange") {} }
	val mergeCells by lazy { object : BatchUpdateSpreadsheetRequestFieldMergeCellsRequest("${path}/mergeCells") {} }
	val moveDimension by lazy { object : BatchUpdateSpreadsheetRequestFieldMoveDimensionRequest("${path}/moveDimension") {} }
	val pasteData by lazy { object : BatchUpdateSpreadsheetRequestFieldPasteDataRequest("${path}/pasteData") {} }
	val randomizeRange by lazy { object : BatchUpdateSpreadsheetRequestFieldRandomizeRangeRequest("${path}/randomizeRange") {} }
	val refreshDataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldRefreshDataSourceRequest("${path}/refreshDataSource") {} }
	val repeatCell by lazy { object : BatchUpdateSpreadsheetRequestFieldRepeatCellRequest("${path}/repeatCell") {} }
	val setBasicFilter by lazy { object : BatchUpdateSpreadsheetRequestFieldSetBasicFilterRequest("${path}/setBasicFilter") {} }
	val setDataValidation by lazy { object : BatchUpdateSpreadsheetRequestFieldSetDataValidationRequest("${path}/setDataValidation") {} }
	val sortRange by lazy { object : BatchUpdateSpreadsheetRequestFieldSortRangeRequest("${path}/sortRange") {} }
	val textToColumns by lazy { object : BatchUpdateSpreadsheetRequestFieldTextToColumnsRequest("${path}/textToColumns") {} }
	val trimWhitespace by lazy { object : BatchUpdateSpreadsheetRequestFieldTrimWhitespaceRequest("${path}/trimWhitespace") {} }
	val unmergeCells by lazy { object : BatchUpdateSpreadsheetRequestFieldUnmergeCellsRequest("${path}/unmergeCells") {} }
	val updateBanding by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateBandingRequest("${path}/updateBanding") {} }
	val updateBorders by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateBordersRequest("${path}/updateBorders") {} }
	val updateCells by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateCellsRequest("${path}/updateCells") {} }
	val updateChartSpec by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateChartSpecRequest("${path}/updateChartSpec") {} }
	val updateConditionalFormatRule by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateConditionalFormatRuleRequest("${path}/updateConditionalFormatRule") {} }
	val updateDataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateDataSourceRequest("${path}/updateDataSource") {} }
	val updateDeveloperMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateDeveloperMetadataRequest("${path}/updateDeveloperMetadata") {} }
	val updateDimensionGroup by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateDimensionGroupRequest("${path}/updateDimensionGroup") {} }
	val updateDimensionProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateDimensionPropertiesRequest("${path}/updateDimensionProperties") {} }
	val updateEmbeddedObjectBorder by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateEmbeddedObjectBorderRequest("${path}/updateEmbeddedObjectBorder") {} }
	val updateEmbeddedObjectPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateEmbeddedObjectPositionRequest("${path}/updateEmbeddedObjectPosition") {} }
	val updateFilterView by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateFilterViewRequest("${path}/updateFilterView") {} }
	val updateNamedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateNamedRangeRequest("${path}/updateNamedRange") {} }
	val updateProtectedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateProtectedRangeRequest("${path}/updateProtectedRange") {} }
	val updateSheetProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateSheetPropertiesRequest("${path}/updateSheetProperties") {} }
	val updateSlicerSpec by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateSlicerSpecRequest("${path}/updateSlicerSpec") {} }
	val updateSpreadsheetProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldUpdateSpreadsheetPropertiesRequest("${path}/updateSpreadsheetProperties") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddBandingRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bandedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldBandedRange("${path}/bandedRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddChartRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val chart by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedChart("${path}/chart") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddConditionalFormatRuleRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val index: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/index")
	val rule by lazy { object : BatchUpdateSpreadsheetRequestFieldConditionalFormatRule("${path}/rule") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddDataSourceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSource("${path}/dataSource") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddDimensionGroupRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddFilterViewRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val filter by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterView("${path}/filter") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddNamedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val namedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldNamedRange("${path}/namedRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddProtectedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val protectedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddSheetRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val properties by lazy { object : BatchUpdateSpreadsheetRequestFieldSheetProperties("${path}/properties") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAddSlicerRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val slicer by lazy { object : BatchUpdateSpreadsheetRequestFieldSlicer("${path}/slicer") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldAppendCellsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val rows by lazy { object : BatchUpdateSpreadsheetRequestFieldRowData("${path}/rows") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldAppendDimensionRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dimension: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dimension")
	val length: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/length")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldAutoFillRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val sourceAndDestination by lazy { object : BatchUpdateSpreadsheetRequestFieldSourceAndDestination("${path}/sourceAndDestination") {} }
	val useAlternateSeries: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/useAlternateSeries")
}

abstract class BatchUpdateSpreadsheetRequestFieldAutoResizeDimensionsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceSheetDimensions by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceSheetDimensionRange("${path}/dataSourceSheetDimensions") {} }
	val dimensions by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/dimensions") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCancelDataSourceRefreshRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
	val isAll: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/isAll")
	val references by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceObjectReferences("${path}/references") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldClearBasicFilterRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldCopyPasteRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val destination by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/destination") {} }
	val pasteOrientation: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pasteOrientation")
	val pasteType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pasteType")
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/source") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCreateDeveloperMetadataRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCutPasteRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val destination by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/destination") {} }
	val pasteType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pasteType")
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/source") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteBandingRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bandedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bandedRangeId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteConditionalFormatRuleRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val index: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/index")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteDataSourceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteDeveloperMetadataRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataFilter by lazy { object : BatchUpdateSpreadsheetRequestFieldDataFilter("${path}/dataFilter") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteDimensionRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteDimensionGroupRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteDuplicatesRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val comparisonColumns by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/comparisonColumns") {} }
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteEmbeddedObjectRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val objectId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/objectId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteFilterViewRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val filterId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/filterId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteNamedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/namedRangeId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteProtectedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val protectedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/protectedRangeId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val shiftDimension: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/shiftDimension")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeleteSheetRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDuplicateFilterViewRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val filterId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/filterId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDuplicateSheetRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val insertSheetIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/insertSheetIndex")
	val newSheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/newSheetId")
	val newSheetName: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/newSheetName")
	val sourceSheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sourceSheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldFindReplaceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val allSheets: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/allSheets")
	val find: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/find")
	val includeFormulas: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/includeFormulas")
	val matchCase: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/matchCase")
	val matchEntireCell: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/matchEntireCell")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val replacement: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/replacement")
	val searchByRegex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/searchByRegex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldInsertDimensionRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val inheritFromBefore: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/inheritFromBefore")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldInsertRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val shiftDimension: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/shiftDimension")
}

abstract class BatchUpdateSpreadsheetRequestFieldMergeCellsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val mergeType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/mergeType")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldMoveDimensionRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val destinationIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/destinationIndex")
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/source") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldPasteDataRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val coordinate by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/coordinate") {} }
	val data: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/data")
	val delimiter: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/delimiter")
	val html: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/html")
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldRandomizeRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldRefreshDataSourceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
	val force: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/force")
	val isAll: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/isAll")
	val references by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceObjectReferences("${path}/references") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldRepeatCellRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val cell by lazy { object : BatchUpdateSpreadsheetRequestFieldCellData("${path}/cell") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldSetBasicFilterRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val filter by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicFilter("${path}/filter") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldSetDataValidationRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val rule by lazy { object : BatchUpdateSpreadsheetRequestFieldDataValidationRule("${path}/rule") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldSortRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldTextToColumnsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val delimiter: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/delimiter")
	val delimiterType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/delimiterType")
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/source") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldTrimWhitespaceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUnmergeCellsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateBandingRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bandedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldBandedRange("${path}/bandedRange") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateBordersRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bottom by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/bottom") {} }
	val innerHorizontal by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/innerHorizontal") {} }
	val innerVertical by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/innerVertical") {} }
	val left by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/left") {} }
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val right by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/top") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateCellsRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val rows by lazy { object : BatchUpdateSpreadsheetRequestFieldRowData("${path}/rows") {} }
	val start by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/start") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateChartSpecRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val chartId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/chartId")
	val spec by lazy { object : BatchUpdateSpreadsheetRequestFieldChartSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateConditionalFormatRuleRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val index: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/index")
	val newIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/newIndex")
	val rule by lazy { object : BatchUpdateSpreadsheetRequestFieldConditionalFormatRule("${path}/rule") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateDataSourceRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSource by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSource("${path}/dataSource") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateDeveloperMetadataRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataFilters by lazy { object : BatchUpdateSpreadsheetRequestFieldDataFilter("${path}/dataFilters") {} }
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateDimensionGroupRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dimensionGroup by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionGroup("${path}/dimensionGroup") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateDimensionPropertiesRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceSheetRange by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceSheetDimensionRange("${path}/dataSourceSheetRange") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionProperties("${path}/properties") {} }
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateEmbeddedObjectBorderRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val border by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedObjectBorder("${path}/border") {} }
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val objectId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/objectId")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateEmbeddedObjectPositionRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val newPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedObjectPosition("${path}/newPosition") {} }
	val objectId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/objectId")
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateFilterViewRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val filter by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterView("${path}/filter") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateNamedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val namedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldNamedRange("${path}/namedRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateProtectedRangeRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val protectedRange by lazy { object : BatchUpdateSpreadsheetRequestFieldProtectedRange("${path}/protectedRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateSheetPropertiesRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : BatchUpdateSpreadsheetRequestFieldSheetProperties("${path}/properties") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateSlicerSpecRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val slicerId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : BatchUpdateSpreadsheetRequestFieldSlicerSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldUpdateSpreadsheetPropertiesRequest(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val fields: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fields")
	val properties by lazy { object : BatchUpdateSpreadsheetRequestFieldSpreadsheetProperties("${path}/properties") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBandedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bandedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldEmbeddedChart(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val border by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedObjectBorder("${path}/border") {} }
	val chartId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/chartId")
	val position by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val spec by lazy { object : BatchUpdateSpreadsheetRequestFieldChartSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldConditionalFormatRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val booleanRule by lazy { object : BatchUpdateSpreadsheetRequestFieldBooleanRule("${path}/booleanRule") {} }
	val gradientRule by lazy { object : BatchUpdateSpreadsheetRequestFieldGradientRule("${path}/gradientRule") {} }
	val ranges by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/ranges") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSource(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val calculatedColumns by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDimensionRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dimension: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class BatchUpdateSpreadsheetRequestFieldFilterView(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val criteria by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetRequestFieldNamedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldProtectedRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val description: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/description")
	val editors by lazy { object : BatchUpdateSpreadsheetRequestFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/warningOnly")
}

abstract class BatchUpdateSpreadsheetRequestFieldSheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceSheetProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetRequestFieldSlicer(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val position by lazy { object : BatchUpdateSpreadsheetRequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : BatchUpdateSpreadsheetRequestFieldSlicerSpec("${path}/spec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldRowData(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val values by lazy { object : BatchUpdateSpreadsheetRequestFieldCellData("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldGridRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val endColumnIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchUpdateSpreadsheetRequestFieldSourceAndDestination(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dimension: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dimension")
	val fillLength: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fillLength")
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/source") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceSheetDimensionRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnReferences by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/columnReferences") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceObjectReferences(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val references by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceObjectReference("${path}/references") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDeveloperMetadata(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val location by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/visibility")
}

abstract class BatchUpdateSpreadsheetRequestFieldGridCoordinate(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataFilter(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val a1Range: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCellData(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceFormula by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : BatchUpdateSpreadsheetRequestFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicFilter(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val criteria by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataValidationRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetRequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/strict")
}

abstract class BatchUpdateSpreadsheetRequestFieldSortSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class BatchUpdateSpreadsheetRequestFieldBorder(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/width")
}

abstract class BatchUpdateSpreadsheetRequestFieldChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val altText: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/altText")
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val basicChart by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicChartSpec("${path}/basicChart") {} }
	val bubbleChart by lazy { object : BatchUpdateSpreadsheetRequestFieldBubbleChartSpec("${path}/bubbleChart") {} }
	val candlestickChart by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickChartSpec("${path}/candlestickChart") {} }
	val dataSourceChartProperties by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceChartProperties("${path}/dataSourceChartProperties") {} }
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val fontName: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fontName")
	val hiddenDimensionStrategy: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hiddenDimensionStrategy")
	val histogramChart by lazy { object : BatchUpdateSpreadsheetRequestFieldHistogramChartSpec("${path}/histogramChart") {} }
	val maximized: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/maximized")
	val orgChart by lazy { object : BatchUpdateSpreadsheetRequestFieldOrgChartSpec("${path}/orgChart") {} }
	val pieChart by lazy { object : BatchUpdateSpreadsheetRequestFieldPieChartSpec("${path}/pieChart") {} }
	val scorecardChart by lazy { object : BatchUpdateSpreadsheetRequestFieldScorecardChartSpec("${path}/scorecardChart") {} }
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldSortSpec("${path}/sortSpecs") {} }
	val subtitle: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/subtitle")
	val subtitleTextFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/subtitleTextFormat") {} }
	val subtitleTextPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldTextPosition("${path}/subtitleTextPosition") {} }
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
	val titleTextFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/titleTextFormat") {} }
	val titleTextPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val treemapChart by lazy { object : BatchUpdateSpreadsheetRequestFieldTreemapChartSpec("${path}/treemapChart") {} }
	val waterfallChart by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartSpec("${path}/waterfallChart") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDimensionGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val collapsed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/depth")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDimensionProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pixelSize")
}

abstract class BatchUpdateSpreadsheetRequestFieldEmbeddedObjectBorder(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldEmbeddedObjectPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val newSheet: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldSlicerSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val applyToPivotTables: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetRequestFieldSpreadsheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val autoRecalc: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/autoRecalc")
	val defaultFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldCellFormat("${path}/defaultFormat") {} }
	val importFunctionsExternalUrlAccessAllowed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/importFunctionsExternalUrlAccessAllowed")
	val iterativeCalculationSettings by lazy { object : BatchUpdateSpreadsheetRequestFieldIterativeCalculationSettings("${path}/iterativeCalculationSettings") {} }
	val locale: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/locale")
	val spreadsheetTheme by lazy { object : BatchUpdateSpreadsheetRequestFieldSpreadsheetTheme("${path}/spreadsheetTheme") {} }
	val timeZone: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/timeZone")
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
}

abstract class BatchUpdateSpreadsheetRequestFieldBandingProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val firstBandColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBooleanRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetRequestFieldBooleanCondition("${path}/condition") {} }
	val format by lazy { object : BatchUpdateSpreadsheetRequestFieldCellFormat("${path}/format") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldGradientRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val maxpoint by lazy { object : BatchUpdateSpreadsheetRequestFieldInterpolationPoint("${path}/maxpoint") {} }
	val midpoint by lazy { object : BatchUpdateSpreadsheetRequestFieldInterpolationPoint("${path}/midpoint") {} }
	val minpoint by lazy { object : BatchUpdateSpreadsheetRequestFieldInterpolationPoint("${path}/minpoint") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceColumn(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val formula: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bigQuery by lazy { object : BatchUpdateSpreadsheetRequestFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : BatchUpdateSpreadsheetRequestFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldFilterCriteria(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldFilterSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldEditors(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val domainUsersCanEdit: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/groups")
	val users: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/users")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceSheetProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columns by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetRequestFieldGridProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnCount: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class BatchUpdateSpreadsheetRequestFieldColor(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val alpha: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/red")
}

abstract class BatchUpdateSpreadsheetRequestFieldColorStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val rgbColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/name")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceObjectReference(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val chartId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/chartId")
	val dataSourceFormulaCell by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/dataSourceFormulaCell") {} }
	val dataSourcePivotTableAnchorCell by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/dataSourcePivotTableAnchorCell") {} }
	val dataSourceTableAnchorCell by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/dataSourceTableAnchorCell") {} }
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dimensionRange by lazy { object : BatchUpdateSpreadsheetRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchUpdateSpreadsheetRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val locationMatchingStrategy: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchUpdateSpreadsheetRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/visibility")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceFormula(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceTable(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnSelectionType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCellFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val backgroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : BatchUpdateSpreadsheetRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : BatchUpdateSpreadsheetRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : BatchUpdateSpreadsheetRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class BatchUpdateSpreadsheetRequestFieldExtendedValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val boolValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : BatchUpdateSpreadsheetRequestFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/stringValue")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotTable(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columns by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotValue("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldTextFormatRun(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val format by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class BatchUpdateSpreadsheetRequestFieldBooleanCondition(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : BatchUpdateSpreadsheetRequestFieldConditionValue("${path}/values") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val axis by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicChartAxis("${path}/axis") {} }
	val chartType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/chartType")
	val compareMode: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/compareMode")
	val domains by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicChartDomain("${path}/domains") {} }
	val headerCount: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/headerCount")
	val interpolateNulls: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/interpolateNulls")
	val legendPosition: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/legendPosition")
	val lineSmoothing: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/lineSmoothing")
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicChartSeries("${path}/series") {} }
	val stackedType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/stackedType")
	val threeDimensional: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/threeDimensional")
	val totalDataLabel by lazy { object : BatchUpdateSpreadsheetRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBubbleChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bubbleBorderColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/bubbleBorderColor") {} }
	val bubbleBorderColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/bubbleBorderColorStyle") {} }
	val bubbleLabels by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/bubbleLabels") {} }
	val bubbleMaxRadiusSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bubbleMaxRadiusSize")
	val bubbleMinRadiusSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bubbleMinRadiusSize")
	val bubbleOpacity: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bubbleOpacity")
	val bubbleSizes by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/bubbleSizes") {} }
	val bubbleTextStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/bubbleTextStyle") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/domain") {} }
	val groupIds by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/groupIds") {} }
	val legendPosition: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/legendPosition")
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/series") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCandlestickChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickData("${path}/data") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickDomain("${path}/domain") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceChartProperties(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataExecutionStatus by lazy { object : BatchUpdateSpreadsheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class BatchUpdateSpreadsheetRequestFieldHistogramChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bucketSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bucketSize")
	val legendPosition: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/legendPosition")
	val outlierPercentile: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/outlierPercentile")
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldHistogramSeries("${path}/series") {} }
	val showItemDividers: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/showItemDividers")
}

abstract class BatchUpdateSpreadsheetRequestFieldOrgChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val labels by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/labels") {} }
	val nodeColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/nodeColor") {} }
	val nodeColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/nodeColorStyle") {} }
	val nodeSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/nodeSize")
	val parentLabels by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/parentLabels") {} }
	val selectedNodeColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/selectedNodeColor") {} }
	val selectedNodeColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/selectedNodeColorStyle") {} }
	val tooltips by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/tooltips") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldPieChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val domain by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/domain") {} }
	val legendPosition: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/legendPosition")
	val pieHole: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pieHole")
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/series") {} }
	val threeDimensional: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/threeDimensional")
}

abstract class BatchUpdateSpreadsheetRequestFieldScorecardChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val aggregateType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/aggregateType")
	val baselineValueData by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/baselineValueData") {} }
	val baselineValueFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldBaselineValueFormat("${path}/baselineValueFormat") {} }
	val customFormatOptions by lazy { object : BatchUpdateSpreadsheetRequestFieldChartCustomNumberFormatOptions("${path}/customFormatOptions") {} }
	val keyValueData by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/keyValueData") {} }
	val keyValueFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldKeyValueFormat("${path}/keyValueFormat") {} }
	val numberFormatSource: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/numberFormatSource")
	val scaleFactor: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/scaleFactor")
}

abstract class BatchUpdateSpreadsheetRequestFieldTextFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bold: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BatchUpdateSpreadsheetRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/underline")
}

abstract class BatchUpdateSpreadsheetRequestFieldTextPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val horizontalAlignment: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class BatchUpdateSpreadsheetRequestFieldTreemapChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val colorData by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/colorData") {} }
	val colorScale by lazy { object : BatchUpdateSpreadsheetRequestFieldTreemapChartColorScale("${path}/colorScale") {} }
	val headerColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val hideTooltips: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hideTooltips")
	val hintedLevels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hintedLevels")
	val labels by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/labels") {} }
	val levels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/levels")
	val maxValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/minValue")
	val parentLabels by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/parentLabels") {} }
	val sizeData by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/sizeData") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldWaterfallChartSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val connectorLineStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldLineStyle("${path}/connectorLineStyle") {} }
	val domain by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartDomain("${path}/domain") {} }
	val firstValueIsTotal: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/firstValueIsTotal")
	val hideConnectorLines: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hideConnectorLines")
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartSeries("${path}/series") {} }
	val stackedType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/stackedType")
	val totalDataLabel by lazy { object : BatchUpdateSpreadsheetRequestFieldDataLabel("${path}/totalDataLabel") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldOverlayPosition(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val anchorCell by lazy { object : BatchUpdateSpreadsheetRequestFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/widthPixels")
}

abstract class BatchUpdateSpreadsheetRequestFieldIterativeCalculationSettings(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val convergenceThreshold: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/convergenceThreshold")
	val maxIterations: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/maxIterations")
}

abstract class BatchUpdateSpreadsheetRequestFieldSpreadsheetTheme(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val primaryFontFamily: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/primaryFontFamily")
	val themeColors by lazy { object : BatchUpdateSpreadsheetRequestFieldThemeColorPair("${path}/themeColors") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldInterpolationPoint(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
	val value: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/value")
}

abstract class BatchUpdateSpreadsheetRequestFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val projectId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : BatchUpdateSpreadsheetRequestFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : BatchUpdateSpreadsheetRequestFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldLookerDataSourceSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val explore: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/model")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataSourceParameter(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val name: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/range") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldDataExecutionStatus(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val errorCode: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/state")
}

abstract class BatchUpdateSpreadsheetRequestFieldBorders(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bottom by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : BatchUpdateSpreadsheetRequestFieldBorder("${path}/top") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldNumberFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val pattern: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldPadding(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val bottom: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/top")
}

abstract class BatchUpdateSpreadsheetRequestFieldTextRotation(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val angle: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/vertical")
}

abstract class BatchUpdateSpreadsheetRequestFieldErrorValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val message: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/message")
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotFilterCriteria(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val condition by lazy { object : BatchUpdateSpreadsheetRequestFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/visibleValues")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotFilterSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val columnOffsetIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : BatchUpdateSpreadsheetRequestFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val calculatedDisplayType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/formula")
	val name: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class BatchUpdateSpreadsheetRequestFieldConditionValue(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val relativeDate: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicChartAxis(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val format by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/format") {} }
	val position: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/position")
	val title: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : BatchUpdateSpreadsheetRequestFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : BatchUpdateSpreadsheetRequestFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicChartDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val domain by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicChartSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : BatchUpdateSpreadsheetRequestFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : BatchUpdateSpreadsheetRequestFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldDataLabel(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val customLabelData by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldChartData(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val aggregateType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BatchUpdateSpreadsheetRequestFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BatchUpdateSpreadsheetRequestFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BatchUpdateSpreadsheetRequestFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCandlestickData(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val closeSeries by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : BatchUpdateSpreadsheetRequestFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCandlestickDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetRequestFieldHistogramSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val barColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/data") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldBaselineValueFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val comparisonType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/comparisonType")
	val description: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/description")
	val negativeColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/negativeColor") {} }
	val negativeColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/negativeColorStyle") {} }
	val position by lazy { object : BatchUpdateSpreadsheetRequestFieldTextPosition("${path}/position") {} }
	val positiveColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/positiveColor") {} }
	val positiveColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/positiveColorStyle") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldChartCustomNumberFormatOptions(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val prefix: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/prefix")
	val suffix: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/suffix")
}

abstract class BatchUpdateSpreadsheetRequestFieldKeyValueFormat(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val position by lazy { object : BatchUpdateSpreadsheetRequestFieldTextPosition("${path}/position") {} }
	val textFormat by lazy { object : BatchUpdateSpreadsheetRequestFieldTextFormat("${path}/textFormat") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldLink(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val uri: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/uri")
}

abstract class BatchUpdateSpreadsheetRequestFieldTreemapChartColorScale(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val maxValueColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldLineStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
	val width: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/width")
}

abstract class BatchUpdateSpreadsheetRequestFieldWaterfallChartDomain(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/data") {} }
	val reversed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/reversed")
}

abstract class BatchUpdateSpreadsheetRequestFieldWaterfallChartSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val customSubtotals by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartCustomSubtotal("${path}/customSubtotals") {} }
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/data") {} }
	val dataLabel by lazy { object : BatchUpdateSpreadsheetRequestFieldDataLabel("${path}/dataLabel") {} }
	val hideTrailingSubtotal: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/hideTrailingSubtotal")
	val negativeColumnsStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartColumnStyle("${path}/negativeColumnsStyle") {} }
	val positiveColumnsStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartColumnStyle("${path}/positiveColumnsStyle") {} }
	val subtotalColumnsStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldWaterfallChartColumnStyle("${path}/subtotalColumnsStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldThemeColorPair(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/color") {} }
	val colorType: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/colorType")
}

abstract class BatchUpdateSpreadsheetRequestFieldBigQueryQuerySpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val rawQuery: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/rawQuery")
}

abstract class BatchUpdateSpreadsheetRequestFieldBigQueryTableSpec(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val datasetId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/tableProjectId")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotGroupLimit(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val applyOrder: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/countLimit")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotGroupRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dateTimeRule by lazy { object : BatchUpdateSpreadsheetRequestFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BatchUpdateSpreadsheetRequestFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : BatchUpdateSpreadsheetRequestFieldManualRule("${path}/manualRule") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val buckets by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/valuesIndex")
}

abstract class BatchUpdateSpreadsheetRequestFieldPivotGroupValueMetadata(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val collapsed: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/value") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val viewWindowMax: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class BatchUpdateSpreadsheetRequestFieldPointStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val shape: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/shape")
	val size: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/size")
}

abstract class BatchUpdateSpreadsheetRequestFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldPointStyle("${path}/pointStyle") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldChartGroupRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dateTimeRule by lazy { object : BatchUpdateSpreadsheetRequestFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BatchUpdateSpreadsheetRequestFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldChartSourceRange(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val sources by lazy { object : BatchUpdateSpreadsheetRequestFieldGridRange("${path}/sources") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldCandlestickSeries(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val data by lazy { object : BatchUpdateSpreadsheetRequestFieldChartData("${path}/data") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldWaterfallChartCustomSubtotal(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val dataIsSubtotal: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/dataIsSubtotal")
	val label: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/label")
	val subtotalIndex: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/subtotalIndex")
}

abstract class BatchUpdateSpreadsheetRequestFieldWaterfallChartColumnStyle(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val color by lazy { object : BatchUpdateSpreadsheetRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BatchUpdateSpreadsheetRequestFieldColorStyle("${path}/colorStyle") {} }
	val label: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/label")
}

abstract class BatchUpdateSpreadsheetRequestFieldDateTimeRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldHistogramRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val end: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/end")
	val interval: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/interval")
	val start: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/start")
}

abstract class BatchUpdateSpreadsheetRequestFieldManualRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val groups by lazy { object : BatchUpdateSpreadsheetRequestFieldManualRuleGroup("${path}/groups") {} }
}

abstract class BatchUpdateSpreadsheetRequestFieldChartDateTimeRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val type: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateSpreadsheetRequestFieldChartHistogramRule(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val intervalSize: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BatchUpdateSpreadsheetRequestField> get() = fieldsList("${path}/minValue")
}

abstract class BatchUpdateSpreadsheetRequestFieldManualRuleGroup(private val path: String) : FieldsList<BatchUpdateSpreadsheetRequestField>(path) {
	val groupName by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : BatchUpdateSpreadsheetRequestFieldExtendedValue("${path}/items") {} }
}

