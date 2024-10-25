package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SmimeInfoField : Field

object SmimeInfoFields {
    val ALL: FieldsList<SmimeInfoField> = fieldsList("*")
	val encryptedKeyPassword: FieldsList<SmimeInfoField> get() = fieldsList("encryptedKeyPassword")
	val expiration: FieldsList<SmimeInfoField> get() = fieldsList("expiration")
	val id: FieldsList<SmimeInfoField> get() = fieldsList("id")
	val isDefault: FieldsList<SmimeInfoField> get() = fieldsList("isDefault")
	val issuerCn: FieldsList<SmimeInfoField> get() = fieldsList("issuerCn")
	val pem: FieldsList<SmimeInfoField> get() = fieldsList("pem")
	val pkcs12: FieldsList<SmimeInfoField> get() = fieldsList("pkcs12")
}

