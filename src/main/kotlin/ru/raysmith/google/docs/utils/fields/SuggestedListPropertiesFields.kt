package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedListPropertiesField : Field

object SuggestedListPropertiesFields {
    val ALL: FieldsList<SuggestedListPropertiesField> = fieldsList("*")
	val listProperties = object : SuggestedListPropertiesFieldListProperties("listProperties") {}
	val listPropertiesSuggestionState = object : SuggestedListPropertiesFieldListPropertiesSuggestionState("listPropertiesSuggestionState") {}
}

abstract class SuggestedListPropertiesFieldListProperties(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val nestingLevels by lazy { object : SuggestedListPropertiesFieldNestingLevel("${path}/nestingLevels") {} }
}

abstract class SuggestedListPropertiesFieldListPropertiesSuggestionState(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val nestingLevelsSuggestionStates by lazy { object : SuggestedListPropertiesFieldNestingLevelSuggestionState("${path}/nestingLevelsSuggestionStates") {} }
}

abstract class SuggestedListPropertiesFieldNestingLevel(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val bulletAlignment: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : SuggestedListPropertiesFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : SuggestedListPropertiesFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : SuggestedListPropertiesFieldTextStyle("${path}/textStyle") {} }
}

abstract class SuggestedListPropertiesFieldNestingLevelSuggestionState(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val bulletAlignmentSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : SuggestedListPropertiesFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class SuggestedListPropertiesFieldDimension(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val magnitude: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedListPropertiesFieldTextStyle(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val backgroundColor by lazy { object : SuggestedListPropertiesFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : SuggestedListPropertiesFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : SuggestedListPropertiesFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SuggestedListPropertiesFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : SuggestedListPropertiesFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class SuggestedListPropertiesFieldTextStyleSuggestionState(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class SuggestedListPropertiesFieldOptionalColor(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val color by lazy { object : SuggestedListPropertiesFieldColor("${path}/color") {} }
}

abstract class SuggestedListPropertiesFieldLink(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val bookmark by lazy { object : SuggestedListPropertiesFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : SuggestedListPropertiesFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/url")
}

abstract class SuggestedListPropertiesFieldWeightedFontFamily(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val fontFamily: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/weight")
}

abstract class SuggestedListPropertiesFieldColor(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val rgbColor by lazy { object : SuggestedListPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedListPropertiesFieldBookmarkLink(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val id: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedListPropertiesFieldHeadingLink(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val id: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedListPropertiesFieldRgbColor(private val path: String) : FieldsList<SuggestedListPropertiesField>(path) {
	val blue: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedListPropertiesField> get() = fieldsList("${path}/red")
}

