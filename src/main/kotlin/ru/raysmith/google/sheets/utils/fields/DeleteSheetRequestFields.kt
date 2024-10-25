package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteSheetRequestField : Field

object DeleteSheetRequestFields {
    val ALL: FieldsList<DeleteSheetRequestField> = fieldsList("*")
	val sheetId: FieldsList<DeleteSheetRequestField> get() = fieldsList("sheetId")
}

