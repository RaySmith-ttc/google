package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateDocumentResponseField : Field

object BatchUpdateDocumentResponseFields {
    val ALL: FieldsList<BatchUpdateDocumentResponseField> = fieldsList("*")
	val documentId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("documentId")
	val replies = object : BatchUpdateDocumentResponseFieldResponse("replies") {}
	val writeControl = object : BatchUpdateDocumentResponseFieldWriteControl("writeControl") {}
}

abstract class BatchUpdateDocumentResponseFieldResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val createFooter by lazy { object : BatchUpdateDocumentResponseFieldCreateFooterResponse("${path}/createFooter") {} }
	val createFootnote by lazy { object : BatchUpdateDocumentResponseFieldCreateFootnoteResponse("${path}/createFootnote") {} }
	val createHeader by lazy { object : BatchUpdateDocumentResponseFieldCreateHeaderResponse("${path}/createHeader") {} }
	val createNamedRange by lazy { object : BatchUpdateDocumentResponseFieldCreateNamedRangeResponse("${path}/createNamedRange") {} }
	val insertInlineImage by lazy { object : BatchUpdateDocumentResponseFieldInsertInlineImageResponse("${path}/insertInlineImage") {} }
	val insertInlineSheetsChart by lazy { object : BatchUpdateDocumentResponseFieldInsertInlineSheetsChartResponse("${path}/insertInlineSheetsChart") {} }
	val replaceAllText by lazy { object : BatchUpdateDocumentResponseFieldReplaceAllTextResponse("${path}/replaceAllText") {} }
}

abstract class BatchUpdateDocumentResponseFieldWriteControl(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val requiredRevisionId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/requiredRevisionId")
	val targetRevisionId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/targetRevisionId")
}

abstract class BatchUpdateDocumentResponseFieldCreateFooterResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val footerId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/footerId")
}

abstract class BatchUpdateDocumentResponseFieldCreateFootnoteResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val footnoteId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/footnoteId")
}

abstract class BatchUpdateDocumentResponseFieldCreateHeaderResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val headerId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/headerId")
}

abstract class BatchUpdateDocumentResponseFieldCreateNamedRangeResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val namedRangeId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/namedRangeId")
}

abstract class BatchUpdateDocumentResponseFieldInsertInlineImageResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val objectId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/objectId")
}

abstract class BatchUpdateDocumentResponseFieldInsertInlineSheetsChartResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val objectId: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/objectId")
}

abstract class BatchUpdateDocumentResponseFieldReplaceAllTextResponse(private val path: String) : FieldsList<BatchUpdateDocumentResponseField>(path) {
	val occurrencesChanged: FieldsList<BatchUpdateDocumentResponseField> get() = fieldsList("${path}/occurrencesChanged")
}

