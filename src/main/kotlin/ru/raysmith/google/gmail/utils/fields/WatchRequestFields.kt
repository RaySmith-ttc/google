package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WatchRequestField : Field

object WatchRequestFields {
    val ALL: FieldsList<WatchRequestField> = fieldsList("*")
	val labelFilterAction: FieldsList<WatchRequestField> get() = fieldsList("labelFilterAction")
	val labelFilterBehavior: FieldsList<WatchRequestField> get() = fieldsList("labelFilterBehavior")
	val labelIds: FieldsList<WatchRequestField> get() = fieldsList("labelIds")
	val topicName: FieldsList<WatchRequestField> get() = fieldsList("topicName")
}

