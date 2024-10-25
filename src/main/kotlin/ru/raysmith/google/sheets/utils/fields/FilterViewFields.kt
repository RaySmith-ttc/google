package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterViewField : Field

object FilterViewFields {
    val ALL: FieldsList<FilterViewField> = fieldsList("*")
	val criteria = object : FilterViewFieldFilterCriteria("criteria") {}
	val filterSpecs = object : FilterViewFieldFilterSpec("filterSpecs") {}
	val filterViewId: FieldsList<FilterViewField> get() = fieldsList("filterViewId")
	val namedRangeId: FieldsList<FilterViewField> get() = fieldsList("namedRangeId")
	val range = object : FilterViewFieldGridRange("range") {}
	val sortSpecs = object : FilterViewFieldSortSpec("sortSpecs") {}
	val title: FieldsList<FilterViewField> get() = fieldsList("title")
}

abstract class FilterViewFieldFilterCriteria(private val path: String) : FieldsList<FilterViewField>(path) {
	val condition by lazy { object : FilterViewFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<FilterViewField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : FilterViewFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : FilterViewFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : FilterViewFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : FilterViewFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class FilterViewFieldFilterSpec(private val path: String) : FieldsList<FilterViewField>(path) {
	val columnIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : FilterViewFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : FilterViewFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class FilterViewFieldGridRange(private val path: String) : FieldsList<FilterViewField>(path) {
	val endColumnIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<FilterViewField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/startRowIndex")
}

abstract class FilterViewFieldSortSpec(private val path: String) : FieldsList<FilterViewField>(path) {
	val backgroundColor by lazy { object : FilterViewFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : FilterViewFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : FilterViewFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<FilterViewField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : FilterViewFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : FilterViewFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<FilterViewField> get() = fieldsList("${path}/sortOrder")
}

abstract class FilterViewFieldBooleanCondition(private val path: String) : FieldsList<FilterViewField>(path) {
	val type: FieldsList<FilterViewField> get() = fieldsList("${path}/type")
	val values by lazy { object : FilterViewFieldConditionValue("${path}/values") {} }
}

abstract class FilterViewFieldColor(private val path: String) : FieldsList<FilterViewField>(path) {
	val alpha: FieldsList<FilterViewField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<FilterViewField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FilterViewField> get() = fieldsList("${path}/green")
	val red: FieldsList<FilterViewField> get() = fieldsList("${path}/red")
}

abstract class FilterViewFieldColorStyle(private val path: String) : FieldsList<FilterViewField>(path) {
	val rgbColor by lazy { object : FilterViewFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<FilterViewField> get() = fieldsList("${path}/themeColor")
}

abstract class FilterViewFieldDataSourceColumnReference(private val path: String) : FieldsList<FilterViewField>(path) {
	val name: FieldsList<FilterViewField> get() = fieldsList("${path}/name")
}

abstract class FilterViewFieldConditionValue(private val path: String) : FieldsList<FilterViewField>(path) {
	val relativeDate: FieldsList<FilterViewField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<FilterViewField> get() = fieldsList("${path}/userEnteredValue")
}

