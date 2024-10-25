package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicFilterField : Field

object BasicFilterFields {
    val ALL: FieldsList<BasicFilterField> = fieldsList("*")
	val criteria = object : BasicFilterFieldFilterCriteria("criteria") {}
	val filterSpecs = object : BasicFilterFieldFilterSpec("filterSpecs") {}
	val range = object : BasicFilterFieldGridRange("range") {}
	val sortSpecs = object : BasicFilterFieldSortSpec("sortSpecs") {}
}

abstract class BasicFilterFieldFilterCriteria(private val path: String) : FieldsList<BasicFilterField>(path) {
	val condition by lazy { object : BasicFilterFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<BasicFilterField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : BasicFilterFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : BasicFilterFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : BasicFilterFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : BasicFilterFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class BasicFilterFieldFilterSpec(private val path: String) : FieldsList<BasicFilterField>(path) {
	val columnIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : BasicFilterFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : BasicFilterFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class BasicFilterFieldGridRange(private val path: String) : FieldsList<BasicFilterField>(path) {
	val endColumnIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BasicFilterField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BasicFilterFieldSortSpec(private val path: String) : FieldsList<BasicFilterField>(path) {
	val backgroundColor by lazy { object : BasicFilterFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : BasicFilterFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : BasicFilterFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<BasicFilterField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : BasicFilterFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BasicFilterFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<BasicFilterField> get() = fieldsList("${path}/sortOrder")
}

abstract class BasicFilterFieldBooleanCondition(private val path: String) : FieldsList<BasicFilterField>(path) {
	val type: FieldsList<BasicFilterField> get() = fieldsList("${path}/type")
	val values by lazy { object : BasicFilterFieldConditionValue("${path}/values") {} }
}

abstract class BasicFilterFieldColor(private val path: String) : FieldsList<BasicFilterField>(path) {
	val alpha: FieldsList<BasicFilterField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BasicFilterField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BasicFilterField> get() = fieldsList("${path}/green")
	val red: FieldsList<BasicFilterField> get() = fieldsList("${path}/red")
}

abstract class BasicFilterFieldColorStyle(private val path: String) : FieldsList<BasicFilterField>(path) {
	val rgbColor by lazy { object : BasicFilterFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BasicFilterField> get() = fieldsList("${path}/themeColor")
}

abstract class BasicFilterFieldDataSourceColumnReference(private val path: String) : FieldsList<BasicFilterField>(path) {
	val name: FieldsList<BasicFilterField> get() = fieldsList("${path}/name")
}

abstract class BasicFilterFieldConditionValue(private val path: String) : FieldsList<BasicFilterField>(path) {
	val relativeDate: FieldsList<BasicFilterField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<BasicFilterField> get() = fieldsList("${path}/userEnteredValue")
}

