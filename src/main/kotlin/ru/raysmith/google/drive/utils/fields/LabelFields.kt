package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelField : Field

object LabelFields {
    val ALL: FieldsList<LabelField> = fieldsList("*")
	val fields = object : LabelFieldLabelField("fields") {}
	val id: FieldsList<LabelField> get() = fieldsList("id")
	val kind: FieldsList<LabelField> get() = fieldsList("kind")
	val revisionId: FieldsList<LabelField> get() = fieldsList("revisionId")
}

abstract class LabelFieldLabelField(private val path: String) : FieldsList<LabelField>(path) {
	val dateString: FieldsList<LabelField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<LabelField> get() = fieldsList("${path}/id")
	val kind: FieldsList<LabelField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<LabelField> get() = fieldsList("${path}/selection")
	val text: FieldsList<LabelField> get() = fieldsList("${path}/text")
	val user by lazy { object : LabelFieldUser("${path}/user") {} }
	val valueType: FieldsList<LabelField> get() = fieldsList("${path}/valueType")
}

abstract class LabelFieldUser(private val path: String) : FieldsList<LabelField>(path) {
	val displayName: FieldsList<LabelField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<LabelField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<LabelField> get() = fieldsList("${path}/kind")
	val me: FieldsList<LabelField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<LabelField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<LabelField> get() = fieldsList("${path}/photoLink")
}

