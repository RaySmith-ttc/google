package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedStylesSuggestionStateField : Field

object NamedStylesSuggestionStateFields {
    val ALL: FieldsList<NamedStylesSuggestionStateField> = fieldsList("*")
	val stylesSuggestionStates = object : NamedStylesSuggestionStateFieldNamedStyleSuggestionState("stylesSuggestionStates") {}
}

abstract class NamedStylesSuggestionStateFieldNamedStyleSuggestionState(private val path: String) : FieldsList<NamedStylesSuggestionStateField>(path) {
	val namedStyleType: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyleSuggestionState by lazy { object : NamedStylesSuggestionStateFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
	val textStyleSuggestionState by lazy { object : NamedStylesSuggestionStateFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class NamedStylesSuggestionStateFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<NamedStylesSuggestionStateField>(path) {
	val alignmentSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : NamedStylesSuggestionStateFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class NamedStylesSuggestionStateFieldTextStyleSuggestionState(private val path: String) : FieldsList<NamedStylesSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class NamedStylesSuggestionStateFieldShadingSuggestionState(private val path: String) : FieldsList<NamedStylesSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<NamedStylesSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
}

