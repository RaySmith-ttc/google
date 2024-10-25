package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ParagraphBorderField : Field

object ParagraphBorderFields {
    val ALL: FieldsList<ParagraphBorderField> = fieldsList("*")
	val color = object : ParagraphBorderFieldOptionalColor("color") {}
	val dashStyle: FieldsList<ParagraphBorderField> get() = fieldsList("dashStyle")
	val padding = object : ParagraphBorderFieldDimension("padding") {}
	val width = object : ParagraphBorderFieldDimension("width") {}
}

abstract class ParagraphBorderFieldOptionalColor(private val path: String) : FieldsList<ParagraphBorderField>(path) {
	val color by lazy { object : ParagraphBorderFieldColor("${path}/color") {} }
}

abstract class ParagraphBorderFieldDimension(private val path: String) : FieldsList<ParagraphBorderField>(path) {
	val magnitude: FieldsList<ParagraphBorderField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ParagraphBorderField> get() = fieldsList("${path}/unit")
}

abstract class ParagraphBorderFieldColor(private val path: String) : FieldsList<ParagraphBorderField>(path) {
	val rgbColor by lazy { object : ParagraphBorderFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ParagraphBorderFieldRgbColor(private val path: String) : FieldsList<ParagraphBorderField>(path) {
	val blue: FieldsList<ParagraphBorderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ParagraphBorderField> get() = fieldsList("${path}/green")
	val red: FieldsList<ParagraphBorderField> get() = fieldsList("${path}/red")
}

