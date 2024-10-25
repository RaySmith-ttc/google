package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SheetsChartReferenceField : Field

object SheetsChartReferenceFields {
    val ALL: FieldsList<SheetsChartReferenceField> = fieldsList("*")
	val chartId: FieldsList<SheetsChartReferenceField> get() = fieldsList("chartId")
	val spreadsheetId: FieldsList<SheetsChartReferenceField> get() = fieldsList("spreadsheetId")
}

