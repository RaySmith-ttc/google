package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchClearValuesByDataFilterResponseField : Field

object BatchClearValuesByDataFilterResponseFields {
    val ALL: FieldsList<BatchClearValuesByDataFilterResponseField> = fieldsList("*")
	val clearedRanges: FieldsList<BatchClearValuesByDataFilterResponseField> get() = fieldsList("clearedRanges")
	val spreadsheetId: FieldsList<BatchClearValuesByDataFilterResponseField> get() = fieldsList("spreadsheetId")
}

