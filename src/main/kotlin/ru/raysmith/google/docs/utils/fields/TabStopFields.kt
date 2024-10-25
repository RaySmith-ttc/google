package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TabStopField : Field

object TabStopFields {
    val ALL: FieldsList<TabStopField> = fieldsList("*")
	val alignment: FieldsList<TabStopField> get() = fieldsList("alignment")
	val offset = object : TabStopFieldDimension("offset") {}
}

abstract class TabStopFieldDimension(private val path: String) : FieldsList<TabStopField>(path) {
	val magnitude: FieldsList<TabStopField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TabStopField> get() = fieldsList("${path}/unit")
}

