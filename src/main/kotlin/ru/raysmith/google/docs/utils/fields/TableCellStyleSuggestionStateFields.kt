package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableCellStyleSuggestionStateField : Field

object TableCellStyleSuggestionStateFields {
    val ALL: FieldsList<TableCellStyleSuggestionStateField> = fieldsList("*")
	val backgroundColorSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("borderRightSuggested")
	val borderTopSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("borderTopSuggested")
	val columnSpanSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TableCellStyleSuggestionStateField> get() = fieldsList("rowSpanSuggested")
}

