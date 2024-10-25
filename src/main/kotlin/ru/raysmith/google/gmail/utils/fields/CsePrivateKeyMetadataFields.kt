package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CsePrivateKeyMetadataField : Field

object CsePrivateKeyMetadataFields {
    val ALL: FieldsList<CsePrivateKeyMetadataField> = fieldsList("*")
	val hardwareKeyMetadata = object : CsePrivateKeyMetadataFieldHardwareKeyMetadata("hardwareKeyMetadata") {}
	val kaclsKeyMetadata = object : CsePrivateKeyMetadataFieldKaclsKeyMetadata("kaclsKeyMetadata") {}
	val privateKeyMetadataId: FieldsList<CsePrivateKeyMetadataField> get() = fieldsList("privateKeyMetadataId")
}

abstract class CsePrivateKeyMetadataFieldHardwareKeyMetadata(private val path: String) : FieldsList<CsePrivateKeyMetadataField>(path) {
	val description: FieldsList<CsePrivateKeyMetadataField> get() = fieldsList("${path}/description")
}

abstract class CsePrivateKeyMetadataFieldKaclsKeyMetadata(private val path: String) : FieldsList<CsePrivateKeyMetadataField>(path) {
	val kaclsData: FieldsList<CsePrivateKeyMetadataField> get() = fieldsList("${path}/kaclsData")
	val kaclsUri: FieldsList<CsePrivateKeyMetadataField> get() = fieldsList("${path}/kaclsUri")
}

