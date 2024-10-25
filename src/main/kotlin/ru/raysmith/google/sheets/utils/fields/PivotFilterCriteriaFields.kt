package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotFilterCriteriaField : Field

object PivotFilterCriteriaFields {
    val ALL: FieldsList<PivotFilterCriteriaField> = fieldsList("*")
	val condition = object : PivotFilterCriteriaFieldBooleanCondition("condition") {}
	val visibleByDefault: FieldsList<PivotFilterCriteriaField> get() = fieldsList("visibleByDefault")
	val visibleValues: FieldsList<PivotFilterCriteriaField> get() = fieldsList("visibleValues")
}

abstract class PivotFilterCriteriaFieldBooleanCondition(private val path: String) : FieldsList<PivotFilterCriteriaField>(path) {
	val type: FieldsList<PivotFilterCriteriaField> get() = fieldsList("${path}/type")
	val values by lazy { object : PivotFilterCriteriaFieldConditionValue("${path}/values") {} }
}

abstract class PivotFilterCriteriaFieldConditionValue(private val path: String) : FieldsList<PivotFilterCriteriaField>(path) {
	val relativeDate: FieldsList<PivotFilterCriteriaField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<PivotFilterCriteriaField> get() = fieldsList("${path}/userEnteredValue")
}

