package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FindReplaceRequestField : Field

object FindReplaceRequestFields {
    val ALL: FieldsList<FindReplaceRequestField> = fieldsList("*")
	val allSheets: FieldsList<FindReplaceRequestField> get() = fieldsList("allSheets")
	val find: FieldsList<FindReplaceRequestField> get() = fieldsList("find")
	val includeFormulas: FieldsList<FindReplaceRequestField> get() = fieldsList("includeFormulas")
	val matchCase: FieldsList<FindReplaceRequestField> get() = fieldsList("matchCase")
	val matchEntireCell: FieldsList<FindReplaceRequestField> get() = fieldsList("matchEntireCell")
	val range = object : FindReplaceRequestFieldGridRange("range") {}
	val replacement: FieldsList<FindReplaceRequestField> get() = fieldsList("replacement")
	val searchByRegex: FieldsList<FindReplaceRequestField> get() = fieldsList("searchByRegex")
	val sheetId: FieldsList<FindReplaceRequestField> get() = fieldsList("sheetId")
}

abstract class FindReplaceRequestFieldGridRange(private val path: String) : FieldsList<FindReplaceRequestField>(path) {
	val endColumnIndex: FieldsList<FindReplaceRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<FindReplaceRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<FindReplaceRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<FindReplaceRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<FindReplaceRequestField> get() = fieldsList("${path}/startRowIndex")
}

