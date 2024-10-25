package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ClearBasicFilterRequestField : Field

object ClearBasicFilterRequestFields {
    val ALL: FieldsList<ClearBasicFilterRequestField> = fieldsList("*")
	val sheetId: FieldsList<ClearBasicFilterRequestField> get() = fieldsList("sheetId")
}

