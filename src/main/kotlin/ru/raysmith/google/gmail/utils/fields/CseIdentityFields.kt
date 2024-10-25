package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CseIdentityField : Field

object CseIdentityFields {
    val ALL: FieldsList<CseIdentityField> = fieldsList("*")
	val emailAddress: FieldsList<CseIdentityField> get() = fieldsList("emailAddress")
	val primaryKeyPairId: FieldsList<CseIdentityField> get() = fieldsList("primaryKeyPairId")
	val signAndEncryptKeyPairs = object : CseIdentityFieldSignAndEncryptKeyPairs("signAndEncryptKeyPairs") {}
}

abstract class CseIdentityFieldSignAndEncryptKeyPairs(private val path: String) : FieldsList<CseIdentityField>(path) {
	val encryptionKeyPairId: FieldsList<CseIdentityField> get() = fieldsList("${path}/encryptionKeyPairId")
	val signingKeyPairId: FieldsList<CseIdentityField> get() = fieldsList("${path}/signingKeyPairId")
}

