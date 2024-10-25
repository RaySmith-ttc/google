package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelModificationField : Field

object LabelModificationFields {
    val ALL: FieldsList<LabelModificationField> = fieldsList("*")
	val fieldModifications = object : LabelModificationFieldLabelFieldModification("fieldModifications") {}
	val kind: FieldsList<LabelModificationField> get() = fieldsList("kind")
	val labelId: FieldsList<LabelModificationField> get() = fieldsList("labelId")
	val removeLabel: FieldsList<LabelModificationField> get() = fieldsList("removeLabel")
}

abstract class LabelModificationFieldLabelFieldModification(private val path: String) : FieldsList<LabelModificationField>(path) {
	val fieldId: FieldsList<LabelModificationField> get() = fieldsList("${path}/fieldId")
	val kind: FieldsList<LabelModificationField> get() = fieldsList("${path}/kind")
	val setDateValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/setDateValues")
	val setIntegerValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/setIntegerValues")
	val setSelectionValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/setSelectionValues")
	val setTextValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/setTextValues")
	val setUserValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/setUserValues")
	val unsetValues: FieldsList<LabelModificationField> get() = fieldsList("${path}/unsetValues")
}

