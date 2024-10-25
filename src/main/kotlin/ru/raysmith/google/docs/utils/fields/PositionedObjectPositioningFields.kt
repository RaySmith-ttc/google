package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PositionedObjectPositioningField : Field

object PositionedObjectPositioningFields {
    val ALL: FieldsList<PositionedObjectPositioningField> = fieldsList("*")
	val layout: FieldsList<PositionedObjectPositioningField> get() = fieldsList("layout")
	val leftOffset = object : PositionedObjectPositioningFieldDimension("leftOffset") {}
	val topOffset = object : PositionedObjectPositioningFieldDimension("topOffset") {}
}

abstract class PositionedObjectPositioningFieldDimension(private val path: String) : FieldsList<PositionedObjectPositioningField>(path) {
	val magnitude: FieldsList<PositionedObjectPositioningField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<PositionedObjectPositioningField> get() = fieldsList("${path}/unit")
}

