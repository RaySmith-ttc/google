package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableRowStyleField : Field

object TableRowStyleFields {
    val ALL: FieldsList<TableRowStyleField> = fieldsList("*")
	val minRowHeight = object : TableRowStyleFieldDimension("minRowHeight") {}
	val preventOverflow: FieldsList<TableRowStyleField> get() = fieldsList("preventOverflow")
	val tableHeader: FieldsList<TableRowStyleField> get() = fieldsList("tableHeader")
}

abstract class TableRowStyleFieldDimension(private val path: String) : FieldsList<TableRowStyleField>(path) {
	val magnitude: FieldsList<TableRowStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableRowStyleField> get() = fieldsList("${path}/unit")
}

