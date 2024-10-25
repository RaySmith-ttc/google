package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateTableColumnPropertiesRequestField : Field

object UpdateTableColumnPropertiesRequestFields {
    val ALL: FieldsList<UpdateTableColumnPropertiesRequestField> = fieldsList("*")
	val columnIndices: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("columnIndices")
	val fields: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("fields")
	val tableColumnProperties = object : UpdateTableColumnPropertiesRequestFieldTableColumnProperties("tableColumnProperties") {}
	val tableStartLocation = object : UpdateTableColumnPropertiesRequestFieldLocation("tableStartLocation") {}
}

abstract class UpdateTableColumnPropertiesRequestFieldTableColumnProperties(private val path: String) : FieldsList<UpdateTableColumnPropertiesRequestField>(path) {
	val width by lazy { object : UpdateTableColumnPropertiesRequestFieldDimension("${path}/width") {} }
	val widthType: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/widthType")
}

abstract class UpdateTableColumnPropertiesRequestFieldLocation(private val path: String) : FieldsList<UpdateTableColumnPropertiesRequestField>(path) {
	val index: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTableColumnPropertiesRequestFieldDimension(private val path: String) : FieldsList<UpdateTableColumnPropertiesRequestField>(path) {
	val magnitude: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateTableColumnPropertiesRequestField> get() = fieldsList("${path}/unit")
}

