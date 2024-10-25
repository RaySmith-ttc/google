package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddDimensionGroupResponseField : Field

object AddDimensionGroupResponseFields {
    val ALL: FieldsList<AddDimensionGroupResponseField> = fieldsList("*")
	val dimensionGroups = object : AddDimensionGroupResponseFieldDimensionGroup("dimensionGroups") {}
}

abstract class AddDimensionGroupResponseFieldDimensionGroup(private val path: String) : FieldsList<AddDimensionGroupResponseField>(path) {
	val collapsed: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/collapsed")
	val depth: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/depth")
	val range by lazy { object : AddDimensionGroupResponseFieldDimensionRange("${path}/range") {} }
}

abstract class AddDimensionGroupResponseFieldDimensionRange(private val path: String) : FieldsList<AddDimensionGroupResponseField>(path) {
	val dimension: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<AddDimensionGroupResponseField> get() = fieldsList("${path}/startIndex")
}

