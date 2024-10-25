package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedStyleSuggestionStateField : Field

object NamedStyleSuggestionStateFields {
    val ALL: FieldsList<NamedStyleSuggestionStateField> = fieldsList("*")
	val namedStyleType: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("namedStyleType")
	val paragraphStyleSuggestionState = object : NamedStyleSuggestionStateFieldParagraphStyleSuggestionState("paragraphStyleSuggestionState") {}
	val textStyleSuggestionState = object : NamedStyleSuggestionStateFieldTextStyleSuggestionState("textStyleSuggestionState") {}
}

abstract class NamedStyleSuggestionStateFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<NamedStyleSuggestionStateField>(path) {
	val alignmentSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : NamedStyleSuggestionStateFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class NamedStyleSuggestionStateFieldTextStyleSuggestionState(private val path: String) : FieldsList<NamedStyleSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class NamedStyleSuggestionStateFieldShadingSuggestionState(private val path: String) : FieldsList<NamedStyleSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<NamedStyleSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
}

