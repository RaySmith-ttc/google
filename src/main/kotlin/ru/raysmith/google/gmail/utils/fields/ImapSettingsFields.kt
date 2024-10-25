package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ImapSettingsField : Field

object ImapSettingsFields {
    val ALL: FieldsList<ImapSettingsField> = fieldsList("*")
	val autoExpunge: FieldsList<ImapSettingsField> get() = fieldsList("autoExpunge")
	val enabled: FieldsList<ImapSettingsField> get() = fieldsList("enabled")
	val expungeBehavior: FieldsList<ImapSettingsField> get() = fieldsList("expungeBehavior")
	val maxFolderSize: FieldsList<ImapSettingsField> get() = fieldsList("maxFolderSize")
}

