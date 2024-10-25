package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FootnoteField : Field

object FootnoteFields {
    val ALL: FieldsList<FootnoteField> = fieldsList("*")
	val content = object : FootnoteFieldStructuralElement("content") {}
	val footnoteId: FieldsList<FootnoteField> get() = fieldsList("footnoteId")
}

abstract class FootnoteFieldStructuralElement(private val path: String) : FieldsList<FootnoteField>(path) {
	val endIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : FootnoteFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : FootnoteFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : FootnoteFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : FootnoteFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class FootnoteFieldParagraph(private val path: String) : FieldsList<FootnoteField>(path) {
	val bullet by lazy { object : FootnoteFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : FootnoteFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : FootnoteFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<FootnoteField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : FootnoteFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : FootnoteFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : FootnoteFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class FootnoteFieldSectionBreak(private val path: String) : FieldsList<FootnoteField>(path) {
	val sectionStyle by lazy { object : FootnoteFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FootnoteFieldTable(private val path: String) : FieldsList<FootnoteField>(path) {
	val columns: FieldsList<FootnoteField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<FootnoteField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : FootnoteFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : FootnoteFieldTableStyle("${path}/tableStyle") {} }
}

abstract class FootnoteFieldTableOfContents(private val path: String) : FieldsList<FootnoteField>(path) {
	val content by lazy { object : FootnoteFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FootnoteFieldBullet(private val path: String) : FieldsList<FootnoteField>(path) {
	val listId: FieldsList<FootnoteField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<FootnoteField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldParagraphElement(private val path: String) : FieldsList<FootnoteField>(path) {
	val autoText by lazy { object : FootnoteFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : FootnoteFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : FootnoteFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : FootnoteFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : FootnoteFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : FootnoteFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : FootnoteFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : FootnoteFieldPerson("${path}/person") {} }
	val richLink by lazy { object : FootnoteFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : FootnoteFieldTextRun("${path}/textRun") {} }
}

abstract class FootnoteFieldParagraphStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val alignment: FieldsList<FootnoteField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<FootnoteField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : FootnoteFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : FootnoteFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : FootnoteFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : FootnoteFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : FootnoteFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<FootnoteField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<FootnoteField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : FootnoteFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : FootnoteFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : FootnoteFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<FootnoteField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<FootnoteField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<FootnoteField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<FootnoteField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<FootnoteField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : FootnoteFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : FootnoteFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : FootnoteFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<FootnoteField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : FootnoteFieldTabStop("${path}/tabStops") {} }
}

abstract class FootnoteFieldSuggestedBullet(private val path: String) : FieldsList<FootnoteField>(path) {
	val bullet by lazy { object : FootnoteFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : FootnoteFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class FootnoteFieldSuggestedParagraphStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val paragraphStyle by lazy { object : FootnoteFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : FootnoteFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class FootnoteFieldObjectReferences(private val path: String) : FieldsList<FootnoteField>(path) {
	val objectIds: FieldsList<FootnoteField> get() = fieldsList("${path}/objectIds")
}

abstract class FootnoteFieldSectionStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val columnProperties by lazy { object : FootnoteFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<FootnoteField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<FootnoteField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<FootnoteField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<FootnoteField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<FootnoteField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<FootnoteField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<FootnoteField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<FootnoteField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<FootnoteField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : FootnoteFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : FootnoteFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : FootnoteFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : FootnoteFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : FootnoteFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : FootnoteFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<FootnoteField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<FootnoteField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<FootnoteField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class FootnoteFieldTableRow(private val path: String) : FieldsList<FootnoteField>(path) {
	val endIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : FootnoteFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : FootnoteFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : FootnoteFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class FootnoteFieldTableStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val tableColumnProperties by lazy { object : FootnoteFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class FootnoteFieldTextStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColor by lazy { object : FootnoteFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<FootnoteField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<FootnoteField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : FootnoteFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : FootnoteFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<FootnoteField> get() = fieldsList("${path}/italic")
	val link by lazy { object : FootnoteFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<FootnoteField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<FootnoteField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<FootnoteField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : FootnoteFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class FootnoteFieldAutoText(private val path: String) : FieldsList<FootnoteField>(path) {
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<FootnoteField> get() = fieldsList("${path}/type")
}

abstract class FootnoteFieldColumnBreak(private val path: String) : FieldsList<FootnoteField>(path) {
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldEquation(private val path: String) : FieldsList<FootnoteField>(path) {
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FootnoteFieldFootnoteReference(private val path: String) : FieldsList<FootnoteField>(path) {
	val footnoteId: FieldsList<FootnoteField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<FootnoteField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldHorizontalRule(private val path: String) : FieldsList<FootnoteField>(path) {
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldInlineObjectElement(private val path: String) : FieldsList<FootnoteField>(path) {
	val inlineObjectId: FieldsList<FootnoteField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldPageBreak(private val path: String) : FieldsList<FootnoteField>(path) {
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldPerson(private val path: String) : FieldsList<FootnoteField>(path) {
	val personId: FieldsList<FootnoteField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : FootnoteFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldRichLink(private val path: String) : FieldsList<FootnoteField>(path) {
	val richLinkId: FieldsList<FootnoteField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : FootnoteFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldTextRun(private val path: String) : FieldsList<FootnoteField>(path) {
	val content: FieldsList<FootnoteField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FootnoteFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
}

abstract class FootnoteFieldParagraphBorder(private val path: String) : FieldsList<FootnoteField>(path) {
	val color by lazy { object : FootnoteFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<FootnoteField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : FootnoteFieldDimension("${path}/padding") {} }
	val width by lazy { object : FootnoteFieldDimension("${path}/width") {} }
}

abstract class FootnoteFieldDimension(private val path: String) : FieldsList<FootnoteField>(path) {
	val magnitude: FieldsList<FootnoteField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<FootnoteField> get() = fieldsList("${path}/unit")
}

abstract class FootnoteFieldShading(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColor by lazy { object : FootnoteFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class FootnoteFieldTabStop(private val path: String) : FieldsList<FootnoteField>(path) {
	val alignment: FieldsList<FootnoteField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : FootnoteFieldDimension("${path}/offset") {} }
}

abstract class FootnoteFieldBulletSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val listIdSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : FootnoteFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class FootnoteFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val alignmentSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : FootnoteFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class FootnoteFieldSectionColumnProperties(private val path: String) : FieldsList<FootnoteField>(path) {
	val paddingEnd by lazy { object : FootnoteFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : FootnoteFieldDimension("${path}/width") {} }
}

abstract class FootnoteFieldSuggestedTableRowStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val tableRowStyle by lazy { object : FootnoteFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : FootnoteFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class FootnoteFieldTableCell(private val path: String) : FieldsList<FootnoteField>(path) {
	val content by lazy { object : FootnoteFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<FootnoteField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FootnoteField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : FootnoteFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : FootnoteFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class FootnoteFieldTableRowStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val minRowHeight by lazy { object : FootnoteFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<FootnoteField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<FootnoteField> get() = fieldsList("${path}/tableHeader")
}

abstract class FootnoteFieldTableColumnProperties(private val path: String) : FieldsList<FootnoteField>(path) {
	val width by lazy { object : FootnoteFieldDimension("${path}/width") {} }
	val widthType: FieldsList<FootnoteField> get() = fieldsList("${path}/widthType")
}

abstract class FootnoteFieldOptionalColor(private val path: String) : FieldsList<FootnoteField>(path) {
	val color by lazy { object : FootnoteFieldColor("${path}/color") {} }
}

abstract class FootnoteFieldLink(private val path: String) : FieldsList<FootnoteField>(path) {
	val bookmark by lazy { object : FootnoteFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<FootnoteField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : FootnoteFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<FootnoteField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<FootnoteField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<FootnoteField> get() = fieldsList("${path}/url")
}

abstract class FootnoteFieldWeightedFontFamily(private val path: String) : FieldsList<FootnoteField>(path) {
	val fontFamily: FieldsList<FootnoteField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<FootnoteField> get() = fieldsList("${path}/weight")
}

abstract class FootnoteFieldSuggestedTextStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val textStyle by lazy { object : FootnoteFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : FootnoteFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class FootnoteFieldPersonProperties(private val path: String) : FieldsList<FootnoteField>(path) {
	val email: FieldsList<FootnoteField> get() = fieldsList("${path}/email")
	val name: FieldsList<FootnoteField> get() = fieldsList("${path}/name")
}

abstract class FootnoteFieldRichLinkProperties(private val path: String) : FieldsList<FootnoteField>(path) {
	val mimeType: FieldsList<FootnoteField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<FootnoteField> get() = fieldsList("${path}/title")
	val uri: FieldsList<FootnoteField> get() = fieldsList("${path}/uri")
}

abstract class FootnoteFieldTextStyleSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColorSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class FootnoteFieldShadingSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColorSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class FootnoteFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val minRowHeightSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class FootnoteFieldSuggestedTableCellStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val tableCellStyle by lazy { object : FootnoteFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : FootnoteFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class FootnoteFieldTableCellStyle(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColor by lazy { object : FootnoteFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : FootnoteFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : FootnoteFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : FootnoteFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : FootnoteFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<FootnoteField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<FootnoteField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : FootnoteFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : FootnoteFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : FootnoteFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : FootnoteFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<FootnoteField> get() = fieldsList("${path}/rowSpan")
}

abstract class FootnoteFieldColor(private val path: String) : FieldsList<FootnoteField>(path) {
	val rgbColor by lazy { object : FootnoteFieldRgbColor("${path}/rgbColor") {} }
}

abstract class FootnoteFieldBookmarkLink(private val path: String) : FieldsList<FootnoteField>(path) {
	val id: FieldsList<FootnoteField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FootnoteField> get() = fieldsList("${path}/tabId")
}

abstract class FootnoteFieldHeadingLink(private val path: String) : FieldsList<FootnoteField>(path) {
	val id: FieldsList<FootnoteField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FootnoteField> get() = fieldsList("${path}/tabId")
}

abstract class FootnoteFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<FootnoteField>(path) {
	val backgroundColorSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<FootnoteField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class FootnoteFieldTableCellBorder(private val path: String) : FieldsList<FootnoteField>(path) {
	val color by lazy { object : FootnoteFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<FootnoteField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : FootnoteFieldDimension("${path}/width") {} }
}

abstract class FootnoteFieldRgbColor(private val path: String) : FieldsList<FootnoteField>(path) {
	val blue: FieldsList<FootnoteField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FootnoteField> get() = fieldsList("${path}/green")
	val red: FieldsList<FootnoteField> get() = fieldsList("${path}/red")
}

