package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchClearValuesResponseField : Field

object BatchClearValuesResponseFields {
    val ALL: FieldsList<BatchClearValuesResponseField> = fieldsList("*")
	val clearedRanges: FieldsList<BatchClearValuesResponseField> get() = fieldsList("clearedRanges")
	val spreadsheetId: FieldsList<BatchClearValuesResponseField> get() = fieldsList("spreadsheetId")
}

