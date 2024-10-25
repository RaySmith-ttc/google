package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FindReplaceResponseField : Field

object FindReplaceResponseFields {
    val ALL: FieldsList<FindReplaceResponseField> = fieldsList("*")
	val formulasChanged: FieldsList<FindReplaceResponseField> get() = fieldsList("formulasChanged")
	val occurrencesChanged: FieldsList<FindReplaceResponseField> get() = fieldsList("occurrencesChanged")
	val rowsChanged: FieldsList<FindReplaceResponseField> get() = fieldsList("rowsChanged")
	val sheetsChanged: FieldsList<FindReplaceResponseField> get() = fieldsList("sheetsChanged")
	val valuesChanged: FieldsList<FindReplaceResponseField> get() = fieldsList("valuesChanged")
}

