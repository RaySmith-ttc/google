package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ResponseField : Field

object ResponseFields {
    val ALL: FieldsList<ResponseField> = fieldsList("*")
	val createFooter = object : ResponseFieldCreateFooterResponse("createFooter") {}
	val createFootnote = object : ResponseFieldCreateFootnoteResponse("createFootnote") {}
	val createHeader = object : ResponseFieldCreateHeaderResponse("createHeader") {}
	val createNamedRange = object : ResponseFieldCreateNamedRangeResponse("createNamedRange") {}
	val insertInlineImage = object : ResponseFieldInsertInlineImageResponse("insertInlineImage") {}
	val insertInlineSheetsChart = object : ResponseFieldInsertInlineSheetsChartResponse("insertInlineSheetsChart") {}
	val replaceAllText = object : ResponseFieldReplaceAllTextResponse("replaceAllText") {}
}

abstract class ResponseFieldCreateFooterResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val footerId: FieldsList<ResponseField> get() = fieldsList("${path}/footerId")
}

abstract class ResponseFieldCreateFootnoteResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val footnoteId: FieldsList<ResponseField> get() = fieldsList("${path}/footnoteId")
}

abstract class ResponseFieldCreateHeaderResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val headerId: FieldsList<ResponseField> get() = fieldsList("${path}/headerId")
}

abstract class ResponseFieldCreateNamedRangeResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val namedRangeId: FieldsList<ResponseField> get() = fieldsList("${path}/namedRangeId")
}

abstract class ResponseFieldInsertInlineImageResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val objectId: FieldsList<ResponseField> get() = fieldsList("${path}/objectId")
}

abstract class ResponseFieldInsertInlineSheetsChartResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val objectId: FieldsList<ResponseField> get() = fieldsList("${path}/objectId")
}

abstract class ResponseFieldReplaceAllTextResponse(private val path: String) : FieldsList<ResponseField>(path) {
	val occurrencesChanged: FieldsList<ResponseField> get() = fieldsList("${path}/occurrencesChanged")
}

