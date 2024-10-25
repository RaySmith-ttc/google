package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ShadingField : Field

object ShadingFields {
    val ALL: FieldsList<ShadingField> = fieldsList("*")
	val backgroundColor = object : ShadingFieldOptionalColor("backgroundColor") {}
}

abstract class ShadingFieldOptionalColor(private val path: String) : FieldsList<ShadingField>(path) {
	val color by lazy { object : ShadingFieldColor("${path}/color") {} }
}

abstract class ShadingFieldColor(private val path: String) : FieldsList<ShadingField>(path) {
	val rgbColor by lazy { object : ShadingFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ShadingFieldRgbColor(private val path: String) : FieldsList<ShadingField>(path) {
	val blue: FieldsList<ShadingField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ShadingField> get() = fieldsList("${path}/green")
	val red: FieldsList<ShadingField> get() = fieldsList("${path}/red")
}

