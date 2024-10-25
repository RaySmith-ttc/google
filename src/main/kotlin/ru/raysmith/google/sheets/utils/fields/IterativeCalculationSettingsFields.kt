package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface IterativeCalculationSettingsField : Field

object IterativeCalculationSettingsFields {
    val ALL: FieldsList<IterativeCalculationSettingsField> = fieldsList("*")
	val convergenceThreshold: FieldsList<IterativeCalculationSettingsField> get() = fieldsList("convergenceThreshold")
	val maxIterations: FieldsList<IterativeCalculationSettingsField> get() = fieldsList("maxIterations")
}

