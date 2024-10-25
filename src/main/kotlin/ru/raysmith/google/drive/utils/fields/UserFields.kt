package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UserField : Field

object UserFields {
    val ALL: FieldsList<UserField> = fieldsList("*")
	val displayName: FieldsList<UserField> get() = fieldsList("displayName")
	val emailAddress: FieldsList<UserField> get() = fieldsList("emailAddress")
	val kind: FieldsList<UserField> get() = fieldsList("kind")
	val me: FieldsList<UserField> get() = fieldsList("me")
	val permissionId: FieldsList<UserField> get() = fieldsList("permissionId")
	val photoLink: FieldsList<UserField> get() = fieldsList("photoLink")
}

