package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface KaclsKeyMetadataField : Field

object KaclsKeyMetadataFields {
    val ALL: FieldsList<KaclsKeyMetadataField> = fieldsList("*")
	val kaclsData: FieldsList<KaclsKeyMetadataField> get() = fieldsList("kaclsData")
	val kaclsUri: FieldsList<KaclsKeyMetadataField> get() = fieldsList("kaclsUri")
}

