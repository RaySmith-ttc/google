package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableField : Field

object TableFields {
    val ALL: FieldsList<TableField> = fieldsList("*")
	val columns: FieldsList<TableField> get() = fieldsList("columns")
	val rows: FieldsList<TableField> get() = fieldsList("rows")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("suggestedInsertionIds")
	val tableRows = object : TableFieldTableRow("tableRows") {}
	val tableStyle = object : TableFieldTableStyle("tableStyle") {}
}

abstract class TableFieldTableRow(private val path: String) : FieldsList<TableField>(path) {
	val endIndex: FieldsList<TableField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : TableFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : TableFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : TableFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class TableFieldTableStyle(private val path: String) : FieldsList<TableField>(path) {
	val tableColumnProperties by lazy { object : TableFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class TableFieldSuggestedTableRowStyle(private val path: String) : FieldsList<TableField>(path) {
	val tableRowStyle by lazy { object : TableFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : TableFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class TableFieldTableCell(private val path: String) : FieldsList<TableField>(path) {
	val content by lazy { object : TableFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<TableField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : TableFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : TableFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class TableFieldTableRowStyle(private val path: String) : FieldsList<TableField>(path) {
	val minRowHeight by lazy { object : TableFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<TableField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<TableField> get() = fieldsList("${path}/tableHeader")
}

abstract class TableFieldTableColumnProperties(private val path: String) : FieldsList<TableField>(path) {
	val width by lazy { object : TableFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TableField> get() = fieldsList("${path}/widthType")
}

abstract class TableFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val minRowHeightSuggested: FieldsList<TableField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class TableFieldStructuralElement(private val path: String) : FieldsList<TableField>(path) {
	val endIndex: FieldsList<TableField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : TableFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : TableFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<TableField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : TableFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : TableFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class TableFieldSuggestedTableCellStyle(private val path: String) : FieldsList<TableField>(path) {
	val tableCellStyle by lazy { object : TableFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : TableFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class TableFieldTableCellStyle(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColor by lazy { object : TableFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : TableFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<TableField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<TableField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : TableFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : TableFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : TableFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : TableFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<TableField> get() = fieldsList("${path}/rowSpan")
}

abstract class TableFieldDimension(private val path: String) : FieldsList<TableField>(path) {
	val magnitude: FieldsList<TableField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableField> get() = fieldsList("${path}/unit")
}

abstract class TableFieldParagraph(private val path: String) : FieldsList<TableField>(path) {
	val bullet by lazy { object : TableFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : TableFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : TableFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<TableField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : TableFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : TableFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : TableFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class TableFieldSectionBreak(private val path: String) : FieldsList<TableField>(path) {
	val sectionStyle by lazy { object : TableFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableFieldTable(private val path: String) : FieldsList<TableField>(path) {
	val columns: FieldsList<TableField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<TableField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : TableFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : TableFieldTableStyle("${path}/tableStyle") {} }
}

abstract class TableFieldTableOfContents(private val path: String) : FieldsList<TableField>(path) {
	val content by lazy { object : TableFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColorSuggested: FieldsList<TableField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<TableField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TableField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TableField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TableField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TableField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TableField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TableField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class TableFieldOptionalColor(private val path: String) : FieldsList<TableField>(path) {
	val color by lazy { object : TableFieldColor("${path}/color") {} }
}

abstract class TableFieldTableCellBorder(private val path: String) : FieldsList<TableField>(path) {
	val color by lazy { object : TableFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TableFieldDimension("${path}/width") {} }
}

abstract class TableFieldBullet(private val path: String) : FieldsList<TableField>(path) {
	val listId: FieldsList<TableField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<TableField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldParagraphElement(private val path: String) : FieldsList<TableField>(path) {
	val autoText by lazy { object : TableFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : TableFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<TableField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : TableFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : TableFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : TableFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : TableFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : TableFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : TableFieldPerson("${path}/person") {} }
	val richLink by lazy { object : TableFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<TableField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : TableFieldTextRun("${path}/textRun") {} }
}

abstract class TableFieldParagraphStyle(private val path: String) : FieldsList<TableField>(path) {
	val alignment: FieldsList<TableField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<TableField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : TableFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : TableFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<TableField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<TableField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : TableFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : TableFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TableFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<TableField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<TableField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<TableField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<TableField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<TableField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : TableFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : TableFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : TableFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<TableField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : TableFieldTabStop("${path}/tabStops") {} }
}

abstract class TableFieldSuggestedBullet(private val path: String) : FieldsList<TableField>(path) {
	val bullet by lazy { object : TableFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : TableFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class TableFieldSuggestedParagraphStyle(private val path: String) : FieldsList<TableField>(path) {
	val paragraphStyle by lazy { object : TableFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : TableFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class TableFieldObjectReferences(private val path: String) : FieldsList<TableField>(path) {
	val objectIds: FieldsList<TableField> get() = fieldsList("${path}/objectIds")
}

abstract class TableFieldSectionStyle(private val path: String) : FieldsList<TableField>(path) {
	val columnProperties by lazy { object : TableFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<TableField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<TableField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<TableField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TableField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TableField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TableField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TableField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TableField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TableField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TableFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TableFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TableFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TableFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TableFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TableFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TableField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<TableField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<TableField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TableFieldColor(private val path: String) : FieldsList<TableField>(path) {
	val rgbColor by lazy { object : TableFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableFieldTextStyle(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColor by lazy { object : TableFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TableField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TableField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TableFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TableFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TableField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TableFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TableField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TableField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TableField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TableFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TableFieldAutoText(private val path: String) : FieldsList<TableField>(path) {
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<TableField> get() = fieldsList("${path}/type")
}

abstract class TableFieldColumnBreak(private val path: String) : FieldsList<TableField>(path) {
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldEquation(private val path: String) : FieldsList<TableField>(path) {
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableFieldFootnoteReference(private val path: String) : FieldsList<TableField>(path) {
	val footnoteId: FieldsList<TableField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<TableField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldHorizontalRule(private val path: String) : FieldsList<TableField>(path) {
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldInlineObjectElement(private val path: String) : FieldsList<TableField>(path) {
	val inlineObjectId: FieldsList<TableField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldPageBreak(private val path: String) : FieldsList<TableField>(path) {
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldPerson(private val path: String) : FieldsList<TableField>(path) {
	val personId: FieldsList<TableField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : TableFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldRichLink(private val path: String) : FieldsList<TableField>(path) {
	val richLinkId: FieldsList<TableField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : TableFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldTextRun(private val path: String) : FieldsList<TableField>(path) {
	val content: FieldsList<TableField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableFieldParagraphBorder(private val path: String) : FieldsList<TableField>(path) {
	val color by lazy { object : TableFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : TableFieldDimension("${path}/padding") {} }
	val width by lazy { object : TableFieldDimension("${path}/width") {} }
}

abstract class TableFieldShading(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColor by lazy { object : TableFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class TableFieldTabStop(private val path: String) : FieldsList<TableField>(path) {
	val alignment: FieldsList<TableField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : TableFieldDimension("${path}/offset") {} }
}

abstract class TableFieldBulletSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val listIdSuggested: FieldsList<TableField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<TableField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : TableFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val alignmentSuggested: FieldsList<TableField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<TableField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<TableField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<TableField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<TableField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<TableField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TableField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<TableField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<TableField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<TableField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<TableField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<TableField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : TableFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<TableField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<TableField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<TableField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class TableFieldSectionColumnProperties(private val path: String) : FieldsList<TableField>(path) {
	val paddingEnd by lazy { object : TableFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : TableFieldDimension("${path}/width") {} }
}

abstract class TableFieldRgbColor(private val path: String) : FieldsList<TableField>(path) {
	val blue: FieldsList<TableField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableField> get() = fieldsList("${path}/red")
}

abstract class TableFieldLink(private val path: String) : FieldsList<TableField>(path) {
	val bookmark by lazy { object : TableFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TableField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TableFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TableField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TableField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TableField> get() = fieldsList("${path}/url")
}

abstract class TableFieldWeightedFontFamily(private val path: String) : FieldsList<TableField>(path) {
	val fontFamily: FieldsList<TableField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TableField> get() = fieldsList("${path}/weight")
}

abstract class TableFieldSuggestedTextStyle(private val path: String) : FieldsList<TableField>(path) {
	val textStyle by lazy { object : TableFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TableFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableFieldPersonProperties(private val path: String) : FieldsList<TableField>(path) {
	val email: FieldsList<TableField> get() = fieldsList("${path}/email")
	val name: FieldsList<TableField> get() = fieldsList("${path}/name")
}

abstract class TableFieldRichLinkProperties(private val path: String) : FieldsList<TableField>(path) {
	val mimeType: FieldsList<TableField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<TableField> get() = fieldsList("${path}/title")
	val uri: FieldsList<TableField> get() = fieldsList("${path}/uri")
}

abstract class TableFieldTextStyleSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColorSuggested: FieldsList<TableField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TableField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TableField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TableField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TableField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TableField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TableField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TableField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TableField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TableField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TableField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TableFieldShadingSuggestionState(private val path: String) : FieldsList<TableField>(path) {
	val backgroundColorSuggested: FieldsList<TableField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TableFieldBookmarkLink(private val path: String) : FieldsList<TableField>(path) {
	val id: FieldsList<TableField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableField> get() = fieldsList("${path}/tabId")
}

abstract class TableFieldHeadingLink(private val path: String) : FieldsList<TableField>(path) {
	val id: FieldsList<TableField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableField> get() = fieldsList("${path}/tabId")
}

