package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LanguageSettingsField : Field

object LanguageSettingsFields {
    val ALL: FieldsList<LanguageSettingsField> = fieldsList("*")
	val displayLanguage: FieldsList<LanguageSettingsField> get() = fieldsList("displayLanguage")
}

