package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LinkedContentReferenceField : Field

object LinkedContentReferenceFields {
    val ALL: FieldsList<LinkedContentReferenceField> = fieldsList("*")
	val sheetsChartReference = object : LinkedContentReferenceFieldSheetsChartReference("sheetsChartReference") {}
}

abstract class LinkedContentReferenceFieldSheetsChartReference(private val path: String) : FieldsList<LinkedContentReferenceField>(path) {
	val chartId: FieldsList<LinkedContentReferenceField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<LinkedContentReferenceField> get() = fieldsList("${path}/spreadsheetId")
}

