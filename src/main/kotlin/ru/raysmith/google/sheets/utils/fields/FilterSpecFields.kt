package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterSpecField : Field

object FilterSpecFields {
    val ALL: FieldsList<FilterSpecField> = fieldsList("*")
	val columnIndex: FieldsList<FilterSpecField> get() = fieldsList("columnIndex")
	val dataSourceColumnReference = object : FilterSpecFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val filterCriteria = object : FilterSpecFieldFilterCriteria("filterCriteria") {}
}

abstract class FilterSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<FilterSpecField>(path) {
	val name: FieldsList<FilterSpecField> get() = fieldsList("${path}/name")
}

abstract class FilterSpecFieldFilterCriteria(private val path: String) : FieldsList<FilterSpecField>(path) {
	val condition by lazy { object : FilterSpecFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<FilterSpecField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : FilterSpecFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : FilterSpecFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : FilterSpecFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : FilterSpecFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class FilterSpecFieldBooleanCondition(private val path: String) : FieldsList<FilterSpecField>(path) {
	val type: FieldsList<FilterSpecField> get() = fieldsList("${path}/type")
	val values by lazy { object : FilterSpecFieldConditionValue("${path}/values") {} }
}

abstract class FilterSpecFieldColor(private val path: String) : FieldsList<FilterSpecField>(path) {
	val alpha: FieldsList<FilterSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<FilterSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FilterSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<FilterSpecField> get() = fieldsList("${path}/red")
}

abstract class FilterSpecFieldColorStyle(private val path: String) : FieldsList<FilterSpecField>(path) {
	val rgbColor by lazy { object : FilterSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<FilterSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class FilterSpecFieldConditionValue(private val path: String) : FieldsList<FilterSpecField>(path) {
	val relativeDate: FieldsList<FilterSpecField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<FilterSpecField> get() = fieldsList("${path}/userEnteredValue")
}

