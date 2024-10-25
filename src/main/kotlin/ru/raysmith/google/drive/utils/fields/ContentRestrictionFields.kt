package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ContentRestrictionField : Field

object ContentRestrictionFields {
    val ALL: FieldsList<ContentRestrictionField> = fieldsList("*")
	val ownerRestricted: FieldsList<ContentRestrictionField> get() = fieldsList("ownerRestricted")
	val readOnly: FieldsList<ContentRestrictionField> get() = fieldsList("readOnly")
	val reason: FieldsList<ContentRestrictionField> get() = fieldsList("reason")
	val restrictingUser = object : ContentRestrictionFieldUser("restrictingUser") {}
	val restrictionTime: FieldsList<ContentRestrictionField> get() = fieldsList("restrictionTime")
	val systemRestricted: FieldsList<ContentRestrictionField> get() = fieldsList("systemRestricted")
	val type: FieldsList<ContentRestrictionField> get() = fieldsList("type")
}

abstract class ContentRestrictionFieldUser(private val path: String) : FieldsList<ContentRestrictionField>(path) {
	val displayName: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ContentRestrictionField> get() = fieldsList("${path}/photoLink")
}

