package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DuplicateFilterViewRequestField : Field

object DuplicateFilterViewRequestFields {
    val ALL: FieldsList<DuplicateFilterViewRequestField> = fieldsList("*")
	val filterId: FieldsList<DuplicateFilterViewRequestField> get() = fieldsList("filterId")
}

