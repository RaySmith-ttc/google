package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateEmbeddedObjectPositionRequestField : Field

object UpdateEmbeddedObjectPositionRequestFields {
    val ALL: FieldsList<UpdateEmbeddedObjectPositionRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("fields")
	val newPosition = object : UpdateEmbeddedObjectPositionRequestFieldEmbeddedObjectPosition("newPosition") {}
	val objectId: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("objectId")
}

abstract class UpdateEmbeddedObjectPositionRequestFieldEmbeddedObjectPosition(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionRequestField>(path) {
	val newSheet: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : UpdateEmbeddedObjectPositionRequestFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class UpdateEmbeddedObjectPositionRequestFieldOverlayPosition(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionRequestField>(path) {
	val anchorCell by lazy { object : UpdateEmbeddedObjectPositionRequestFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/widthPixels")
}

abstract class UpdateEmbeddedObjectPositionRequestFieldGridCoordinate(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionRequestField>(path) {
	val columnIndex: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<UpdateEmbeddedObjectPositionRequestField> get() = fieldsList("${path}/sheetId")
}

