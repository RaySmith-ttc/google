package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ProtectedRangeField : Field

object ProtectedRangeFields {
    val ALL: FieldsList<ProtectedRangeField> = fieldsList("*")
	val description: FieldsList<ProtectedRangeField> get() = fieldsList("description")
	val editors = object : ProtectedRangeFieldEditors("editors") {}
	val namedRangeId: FieldsList<ProtectedRangeField> get() = fieldsList("namedRangeId")
	val protectedRangeId: FieldsList<ProtectedRangeField> get() = fieldsList("protectedRangeId")
	val range = object : ProtectedRangeFieldGridRange("range") {}
	val requestingUserCanEdit: FieldsList<ProtectedRangeField> get() = fieldsList("requestingUserCanEdit")
	val unprotectedRanges = object : ProtectedRangeFieldGridRange("unprotectedRanges") {}
	val warningOnly: FieldsList<ProtectedRangeField> get() = fieldsList("warningOnly")
}

abstract class ProtectedRangeFieldEditors(private val path: String) : FieldsList<ProtectedRangeField>(path) {
	val domainUsersCanEdit: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/groups")
	val users: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/users")
}

abstract class ProtectedRangeFieldGridRange(private val path: String) : FieldsList<ProtectedRangeField>(path) {
	val endColumnIndex: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ProtectedRangeField> get() = fieldsList("${path}/startRowIndex")
}

