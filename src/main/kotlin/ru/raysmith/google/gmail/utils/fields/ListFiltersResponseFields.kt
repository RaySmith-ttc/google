package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListFiltersResponseField : Field

object ListFiltersResponseFields {
    val ALL: FieldsList<ListFiltersResponseField> = fieldsList("*")
	val filter = object : ListFiltersResponseFieldFilter("filter") {}
}

abstract class ListFiltersResponseFieldFilter(private val path: String) : FieldsList<ListFiltersResponseField>(path) {
	val action by lazy { object : ListFiltersResponseFieldFilterAction("${path}/action") {} }
	val criteria by lazy { object : ListFiltersResponseFieldFilterCriteria("${path}/criteria") {} }
	val id: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/id")
}

abstract class ListFiltersResponseFieldFilterAction(private val path: String) : FieldsList<ListFiltersResponseField>(path) {
	val addLabelIds: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/addLabelIds")
	val forward: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/forward")
	val removeLabelIds: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/removeLabelIds")
}

abstract class ListFiltersResponseFieldFilterCriteria(private val path: String) : FieldsList<ListFiltersResponseField>(path) {
	val excludeChats: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/excludeChats")
	val from: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/from")
	val hasAttachment: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/hasAttachment")
	val negatedQuery: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/negatedQuery")
	val query: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/query")
	val size: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/size")
	val sizeComparison: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/sizeComparison")
	val subject: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/subject")
	val to: FieldsList<ListFiltersResponseField> get() = fieldsList("${path}/to")
}

