package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RefreshCancellationStatusField : Field

object RefreshCancellationStatusFields {
    val ALL: FieldsList<RefreshCancellationStatusField> = fieldsList("*")
	val errorCode: FieldsList<RefreshCancellationStatusField> get() = fieldsList("errorCode")
	val state: FieldsList<RefreshCancellationStatusField> get() = fieldsList("state")
}

