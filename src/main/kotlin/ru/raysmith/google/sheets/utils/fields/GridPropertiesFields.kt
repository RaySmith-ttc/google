package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GridPropertiesField : Field

object GridPropertiesFields {
    val ALL: FieldsList<GridPropertiesField> = fieldsList("*")
	val columnCount: FieldsList<GridPropertiesField> get() = fieldsList("columnCount")
	val columnGroupControlAfter: FieldsList<GridPropertiesField> get() = fieldsList("columnGroupControlAfter")
	val frozenColumnCount: FieldsList<GridPropertiesField> get() = fieldsList("frozenColumnCount")
	val frozenRowCount: FieldsList<GridPropertiesField> get() = fieldsList("frozenRowCount")
	val hideGridlines: FieldsList<GridPropertiesField> get() = fieldsList("hideGridlines")
	val rowCount: FieldsList<GridPropertiesField> get() = fieldsList("rowCount")
	val rowGroupControlAfter: FieldsList<GridPropertiesField> get() = fieldsList("rowGroupControlAfter")
}

