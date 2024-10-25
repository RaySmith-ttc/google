package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertInlineSheetsChartResponseField : Field

object InsertInlineSheetsChartResponseFields {
    val ALL: FieldsList<InsertInlineSheetsChartResponseField> = fieldsList("*")
	val objectId: FieldsList<InsertInlineSheetsChartResponseField> get() = fieldsList("objectId")
}

