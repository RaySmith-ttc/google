package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PositionedObjectPropertiesField : Field

object PositionedObjectPropertiesFields {
    val ALL: FieldsList<PositionedObjectPropertiesField> = fieldsList("*")
	val embeddedObject = object : PositionedObjectPropertiesFieldEmbeddedObject("embeddedObject") {}
	val positioning = object : PositionedObjectPropertiesFieldPositionedObjectPositioning("positioning") {}
}

abstract class PositionedObjectPropertiesFieldEmbeddedObject(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val description: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : PositionedObjectPropertiesFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : PositionedObjectPropertiesFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : PositionedObjectPropertiesFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : PositionedObjectPropertiesFieldSize("${path}/size") {} }
	val title: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/title")
}

abstract class PositionedObjectPropertiesFieldPositionedObjectPositioning(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val layout: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/topOffset") {} }
}

abstract class PositionedObjectPropertiesFieldEmbeddedObjectBorder(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val color by lazy { object : PositionedObjectPropertiesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class PositionedObjectPropertiesFieldImageProperties(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val angle: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : PositionedObjectPropertiesFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/transparency")
}

abstract class PositionedObjectPropertiesFieldLinkedContentReference(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val sheetsChartReference by lazy { object : PositionedObjectPropertiesFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class PositionedObjectPropertiesFieldDimension(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val magnitude: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class PositionedObjectPropertiesFieldSize(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val height by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/height") {} }
	val width by lazy { object : PositionedObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class PositionedObjectPropertiesFieldOptionalColor(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val color by lazy { object : PositionedObjectPropertiesFieldColor("${path}/color") {} }
}

abstract class PositionedObjectPropertiesFieldCropProperties(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val angle: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/offsetTop")
}

abstract class PositionedObjectPropertiesFieldSheetsChartReference(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val chartId: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class PositionedObjectPropertiesFieldColor(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val rgbColor by lazy { object : PositionedObjectPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class PositionedObjectPropertiesFieldRgbColor(private val path: String) : FieldsList<PositionedObjectPropertiesField>(path) {
	val blue: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<PositionedObjectPropertiesField> get() = fieldsList("${path}/red")
}

