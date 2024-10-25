package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PinTableHeaderRowsRequestField : Field

object PinTableHeaderRowsRequestFields {
    val ALL: FieldsList<PinTableHeaderRowsRequestField> = fieldsList("*")
	val pinnedHeaderRowsCount: FieldsList<PinTableHeaderRowsRequestField> get() = fieldsList("pinnedHeaderRowsCount")
	val tableStartLocation = object : PinTableHeaderRowsRequestFieldLocation("tableStartLocation") {}
}

abstract class PinTableHeaderRowsRequestFieldLocation(private val path: String) : FieldsList<PinTableHeaderRowsRequestField>(path) {
	val index: FieldsList<PinTableHeaderRowsRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<PinTableHeaderRowsRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<PinTableHeaderRowsRequestField> get() = fieldsList("${path}/tabId")
}

