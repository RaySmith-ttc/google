package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InlineObjectPropertiesField : Field

object InlineObjectPropertiesFields {
    val ALL: FieldsList<InlineObjectPropertiesField> = fieldsList("*")
	val embeddedObject = object : InlineObjectPropertiesFieldEmbeddedObject("embeddedObject") {}
}

abstract class InlineObjectPropertiesFieldEmbeddedObject(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val description: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : InlineObjectPropertiesFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : InlineObjectPropertiesFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : InlineObjectPropertiesFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : InlineObjectPropertiesFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : InlineObjectPropertiesFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : InlineObjectPropertiesFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : InlineObjectPropertiesFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : InlineObjectPropertiesFieldSize("${path}/size") {} }
	val title: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/title")
}

abstract class InlineObjectPropertiesFieldEmbeddedObjectBorder(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val color by lazy { object : InlineObjectPropertiesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : InlineObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class InlineObjectPropertiesFieldImageProperties(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val angle: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : InlineObjectPropertiesFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/transparency")
}

abstract class InlineObjectPropertiesFieldLinkedContentReference(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val sheetsChartReference by lazy { object : InlineObjectPropertiesFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class InlineObjectPropertiesFieldDimension(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val magnitude: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class InlineObjectPropertiesFieldSize(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val height by lazy { object : InlineObjectPropertiesFieldDimension("${path}/height") {} }
	val width by lazy { object : InlineObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class InlineObjectPropertiesFieldOptionalColor(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val color by lazy { object : InlineObjectPropertiesFieldColor("${path}/color") {} }
}

abstract class InlineObjectPropertiesFieldCropProperties(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val angle: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/offsetTop")
}

abstract class InlineObjectPropertiesFieldSheetsChartReference(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val chartId: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class InlineObjectPropertiesFieldColor(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val rgbColor by lazy { object : InlineObjectPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class InlineObjectPropertiesFieldRgbColor(private val path: String) : FieldsList<InlineObjectPropertiesField>(path) {
	val blue: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<InlineObjectPropertiesField> get() = fieldsList("${path}/red")
}

