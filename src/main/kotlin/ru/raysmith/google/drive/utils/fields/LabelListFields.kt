package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelListField : Field

object LabelListFields {
    val ALL: FieldsList<LabelListField> = fieldsList("*")
	val kind: FieldsList<LabelListField> get() = fieldsList("kind")
	val labels = object : LabelListFieldLabel("labels") {}
	val nextPageToken: FieldsList<LabelListField> get() = fieldsList("nextPageToken")
}

abstract class LabelListFieldLabel(private val path: String) : FieldsList<LabelListField>(path) {
	val fields by lazy { object : LabelListFieldLabelField("${path}/fields") {} }
	val id: FieldsList<LabelListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<LabelListField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<LabelListField> get() = fieldsList("${path}/revisionId")
}

abstract class LabelListFieldLabelField(private val path: String) : FieldsList<LabelListField>(path) {
	val dateString: FieldsList<LabelListField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<LabelListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<LabelListField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<LabelListField> get() = fieldsList("${path}/selection")
	val text: FieldsList<LabelListField> get() = fieldsList("${path}/text")
	val user by lazy { object : LabelListFieldUser("${path}/user") {} }
	val valueType: FieldsList<LabelListField> get() = fieldsList("${path}/valueType")
}

abstract class LabelListFieldUser(private val path: String) : FieldsList<LabelListField>(path) {
	val displayName: FieldsList<LabelListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<LabelListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<LabelListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<LabelListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<LabelListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<LabelListField> get() = fieldsList("${path}/photoLink")
}

