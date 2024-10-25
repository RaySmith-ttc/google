package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PageBreakField : Field

object PageBreakFields {
    val ALL: FieldsList<PageBreakField> = fieldsList("*")
	val suggestedDeletionIds: FieldsList<PageBreakField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<PageBreakField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : PageBreakFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : PageBreakFieldTextStyle("textStyle") {}
}

abstract class PageBreakFieldSuggestedTextStyle(private val path: String) : FieldsList<PageBreakField>(path) {
	val textStyle by lazy { object : PageBreakFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : PageBreakFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class PageBreakFieldTextStyle(private val path: String) : FieldsList<PageBreakField>(path) {
	val backgroundColor by lazy { object : PageBreakFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<PageBreakField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<PageBreakField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : PageBreakFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : PageBreakFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<PageBreakField> get() = fieldsList("${path}/italic")
	val link by lazy { object : PageBreakFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<PageBreakField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<PageBreakField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<PageBreakField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : PageBreakFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class PageBreakFieldTextStyleSuggestionState(private val path: String) : FieldsList<PageBreakField>(path) {
	val backgroundColorSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<PageBreakField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class PageBreakFieldOptionalColor(private val path: String) : FieldsList<PageBreakField>(path) {
	val color by lazy { object : PageBreakFieldColor("${path}/color") {} }
}

abstract class PageBreakFieldDimension(private val path: String) : FieldsList<PageBreakField>(path) {
	val magnitude: FieldsList<PageBreakField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<PageBreakField> get() = fieldsList("${path}/unit")
}

abstract class PageBreakFieldLink(private val path: String) : FieldsList<PageBreakField>(path) {
	val bookmark by lazy { object : PageBreakFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<PageBreakField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : PageBreakFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<PageBreakField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<PageBreakField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<PageBreakField> get() = fieldsList("${path}/url")
}

abstract class PageBreakFieldWeightedFontFamily(private val path: String) : FieldsList<PageBreakField>(path) {
	val fontFamily: FieldsList<PageBreakField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<PageBreakField> get() = fieldsList("${path}/weight")
}

abstract class PageBreakFieldColor(private val path: String) : FieldsList<PageBreakField>(path) {
	val rgbColor by lazy { object : PageBreakFieldRgbColor("${path}/rgbColor") {} }
}

abstract class PageBreakFieldBookmarkLink(private val path: String) : FieldsList<PageBreakField>(path) {
	val id: FieldsList<PageBreakField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<PageBreakField> get() = fieldsList("${path}/tabId")
}

abstract class PageBreakFieldHeadingLink(private val path: String) : FieldsList<PageBreakField>(path) {
	val id: FieldsList<PageBreakField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<PageBreakField> get() = fieldsList("${path}/tabId")
}

abstract class PageBreakFieldRgbColor(private val path: String) : FieldsList<PageBreakField>(path) {
	val blue: FieldsList<PageBreakField> get() = fieldsList("${path}/blue")
	val green: FieldsList<PageBreakField> get() = fieldsList("${path}/green")
	val red: FieldsList<PageBreakField> get() = fieldsList("${path}/red")
}

