package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AutoResizeDimensionsRequestField : Field

object AutoResizeDimensionsRequestFields {
    val ALL: FieldsList<AutoResizeDimensionsRequestField> = fieldsList("*")
	val dataSourceSheetDimensions = object : AutoResizeDimensionsRequestFieldDataSourceSheetDimensionRange("dataSourceSheetDimensions") {}
	val dimensions = object : AutoResizeDimensionsRequestFieldDimensionRange("dimensions") {}
}

abstract class AutoResizeDimensionsRequestFieldDataSourceSheetDimensionRange(private val path: String) : FieldsList<AutoResizeDimensionsRequestField>(path) {
	val columnReferences by lazy { object : AutoResizeDimensionsRequestFieldDataSourceColumnReference("${path}/columnReferences") {} }
	val sheetId: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class AutoResizeDimensionsRequestFieldDimensionRange(private val path: String) : FieldsList<AutoResizeDimensionsRequestField>(path) {
	val dimension: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class AutoResizeDimensionsRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AutoResizeDimensionsRequestField>(path) {
	val name: FieldsList<AutoResizeDimensionsRequestField> get() = fieldsList("${path}/name")
}

