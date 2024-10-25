package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CseKeyPairField : Field

object CseKeyPairFields {
    val ALL: FieldsList<CseKeyPairField> = fieldsList("*")
	val disableTime: FieldsList<CseKeyPairField> get() = fieldsList("disableTime")
	val enablementState: FieldsList<CseKeyPairField> get() = fieldsList("enablementState")
	val keyPairId: FieldsList<CseKeyPairField> get() = fieldsList("keyPairId")
	val pem: FieldsList<CseKeyPairField> get() = fieldsList("pem")
	val pkcs7: FieldsList<CseKeyPairField> get() = fieldsList("pkcs7")
	val privateKeyMetadata = object : CseKeyPairFieldCsePrivateKeyMetadata("privateKeyMetadata") {}
	val subjectEmailAddresses: FieldsList<CseKeyPairField> get() = fieldsList("subjectEmailAddresses")
}

abstract class CseKeyPairFieldCsePrivateKeyMetadata(private val path: String) : FieldsList<CseKeyPairField>(path) {
	val hardwareKeyMetadata by lazy { object : CseKeyPairFieldHardwareKeyMetadata("${path}/hardwareKeyMetadata") {} }
	val kaclsKeyMetadata by lazy { object : CseKeyPairFieldKaclsKeyMetadata("${path}/kaclsKeyMetadata") {} }
	val privateKeyMetadataId: FieldsList<CseKeyPairField> get() = fieldsList("${path}/privateKeyMetadataId")
}

abstract class CseKeyPairFieldHardwareKeyMetadata(private val path: String) : FieldsList<CseKeyPairField>(path) {
	val description: FieldsList<CseKeyPairField> get() = fieldsList("${path}/description")
}

abstract class CseKeyPairFieldKaclsKeyMetadata(private val path: String) : FieldsList<CseKeyPairField>(path) {
	val kaclsData: FieldsList<CseKeyPairField> get() = fieldsList("${path}/kaclsData")
	val kaclsUri: FieldsList<CseKeyPairField> get() = fieldsList("${path}/kaclsUri")
}

