package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ParagraphField : Field

object ParagraphFields {
    val ALL: FieldsList<ParagraphField> = fieldsList("*")
	val bullet = object : ParagraphFieldBullet("bullet") {}
	val elements = object : ParagraphFieldParagraphElement("elements") {}
	val paragraphStyle = object : ParagraphFieldParagraphStyle("paragraphStyle") {}
	val positionedObjectIds: FieldsList<ParagraphField> get() = fieldsList("positionedObjectIds")
	val suggestedBulletChanges = object : ParagraphFieldSuggestedBullet("suggestedBulletChanges") {}
	val suggestedParagraphStyleChanges = object : ParagraphFieldSuggestedParagraphStyle("suggestedParagraphStyleChanges") {}
	val suggestedPositionedObjectIds = object : ParagraphFieldObjectReferences("suggestedPositionedObjectIds") {}
}

abstract class ParagraphFieldBullet(private val path: String) : FieldsList<ParagraphField>(path) {
	val listId: FieldsList<ParagraphField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<ParagraphField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldParagraphElement(private val path: String) : FieldsList<ParagraphField>(path) {
	val autoText by lazy { object : ParagraphFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : ParagraphFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<ParagraphField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : ParagraphFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : ParagraphFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : ParagraphFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : ParagraphFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : ParagraphFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : ParagraphFieldPerson("${path}/person") {} }
	val richLink by lazy { object : ParagraphFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<ParagraphField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : ParagraphFieldTextRun("${path}/textRun") {} }
}

abstract class ParagraphFieldParagraphStyle(private val path: String) : FieldsList<ParagraphField>(path) {
	val alignment: FieldsList<ParagraphField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<ParagraphField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : ParagraphFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : ParagraphFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : ParagraphFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : ParagraphFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : ParagraphFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<ParagraphField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<ParagraphField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : ParagraphFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : ParagraphFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : ParagraphFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<ParagraphField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<ParagraphField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<ParagraphField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<ParagraphField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<ParagraphField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : ParagraphFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : ParagraphFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : ParagraphFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<ParagraphField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : ParagraphFieldTabStop("${path}/tabStops") {} }
}

abstract class ParagraphFieldSuggestedBullet(private val path: String) : FieldsList<ParagraphField>(path) {
	val bullet by lazy { object : ParagraphFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : ParagraphFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class ParagraphFieldSuggestedParagraphStyle(private val path: String) : FieldsList<ParagraphField>(path) {
	val paragraphStyle by lazy { object : ParagraphFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : ParagraphFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class ParagraphFieldObjectReferences(private val path: String) : FieldsList<ParagraphField>(path) {
	val objectIds: FieldsList<ParagraphField> get() = fieldsList("${path}/objectIds")
}

abstract class ParagraphFieldTextStyle(private val path: String) : FieldsList<ParagraphField>(path) {
	val backgroundColor by lazy { object : ParagraphFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<ParagraphField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<ParagraphField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : ParagraphFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : ParagraphFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<ParagraphField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ParagraphFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<ParagraphField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<ParagraphField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ParagraphField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : ParagraphFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class ParagraphFieldAutoText(private val path: String) : FieldsList<ParagraphField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<ParagraphField> get() = fieldsList("${path}/type")
}

abstract class ParagraphFieldColumnBreak(private val path: String) : FieldsList<ParagraphField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldEquation(private val path: String) : FieldsList<ParagraphField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class ParagraphFieldFootnoteReference(private val path: String) : FieldsList<ParagraphField>(path) {
	val footnoteId: FieldsList<ParagraphField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<ParagraphField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldHorizontalRule(private val path: String) : FieldsList<ParagraphField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldInlineObjectElement(private val path: String) : FieldsList<ParagraphField>(path) {
	val inlineObjectId: FieldsList<ParagraphField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldPageBreak(private val path: String) : FieldsList<ParagraphField>(path) {
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldPerson(private val path: String) : FieldsList<ParagraphField>(path) {
	val personId: FieldsList<ParagraphField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : ParagraphFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldRichLink(private val path: String) : FieldsList<ParagraphField>(path) {
	val richLinkId: FieldsList<ParagraphField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : ParagraphFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldTextRun(private val path: String) : FieldsList<ParagraphField>(path) {
	val content: FieldsList<ParagraphField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ParagraphField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : ParagraphFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
}

abstract class ParagraphFieldParagraphBorder(private val path: String) : FieldsList<ParagraphField>(path) {
	val color by lazy { object : ParagraphFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<ParagraphField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : ParagraphFieldDimension("${path}/padding") {} }
	val width by lazy { object : ParagraphFieldDimension("${path}/width") {} }
}

abstract class ParagraphFieldDimension(private val path: String) : FieldsList<ParagraphField>(path) {
	val magnitude: FieldsList<ParagraphField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ParagraphField> get() = fieldsList("${path}/unit")
}

abstract class ParagraphFieldShading(private val path: String) : FieldsList<ParagraphField>(path) {
	val backgroundColor by lazy { object : ParagraphFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class ParagraphFieldTabStop(private val path: String) : FieldsList<ParagraphField>(path) {
	val alignment: FieldsList<ParagraphField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : ParagraphFieldDimension("${path}/offset") {} }
}

abstract class ParagraphFieldBulletSuggestionState(private val path: String) : FieldsList<ParagraphField>(path) {
	val listIdSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : ParagraphFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ParagraphFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<ParagraphField>(path) {
	val alignmentSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : ParagraphFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class ParagraphFieldOptionalColor(private val path: String) : FieldsList<ParagraphField>(path) {
	val color by lazy { object : ParagraphFieldColor("${path}/color") {} }
}

abstract class ParagraphFieldLink(private val path: String) : FieldsList<ParagraphField>(path) {
	val bookmark by lazy { object : ParagraphFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<ParagraphField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : ParagraphFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<ParagraphField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<ParagraphField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<ParagraphField> get() = fieldsList("${path}/url")
}

abstract class ParagraphFieldWeightedFontFamily(private val path: String) : FieldsList<ParagraphField>(path) {
	val fontFamily: FieldsList<ParagraphField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<ParagraphField> get() = fieldsList("${path}/weight")
}

abstract class ParagraphFieldSuggestedTextStyle(private val path: String) : FieldsList<ParagraphField>(path) {
	val textStyle by lazy { object : ParagraphFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : ParagraphFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ParagraphFieldPersonProperties(private val path: String) : FieldsList<ParagraphField>(path) {
	val email: FieldsList<ParagraphField> get() = fieldsList("${path}/email")
	val name: FieldsList<ParagraphField> get() = fieldsList("${path}/name")
}

abstract class ParagraphFieldRichLinkProperties(private val path: String) : FieldsList<ParagraphField>(path) {
	val mimeType: FieldsList<ParagraphField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<ParagraphField> get() = fieldsList("${path}/title")
	val uri: FieldsList<ParagraphField> get() = fieldsList("${path}/uri")
}

abstract class ParagraphFieldTextStyleSuggestionState(private val path: String) : FieldsList<ParagraphField>(path) {
	val backgroundColorSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class ParagraphFieldShadingSuggestionState(private val path: String) : FieldsList<ParagraphField>(path) {
	val backgroundColorSuggested: FieldsList<ParagraphField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class ParagraphFieldColor(private val path: String) : FieldsList<ParagraphField>(path) {
	val rgbColor by lazy { object : ParagraphFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ParagraphFieldBookmarkLink(private val path: String) : FieldsList<ParagraphField>(path) {
	val id: FieldsList<ParagraphField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ParagraphField> get() = fieldsList("${path}/tabId")
}

abstract class ParagraphFieldHeadingLink(private val path: String) : FieldsList<ParagraphField>(path) {
	val id: FieldsList<ParagraphField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ParagraphField> get() = fieldsList("${path}/tabId")
}

abstract class ParagraphFieldRgbColor(private val path: String) : FieldsList<ParagraphField>(path) {
	val blue: FieldsList<ParagraphField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ParagraphField> get() = fieldsList("${path}/green")
	val red: FieldsList<ParagraphField> get() = fieldsList("${path}/red")
}

