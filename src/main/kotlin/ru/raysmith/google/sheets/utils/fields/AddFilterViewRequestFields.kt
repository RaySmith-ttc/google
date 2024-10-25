package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddFilterViewRequestField : Field

object AddFilterViewRequestFields {
    val ALL: FieldsList<AddFilterViewRequestField> = fieldsList("*")
	val filter = object : AddFilterViewRequestFieldFilterView("filter") {}
}

abstract class AddFilterViewRequestFieldFilterView(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val criteria by lazy { object : AddFilterViewRequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : AddFilterViewRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddFilterViewRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : AddFilterViewRequestFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/title")
}

abstract class AddFilterViewRequestFieldFilterCriteria(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val condition by lazy { object : AddFilterViewRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddFilterViewRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddFilterViewRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddFilterViewRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddFilterViewRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddFilterViewRequestFieldFilterSpec(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val columnIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : AddFilterViewRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : AddFilterViewRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class AddFilterViewRequestFieldGridRange(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val endColumnIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddFilterViewRequestFieldSortSpec(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val backgroundColor by lazy { object : AddFilterViewRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddFilterViewRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : AddFilterViewRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : AddFilterViewRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddFilterViewRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class AddFilterViewRequestFieldBooleanCondition(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val type: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddFilterViewRequestFieldConditionValue("${path}/values") {} }
}

abstract class AddFilterViewRequestFieldColor(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val alpha: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/red")
}

abstract class AddFilterViewRequestFieldColorStyle(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val rgbColor by lazy { object : AddFilterViewRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AddFilterViewRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val name: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/name")
}

abstract class AddFilterViewRequestFieldConditionValue(private val path: String) : FieldsList<AddFilterViewRequestField>(path) {
	val relativeDate: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddFilterViewRequestField> get() = fieldsList("${path}/userEnteredValue")
}

