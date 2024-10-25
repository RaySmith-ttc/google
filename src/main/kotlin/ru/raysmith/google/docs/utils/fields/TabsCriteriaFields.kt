package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TabsCriteriaField : Field

object TabsCriteriaFields {
    val ALL: FieldsList<TabsCriteriaField> = fieldsList("*")
	val tabIds: FieldsList<TabsCriteriaField> get() = fieldsList("tabIds")
}

