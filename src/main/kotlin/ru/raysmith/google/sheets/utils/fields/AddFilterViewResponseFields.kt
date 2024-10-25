package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddFilterViewResponseField : Field

object AddFilterViewResponseFields {
    val ALL: FieldsList<AddFilterViewResponseField> = fieldsList("*")
	val filter = object : AddFilterViewResponseFieldFilterView("filter") {}
}

abstract class AddFilterViewResponseFieldFilterView(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val criteria by lazy { object : AddFilterViewResponseFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : AddFilterViewResponseFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddFilterViewResponseFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : AddFilterViewResponseFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/title")
}

abstract class AddFilterViewResponseFieldFilterCriteria(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val condition by lazy { object : AddFilterViewResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddFilterViewResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddFilterViewResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddFilterViewResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddFilterViewResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddFilterViewResponseFieldFilterSpec(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val columnIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : AddFilterViewResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AddFilterViewResponseFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AddFilterViewResponseFieldGridRange(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val endColumnIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddFilterViewResponseFieldSortSpec(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val backgroundColor by lazy { object : AddFilterViewResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddFilterViewResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : AddFilterViewResponseFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : AddFilterViewResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddFilterViewResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/sortOrder")
}

abstract class AddFilterViewResponseFieldBooleanCondition(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val type: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddFilterViewResponseFieldConditionValue("${path}/values") {} }
}

abstract class AddFilterViewResponseFieldColor(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val alpha: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/red")
}

abstract class AddFilterViewResponseFieldColorStyle(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val rgbColor by lazy { object : AddFilterViewResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class AddFilterViewResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val name: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/name")
}

abstract class AddFilterViewResponseFieldConditionValue(private val path: String) : FieldsList<AddFilterViewResponseField>(path) {
	val relativeDate: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddFilterViewResponseField> get() = fieldsList("${path}/userEnteredValue")
}

