package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedTableRowStyleField : Field

object SuggestedTableRowStyleFields {
    val ALL: FieldsList<SuggestedTableRowStyleField> = fieldsList("*")
	val tableRowStyle = object : SuggestedTableRowStyleFieldTableRowStyle("tableRowStyle") {}
	val tableRowStyleSuggestionState = object : SuggestedTableRowStyleFieldTableRowStyleSuggestionState("tableRowStyleSuggestionState") {}
}

abstract class SuggestedTableRowStyleFieldTableRowStyle(private val path: String) : FieldsList<SuggestedTableRowStyleField>(path) {
	val minRowHeight by lazy { object : SuggestedTableRowStyleFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<SuggestedTableRowStyleField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<SuggestedTableRowStyleField> get() = fieldsList("${path}/tableHeader")
}

abstract class SuggestedTableRowStyleFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<SuggestedTableRowStyleField>(path) {
	val minRowHeightSuggested: FieldsList<SuggestedTableRowStyleField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class SuggestedTableRowStyleFieldDimension(private val path: String) : FieldsList<SuggestedTableRowStyleField>(path) {
	val magnitude: FieldsList<SuggestedTableRowStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedTableRowStyleField> get() = fieldsList("${path}/unit")
}

