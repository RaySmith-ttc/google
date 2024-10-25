package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceColumnReferenceField : Field

object DataSourceColumnReferenceFields {
    val ALL: FieldsList<DataSourceColumnReferenceField> = fieldsList("*")
	val name: FieldsList<DataSourceColumnReferenceField> get() = fieldsList("name")
}

