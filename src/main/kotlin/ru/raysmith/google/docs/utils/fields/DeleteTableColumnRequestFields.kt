package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteTableColumnRequestField : Field

object DeleteTableColumnRequestFields {
    val ALL: FieldsList<DeleteTableColumnRequestField> = fieldsList("*")
	val tableCellLocation = object : DeleteTableColumnRequestFieldTableCellLocation("tableCellLocation") {}
}

abstract class DeleteTableColumnRequestFieldTableCellLocation(private val path: String) : FieldsList<DeleteTableColumnRequestField>(path) {
	val columnIndex: FieldsList<DeleteTableColumnRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<DeleteTableColumnRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : DeleteTableColumnRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class DeleteTableColumnRequestFieldLocation(private val path: String) : FieldsList<DeleteTableColumnRequestField>(path) {
	val index: FieldsList<DeleteTableColumnRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<DeleteTableColumnRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<DeleteTableColumnRequestField> get() = fieldsList("${path}/tabId")
}

