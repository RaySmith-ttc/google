package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ParagraphStyleSuggestionStateField : Field

object ParagraphStyleSuggestionStateFields {
    val ALL: FieldsList<ParagraphStyleSuggestionStateField> = fieldsList("*")
	val alignmentSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("borderBottomSuggested")
	val borderLeftSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("borderLeftSuggested")
	val borderRightSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("borderRightSuggested")
	val borderTopSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("borderTopSuggested")
	val directionSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("directionSuggested")
	val headingIdSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("headingIdSuggested")
	val indentEndSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("pageBreakBeforeSuggested")
	val shadingSuggestionState = object : ParagraphStyleSuggestionStateFieldShadingSuggestionState("shadingSuggestionState") {}
	val spaceAboveSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("spacingModeSuggested")
}

abstract class ParagraphStyleSuggestionStateFieldShadingSuggestionState(private val path: String) : FieldsList<ParagraphStyleSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<ParagraphStyleSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
}

