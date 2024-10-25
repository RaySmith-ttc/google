package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelFieldModificationField : Field

object LabelFieldModificationFields {
    val ALL: FieldsList<LabelFieldModificationField> = fieldsList("*")
	val fieldId: FieldsList<LabelFieldModificationField> get() = fieldsList("fieldId")
	val kind: FieldsList<LabelFieldModificationField> get() = fieldsList("kind")
	val setDateValues: FieldsList<LabelFieldModificationField> get() = fieldsList("setDateValues")
	val setIntegerValues: FieldsList<LabelFieldModificationField> get() = fieldsList("setIntegerValues")
	val setSelectionValues: FieldsList<LabelFieldModificationField> get() = fieldsList("setSelectionValues")
	val setTextValues: FieldsList<LabelFieldModificationField> get() = fieldsList("setTextValues")
	val setUserValues: FieldsList<LabelFieldModificationField> get() = fieldsList("setUserValues")
	val unsetValues: FieldsList<LabelFieldModificationField> get() = fieldsList("unsetValues")
}

