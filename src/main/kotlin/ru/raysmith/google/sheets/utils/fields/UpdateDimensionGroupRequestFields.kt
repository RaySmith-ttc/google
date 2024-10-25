package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDimensionGroupRequestField : Field

object UpdateDimensionGroupRequestFields {
    val ALL: FieldsList<UpdateDimensionGroupRequestField> = fieldsList("*")
	val dimensionGroup = object : UpdateDimensionGroupRequestFieldDimensionGroup("dimensionGroup") {}
	val fields: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("fields")
}

abstract class UpdateDimensionGroupRequestFieldDimensionGroup(private val path: String) : FieldsList<UpdateDimensionGroupRequestField>(path) {
	val collapsed: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/depth")
	val range by lazy { object : UpdateDimensionGroupRequestFieldDimensionRange("${path}/range") {} }
}

abstract class UpdateDimensionGroupRequestFieldDimensionRange(private val path: String) : FieldsList<UpdateDimensionGroupRequestField>(path) {
	val dimension: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<UpdateDimensionGroupRequestField> get() = fieldsList("${path}/startIndex")
}

