package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableOfContentsField : Field

object TableOfContentsFields {
    val ALL: FieldsList<TableOfContentsField> = fieldsList("*")
	val content = object : TableOfContentsFieldStructuralElement("content") {}
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("suggestedInsertionIds")
}

abstract class TableOfContentsFieldStructuralElement(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val endIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : TableOfContentsFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : TableOfContentsFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : TableOfContentsFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : TableOfContentsFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class TableOfContentsFieldParagraph(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val bullet by lazy { object : TableOfContentsFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : TableOfContentsFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : TableOfContentsFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : TableOfContentsFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : TableOfContentsFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : TableOfContentsFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class TableOfContentsFieldSectionBreak(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val sectionStyle by lazy { object : TableOfContentsFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableOfContentsFieldTable(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val columns: FieldsList<TableOfContentsField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<TableOfContentsField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : TableOfContentsFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : TableOfContentsFieldTableStyle("${path}/tableStyle") {} }
}

abstract class TableOfContentsFieldTableOfContents(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val content by lazy { object : TableOfContentsFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableOfContentsFieldBullet(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val listId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<TableOfContentsField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldParagraphElement(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val autoText by lazy { object : TableOfContentsFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : TableOfContentsFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : TableOfContentsFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : TableOfContentsFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : TableOfContentsFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : TableOfContentsFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : TableOfContentsFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : TableOfContentsFieldPerson("${path}/person") {} }
	val richLink by lazy { object : TableOfContentsFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : TableOfContentsFieldTextRun("${path}/textRun") {} }
}

abstract class TableOfContentsFieldParagraphStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val alignment: FieldsList<TableOfContentsField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<TableOfContentsField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : TableOfContentsFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : TableOfContentsFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableOfContentsFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableOfContentsFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableOfContentsFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<TableOfContentsField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : TableOfContentsFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : TableOfContentsFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TableOfContentsFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<TableOfContentsField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<TableOfContentsField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<TableOfContentsField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<TableOfContentsField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<TableOfContentsField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : TableOfContentsFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : TableOfContentsFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : TableOfContentsFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<TableOfContentsField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : TableOfContentsFieldTabStop("${path}/tabStops") {} }
}

abstract class TableOfContentsFieldSuggestedBullet(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val bullet by lazy { object : TableOfContentsFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : TableOfContentsFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class TableOfContentsFieldSuggestedParagraphStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val paragraphStyle by lazy { object : TableOfContentsFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : TableOfContentsFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class TableOfContentsFieldObjectReferences(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val objectIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/objectIds")
}

abstract class TableOfContentsFieldSectionStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val columnProperties by lazy { object : TableOfContentsFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<TableOfContentsField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<TableOfContentsField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TableOfContentsField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TableOfContentsFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TableOfContentsFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TableOfContentsFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TableOfContentsFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TableOfContentsFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TableOfContentsFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TableOfContentsField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<TableOfContentsField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<TableOfContentsField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TableOfContentsFieldTableRow(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val endIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : TableOfContentsFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : TableOfContentsFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : TableOfContentsFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class TableOfContentsFieldTableStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val tableColumnProperties by lazy { object : TableOfContentsFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class TableOfContentsFieldTextStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColor by lazy { object : TableOfContentsFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TableOfContentsField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TableOfContentsField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TableOfContentsFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TableOfContentsFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TableOfContentsField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TableOfContentsFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TableOfContentsField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TableOfContentsField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TableOfContentsField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TableOfContentsFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TableOfContentsFieldAutoText(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<TableOfContentsField> get() = fieldsList("${path}/type")
}

abstract class TableOfContentsFieldColumnBreak(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldEquation(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableOfContentsFieldFootnoteReference(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val footnoteId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<TableOfContentsField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldHorizontalRule(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldInlineObjectElement(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val inlineObjectId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldPageBreak(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldPerson(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val personId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : TableOfContentsFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldRichLink(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val richLinkId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : TableOfContentsFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldTextRun(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val content: FieldsList<TableOfContentsField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableOfContentsFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableOfContentsFieldParagraphBorder(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val color by lazy { object : TableOfContentsFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableOfContentsField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : TableOfContentsFieldDimension("${path}/padding") {} }
	val width by lazy { object : TableOfContentsFieldDimension("${path}/width") {} }
}

abstract class TableOfContentsFieldDimension(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val magnitude: FieldsList<TableOfContentsField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableOfContentsField> get() = fieldsList("${path}/unit")
}

abstract class TableOfContentsFieldShading(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColor by lazy { object : TableOfContentsFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class TableOfContentsFieldTabStop(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val alignment: FieldsList<TableOfContentsField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : TableOfContentsFieldDimension("${path}/offset") {} }
}

abstract class TableOfContentsFieldBulletSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val listIdSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : TableOfContentsFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableOfContentsFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val alignmentSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : TableOfContentsFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class TableOfContentsFieldSectionColumnProperties(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val paddingEnd by lazy { object : TableOfContentsFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : TableOfContentsFieldDimension("${path}/width") {} }
}

abstract class TableOfContentsFieldSuggestedTableRowStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val tableRowStyle by lazy { object : TableOfContentsFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : TableOfContentsFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class TableOfContentsFieldTableCell(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val content by lazy { object : TableOfContentsFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableOfContentsField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableOfContentsField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : TableOfContentsFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : TableOfContentsFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class TableOfContentsFieldTableRowStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val minRowHeight by lazy { object : TableOfContentsFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<TableOfContentsField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<TableOfContentsField> get() = fieldsList("${path}/tableHeader")
}

abstract class TableOfContentsFieldTableColumnProperties(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val width by lazy { object : TableOfContentsFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TableOfContentsField> get() = fieldsList("${path}/widthType")
}

abstract class TableOfContentsFieldOptionalColor(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val color by lazy { object : TableOfContentsFieldColor("${path}/color") {} }
}

abstract class TableOfContentsFieldLink(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val bookmark by lazy { object : TableOfContentsFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TableOfContentsFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TableOfContentsField> get() = fieldsList("${path}/url")
}

abstract class TableOfContentsFieldWeightedFontFamily(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val fontFamily: FieldsList<TableOfContentsField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TableOfContentsField> get() = fieldsList("${path}/weight")
}

abstract class TableOfContentsFieldSuggestedTextStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val textStyle by lazy { object : TableOfContentsFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TableOfContentsFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableOfContentsFieldPersonProperties(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val email: FieldsList<TableOfContentsField> get() = fieldsList("${path}/email")
	val name: FieldsList<TableOfContentsField> get() = fieldsList("${path}/name")
}

abstract class TableOfContentsFieldRichLinkProperties(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val mimeType: FieldsList<TableOfContentsField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<TableOfContentsField> get() = fieldsList("${path}/title")
	val uri: FieldsList<TableOfContentsField> get() = fieldsList("${path}/uri")
}

abstract class TableOfContentsFieldTextStyleSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColorSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TableOfContentsFieldShadingSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColorSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TableOfContentsFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val minRowHeightSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class TableOfContentsFieldSuggestedTableCellStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val tableCellStyle by lazy { object : TableOfContentsFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : TableOfContentsFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class TableOfContentsFieldTableCellStyle(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColor by lazy { object : TableOfContentsFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : TableOfContentsFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableOfContentsFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableOfContentsFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableOfContentsFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<TableOfContentsField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<TableOfContentsField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : TableOfContentsFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : TableOfContentsFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : TableOfContentsFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : TableOfContentsFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<TableOfContentsField> get() = fieldsList("${path}/rowSpan")
}

abstract class TableOfContentsFieldColor(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val rgbColor by lazy { object : TableOfContentsFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableOfContentsFieldBookmarkLink(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val id: FieldsList<TableOfContentsField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/tabId")
}

abstract class TableOfContentsFieldHeadingLink(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val id: FieldsList<TableOfContentsField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableOfContentsField> get() = fieldsList("${path}/tabId")
}

abstract class TableOfContentsFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val backgroundColorSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TableOfContentsField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class TableOfContentsFieldTableCellBorder(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val color by lazy { object : TableOfContentsFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableOfContentsField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TableOfContentsFieldDimension("${path}/width") {} }
}

abstract class TableOfContentsFieldRgbColor(private val path: String) : FieldsList<TableOfContentsField>(path) {
	val blue: FieldsList<TableOfContentsField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableOfContentsField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableOfContentsField> get() = fieldsList("${path}/red")
}

