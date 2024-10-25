package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FootnoteReferenceField : Field

object FootnoteReferenceFields {
    val ALL: FieldsList<FootnoteReferenceField> = fieldsList("*")
	val footnoteId: FieldsList<FootnoteReferenceField> get() = fieldsList("footnoteId")
	val footnoteNumber: FieldsList<FootnoteReferenceField> get() = fieldsList("footnoteNumber")
	val suggestedDeletionIds: FieldsList<FootnoteReferenceField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteReferenceField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : FootnoteReferenceFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : FootnoteReferenceFieldTextStyle("textStyle") {}
}

abstract class FootnoteReferenceFieldSuggestedTextStyle(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val textStyle by lazy { object : FootnoteReferenceFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : FootnoteReferenceFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class FootnoteReferenceFieldTextStyle(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val backgroundColor by lazy { object : FootnoteReferenceFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : FootnoteReferenceFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : FootnoteReferenceFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/italic")
	val link by lazy { object : FootnoteReferenceFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : FootnoteReferenceFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class FootnoteReferenceFieldTextStyleSuggestionState(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val backgroundColorSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class FootnoteReferenceFieldOptionalColor(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val color by lazy { object : FootnoteReferenceFieldColor("${path}/color") {} }
}

abstract class FootnoteReferenceFieldDimension(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val magnitude: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/unit")
}

abstract class FootnoteReferenceFieldLink(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val bookmark by lazy { object : FootnoteReferenceFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : FootnoteReferenceFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/url")
}

abstract class FootnoteReferenceFieldWeightedFontFamily(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val fontFamily: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/weight")
}

abstract class FootnoteReferenceFieldColor(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val rgbColor by lazy { object : FootnoteReferenceFieldRgbColor("${path}/rgbColor") {} }
}

abstract class FootnoteReferenceFieldBookmarkLink(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val id: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/tabId")
}

abstract class FootnoteReferenceFieldHeadingLink(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val id: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/tabId")
}

abstract class FootnoteReferenceFieldRgbColor(private val path: String) : FieldsList<FootnoteReferenceField>(path) {
	val blue: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/green")
	val red: FieldsList<FootnoteReferenceField> get() = fieldsList("${path}/red")
}

