package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableStyleField : Field

object TableStyleFields {
    val ALL: FieldsList<TableStyleField> = fieldsList("*")
	val tableColumnProperties = object : TableStyleFieldTableColumnProperties("tableColumnProperties") {}
}

abstract class TableStyleFieldTableColumnProperties(private val path: String) : FieldsList<TableStyleField>(path) {
	val width by lazy { object : TableStyleFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TableStyleField> get() = fieldsList("${path}/widthType")
}

abstract class TableStyleFieldDimension(private val path: String) : FieldsList<TableStyleField>(path) {
	val magnitude: FieldsList<TableStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableStyleField> get() = fieldsList("${path}/unit")
}

