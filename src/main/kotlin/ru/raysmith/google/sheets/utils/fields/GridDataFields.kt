package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GridDataField : Field

object GridDataFields {
    val ALL: FieldsList<GridDataField> = fieldsList("*")
	val columnMetadata = object : GridDataFieldDimensionProperties("columnMetadata") {}
	val rowData = object : GridDataFieldRowData("rowData") {}
	val rowMetadata = object : GridDataFieldDimensionProperties("rowMetadata") {}
	val startColumn: FieldsList<GridDataField> get() = fieldsList("startColumn")
	val startRow: FieldsList<GridDataField> get() = fieldsList("startRow")
}

abstract class GridDataFieldDimensionProperties(private val path: String) : FieldsList<GridDataField>(path) {
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : GridDataFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<GridDataField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<GridDataField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<GridDataField> get() = fieldsList("${path}/pixelSize")
}

abstract class GridDataFieldRowData(private val path: String) : FieldsList<GridDataField>(path) {
	val values by lazy { object : GridDataFieldCellData("${path}/values") {} }
}

abstract class GridDataFieldDataSourceColumnReference(private val path: String) : FieldsList<GridDataField>(path) {
	val name: FieldsList<GridDataField> get() = fieldsList("${path}/name")
}

abstract class GridDataFieldDeveloperMetadata(private val path: String) : FieldsList<GridDataField>(path) {
	val location by lazy { object : GridDataFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<GridDataField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<GridDataField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<GridDataField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<GridDataField> get() = fieldsList("${path}/visibility")
}

abstract class GridDataFieldCellData(private val path: String) : FieldsList<GridDataField>(path) {
	val dataSourceFormula by lazy { object : GridDataFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : GridDataFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : GridDataFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : GridDataFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : GridDataFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<GridDataField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<GridDataField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<GridDataField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : GridDataFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : GridDataFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : GridDataFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : GridDataFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class GridDataFieldDeveloperMetadataLocation(private val path: String) : FieldsList<GridDataField>(path) {
	val dimensionRange by lazy { object : GridDataFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<GridDataField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<GridDataField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<GridDataField> get() = fieldsList("${path}/spreadsheet")
}

abstract class GridDataFieldDataSourceFormula(private val path: String) : FieldsList<GridDataField>(path) {
	val dataExecutionStatus by lazy { object : GridDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<GridDataField> get() = fieldsList("${path}/dataSourceId")
}

abstract class GridDataFieldDataSourceTable(private val path: String) : FieldsList<GridDataField>(path) {
	val columnSelectionType: FieldsList<GridDataField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : GridDataFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : GridDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<GridDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : GridDataFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<GridDataField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : GridDataFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class GridDataFieldDataValidationRule(private val path: String) : FieldsList<GridDataField>(path) {
	val condition by lazy { object : GridDataFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<GridDataField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<GridDataField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<GridDataField> get() = fieldsList("${path}/strict")
}

abstract class GridDataFieldCellFormat(private val path: String) : FieldsList<GridDataField>(path) {
	val backgroundColor by lazy { object : GridDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : GridDataFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<GridDataField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<GridDataField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : GridDataFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : GridDataFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<GridDataField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : GridDataFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : GridDataFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<GridDataField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<GridDataField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class GridDataFieldExtendedValue(private val path: String) : FieldsList<GridDataField>(path) {
	val boolValue: FieldsList<GridDataField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : GridDataFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<GridDataField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<GridDataField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<GridDataField> get() = fieldsList("${path}/stringValue")
}

abstract class GridDataFieldPivotTable(private val path: String) : FieldsList<GridDataField>(path) {
	val columns by lazy { object : GridDataFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : GridDataFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : GridDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<GridDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : GridDataFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : GridDataFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : GridDataFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<GridDataField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : GridDataFieldPivotValue("${path}/values") {} }
}

abstract class GridDataFieldTextFormatRun(private val path: String) : FieldsList<GridDataField>(path) {
	val format by lazy { object : GridDataFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<GridDataField> get() = fieldsList("${path}/startIndex")
}

abstract class GridDataFieldDimensionRange(private val path: String) : FieldsList<GridDataField>(path) {
	val dimension: FieldsList<GridDataField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<GridDataField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<GridDataField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<GridDataField> get() = fieldsList("${path}/startIndex")
}

abstract class GridDataFieldDataExecutionStatus(private val path: String) : FieldsList<GridDataField>(path) {
	val errorCode: FieldsList<GridDataField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<GridDataField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<GridDataField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<GridDataField> get() = fieldsList("${path}/state")
}

abstract class GridDataFieldFilterSpec(private val path: String) : FieldsList<GridDataField>(path) {
	val columnIndex: FieldsList<GridDataField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : GridDataFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class GridDataFieldSortSpec(private val path: String) : FieldsList<GridDataField>(path) {
	val backgroundColor by lazy { object : GridDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<GridDataField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : GridDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<GridDataField> get() = fieldsList("${path}/sortOrder")
}

abstract class GridDataFieldBooleanCondition(private val path: String) : FieldsList<GridDataField>(path) {
	val type: FieldsList<GridDataField> get() = fieldsList("${path}/type")
	val values by lazy { object : GridDataFieldConditionValue("${path}/values") {} }
}

abstract class GridDataFieldColor(private val path: String) : FieldsList<GridDataField>(path) {
	val alpha: FieldsList<GridDataField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<GridDataField> get() = fieldsList("${path}/blue")
	val green: FieldsList<GridDataField> get() = fieldsList("${path}/green")
	val red: FieldsList<GridDataField> get() = fieldsList("${path}/red")
}

abstract class GridDataFieldColorStyle(private val path: String) : FieldsList<GridDataField>(path) {
	val rgbColor by lazy { object : GridDataFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<GridDataField> get() = fieldsList("${path}/themeColor")
}

abstract class GridDataFieldBorders(private val path: String) : FieldsList<GridDataField>(path) {
	val bottom by lazy { object : GridDataFieldBorder("${path}/bottom") {} }
	val left by lazy { object : GridDataFieldBorder("${path}/left") {} }
	val right by lazy { object : GridDataFieldBorder("${path}/right") {} }
	val top by lazy { object : GridDataFieldBorder("${path}/top") {} }
}

abstract class GridDataFieldNumberFormat(private val path: String) : FieldsList<GridDataField>(path) {
	val pattern: FieldsList<GridDataField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<GridDataField> get() = fieldsList("${path}/type")
}

abstract class GridDataFieldPadding(private val path: String) : FieldsList<GridDataField>(path) {
	val bottom: FieldsList<GridDataField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<GridDataField> get() = fieldsList("${path}/left")
	val right: FieldsList<GridDataField> get() = fieldsList("${path}/right")
	val top: FieldsList<GridDataField> get() = fieldsList("${path}/top")
}

abstract class GridDataFieldTextFormat(private val path: String) : FieldsList<GridDataField>(path) {
	val bold: FieldsList<GridDataField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<GridDataField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<GridDataField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : GridDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<GridDataField> get() = fieldsList("${path}/italic")
	val link by lazy { object : GridDataFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<GridDataField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<GridDataField> get() = fieldsList("${path}/underline")
}

abstract class GridDataFieldTextRotation(private val path: String) : FieldsList<GridDataField>(path) {
	val angle: FieldsList<GridDataField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<GridDataField> get() = fieldsList("${path}/vertical")
}

abstract class GridDataFieldErrorValue(private val path: String) : FieldsList<GridDataField>(path) {
	val message: FieldsList<GridDataField> get() = fieldsList("${path}/message")
	val type: FieldsList<GridDataField> get() = fieldsList("${path}/type")
}

abstract class GridDataFieldPivotGroup(private val path: String) : FieldsList<GridDataField>(path) {
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : GridDataFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : GridDataFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<GridDataField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<GridDataField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<GridDataField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<GridDataField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<GridDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : GridDataFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : GridDataFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class GridDataFieldPivotFilterCriteria(private val path: String) : FieldsList<GridDataField>(path) {
	val condition by lazy { object : GridDataFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<GridDataField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<GridDataField> get() = fieldsList("${path}/visibleValues")
}

abstract class GridDataFieldPivotFilterSpec(private val path: String) : FieldsList<GridDataField>(path) {
	val columnOffsetIndex: FieldsList<GridDataField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : GridDataFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class GridDataFieldGridRange(private val path: String) : FieldsList<GridDataField>(path) {
	val endColumnIndex: FieldsList<GridDataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<GridDataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<GridDataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<GridDataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<GridDataField> get() = fieldsList("${path}/startRowIndex")
}

abstract class GridDataFieldPivotValue(private val path: String) : FieldsList<GridDataField>(path) {
	val calculatedDisplayType: FieldsList<GridDataField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : GridDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<GridDataField> get() = fieldsList("${path}/formula")
	val name: FieldsList<GridDataField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<GridDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<GridDataField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class GridDataFieldFilterCriteria(private val path: String) : FieldsList<GridDataField>(path) {
	val condition by lazy { object : GridDataFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<GridDataField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : GridDataFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : GridDataFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : GridDataFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class GridDataFieldConditionValue(private val path: String) : FieldsList<GridDataField>(path) {
	val relativeDate: FieldsList<GridDataField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<GridDataField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class GridDataFieldBorder(private val path: String) : FieldsList<GridDataField>(path) {
	val color by lazy { object : GridDataFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : GridDataFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<GridDataField> get() = fieldsList("${path}/style")
	val width: FieldsList<GridDataField> get() = fieldsList("${path}/width")
}

abstract class GridDataFieldLink(private val path: String) : FieldsList<GridDataField>(path) {
	val uri: FieldsList<GridDataField> get() = fieldsList("${path}/uri")
}

abstract class GridDataFieldPivotGroupLimit(private val path: String) : FieldsList<GridDataField>(path) {
	val applyOrder: FieldsList<GridDataField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<GridDataField> get() = fieldsList("${path}/countLimit")
}

abstract class GridDataFieldPivotGroupRule(private val path: String) : FieldsList<GridDataField>(path) {
	val dateTimeRule by lazy { object : GridDataFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : GridDataFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : GridDataFieldManualRule("${path}/manualRule") {} }
}

abstract class GridDataFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<GridDataField>(path) {
	val buckets by lazy { object : GridDataFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<GridDataField> get() = fieldsList("${path}/valuesIndex")
}

abstract class GridDataFieldPivotGroupValueMetadata(private val path: String) : FieldsList<GridDataField>(path) {
	val collapsed: FieldsList<GridDataField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : GridDataFieldExtendedValue("${path}/value") {} }
}

abstract class GridDataFieldDateTimeRule(private val path: String) : FieldsList<GridDataField>(path) {
	val type: FieldsList<GridDataField> get() = fieldsList("${path}/type")
}

abstract class GridDataFieldHistogramRule(private val path: String) : FieldsList<GridDataField>(path) {
	val end: FieldsList<GridDataField> get() = fieldsList("${path}/end")
	val interval: FieldsList<GridDataField> get() = fieldsList("${path}/interval")
	val start: FieldsList<GridDataField> get() = fieldsList("${path}/start")
}

abstract class GridDataFieldManualRule(private val path: String) : FieldsList<GridDataField>(path) {
	val groups by lazy { object : GridDataFieldManualRuleGroup("${path}/groups") {} }
}

abstract class GridDataFieldManualRuleGroup(private val path: String) : FieldsList<GridDataField>(path) {
	val groupName by lazy { object : GridDataFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : GridDataFieldExtendedValue("${path}/items") {} }
}

