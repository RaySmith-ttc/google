package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LocationField : Field

object LocationFields {
    val ALL: FieldsList<LocationField> = fieldsList("*")
	val index: FieldsList<LocationField> get() = fieldsList("index")
	val segmentId: FieldsList<LocationField> get() = fieldsList("segmentId")
	val tabId: FieldsList<LocationField> get() = fieldsList("tabId")
}

