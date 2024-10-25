package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDataSourceRequestField : Field

object DeleteDataSourceRequestFields {
    val ALL: FieldsList<DeleteDataSourceRequestField> = fieldsList("*")
	val dataSourceId: FieldsList<DeleteDataSourceRequestField> get() = fieldsList("dataSourceId")
}

