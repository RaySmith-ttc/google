package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListPropertiesSuggestionStateField : Field

object ListPropertiesSuggestionStateFields {
    val ALL: FieldsList<ListPropertiesSuggestionStateField> = fieldsList("*")
	val nestingLevelsSuggestionStates = object : ListPropertiesSuggestionStateFieldNestingLevelSuggestionState("nestingLevelsSuggestionStates") {}
}

abstract class ListPropertiesSuggestionStateFieldNestingLevelSuggestionState(private val path: String) : FieldsList<ListPropertiesSuggestionStateField>(path) {
	val bulletAlignmentSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : ListPropertiesSuggestionStateFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ListPropertiesSuggestionStateFieldTextStyleSuggestionState(private val path: String) : FieldsList<ListPropertiesSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<ListPropertiesSuggestionStateField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

