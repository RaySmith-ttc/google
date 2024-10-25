package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotFilterSpecField : Field

object PivotFilterSpecFields {
    val ALL: FieldsList<PivotFilterSpecField> = fieldsList("*")
	val columnOffsetIndex: FieldsList<PivotFilterSpecField> get() = fieldsList("columnOffsetIndex")
	val dataSourceColumnReference = object : PivotFilterSpecFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val filterCriteria = object : PivotFilterSpecFieldPivotFilterCriteria("filterCriteria") {}
}

abstract class PivotFilterSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<PivotFilterSpecField>(path) {
	val name: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/name")
}

abstract class PivotFilterSpecFieldPivotFilterCriteria(private val path: String) : FieldsList<PivotFilterSpecField>(path) {
	val condition by lazy { object : PivotFilterSpecFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/visibleValues")
}

abstract class PivotFilterSpecFieldBooleanCondition(private val path: String) : FieldsList<PivotFilterSpecField>(path) {
	val type: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/type")
	val values by lazy { object : PivotFilterSpecFieldConditionValue("${path}/values") {} }
}

abstract class PivotFilterSpecFieldConditionValue(private val path: String) : FieldsList<PivotFilterSpecField>(path) {
	val relativeDate: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<PivotFilterSpecField> get() = fieldsList("${path}/userEnteredValue")
}

