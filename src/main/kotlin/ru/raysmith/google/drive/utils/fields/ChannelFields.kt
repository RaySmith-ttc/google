package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChannelField : Field

object ChannelFields {
    val ALL: FieldsList<ChannelField> = fieldsList("*")
	val address: FieldsList<ChannelField> get() = fieldsList("address")
	val expiration: FieldsList<ChannelField> get() = fieldsList("expiration")
	val id: FieldsList<ChannelField> get() = fieldsList("id")
	val kind: FieldsList<ChannelField> get() = fieldsList("kind")
	val params: FieldsList<ChannelField> get() = fieldsList("params")
	val payload: FieldsList<ChannelField> get() = fieldsList("payload")
	val resourceId: FieldsList<ChannelField> get() = fieldsList("resourceId")
	val resourceUri: FieldsList<ChannelField> get() = fieldsList("resourceUri")
	val token: FieldsList<ChannelField> get() = fieldsList("token")
	val type: FieldsList<ChannelField> get() = fieldsList("type")
}

