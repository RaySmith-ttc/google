package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotGroupValueMetadataField : Field

object PivotGroupValueMetadataFields {
    val ALL: FieldsList<PivotGroupValueMetadataField> = fieldsList("*")
	val collapsed: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("collapsed")
	val value = object : PivotGroupValueMetadataFieldExtendedValue("value") {}
}

abstract class PivotGroupValueMetadataFieldExtendedValue(private val path: String) : FieldsList<PivotGroupValueMetadataField>(path) {
	val boolValue: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : PivotGroupValueMetadataFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/stringValue")
}

abstract class PivotGroupValueMetadataFieldErrorValue(private val path: String) : FieldsList<PivotGroupValueMetadataField>(path) {
	val message: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/message")
	val type: FieldsList<PivotGroupValueMetadataField> get() = fieldsList("${path}/type")
}

