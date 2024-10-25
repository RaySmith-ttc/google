package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WatchResponseField : Field

object WatchResponseFields {
    val ALL: FieldsList<WatchResponseField> = fieldsList("*")
	val expiration: FieldsList<WatchResponseField> get() = fieldsList("expiration")
	val historyId: FieldsList<WatchResponseField> get() = fieldsList("historyId")
}

