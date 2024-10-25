package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableCellLocationField : Field

object TableCellLocationFields {
    val ALL: FieldsList<TableCellLocationField> = fieldsList("*")
	val columnIndex: FieldsList<TableCellLocationField> get() = fieldsList("columnIndex")
	val rowIndex: FieldsList<TableCellLocationField> get() = fieldsList("rowIndex")
	val tableStartLocation = object : TableCellLocationFieldLocation("tableStartLocation") {}
}

abstract class TableCellLocationFieldLocation(private val path: String) : FieldsList<TableCellLocationField>(path) {
	val index: FieldsList<TableCellLocationField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<TableCellLocationField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<TableCellLocationField> get() = fieldsList("${path}/tabId")
}

