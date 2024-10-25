package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateProtectedRangeRequestField : Field

object UpdateProtectedRangeRequestFields {
    val ALL: FieldsList<UpdateProtectedRangeRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("fields")
	val protectedRange = object : UpdateProtectedRangeRequestFieldProtectedRange("protectedRange") {}
}

abstract class UpdateProtectedRangeRequestFieldProtectedRange(private val path: String) : FieldsList<UpdateProtectedRangeRequestField>(path) {
	val description: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/description")
	val editors by lazy { object : UpdateProtectedRangeRequestFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : UpdateProtectedRangeRequestFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : UpdateProtectedRangeRequestFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/warningOnly")
}

abstract class UpdateProtectedRangeRequestFieldEditors(private val path: String) : FieldsList<UpdateProtectedRangeRequestField>(path) {
	val domainUsersCanEdit: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/groups")
	val users: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/users")
}

abstract class UpdateProtectedRangeRequestFieldGridRange(private val path: String) : FieldsList<UpdateProtectedRangeRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateProtectedRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

