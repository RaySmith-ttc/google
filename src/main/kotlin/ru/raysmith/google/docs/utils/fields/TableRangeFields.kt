package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableRangeField : Field

object TableRangeFields {
    val ALL: FieldsList<TableRangeField> = fieldsList("*")
	val columnSpan: FieldsList<TableRangeField> get() = fieldsList("columnSpan")
	val rowSpan: FieldsList<TableRangeField> get() = fieldsList("rowSpan")
	val tableCellLocation = object : TableRangeFieldTableCellLocation("tableCellLocation") {}
}

abstract class TableRangeFieldTableCellLocation(private val path: String) : FieldsList<TableRangeField>(path) {
	val columnIndex: FieldsList<TableRangeField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<TableRangeField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : TableRangeFieldLocation("${path}/tableStartLocation") {} }
}

abstract class TableRangeFieldLocation(private val path: String) : FieldsList<TableRangeField>(path) {
	val index: FieldsList<TableRangeField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<TableRangeField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<TableRangeField> get() = fieldsList("${path}/tabId")
}

