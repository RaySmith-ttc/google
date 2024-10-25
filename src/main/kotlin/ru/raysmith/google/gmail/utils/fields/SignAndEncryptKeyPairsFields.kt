package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SignAndEncryptKeyPairsField : Field

object SignAndEncryptKeyPairsFields {
    val ALL: FieldsList<SignAndEncryptKeyPairsField> = fieldsList("*")
	val encryptionKeyPairId: FieldsList<SignAndEncryptKeyPairsField> get() = fieldsList("encryptionKeyPairId")
	val signingKeyPairId: FieldsList<SignAndEncryptKeyPairsField> get() = fieldsList("signingKeyPairId")
}

