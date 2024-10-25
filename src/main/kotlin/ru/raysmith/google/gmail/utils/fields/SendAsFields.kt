package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SendAsField : Field

object SendAsFields {
    val ALL: FieldsList<SendAsField> = fieldsList("*")
	val displayName: FieldsList<SendAsField> get() = fieldsList("displayName")
	val isDefault: FieldsList<SendAsField> get() = fieldsList("isDefault")
	val isPrimary: FieldsList<SendAsField> get() = fieldsList("isPrimary")
	val replyToAddress: FieldsList<SendAsField> get() = fieldsList("replyToAddress")
	val sendAsEmail: FieldsList<SendAsField> get() = fieldsList("sendAsEmail")
	val signature: FieldsList<SendAsField> get() = fieldsList("signature")
	val smtpMsa = object : SendAsFieldSmtpMsa("smtpMsa") {}
	val treatAsAlias: FieldsList<SendAsField> get() = fieldsList("treatAsAlias")
	val verificationStatus: FieldsList<SendAsField> get() = fieldsList("verificationStatus")
}

abstract class SendAsFieldSmtpMsa(private val path: String) : FieldsList<SendAsField>(path) {
	val host: FieldsList<SendAsField> get() = fieldsList("${path}/host")
	val password: FieldsList<SendAsField> get() = fieldsList("${path}/password")
	val port: FieldsList<SendAsField> get() = fieldsList("${path}/port")
	val securityMode: FieldsList<SendAsField> get() = fieldsList("${path}/securityMode")
	val username: FieldsList<SendAsField> get() = fieldsList("${path}/username")
}

