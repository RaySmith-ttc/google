package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateTableCellStyleRequestField : Field

object UpdateTableCellStyleRequestFields {
    val ALL: FieldsList<UpdateTableCellStyleRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("fields")
	val tableCellStyle = object : UpdateTableCellStyleRequestFieldTableCellStyle("tableCellStyle") {}
	val tableRange = object : UpdateTableCellStyleRequestFieldTableRange("tableRange") {}
	val tableStartLocation = object : UpdateTableCellStyleRequestFieldLocation("tableStartLocation") {}
}

abstract class UpdateTableCellStyleRequestFieldTableCellStyle(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val backgroundColor by lazy { object : UpdateTableCellStyleRequestFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : UpdateTableCellStyleRequestFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : UpdateTableCellStyleRequestFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : UpdateTableCellStyleRequestFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : UpdateTableCellStyleRequestFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : UpdateTableCellStyleRequestFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : UpdateTableCellStyleRequestFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : UpdateTableCellStyleRequestFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : UpdateTableCellStyleRequestFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/rowSpan")
}

abstract class UpdateTableCellStyleRequestFieldTableRange(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val columnSpan: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/columnSpan")
	val rowSpan: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/rowSpan")
	val tableCellLocation by lazy { object : UpdateTableCellStyleRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class UpdateTableCellStyleRequestFieldLocation(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val index: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTableCellStyleRequestFieldOptionalColor(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val color by lazy { object : UpdateTableCellStyleRequestFieldColor("${path}/color") {} }
}

abstract class UpdateTableCellStyleRequestFieldTableCellBorder(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val color by lazy { object : UpdateTableCellStyleRequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : UpdateTableCellStyleRequestFieldDimension("${path}/width") {} }
}

abstract class UpdateTableCellStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/unit")
}

abstract class UpdateTableCellStyleRequestFieldTableCellLocation(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val columnIndex: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : UpdateTableCellStyleRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class UpdateTableCellStyleRequestFieldColor(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val rgbColor by lazy { object : UpdateTableCellStyleRequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class UpdateTableCellStyleRequestFieldRgbColor(private val path: String) : FieldsList<UpdateTableCellStyleRequestField>(path) {
	val blue: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateTableCellStyleRequestField> get() = fieldsList("${path}/red")
}

