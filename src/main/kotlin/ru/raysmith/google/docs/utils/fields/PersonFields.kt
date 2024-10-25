package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PersonField : Field

object PersonFields {
    val ALL: FieldsList<PersonField> = fieldsList("*")
	val personId: FieldsList<PersonField> get() = fieldsList("personId")
	val personProperties = object : PersonFieldPersonProperties("personProperties") {}
	val suggestedDeletionIds: FieldsList<PersonField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<PersonField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : PersonFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : PersonFieldTextStyle("textStyle") {}
}

abstract class PersonFieldPersonProperties(private val path: String) : FieldsList<PersonField>(path) {
	val email: FieldsList<PersonField> get() = fieldsList("${path}/email")
	val name: FieldsList<PersonField> get() = fieldsList("${path}/name")
}

abstract class PersonFieldSuggestedTextStyle(private val path: String) : FieldsList<PersonField>(path) {
	val textStyle by lazy { object : PersonFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : PersonFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class PersonFieldTextStyle(private val path: String) : FieldsList<PersonField>(path) {
	val backgroundColor by lazy { object : PersonFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<PersonField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<PersonField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : PersonFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : PersonFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<PersonField> get() = fieldsList("${path}/italic")
	val link by lazy { object : PersonFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<PersonField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<PersonField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<PersonField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : PersonFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class PersonFieldTextStyleSuggestionState(private val path: String) : FieldsList<PersonField>(path) {
	val backgroundColorSuggested: FieldsList<PersonField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<PersonField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<PersonField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<PersonField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<PersonField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<PersonField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<PersonField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<PersonField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<PersonField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<PersonField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<PersonField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class PersonFieldOptionalColor(private val path: String) : FieldsList<PersonField>(path) {
	val color by lazy { object : PersonFieldColor("${path}/color") {} }
}

abstract class PersonFieldDimension(private val path: String) : FieldsList<PersonField>(path) {
	val magnitude: FieldsList<PersonField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<PersonField> get() = fieldsList("${path}/unit")
}

abstract class PersonFieldLink(private val path: String) : FieldsList<PersonField>(path) {
	val bookmark by lazy { object : PersonFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<PersonField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : PersonFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<PersonField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<PersonField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<PersonField> get() = fieldsList("${path}/url")
}

abstract class PersonFieldWeightedFontFamily(private val path: String) : FieldsList<PersonField>(path) {
	val fontFamily: FieldsList<PersonField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<PersonField> get() = fieldsList("${path}/weight")
}

abstract class PersonFieldColor(private val path: String) : FieldsList<PersonField>(path) {
	val rgbColor by lazy { object : PersonFieldRgbColor("${path}/rgbColor") {} }
}

abstract class PersonFieldBookmarkLink(private val path: String) : FieldsList<PersonField>(path) {
	val id: FieldsList<PersonField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<PersonField> get() = fieldsList("${path}/tabId")
}

abstract class PersonFieldHeadingLink(private val path: String) : FieldsList<PersonField>(path) {
	val id: FieldsList<PersonField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<PersonField> get() = fieldsList("${path}/tabId")
}

abstract class PersonFieldRgbColor(private val path: String) : FieldsList<PersonField>(path) {
	val blue: FieldsList<PersonField> get() = fieldsList("${path}/blue")
	val green: FieldsList<PersonField> get() = fieldsList("${path}/green")
	val red: FieldsList<PersonField> get() = fieldsList("${path}/red")
}

