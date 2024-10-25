package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ProfileField : Field

object ProfileFields {
    val ALL: FieldsList<ProfileField> = fieldsList("*")
	val emailAddress: FieldsList<ProfileField> get() = fieldsList("emailAddress")
	val historyId: FieldsList<ProfileField> get() = fieldsList("historyId")
	val messagesTotal: FieldsList<ProfileField> get() = fieldsList("messagesTotal")
	val threadsTotal: FieldsList<ProfileField> get() = fieldsList("threadsTotal")
}

