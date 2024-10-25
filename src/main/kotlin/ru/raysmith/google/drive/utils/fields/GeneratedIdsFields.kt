package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GeneratedIdsField : Field

object GeneratedIdsFields {
    val ALL: FieldsList<GeneratedIdsField> = fieldsList("*")
	val ids: FieldsList<GeneratedIdsField> get() = fieldsList("ids")
	val kind: FieldsList<GeneratedIdsField> get() = fieldsList("kind")
	val space: FieldsList<GeneratedIdsField> get() = fieldsList("space")
}

