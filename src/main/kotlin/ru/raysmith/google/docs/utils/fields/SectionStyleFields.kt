package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SectionStyleField : Field

object SectionStyleFields {
    val ALL: FieldsList<SectionStyleField> = fieldsList("*")
	val columnProperties = object : SectionStyleFieldSectionColumnProperties("columnProperties") {}
	val columnSeparatorStyle: FieldsList<SectionStyleField> get() = fieldsList("columnSeparatorStyle")
	val contentDirection: FieldsList<SectionStyleField> get() = fieldsList("contentDirection")
	val defaultFooterId: FieldsList<SectionStyleField> get() = fieldsList("defaultFooterId")
	val defaultHeaderId: FieldsList<SectionStyleField> get() = fieldsList("defaultHeaderId")
	val evenPageFooterId: FieldsList<SectionStyleField> get() = fieldsList("evenPageFooterId")
	val evenPageHeaderId: FieldsList<SectionStyleField> get() = fieldsList("evenPageHeaderId")
	val firstPageFooterId: FieldsList<SectionStyleField> get() = fieldsList("firstPageFooterId")
	val firstPageHeaderId: FieldsList<SectionStyleField> get() = fieldsList("firstPageHeaderId")
	val flipPageOrientation: FieldsList<SectionStyleField> get() = fieldsList("flipPageOrientation")
	val marginBottom = object : SectionStyleFieldDimension("marginBottom") {}
	val marginFooter = object : SectionStyleFieldDimension("marginFooter") {}
	val marginHeader = object : SectionStyleFieldDimension("marginHeader") {}
	val marginLeft = object : SectionStyleFieldDimension("marginLeft") {}
	val marginRight = object : SectionStyleFieldDimension("marginRight") {}
	val marginTop = object : SectionStyleFieldDimension("marginTop") {}
	val pageNumberStart: FieldsList<SectionStyleField> get() = fieldsList("pageNumberStart")
	val sectionType: FieldsList<SectionStyleField> get() = fieldsList("sectionType")
	val useFirstPageHeaderFooter: FieldsList<SectionStyleField> get() = fieldsList("useFirstPageHeaderFooter")
}

abstract class SectionStyleFieldSectionColumnProperties(private val path: String) : FieldsList<SectionStyleField>(path) {
	val paddingEnd by lazy { object : SectionStyleFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : SectionStyleFieldDimension("${path}/width") {} }
}

abstract class SectionStyleFieldDimension(private val path: String) : FieldsList<SectionStyleField>(path) {
	val magnitude: FieldsList<SectionStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SectionStyleField> get() = fieldsList("${path}/unit")
}

