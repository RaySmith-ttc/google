package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertTableColumnRequestField : Field

object InsertTableColumnRequestFields {
    val ALL: FieldsList<InsertTableColumnRequestField> = fieldsList("*")
	val insertRight: FieldsList<InsertTableColumnRequestField> get() = fieldsList("insertRight")
	val tableCellLocation = object : InsertTableColumnRequestFieldTableCellLocation("tableCellLocation") {}
}

abstract class InsertTableColumnRequestFieldTableCellLocation(private val path: String) : FieldsList<InsertTableColumnRequestField>(path) {
	val columnIndex: FieldsList<InsertTableColumnRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<InsertTableColumnRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : InsertTableColumnRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class InsertTableColumnRequestFieldLocation(private val path: String) : FieldsList<InsertTableColumnRequestField>(path) {
	val index: FieldsList<InsertTableColumnRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertTableColumnRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTableColumnRequestField> get() = fieldsList("${path}/tabId")
}

