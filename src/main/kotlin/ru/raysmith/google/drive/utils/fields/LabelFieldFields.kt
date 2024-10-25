package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelFieldField : Field

object LabelFieldFields {
    val ALL: FieldsList<LabelFieldField> = fieldsList("*")
	val dateString: FieldsList<LabelFieldField> get() = fieldsList("dateString")
	val id: FieldsList<LabelFieldField> get() = fieldsList("id")
	val kind: FieldsList<LabelFieldField> get() = fieldsList("kind")
	val selection: FieldsList<LabelFieldField> get() = fieldsList("selection")
	val text: FieldsList<LabelFieldField> get() = fieldsList("text")
	val user = object : LabelFieldFieldUser("user") {}
	val valueType: FieldsList<LabelFieldField> get() = fieldsList("valueType")
}

abstract class LabelFieldFieldUser(private val path: String) : FieldsList<LabelFieldField>(path) {
	val displayName: FieldsList<LabelFieldField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<LabelFieldField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<LabelFieldField> get() = fieldsList("${path}/kind")
	val me: FieldsList<LabelFieldField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<LabelFieldField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<LabelFieldField> get() = fieldsList("${path}/photoLink")
}

