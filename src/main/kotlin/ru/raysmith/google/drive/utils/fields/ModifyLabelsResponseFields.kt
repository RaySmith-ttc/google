package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ModifyLabelsResponseField : Field

object ModifyLabelsResponseFields {
    val ALL: FieldsList<ModifyLabelsResponseField> = fieldsList("*")
	val kind: FieldsList<ModifyLabelsResponseField> get() = fieldsList("kind")
	val modifiedLabels = object : ModifyLabelsResponseFieldLabel("modifiedLabels") {}
}

abstract class ModifyLabelsResponseFieldLabel(private val path: String) : FieldsList<ModifyLabelsResponseField>(path) {
	val fields by lazy { object : ModifyLabelsResponseFieldLabelField("${path}/fields") {} }
	val id: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/kind")
	val revisionId: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/revisionId")
}

abstract class ModifyLabelsResponseFieldLabelField(private val path: String) : FieldsList<ModifyLabelsResponseField>(path) {
	val dateString: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/dateString")
	val id: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/kind")
	val selection: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/selection")
	val text: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/text")
	val user by lazy { object : ModifyLabelsResponseFieldUser("${path}/user") {} }
	val valueType: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/valueType")
}

abstract class ModifyLabelsResponseFieldUser(private val path: String) : FieldsList<ModifyLabelsResponseField>(path) {
	val displayName: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ModifyLabelsResponseField> get() = fieldsList("${path}/photoLink")
}

