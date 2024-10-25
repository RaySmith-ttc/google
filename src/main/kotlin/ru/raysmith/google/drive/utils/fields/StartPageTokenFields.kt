package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface StartPageTokenField : Field

object StartPageTokenFields {
    val ALL: FieldsList<StartPageTokenField> = fieldsList("*")
	val kind: FieldsList<StartPageTokenField> get() = fieldsList("kind")
	val startPageToken: FieldsList<StartPageTokenField> get() = fieldsList("startPageToken")
}

