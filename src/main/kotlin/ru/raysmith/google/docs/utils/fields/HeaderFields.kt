package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HeaderField : Field

object HeaderFields {
    val ALL: FieldsList<HeaderField> = fieldsList("*")
	val content = object : HeaderFieldStructuralElement("content") {}
	val headerId: FieldsList<HeaderField> get() = fieldsList("headerId")
}

abstract class HeaderFieldStructuralElement(private val path: String) : FieldsList<HeaderField>(path) {
	val endIndex: FieldsList<HeaderField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : HeaderFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : HeaderFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<HeaderField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : HeaderFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : HeaderFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class HeaderFieldParagraph(private val path: String) : FieldsList<HeaderField>(path) {
	val bullet by lazy { object : HeaderFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : HeaderFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : HeaderFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<HeaderField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : HeaderFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : HeaderFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : HeaderFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class HeaderFieldSectionBreak(private val path: String) : FieldsList<HeaderField>(path) {
	val sectionStyle by lazy { object : HeaderFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class HeaderFieldTable(private val path: String) : FieldsList<HeaderField>(path) {
	val columns: FieldsList<HeaderField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<HeaderField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : HeaderFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : HeaderFieldTableStyle("${path}/tableStyle") {} }
}

abstract class HeaderFieldTableOfContents(private val path: String) : FieldsList<HeaderField>(path) {
	val content by lazy { object : HeaderFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class HeaderFieldBullet(private val path: String) : FieldsList<HeaderField>(path) {
	val listId: FieldsList<HeaderField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<HeaderField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldParagraphElement(private val path: String) : FieldsList<HeaderField>(path) {
	val autoText by lazy { object : HeaderFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : HeaderFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<HeaderField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : HeaderFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : HeaderFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : HeaderFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : HeaderFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : HeaderFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : HeaderFieldPerson("${path}/person") {} }
	val richLink by lazy { object : HeaderFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<HeaderField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : HeaderFieldTextRun("${path}/textRun") {} }
}

abstract class HeaderFieldParagraphStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val alignment: FieldsList<HeaderField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<HeaderField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : HeaderFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : HeaderFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : HeaderFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : HeaderFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : HeaderFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<HeaderField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<HeaderField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : HeaderFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : HeaderFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : HeaderFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<HeaderField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<HeaderField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<HeaderField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<HeaderField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<HeaderField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : HeaderFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : HeaderFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : HeaderFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<HeaderField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : HeaderFieldTabStop("${path}/tabStops") {} }
}

abstract class HeaderFieldSuggestedBullet(private val path: String) : FieldsList<HeaderField>(path) {
	val bullet by lazy { object : HeaderFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : HeaderFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class HeaderFieldSuggestedParagraphStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val paragraphStyle by lazy { object : HeaderFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : HeaderFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class HeaderFieldObjectReferences(private val path: String) : FieldsList<HeaderField>(path) {
	val objectIds: FieldsList<HeaderField> get() = fieldsList("${path}/objectIds")
}

abstract class HeaderFieldSectionStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val columnProperties by lazy { object : HeaderFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<HeaderField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<HeaderField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<HeaderField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<HeaderField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<HeaderField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<HeaderField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<HeaderField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<HeaderField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<HeaderField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : HeaderFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : HeaderFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : HeaderFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : HeaderFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : HeaderFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : HeaderFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<HeaderField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<HeaderField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<HeaderField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class HeaderFieldTableRow(private val path: String) : FieldsList<HeaderField>(path) {
	val endIndex: FieldsList<HeaderField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<HeaderField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : HeaderFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : HeaderFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : HeaderFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class HeaderFieldTableStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val tableColumnProperties by lazy { object : HeaderFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class HeaderFieldTextStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColor by lazy { object : HeaderFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<HeaderField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<HeaderField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : HeaderFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : HeaderFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<HeaderField> get() = fieldsList("${path}/italic")
	val link by lazy { object : HeaderFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<HeaderField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<HeaderField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<HeaderField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : HeaderFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class HeaderFieldAutoText(private val path: String) : FieldsList<HeaderField>(path) {
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<HeaderField> get() = fieldsList("${path}/type")
}

abstract class HeaderFieldColumnBreak(private val path: String) : FieldsList<HeaderField>(path) {
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldEquation(private val path: String) : FieldsList<HeaderField>(path) {
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class HeaderFieldFootnoteReference(private val path: String) : FieldsList<HeaderField>(path) {
	val footnoteId: FieldsList<HeaderField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<HeaderField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldHorizontalRule(private val path: String) : FieldsList<HeaderField>(path) {
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldInlineObjectElement(private val path: String) : FieldsList<HeaderField>(path) {
	val inlineObjectId: FieldsList<HeaderField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldPageBreak(private val path: String) : FieldsList<HeaderField>(path) {
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldPerson(private val path: String) : FieldsList<HeaderField>(path) {
	val personId: FieldsList<HeaderField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : HeaderFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldRichLink(private val path: String) : FieldsList<HeaderField>(path) {
	val richLinkId: FieldsList<HeaderField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : HeaderFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldTextRun(private val path: String) : FieldsList<HeaderField>(path) {
	val content: FieldsList<HeaderField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : HeaderFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
}

abstract class HeaderFieldParagraphBorder(private val path: String) : FieldsList<HeaderField>(path) {
	val color by lazy { object : HeaderFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<HeaderField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : HeaderFieldDimension("${path}/padding") {} }
	val width by lazy { object : HeaderFieldDimension("${path}/width") {} }
}

abstract class HeaderFieldDimension(private val path: String) : FieldsList<HeaderField>(path) {
	val magnitude: FieldsList<HeaderField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<HeaderField> get() = fieldsList("${path}/unit")
}

abstract class HeaderFieldShading(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColor by lazy { object : HeaderFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class HeaderFieldTabStop(private val path: String) : FieldsList<HeaderField>(path) {
	val alignment: FieldsList<HeaderField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : HeaderFieldDimension("${path}/offset") {} }
}

abstract class HeaderFieldBulletSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val listIdSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : HeaderFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class HeaderFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val alignmentSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : HeaderFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class HeaderFieldSectionColumnProperties(private val path: String) : FieldsList<HeaderField>(path) {
	val paddingEnd by lazy { object : HeaderFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : HeaderFieldDimension("${path}/width") {} }
}

abstract class HeaderFieldSuggestedTableRowStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val tableRowStyle by lazy { object : HeaderFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : HeaderFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class HeaderFieldTableCell(private val path: String) : FieldsList<HeaderField>(path) {
	val content by lazy { object : HeaderFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<HeaderField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<HeaderField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HeaderField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : HeaderFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : HeaderFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class HeaderFieldTableRowStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val minRowHeight by lazy { object : HeaderFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<HeaderField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<HeaderField> get() = fieldsList("${path}/tableHeader")
}

abstract class HeaderFieldTableColumnProperties(private val path: String) : FieldsList<HeaderField>(path) {
	val width by lazy { object : HeaderFieldDimension("${path}/width") {} }
	val widthType: FieldsList<HeaderField> get() = fieldsList("${path}/widthType")
}

abstract class HeaderFieldOptionalColor(private val path: String) : FieldsList<HeaderField>(path) {
	val color by lazy { object : HeaderFieldColor("${path}/color") {} }
}

abstract class HeaderFieldLink(private val path: String) : FieldsList<HeaderField>(path) {
	val bookmark by lazy { object : HeaderFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<HeaderField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : HeaderFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<HeaderField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<HeaderField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<HeaderField> get() = fieldsList("${path}/url")
}

abstract class HeaderFieldWeightedFontFamily(private val path: String) : FieldsList<HeaderField>(path) {
	val fontFamily: FieldsList<HeaderField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<HeaderField> get() = fieldsList("${path}/weight")
}

abstract class HeaderFieldSuggestedTextStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val textStyle by lazy { object : HeaderFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : HeaderFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class HeaderFieldPersonProperties(private val path: String) : FieldsList<HeaderField>(path) {
	val email: FieldsList<HeaderField> get() = fieldsList("${path}/email")
	val name: FieldsList<HeaderField> get() = fieldsList("${path}/name")
}

abstract class HeaderFieldRichLinkProperties(private val path: String) : FieldsList<HeaderField>(path) {
	val mimeType: FieldsList<HeaderField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<HeaderField> get() = fieldsList("${path}/title")
	val uri: FieldsList<HeaderField> get() = fieldsList("${path}/uri")
}

abstract class HeaderFieldTextStyleSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColorSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<HeaderField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class HeaderFieldShadingSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColorSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class HeaderFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val minRowHeightSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class HeaderFieldSuggestedTableCellStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val tableCellStyle by lazy { object : HeaderFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : HeaderFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class HeaderFieldTableCellStyle(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColor by lazy { object : HeaderFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : HeaderFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : HeaderFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : HeaderFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : HeaderFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<HeaderField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<HeaderField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : HeaderFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : HeaderFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : HeaderFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : HeaderFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<HeaderField> get() = fieldsList("${path}/rowSpan")
}

abstract class HeaderFieldColor(private val path: String) : FieldsList<HeaderField>(path) {
	val rgbColor by lazy { object : HeaderFieldRgbColor("${path}/rgbColor") {} }
}

abstract class HeaderFieldBookmarkLink(private val path: String) : FieldsList<HeaderField>(path) {
	val id: FieldsList<HeaderField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<HeaderField> get() = fieldsList("${path}/tabId")
}

abstract class HeaderFieldHeadingLink(private val path: String) : FieldsList<HeaderField>(path) {
	val id: FieldsList<HeaderField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<HeaderField> get() = fieldsList("${path}/tabId")
}

abstract class HeaderFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<HeaderField>(path) {
	val backgroundColorSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<HeaderField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class HeaderFieldTableCellBorder(private val path: String) : FieldsList<HeaderField>(path) {
	val color by lazy { object : HeaderFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<HeaderField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : HeaderFieldDimension("${path}/width") {} }
}

abstract class HeaderFieldRgbColor(private val path: String) : FieldsList<HeaderField>(path) {
	val blue: FieldsList<HeaderField> get() = fieldsList("${path}/blue")
	val green: FieldsList<HeaderField> get() = fieldsList("${path}/green")
	val red: FieldsList<HeaderField> get() = fieldsList("${path}/red")
}

