package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableCellStyleField : Field

object TableCellStyleFields {
    val ALL: FieldsList<TableCellStyleField> = fieldsList("*")
	val backgroundColor = object : TableCellStyleFieldOptionalColor("backgroundColor") {}
	val borderBottom = object : TableCellStyleFieldTableCellBorder("borderBottom") {}
	val borderLeft = object : TableCellStyleFieldTableCellBorder("borderLeft") {}
	val borderRight = object : TableCellStyleFieldTableCellBorder("borderRight") {}
	val borderTop = object : TableCellStyleFieldTableCellBorder("borderTop") {}
	val columnSpan: FieldsList<TableCellStyleField> get() = fieldsList("columnSpan")
	val contentAlignment: FieldsList<TableCellStyleField> get() = fieldsList("contentAlignment")
	val paddingBottom = object : TableCellStyleFieldDimension("paddingBottom") {}
	val paddingLeft = object : TableCellStyleFieldDimension("paddingLeft") {}
	val paddingRight = object : TableCellStyleFieldDimension("paddingRight") {}
	val paddingTop = object : TableCellStyleFieldDimension("paddingTop") {}
	val rowSpan: FieldsList<TableCellStyleField> get() = fieldsList("rowSpan")
}

abstract class TableCellStyleFieldOptionalColor(private val path: String) : FieldsList<TableCellStyleField>(path) {
	val color by lazy { object : TableCellStyleFieldColor("${path}/color") {} }
}

abstract class TableCellStyleFieldTableCellBorder(private val path: String) : FieldsList<TableCellStyleField>(path) {
	val color by lazy { object : TableCellStyleFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableCellStyleField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TableCellStyleFieldDimension("${path}/width") {} }
}

abstract class TableCellStyleFieldDimension(private val path: String) : FieldsList<TableCellStyleField>(path) {
	val magnitude: FieldsList<TableCellStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableCellStyleField> get() = fieldsList("${path}/unit")
}

abstract class TableCellStyleFieldColor(private val path: String) : FieldsList<TableCellStyleField>(path) {
	val rgbColor by lazy { object : TableCellStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableCellStyleFieldRgbColor(private val path: String) : FieldsList<TableCellStyleField>(path) {
	val blue: FieldsList<TableCellStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableCellStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableCellStyleField> get() = fieldsList("${path}/red")
}

