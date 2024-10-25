package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CopySheetToAnotherSpreadsheetRequestField : Field

object CopySheetToAnotherSpreadsheetRequestFields {
    val ALL: FieldsList<CopySheetToAnotherSpreadsheetRequestField> = fieldsList("*")
	val destinationSpreadsheetId: FieldsList<CopySheetToAnotherSpreadsheetRequestField> get() = fieldsList("destinationSpreadsheetId")
}

