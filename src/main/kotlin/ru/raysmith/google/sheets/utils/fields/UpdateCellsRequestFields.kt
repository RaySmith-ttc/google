package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateCellsRequestField : Field

object UpdateCellsRequestFields {
    val ALL: FieldsList<UpdateCellsRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateCellsRequestField> get() = fieldsList("fields")
	val range = object : UpdateCellsRequestFieldGridRange("range") {}
	val rows = object : UpdateCellsRequestFieldRowData("rows") {}
	val start = object : UpdateCellsRequestFieldGridCoordinate("start") {}
}

abstract class UpdateCellsRequestFieldGridRange(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateCellsRequestFieldRowData(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val values by lazy { object : UpdateCellsRequestFieldCellData("${path}/values") {} }
}

abstract class UpdateCellsRequestFieldGridCoordinate(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val columnIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class UpdateCellsRequestFieldCellData(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val dataSourceFormula by lazy { object : UpdateCellsRequestFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : UpdateCellsRequestFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : UpdateCellsRequestFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : UpdateCellsRequestFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : UpdateCellsRequestFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : UpdateCellsRequestFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : UpdateCellsRequestFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class UpdateCellsRequestFieldDataSourceFormula(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val dataExecutionStatus by lazy { object : UpdateCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class UpdateCellsRequestFieldDataSourceTable(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val columnSelectionType: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : UpdateCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : UpdateCellsRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : UpdateCellsRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class UpdateCellsRequestFieldDataValidationRule(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val condition by lazy { object : UpdateCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/strict")
}

abstract class UpdateCellsRequestFieldCellFormat(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val backgroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : UpdateCellsRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : UpdateCellsRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : UpdateCellsRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : UpdateCellsRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : UpdateCellsRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class UpdateCellsRequestFieldExtendedValue(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val boolValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : UpdateCellsRequestFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/stringValue")
}

abstract class UpdateCellsRequestFieldPivotTable(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val columns by lazy { object : UpdateCellsRequestFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : UpdateCellsRequestFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : UpdateCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : UpdateCellsRequestFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : UpdateCellsRequestFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : UpdateCellsRequestFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : UpdateCellsRequestFieldPivotValue("${path}/values") {} }
}

abstract class UpdateCellsRequestFieldTextFormatRun(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val format by lazy { object : UpdateCellsRequestFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class UpdateCellsRequestFieldDataExecutionStatus(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val errorCode: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/state")
}

abstract class UpdateCellsRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val name: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/name")
}

abstract class UpdateCellsRequestFieldFilterSpec(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val columnIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : UpdateCellsRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class UpdateCellsRequestFieldSortSpec(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val backgroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class UpdateCellsRequestFieldBooleanCondition(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val type: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateCellsRequestFieldConditionValue("${path}/values") {} }
}

abstract class UpdateCellsRequestFieldColor(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val alpha: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateCellsRequestFieldColorStyle(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val rgbColor by lazy { object : UpdateCellsRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateCellsRequestFieldBorders(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val bottom by lazy { object : UpdateCellsRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : UpdateCellsRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : UpdateCellsRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : UpdateCellsRequestFieldBorder("${path}/top") {} }
}

abstract class UpdateCellsRequestFieldNumberFormat(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val pattern: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateCellsRequestFieldPadding(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val bottom: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/top")
}

abstract class UpdateCellsRequestFieldTextFormat(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val bold: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateCellsRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/underline")
}

abstract class UpdateCellsRequestFieldTextRotation(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val angle: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/vertical")
}

abstract class UpdateCellsRequestFieldErrorValue(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val message: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/message")
	val type: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateCellsRequestFieldPivotGroup(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val dataSourceColumnReference by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : UpdateCellsRequestFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : UpdateCellsRequestFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : UpdateCellsRequestFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : UpdateCellsRequestFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class UpdateCellsRequestFieldPivotFilterCriteria(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val condition by lazy { object : UpdateCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/visibleValues")
}

abstract class UpdateCellsRequestFieldPivotFilterSpec(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val columnOffsetIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : UpdateCellsRequestFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class UpdateCellsRequestFieldPivotValue(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val calculatedDisplayType: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : UpdateCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/formula")
	val name: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class UpdateCellsRequestFieldFilterCriteria(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val condition by lazy { object : UpdateCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : UpdateCellsRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class UpdateCellsRequestFieldConditionValue(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val relativeDate: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class UpdateCellsRequestFieldBorder(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val color by lazy { object : UpdateCellsRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateCellsRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/width")
}

abstract class UpdateCellsRequestFieldLink(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val uri: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/uri")
}

abstract class UpdateCellsRequestFieldPivotGroupLimit(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val applyOrder: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/countLimit")
}

abstract class UpdateCellsRequestFieldPivotGroupRule(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val dateTimeRule by lazy { object : UpdateCellsRequestFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : UpdateCellsRequestFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : UpdateCellsRequestFieldManualRule("${path}/manualRule") {} }
}

abstract class UpdateCellsRequestFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val buckets by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/valuesIndex")
}

abstract class UpdateCellsRequestFieldPivotGroupValueMetadata(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val collapsed: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/value") {} }
}

abstract class UpdateCellsRequestFieldDateTimeRule(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val type: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class UpdateCellsRequestFieldHistogramRule(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val end: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/end")
	val interval: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/interval")
	val start: FieldsList<UpdateCellsRequestField> get() = fieldsList("${path}/start")
}

abstract class UpdateCellsRequestFieldManualRule(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val groups by lazy { object : UpdateCellsRequestFieldManualRuleGroup("${path}/groups") {} }
}

abstract class UpdateCellsRequestFieldManualRuleGroup(private val path: String) : FieldsList<UpdateCellsRequestField>(path) {
	val groupName by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : UpdateCellsRequestFieldExtendedValue("${path}/items") {} }
}

