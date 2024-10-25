package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListCseKeyPairsResponseField : Field

object ListCseKeyPairsResponseFields {
    val ALL: FieldsList<ListCseKeyPairsResponseField> = fieldsList("*")
	val cseKeyPairs = object : ListCseKeyPairsResponseFieldCseKeyPair("cseKeyPairs") {}
	val nextPageToken: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("nextPageToken")
}

abstract class ListCseKeyPairsResponseFieldCseKeyPair(private val path: String) : FieldsList<ListCseKeyPairsResponseField>(path) {
	val disableTime: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/disableTime")
	val enablementState: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/enablementState")
	val keyPairId: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/keyPairId")
	val pem: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/pem")
	val pkcs7: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/pkcs7")
	val privateKeyMetadata by lazy { object : ListCseKeyPairsResponseFieldCsePrivateKeyMetadata("${path}/privateKeyMetadata") {} }
	val subjectEmailAddresses: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/subjectEmailAddresses")
}

abstract class ListCseKeyPairsResponseFieldCsePrivateKeyMetadata(private val path: String) : FieldsList<ListCseKeyPairsResponseField>(path) {
	val hardwareKeyMetadata by lazy { object : ListCseKeyPairsResponseFieldHardwareKeyMetadata("${path}/hardwareKeyMetadata") {} }
	val kaclsKeyMetadata by lazy { object : ListCseKeyPairsResponseFieldKaclsKeyMetadata("${path}/kaclsKeyMetadata") {} }
	val privateKeyMetadataId: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/privateKeyMetadataId")
}

abstract class ListCseKeyPairsResponseFieldHardwareKeyMetadata(private val path: String) : FieldsList<ListCseKeyPairsResponseField>(path) {
	val description: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/description")
}

abstract class ListCseKeyPairsResponseFieldKaclsKeyMetadata(private val path: String) : FieldsList<ListCseKeyPairsResponseField>(path) {
	val kaclsData: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/kaclsData")
	val kaclsUri: FieldsList<ListCseKeyPairsResponseField> get() = fieldsList("${path}/kaclsUri")
}

