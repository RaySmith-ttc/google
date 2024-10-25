package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertTableRowRequestField : Field

object InsertTableRowRequestFields {
    val ALL: FieldsList<InsertTableRowRequestField> = fieldsList("*")
	val insertBelow: FieldsList<InsertTableRowRequestField> get() = fieldsList("insertBelow")
	val tableCellLocation = object : InsertTableRowRequestFieldTableCellLocation("tableCellLocation") {}
}

abstract class InsertTableRowRequestFieldTableCellLocation(private val path: String) : FieldsList<InsertTableRowRequestField>(path) {
	val columnIndex: FieldsList<InsertTableRowRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<InsertTableRowRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : InsertTableRowRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class InsertTableRowRequestFieldLocation(private val path: String) : FieldsList<InsertTableRowRequestField>(path) {
	val index: FieldsList<InsertTableRowRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertTableRowRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTableRowRequestField> get() = fieldsList("${path}/tabId")
}

