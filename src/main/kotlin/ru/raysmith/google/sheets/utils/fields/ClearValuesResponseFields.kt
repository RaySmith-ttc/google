package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ClearValuesResponseField : Field

object ClearValuesResponseFields {
    val ALL: FieldsList<ClearValuesResponseField> = fieldsList("*")
	val clearedRange: FieldsList<ClearValuesResponseField> get() = fieldsList("clearedRange")
	val spreadsheetId: FieldsList<ClearValuesResponseField> get() = fieldsList("spreadsheetId")
}

