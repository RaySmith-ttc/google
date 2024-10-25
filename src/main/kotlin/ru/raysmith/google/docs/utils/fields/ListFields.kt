package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListField : Field

object ListFields {
    val ALL: FieldsList<ListField> = fieldsList("*")
	val listProperties = object : ListFieldListProperties("listProperties") {}
	val suggestedDeletionIds: FieldsList<ListField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<ListField> get() = fieldsList("suggestedInsertionId")
	val suggestedListPropertiesChanges = object : ListFieldSuggestedListProperties("suggestedListPropertiesChanges") {}
}

abstract class ListFieldListProperties(private val path: String) : FieldsList<ListField>(path) {
	val nestingLevels by lazy { object : ListFieldNestingLevel("${path}/nestingLevels") {} }
}

abstract class ListFieldSuggestedListProperties(private val path: String) : FieldsList<ListField>(path) {
	val listProperties by lazy { object : ListFieldListProperties("${path}/listProperties") {} }
	val listPropertiesSuggestionState by lazy { object : ListFieldListPropertiesSuggestionState("${path}/listPropertiesSuggestionState") {} }
}

abstract class ListFieldNestingLevel(private val path: String) : FieldsList<ListField>(path) {
	val bulletAlignment: FieldsList<ListField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<ListField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<ListField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<ListField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : ListFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : ListFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<ListField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : ListFieldTextStyle("${path}/textStyle") {} }
}

abstract class ListFieldListPropertiesSuggestionState(private val path: String) : FieldsList<ListField>(path) {
	val nestingLevelsSuggestionStates by lazy { object : ListFieldNestingLevelSuggestionState("${path}/nestingLevelsSuggestionStates") {} }
}

abstract class ListFieldDimension(private val path: String) : FieldsList<ListField>(path) {
	val magnitude: FieldsList<ListField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ListField> get() = fieldsList("${path}/unit")
}

abstract class ListFieldTextStyle(private val path: String) : FieldsList<ListField>(path) {
	val backgroundColor by lazy { object : ListFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<ListField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<ListField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : ListFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : ListFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<ListField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ListFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<ListField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<ListField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ListField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : ListFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class ListFieldNestingLevelSuggestionState(private val path: String) : FieldsList<ListField>(path) {
	val bulletAlignmentSuggested: FieldsList<ListField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<ListField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<ListField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<ListField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<ListField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<ListField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<ListField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : ListFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ListFieldOptionalColor(private val path: String) : FieldsList<ListField>(path) {
	val color by lazy { object : ListFieldColor("${path}/color") {} }
}

abstract class ListFieldLink(private val path: String) : FieldsList<ListField>(path) {
	val bookmark by lazy { object : ListFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<ListField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : ListFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<ListField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<ListField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<ListField> get() = fieldsList("${path}/url")
}

abstract class ListFieldWeightedFontFamily(private val path: String) : FieldsList<ListField>(path) {
	val fontFamily: FieldsList<ListField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<ListField> get() = fieldsList("${path}/weight")
}

abstract class ListFieldTextStyleSuggestionState(private val path: String) : FieldsList<ListField>(path) {
	val backgroundColorSuggested: FieldsList<ListField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<ListField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<ListField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<ListField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<ListField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<ListField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<ListField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<ListField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<ListField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<ListField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<ListField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class ListFieldColor(private val path: String) : FieldsList<ListField>(path) {
	val rgbColor by lazy { object : ListFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ListFieldBookmarkLink(private val path: String) : FieldsList<ListField>(path) {
	val id: FieldsList<ListField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ListField> get() = fieldsList("${path}/tabId")
}

abstract class ListFieldHeadingLink(private val path: String) : FieldsList<ListField>(path) {
	val id: FieldsList<ListField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ListField> get() = fieldsList("${path}/tabId")
}

abstract class ListFieldRgbColor(private val path: String) : FieldsList<ListField>(path) {
	val blue: FieldsList<ListField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ListField> get() = fieldsList("${path}/green")
	val red: FieldsList<ListField> get() = fieldsList("${path}/red")
}

