package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplaceAllTextRequestField : Field

object ReplaceAllTextRequestFields {
    val ALL: FieldsList<ReplaceAllTextRequestField> = fieldsList("*")
	val containsText = object : ReplaceAllTextRequestFieldSubstringMatchCriteria("containsText") {}
	val replaceText: FieldsList<ReplaceAllTextRequestField> get() = fieldsList("replaceText")
	val tabsCriteria = object : ReplaceAllTextRequestFieldTabsCriteria("tabsCriteria") {}
}

abstract class ReplaceAllTextRequestFieldSubstringMatchCriteria(private val path: String) : FieldsList<ReplaceAllTextRequestField>(path) {
	val matchCase: FieldsList<ReplaceAllTextRequestField> get() = fieldsList("${path}/matchCase")
	val text: FieldsList<ReplaceAllTextRequestField> get() = fieldsList("${path}/text")
}

abstract class ReplaceAllTextRequestFieldTabsCriteria(private val path: String) : FieldsList<ReplaceAllTextRequestField>(path) {
	val tabIds: FieldsList<ReplaceAllTextRequestField> get() = fieldsList("${path}/tabIds")
}

