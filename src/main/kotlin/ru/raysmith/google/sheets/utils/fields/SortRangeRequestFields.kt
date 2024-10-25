package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SortRangeRequestField : Field

object SortRangeRequestFields {
    val ALL: FieldsList<SortRangeRequestField> = fieldsList("*")
	val range = object : SortRangeRequestFieldGridRange("range") {}
	val sortSpecs = object : SortRangeRequestFieldSortSpec("sortSpecs") {}
}

abstract class SortRangeRequestFieldGridRange(private val path: String) : FieldsList<SortRangeRequestField>(path) {
	val endColumnIndex: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SortRangeRequestFieldSortSpec(private val path: String) : FieldsList<SortRangeRequestField>(path) {
	val backgroundColor by lazy { object : SortRangeRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SortRangeRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : SortRangeRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : SortRangeRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SortRangeRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class SortRangeRequestFieldColor(private val path: String) : FieldsList<SortRangeRequestField>(path) {
	val alpha: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/red")
}

abstract class SortRangeRequestFieldColorStyle(private val path: String) : FieldsList<SortRangeRequestField>(path) {
	val rgbColor by lazy { object : SortRangeRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class SortRangeRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<SortRangeRequestField>(path) {
	val name: FieldsList<SortRangeRequestField> get() = fieldsList("${path}/name")
}

