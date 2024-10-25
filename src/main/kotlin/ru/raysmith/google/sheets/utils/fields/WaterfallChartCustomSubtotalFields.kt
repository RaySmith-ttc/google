package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WaterfallChartCustomSubtotalField : Field

object WaterfallChartCustomSubtotalFields {
    val ALL: FieldsList<WaterfallChartCustomSubtotalField> = fieldsList("*")
	val dataIsSubtotal: FieldsList<WaterfallChartCustomSubtotalField> get() = fieldsList("dataIsSubtotal")
	val label: FieldsList<WaterfallChartCustomSubtotalField> get() = fieldsList("label")
	val subtotalIndex: FieldsList<WaterfallChartCustomSubtotalField> get() = fieldsList("subtotalIndex")
}

