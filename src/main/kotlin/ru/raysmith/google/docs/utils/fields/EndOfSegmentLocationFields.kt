package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EndOfSegmentLocationField : Field

object EndOfSegmentLocationFields {
    val ALL: FieldsList<EndOfSegmentLocationField> = fieldsList("*")
	val segmentId: FieldsList<EndOfSegmentLocationField> get() = fieldsList("segmentId")
	val tabId: FieldsList<EndOfSegmentLocationField> get() = fieldsList("tabId")
}

