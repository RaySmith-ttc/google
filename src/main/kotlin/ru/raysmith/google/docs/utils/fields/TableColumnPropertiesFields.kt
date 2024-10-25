package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableColumnPropertiesField : Field

object TableColumnPropertiesFields {
    val ALL: FieldsList<TableColumnPropertiesField> = fieldsList("*")
	val width = object : TableColumnPropertiesFieldDimension("width") {}
	val widthType: FieldsList<TableColumnPropertiesField> get() = fieldsList("widthType")
}

abstract class TableColumnPropertiesFieldDimension(private val path: String) : FieldsList<TableColumnPropertiesField>(path) {
	val magnitude: FieldsList<TableColumnPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableColumnPropertiesField> get() = fieldsList("${path}/unit")
}

