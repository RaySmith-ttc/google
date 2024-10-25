package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SetBasicFilterRequestField : Field

object SetBasicFilterRequestFields {
    val ALL: FieldsList<SetBasicFilterRequestField> = fieldsList("*")
	val filter = object : SetBasicFilterRequestFieldBasicFilter("filter") {}
}

abstract class SetBasicFilterRequestFieldBasicFilter(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val criteria by lazy { object : SetBasicFilterRequestFieldFilterCriteria("${path}/criteria") {} }
	val filterSpecs by lazy { object : SetBasicFilterRequestFieldFilterSpec("${path}/filterSpecs") {} }
	val range by lazy { object : SetBasicFilterRequestFieldGridRange("${path}/range") {} }
	val sortSpecs by lazy { object : SetBasicFilterRequestFieldSortSpec("${path}/sortSpecs") {} }
}

abstract class SetBasicFilterRequestFieldFilterCriteria(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val condition by lazy { object : SetBasicFilterRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : SetBasicFilterRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : SetBasicFilterRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : SetBasicFilterRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : SetBasicFilterRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class SetBasicFilterRequestFieldFilterSpec(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val columnIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : SetBasicFilterRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : SetBasicFilterRequestFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class SetBasicFilterRequestFieldGridRange(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val endColumnIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SetBasicFilterRequestFieldSortSpec(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val backgroundColor by lazy { object : SetBasicFilterRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SetBasicFilterRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : SetBasicFilterRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : SetBasicFilterRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SetBasicFilterRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/sortOrder")
}

abstract class SetBasicFilterRequestFieldBooleanCondition(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val type: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : SetBasicFilterRequestFieldConditionValue("${path}/values") {} }
}

abstract class SetBasicFilterRequestFieldColor(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val alpha: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/red")
}

abstract class SetBasicFilterRequestFieldColorStyle(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val rgbColor by lazy { object : SetBasicFilterRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class SetBasicFilterRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val name: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/name")
}

abstract class SetBasicFilterRequestFieldConditionValue(private val path: String) : FieldsList<SetBasicFilterRequestField>(path) {
	val relativeDate: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SetBasicFilterRequestField> get() = fieldsList("${path}/userEnteredValue")
}

