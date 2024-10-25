package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NestingLevelSuggestionStateField : Field

object NestingLevelSuggestionStateFields {
    val ALL: FieldsList<NestingLevelSuggestionStateField> = fieldsList("*")
	val bulletAlignmentSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("indentStartSuggested")
	val startNumberSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("startNumberSuggested")
	val textStyleSuggestionState = object : NestingLevelSuggestionStateFieldTextStyleSuggestionState("textStyleSuggestionState") {}
}

abstract class NestingLevelSuggestionStateFieldTextStyleSuggestionState(private val path: String) : FieldsList<NestingLevelSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<NestingLevelSuggestionStateField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

