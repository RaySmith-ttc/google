package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterField : Field

object FilterFields {
    val ALL: FieldsList<FilterField> = fieldsList("*")
	val action = object : FilterFieldFilterAction("action") {}
	val criteria = object : FilterFieldFilterCriteria("criteria") {}
	val id: FieldsList<FilterField> get() = fieldsList("id")
}

abstract class FilterFieldFilterAction(private val path: String) : FieldsList<FilterField>(path) {
	val addLabelIds: FieldsList<FilterField> get() = fieldsList("${path}/addLabelIds")
	val forward: FieldsList<FilterField> get() = fieldsList("${path}/forward")
	val removeLabelIds: FieldsList<FilterField> get() = fieldsList("${path}/removeLabelIds")
}

abstract class FilterFieldFilterCriteria(private val path: String) : FieldsList<FilterField>(path) {
	val excludeChats: FieldsList<FilterField> get() = fieldsList("${path}/excludeChats")
	val from: FieldsList<FilterField> get() = fieldsList("${path}/from")
	val hasAttachment: FieldsList<FilterField> get() = fieldsList("${path}/hasAttachment")
	val negatedQuery: FieldsList<FilterField> get() = fieldsList("${path}/negatedQuery")
	val query: FieldsList<FilterField> get() = fieldsList("${path}/query")
	val size: FieldsList<FilterField> get() = fieldsList("${path}/size")
	val sizeComparison: FieldsList<FilterField> get() = fieldsList("${path}/sizeComparison")
	val subject: FieldsList<FilterField> get() = fieldsList("${path}/subject")
	val to: FieldsList<FilterField> get() = fieldsList("${path}/to")
}

