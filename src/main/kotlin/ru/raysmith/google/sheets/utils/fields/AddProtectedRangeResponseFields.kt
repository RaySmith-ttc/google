package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddProtectedRangeResponseField : Field

object AddProtectedRangeResponseFields {
    val ALL: FieldsList<AddProtectedRangeResponseField> = fieldsList("*")
	val protectedRange = object : AddProtectedRangeResponseFieldProtectedRange("protectedRange") {}
}

abstract class AddProtectedRangeResponseFieldProtectedRange(private val path: String) : FieldsList<AddProtectedRangeResponseField>(path) {
	val description: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/description")
	val editors by lazy { object : AddProtectedRangeResponseFieldEditors("${path}/editors") {} }
	val namedRangeId: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/namedRangeId")
	val protectedRangeId: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/protectedRangeId")
	val range by lazy { object : AddProtectedRangeResponseFieldGridRange("${path}/range") {} }
	val requestingUserCanEdit: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/requestingUserCanEdit")
	val unprotectedRanges by lazy { object : AddProtectedRangeResponseFieldGridRange("${path}/unprotectedRanges") {} }
	val warningOnly: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/warningOnly")
}

abstract class AddProtectedRangeResponseFieldEditors(private val path: String) : FieldsList<AddProtectedRangeResponseField>(path) {
	val domainUsersCanEdit: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/domainUsersCanEdit")
	val groups: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/groups")
	val users: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/users")
}

abstract class AddProtectedRangeResponseFieldGridRange(private val path: String) : FieldsList<AddProtectedRangeResponseField>(path) {
	val endColumnIndex: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddProtectedRangeResponseField> get() = fieldsList("${path}/startRowIndex")
}

