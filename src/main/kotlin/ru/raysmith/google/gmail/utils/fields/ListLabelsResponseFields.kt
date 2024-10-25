package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListLabelsResponseField : Field

object ListLabelsResponseFields {
    val ALL: FieldsList<ListLabelsResponseField> = fieldsList("*")
	val labels = object : ListLabelsResponseFieldLabel("labels") {}
}

abstract class ListLabelsResponseFieldLabel(private val path: String) : FieldsList<ListLabelsResponseField>(path) {
	val color by lazy { object : ListLabelsResponseFieldLabelColor("${path}/color") {} }
	val id: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/id")
	val labelListVisibility: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/labelListVisibility")
	val messageListVisibility: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/messageListVisibility")
	val messagesTotal: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/messagesTotal")
	val messagesUnread: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/messagesUnread")
	val name: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/name")
	val threadsTotal: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/threadsTotal")
	val threadsUnread: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/threadsUnread")
	val type: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/type")
}

abstract class ListLabelsResponseFieldLabelColor(private val path: String) : FieldsList<ListLabelsResponseField>(path) {
	val backgroundColor: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/backgroundColor")
	val textColor: FieldsList<ListLabelsResponseField> get() = fieldsList("${path}/textColor")
}

