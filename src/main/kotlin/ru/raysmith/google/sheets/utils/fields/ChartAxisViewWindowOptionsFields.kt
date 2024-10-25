package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartAxisViewWindowOptionsField : Field

object ChartAxisViewWindowOptionsFields {
    val ALL: FieldsList<ChartAxisViewWindowOptionsField> = fieldsList("*")
	val viewWindowMax: FieldsList<ChartAxisViewWindowOptionsField> get() = fieldsList("viewWindowMax")
	val viewWindowMin: FieldsList<ChartAxisViewWindowOptionsField> get() = fieldsList("viewWindowMin")
	val viewWindowMode: FieldsList<ChartAxisViewWindowOptionsField> get() = fieldsList("viewWindowMode")
}

