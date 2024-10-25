package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FooterField : Field

object FooterFields {
    val ALL: FieldsList<FooterField> = fieldsList("*")
	val content = object : FooterFieldStructuralElement("content") {}
	val footerId: FieldsList<FooterField> get() = fieldsList("footerId")
}

abstract class FooterFieldStructuralElement(private val path: String) : FieldsList<FooterField>(path) {
	val endIndex: FieldsList<FooterField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : FooterFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : FooterFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<FooterField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : FooterFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : FooterFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class FooterFieldParagraph(private val path: String) : FieldsList<FooterField>(path) {
	val bullet by lazy { object : FooterFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : FooterFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : FooterFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<FooterField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : FooterFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : FooterFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : FooterFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class FooterFieldSectionBreak(private val path: String) : FieldsList<FooterField>(path) {
	val sectionStyle by lazy { object : FooterFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FooterFieldTable(private val path: String) : FieldsList<FooterField>(path) {
	val columns: FieldsList<FooterField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<FooterField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : FooterFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : FooterFieldTableStyle("${path}/tableStyle") {} }
}

abstract class FooterFieldTableOfContents(private val path: String) : FieldsList<FooterField>(path) {
	val content by lazy { object : FooterFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FooterFieldBullet(private val path: String) : FieldsList<FooterField>(path) {
	val listId: FieldsList<FooterField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<FooterField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldParagraphElement(private val path: String) : FieldsList<FooterField>(path) {
	val autoText by lazy { object : FooterFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : FooterFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<FooterField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : FooterFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : FooterFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : FooterFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : FooterFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : FooterFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : FooterFieldPerson("${path}/person") {} }
	val richLink by lazy { object : FooterFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<FooterField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : FooterFieldTextRun("${path}/textRun") {} }
}

abstract class FooterFieldParagraphStyle(private val path: String) : FieldsList<FooterField>(path) {
	val alignment: FieldsList<FooterField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<FooterField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : FooterFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : FooterFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : FooterFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : FooterFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : FooterFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<FooterField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<FooterField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : FooterFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : FooterFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : FooterFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<FooterField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<FooterField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<FooterField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<FooterField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<FooterField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : FooterFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : FooterFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : FooterFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<FooterField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : FooterFieldTabStop("${path}/tabStops") {} }
}

abstract class FooterFieldSuggestedBullet(private val path: String) : FieldsList<FooterField>(path) {
	val bullet by lazy { object : FooterFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : FooterFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class FooterFieldSuggestedParagraphStyle(private val path: String) : FieldsList<FooterField>(path) {
	val paragraphStyle by lazy { object : FooterFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : FooterFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class FooterFieldObjectReferences(private val path: String) : FieldsList<FooterField>(path) {
	val objectIds: FieldsList<FooterField> get() = fieldsList("${path}/objectIds")
}

abstract class FooterFieldSectionStyle(private val path: String) : FieldsList<FooterField>(path) {
	val columnProperties by lazy { object : FooterFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<FooterField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<FooterField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<FooterField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<FooterField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<FooterField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<FooterField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<FooterField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<FooterField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<FooterField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : FooterFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : FooterFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : FooterFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : FooterFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : FooterFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : FooterFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<FooterField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<FooterField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<FooterField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class FooterFieldTableRow(private val path: String) : FieldsList<FooterField>(path) {
	val endIndex: FieldsList<FooterField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<FooterField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : FooterFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : FooterFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : FooterFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class FooterFieldTableStyle(private val path: String) : FieldsList<FooterField>(path) {
	val tableColumnProperties by lazy { object : FooterFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class FooterFieldTextStyle(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColor by lazy { object : FooterFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<FooterField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<FooterField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : FooterFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : FooterFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<FooterField> get() = fieldsList("${path}/italic")
	val link by lazy { object : FooterFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<FooterField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<FooterField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<FooterField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : FooterFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class FooterFieldAutoText(private val path: String) : FieldsList<FooterField>(path) {
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<FooterField> get() = fieldsList("${path}/type")
}

abstract class FooterFieldColumnBreak(private val path: String) : FieldsList<FooterField>(path) {
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldEquation(private val path: String) : FieldsList<FooterField>(path) {
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class FooterFieldFootnoteReference(private val path: String) : FieldsList<FooterField>(path) {
	val footnoteId: FieldsList<FooterField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<FooterField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldHorizontalRule(private val path: String) : FieldsList<FooterField>(path) {
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldInlineObjectElement(private val path: String) : FieldsList<FooterField>(path) {
	val inlineObjectId: FieldsList<FooterField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldPageBreak(private val path: String) : FieldsList<FooterField>(path) {
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldPerson(private val path: String) : FieldsList<FooterField>(path) {
	val personId: FieldsList<FooterField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : FooterFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldRichLink(private val path: String) : FieldsList<FooterField>(path) {
	val richLinkId: FieldsList<FooterField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : FooterFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldTextRun(private val path: String) : FieldsList<FooterField>(path) {
	val content: FieldsList<FooterField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : FooterFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
}

abstract class FooterFieldParagraphBorder(private val path: String) : FieldsList<FooterField>(path) {
	val color by lazy { object : FooterFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<FooterField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : FooterFieldDimension("${path}/padding") {} }
	val width by lazy { object : FooterFieldDimension("${path}/width") {} }
}

abstract class FooterFieldDimension(private val path: String) : FieldsList<FooterField>(path) {
	val magnitude: FieldsList<FooterField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<FooterField> get() = fieldsList("${path}/unit")
}

abstract class FooterFieldShading(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColor by lazy { object : FooterFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class FooterFieldTabStop(private val path: String) : FieldsList<FooterField>(path) {
	val alignment: FieldsList<FooterField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : FooterFieldDimension("${path}/offset") {} }
}

abstract class FooterFieldBulletSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val listIdSuggested: FieldsList<FooterField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<FooterField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : FooterFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class FooterFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val alignmentSuggested: FieldsList<FooterField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<FooterField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<FooterField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<FooterField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<FooterField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<FooterField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<FooterField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<FooterField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<FooterField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<FooterField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<FooterField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<FooterField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : FooterFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<FooterField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<FooterField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<FooterField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class FooterFieldSectionColumnProperties(private val path: String) : FieldsList<FooterField>(path) {
	val paddingEnd by lazy { object : FooterFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : FooterFieldDimension("${path}/width") {} }
}

abstract class FooterFieldSuggestedTableRowStyle(private val path: String) : FieldsList<FooterField>(path) {
	val tableRowStyle by lazy { object : FooterFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : FooterFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class FooterFieldTableCell(private val path: String) : FieldsList<FooterField>(path) {
	val content by lazy { object : FooterFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<FooterField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<FooterField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<FooterField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : FooterFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : FooterFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class FooterFieldTableRowStyle(private val path: String) : FieldsList<FooterField>(path) {
	val minRowHeight by lazy { object : FooterFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<FooterField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<FooterField> get() = fieldsList("${path}/tableHeader")
}

abstract class FooterFieldTableColumnProperties(private val path: String) : FieldsList<FooterField>(path) {
	val width by lazy { object : FooterFieldDimension("${path}/width") {} }
	val widthType: FieldsList<FooterField> get() = fieldsList("${path}/widthType")
}

abstract class FooterFieldOptionalColor(private val path: String) : FieldsList<FooterField>(path) {
	val color by lazy { object : FooterFieldColor("${path}/color") {} }
}

abstract class FooterFieldLink(private val path: String) : FieldsList<FooterField>(path) {
	val bookmark by lazy { object : FooterFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<FooterField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : FooterFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<FooterField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<FooterField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<FooterField> get() = fieldsList("${path}/url")
}

abstract class FooterFieldWeightedFontFamily(private val path: String) : FieldsList<FooterField>(path) {
	val fontFamily: FieldsList<FooterField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<FooterField> get() = fieldsList("${path}/weight")
}

abstract class FooterFieldSuggestedTextStyle(private val path: String) : FieldsList<FooterField>(path) {
	val textStyle by lazy { object : FooterFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : FooterFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class FooterFieldPersonProperties(private val path: String) : FieldsList<FooterField>(path) {
	val email: FieldsList<FooterField> get() = fieldsList("${path}/email")
	val name: FieldsList<FooterField> get() = fieldsList("${path}/name")
}

abstract class FooterFieldRichLinkProperties(private val path: String) : FieldsList<FooterField>(path) {
	val mimeType: FieldsList<FooterField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<FooterField> get() = fieldsList("${path}/title")
	val uri: FieldsList<FooterField> get() = fieldsList("${path}/uri")
}

abstract class FooterFieldTextStyleSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColorSuggested: FieldsList<FooterField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<FooterField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<FooterField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<FooterField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<FooterField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<FooterField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<FooterField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<FooterField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<FooterField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<FooterField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<FooterField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class FooterFieldShadingSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColorSuggested: FieldsList<FooterField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class FooterFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val minRowHeightSuggested: FieldsList<FooterField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class FooterFieldSuggestedTableCellStyle(private val path: String) : FieldsList<FooterField>(path) {
	val tableCellStyle by lazy { object : FooterFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : FooterFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class FooterFieldTableCellStyle(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColor by lazy { object : FooterFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : FooterFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : FooterFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : FooterFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : FooterFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<FooterField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<FooterField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : FooterFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : FooterFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : FooterFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : FooterFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<FooterField> get() = fieldsList("${path}/rowSpan")
}

abstract class FooterFieldColor(private val path: String) : FieldsList<FooterField>(path) {
	val rgbColor by lazy { object : FooterFieldRgbColor("${path}/rgbColor") {} }
}

abstract class FooterFieldBookmarkLink(private val path: String) : FieldsList<FooterField>(path) {
	val id: FieldsList<FooterField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FooterField> get() = fieldsList("${path}/tabId")
}

abstract class FooterFieldHeadingLink(private val path: String) : FieldsList<FooterField>(path) {
	val id: FieldsList<FooterField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<FooterField> get() = fieldsList("${path}/tabId")
}

abstract class FooterFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<FooterField>(path) {
	val backgroundColorSuggested: FieldsList<FooterField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<FooterField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<FooterField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<FooterField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<FooterField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<FooterField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<FooterField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<FooterField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<FooterField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class FooterFieldTableCellBorder(private val path: String) : FieldsList<FooterField>(path) {
	val color by lazy { object : FooterFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<FooterField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : FooterFieldDimension("${path}/width") {} }
}

abstract class FooterFieldRgbColor(private val path: String) : FieldsList<FooterField>(path) {
	val blue: FieldsList<FooterField> get() = fieldsList("${path}/blue")
	val green: FieldsList<FooterField> get() = fieldsList("${path}/green")
	val red: FieldsList<FooterField> get() = fieldsList("${path}/red")
}

