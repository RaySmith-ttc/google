package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DuplicateFilterViewResponseField : Field

object DuplicateFilterViewResponseFields {
    val ALL: FieldsList<DuplicateFilterViewResponseField> = fieldsList("*")
	val filter = object : DuplicateFilterViewResponseFieldFilterView("filter") {}
}

abstract class DuplicateFilterViewResponseFieldFilterView(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val criteria by lazy { object : DuplicateFilterViewResponseFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : DuplicateFilterViewResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : DuplicateFilterViewResponseFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : DuplicateFilterViewResponseFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/title")
}

abstract class DuplicateFilterViewResponseFieldFilterCriteria(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val condition by lazy { object : DuplicateFilterViewResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : DuplicateFilterViewResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : DuplicateFilterViewResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : DuplicateFilterViewResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : DuplicateFilterViewResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class DuplicateFilterViewResponseFieldFilterSpec(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val columnIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : DuplicateFilterViewResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : DuplicateFilterViewResponseFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class DuplicateFilterViewResponseFieldGridRange(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val endColumnIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class DuplicateFilterViewResponseFieldSortSpec(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val backgroundColor by lazy { object : DuplicateFilterViewResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : DuplicateFilterViewResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : DuplicateFilterViewResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : DuplicateFilterViewResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : DuplicateFilterViewResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/sortOrder")
}

abstract class DuplicateFilterViewResponseFieldBooleanCondition(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val type: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : DuplicateFilterViewResponseFieldConditionValue("${path}/values") {} }
}

abstract class DuplicateFilterViewResponseFieldColor(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val alpha: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/red")
}

abstract class DuplicateFilterViewResponseFieldColorStyle(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val rgbColor by lazy { object : DuplicateFilterViewResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class DuplicateFilterViewResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val name: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/name")
}

abstract class DuplicateFilterViewResponseFieldConditionValue(private val path: String) : FieldsList<DuplicateFilterViewResponseField>(path) {
	val relativeDate: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<DuplicateFilterViewResponseField> get() = fieldsList("${path}/userEnteredValue")
}

