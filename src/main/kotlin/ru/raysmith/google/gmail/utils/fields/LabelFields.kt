package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelField : Field

object LabelFields {
    val ALL: FieldsList<LabelField> = fieldsList("*")
	val color = object : LabelFieldLabelColor("color") {}
	val id: FieldsList<LabelField> get() = fieldsList("id")
	val labelListVisibility: FieldsList<LabelField> get() = fieldsList("labelListVisibility")
	val messageListVisibility: FieldsList<LabelField> get() = fieldsList("messageListVisibility")
	val messagesTotal: FieldsList<LabelField> get() = fieldsList("messagesTotal")
	val messagesUnread: FieldsList<LabelField> get() = fieldsList("messagesUnread")
	val name: FieldsList<LabelField> get() = fieldsList("name")
	val threadsTotal: FieldsList<LabelField> get() = fieldsList("threadsTotal")
	val threadsUnread: FieldsList<LabelField> get() = fieldsList("threadsUnread")
	val type: FieldsList<LabelField> get() = fieldsList("type")
}

abstract class LabelFieldLabelColor(private val path: String) : FieldsList<LabelField>(path) {
	val backgroundColor: FieldsList<LabelField> get() = fieldsList("${path}/backgroundColor")
	val textColor: FieldsList<LabelField> get() = fieldsList("${path}/textColor")
}

