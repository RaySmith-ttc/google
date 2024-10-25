package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotGroupSortValueBucketField : Field

object PivotGroupSortValueBucketFields {
    val ALL: FieldsList<PivotGroupSortValueBucketField> = fieldsList("*")
	val buckets = object : PivotGroupSortValueBucketFieldExtendedValue("buckets") {}
	val valuesIndex: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("valuesIndex")
}

abstract class PivotGroupSortValueBucketFieldExtendedValue(private val path: String) : FieldsList<PivotGroupSortValueBucketField>(path) {
	val boolValue: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : PivotGroupSortValueBucketFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/stringValue")
}

abstract class PivotGroupSortValueBucketFieldErrorValue(private val path: String) : FieldsList<PivotGroupSortValueBucketField>(path) {
	val message: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/message")
	val type: FieldsList<PivotGroupSortValueBucketField> get() = fieldsList("${path}/type")
}

