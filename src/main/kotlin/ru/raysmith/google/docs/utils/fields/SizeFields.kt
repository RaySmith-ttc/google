package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SizeField : Field

object SizeFields {
    val ALL: FieldsList<SizeField> = fieldsList("*")
	val height = object : SizeFieldDimension("height") {}
	val width = object : SizeFieldDimension("width") {}
}

abstract class SizeFieldDimension(private val path: String) : FieldsList<SizeField>(path) {
	val magnitude: FieldsList<SizeField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SizeField> get() = fieldsList("${path}/unit")
}

