package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectBorderField : Field

object EmbeddedObjectBorderFields {
    val ALL: FieldsList<EmbeddedObjectBorderField> = fieldsList("*")
	val color = object : EmbeddedObjectBorderFieldColor("color") {}
	val colorStyle = object : EmbeddedObjectBorderFieldColorStyle("colorStyle") {}
}

abstract class EmbeddedObjectBorderFieldColor(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val alpha: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/green")
	val red: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/red")
}

abstract class EmbeddedObjectBorderFieldColorStyle(private val path: String) : FieldsList<EmbeddedObjectBorderField>(path) {
	val rgbColor by lazy { object : EmbeddedObjectBorderFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<EmbeddedObjectBorderField> get() = fieldsList("${path}/themeColor")
}

