package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DocumentTabField : Field

object DocumentTabFields {
    val ALL: FieldsList<DocumentTabField> = fieldsList("*")
	val body = object : DocumentTabFieldBody("body") {}
	val documentStyle = object : DocumentTabFieldDocumentStyle("documentStyle") {}
	val footers = object : DocumentTabFieldFooter("footers") {}
	val footnotes = object : DocumentTabFieldFootnote("footnotes") {}
	val headers = object : DocumentTabFieldHeader("headers") {}
	val inlineObjects = object : DocumentTabFieldInlineObject("inlineObjects") {}
	val lists = object : DocumentTabFieldList("lists") {}
	val namedRanges = object : DocumentTabFieldNamedRanges("namedRanges") {}
	val namedStyles = object : DocumentTabFieldNamedStyles("namedStyles") {}
	val positionedObjects = object : DocumentTabFieldPositionedObject("positionedObjects") {}
	val suggestedDocumentStyleChanges = object : DocumentTabFieldSuggestedDocumentStyle("suggestedDocumentStyleChanges") {}
	val suggestedNamedStylesChanges = object : DocumentTabFieldSuggestedNamedStyles("suggestedNamedStylesChanges") {}
}

abstract class DocumentTabFieldBody(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
}

abstract class DocumentTabFieldDocumentStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val background by lazy { object : DocumentTabFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<DocumentTabField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : DocumentTabFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : DocumentTabFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : DocumentTabFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : DocumentTabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentTabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentTabFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<DocumentTabField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : DocumentTabFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<DocumentTabField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<DocumentTabField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<DocumentTabField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class DocumentTabFieldFooter(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
	val footerId: FieldsList<DocumentTabField> get() = fieldsList("${path}/footerId")
}

abstract class DocumentTabFieldFootnote(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
	val footnoteId: FieldsList<DocumentTabField> get() = fieldsList("${path}/footnoteId")
}

abstract class DocumentTabFieldHeader(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
	val headerId: FieldsList<DocumentTabField> get() = fieldsList("${path}/headerId")
}

abstract class DocumentTabFieldInlineObject(private val path: String) : FieldsList<DocumentTabField>(path) {
	val inlineObjectProperties by lazy { object : DocumentTabFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val objectId: FieldsList<DocumentTabField> get() = fieldsList("${path}/objectId")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInlineObjectPropertiesChanges by lazy { object : DocumentTabFieldSuggestedInlineObjectProperties("${path}/suggestedInlineObjectPropertiesChanges") {} }
	val suggestedInsertionId: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionId")
}

abstract class DocumentTabFieldList(private val path: String) : FieldsList<DocumentTabField>(path) {
	val listProperties by lazy { object : DocumentTabFieldListProperties("${path}/listProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedListPropertiesChanges by lazy { object : DocumentTabFieldSuggestedListProperties("${path}/suggestedListPropertiesChanges") {} }
}

abstract class DocumentTabFieldNamedRanges(private val path: String) : FieldsList<DocumentTabField>(path) {
	val name: FieldsList<DocumentTabField> get() = fieldsList("${path}/name")
	val namedRanges by lazy { object : DocumentTabFieldNamedRange("${path}/namedRanges") {} }
}

abstract class DocumentTabFieldNamedStyles(private val path: String) : FieldsList<DocumentTabField>(path) {
	val styles by lazy { object : DocumentTabFieldNamedStyle("${path}/styles") {} }
}

abstract class DocumentTabFieldPositionedObject(private val path: String) : FieldsList<DocumentTabField>(path) {
	val objectId: FieldsList<DocumentTabField> get() = fieldsList("${path}/objectId")
	val positionedObjectProperties by lazy { object : DocumentTabFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedPositionedObjectPropertiesChanges by lazy { object : DocumentTabFieldSuggestedPositionedObjectProperties("${path}/suggestedPositionedObjectPropertiesChanges") {} }
}

abstract class DocumentTabFieldSuggestedDocumentStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val documentStyle by lazy { object : DocumentTabFieldDocumentStyle("${path}/documentStyle") {} }
	val documentStyleSuggestionState by lazy { object : DocumentTabFieldDocumentStyleSuggestionState("${path}/documentStyleSuggestionState") {} }
}

abstract class DocumentTabFieldSuggestedNamedStyles(private val path: String) : FieldsList<DocumentTabField>(path) {
	val namedStyles by lazy { object : DocumentTabFieldNamedStyles("${path}/namedStyles") {} }
	val namedStylesSuggestionState by lazy { object : DocumentTabFieldNamedStylesSuggestionState("${path}/namedStylesSuggestionState") {} }
}

abstract class DocumentTabFieldStructuralElement(private val path: String) : FieldsList<DocumentTabField>(path) {
	val endIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : DocumentTabFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : DocumentTabFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : DocumentTabFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : DocumentTabFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class DocumentTabFieldBackground(private val path: String) : FieldsList<DocumentTabField>(path) {
	val color by lazy { object : DocumentTabFieldOptionalColor("${path}/color") {} }
}

abstract class DocumentTabFieldDimension(private val path: String) : FieldsList<DocumentTabField>(path) {
	val magnitude: FieldsList<DocumentTabField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<DocumentTabField> get() = fieldsList("${path}/unit")
}

abstract class DocumentTabFieldSize(private val path: String) : FieldsList<DocumentTabField>(path) {
	val height by lazy { object : DocumentTabFieldDimension("${path}/height") {} }
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
}

abstract class DocumentTabFieldInlineObjectProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val embeddedObject by lazy { object : DocumentTabFieldEmbeddedObject("${path}/embeddedObject") {} }
}

abstract class DocumentTabFieldSuggestedInlineObjectProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val inlineObjectProperties by lazy { object : DocumentTabFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val inlineObjectPropertiesSuggestionState by lazy { object : DocumentTabFieldInlineObjectPropertiesSuggestionState("${path}/inlineObjectPropertiesSuggestionState") {} }
}

abstract class DocumentTabFieldListProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val nestingLevels by lazy { object : DocumentTabFieldNestingLevel("${path}/nestingLevels") {} }
}

abstract class DocumentTabFieldSuggestedListProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val listProperties by lazy { object : DocumentTabFieldListProperties("${path}/listProperties") {} }
	val listPropertiesSuggestionState by lazy { object : DocumentTabFieldListPropertiesSuggestionState("${path}/listPropertiesSuggestionState") {} }
}

abstract class DocumentTabFieldNamedRange(private val path: String) : FieldsList<DocumentTabField>(path) {
	val name: FieldsList<DocumentTabField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<DocumentTabField> get() = fieldsList("${path}/namedRangeId")
	val ranges by lazy { object : DocumentTabFieldRange("${path}/ranges") {} }
}

abstract class DocumentTabFieldNamedStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val namedStyleType: FieldsList<DocumentTabField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyle by lazy { object : DocumentTabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldPositionedObjectProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val embeddedObject by lazy { object : DocumentTabFieldEmbeddedObject("${path}/embeddedObject") {} }
	val positioning by lazy { object : DocumentTabFieldPositionedObjectPositioning("${path}/positioning") {} }
}

abstract class DocumentTabFieldSuggestedPositionedObjectProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val positionedObjectProperties by lazy { object : DocumentTabFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val positionedObjectPropertiesSuggestionState by lazy { object : DocumentTabFieldPositionedObjectPropertiesSuggestionState("${path}/positionedObjectPropertiesSuggestionState") {} }
}

abstract class DocumentTabFieldDocumentStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundSuggestionState by lazy { object : DocumentTabFieldBackgroundSuggestionState("${path}/backgroundSuggestionState") {} }
	val defaultFooterIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultFooterIdSuggested")
	val defaultHeaderIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultHeaderIdSuggested")
	val evenPageFooterIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageFooterIdSuggested")
	val evenPageHeaderIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageHeaderIdSuggested")
	val firstPageFooterIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageFooterIdSuggested")
	val firstPageHeaderIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageHeaderIdSuggested")
	val flipPageOrientationSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/flipPageOrientationSuggested")
	val marginBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginFooterSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginFooterSuggested")
	val marginHeaderSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginHeaderSuggested")
	val marginLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginTopSuggested")
	val pageNumberStartSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/pageNumberStartSuggested")
	val pageSizeSuggestionState by lazy { object : DocumentTabFieldSizeSuggestionState("${path}/pageSizeSuggestionState") {} }
	val useCustomHeaderFooterMarginsSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/useCustomHeaderFooterMarginsSuggested")
	val useEvenPageHeaderFooterSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/useEvenPageHeaderFooterSuggested")
	val useFirstPageHeaderFooterSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/useFirstPageHeaderFooterSuggested")
}

abstract class DocumentTabFieldNamedStylesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val stylesSuggestionStates by lazy { object : DocumentTabFieldNamedStyleSuggestionState("${path}/stylesSuggestionStates") {} }
}

abstract class DocumentTabFieldParagraph(private val path: String) : FieldsList<DocumentTabField>(path) {
	val bullet by lazy { object : DocumentTabFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : DocumentTabFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : DocumentTabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : DocumentTabFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : DocumentTabFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : DocumentTabFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class DocumentTabFieldSectionBreak(private val path: String) : FieldsList<DocumentTabField>(path) {
	val sectionStyle by lazy { object : DocumentTabFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentTabFieldTable(private val path: String) : FieldsList<DocumentTabField>(path) {
	val columns: FieldsList<DocumentTabField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<DocumentTabField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : DocumentTabFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : DocumentTabFieldTableStyle("${path}/tableStyle") {} }
}

abstract class DocumentTabFieldTableOfContents(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentTabFieldOptionalColor(private val path: String) : FieldsList<DocumentTabField>(path) {
	val color by lazy { object : DocumentTabFieldColor("${path}/color") {} }
}

abstract class DocumentTabFieldEmbeddedObject(private val path: String) : FieldsList<DocumentTabField>(path) {
	val description: FieldsList<DocumentTabField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<DocumentTabField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : DocumentTabFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : DocumentTabFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : DocumentTabFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : DocumentTabFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : DocumentTabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentTabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentTabFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : DocumentTabFieldSize("${path}/size") {} }
	val title: FieldsList<DocumentTabField> get() = fieldsList("${path}/title")
}

abstract class DocumentTabFieldInlineObjectPropertiesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val embeddedObjectSuggestionState by lazy { object : DocumentTabFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
}

abstract class DocumentTabFieldNestingLevel(private val path: String) : FieldsList<DocumentTabField>(path) {
	val bulletAlignment: FieldsList<DocumentTabField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : DocumentTabFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : DocumentTabFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<DocumentTabField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldListPropertiesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val nestingLevelsSuggestionStates by lazy { object : DocumentTabFieldNestingLevelSuggestionState("${path}/nestingLevelsSuggestionStates") {} }
}

abstract class DocumentTabFieldRange(private val path: String) : FieldsList<DocumentTabField>(path) {
	val endIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<DocumentTabField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<DocumentTabField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentTabFieldParagraphStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val alignment: FieldsList<DocumentTabField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<DocumentTabField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : DocumentTabFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : DocumentTabFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : DocumentTabFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : DocumentTabFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : DocumentTabFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<DocumentTabField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<DocumentTabField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : DocumentTabFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : DocumentTabFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : DocumentTabFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<DocumentTabField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<DocumentTabField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<DocumentTabField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<DocumentTabField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<DocumentTabField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : DocumentTabFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : DocumentTabFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : DocumentTabFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<DocumentTabField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : DocumentTabFieldTabStop("${path}/tabStops") {} }
}

abstract class DocumentTabFieldTextStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColor by lazy { object : DocumentTabFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<DocumentTabField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<DocumentTabField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : DocumentTabFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : DocumentTabFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<DocumentTabField> get() = fieldsList("${path}/italic")
	val link by lazy { object : DocumentTabFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<DocumentTabField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<DocumentTabField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<DocumentTabField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : DocumentTabFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class DocumentTabFieldPositionedObjectPositioning(private val path: String) : FieldsList<DocumentTabField>(path) {
	val layout: FieldsList<DocumentTabField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : DocumentTabFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : DocumentTabFieldDimension("${path}/topOffset") {} }
}

abstract class DocumentTabFieldPositionedObjectPropertiesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val embeddedObjectSuggestionState by lazy { object : DocumentTabFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
	val positioningSuggestionState by lazy { object : DocumentTabFieldPositionedObjectPositioningSuggestionState("${path}/positioningSuggestionState") {} }
}

abstract class DocumentTabFieldBackgroundSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class DocumentTabFieldSizeSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val heightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/widthSuggested")
}

abstract class DocumentTabFieldNamedStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val namedStyleType: FieldsList<DocumentTabField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyleSuggestionState by lazy { object : DocumentTabFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
	val textStyleSuggestionState by lazy { object : DocumentTabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentTabFieldBullet(private val path: String) : FieldsList<DocumentTabField>(path) {
	val listId: FieldsList<DocumentTabField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<DocumentTabField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldParagraphElement(private val path: String) : FieldsList<DocumentTabField>(path) {
	val autoText by lazy { object : DocumentTabFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : DocumentTabFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : DocumentTabFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : DocumentTabFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : DocumentTabFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : DocumentTabFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : DocumentTabFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : DocumentTabFieldPerson("${path}/person") {} }
	val richLink by lazy { object : DocumentTabFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : DocumentTabFieldTextRun("${path}/textRun") {} }
}

abstract class DocumentTabFieldSuggestedBullet(private val path: String) : FieldsList<DocumentTabField>(path) {
	val bullet by lazy { object : DocumentTabFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : DocumentTabFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class DocumentTabFieldSuggestedParagraphStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val paragraphStyle by lazy { object : DocumentTabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : DocumentTabFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class DocumentTabFieldObjectReferences(private val path: String) : FieldsList<DocumentTabField>(path) {
	val objectIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/objectIds")
}

abstract class DocumentTabFieldSectionStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val columnProperties by lazy { object : DocumentTabFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<DocumentTabField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<DocumentTabField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<DocumentTabField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<DocumentTabField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : DocumentTabFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : DocumentTabFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : DocumentTabFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : DocumentTabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentTabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentTabFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<DocumentTabField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<DocumentTabField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<DocumentTabField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class DocumentTabFieldTableRow(private val path: String) : FieldsList<DocumentTabField>(path) {
	val endIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : DocumentTabFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : DocumentTabFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : DocumentTabFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class DocumentTabFieldTableStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val tableColumnProperties by lazy { object : DocumentTabFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class DocumentTabFieldColor(private val path: String) : FieldsList<DocumentTabField>(path) {
	val rgbColor by lazy { object : DocumentTabFieldRgbColor("${path}/rgbColor") {} }
}

abstract class DocumentTabFieldEmbeddedObjectBorder(private val path: String) : FieldsList<DocumentTabField>(path) {
	val color by lazy { object : DocumentTabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentTabField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<DocumentTabField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
}

abstract class DocumentTabFieldImageProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val angle: FieldsList<DocumentTabField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<DocumentTabField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<DocumentTabField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<DocumentTabField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : DocumentTabFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<DocumentTabField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<DocumentTabField> get() = fieldsList("${path}/transparency")
}

abstract class DocumentTabFieldLinkedContentReference(private val path: String) : FieldsList<DocumentTabField>(path) {
	val sheetsChartReference by lazy { object : DocumentTabFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class DocumentTabFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val descriptionSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<DocumentTabField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : DocumentTabFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : DocumentTabFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : DocumentTabFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : DocumentTabFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/titleSuggested")
}

abstract class DocumentTabFieldNestingLevelSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val bulletAlignmentSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : DocumentTabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentTabFieldParagraphBorder(private val path: String) : FieldsList<DocumentTabField>(path) {
	val color by lazy { object : DocumentTabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentTabField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : DocumentTabFieldDimension("${path}/padding") {} }
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
}

abstract class DocumentTabFieldShading(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColor by lazy { object : DocumentTabFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class DocumentTabFieldTabStop(private val path: String) : FieldsList<DocumentTabField>(path) {
	val alignment: FieldsList<DocumentTabField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : DocumentTabFieldDimension("${path}/offset") {} }
}

abstract class DocumentTabFieldLink(private val path: String) : FieldsList<DocumentTabField>(path) {
	val bookmark by lazy { object : DocumentTabFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<DocumentTabField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : DocumentTabFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<DocumentTabField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<DocumentTabField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<DocumentTabField> get() = fieldsList("${path}/url")
}

abstract class DocumentTabFieldWeightedFontFamily(private val path: String) : FieldsList<DocumentTabField>(path) {
	val fontFamily: FieldsList<DocumentTabField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<DocumentTabField> get() = fieldsList("${path}/weight")
}

abstract class DocumentTabFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val layoutSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class DocumentTabFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val alignmentSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : DocumentTabFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class DocumentTabFieldTextStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class DocumentTabFieldAutoText(private val path: String) : FieldsList<DocumentTabField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<DocumentTabField> get() = fieldsList("${path}/type")
}

abstract class DocumentTabFieldColumnBreak(private val path: String) : FieldsList<DocumentTabField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldEquation(private val path: String) : FieldsList<DocumentTabField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentTabFieldFootnoteReference(private val path: String) : FieldsList<DocumentTabField>(path) {
	val footnoteId: FieldsList<DocumentTabField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<DocumentTabField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldHorizontalRule(private val path: String) : FieldsList<DocumentTabField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldInlineObjectElement(private val path: String) : FieldsList<DocumentTabField>(path) {
	val inlineObjectId: FieldsList<DocumentTabField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldPageBreak(private val path: String) : FieldsList<DocumentTabField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldPerson(private val path: String) : FieldsList<DocumentTabField>(path) {
	val personId: FieldsList<DocumentTabField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : DocumentTabFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldRichLink(private val path: String) : FieldsList<DocumentTabField>(path) {
	val richLinkId: FieldsList<DocumentTabField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : DocumentTabFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldTextRun(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content: FieldsList<DocumentTabField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentTabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentTabFieldBulletSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val listIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : DocumentTabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentTabFieldSectionColumnProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val paddingEnd by lazy { object : DocumentTabFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
}

abstract class DocumentTabFieldSuggestedTableRowStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val tableRowStyle by lazy { object : DocumentTabFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : DocumentTabFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class DocumentTabFieldTableCell(private val path: String) : FieldsList<DocumentTabField>(path) {
	val content by lazy { object : DocumentTabFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<DocumentTabField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentTabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : DocumentTabFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : DocumentTabFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class DocumentTabFieldTableRowStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val minRowHeight by lazy { object : DocumentTabFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<DocumentTabField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<DocumentTabField> get() = fieldsList("${path}/tableHeader")
}

abstract class DocumentTabFieldTableColumnProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
	val widthType: FieldsList<DocumentTabField> get() = fieldsList("${path}/widthType")
}

abstract class DocumentTabFieldRgbColor(private val path: String) : FieldsList<DocumentTabField>(path) {
	val blue: FieldsList<DocumentTabField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DocumentTabField> get() = fieldsList("${path}/green")
	val red: FieldsList<DocumentTabField> get() = fieldsList("${path}/red")
}

abstract class DocumentTabFieldCropProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val angle: FieldsList<DocumentTabField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetTop")
}

abstract class DocumentTabFieldSheetsChartReference(private val path: String) : FieldsList<DocumentTabField>(path) {
	val chartId: FieldsList<DocumentTabField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<DocumentTabField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class DocumentTabFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val colorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/widthSuggested")
}

abstract class DocumentTabFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val angleSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : DocumentTabFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class DocumentTabFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : DocumentTabFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class DocumentTabFieldBookmarkLink(private val path: String) : FieldsList<DocumentTabField>(path) {
	val id: FieldsList<DocumentTabField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<DocumentTabField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentTabFieldHeadingLink(private val path: String) : FieldsList<DocumentTabField>(path) {
	val id: FieldsList<DocumentTabField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<DocumentTabField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentTabFieldShadingSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class DocumentTabFieldSuggestedTextStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val textStyle by lazy { object : DocumentTabFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : DocumentTabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentTabFieldPersonProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val email: FieldsList<DocumentTabField> get() = fieldsList("${path}/email")
	val name: FieldsList<DocumentTabField> get() = fieldsList("${path}/name")
}

abstract class DocumentTabFieldRichLinkProperties(private val path: String) : FieldsList<DocumentTabField>(path) {
	val mimeType: FieldsList<DocumentTabField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<DocumentTabField> get() = fieldsList("${path}/title")
	val uri: FieldsList<DocumentTabField> get() = fieldsList("${path}/uri")
}

abstract class DocumentTabFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val minRowHeightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class DocumentTabFieldSuggestedTableCellStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val tableCellStyle by lazy { object : DocumentTabFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : DocumentTabFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class DocumentTabFieldTableCellStyle(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColor by lazy { object : DocumentTabFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : DocumentTabFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : DocumentTabFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : DocumentTabFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : DocumentTabFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<DocumentTabField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<DocumentTabField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : DocumentTabFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : DocumentTabFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : DocumentTabFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : DocumentTabFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<DocumentTabField> get() = fieldsList("${path}/rowSpan")
}

abstract class DocumentTabFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val angleSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class DocumentTabFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val chartIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class DocumentTabFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<DocumentTabField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<DocumentTabField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class DocumentTabFieldTableCellBorder(private val path: String) : FieldsList<DocumentTabField>(path) {
	val color by lazy { object : DocumentTabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentTabField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : DocumentTabFieldDimension("${path}/width") {} }
}

