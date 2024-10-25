package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterCriteriaField : Field

object FilterCriteriaFields {
    val ALL: FieldsList<FilterCriteriaField> = fieldsList("*")
	val excludeChats: FieldsList<FilterCriteriaField> get() = fieldsList("excludeChats")
	val from: FieldsList<FilterCriteriaField> get() = fieldsList("from")
	val hasAttachment: FieldsList<FilterCriteriaField> get() = fieldsList("hasAttachment")
	val negatedQuery: FieldsList<FilterCriteriaField> get() = fieldsList("negatedQuery")
	val query: FieldsList<FilterCriteriaField> get() = fieldsList("query")
	val size: FieldsList<FilterCriteriaField> get() = fieldsList("size")
	val sizeComparison: FieldsList<FilterCriteriaField> get() = fieldsList("sizeComparison")
	val subject: FieldsList<FilterCriteriaField> get() = fieldsList("subject")
	val to: FieldsList<FilterCriteriaField> get() = fieldsList("to")
}

