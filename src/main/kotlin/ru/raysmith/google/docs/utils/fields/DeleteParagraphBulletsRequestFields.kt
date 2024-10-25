package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteParagraphBulletsRequestField : Field

object DeleteParagraphBulletsRequestFields {
    val ALL: FieldsList<DeleteParagraphBulletsRequestField> = fieldsList("*")
	val range = object : DeleteParagraphBulletsRequestFieldRange("range") {}
}

abstract class DeleteParagraphBulletsRequestFieldRange(private val path: String) : FieldsList<DeleteParagraphBulletsRequestField>(path) {
	val endIndex: FieldsList<DeleteParagraphBulletsRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<DeleteParagraphBulletsRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<DeleteParagraphBulletsRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<DeleteParagraphBulletsRequestField> get() = fieldsList("${path}/tabId")
}

