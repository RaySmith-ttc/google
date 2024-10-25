package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RichLinkField : Field

object RichLinkFields {
    val ALL: FieldsList<RichLinkField> = fieldsList("*")
	val richLinkId: FieldsList<RichLinkField> get() = fieldsList("richLinkId")
	val richLinkProperties = object : RichLinkFieldRichLinkProperties("richLinkProperties") {}
	val suggestedDeletionIds: FieldsList<RichLinkField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<RichLinkField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : RichLinkFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : RichLinkFieldTextStyle("textStyle") {}
}

abstract class RichLinkFieldRichLinkProperties(private val path: String) : FieldsList<RichLinkField>(path) {
	val mimeType: FieldsList<RichLinkField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<RichLinkField> get() = fieldsList("${path}/title")
	val uri: FieldsList<RichLinkField> get() = fieldsList("${path}/uri")
}

abstract class RichLinkFieldSuggestedTextStyle(private val path: String) : FieldsList<RichLinkField>(path) {
	val textStyle by lazy { object : RichLinkFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : RichLinkFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class RichLinkFieldTextStyle(private val path: String) : FieldsList<RichLinkField>(path) {
	val backgroundColor by lazy { object : RichLinkFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<RichLinkField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<RichLinkField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : RichLinkFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : RichLinkFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<RichLinkField> get() = fieldsList("${path}/italic")
	val link by lazy { object : RichLinkFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<RichLinkField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<RichLinkField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<RichLinkField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : RichLinkFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class RichLinkFieldTextStyleSuggestionState(private val path: String) : FieldsList<RichLinkField>(path) {
	val backgroundColorSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<RichLinkField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class RichLinkFieldOptionalColor(private val path: String) : FieldsList<RichLinkField>(path) {
	val color by lazy { object : RichLinkFieldColor("${path}/color") {} }
}

abstract class RichLinkFieldDimension(private val path: String) : FieldsList<RichLinkField>(path) {
	val magnitude: FieldsList<RichLinkField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<RichLinkField> get() = fieldsList("${path}/unit")
}

abstract class RichLinkFieldLink(private val path: String) : FieldsList<RichLinkField>(path) {
	val bookmark by lazy { object : RichLinkFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<RichLinkField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : RichLinkFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<RichLinkField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<RichLinkField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<RichLinkField> get() = fieldsList("${path}/url")
}

abstract class RichLinkFieldWeightedFontFamily(private val path: String) : FieldsList<RichLinkField>(path) {
	val fontFamily: FieldsList<RichLinkField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<RichLinkField> get() = fieldsList("${path}/weight")
}

abstract class RichLinkFieldColor(private val path: String) : FieldsList<RichLinkField>(path) {
	val rgbColor by lazy { object : RichLinkFieldRgbColor("${path}/rgbColor") {} }
}

abstract class RichLinkFieldBookmarkLink(private val path: String) : FieldsList<RichLinkField>(path) {
	val id: FieldsList<RichLinkField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<RichLinkField> get() = fieldsList("${path}/tabId")
}

abstract class RichLinkFieldHeadingLink(private val path: String) : FieldsList<RichLinkField>(path) {
	val id: FieldsList<RichLinkField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<RichLinkField> get() = fieldsList("${path}/tabId")
}

abstract class RichLinkFieldRgbColor(private val path: String) : FieldsList<RichLinkField>(path) {
	val blue: FieldsList<RichLinkField> get() = fieldsList("${path}/blue")
	val green: FieldsList<RichLinkField> get() = fieldsList("${path}/green")
	val red: FieldsList<RichLinkField> get() = fieldsList("${path}/red")
}

