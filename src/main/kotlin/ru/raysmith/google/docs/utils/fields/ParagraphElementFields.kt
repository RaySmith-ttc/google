package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ParagraphElementField : Field

object ParagraphElementFields {
    val ALL: FieldsList<ParagraphElementField> = fieldsList("*")
	val autoText = object : ParagraphElementFieldAutoText("autoText") {}
	val columnBreak = object : ParagraphElementFieldColumnBreak("columnBreak") {}
	val endIndex: FieldsList<ParagraphElementField> get() = fieldsList("endIndex")
	val equation = object : ParagraphElementFieldEquation("equation") {}
	val footnoteReference = object : ParagraphElementFieldFootnoteReference("footnoteReference") {}
	val horizontalRule = object : ParagraphElementFieldHorizontalRule("horizontalRule") {}
	val inlineObjectElement = object : ParagraphElementFieldInlineObjectElement("inlineObjectElement") {}
	val pageBreak = object : ParagraphElementFieldPageBreak("pageBreak") {}
	val person = object : ParagraphElementFieldPerson("person") {}
	val richLink = object : ParagraphElementFieldRichLink("richLink") {}
	val startIndex: FieldsList<ParagraphElementField> get() = fieldsList("startIndex")
	val textRun = object : ParagraphElementFieldTextRun("textRun") {}
}

abstract class ParagraphElementFieldAutoText(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<ParagraphElementField> get() = fieldsList("${path}/type")
}

abstract class ParagraphElementFieldColumnBreak(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldEquation(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class ParagraphElementFieldFootnoteReference(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val footnoteId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<ParagraphElementField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldHorizontalRule(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldInlineObjectElement(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val inlineObjectId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldPageBreak(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldPerson(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val personId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : ParagraphElementFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldRichLink(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val richLinkId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : ParagraphElementFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldTextRun(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val content: FieldsList<ParagraphElementField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphElementFieldSuggestedTextStyle(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val textStyle by lazy { object : ParagraphElementFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : ParagraphElementFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ParagraphElementFieldTextStyle(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val backgroundColor by lazy { object : ParagraphElementFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<ParagraphElementField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<ParagraphElementField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : ParagraphElementFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : ParagraphElementFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<ParagraphElementField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ParagraphElementFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<ParagraphElementField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<ParagraphElementField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ParagraphElementField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : ParagraphElementFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class ParagraphElementFieldPersonProperties(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val email: FieldsList<ParagraphElementField> get() = fieldsList("${path}/email")
	val name: FieldsList<ParagraphElementField> get() = fieldsList("${path}/name")
}

abstract class ParagraphElementFieldRichLinkProperties(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val mimeType: FieldsList<ParagraphElementField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<ParagraphElementField> get() = fieldsList("${path}/title")
	val uri: FieldsList<ParagraphElementField> get() = fieldsList("${path}/uri")
}

abstract class ParagraphElementFieldTextStyleSuggestionState(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val backgroundColorSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<ParagraphElementField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class ParagraphElementFieldOptionalColor(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val color by lazy { object : ParagraphElementFieldColor("${path}/color") {} }
}

abstract class ParagraphElementFieldDimension(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val magnitude: FieldsList<ParagraphElementField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ParagraphElementField> get() = fieldsList("${path}/unit")
}

abstract class ParagraphElementFieldLink(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val bookmark by lazy { object : ParagraphElementFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : ParagraphElementFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<ParagraphElementField> get() = fieldsList("${path}/url")
}

abstract class ParagraphElementFieldWeightedFontFamily(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val fontFamily: FieldsList<ParagraphElementField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<ParagraphElementField> get() = fieldsList("${path}/weight")
}

abstract class ParagraphElementFieldColor(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val rgbColor by lazy { object : ParagraphElementFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ParagraphElementFieldBookmarkLink(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val id: FieldsList<ParagraphElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/tabId")
}

abstract class ParagraphElementFieldHeadingLink(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val id: FieldsList<ParagraphElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ParagraphElementField> get() = fieldsList("${path}/tabId")
}

abstract class ParagraphElementFieldRgbColor(private val path: String) : FieldsList<ParagraphElementField>(path) {
	val blue: FieldsList<ParagraphElementField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ParagraphElementField> get() = fieldsList("${path}/green")
	val red: FieldsList<ParagraphElementField> get() = fieldsList("${path}/red")
}

