package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BigQueryTableSpecField : Field

object BigQueryTableSpecFields {
    val ALL: FieldsList<BigQueryTableSpecField> = fieldsList("*")
	val datasetId: FieldsList<BigQueryTableSpecField> get() = fieldsList("datasetId")
	val tableId: FieldsList<BigQueryTableSpecField> get() = fieldsList("tableId")
	val tableProjectId: FieldsList<BigQueryTableSpecField> get() = fieldsList("tableProjectId")
}

