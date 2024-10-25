package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateTableRowStyleRequestField : Field

object UpdateTableRowStyleRequestFields {
    val ALL: FieldsList<UpdateTableRowStyleRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("fields")
	val rowIndices: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("rowIndices")
	val tableRowStyle = object : UpdateTableRowStyleRequestFieldTableRowStyle("tableRowStyle") {}
	val tableStartLocation = object : UpdateTableRowStyleRequestFieldLocation("tableStartLocation") {}
}

abstract class UpdateTableRowStyleRequestFieldTableRowStyle(private val path: String) : FieldsList<UpdateTableRowStyleRequestField>(path) {
	val minRowHeight by lazy { object : UpdateTableRowStyleRequestFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/tableHeader")
}

abstract class UpdateTableRowStyleRequestFieldLocation(private val path: String) : FieldsList<UpdateTableRowStyleRequestField>(path) {
	val index: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTableRowStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateTableRowStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateTableRowStyleRequestField> get() = fieldsList("${path}/unit")
}

