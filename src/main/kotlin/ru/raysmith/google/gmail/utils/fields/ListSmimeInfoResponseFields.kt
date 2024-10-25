package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListSmimeInfoResponseField : Field

object ListSmimeInfoResponseFields {
    val ALL: FieldsList<ListSmimeInfoResponseField> = fieldsList("*")
	val smimeInfo = object : ListSmimeInfoResponseFieldSmimeInfo("smimeInfo") {}
}

abstract class ListSmimeInfoResponseFieldSmimeInfo(private val path: String) : FieldsList<ListSmimeInfoResponseField>(path) {
	val encryptedKeyPassword: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/encryptedKeyPassword")
	val expiration: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/expiration")
	val id: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/id")
	val isDefault: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/isDefault")
	val issuerCn: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/issuerCn")
	val pem: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/pem")
	val pkcs12: FieldsList<ListSmimeInfoResponseField> get() = fieldsList("${path}/pkcs12")
}

