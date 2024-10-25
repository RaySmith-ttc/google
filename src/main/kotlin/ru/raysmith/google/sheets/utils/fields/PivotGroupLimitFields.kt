package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotGroupLimitField : Field

object PivotGroupLimitFields {
    val ALL: FieldsList<PivotGroupLimitField> = fieldsList("*")
	val applyOrder: FieldsList<PivotGroupLimitField> get() = fieldsList("applyOrder")
	val countLimit: FieldsList<PivotGroupLimitField> get() = fieldsList("countLimit")
}

