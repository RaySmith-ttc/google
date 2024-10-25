package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectField : Field

object EmbeddedObjectFields {
    val ALL: FieldsList<EmbeddedObjectField> = fieldsList("*")
	val description: FieldsList<EmbeddedObjectField> get() = fieldsList("description")
	val embeddedDrawingProperties: FieldsList<EmbeddedObjectField> get() = fieldsList("embeddedDrawingProperties")
	val embeddedObjectBorder = object : EmbeddedObjectFieldEmbeddedObjectBorder("embeddedObjectBorder") {}
	val imageProperties = object : EmbeddedObjectFieldImageProperties("imageProperties") {}
	val linkedContentReference = object : EmbeddedObjectFieldLinkedContentReference("linkedContentReference") {}
	val marginBottom = object : EmbeddedObjectFieldDimension("marginBottom") {}
	val marginLeft = object : EmbeddedObjectFieldDimension("marginLeft") {}
	val marginRight = object : EmbeddedObjectFieldDimension("marginRight") {}
	val marginTop = object : EmbeddedObjectFieldDimension("marginTop") {}
	val size = object : EmbeddedObjectFieldSize("size") {}
	val title: FieldsList<EmbeddedObjectField> get() = fieldsList("title")
}

abstract class EmbeddedObjectFieldEmbeddedObjectBorder(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val color by lazy { object : EmbeddedObjectFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : EmbeddedObjectFieldDimension("${path}/width") {} }
}

abstract class EmbeddedObjectFieldImageProperties(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val angle: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : EmbeddedObjectFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/transparency")
}

abstract class EmbeddedObjectFieldLinkedContentReference(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val sheetsChartReference by lazy { object : EmbeddedObjectFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class EmbeddedObjectFieldDimension(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val magnitude: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/unit")
}

abstract class EmbeddedObjectFieldSize(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val height by lazy { object : EmbeddedObjectFieldDimension("${path}/height") {} }
	val width by lazy { object : EmbeddedObjectFieldDimension("${path}/width") {} }
}

abstract class EmbeddedObjectFieldOptionalColor(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val color by lazy { object : EmbeddedObjectFieldColor("${path}/color") {} }
}

abstract class EmbeddedObjectFieldCropProperties(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val angle: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/offsetTop")
}

abstract class EmbeddedObjectFieldSheetsChartReference(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val chartId: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class EmbeddedObjectFieldColor(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val rgbColor by lazy { object : EmbeddedObjectFieldRgbColor("${path}/rgbColor") {} }
}

abstract class EmbeddedObjectFieldRgbColor(private val path: String) : FieldsList<EmbeddedObjectField>(path) {
	val blue: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/blue")
	val green: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/green")
	val red: FieldsList<EmbeddedObjectField> get() = fieldsList("${path}/red")
}

