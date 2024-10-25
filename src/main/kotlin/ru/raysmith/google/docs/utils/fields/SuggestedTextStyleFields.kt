package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedTextStyleField : Field

object SuggestedTextStyleFields {
    val ALL: FieldsList<SuggestedTextStyleField> = fieldsList("*")
	val textStyle = object : SuggestedTextStyleFieldTextStyle("textStyle") {}
	val textStyleSuggestionState = object : SuggestedTextStyleFieldTextStyleSuggestionState("textStyleSuggestionState") {}
}

abstract class SuggestedTextStyleFieldTextStyle(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val backgroundColor by lazy { object : SuggestedTextStyleFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : SuggestedTextStyleFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : SuggestedTextStyleFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SuggestedTextStyleFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : SuggestedTextStyleFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class SuggestedTextStyleFieldTextStyleSuggestionState(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class SuggestedTextStyleFieldOptionalColor(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val color by lazy { object : SuggestedTextStyleFieldColor("${path}/color") {} }
}

abstract class SuggestedTextStyleFieldDimension(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val magnitude: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedTextStyleFieldLink(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val bookmark by lazy { object : SuggestedTextStyleFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : SuggestedTextStyleFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/url")
}

abstract class SuggestedTextStyleFieldWeightedFontFamily(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val fontFamily: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/weight")
}

abstract class SuggestedTextStyleFieldColor(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val rgbColor by lazy { object : SuggestedTextStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedTextStyleFieldBookmarkLink(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val id: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedTextStyleFieldHeadingLink(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val id: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedTextStyleFieldRgbColor(private val path: String) : FieldsList<SuggestedTextStyleField>(path) {
	val blue: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedTextStyleField> get() = fieldsList("${path}/red")
}

