package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableCellBorderField : Field

object TableCellBorderFields {
    val ALL: FieldsList<TableCellBorderField> = fieldsList("*")
	val color = object : TableCellBorderFieldOptionalColor("color") {}
	val dashStyle: FieldsList<TableCellBorderField> get() = fieldsList("dashStyle")
	val width = object : TableCellBorderFieldDimension("width") {}
}

abstract class TableCellBorderFieldOptionalColor(private val path: String) : FieldsList<TableCellBorderField>(path) {
	val color by lazy { object : TableCellBorderFieldColor("${path}/color") {} }
}

abstract class TableCellBorderFieldDimension(private val path: String) : FieldsList<TableCellBorderField>(path) {
	val magnitude: FieldsList<TableCellBorderField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableCellBorderField> get() = fieldsList("${path}/unit")
}

abstract class TableCellBorderFieldColor(private val path: String) : FieldsList<TableCellBorderField>(path) {
	val rgbColor by lazy { object : TableCellBorderFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableCellBorderFieldRgbColor(private val path: String) : FieldsList<TableCellBorderField>(path) {
	val blue: FieldsList<TableCellBorderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableCellBorderField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableCellBorderField> get() = fieldsList("${path}/red")
}

