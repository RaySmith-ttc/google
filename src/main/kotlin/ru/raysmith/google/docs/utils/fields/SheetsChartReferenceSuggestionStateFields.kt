package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SheetsChartReferenceSuggestionStateField : Field

object SheetsChartReferenceSuggestionStateFields {
    val ALL: FieldsList<SheetsChartReferenceSuggestionStateField> = fieldsList("*")
	val chartIdSuggested: FieldsList<SheetsChartReferenceSuggestionStateField> get() = fieldsList("chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<SheetsChartReferenceSuggestionStateField> get() = fieldsList("spreadsheetIdSuggested")
}

