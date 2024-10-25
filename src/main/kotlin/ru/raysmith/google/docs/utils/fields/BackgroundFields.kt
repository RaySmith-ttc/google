package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BackgroundField : Field

object BackgroundFields {
    val ALL: FieldsList<BackgroundField> = fieldsList("*")
	val color = object : BackgroundFieldOptionalColor("color") {}
}

abstract class BackgroundFieldOptionalColor(private val path: String) : FieldsList<BackgroundField>(path) {
	val color by lazy { object : BackgroundFieldColor("${path}/color") {} }
}

abstract class BackgroundFieldColor(private val path: String) : FieldsList<BackgroundField>(path) {
	val rgbColor by lazy { object : BackgroundFieldRgbColor("${path}/rgbColor") {} }
}

abstract class BackgroundFieldRgbColor(private val path: String) : FieldsList<BackgroundField>(path) {
	val blue: FieldsList<BackgroundField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BackgroundField> get() = fieldsList("${path}/green")
	val red: FieldsList<BackgroundField> get() = fieldsList("${path}/red")
}

