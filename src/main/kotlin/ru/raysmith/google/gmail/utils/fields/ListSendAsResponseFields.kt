package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListSendAsResponseField : Field

object ListSendAsResponseFields {
    val ALL: FieldsList<ListSendAsResponseField> = fieldsList("*")
	val sendAs = object : ListSendAsResponseFieldSendAs("sendAs") {}
}

abstract class ListSendAsResponseFieldSendAs(private val path: String) : FieldsList<ListSendAsResponseField>(path) {
	val displayName: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/displayName")
	val isDefault: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/isDefault")
	val isPrimary: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/isPrimary")
	val replyToAddress: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/replyToAddress")
	val sendAsEmail: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/sendAsEmail")
	val signature: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/signature")
	val smtpMsa by lazy { object : ListSendAsResponseFieldSmtpMsa("${path}/smtpMsa") {} }
	val treatAsAlias: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/treatAsAlias")
	val verificationStatus: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/verificationStatus")
}

abstract class ListSendAsResponseFieldSmtpMsa(private val path: String) : FieldsList<ListSendAsResponseField>(path) {
	val host: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/host")
	val password: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/password")
	val port: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/port")
	val securityMode: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/securityMode")
	val username: FieldsList<ListSendAsResponseField> get() = fieldsList("${path}/username")
}

