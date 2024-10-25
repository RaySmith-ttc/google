package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedNamedStylesField : Field

object SuggestedNamedStylesFields {
    val ALL: FieldsList<SuggestedNamedStylesField> = fieldsList("*")
	val namedStyles = object : SuggestedNamedStylesFieldNamedStyles("namedStyles") {}
	val namedStylesSuggestionState = object : SuggestedNamedStylesFieldNamedStylesSuggestionState("namedStylesSuggestionState") {}
}

abstract class SuggestedNamedStylesFieldNamedStyles(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val styles by lazy { object : SuggestedNamedStylesFieldNamedStyle("${path}/styles") {} }
}

abstract class SuggestedNamedStylesFieldNamedStylesSuggestionState(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val stylesSuggestionStates by lazy { object : SuggestedNamedStylesFieldNamedStyleSuggestionState("${path}/stylesSuggestionStates") {} }
}

abstract class SuggestedNamedStylesFieldNamedStyle(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val namedStyleType: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyle by lazy { object : SuggestedNamedStylesFieldParagraphStyle("${path}/paragraphStyle") {} }
	val textStyle by lazy { object : SuggestedNamedStylesFieldTextStyle("${path}/textStyle") {} }
}

abstract class SuggestedNamedStylesFieldNamedStyleSuggestionState(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val namedStyleType: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyleSuggestionState by lazy { object : SuggestedNamedStylesFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
	val textStyleSuggestionState by lazy { object : SuggestedNamedStylesFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class SuggestedNamedStylesFieldParagraphStyle(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val alignment: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : SuggestedNamedStylesFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : SuggestedNamedStylesFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : SuggestedNamedStylesFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : SuggestedNamedStylesFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : SuggestedNamedStylesFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : SuggestedNamedStylesFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : SuggestedNamedStylesFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : SuggestedNamedStylesFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : SuggestedNamedStylesFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : SuggestedNamedStylesFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : SuggestedNamedStylesFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : SuggestedNamedStylesFieldTabStop("${path}/tabStops") {} }
}

abstract class SuggestedNamedStylesFieldTextStyle(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val backgroundColor by lazy { object : SuggestedNamedStylesFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : SuggestedNamedStylesFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : SuggestedNamedStylesFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SuggestedNamedStylesFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : SuggestedNamedStylesFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class SuggestedNamedStylesFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val alignmentSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : SuggestedNamedStylesFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class SuggestedNamedStylesFieldTextStyleSuggestionState(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class SuggestedNamedStylesFieldParagraphBorder(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val color by lazy { object : SuggestedNamedStylesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : SuggestedNamedStylesFieldDimension("${path}/padding") {} }
	val width by lazy { object : SuggestedNamedStylesFieldDimension("${path}/width") {} }
}

abstract class SuggestedNamedStylesFieldDimension(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val magnitude: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedNamedStylesFieldShading(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val backgroundColor by lazy { object : SuggestedNamedStylesFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class SuggestedNamedStylesFieldTabStop(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val alignment: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : SuggestedNamedStylesFieldDimension("${path}/offset") {} }
}

abstract class SuggestedNamedStylesFieldOptionalColor(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val color by lazy { object : SuggestedNamedStylesFieldColor("${path}/color") {} }
}

abstract class SuggestedNamedStylesFieldLink(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val bookmark by lazy { object : SuggestedNamedStylesFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : SuggestedNamedStylesFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/url")
}

abstract class SuggestedNamedStylesFieldWeightedFontFamily(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val fontFamily: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/weight")
}

abstract class SuggestedNamedStylesFieldShadingSuggestionState(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class SuggestedNamedStylesFieldColor(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val rgbColor by lazy { object : SuggestedNamedStylesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedNamedStylesFieldBookmarkLink(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val id: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedNamedStylesFieldHeadingLink(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val id: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedNamedStylesFieldRgbColor(private val path: String) : FieldsList<SuggestedNamedStylesField>(path) {
	val blue: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedNamedStylesField> get() = fieldsList("${path}/red")
}

