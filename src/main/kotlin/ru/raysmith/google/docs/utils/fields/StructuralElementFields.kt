package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface StructuralElementField : Field

object StructuralElementFields {
    val ALL: FieldsList<StructuralElementField> = fieldsList("*")
	val endIndex: FieldsList<StructuralElementField> get() = fieldsList("endIndex")
	val paragraph = object : StructuralElementFieldParagraph("paragraph") {}
	val sectionBreak = object : StructuralElementFieldSectionBreak("sectionBreak") {}
	val startIndex: FieldsList<StructuralElementField> get() = fieldsList("startIndex")
	val table = object : StructuralElementFieldTable("table") {}
	val tableOfContents = object : StructuralElementFieldTableOfContents("tableOfContents") {}
}

abstract class StructuralElementFieldParagraph(private val path: String) : FieldsList<StructuralElementField>(path) {
	val bullet by lazy { object : StructuralElementFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : StructuralElementFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : StructuralElementFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : StructuralElementFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : StructuralElementFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : StructuralElementFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class StructuralElementFieldSectionBreak(private val path: String) : FieldsList<StructuralElementField>(path) {
	val sectionStyle by lazy { object : StructuralElementFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class StructuralElementFieldTable(private val path: String) : FieldsList<StructuralElementField>(path) {
	val columns: FieldsList<StructuralElementField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<StructuralElementField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : StructuralElementFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : StructuralElementFieldTableStyle("${path}/tableStyle") {} }
}

abstract class StructuralElementFieldTableOfContents(private val path: String) : FieldsList<StructuralElementField>(path) {
	val content by lazy { object : StructuralElementFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class StructuralElementFieldBullet(private val path: String) : FieldsList<StructuralElementField>(path) {
	val listId: FieldsList<StructuralElementField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<StructuralElementField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldParagraphElement(private val path: String) : FieldsList<StructuralElementField>(path) {
	val autoText by lazy { object : StructuralElementFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : StructuralElementFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : StructuralElementFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : StructuralElementFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : StructuralElementFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : StructuralElementFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : StructuralElementFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : StructuralElementFieldPerson("${path}/person") {} }
	val richLink by lazy { object : StructuralElementFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : StructuralElementFieldTextRun("${path}/textRun") {} }
}

abstract class StructuralElementFieldParagraphStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val alignment: FieldsList<StructuralElementField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<StructuralElementField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : StructuralElementFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : StructuralElementFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : StructuralElementFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : StructuralElementFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : StructuralElementFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<StructuralElementField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<StructuralElementField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : StructuralElementFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : StructuralElementFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : StructuralElementFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<StructuralElementField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<StructuralElementField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<StructuralElementField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<StructuralElementField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<StructuralElementField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : StructuralElementFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : StructuralElementFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : StructuralElementFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<StructuralElementField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : StructuralElementFieldTabStop("${path}/tabStops") {} }
}

abstract class StructuralElementFieldSuggestedBullet(private val path: String) : FieldsList<StructuralElementField>(path) {
	val bullet by lazy { object : StructuralElementFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : StructuralElementFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class StructuralElementFieldSuggestedParagraphStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val paragraphStyle by lazy { object : StructuralElementFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : StructuralElementFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class StructuralElementFieldObjectReferences(private val path: String) : FieldsList<StructuralElementField>(path) {
	val objectIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/objectIds")
}

abstract class StructuralElementFieldSectionStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val columnProperties by lazy { object : StructuralElementFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<StructuralElementField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<StructuralElementField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<StructuralElementField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<StructuralElementField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<StructuralElementField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<StructuralElementField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<StructuralElementField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<StructuralElementField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<StructuralElementField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : StructuralElementFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : StructuralElementFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : StructuralElementFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : StructuralElementFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : StructuralElementFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : StructuralElementFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<StructuralElementField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<StructuralElementField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<StructuralElementField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class StructuralElementFieldTableRow(private val path: String) : FieldsList<StructuralElementField>(path) {
	val endIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : StructuralElementFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : StructuralElementFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : StructuralElementFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class StructuralElementFieldTableStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val tableColumnProperties by lazy { object : StructuralElementFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class StructuralElementFieldStructuralElement(private val path: String) : FieldsList<StructuralElementField>(path) {
	val endIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : StructuralElementFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : StructuralElementFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : StructuralElementFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : StructuralElementFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class StructuralElementFieldTextStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColor by lazy { object : StructuralElementFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<StructuralElementField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<StructuralElementField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : StructuralElementFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : StructuralElementFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<StructuralElementField> get() = fieldsList("${path}/italic")
	val link by lazy { object : StructuralElementFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<StructuralElementField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<StructuralElementField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<StructuralElementField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : StructuralElementFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class StructuralElementFieldAutoText(private val path: String) : FieldsList<StructuralElementField>(path) {
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<StructuralElementField> get() = fieldsList("${path}/type")
}

abstract class StructuralElementFieldColumnBreak(private val path: String) : FieldsList<StructuralElementField>(path) {
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldEquation(private val path: String) : FieldsList<StructuralElementField>(path) {
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class StructuralElementFieldFootnoteReference(private val path: String) : FieldsList<StructuralElementField>(path) {
	val footnoteId: FieldsList<StructuralElementField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<StructuralElementField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldHorizontalRule(private val path: String) : FieldsList<StructuralElementField>(path) {
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldInlineObjectElement(private val path: String) : FieldsList<StructuralElementField>(path) {
	val inlineObjectId: FieldsList<StructuralElementField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldPageBreak(private val path: String) : FieldsList<StructuralElementField>(path) {
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldPerson(private val path: String) : FieldsList<StructuralElementField>(path) {
	val personId: FieldsList<StructuralElementField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : StructuralElementFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldRichLink(private val path: String) : FieldsList<StructuralElementField>(path) {
	val richLinkId: FieldsList<StructuralElementField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : StructuralElementFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldTextRun(private val path: String) : FieldsList<StructuralElementField>(path) {
	val content: FieldsList<StructuralElementField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : StructuralElementFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
}

abstract class StructuralElementFieldParagraphBorder(private val path: String) : FieldsList<StructuralElementField>(path) {
	val color by lazy { object : StructuralElementFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<StructuralElementField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : StructuralElementFieldDimension("${path}/padding") {} }
	val width by lazy { object : StructuralElementFieldDimension("${path}/width") {} }
}

abstract class StructuralElementFieldDimension(private val path: String) : FieldsList<StructuralElementField>(path) {
	val magnitude: FieldsList<StructuralElementField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<StructuralElementField> get() = fieldsList("${path}/unit")
}

abstract class StructuralElementFieldShading(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColor by lazy { object : StructuralElementFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class StructuralElementFieldTabStop(private val path: String) : FieldsList<StructuralElementField>(path) {
	val alignment: FieldsList<StructuralElementField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : StructuralElementFieldDimension("${path}/offset") {} }
}

abstract class StructuralElementFieldBulletSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val listIdSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : StructuralElementFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class StructuralElementFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val alignmentSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : StructuralElementFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class StructuralElementFieldSectionColumnProperties(private val path: String) : FieldsList<StructuralElementField>(path) {
	val paddingEnd by lazy { object : StructuralElementFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : StructuralElementFieldDimension("${path}/width") {} }
}

abstract class StructuralElementFieldSuggestedTableRowStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val tableRowStyle by lazy { object : StructuralElementFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : StructuralElementFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class StructuralElementFieldTableCell(private val path: String) : FieldsList<StructuralElementField>(path) {
	val content by lazy { object : StructuralElementFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<StructuralElementField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<StructuralElementField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : StructuralElementFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : StructuralElementFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class StructuralElementFieldTableRowStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val minRowHeight by lazy { object : StructuralElementFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<StructuralElementField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<StructuralElementField> get() = fieldsList("${path}/tableHeader")
}

abstract class StructuralElementFieldTableColumnProperties(private val path: String) : FieldsList<StructuralElementField>(path) {
	val width by lazy { object : StructuralElementFieldDimension("${path}/width") {} }
	val widthType: FieldsList<StructuralElementField> get() = fieldsList("${path}/widthType")
}

abstract class StructuralElementFieldOptionalColor(private val path: String) : FieldsList<StructuralElementField>(path) {
	val color by lazy { object : StructuralElementFieldColor("${path}/color") {} }
}

abstract class StructuralElementFieldLink(private val path: String) : FieldsList<StructuralElementField>(path) {
	val bookmark by lazy { object : StructuralElementFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<StructuralElementField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : StructuralElementFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<StructuralElementField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<StructuralElementField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<StructuralElementField> get() = fieldsList("${path}/url")
}

abstract class StructuralElementFieldWeightedFontFamily(private val path: String) : FieldsList<StructuralElementField>(path) {
	val fontFamily: FieldsList<StructuralElementField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<StructuralElementField> get() = fieldsList("${path}/weight")
}

abstract class StructuralElementFieldSuggestedTextStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val textStyle by lazy { object : StructuralElementFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : StructuralElementFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class StructuralElementFieldPersonProperties(private val path: String) : FieldsList<StructuralElementField>(path) {
	val email: FieldsList<StructuralElementField> get() = fieldsList("${path}/email")
	val name: FieldsList<StructuralElementField> get() = fieldsList("${path}/name")
}

abstract class StructuralElementFieldRichLinkProperties(private val path: String) : FieldsList<StructuralElementField>(path) {
	val mimeType: FieldsList<StructuralElementField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<StructuralElementField> get() = fieldsList("${path}/title")
	val uri: FieldsList<StructuralElementField> get() = fieldsList("${path}/uri")
}

abstract class StructuralElementFieldTextStyleSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColorSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class StructuralElementFieldShadingSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColorSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class StructuralElementFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val minRowHeightSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class StructuralElementFieldSuggestedTableCellStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val tableCellStyle by lazy { object : StructuralElementFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : StructuralElementFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class StructuralElementFieldTableCellStyle(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColor by lazy { object : StructuralElementFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : StructuralElementFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : StructuralElementFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : StructuralElementFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : StructuralElementFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<StructuralElementField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<StructuralElementField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : StructuralElementFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : StructuralElementFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : StructuralElementFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : StructuralElementFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<StructuralElementField> get() = fieldsList("${path}/rowSpan")
}

abstract class StructuralElementFieldColor(private val path: String) : FieldsList<StructuralElementField>(path) {
	val rgbColor by lazy { object : StructuralElementFieldRgbColor("${path}/rgbColor") {} }
}

abstract class StructuralElementFieldBookmarkLink(private val path: String) : FieldsList<StructuralElementField>(path) {
	val id: FieldsList<StructuralElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<StructuralElementField> get() = fieldsList("${path}/tabId")
}

abstract class StructuralElementFieldHeadingLink(private val path: String) : FieldsList<StructuralElementField>(path) {
	val id: FieldsList<StructuralElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<StructuralElementField> get() = fieldsList("${path}/tabId")
}

abstract class StructuralElementFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<StructuralElementField>(path) {
	val backgroundColorSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<StructuralElementField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class StructuralElementFieldTableCellBorder(private val path: String) : FieldsList<StructuralElementField>(path) {
	val color by lazy { object : StructuralElementFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<StructuralElementField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : StructuralElementFieldDimension("${path}/width") {} }
}

abstract class StructuralElementFieldRgbColor(private val path: String) : FieldsList<StructuralElementField>(path) {
	val blue: FieldsList<StructuralElementField> get() = fieldsList("${path}/blue")
	val green: FieldsList<StructuralElementField> get() = fieldsList("${path}/green")
	val red: FieldsList<StructuralElementField> get() = fieldsList("${path}/red")
}

