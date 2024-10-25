package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ModifyLabelsRequestField : Field

object ModifyLabelsRequestFields {
    val ALL: FieldsList<ModifyLabelsRequestField> = fieldsList("*")
	val kind: FieldsList<ModifyLabelsRequestField> get() = fieldsList("kind")
	val labelModifications = object : ModifyLabelsRequestFieldLabelModification("labelModifications") {}
}

abstract class ModifyLabelsRequestFieldLabelModification(private val path: String) : FieldsList<ModifyLabelsRequestField>(path) {
	val fieldModifications by lazy { object : ModifyLabelsRequestFieldLabelFieldModification("${path}/fieldModifications") {} }
	val kind: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/kind")
	val labelId: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/labelId")
	val removeLabel: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/removeLabel")
}

abstract class ModifyLabelsRequestFieldLabelFieldModification(private val path: String) : FieldsList<ModifyLabelsRequestField>(path) {
	val fieldId: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/fieldId")
	val kind: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/kind")
	val setDateValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/setDateValues")
	val setIntegerValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/setIntegerValues")
	val setSelectionValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/setSelectionValues")
	val setTextValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/setTextValues")
	val setUserValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/setUserValues")
	val unsetValues: FieldsList<ModifyLabelsRequestField> get() = fieldsList("${path}/unsetValues")
}

