package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EditorsField : Field

object EditorsFields {
    val ALL: FieldsList<EditorsField> = fieldsList("*")
	val domainUsersCanEdit: FieldsList<EditorsField> get() = fieldsList("domainUsersCanEdit")
	val groups: FieldsList<EditorsField> get() = fieldsList("groups")
	val users: FieldsList<EditorsField> get() = fieldsList("users")
}

