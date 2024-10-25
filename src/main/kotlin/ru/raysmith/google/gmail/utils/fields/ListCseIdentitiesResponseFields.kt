package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListCseIdentitiesResponseField : Field

object ListCseIdentitiesResponseFields {
    val ALL: FieldsList<ListCseIdentitiesResponseField> = fieldsList("*")
	val cseIdentities = object : ListCseIdentitiesResponseFieldCseIdentity("cseIdentities") {}
	val nextPageToken: FieldsList<ListCseIdentitiesResponseField> get() = fieldsList("nextPageToken")
}

abstract class ListCseIdentitiesResponseFieldCseIdentity(private val path: String) : FieldsList<ListCseIdentitiesResponseField>(path) {
	val emailAddress: FieldsList<ListCseIdentitiesResponseField> get() = fieldsList("${path}/emailAddress")
	val primaryKeyPairId: FieldsList<ListCseIdentitiesResponseField> get() = fieldsList("${path}/primaryKeyPairId")
	val signAndEncryptKeyPairs by lazy { object : ListCseIdentitiesResponseFieldSignAndEncryptKeyPairs("${path}/signAndEncryptKeyPairs") {} }
}

abstract class ListCseIdentitiesResponseFieldSignAndEncryptKeyPairs(private val path: String) : FieldsList<ListCseIdentitiesResponseField>(path) {
	val encryptionKeyPairId: FieldsList<ListCseIdentitiesResponseField> get() = fieldsList("${path}/encryptionKeyPairId")
	val signingKeyPairId: FieldsList<ListCseIdentitiesResponseField> get() = fieldsList("${path}/signingKeyPairId")
}

