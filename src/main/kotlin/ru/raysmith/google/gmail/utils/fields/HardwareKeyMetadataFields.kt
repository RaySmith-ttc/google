package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HardwareKeyMetadataField : Field

object HardwareKeyMetadataFields {
    val ALL: FieldsList<HardwareKeyMetadataField> = fieldsList("*")
	val description: FieldsList<HardwareKeyMetadataField> get() = fieldsList("description")
}

