package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ClearValuesRequestField : Field

object ClearValuesRequestFields {
    val ALL: FieldsList<ClearValuesRequestField> = fieldsList("*")
}

