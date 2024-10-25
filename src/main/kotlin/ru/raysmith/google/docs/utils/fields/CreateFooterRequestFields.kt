package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateFooterRequestField : Field

object CreateFooterRequestFields {
    val ALL: FieldsList<CreateFooterRequestField> = fieldsList("*")
	val sectionBreakLocation = object : CreateFooterRequestFieldLocation("sectionBreakLocation") {}
	val type: FieldsList<CreateFooterRequestField> get() = fieldsList("type")
}

abstract class CreateFooterRequestFieldLocation(private val path: String) : FieldsList<CreateFooterRequestField>(path) {
	val index: FieldsList<CreateFooterRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<CreateFooterRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<CreateFooterRequestField> get() = fieldsList("${path}/tabId")
}

