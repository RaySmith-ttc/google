package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteFooterRequestField : Field

object DeleteFooterRequestFields {
    val ALL: FieldsList<DeleteFooterRequestField> = fieldsList("*")
	val footerId: FieldsList<DeleteFooterRequestField> get() = fieldsList("footerId")
	val tabId: FieldsList<DeleteFooterRequestField> get() = fieldsList("tabId")
}

