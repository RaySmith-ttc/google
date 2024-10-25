package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CellDataField : Field

object CellDataFields {
    val ALL: FieldsList<CellDataField> = fieldsList("*")
	val dataSourceFormula = object : CellDataFieldDataSourceFormula("dataSourceFormula") {}
	val dataSourceTable = object : CellDataFieldDataSourceTable("dataSourceTable") {}
	val dataValidation = object : CellDataFieldDataValidationRule("dataValidation") {}
	val effectiveFormat = object : CellDataFieldCellFormat("effectiveFormat") {}
	val effectiveValue = object : CellDataFieldExtendedValue("effectiveValue") {}
	val formattedValue: FieldsList<CellDataField> get() = fieldsList("formattedValue")
	val hyperlink: FieldsList<CellDataField> get() = fieldsList("hyperlink")
	val note: FieldsList<CellDataField> get() = fieldsList("note")
	val pivotTable = object : CellDataFieldPivotTable("pivotTable") {}
	val textFormatRuns = object : CellDataFieldTextFormatRun("textFormatRuns") {}
	val userEnteredFormat = object : CellDataFieldCellFormat("userEnteredFormat") {}
	val userEnteredValue = object : CellDataFieldExtendedValue("userEnteredValue") {}
}

abstract class CellDataFieldDataSourceFormula(private val path: String) : FieldsList<CellDataField>(path) {
	val dataExecutionStatus by lazy { object : CellDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<CellDataField> get() = fieldsList("${path}/dataSourceId")
}

abstract class CellDataFieldDataSourceTable(private val path: String) : FieldsList<CellDataField>(path) {
	val columnSelectionType: FieldsList<CellDataField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : CellDataFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : CellDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<CellDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : CellDataFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<CellDataField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : CellDataFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class CellDataFieldDataValidationRule(private val path: String) : FieldsList<CellDataField>(path) {
	val condition by lazy { object : CellDataFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<CellDataField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<CellDataField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<CellDataField> get() = fieldsList("${path}/strict")
}

abstract class CellDataFieldCellFormat(private val path: String) : FieldsList<CellDataField>(path) {
	val backgroundColor by lazy { object : CellDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : CellDataFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<CellDataField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<CellDataField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : CellDataFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : CellDataFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<CellDataField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : CellDataFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : CellDataFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<CellDataField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<CellDataField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class CellDataFieldExtendedValue(private val path: String) : FieldsList<CellDataField>(path) {
	val boolValue: FieldsList<CellDataField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : CellDataFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<CellDataField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<CellDataField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<CellDataField> get() = fieldsList("${path}/stringValue")
}

abstract class CellDataFieldPivotTable(private val path: String) : FieldsList<CellDataField>(path) {
	val columns by lazy { object : CellDataFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : CellDataFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : CellDataFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<CellDataField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : CellDataFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : CellDataFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : CellDataFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<CellDataField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : CellDataFieldPivotValue("${path}/values") {} }
}

abstract class CellDataFieldTextFormatRun(private val path: String) : FieldsList<CellDataField>(path) {
	val format by lazy { object : CellDataFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<CellDataField> get() = fieldsList("${path}/startIndex")
}

abstract class CellDataFieldDataExecutionStatus(private val path: String) : FieldsList<CellDataField>(path) {
	val errorCode: FieldsList<CellDataField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<CellDataField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<CellDataField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<CellDataField> get() = fieldsList("${path}/state")
}

abstract class CellDataFieldDataSourceColumnReference(private val path: String) : FieldsList<CellDataField>(path) {
	val name: FieldsList<CellDataField> get() = fieldsList("${path}/name")
}

abstract class CellDataFieldFilterSpec(private val path: String) : FieldsList<CellDataField>(path) {
	val columnIndex: FieldsList<CellDataField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : CellDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : CellDataFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class CellDataFieldSortSpec(private val path: String) : FieldsList<CellDataField>(path) {
	val backgroundColor by lazy { object : CellDataFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : CellDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<CellDataField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : CellDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<CellDataField> get() = fieldsList("${path}/sortOrder")
}

abstract class CellDataFieldBooleanCondition(private val path: String) : FieldsList<CellDataField>(path) {
	val type: FieldsList<CellDataField> get() = fieldsList("${path}/type")
	val values by lazy { object : CellDataFieldConditionValue("${path}/values") {} }
}

abstract class CellDataFieldColor(private val path: String) : FieldsList<CellDataField>(path) {
	val alpha: FieldsList<CellDataField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<CellDataField> get() = fieldsList("${path}/blue")
	val green: FieldsList<CellDataField> get() = fieldsList("${path}/green")
	val red: FieldsList<CellDataField> get() = fieldsList("${path}/red")
}

abstract class CellDataFieldColorStyle(private val path: String) : FieldsList<CellDataField>(path) {
	val rgbColor by lazy { object : CellDataFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<CellDataField> get() = fieldsList("${path}/themeColor")
}

abstract class CellDataFieldBorders(private val path: String) : FieldsList<CellDataField>(path) {
	val bottom by lazy { object : CellDataFieldBorder("${path}/bottom") {} }
	val left by lazy { object : CellDataFieldBorder("${path}/left") {} }
	val right by lazy { object : CellDataFieldBorder("${path}/right") {} }
	val top by lazy { object : CellDataFieldBorder("${path}/top") {} }
}

abstract class CellDataFieldNumberFormat(private val path: String) : FieldsList<CellDataField>(path) {
	val pattern: FieldsList<CellDataField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<CellDataField> get() = fieldsList("${path}/type")
}

abstract class CellDataFieldPadding(private val path: String) : FieldsList<CellDataField>(path) {
	val bottom: FieldsList<CellDataField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<CellDataField> get() = fieldsList("${path}/left")
	val right: FieldsList<CellDataField> get() = fieldsList("${path}/right")
	val top: FieldsList<CellDataField> get() = fieldsList("${path}/top")
}

abstract class CellDataFieldTextFormat(private val path: String) : FieldsList<CellDataField>(path) {
	val bold: FieldsList<CellDataField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<CellDataField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<CellDataField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : CellDataFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<CellDataField> get() = fieldsList("${path}/italic")
	val link by lazy { object : CellDataFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<CellDataField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<CellDataField> get() = fieldsList("${path}/underline")
}

abstract class CellDataFieldTextRotation(private val path: String) : FieldsList<CellDataField>(path) {
	val angle: FieldsList<CellDataField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<CellDataField> get() = fieldsList("${path}/vertical")
}

abstract class CellDataFieldErrorValue(private val path: String) : FieldsList<CellDataField>(path) {
	val message: FieldsList<CellDataField> get() = fieldsList("${path}/message")
	val type: FieldsList<CellDataField> get() = fieldsList("${path}/type")
}

abstract class CellDataFieldPivotGroup(private val path: String) : FieldsList<CellDataField>(path) {
	val dataSourceColumnReference by lazy { object : CellDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : CellDataFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : CellDataFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<CellDataField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<CellDataField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<CellDataField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<CellDataField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<CellDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : CellDataFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : CellDataFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class CellDataFieldPivotFilterCriteria(private val path: String) : FieldsList<CellDataField>(path) {
	val condition by lazy { object : CellDataFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<CellDataField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<CellDataField> get() = fieldsList("${path}/visibleValues")
}

abstract class CellDataFieldPivotFilterSpec(private val path: String) : FieldsList<CellDataField>(path) {
	val columnOffsetIndex: FieldsList<CellDataField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : CellDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : CellDataFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class CellDataFieldGridRange(private val path: String) : FieldsList<CellDataField>(path) {
	val endColumnIndex: FieldsList<CellDataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CellDataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CellDataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CellDataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CellDataField> get() = fieldsList("${path}/startRowIndex")
}

abstract class CellDataFieldPivotValue(private val path: String) : FieldsList<CellDataField>(path) {
	val calculatedDisplayType: FieldsList<CellDataField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : CellDataFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<CellDataField> get() = fieldsList("${path}/formula")
	val name: FieldsList<CellDataField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<CellDataField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<CellDataField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class CellDataFieldFilterCriteria(private val path: String) : FieldsList<CellDataField>(path) {
	val condition by lazy { object : CellDataFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<CellDataField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : CellDataFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : CellDataFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : CellDataFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class CellDataFieldConditionValue(private val path: String) : FieldsList<CellDataField>(path) {
	val relativeDate: FieldsList<CellDataField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<CellDataField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class CellDataFieldBorder(private val path: String) : FieldsList<CellDataField>(path) {
	val color by lazy { object : CellDataFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : CellDataFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<CellDataField> get() = fieldsList("${path}/style")
	val width: FieldsList<CellDataField> get() = fieldsList("${path}/width")
}

abstract class CellDataFieldLink(private val path: String) : FieldsList<CellDataField>(path) {
	val uri: FieldsList<CellDataField> get() = fieldsList("${path}/uri")
}

abstract class CellDataFieldPivotGroupLimit(private val path: String) : FieldsList<CellDataField>(path) {
	val applyOrder: FieldsList<CellDataField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<CellDataField> get() = fieldsList("${path}/countLimit")
}

abstract class CellDataFieldPivotGroupRule(private val path: String) : FieldsList<CellDataField>(path) {
	val dateTimeRule by lazy { object : CellDataFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : CellDataFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : CellDataFieldManualRule("${path}/manualRule") {} }
}

abstract class CellDataFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<CellDataField>(path) {
	val buckets by lazy { object : CellDataFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<CellDataField> get() = fieldsList("${path}/valuesIndex")
}

abstract class CellDataFieldPivotGroupValueMetadata(private val path: String) : FieldsList<CellDataField>(path) {
	val collapsed: FieldsList<CellDataField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : CellDataFieldExtendedValue("${path}/value") {} }
}

abstract class CellDataFieldDateTimeRule(private val path: String) : FieldsList<CellDataField>(path) {
	val type: FieldsList<CellDataField> get() = fieldsList("${path}/type")
}

abstract class CellDataFieldHistogramRule(private val path: String) : FieldsList<CellDataField>(path) {
	val end: FieldsList<CellDataField> get() = fieldsList("${path}/end")
	val interval: FieldsList<CellDataField> get() = fieldsList("${path}/interval")
	val start: FieldsList<CellDataField> get() = fieldsList("${path}/start")
}

abstract class CellDataFieldManualRule(private val path: String) : FieldsList<CellDataField>(path) {
	val groups by lazy { object : CellDataFieldManualRuleGroup("${path}/groups") {} }
}

abstract class CellDataFieldManualRuleGroup(private val path: String) : FieldsList<CellDataField>(path) {
	val groupName by lazy { object : CellDataFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : CellDataFieldExtendedValue("${path}/items") {} }
}

