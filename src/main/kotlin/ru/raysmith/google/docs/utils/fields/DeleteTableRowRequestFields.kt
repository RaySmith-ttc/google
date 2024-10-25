package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteTableRowRequestField : Field

object DeleteTableRowRequestFields {
    val ALL: FieldsList<DeleteTableRowRequestField> = fieldsList("*")
	val tableCellLocation = object : DeleteTableRowRequestFieldTableCellLocation("tableCellLocation") {}
}

abstract class DeleteTableRowRequestFieldTableCellLocation(private val path: String) : FieldsList<DeleteTableRowRequestField>(path) {
	val columnIndex: FieldsList<DeleteTableRowRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<DeleteTableRowRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : DeleteTableRowRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class DeleteTableRowRequestFieldLocation(private val path: String) : FieldsList<DeleteTableRowRequestField>(path) {
	val index: FieldsList<DeleteTableRowRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<DeleteTableRowRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<DeleteTableRowRequestField> get() = fieldsList("${path}/tabId")
}

