package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterCriteriaField : Field

object FilterCriteriaFields {
    val ALL: FieldsList<FilterCriteriaField> = fieldsList("*")
	val condition = object : FilterCriteriaFieldBooleanCondition("condition") {}
	val hiddenValues: FieldsList<FilterCriteriaField> get() = fieldsList("hiddenValues")
	val visibleBackgroundColor = object : FilterCriteriaFieldColor("visibleBackgroundColor") {}
	val visibleBackgroundColorStyle = object : FilterCriteriaFieldColorStyle("visibleBackgroundColorStyle") {}
	val visibleForegroundColor = object : FilterCriteriaFieldColor("visibleForegroundColor") {}
	val visibleForegroundColorStyle = object : FilterCriteriaFieldColorStyle("visibleForegroundColorStyle") {}
}

abstract class FilterCriteriaFieldBooleanCondition(private val path: String) : FieldsList<FilterCriteriaField>(path) {
	val type: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/type")
	val values by lazy { object : FilterCriteriaFieldConditionValue("${path}/values") {} }
}

abstract class FilterCriteriaFieldColor(private val path: String) : FieldsList<FilterCriteriaField>(path) {
	val alpha: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/green")
	val red: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/red")
}

abstract class FilterCriteriaFieldColorStyle(private val path: String) : FieldsList<FilterCriteriaField>(path) {
	val rgbColor by lazy { object : FilterCriteriaFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/themeColor")
}

abstract class FilterCriteriaFieldConditionValue(private val path: String) : FieldsList<FilterCriteriaField>(path) {
	val relativeDate: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<FilterCriteriaField> get() = fieldsList("${path}/userEnteredValue")
}

