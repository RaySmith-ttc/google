package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableCellField : Field

object TableCellFields {
    val ALL: FieldsList<TableCellField> = fieldsList("*")
	val content = object : TableCellFieldStructuralElement("content") {}
	val endIndex: FieldsList<TableCellField> get() = fieldsList("endIndex")
	val startIndex: FieldsList<TableCellField> get() = fieldsList("startIndex")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTableCellStyleChanges = object : TableCellFieldSuggestedTableCellStyle("suggestedTableCellStyleChanges") {}
	val tableCellStyle = object : TableCellFieldTableCellStyle("tableCellStyle") {}
}

abstract class TableCellFieldStructuralElement(private val path: String) : FieldsList<TableCellField>(path) {
	val endIndex: FieldsList<TableCellField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : TableCellFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : TableCellFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<TableCellField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : TableCellFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : TableCellFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class TableCellFieldSuggestedTableCellStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val tableCellStyle by lazy { object : TableCellFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : TableCellFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class TableCellFieldTableCellStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColor by lazy { object : TableCellFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : TableCellFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableCellFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableCellFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableCellFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<TableCellField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<TableCellField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : TableCellFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : TableCellFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : TableCellFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : TableCellFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<TableCellField> get() = fieldsList("${path}/rowSpan")
}

abstract class TableCellFieldParagraph(private val path: String) : FieldsList<TableCellField>(path) {
	val bullet by lazy { object : TableCellFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : TableCellFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : TableCellFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<TableCellField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : TableCellFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : TableCellFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : TableCellFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class TableCellFieldSectionBreak(private val path: String) : FieldsList<TableCellField>(path) {
	val sectionStyle by lazy { object : TableCellFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableCellFieldTable(private val path: String) : FieldsList<TableCellField>(path) {
	val columns: FieldsList<TableCellField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<TableCellField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : TableCellFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : TableCellFieldTableStyle("${path}/tableStyle") {} }
}

abstract class TableCellFieldTableOfContents(private val path: String) : FieldsList<TableCellField>(path) {
	val content by lazy { object : TableCellFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableCellFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColorSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class TableCellFieldOptionalColor(private val path: String) : FieldsList<TableCellField>(path) {
	val color by lazy { object : TableCellFieldColor("${path}/color") {} }
}

abstract class TableCellFieldTableCellBorder(private val path: String) : FieldsList<TableCellField>(path) {
	val color by lazy { object : TableCellFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableCellField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TableCellFieldDimension("${path}/width") {} }
}

abstract class TableCellFieldDimension(private val path: String) : FieldsList<TableCellField>(path) {
	val magnitude: FieldsList<TableCellField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TableCellField> get() = fieldsList("${path}/unit")
}

abstract class TableCellFieldBullet(private val path: String) : FieldsList<TableCellField>(path) {
	val listId: FieldsList<TableCellField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<TableCellField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldParagraphElement(private val path: String) : FieldsList<TableCellField>(path) {
	val autoText by lazy { object : TableCellFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : TableCellFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<TableCellField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : TableCellFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : TableCellFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : TableCellFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : TableCellFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : TableCellFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : TableCellFieldPerson("${path}/person") {} }
	val richLink by lazy { object : TableCellFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<TableCellField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : TableCellFieldTextRun("${path}/textRun") {} }
}

abstract class TableCellFieldParagraphStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val alignment: FieldsList<TableCellField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<TableCellField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : TableCellFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : TableCellFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TableCellFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TableCellFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TableCellFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<TableCellField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<TableCellField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : TableCellFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : TableCellFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TableCellFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<TableCellField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<TableCellField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<TableCellField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<TableCellField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<TableCellField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : TableCellFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : TableCellFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : TableCellFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<TableCellField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : TableCellFieldTabStop("${path}/tabStops") {} }
}

abstract class TableCellFieldSuggestedBullet(private val path: String) : FieldsList<TableCellField>(path) {
	val bullet by lazy { object : TableCellFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : TableCellFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class TableCellFieldSuggestedParagraphStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val paragraphStyle by lazy { object : TableCellFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : TableCellFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class TableCellFieldObjectReferences(private val path: String) : FieldsList<TableCellField>(path) {
	val objectIds: FieldsList<TableCellField> get() = fieldsList("${path}/objectIds")
}

abstract class TableCellFieldSectionStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val columnProperties by lazy { object : TableCellFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<TableCellField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<TableCellField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<TableCellField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TableCellField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TableCellField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TableCellField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TableCellField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TableCellField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TableCellField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TableCellFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TableCellFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TableCellFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TableCellFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TableCellFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TableCellFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TableCellField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<TableCellField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<TableCellField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TableCellFieldTableRow(private val path: String) : FieldsList<TableCellField>(path) {
	val endIndex: FieldsList<TableCellField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableCellField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : TableCellFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : TableCellFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : TableCellFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class TableCellFieldTableStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val tableColumnProperties by lazy { object : TableCellFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class TableCellFieldColor(private val path: String) : FieldsList<TableCellField>(path) {
	val rgbColor by lazy { object : TableCellFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TableCellFieldTextStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColor by lazy { object : TableCellFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TableCellField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TableCellField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TableCellFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TableCellFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TableCellField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TableCellFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TableCellField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TableCellField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TableCellField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TableCellFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TableCellFieldAutoText(private val path: String) : FieldsList<TableCellField>(path) {
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<TableCellField> get() = fieldsList("${path}/type")
}

abstract class TableCellFieldColumnBreak(private val path: String) : FieldsList<TableCellField>(path) {
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldEquation(private val path: String) : FieldsList<TableCellField>(path) {
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TableCellFieldFootnoteReference(private val path: String) : FieldsList<TableCellField>(path) {
	val footnoteId: FieldsList<TableCellField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<TableCellField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldHorizontalRule(private val path: String) : FieldsList<TableCellField>(path) {
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldInlineObjectElement(private val path: String) : FieldsList<TableCellField>(path) {
	val inlineObjectId: FieldsList<TableCellField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldPageBreak(private val path: String) : FieldsList<TableCellField>(path) {
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldPerson(private val path: String) : FieldsList<TableCellField>(path) {
	val personId: FieldsList<TableCellField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : TableCellFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldRichLink(private val path: String) : FieldsList<TableCellField>(path) {
	val richLinkId: FieldsList<TableCellField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : TableCellFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldTextRun(private val path: String) : FieldsList<TableCellField>(path) {
	val content: FieldsList<TableCellField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TableCellFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
}

abstract class TableCellFieldParagraphBorder(private val path: String) : FieldsList<TableCellField>(path) {
	val color by lazy { object : TableCellFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TableCellField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : TableCellFieldDimension("${path}/padding") {} }
	val width by lazy { object : TableCellFieldDimension("${path}/width") {} }
}

abstract class TableCellFieldShading(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColor by lazy { object : TableCellFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class TableCellFieldTabStop(private val path: String) : FieldsList<TableCellField>(path) {
	val alignment: FieldsList<TableCellField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : TableCellFieldDimension("${path}/offset") {} }
}

abstract class TableCellFieldBulletSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val listIdSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : TableCellFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableCellFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val alignmentSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : TableCellFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class TableCellFieldSectionColumnProperties(private val path: String) : FieldsList<TableCellField>(path) {
	val paddingEnd by lazy { object : TableCellFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : TableCellFieldDimension("${path}/width") {} }
}

abstract class TableCellFieldSuggestedTableRowStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val tableRowStyle by lazy { object : TableCellFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : TableCellFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class TableCellFieldTableCell(private val path: String) : FieldsList<TableCellField>(path) {
	val content by lazy { object : TableCellFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<TableCellField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TableCellField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TableCellField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : TableCellFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : TableCellFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class TableCellFieldTableRowStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val minRowHeight by lazy { object : TableCellFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<TableCellField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<TableCellField> get() = fieldsList("${path}/tableHeader")
}

abstract class TableCellFieldTableColumnProperties(private val path: String) : FieldsList<TableCellField>(path) {
	val width by lazy { object : TableCellFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TableCellField> get() = fieldsList("${path}/widthType")
}

abstract class TableCellFieldRgbColor(private val path: String) : FieldsList<TableCellField>(path) {
	val blue: FieldsList<TableCellField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TableCellField> get() = fieldsList("${path}/green")
	val red: FieldsList<TableCellField> get() = fieldsList("${path}/red")
}

abstract class TableCellFieldLink(private val path: String) : FieldsList<TableCellField>(path) {
	val bookmark by lazy { object : TableCellFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TableCellField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TableCellFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TableCellField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TableCellField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TableCellField> get() = fieldsList("${path}/url")
}

abstract class TableCellFieldWeightedFontFamily(private val path: String) : FieldsList<TableCellField>(path) {
	val fontFamily: FieldsList<TableCellField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TableCellField> get() = fieldsList("${path}/weight")
}

abstract class TableCellFieldSuggestedTextStyle(private val path: String) : FieldsList<TableCellField>(path) {
	val textStyle by lazy { object : TableCellFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TableCellFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TableCellFieldPersonProperties(private val path: String) : FieldsList<TableCellField>(path) {
	val email: FieldsList<TableCellField> get() = fieldsList("${path}/email")
	val name: FieldsList<TableCellField> get() = fieldsList("${path}/name")
}

abstract class TableCellFieldRichLinkProperties(private val path: String) : FieldsList<TableCellField>(path) {
	val mimeType: FieldsList<TableCellField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<TableCellField> get() = fieldsList("${path}/title")
	val uri: FieldsList<TableCellField> get() = fieldsList("${path}/uri")
}

abstract class TableCellFieldTextStyleSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColorSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TableCellField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TableCellFieldShadingSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val backgroundColorSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TableCellFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<TableCellField>(path) {
	val minRowHeightSuggested: FieldsList<TableCellField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class TableCellFieldBookmarkLink(private val path: String) : FieldsList<TableCellField>(path) {
	val id: FieldsList<TableCellField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableCellField> get() = fieldsList("${path}/tabId")
}

abstract class TableCellFieldHeadingLink(private val path: String) : FieldsList<TableCellField>(path) {
	val id: FieldsList<TableCellField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TableCellField> get() = fieldsList("${path}/tabId")
}

