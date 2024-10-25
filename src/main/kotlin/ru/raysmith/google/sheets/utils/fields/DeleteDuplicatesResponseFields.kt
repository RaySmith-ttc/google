package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDuplicatesResponseField : Field

object DeleteDuplicatesResponseFields {
    val ALL: FieldsList<DeleteDuplicatesResponseField> = fieldsList("*")
	val duplicatesRemovedCount: FieldsList<DeleteDuplicatesResponseField> get() = fieldsList("duplicatesRemovedCount")
}

