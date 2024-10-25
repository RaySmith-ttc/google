package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RowDataField : Field

object RowDataFields {
    val ALL: FieldsList<RowDataField> = fieldsList("*")
	val values = object : RowDataFieldCellData("values") {}
}

abstract class RowDataFieldCellData(private val path: String) : FieldsList<RowDataField>(path) {
	val dataSourceFormula by lazy { object : RowDataFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : RowDataFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : RowDataFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : RowDataFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : RowDataFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<RowDataField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<RowDataField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<RowDataField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : RowDataFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : RowDataFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : RowDataFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : RowDataFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class RowDataFieldDataSourceFormula(private val path: String) : FieldsList<RowDataField>(path) {
	val dataExecutionStatus by lazy { object : RowDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RowDataField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RowDataFieldDataSourceTable(private val path: String) : FieldsList<RowDataField>(path) {
	val columnSelectionType: FieldsList<RowDataField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : RowDataFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : RowDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RowDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RowDataFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<RowDataField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : RowDataFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class RowDataFieldDataValidationRule(private val path: String) : FieldsList<RowDataField>(path) {
	val condition by lazy { object : RowDataFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<RowDataField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<RowDataField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<RowDataField> get() = fieldsList("${path}/strict")
}

abstract class RowDataFieldCellFormat(private val path: String) : FieldsList<RowDataField>(path) {
	val backgroundColor by lazy { object : RowDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : RowDataFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<RowDataField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<RowDataField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : RowDataFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : RowDataFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<RowDataField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : RowDataFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : RowDataFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<RowDataField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<RowDataField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class RowDataFieldExtendedValue(private val path: String) : FieldsList<RowDataField>(path) {
	val boolValue: FieldsList<RowDataField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : RowDataFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<RowDataField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<RowDataField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<RowDataField> get() = fieldsList("${path}/stringValue")
}

abstract class RowDataFieldPivotTable(private val path: String) : FieldsList<RowDataField>(path) {
	val columns by lazy { object : RowDataFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : RowDataFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : RowDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RowDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RowDataFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : RowDataFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : RowDataFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<RowDataField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : RowDataFieldPivotValue("${path}/values") {} }
}

abstract class RowDataFieldTextFormatRun(private val path: String) : FieldsList<RowDataField>(path) {
	val format by lazy { object : RowDataFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<RowDataField> get() = fieldsList("${path}/startIndex")
}

abstract class RowDataFieldDataExecutionStatus(private val path: String) : FieldsList<RowDataField>(path) {
	val errorCode: FieldsList<RowDataField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<RowDataField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<RowDataField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<RowDataField> get() = fieldsList("${path}/state")
}

abstract class RowDataFieldDataSourceColumnReference(private val path: String) : FieldsList<RowDataField>(path) {
	val name: FieldsList<RowDataField> get() = fieldsList("${path}/name")
}

abstract class RowDataFieldFilterSpec(private val path: String) : FieldsList<RowDataField>(path) {
	val columnIndex: FieldsList<RowDataField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : RowDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RowDataFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RowDataFieldSortSpec(private val path: String) : FieldsList<RowDataField>(path) {
	val backgroundColor by lazy { object : RowDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : RowDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<RowDataField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : RowDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<RowDataField> get() = fieldsList("${path}/sortOrder")
}

abstract class RowDataFieldBooleanCondition(private val path: String) : FieldsList<RowDataField>(path) {
	val type: FieldsList<RowDataField> get() = fieldsList("${path}/type")
	val values by lazy { object : RowDataFieldConditionValue("${path}/values") {} }
}

abstract class RowDataFieldColor(private val path: String) : FieldsList<RowDataField>(path) {
	val alpha: FieldsList<RowDataField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<RowDataField> get() = fieldsList("${path}/blue")
	val green: FieldsList<RowDataField> get() = fieldsList("${path}/green")
	val red: FieldsList<RowDataField> get() = fieldsList("${path}/red")
}

abstract class RowDataFieldColorStyle(private val path: String) : FieldsList<RowDataField>(path) {
	val rgbColor by lazy { object : RowDataFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<RowDataField> get() = fieldsList("${path}/themeColor")
}

abstract class RowDataFieldBorders(private val path: String) : FieldsList<RowDataField>(path) {
	val bottom by lazy { object : RowDataFieldBorder("${path}/bottom") {} }
	val left by lazy { object : RowDataFieldBorder("${path}/left") {} }
	val right by lazy { object : RowDataFieldBorder("${path}/right") {} }
	val top by lazy { object : RowDataFieldBorder("${path}/top") {} }
}

abstract class RowDataFieldNumberFormat(private val path: String) : FieldsList<RowDataField>(path) {
	val pattern: FieldsList<RowDataField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<RowDataField> get() = fieldsList("${path}/type")
}

abstract class RowDataFieldPadding(private val path: String) : FieldsList<RowDataField>(path) {
	val bottom: FieldsList<RowDataField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<RowDataField> get() = fieldsList("${path}/left")
	val right: FieldsList<RowDataField> get() = fieldsList("${path}/right")
	val top: FieldsList<RowDataField> get() = fieldsList("${path}/top")
}

abstract class RowDataFieldTextFormat(private val path: String) : FieldsList<RowDataField>(path) {
	val bold: FieldsList<RowDataField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<RowDataField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<RowDataField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : RowDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<RowDataField> get() = fieldsList("${path}/italic")
	val link by lazy { object : RowDataFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<RowDataField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<RowDataField> get() = fieldsList("${path}/underline")
}

abstract class RowDataFieldTextRotation(private val path: String) : FieldsList<RowDataField>(path) {
	val angle: FieldsList<RowDataField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<RowDataField> get() = fieldsList("${path}/vertical")
}

abstract class RowDataFieldErrorValue(private val path: String) : FieldsList<RowDataField>(path) {
	val message: FieldsList<RowDataField> get() = fieldsList("${path}/message")
	val type: FieldsList<RowDataField> get() = fieldsList("${path}/type")
}

abstract class RowDataFieldPivotGroup(private val path: String) : FieldsList<RowDataField>(path) {
	val dataSourceColumnReference by lazy { object : RowDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : RowDataFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : RowDataFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<RowDataField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<RowDataField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<RowDataField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<RowDataField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<RowDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : RowDataFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : RowDataFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class RowDataFieldPivotFilterCriteria(private val path: String) : FieldsList<RowDataField>(path) {
	val condition by lazy { object : RowDataFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<RowDataField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<RowDataField> get() = fieldsList("${path}/visibleValues")
}

abstract class RowDataFieldPivotFilterSpec(private val path: String) : FieldsList<RowDataField>(path) {
	val columnOffsetIndex: FieldsList<RowDataField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : RowDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RowDataFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RowDataFieldGridRange(private val path: String) : FieldsList<RowDataField>(path) {
	val endColumnIndex: FieldsList<RowDataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<RowDataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<RowDataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<RowDataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<RowDataField> get() = fieldsList("${path}/startRowIndex")
}

abstract class RowDataFieldPivotValue(private val path: String) : FieldsList<RowDataField>(path) {
	val calculatedDisplayType: FieldsList<RowDataField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : RowDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<RowDataField> get() = fieldsList("${path}/formula")
	val name: FieldsList<RowDataField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<RowDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<RowDataField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class RowDataFieldFilterCriteria(private val path: String) : FieldsList<RowDataField>(path) {
	val condition by lazy { object : RowDataFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<RowDataField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : RowDataFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : RowDataFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : RowDataFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class RowDataFieldConditionValue(private val path: String) : FieldsList<RowDataField>(path) {
	val relativeDate: FieldsList<RowDataField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<RowDataField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class RowDataFieldBorder(private val path: String) : FieldsList<RowDataField>(path) {
	val color by lazy { object : RowDataFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RowDataFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<RowDataField> get() = fieldsList("${path}/style")
	val width: FieldsList<RowDataField> get() = fieldsList("${path}/width")
}

abstract class RowDataFieldLink(private val path: String) : FieldsList<RowDataField>(path) {
	val uri: FieldsList<RowDataField> get() = fieldsList("${path}/uri")
}

abstract class RowDataFieldPivotGroupLimit(private val path: String) : FieldsList<RowDataField>(path) {
	val applyOrder: FieldsList<RowDataField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<RowDataField> get() = fieldsList("${path}/countLimit")
}

abstract class RowDataFieldPivotGroupRule(private val path: String) : FieldsList<RowDataField>(path) {
	val dateTimeRule by lazy { object : RowDataFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : RowDataFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : RowDataFieldManualRule("${path}/manualRule") {} }
}

abstract class RowDataFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<RowDataField>(path) {
	val buckets by lazy { object : RowDataFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<RowDataField> get() = fieldsList("${path}/valuesIndex")
}

abstract class RowDataFieldPivotGroupValueMetadata(private val path: String) : FieldsList<RowDataField>(path) {
	val collapsed: FieldsList<RowDataField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : RowDataFieldExtendedValue("${path}/value") {} }
}

abstract class RowDataFieldDateTimeRule(private val path: String) : FieldsList<RowDataField>(path) {
	val type: FieldsList<RowDataField> get() = fieldsList("${path}/type")
}

abstract class RowDataFieldHistogramRule(private val path: String) : FieldsList<RowDataField>(path) {
	val end: FieldsList<RowDataField> get() = fieldsList("${path}/end")
	val interval: FieldsList<RowDataField> get() = fieldsList("${path}/interval")
	val start: FieldsList<RowDataField> get() = fieldsList("${path}/start")
}

abstract class RowDataFieldManualRule(private val path: String) : FieldsList<RowDataField>(path) {
	val groups by lazy { object : RowDataFieldManualRuleGroup("${path}/groups") {} }
}

abstract class RowDataFieldManualRuleGroup(private val path: String) : FieldsList<RowDataField>(path) {
	val groupName by lazy { object : RowDataFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : RowDataFieldExtendedValue("${path}/items") {} }
}

