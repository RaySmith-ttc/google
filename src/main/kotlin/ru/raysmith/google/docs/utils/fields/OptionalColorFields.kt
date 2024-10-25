package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface OptionalColorField : Field

object OptionalColorFields {
    val ALL: FieldsList<OptionalColorField> = fieldsList("*")
	val color = object : OptionalColorFieldColor("color") {}
}

abstract class OptionalColorFieldColor(private val path: String) : FieldsList<OptionalColorField>(path) {
	val rgbColor by lazy { object : OptionalColorFieldRgbColor("${path}/rgbColor") {} }
}

abstract class OptionalColorFieldRgbColor(private val path: String) : FieldsList<OptionalColorField>(path) {
	val blue: FieldsList<OptionalColorField> get() = fieldsList("${path}/blue")
	val green: FieldsList<OptionalColorField> get() = fieldsList("${path}/green")
	val red: FieldsList<OptionalColorField> get() = fieldsList("${path}/red")
}

