package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SmtpMsaField : Field

object SmtpMsaFields {
    val ALL: FieldsList<SmtpMsaField> = fieldsList("*")
	val host: FieldsList<SmtpMsaField> get() = fieldsList("host")
	val password: FieldsList<SmtpMsaField> get() = fieldsList("password")
	val port: FieldsList<SmtpMsaField> get() = fieldsList("port")
	val securityMode: FieldsList<SmtpMsaField> get() = fieldsList("securityMode")
	val username: FieldsList<SmtpMsaField> get() = fieldsList("username")
}

