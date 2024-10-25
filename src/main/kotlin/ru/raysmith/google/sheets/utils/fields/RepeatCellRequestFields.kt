package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RepeatCellRequestField : Field

object RepeatCellRequestFields {
    val ALL: FieldsList<RepeatCellRequestField> = fieldsList("*")
	val cell = object : RepeatCellRequestFieldCellData("cell") {}
	val fields: FieldsList<RepeatCellRequestField> get() = fieldsList("fields")
	val range = object : RepeatCellRequestFieldGridRange("range") {}
}

abstract class RepeatCellRequestFieldCellData(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val dataSourceFormula by lazy { object : RepeatCellRequestFieldDataSourceFormula("${path}/dataSourceFormula") {} }
	val dataSourceTable by lazy { object : RepeatCellRequestFieldDataSourceTable("${path}/dataSourceTable") {} }
	val dataValidation by lazy { object : RepeatCellRequestFieldDataValidationRule("${path}/dataValidation") {} }
	val effectiveFormat by lazy { object : RepeatCellRequestFieldCellFormat("${path}/effectiveFormat") {} }
	val effectiveValue by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/effectiveValue") {} }
	val formattedValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/formattedValue")
	val hyperlink: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/hyperlink")
	val note: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/note")
	val pivotTable by lazy { object : RepeatCellRequestFieldPivotTable("${path}/pivotTable") {} }
	val textFormatRuns by lazy { object : RepeatCellRequestFieldTextFormatRun("${path}/textFormatRuns") {} }
	val userEnteredFormat by lazy { object : RepeatCellRequestFieldCellFormat("${path}/userEnteredFormat") {} }
	val userEnteredValue by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/userEnteredValue") {} }
}

abstract class RepeatCellRequestFieldGridRange(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val endColumnIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class RepeatCellRequestFieldDataSourceFormula(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val dataExecutionStatus by lazy { object : RepeatCellRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class RepeatCellRequestFieldDataSourceTable(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val columnSelectionType: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/columnSelectionType")
	val columns by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : RepeatCellRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RepeatCellRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val rowLimit: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/rowLimit")
	val sortSpecs by lazy { object : RepeatCellRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class RepeatCellRequestFieldDataValidationRule(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val condition by lazy { object : RepeatCellRequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/strict")
}

abstract class RepeatCellRequestFieldCellFormat(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val backgroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val borders by lazy { object : RepeatCellRequestFieldBorders("${path}/borders") {} }
	val horizontalAlignment: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val hyperlinkDisplayType: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/hyperlinkDisplayType")
	val numberFormat by lazy { object : RepeatCellRequestFieldNumberFormat("${path}/numberFormat") {} }
	val padding by lazy { object : RepeatCellRequestFieldPadding("${path}/padding") {} }
	val textDirection: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/textDirection")
	val textFormat by lazy { object : RepeatCellRequestFieldTextFormat("${path}/textFormat") {} }
	val textRotation by lazy { object : RepeatCellRequestFieldTextRotation("${path}/textRotation") {} }
	val verticalAlignment: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/verticalAlignment")
	val wrapStrategy: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/wrapStrategy")
}

abstract class RepeatCellRequestFieldExtendedValue(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val boolValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : RepeatCellRequestFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/stringValue")
}

abstract class RepeatCellRequestFieldPivotTable(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val columns by lazy { object : RepeatCellRequestFieldPivotGroup("${path}/columns") {} }
	val criteria by lazy { object : RepeatCellRequestFieldPivotFilterCriteria("${path}/criteria") {} }
	val dataExecutionStatus by lazy { object : RepeatCellRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/dataSourceId")
	val filterSpecs by lazy { object : RepeatCellRequestFieldPivotFilterSpec("${path}/filterSpecs") {} }
	val rows by lazy { object : RepeatCellRequestFieldPivotGroup("${path}/rows") {} }
	val source by lazy { object : RepeatCellRequestFieldGridRange("${path}/source") {} }
	val valueLayout: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/valueLayout")
	val values by lazy { object : RepeatCellRequestFieldPivotValue("${path}/values") {} }
}

abstract class RepeatCellRequestFieldTextFormatRun(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val format by lazy { object : RepeatCellRequestFieldTextFormat("${path}/format") {} }
	val startIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class RepeatCellRequestFieldDataExecutionStatus(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val errorCode: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/state")
}

abstract class RepeatCellRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val name: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/name")
}

abstract class RepeatCellRequestFieldFilterSpec(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val columnIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RepeatCellRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RepeatCellRequestFieldSortSpec(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val backgroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class RepeatCellRequestFieldBooleanCondition(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val type: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : RepeatCellRequestFieldConditionValue("${path}/values") {} }
}

abstract class RepeatCellRequestFieldColor(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val alpha: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/red")
}

abstract class RepeatCellRequestFieldColorStyle(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val rgbColor by lazy { object : RepeatCellRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class RepeatCellRequestFieldBorders(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val bottom by lazy { object : RepeatCellRequestFieldBorder("${path}/bottom") {} }
	val left by lazy { object : RepeatCellRequestFieldBorder("${path}/left") {} }
	val right by lazy { object : RepeatCellRequestFieldBorder("${path}/right") {} }
	val top by lazy { object : RepeatCellRequestFieldBorder("${path}/top") {} }
}

abstract class RepeatCellRequestFieldNumberFormat(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val pattern: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/pattern")
	val type: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/type")
}

abstract class RepeatCellRequestFieldPadding(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val bottom: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/bottom")
	val left: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/left")
	val right: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/right")
	val top: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/top")
}

abstract class RepeatCellRequestFieldTextFormat(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val bold: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : RepeatCellRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/underline")
}

abstract class RepeatCellRequestFieldTextRotation(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val angle: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/angle")
	val vertical: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/vertical")
}

abstract class RepeatCellRequestFieldErrorValue(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val message: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/message")
	val type: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/type")
}

abstract class RepeatCellRequestFieldPivotGroup(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val dataSourceColumnReference by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : RepeatCellRequestFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : RepeatCellRequestFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : RepeatCellRequestFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : RepeatCellRequestFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class RepeatCellRequestFieldPivotFilterCriteria(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val condition by lazy { object : RepeatCellRequestFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/visibleValues")
}

abstract class RepeatCellRequestFieldPivotFilterSpec(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val columnOffsetIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : RepeatCellRequestFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class RepeatCellRequestFieldPivotValue(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val calculatedDisplayType: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : RepeatCellRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/formula")
	val name: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class RepeatCellRequestFieldFilterCriteria(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val condition by lazy { object : RepeatCellRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : RepeatCellRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class RepeatCellRequestFieldConditionValue(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val relativeDate: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class RepeatCellRequestFieldBorder(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val color by lazy { object : RepeatCellRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : RepeatCellRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/width")
}

abstract class RepeatCellRequestFieldLink(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val uri: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/uri")
}

abstract class RepeatCellRequestFieldPivotGroupLimit(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val applyOrder: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/countLimit")
}

abstract class RepeatCellRequestFieldPivotGroupRule(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val dateTimeRule by lazy { object : RepeatCellRequestFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : RepeatCellRequestFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : RepeatCellRequestFieldManualRule("${path}/manualRule") {} }
}

abstract class RepeatCellRequestFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val buckets by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/valuesIndex")
}

abstract class RepeatCellRequestFieldPivotGroupValueMetadata(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val collapsed: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/value") {} }
}

abstract class RepeatCellRequestFieldDateTimeRule(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val type: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/type")
}

abstract class RepeatCellRequestFieldHistogramRule(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val end: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/end")
	val interval: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/interval")
	val start: FieldsList<RepeatCellRequestField> get() = fieldsList("${path}/start")
}

abstract class RepeatCellRequestFieldManualRule(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val groups by lazy { object : RepeatCellRequestFieldManualRuleGroup("${path}/groups") {} }
}

abstract class RepeatCellRequestFieldManualRuleGroup(private val path: String) : FieldsList<RepeatCellRequestField>(path) {
	val groupName by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : RepeatCellRequestFieldExtendedValue("${path}/items") {} }
}

