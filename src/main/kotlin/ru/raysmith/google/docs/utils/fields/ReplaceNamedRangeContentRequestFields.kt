package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplaceNamedRangeContentRequestField : Field

object ReplaceNamedRangeContentRequestFields {
    val ALL: FieldsList<ReplaceNamedRangeContentRequestField> = fieldsList("*")
	val namedRangeId: FieldsList<ReplaceNamedRangeContentRequestField> get() = fieldsList("namedRangeId")
	val namedRangeName: FieldsList<ReplaceNamedRangeContentRequestField> get() = fieldsList("namedRangeName")
	val tabsCriteria = object : ReplaceNamedRangeContentRequestFieldTabsCriteria("tabsCriteria") {}
	val text: FieldsList<ReplaceNamedRangeContentRequestField> get() = fieldsList("text")
}

abstract class ReplaceNamedRangeContentRequestFieldTabsCriteria(private val path: String) : FieldsList<ReplaceNamedRangeContentRequestField>(path) {
	val tabIds: FieldsList<ReplaceNamedRangeContentRequestField> get() = fieldsList("${path}/tabIds")
}

