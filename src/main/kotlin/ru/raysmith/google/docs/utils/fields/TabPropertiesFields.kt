package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TabPropertiesField : Field

object TabPropertiesFields {
    val ALL: FieldsList<TabPropertiesField> = fieldsList("*")
	val index: FieldsList<TabPropertiesField> get() = fieldsList("index")
	val nestingLevel: FieldsList<TabPropertiesField> get() = fieldsList("nestingLevel")
	val parentTabId: FieldsList<TabPropertiesField> get() = fieldsList("parentTabId")
	val tabId: FieldsList<TabPropertiesField> get() = fieldsList("tabId")
	val title: FieldsList<TabPropertiesField> get() = fieldsList("title")
}

