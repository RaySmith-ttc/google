package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectPositionField : Field

object EmbeddedObjectPositionFields {
    val ALL: FieldsList<EmbeddedObjectPositionField> = fieldsList("*")
	val newSheet: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("newSheet")
	val overlayPosition = object : EmbeddedObjectPositionFieldOverlayPosition("overlayPosition") {}
	val sheetId: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("sheetId")
}

abstract class EmbeddedObjectPositionFieldOverlayPosition(private val path: String) : FieldsList<EmbeddedObjectPositionField>(path) {
	val anchorCell by lazy { object : EmbeddedObjectPositionFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/widthPixels")
}

abstract class EmbeddedObjectPositionFieldGridCoordinate(private val path: String) : FieldsList<EmbeddedObjectPositionField>(path) {
	val columnIndex: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<EmbeddedObjectPositionField> get() = fieldsList("${path}/sheetId")
}

