package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DuplicateSheetRequestField : Field

object DuplicateSheetRequestFields {
    val ALL: FieldsList<DuplicateSheetRequestField> = fieldsList("*")
	val insertSheetIndex: FieldsList<DuplicateSheetRequestField> get() = fieldsList("insertSheetIndex")
	val newSheetId: FieldsList<DuplicateSheetRequestField> get() = fieldsList("newSheetId")
	val newSheetName: FieldsList<DuplicateSheetRequestField> get() = fieldsList("newSheetName")
	val sourceSheetId: FieldsList<DuplicateSheetRequestField> get() = fieldsList("sourceSheetId")
}

