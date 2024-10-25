package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataExecutionStatusField : Field

object DataExecutionStatusFields {
    val ALL: FieldsList<DataExecutionStatusField> = fieldsList("*")
	val errorCode: FieldsList<DataExecutionStatusField> get() = fieldsList("errorCode")
	val errorMessage: FieldsList<DataExecutionStatusField> get() = fieldsList("errorMessage")
	val lastRefreshTime: FieldsList<DataExecutionStatusField> get() = fieldsList("lastRefreshTime")
	val state: FieldsList<DataExecutionStatusField> get() = fieldsList("state")
}

