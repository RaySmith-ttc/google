package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LinkedContentReferenceSuggestionStateField : Field

object LinkedContentReferenceSuggestionStateFields {
    val ALL: FieldsList<LinkedContentReferenceSuggestionStateField> = fieldsList("*")
	val sheetsChartReferenceSuggestionState = object : LinkedContentReferenceSuggestionStateFieldSheetsChartReferenceSuggestionState("sheetsChartReferenceSuggestionState") {}
}

abstract class LinkedContentReferenceSuggestionStateFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<LinkedContentReferenceSuggestionStateField>(path) {
	val chartIdSuggested: FieldsList<LinkedContentReferenceSuggestionStateField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<LinkedContentReferenceSuggestionStateField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

