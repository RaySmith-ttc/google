package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SortSpecField : Field

object SortSpecFields {
    val ALL: FieldsList<SortSpecField> = fieldsList("*")
	val backgroundColor = object : SortSpecFieldColor("backgroundColor") {}
	val backgroundColorStyle = object : SortSpecFieldColorStyle("backgroundColorStyle") {}
	val dataSourceColumnReference = object : SortSpecFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val dimensionIndex: FieldsList<SortSpecField> get() = fieldsList("dimensionIndex")
	val foregroundColor = object : SortSpecFieldColor("foregroundColor") {}
	val foregroundColorStyle = object : SortSpecFieldColorStyle("foregroundColorStyle") {}
	val sortOrder: FieldsList<SortSpecField> get() = fieldsList("sortOrder")
}

abstract class SortSpecFieldColor(private val path: String) : FieldsList<SortSpecField>(path) {
	val alpha: FieldsList<SortSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SortSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SortSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<SortSpecField> get() = fieldsList("${path}/red")
}

abstract class SortSpecFieldColorStyle(private val path: String) : FieldsList<SortSpecField>(path) {
	val rgbColor by lazy { object : SortSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SortSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class SortSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<SortSpecField>(path) {
	val name: FieldsList<SortSpecField> get() = fieldsList("${path}/name")
}

