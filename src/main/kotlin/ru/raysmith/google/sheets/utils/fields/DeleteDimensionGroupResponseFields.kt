package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDimensionGroupResponseField : Field

object DeleteDimensionGroupResponseFields {
    val ALL: FieldsList<DeleteDimensionGroupResponseField> = fieldsList("*")
	val dimensionGroups = object : DeleteDimensionGroupResponseFieldDimensionGroup("dimensionGroups") {}
}

abstract class DeleteDimensionGroupResponseFieldDimensionGroup(private val path: String) : FieldsList<DeleteDimensionGroupResponseField>(path) {
	val collapsed: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/depth")
	val range by lazy { object : DeleteDimensionGroupResponseFieldDimensionRange("${path}/range") {} }
}

abstract class DeleteDimensionGroupResponseFieldDimensionRange(private val path: String) : FieldsList<DeleteDimensionGroupResponseField>(path) {
	val dimension: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDimensionGroupResponseField> get() = fieldsList("${path}/startIndex")
}

