package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TabField : Field

object TabFields {
    val ALL: FieldsList<TabField> = fieldsList("*")
	val childTabs = object : TabFieldTab("childTabs") {}
	val documentTab = object : TabFieldDocumentTab("documentTab") {}
	val tabProperties = object : TabFieldTabProperties("tabProperties") {}
}

abstract class TabFieldTab(private val path: String) : FieldsList<TabField>(path) {
	val childTabs by lazy { object : TabFieldTab("${path}/childTabs") {} }
	val documentTab by lazy { object : TabFieldDocumentTab("${path}/documentTab") {} }
	val tabProperties by lazy { object : TabFieldTabProperties("${path}/tabProperties") {} }
}

abstract class TabFieldDocumentTab(private val path: String) : FieldsList<TabField>(path) {
	val body by lazy { object : TabFieldBody("${path}/body") {} }
	val documentStyle by lazy { object : TabFieldDocumentStyle("${path}/documentStyle") {} }
	val footers by lazy { object : TabFieldFooter("${path}/footers") {} }
	val footnotes by lazy { object : TabFieldFootnote("${path}/footnotes") {} }
	val headers by lazy { object : TabFieldHeader("${path}/headers") {} }
	val inlineObjects by lazy { object : TabFieldInlineObject("${path}/inlineObjects") {} }
	val lists by lazy { object : TabFieldList("${path}/lists") {} }
	val namedRanges by lazy { object : TabFieldNamedRanges("${path}/namedRanges") {} }
	val namedStyles by lazy { object : TabFieldNamedStyles("${path}/namedStyles") {} }
	val positionedObjects by lazy { object : TabFieldPositionedObject("${path}/positionedObjects") {} }
	val suggestedDocumentStyleChanges by lazy { object : TabFieldSuggestedDocumentStyle("${path}/suggestedDocumentStyleChanges") {} }
	val suggestedNamedStylesChanges by lazy { object : TabFieldSuggestedNamedStyles("${path}/suggestedNamedStylesChanges") {} }
}

abstract class TabFieldTabProperties(private val path: String) : FieldsList<TabField>(path) {
	val index: FieldsList<TabField> get() = fieldsList("${path}/index")
	val nestingLevel: FieldsList<TabField> get() = fieldsList("${path}/nestingLevel")
	val parentTabId: FieldsList<TabField> get() = fieldsList("${path}/parentTabId")
	val tabId: FieldsList<TabField> get() = fieldsList("${path}/tabId")
	val title: FieldsList<TabField> get() = fieldsList("${path}/title")
}

abstract class TabFieldBody(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
}

abstract class TabFieldDocumentStyle(private val path: String) : FieldsList<TabField>(path) {
	val background by lazy { object : TabFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<TabField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TabField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TabField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TabField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TabField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TabField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TabField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TabFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TabFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TabFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TabFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TabField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : TabFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<TabField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<TabField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<TabField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TabFieldFooter(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
	val footerId: FieldsList<TabField> get() = fieldsList("${path}/footerId")
}

abstract class TabFieldFootnote(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
	val footnoteId: FieldsList<TabField> get() = fieldsList("${path}/footnoteId")
}

abstract class TabFieldHeader(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
	val headerId: FieldsList<TabField> get() = fieldsList("${path}/headerId")
}

abstract class TabFieldInlineObject(private val path: String) : FieldsList<TabField>(path) {
	val inlineObjectProperties by lazy { object : TabFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val objectId: FieldsList<TabField> get() = fieldsList("${path}/objectId")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInlineObjectPropertiesChanges by lazy { object : TabFieldSuggestedInlineObjectProperties("${path}/suggestedInlineObjectPropertiesChanges") {} }
	val suggestedInsertionId: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionId")
}

abstract class TabFieldList(private val path: String) : FieldsList<TabField>(path) {
	val listProperties by lazy { object : TabFieldListProperties("${path}/listProperties") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedListPropertiesChanges by lazy { object : TabFieldSuggestedListProperties("${path}/suggestedListPropertiesChanges") {} }
}

abstract class TabFieldNamedRanges(private val path: String) : FieldsList<TabField>(path) {
	val name: FieldsList<TabField> get() = fieldsList("${path}/name")
	val namedRanges by lazy { object : TabFieldNamedRange("${path}/namedRanges") {} }
}

abstract class TabFieldNamedStyles(private val path: String) : FieldsList<TabField>(path) {
	val styles by lazy { object : TabFieldNamedStyle("${path}/styles") {} }
}

abstract class TabFieldPositionedObject(private val path: String) : FieldsList<TabField>(path) {
	val objectId: FieldsList<TabField> get() = fieldsList("${path}/objectId")
	val positionedObjectProperties by lazy { object : TabFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedPositionedObjectPropertiesChanges by lazy { object : TabFieldSuggestedPositionedObjectProperties("${path}/suggestedPositionedObjectPropertiesChanges") {} }
}

abstract class TabFieldSuggestedDocumentStyle(private val path: String) : FieldsList<TabField>(path) {
	val documentStyle by lazy { object : TabFieldDocumentStyle("${path}/documentStyle") {} }
	val documentStyleSuggestionState by lazy { object : TabFieldDocumentStyleSuggestionState("${path}/documentStyleSuggestionState") {} }
}

abstract class TabFieldSuggestedNamedStyles(private val path: String) : FieldsList<TabField>(path) {
	val namedStyles by lazy { object : TabFieldNamedStyles("${path}/namedStyles") {} }
	val namedStylesSuggestionState by lazy { object : TabFieldNamedStylesSuggestionState("${path}/namedStylesSuggestionState") {} }
}

abstract class TabFieldStructuralElement(private val path: String) : FieldsList<TabField>(path) {
	val endIndex: FieldsList<TabField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : TabFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : TabFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<TabField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : TabFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : TabFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class TabFieldBackground(private val path: String) : FieldsList<TabField>(path) {
	val color by lazy { object : TabFieldOptionalColor("${path}/color") {} }
}

abstract class TabFieldDimension(private val path: String) : FieldsList<TabField>(path) {
	val magnitude: FieldsList<TabField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TabField> get() = fieldsList("${path}/unit")
}

abstract class TabFieldSize(private val path: String) : FieldsList<TabField>(path) {
	val height by lazy { object : TabFieldDimension("${path}/height") {} }
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
}

abstract class TabFieldInlineObjectProperties(private val path: String) : FieldsList<TabField>(path) {
	val embeddedObject by lazy { object : TabFieldEmbeddedObject("${path}/embeddedObject") {} }
}

abstract class TabFieldSuggestedInlineObjectProperties(private val path: String) : FieldsList<TabField>(path) {
	val inlineObjectProperties by lazy { object : TabFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val inlineObjectPropertiesSuggestionState by lazy { object : TabFieldInlineObjectPropertiesSuggestionState("${path}/inlineObjectPropertiesSuggestionState") {} }
}

abstract class TabFieldListProperties(private val path: String) : FieldsList<TabField>(path) {
	val nestingLevels by lazy { object : TabFieldNestingLevel("${path}/nestingLevels") {} }
}

abstract class TabFieldSuggestedListProperties(private val path: String) : FieldsList<TabField>(path) {
	val listProperties by lazy { object : TabFieldListProperties("${path}/listProperties") {} }
	val listPropertiesSuggestionState by lazy { object : TabFieldListPropertiesSuggestionState("${path}/listPropertiesSuggestionState") {} }
}

abstract class TabFieldNamedRange(private val path: String) : FieldsList<TabField>(path) {
	val name: FieldsList<TabField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<TabField> get() = fieldsList("${path}/namedRangeId")
	val ranges by lazy { object : TabFieldRange("${path}/ranges") {} }
}

abstract class TabFieldNamedStyle(private val path: String) : FieldsList<TabField>(path) {
	val namedStyleType: FieldsList<TabField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyle by lazy { object : TabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldPositionedObjectProperties(private val path: String) : FieldsList<TabField>(path) {
	val embeddedObject by lazy { object : TabFieldEmbeddedObject("${path}/embeddedObject") {} }
	val positioning by lazy { object : TabFieldPositionedObjectPositioning("${path}/positioning") {} }
}

abstract class TabFieldSuggestedPositionedObjectProperties(private val path: String) : FieldsList<TabField>(path) {
	val positionedObjectProperties by lazy { object : TabFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val positionedObjectPropertiesSuggestionState by lazy { object : TabFieldPositionedObjectPropertiesSuggestionState("${path}/positionedObjectPropertiesSuggestionState") {} }
}

abstract class TabFieldDocumentStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val backgroundSuggestionState by lazy { object : TabFieldBackgroundSuggestionState("${path}/backgroundSuggestionState") {} }
	val defaultFooterIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/defaultFooterIdSuggested")
	val defaultHeaderIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/defaultHeaderIdSuggested")
	val evenPageFooterIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/evenPageFooterIdSuggested")
	val evenPageHeaderIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/evenPageHeaderIdSuggested")
	val firstPageFooterIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/firstPageFooterIdSuggested")
	val firstPageHeaderIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/firstPageHeaderIdSuggested")
	val flipPageOrientationSuggested: FieldsList<TabField> get() = fieldsList("${path}/flipPageOrientationSuggested")
	val marginBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginFooterSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginFooterSuggested")
	val marginHeaderSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginHeaderSuggested")
	val marginLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginTopSuggested")
	val pageNumberStartSuggested: FieldsList<TabField> get() = fieldsList("${path}/pageNumberStartSuggested")
	val pageSizeSuggestionState by lazy { object : TabFieldSizeSuggestionState("${path}/pageSizeSuggestionState") {} }
	val useCustomHeaderFooterMarginsSuggested: FieldsList<TabField> get() = fieldsList("${path}/useCustomHeaderFooterMarginsSuggested")
	val useEvenPageHeaderFooterSuggested: FieldsList<TabField> get() = fieldsList("${path}/useEvenPageHeaderFooterSuggested")
	val useFirstPageHeaderFooterSuggested: FieldsList<TabField> get() = fieldsList("${path}/useFirstPageHeaderFooterSuggested")
}

abstract class TabFieldNamedStylesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val stylesSuggestionStates by lazy { object : TabFieldNamedStyleSuggestionState("${path}/stylesSuggestionStates") {} }
}

abstract class TabFieldParagraph(private val path: String) : FieldsList<TabField>(path) {
	val bullet by lazy { object : TabFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : TabFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : TabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<TabField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : TabFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : TabFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : TabFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class TabFieldSectionBreak(private val path: String) : FieldsList<TabField>(path) {
	val sectionStyle by lazy { object : TabFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TabFieldTable(private val path: String) : FieldsList<TabField>(path) {
	val columns: FieldsList<TabField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<TabField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : TabFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : TabFieldTableStyle("${path}/tableStyle") {} }
}

abstract class TabFieldTableOfContents(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TabFieldOptionalColor(private val path: String) : FieldsList<TabField>(path) {
	val color by lazy { object : TabFieldColor("${path}/color") {} }
}

abstract class TabFieldEmbeddedObject(private val path: String) : FieldsList<TabField>(path) {
	val description: FieldsList<TabField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<TabField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : TabFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : TabFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : TabFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : TabFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : TabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TabFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : TabFieldSize("${path}/size") {} }
	val title: FieldsList<TabField> get() = fieldsList("${path}/title")
}

abstract class TabFieldInlineObjectPropertiesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val embeddedObjectSuggestionState by lazy { object : TabFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
}

abstract class TabFieldNestingLevel(private val path: String) : FieldsList<TabField>(path) {
	val bulletAlignment: FieldsList<TabField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<TabField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<TabField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<TabField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : TabFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TabFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<TabField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldListPropertiesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val nestingLevelsSuggestionStates by lazy { object : TabFieldNestingLevelSuggestionState("${path}/nestingLevelsSuggestionStates") {} }
}

abstract class TabFieldRange(private val path: String) : FieldsList<TabField>(path) {
	val endIndex: FieldsList<TabField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<TabField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<TabField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<TabField> get() = fieldsList("${path}/tabId")
}

abstract class TabFieldParagraphStyle(private val path: String) : FieldsList<TabField>(path) {
	val alignment: FieldsList<TabField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<TabField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : TabFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : TabFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TabFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TabFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TabFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<TabField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<TabField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : TabFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : TabFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : TabFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<TabField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<TabField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<TabField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<TabField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<TabField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : TabFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : TabFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : TabFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<TabField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : TabFieldTabStop("${path}/tabStops") {} }
}

abstract class TabFieldTextStyle(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColor by lazy { object : TabFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TabField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TabField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TabFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TabFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TabField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TabFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TabField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TabField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TabField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TabFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TabFieldPositionedObjectPositioning(private val path: String) : FieldsList<TabField>(path) {
	val layout: FieldsList<TabField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : TabFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : TabFieldDimension("${path}/topOffset") {} }
}

abstract class TabFieldPositionedObjectPropertiesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val embeddedObjectSuggestionState by lazy { object : TabFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
	val positioningSuggestionState by lazy { object : TabFieldPositionedObjectPositioningSuggestionState("${path}/positioningSuggestionState") {} }
}

abstract class TabFieldBackgroundSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColorSuggested: FieldsList<TabField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TabFieldSizeSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val heightSuggested: FieldsList<TabField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<TabField> get() = fieldsList("${path}/widthSuggested")
}

abstract class TabFieldNamedStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val namedStyleType: FieldsList<TabField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyleSuggestionState by lazy { object : TabFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
	val textStyleSuggestionState by lazy { object : TabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TabFieldBullet(private val path: String) : FieldsList<TabField>(path) {
	val listId: FieldsList<TabField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<TabField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldParagraphElement(private val path: String) : FieldsList<TabField>(path) {
	val autoText by lazy { object : TabFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : TabFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<TabField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : TabFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : TabFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : TabFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : TabFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : TabFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : TabFieldPerson("${path}/person") {} }
	val richLink by lazy { object : TabFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<TabField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : TabFieldTextRun("${path}/textRun") {} }
}

abstract class TabFieldSuggestedBullet(private val path: String) : FieldsList<TabField>(path) {
	val bullet by lazy { object : TabFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : TabFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class TabFieldSuggestedParagraphStyle(private val path: String) : FieldsList<TabField>(path) {
	val paragraphStyle by lazy { object : TabFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : TabFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class TabFieldObjectReferences(private val path: String) : FieldsList<TabField>(path) {
	val objectIds: FieldsList<TabField> get() = fieldsList("${path}/objectIds")
}

abstract class TabFieldSectionStyle(private val path: String) : FieldsList<TabField>(path) {
	val columnProperties by lazy { object : TabFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<TabField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<TabField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<TabField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<TabField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<TabField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<TabField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<TabField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<TabField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<TabField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : TabFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : TabFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : TabFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : TabFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : TabFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : TabFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<TabField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<TabField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<TabField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class TabFieldTableRow(private val path: String) : FieldsList<TabField>(path) {
	val endIndex: FieldsList<TabField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TabField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : TabFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : TabFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : TabFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class TabFieldTableStyle(private val path: String) : FieldsList<TabField>(path) {
	val tableColumnProperties by lazy { object : TabFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class TabFieldColor(private val path: String) : FieldsList<TabField>(path) {
	val rgbColor by lazy { object : TabFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TabFieldEmbeddedObjectBorder(private val path: String) : FieldsList<TabField>(path) {
	val color by lazy { object : TabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TabField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<TabField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
}

abstract class TabFieldImageProperties(private val path: String) : FieldsList<TabField>(path) {
	val angle: FieldsList<TabField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<TabField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<TabField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<TabField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : TabFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<TabField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<TabField> get() = fieldsList("${path}/transparency")
}

abstract class TabFieldLinkedContentReference(private val path: String) : FieldsList<TabField>(path) {
	val sheetsChartReference by lazy { object : TabFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class TabFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val descriptionSuggested: FieldsList<TabField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<TabField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : TabFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : TabFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : TabFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : TabFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<TabField> get() = fieldsList("${path}/titleSuggested")
}

abstract class TabFieldNestingLevelSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val bulletAlignmentSuggested: FieldsList<TabField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<TabField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<TabField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<TabField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<TabField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TabField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<TabField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : TabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TabFieldParagraphBorder(private val path: String) : FieldsList<TabField>(path) {
	val color by lazy { object : TabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TabField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : TabFieldDimension("${path}/padding") {} }
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
}

abstract class TabFieldShading(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColor by lazy { object : TabFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class TabFieldTabStop(private val path: String) : FieldsList<TabField>(path) {
	val alignment: FieldsList<TabField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : TabFieldDimension("${path}/offset") {} }
}

abstract class TabFieldLink(private val path: String) : FieldsList<TabField>(path) {
	val bookmark by lazy { object : TabFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TabField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TabFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TabField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TabField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TabField> get() = fieldsList("${path}/url")
}

abstract class TabFieldWeightedFontFamily(private val path: String) : FieldsList<TabField>(path) {
	val fontFamily: FieldsList<TabField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TabField> get() = fieldsList("${path}/weight")
}

abstract class TabFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val layoutSuggested: FieldsList<TabField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<TabField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<TabField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class TabFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val alignmentSuggested: FieldsList<TabField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<TabField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<TabField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<TabField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<TabField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<TabField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<TabField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<TabField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<TabField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<TabField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<TabField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : TabFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<TabField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<TabField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<TabField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class TabFieldTextStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColorSuggested: FieldsList<TabField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TabField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TabField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TabField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TabField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TabField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TabField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TabField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TabField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TabField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TabField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TabFieldAutoText(private val path: String) : FieldsList<TabField>(path) {
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<TabField> get() = fieldsList("${path}/type")
}

abstract class TabFieldColumnBreak(private val path: String) : FieldsList<TabField>(path) {
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldEquation(private val path: String) : FieldsList<TabField>(path) {
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class TabFieldFootnoteReference(private val path: String) : FieldsList<TabField>(path) {
	val footnoteId: FieldsList<TabField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<TabField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldHorizontalRule(private val path: String) : FieldsList<TabField>(path) {
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldInlineObjectElement(private val path: String) : FieldsList<TabField>(path) {
	val inlineObjectId: FieldsList<TabField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldPageBreak(private val path: String) : FieldsList<TabField>(path) {
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldPerson(private val path: String) : FieldsList<TabField>(path) {
	val personId: FieldsList<TabField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : TabFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldRichLink(private val path: String) : FieldsList<TabField>(path) {
	val richLinkId: FieldsList<TabField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : TabFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldTextRun(private val path: String) : FieldsList<TabField>(path) {
	val content: FieldsList<TabField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : TabFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
}

abstract class TabFieldBulletSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val listIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<TabField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : TabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TabFieldSectionColumnProperties(private val path: String) : FieldsList<TabField>(path) {
	val paddingEnd by lazy { object : TabFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
}

abstract class TabFieldSuggestedTableRowStyle(private val path: String) : FieldsList<TabField>(path) {
	val tableRowStyle by lazy { object : TabFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : TabFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class TabFieldTableCell(private val path: String) : FieldsList<TabField>(path) {
	val content by lazy { object : TabFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<TabField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<TabField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TabField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : TabFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : TabFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class TabFieldTableRowStyle(private val path: String) : FieldsList<TabField>(path) {
	val minRowHeight by lazy { object : TabFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<TabField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<TabField> get() = fieldsList("${path}/tableHeader")
}

abstract class TabFieldTableColumnProperties(private val path: String) : FieldsList<TabField>(path) {
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
	val widthType: FieldsList<TabField> get() = fieldsList("${path}/widthType")
}

abstract class TabFieldRgbColor(private val path: String) : FieldsList<TabField>(path) {
	val blue: FieldsList<TabField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TabField> get() = fieldsList("${path}/green")
	val red: FieldsList<TabField> get() = fieldsList("${path}/red")
}

abstract class TabFieldCropProperties(private val path: String) : FieldsList<TabField>(path) {
	val angle: FieldsList<TabField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<TabField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<TabField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<TabField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<TabField> get() = fieldsList("${path}/offsetTop")
}

abstract class TabFieldSheetsChartReference(private val path: String) : FieldsList<TabField>(path) {
	val chartId: FieldsList<TabField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<TabField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class TabFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val colorSuggested: FieldsList<TabField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<TabField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<TabField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<TabField> get() = fieldsList("${path}/widthSuggested")
}

abstract class TabFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val angleSuggested: FieldsList<TabField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<TabField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<TabField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<TabField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : TabFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<TabField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<TabField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class TabFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : TabFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class TabFieldBookmarkLink(private val path: String) : FieldsList<TabField>(path) {
	val id: FieldsList<TabField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TabField> get() = fieldsList("${path}/tabId")
}

abstract class TabFieldHeadingLink(private val path: String) : FieldsList<TabField>(path) {
	val id: FieldsList<TabField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TabField> get() = fieldsList("${path}/tabId")
}

abstract class TabFieldShadingSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColorSuggested: FieldsList<TabField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class TabFieldSuggestedTextStyle(private val path: String) : FieldsList<TabField>(path) {
	val textStyle by lazy { object : TabFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TabFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TabFieldPersonProperties(private val path: String) : FieldsList<TabField>(path) {
	val email: FieldsList<TabField> get() = fieldsList("${path}/email")
	val name: FieldsList<TabField> get() = fieldsList("${path}/name")
}

abstract class TabFieldRichLinkProperties(private val path: String) : FieldsList<TabField>(path) {
	val mimeType: FieldsList<TabField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<TabField> get() = fieldsList("${path}/title")
	val uri: FieldsList<TabField> get() = fieldsList("${path}/uri")
}

abstract class TabFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val minRowHeightSuggested: FieldsList<TabField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class TabFieldSuggestedTableCellStyle(private val path: String) : FieldsList<TabField>(path) {
	val tableCellStyle by lazy { object : TabFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : TabFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class TabFieldTableCellStyle(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColor by lazy { object : TabFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : TabFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : TabFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : TabFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : TabFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<TabField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<TabField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : TabFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : TabFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : TabFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : TabFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<TabField> get() = fieldsList("${path}/rowSpan")
}

abstract class TabFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val angleSuggested: FieldsList<TabField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class TabFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val chartIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<TabField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class TabFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<TabField>(path) {
	val backgroundColorSuggested: FieldsList<TabField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<TabField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<TabField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<TabField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<TabField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<TabField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<TabField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<TabField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class TabFieldTableCellBorder(private val path: String) : FieldsList<TabField>(path) {
	val color by lazy { object : TabFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<TabField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : TabFieldDimension("${path}/width") {} }
}

