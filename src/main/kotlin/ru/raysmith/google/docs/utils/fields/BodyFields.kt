package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BodyField : Field

object BodyFields {
    val ALL: FieldsList<BodyField> = fieldsList("*")
	val content = object : BodyFieldStructuralElement("content") {}
}

abstract class BodyFieldStructuralElement(private val path: String) : FieldsList<BodyField>(path) {
	val endIndex: FieldsList<BodyField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : BodyFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : BodyFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<BodyField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : BodyFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : BodyFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class BodyFieldParagraph(private val path: String) : FieldsList<BodyField>(path) {
	val bullet by lazy { object : BodyFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : BodyFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : BodyFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<BodyField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : BodyFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : BodyFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : BodyFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class BodyFieldSectionBreak(private val path: String) : FieldsList<BodyField>(path) {
	val sectionStyle by lazy { object : BodyFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class BodyFieldTable(private val path: String) : FieldsList<BodyField>(path) {
	val columns: FieldsList<BodyField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<BodyField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : BodyFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : BodyFieldTableStyle("${path}/tableStyle") {} }
}

abstract class BodyFieldTableOfContents(private val path: String) : FieldsList<BodyField>(path) {
	val content by lazy { object : BodyFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class BodyFieldBullet(private val path: String) : FieldsList<BodyField>(path) {
	val listId: FieldsList<BodyField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<BodyField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldParagraphElement(private val path: String) : FieldsList<BodyField>(path) {
	val autoText by lazy { object : BodyFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : BodyFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<BodyField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : BodyFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : BodyFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : BodyFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : BodyFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : BodyFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : BodyFieldPerson("${path}/person") {} }
	val richLink by lazy { object : BodyFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<BodyField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : BodyFieldTextRun("${path}/textRun") {} }
}

abstract class BodyFieldParagraphStyle(private val path: String) : FieldsList<BodyField>(path) {
	val alignment: FieldsList<BodyField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<BodyField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : BodyFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : BodyFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : BodyFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : BodyFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : BodyFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<BodyField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<BodyField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : BodyFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : BodyFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : BodyFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<BodyField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<BodyField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<BodyField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<BodyField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<BodyField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : BodyFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : BodyFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : BodyFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<BodyField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : BodyFieldTabStop("${path}/tabStops") {} }
}

abstract class BodyFieldSuggestedBullet(private val path: String) : FieldsList<BodyField>(path) {
	val bullet by lazy { object : BodyFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : BodyFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class BodyFieldSuggestedParagraphStyle(private val path: String) : FieldsList<BodyField>(path) {
	val paragraphStyle by lazy { object : BodyFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : BodyFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class BodyFieldObjectReferences(private val path: String) : FieldsList<BodyField>(path) {
	val objectIds: FieldsList<BodyField> get() = fieldsList("${path}/objectIds")
}

abstract class BodyFieldSectionStyle(private val path: String) : FieldsList<BodyField>(path) {
	val columnProperties by lazy { object : BodyFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<BodyField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<BodyField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<BodyField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<BodyField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<BodyField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<BodyField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<BodyField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<BodyField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<BodyField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : BodyFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : BodyFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : BodyFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : BodyFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : BodyFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : BodyFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<BodyField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<BodyField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<BodyField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class BodyFieldTableRow(private val path: String) : FieldsList<BodyField>(path) {
	val endIndex: FieldsList<BodyField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<BodyField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : BodyFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : BodyFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : BodyFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class BodyFieldTableStyle(private val path: String) : FieldsList<BodyField>(path) {
	val tableColumnProperties by lazy { object : BodyFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class BodyFieldTextStyle(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColor by lazy { object : BodyFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<BodyField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<BodyField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : BodyFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : BodyFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<BodyField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BodyFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<BodyField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<BodyField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BodyField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : BodyFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class BodyFieldAutoText(private val path: String) : FieldsList<BodyField>(path) {
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<BodyField> get() = fieldsList("${path}/type")
}

abstract class BodyFieldColumnBreak(private val path: String) : FieldsList<BodyField>(path) {
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldEquation(private val path: String) : FieldsList<BodyField>(path) {
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class BodyFieldFootnoteReference(private val path: String) : FieldsList<BodyField>(path) {
	val footnoteId: FieldsList<BodyField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<BodyField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldHorizontalRule(private val path: String) : FieldsList<BodyField>(path) {
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldInlineObjectElement(private val path: String) : FieldsList<BodyField>(path) {
	val inlineObjectId: FieldsList<BodyField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldPageBreak(private val path: String) : FieldsList<BodyField>(path) {
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldPerson(private val path: String) : FieldsList<BodyField>(path) {
	val personId: FieldsList<BodyField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : BodyFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldRichLink(private val path: String) : FieldsList<BodyField>(path) {
	val richLinkId: FieldsList<BodyField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : BodyFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldTextRun(private val path: String) : FieldsList<BodyField>(path) {
	val content: FieldsList<BodyField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : BodyFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
}

abstract class BodyFieldParagraphBorder(private val path: String) : FieldsList<BodyField>(path) {
	val color by lazy { object : BodyFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<BodyField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : BodyFieldDimension("${path}/padding") {} }
	val width by lazy { object : BodyFieldDimension("${path}/width") {} }
}

abstract class BodyFieldDimension(private val path: String) : FieldsList<BodyField>(path) {
	val magnitude: FieldsList<BodyField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<BodyField> get() = fieldsList("${path}/unit")
}

abstract class BodyFieldShading(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColor by lazy { object : BodyFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class BodyFieldTabStop(private val path: String) : FieldsList<BodyField>(path) {
	val alignment: FieldsList<BodyField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : BodyFieldDimension("${path}/offset") {} }
}

abstract class BodyFieldBulletSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val listIdSuggested: FieldsList<BodyField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<BodyField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : BodyFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class BodyFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val alignmentSuggested: FieldsList<BodyField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<BodyField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<BodyField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<BodyField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<BodyField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<BodyField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<BodyField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<BodyField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<BodyField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<BodyField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<BodyField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<BodyField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : BodyFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<BodyField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<BodyField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<BodyField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class BodyFieldSectionColumnProperties(private val path: String) : FieldsList<BodyField>(path) {
	val paddingEnd by lazy { object : BodyFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : BodyFieldDimension("${path}/width") {} }
}

abstract class BodyFieldSuggestedTableRowStyle(private val path: String) : FieldsList<BodyField>(path) {
	val tableRowStyle by lazy { object : BodyFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : BodyFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class BodyFieldTableCell(private val path: String) : FieldsList<BodyField>(path) {
	val content by lazy { object : BodyFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<BodyField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<BodyField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<BodyField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : BodyFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : BodyFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class BodyFieldTableRowStyle(private val path: String) : FieldsList<BodyField>(path) {
	val minRowHeight by lazy { object : BodyFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<BodyField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<BodyField> get() = fieldsList("${path}/tableHeader")
}

abstract class BodyFieldTableColumnProperties(private val path: String) : FieldsList<BodyField>(path) {
	val width by lazy { object : BodyFieldDimension("${path}/width") {} }
	val widthType: FieldsList<BodyField> get() = fieldsList("${path}/widthType")
}

abstract class BodyFieldOptionalColor(private val path: String) : FieldsList<BodyField>(path) {
	val color by lazy { object : BodyFieldColor("${path}/color") {} }
}

abstract class BodyFieldLink(private val path: String) : FieldsList<BodyField>(path) {
	val bookmark by lazy { object : BodyFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<BodyField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : BodyFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<BodyField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<BodyField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<BodyField> get() = fieldsList("${path}/url")
}

abstract class BodyFieldWeightedFontFamily(private val path: String) : FieldsList<BodyField>(path) {
	val fontFamily: FieldsList<BodyField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<BodyField> get() = fieldsList("${path}/weight")
}

abstract class BodyFieldSuggestedTextStyle(private val path: String) : FieldsList<BodyField>(path) {
	val textStyle by lazy { object : BodyFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : BodyFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class BodyFieldPersonProperties(private val path: String) : FieldsList<BodyField>(path) {
	val email: FieldsList<BodyField> get() = fieldsList("${path}/email")
	val name: FieldsList<BodyField> get() = fieldsList("${path}/name")
}

abstract class BodyFieldRichLinkProperties(private val path: String) : FieldsList<BodyField>(path) {
	val mimeType: FieldsList<BodyField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<BodyField> get() = fieldsList("${path}/title")
	val uri: FieldsList<BodyField> get() = fieldsList("${path}/uri")
}

abstract class BodyFieldTextStyleSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColorSuggested: FieldsList<BodyField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<BodyField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<BodyField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<BodyField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<BodyField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<BodyField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<BodyField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<BodyField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<BodyField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<BodyField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<BodyField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class BodyFieldShadingSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColorSuggested: FieldsList<BodyField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class BodyFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val minRowHeightSuggested: FieldsList<BodyField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class BodyFieldSuggestedTableCellStyle(private val path: String) : FieldsList<BodyField>(path) {
	val tableCellStyle by lazy { object : BodyFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : BodyFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class BodyFieldTableCellStyle(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColor by lazy { object : BodyFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : BodyFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : BodyFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : BodyFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : BodyFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<BodyField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<BodyField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : BodyFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : BodyFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : BodyFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : BodyFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<BodyField> get() = fieldsList("${path}/rowSpan")
}

abstract class BodyFieldColor(private val path: String) : FieldsList<BodyField>(path) {
	val rgbColor by lazy { object : BodyFieldRgbColor("${path}/rgbColor") {} }
}

abstract class BodyFieldBookmarkLink(private val path: String) : FieldsList<BodyField>(path) {
	val id: FieldsList<BodyField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BodyField> get() = fieldsList("${path}/tabId")
}

abstract class BodyFieldHeadingLink(private val path: String) : FieldsList<BodyField>(path) {
	val id: FieldsList<BodyField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BodyField> get() = fieldsList("${path}/tabId")
}

abstract class BodyFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<BodyField>(path) {
	val backgroundColorSuggested: FieldsList<BodyField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<BodyField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<BodyField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<BodyField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<BodyField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<BodyField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<BodyField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<BodyField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<BodyField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class BodyFieldTableCellBorder(private val path: String) : FieldsList<BodyField>(path) {
	val color by lazy { object : BodyFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<BodyField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : BodyFieldDimension("${path}/width") {} }
}

abstract class BodyFieldRgbColor(private val path: String) : FieldsList<BodyField>(path) {
	val blue: FieldsList<BodyField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BodyField> get() = fieldsList("${path}/green")
	val red: FieldsList<BodyField> get() = fieldsList("${path}/red")
}

