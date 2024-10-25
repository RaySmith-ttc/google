package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateFilterViewRequestField : Field

object UpdateFilterViewRequestFields {
    val ALL: FieldsList<UpdateFilterViewRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("fields")
	val filter = object : UpdateFilterViewRequestFieldFilterView("filter") {}
}

abstract class UpdateFilterViewRequestFieldFilterView(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val criteria by lazy { object : UpdateFilterViewRequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : UpdateFilterViewRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val filterViewId: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/filterViewId")
	val namedRangeId: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : UpdateFilterViewRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : UpdateFilterViewRequestFieldSortSpec("${path}/sortSpecs") {} }
	val title: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/title")
}

abstract class UpdateFilterViewRequestFieldFilterCriteria(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val condition by lazy { object : UpdateFilterViewRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : UpdateFilterViewRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : UpdateFilterViewRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : UpdateFilterViewRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : UpdateFilterViewRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class UpdateFilterViewRequestFieldFilterSpec(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val columnIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : UpdateFilterViewRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : UpdateFilterViewRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class UpdateFilterViewRequestFieldGridRange(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateFilterViewRequestFieldSortSpec(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val backgroundColor by lazy { object : UpdateFilterViewRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateFilterViewRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : UpdateFilterViewRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : UpdateFilterViewRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateFilterViewRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class UpdateFilterViewRequestFieldBooleanCondition(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val type: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateFilterViewRequestFieldConditionValue("${path}/values") {} }
}

abstract class UpdateFilterViewRequestFieldColor(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val alpha: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateFilterViewRequestFieldColorStyle(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val rgbColor by lazy { object : UpdateFilterViewRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateFilterViewRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val name: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/name")
}

abstract class UpdateFilterViewRequestFieldConditionValue(private val path: String) : FieldsList<UpdateFilterViewRequestField>(path) {
	val relativeDate: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateFilterViewRequestField> get() = fieldsList("${path}/userEnteredValue")
}

