package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteNamedRangeRequestField : Field

object DeleteNamedRangeRequestFields {
    val ALL: FieldsList<DeleteNamedRangeRequestField> = fieldsList("*")
	val name: FieldsList<DeleteNamedRangeRequestField> get() = fieldsList("name")
	val namedRangeId: FieldsList<DeleteNamedRangeRequestField> get() = fieldsList("namedRangeId")
	val tabsCriteria = object : DeleteNamedRangeRequestFieldTabsCriteria("tabsCriteria") {}
}

abstract class DeleteNamedRangeRequestFieldTabsCriteria(private val path: String) : FieldsList<DeleteNamedRangeRequestField>(path) {
	val tabIds: FieldsList<DeleteNamedRangeRequestField> get() = fieldsList("${path}/tabIds")
}

