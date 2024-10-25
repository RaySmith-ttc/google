package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppendCellsRequestField : Field

object AppendCellsRequestFields {
    val ALL: FieldsList<AppendCellsRequestField> = fieldsList("*")
	val fields: FieldsList<AppendCellsRequestField> get() = fieldsList("fields")
	val rows = object : AppendCellsRequestFieldRowData("rows") {}
	val sheetId: FieldsList<AppendCellsRequestField> get() = fieldsList("sheetId")
}

abstract class AppendCellsRequestFieldRowData(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val values by lazy { object : AppendCellsRequestFieldCellData("${path}/values") {} }
}

abstract class AppendCellsRequestFieldCellData(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val dataSourceFormula by lazy { object : AppendCellsRequestFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : AppendCellsRequestFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : AppendCellsRequestFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : AppendCellsRequestFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : AppendCellsRequestFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : AppendCellsRequestFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : AppendCellsRequestFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class AppendCellsRequestFieldDataSourceFormula(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val dataExecutionStatus by lazy { object : AppendCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class AppendCellsRequestFieldDataSourceTable(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val columnSelectionType: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : AppendCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : AppendCellsRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : AppendCellsRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class AppendCellsRequestFieldDataValidationRule(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val condition by lazy { object : AppendCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/strict")
}

abstract class AppendCellsRequestFieldCellFormat(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val backgroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : AppendCellsRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : AppendCellsRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : AppendCellsRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : AppendCellsRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : AppendCellsRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class AppendCellsRequestFieldExtendedValue(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val boolValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : AppendCellsRequestFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/stringValue")
}

abstract class AppendCellsRequestFieldPivotTable(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val columns by lazy { object : AppendCellsRequestFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : AppendCellsRequestFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : AppendCellsRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : AppendCellsRequestFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : AppendCellsRequestFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : AppendCellsRequestFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : AppendCellsRequestFieldPivotValue("${path}/values") {} }
}

abstract class AppendCellsRequestFieldTextFormatRun(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val format by lazy { object : AppendCellsRequestFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class AppendCellsRequestFieldDataExecutionStatus(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val errorCode: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/state")
}

abstract class AppendCellsRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val name: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/name")
}

abstract class AppendCellsRequestFieldFilterSpec(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val columnIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AppendCellsRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AppendCellsRequestFieldSortSpec(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val backgroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class AppendCellsRequestFieldBooleanCondition(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val type: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : AppendCellsRequestFieldConditionValue("${path}/values") {} }
}

abstract class AppendCellsRequestFieldColor(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val alpha: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/red")
}

abstract class AppendCellsRequestFieldColorStyle(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val rgbColor by lazy { object : AppendCellsRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AppendCellsRequestFieldBorders(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val bottom by lazy { object : AppendCellsRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : AppendCellsRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : AppendCellsRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : AppendCellsRequestFieldBorder("${path}/top") {} }
}

abstract class AppendCellsRequestFieldNumberFormat(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val pattern: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class AppendCellsRequestFieldPadding(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val bottom: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/top")
}

abstract class AppendCellsRequestFieldTextFormat(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val bold: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AppendCellsRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/underline")
}

abstract class AppendCellsRequestFieldTextRotation(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val angle: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/vertical")
}

abstract class AppendCellsRequestFieldErrorValue(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val message: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/message")
	val type: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class AppendCellsRequestFieldPivotGroup(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val dataSourceColumnReference by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : AppendCellsRequestFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : AppendCellsRequestFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : AppendCellsRequestFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : AppendCellsRequestFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class AppendCellsRequestFieldPivotFilterCriteria(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val condition by lazy { object : AppendCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/visibleValues")
}

abstract class AppendCellsRequestFieldPivotFilterSpec(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val columnOffsetIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AppendCellsRequestFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AppendCellsRequestFieldGridRange(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val endColumnIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AppendCellsRequestFieldPivotValue(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val calculatedDisplayType: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : AppendCellsRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/formula")
	val name: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class AppendCellsRequestFieldFilterCriteria(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val condition by lazy { object : AppendCellsRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AppendCellsRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AppendCellsRequestFieldConditionValue(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val relativeDate: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class AppendCellsRequestFieldBorder(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val color by lazy { object : AppendCellsRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : AppendCellsRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/width")
}

abstract class AppendCellsRequestFieldLink(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val uri: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/uri")
}

abstract class AppendCellsRequestFieldPivotGroupLimit(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val applyOrder: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/countLimit")
}

abstract class AppendCellsRequestFieldPivotGroupRule(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val dateTimeRule by lazy { object : AppendCellsRequestFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : AppendCellsRequestFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : AppendCellsRequestFieldManualRule("${path}/manualRule") {} }
}

abstract class AppendCellsRequestFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val buckets by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/valuesIndex")
}

abstract class AppendCellsRequestFieldPivotGroupValueMetadata(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val collapsed: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/value") {} }
}

abstract class AppendCellsRequestFieldDateTimeRule(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val type: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/type")
}

abstract class AppendCellsRequestFieldHistogramRule(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val end: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/end")
	val interval: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/interval")
	val start: FieldsList<AppendCellsRequestField> get() = fieldsList("${path}/start")
}

abstract class AppendCellsRequestFieldManualRule(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val groups by lazy { object : AppendCellsRequestFieldManualRuleGroup("${path}/groups") {} }
}

abstract class AppendCellsRequestFieldManualRuleGroup(private val path: String) : FieldsList<AppendCellsRequestField>(path) {
	val groupName by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : AppendCellsRequestFieldExtendedValue("${path}/items") {} }
}

