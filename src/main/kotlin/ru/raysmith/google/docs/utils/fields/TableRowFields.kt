package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableRowField : Field

object TableRowFields {
    val ALL: FieldsList<TableRowField> = fieldsList("*")
	val endIndex: FieldsList<TableRowField> get() = fieldsList("endIndex")
	val startIndex: FieldsList<TableRowField> get() = fieldsList("startIndex")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTableRowStyleChanges = object : TableRowFieldSuggestedTableRowStyle("suggestedTableRowStyleChanges") {}
	val tableCells = object : TableRowFieldTableCell("tableCells") {}
	val tableRowStyle = object : TableRowFieldTableRowStyle("tableRowStyle") {}
}

abstract class TableRowFieldSuggestedTableRowStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val tableRowStyle by lazy { object : TableRowFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : TableRowFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class TableRowFieldTableCell(private val path: String) : FieldsList<TableRowField>(path) {
	val content by lazy { object : TableRowFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<TableRowField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableRowField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : TableRowFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : TableRowFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class TableRowFieldTableRowStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val minRowHeight by lazy { object : TableRowFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<TableRowField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<TableRowField> get() = fieldsList("${path}/tableHeader")
}

abstract class TableRowFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val minRowHeightSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class TableRowFieldStructuralElement(private val path: String) : FieldsList<TableRowField>(path) {
	val endIndex: FieldsList<TableRowField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : TableRowFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : TableRowFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<TableRowField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : TableRowFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : TableRowFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class TableRowFieldSuggestedTableCellStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val tableCellStyle by lazy { object : TableRowFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : TableRowFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class TableRowFieldTableCellStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColor by lazy { object : TableRowFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : TableRowFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableRowFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableRowFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableRowFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<TableRowField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<TableRowField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : TableRowFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : TableRowFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : TableRowFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : TableRowFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<TableRowField> get() = fieldsList("${path}/rowSpan")
}

abstract class TableRowFieldDimension(private val path: String) : FieldsList<TableRowField>(path) {
	val magnitude: FieldsList<TableRowField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableRowField> get() = fieldsList("${path}/unit")
}

abstract class TableRowFieldParagraph(private val path: String) : FieldsList<TableRowField>(path) {
	val bullet by lazy { object : TableRowFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : TableRowFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : TableRowFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<TableRowField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : TableRowFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : TableRowFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : TableRowFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class TableRowFieldSectionBreak(private val path: String) : FieldsList<TableRowField>(path) {
	val sectionStyle by lazy { object : TableRowFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableRowFieldTable(private val path: String) : FieldsList<TableRowField>(path) {
	val columns: FieldsList<TableRowField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<TableRowField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : TableRowFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : TableRowFieldTableStyle("${path}/tableStyle") {} }
}

abstract class TableRowFieldTableOfContents(private val path: String) : FieldsList<TableRowField>(path) {
	val content by lazy { object : TableRowFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableRowFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColorSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class TableRowFieldOptionalColor(private val path: String) : FieldsList<TableRowField>(path) {
	val color by lazy { object : TableRowFieldColor("${path}/color") {} }
}

abstract class TableRowFieldTableCellBorder(private val path: String) : FieldsList<TableRowField>(path) {
	val color by lazy { object : TableRowFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableRowField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TableRowFieldDimension("${path}/width") {} }
}

abstract class TableRowFieldBullet(private val path: String) : FieldsList<TableRowField>(path) {
	val listId: FieldsList<TableRowField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<TableRowField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldParagraphElement(private val path: String) : FieldsList<TableRowField>(path) {
	val autoText by lazy { object : TableRowFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : TableRowFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<TableRowField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : TableRowFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : TableRowFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : TableRowFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : TableRowFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : TableRowFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : TableRowFieldPerson("${path}/person") {} }
	val richLink by lazy { object : TableRowFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<TableRowField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : TableRowFieldTextRun("${path}/textRun") {} }
}

abstract class TableRowFieldParagraphStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val alignment: FieldsList<TableRowField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<TableRowField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : TableRowFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : TableRowFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableRowFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableRowFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableRowFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<TableRowField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<TableRowField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : TableRowFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : TableRowFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TableRowFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<TableRowField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<TableRowField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<TableRowField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<TableRowField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<TableRowField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : TableRowFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : TableRowFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : TableRowFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<TableRowField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : TableRowFieldTabStop("${path}/tabStops") {} }
}

abstract class TableRowFieldSuggestedBullet(private val path: String) : FieldsList<TableRowField>(path) {
	val bullet by lazy { object : TableRowFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : TableRowFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class TableRowFieldSuggestedParagraphStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val paragraphStyle by lazy { object : TableRowFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : TableRowFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class TableRowFieldObjectReferences(private val path: String) : FieldsList<TableRowField>(path) {
	val objectIds: FieldsList<TableRowField> get() = fieldsList("${path}/objectIds")
}

abstract class TableRowFieldSectionStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val columnProperties by lazy { object : TableRowFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<TableRowField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<TableRowField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<TableRowField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TableRowField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TableRowField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TableRowField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TableRowField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TableRowField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TableRowField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TableRowFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TableRowFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TableRowFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TableRowFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TableRowFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TableRowFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TableRowField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<TableRowField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<TableRowField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TableRowFieldTableRow(private val path: String) : FieldsList<TableRowField>(path) {
	val endIndex: FieldsList<TableRowField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableRowField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : TableRowFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : TableRowFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : TableRowFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class TableRowFieldTableStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val tableColumnProperties by lazy { object : TableRowFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class TableRowFieldColor(private val path: String) : FieldsList<TableRowField>(path) {
	val rgbColor by lazy { object : TableRowFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableRowFieldTextStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColor by lazy { object : TableRowFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TableRowField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TableRowField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TableRowFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TableRowFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TableRowField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TableRowFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TableRowField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TableRowField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TableRowField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TableRowFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TableRowFieldAutoText(private val path: String) : FieldsList<TableRowField>(path) {
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<TableRowField> get() = fieldsList("${path}/type")
}

abstract class TableRowFieldColumnBreak(private val path: String) : FieldsList<TableRowField>(path) {
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldEquation(private val path: String) : FieldsList<TableRowField>(path) {
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableRowFieldFootnoteReference(private val path: String) : FieldsList<TableRowField>(path) {
	val footnoteId: FieldsList<TableRowField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<TableRowField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldHorizontalRule(private val path: String) : FieldsList<TableRowField>(path) {
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldInlineObjectElement(private val path: String) : FieldsList<TableRowField>(path) {
	val inlineObjectId: FieldsList<TableRowField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldPageBreak(private val path: String) : FieldsList<TableRowField>(path) {
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldPerson(private val path: String) : FieldsList<TableRowField>(path) {
	val personId: FieldsList<TableRowField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : TableRowFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldRichLink(private val path: String) : FieldsList<TableRowField>(path) {
	val richLinkId: FieldsList<TableRowField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : TableRowFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldTextRun(private val path: String) : FieldsList<TableRowField>(path) {
	val content: FieldsList<TableRowField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableRowField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableRowFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableRowFieldParagraphBorder(private val path: String) : FieldsList<TableRowField>(path) {
	val color by lazy { object : TableRowFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableRowField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : TableRowFieldDimension("${path}/padding") {} }
	val width by lazy { object : TableRowFieldDimension("${path}/width") {} }
}

abstract class TableRowFieldShading(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColor by lazy { object : TableRowFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class TableRowFieldTabStop(private val path: String) : FieldsList<TableRowField>(path) {
	val alignment: FieldsList<TableRowField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : TableRowFieldDimension("${path}/offset") {} }
}

abstract class TableRowFieldBulletSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val listIdSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : TableRowFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableRowFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val alignmentSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : TableRowFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class TableRowFieldSectionColumnProperties(private val path: String) : FieldsList<TableRowField>(path) {
	val paddingEnd by lazy { object : TableRowFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : TableRowFieldDimension("${path}/width") {} }
}

abstract class TableRowFieldTableColumnProperties(private val path: String) : FieldsList<TableRowField>(path) {
	val width by lazy { object : TableRowFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TableRowField> get() = fieldsList("${path}/widthType")
}

abstract class TableRowFieldRgbColor(private val path: String) : FieldsList<TableRowField>(path) {
	val blue: FieldsList<TableRowField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableRowField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableRowField> get() = fieldsList("${path}/red")
}

abstract class TableRowFieldLink(private val path: String) : FieldsList<TableRowField>(path) {
	val bookmark by lazy { object : TableRowFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TableRowField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TableRowFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TableRowField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TableRowField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TableRowField> get() = fieldsList("${path}/url")
}

abstract class TableRowFieldWeightedFontFamily(private val path: String) : FieldsList<TableRowField>(path) {
	val fontFamily: FieldsList<TableRowField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TableRowField> get() = fieldsList("${path}/weight")
}

abstract class TableRowFieldSuggestedTextStyle(private val path: String) : FieldsList<TableRowField>(path) {
	val textStyle by lazy { object : TableRowFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TableRowFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableRowFieldPersonProperties(private val path: String) : FieldsList<TableRowField>(path) {
	val email: FieldsList<TableRowField> get() = fieldsList("${path}/email")
	val name: FieldsList<TableRowField> get() = fieldsList("${path}/name")
}

abstract class TableRowFieldRichLinkProperties(private val path: String) : FieldsList<TableRowField>(path) {
	val mimeType: FieldsList<TableRowField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<TableRowField> get() = fieldsList("${path}/title")
	val uri: FieldsList<TableRowField> get() = fieldsList("${path}/uri")
}

abstract class TableRowFieldTextStyleSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColorSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TableRowField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TableRowFieldShadingSuggestionState(private val path: String) : FieldsList<TableRowField>(path) {
	val backgroundColorSuggested: FieldsList<TableRowField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TableRowFieldBookmarkLink(private val path: String) : FieldsList<TableRowField>(path) {
	val id: FieldsList<TableRowField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableRowField> get() = fieldsList("${path}/tabId")
}

abstract class TableRowFieldHeadingLink(private val path: String) : FieldsList<TableRowField>(path) {
	val id: FieldsList<TableRowField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableRowField> get() = fieldsList("${path}/tabId")
}

