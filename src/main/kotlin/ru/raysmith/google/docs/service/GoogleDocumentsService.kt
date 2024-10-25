package ru.raysmith.google.docs.service

import com.google.api.services.docs.v1.Docs
import com.google.api.services.docs.v1.model.BatchUpdateDocumentRequest
import com.google.api.services.docs.v1.model.BatchUpdateDocumentResponse
import com.google.api.services.docs.v1.model.Document
import ru.raysmith.google.docs.utils.fields.BatchUpdateDocumentResponseField
import ru.raysmith.google.docs.utils.fields.BatchUpdateDocumentResponseFields
import ru.raysmith.google.docs.utils.fields.DocumentField
import ru.raysmith.google.docs.utils.fields.DocumentFields
import ru.raysmith.google.utils.FieldsList

class GoogleDocumentsService(private val service: Docs.Documents) {

    fun get(
		documentId: String,
		fields: FieldsList<DocumentField> = DocumentFields.ALL,
		setup: Docs.Documents.Get.() -> Unit = { }
	): Document = service.get(documentId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun create(
		content: Document,
		fields: FieldsList<DocumentField> = DocumentFields.ALL,
		setup: Docs.Documents.Create.() -> Unit = { }
	): Document = service.create(content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchUpdate(
		documentId: String, content: BatchUpdateDocumentRequest,
		fields: FieldsList<BatchUpdateDocumentResponseField> = BatchUpdateDocumentResponseFields.ALL,
		setup: Docs.Documents.BatchUpdate.() -> Unit = { }
	): BatchUpdateDocumentResponse = service.batchUpdate(documentId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}