package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectBorderField : Field

object EmbeddedObjectBorderFields {
    val ALL: FieldsList<EmbeddedObjectBorderField> = fieldsList("*")
	val color = object : EmbeddedObjectBorderFieldOptionalColor("color") {}
	val dashStyle: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("dashStyle")
	val propertyState: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("propertyState")
	val width = object : EmbeddedObjectBorderFieldDimension("width") {}
}

abstract class EmbeddedObjectBorderFieldOptionalColor(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val color by lazy { object : EmbeddedObjectBorderFieldColor("${path}/color") {} }
}

abstract class EmbeddedObjectBorderFieldDimension(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val magnitude: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/unit")
}

abstract class EmbeddedObjectBorderFieldColor(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val rgbColor by lazy { object : EmbeddedObjectBorderFieldRgbColor("${path}/rgbColor") {} }
}

abstract class EmbeddedObjectBorderFieldRgbColor(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val blue: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/green")
	val red: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/red")
}

