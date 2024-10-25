package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PopSettingsField : Field

object PopSettingsFields {
    val ALL: FieldsList<PopSettingsField> = fieldsList("*")
	val accessWindow: FieldsList<PopSettingsField> get() = fieldsList("accessWindow")
	val disposition: FieldsList<PopSettingsField> get() = fieldsList("disposition")
}

