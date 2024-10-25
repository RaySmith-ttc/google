package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddProtectedRangeRequestField : Field

object AddProtectedRangeRequestFields {
    val ALL: FieldsList<AddProtectedRangeRequestField> = fieldsList("*")
	val protectedRange = object : AddProtectedRangeRequestFieldProtectedRange("protectedRange") {}
}

abstract class AddProtectedRangeRequestFieldProtectedRange(private val path: String) : FieldsList<AddProtectedRangeRequestField>(path) {
	val description: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/description")
	val editors by lazy { object : AddProtectedRangeRequestFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : AddProtectedRangeRequestFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : AddProtectedRangeRequestFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/warningOnly")
}

abstract class AddProtectedRangeRequestFieldEditors(private val path: String) : FieldsList<AddProtectedRangeRequestField>(path) {
	val domainUsersCanEdit: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/groups")
	val users: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/users")
}

abstract class AddProtectedRangeRequestFieldGridRange(private val path: String) : FieldsList<AddProtectedRangeRequestField>(path) {
	val endColumnIndex: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddProtectedRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

