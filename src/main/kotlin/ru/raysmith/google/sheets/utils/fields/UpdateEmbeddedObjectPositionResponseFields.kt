package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateEmbeddedObjectPositionResponseField : Field

object UpdateEmbeddedObjectPositionResponseFields {
    val ALL: FieldsList<UpdateEmbeddedObjectPositionResponseField> = fieldsList("*")
	val position = object : UpdateEmbeddedObjectPositionResponseFieldEmbeddedObjectPosition("position") {}
}

abstract class UpdateEmbeddedObjectPositionResponseFieldEmbeddedObjectPosition(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionResponseField>(path) {
	val newSheet: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : UpdateEmbeddedObjectPositionResponseFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class UpdateEmbeddedObjectPositionResponseFieldOverlayPosition(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionResponseField>(path) {
	val anchorCell by lazy { object : UpdateEmbeddedObjectPositionResponseFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/widthPixels")
}

abstract class UpdateEmbeddedObjectPositionResponseFieldGridCoordinate(private val path: String) : FieldsList<UpdateEmbeddedObjectPositionResponseField>(path) {
	val columnIndex: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<UpdateEmbeddedObjectPositionResponseField> get() = fieldsList("${path}/sheetId")
}

