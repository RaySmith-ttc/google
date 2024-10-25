package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateParagraphBulletsRequestField : Field

object CreateParagraphBulletsRequestFields {
    val ALL: FieldsList<CreateParagraphBulletsRequestField> = fieldsList("*")
	val bulletPreset: FieldsList<CreateParagraphBulletsRequestField> get() = fieldsList("bulletPreset")
	val range = object : CreateParagraphBulletsRequestFieldRange("range") {}
}

abstract class CreateParagraphBulletsRequestFieldRange(private val path: String) : FieldsList<CreateParagraphBulletsRequestField>(path) {
	val endIndex: FieldsList<CreateParagraphBulletsRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<CreateParagraphBulletsRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<CreateParagraphBulletsRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<CreateParagraphBulletsRequestField> get() = fieldsList("${path}/tabId")
}

