package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SectionColumnPropertiesField : Field

object SectionColumnPropertiesFields {
    val ALL: FieldsList<SectionColumnPropertiesField> = fieldsList("*")
	val paddingEnd = object : SectionColumnPropertiesFieldDimension("paddingEnd") {}
	val width = object : SectionColumnPropertiesFieldDimension("width") {}
}

abstract class SectionColumnPropertiesFieldDimension(private val path: String) : FieldsList<SectionColumnPropertiesField>(path) {
	val magnitude: FieldsList<SectionColumnPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SectionColumnPropertiesField> get() = fieldsList("${path}/unit")
}

