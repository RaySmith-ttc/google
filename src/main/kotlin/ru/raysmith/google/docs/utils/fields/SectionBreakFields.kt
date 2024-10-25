package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SectionBreakField : Field

object SectionBreakFields {
    val ALL: FieldsList<SectionBreakField> = fieldsList("*")
	val sectionStyle = object : SectionBreakFieldSectionStyle("sectionStyle") {}
	val suggestedDeletionIds: FieldsList<SectionBreakField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<SectionBreakField> get() = fieldsList("suggestedInsertionIds")
}

abstract class SectionBreakFieldSectionStyle(private val path: String) : FieldsList<SectionBreakField>(path) {
	val columnProperties by lazy { object : SectionBreakFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<SectionBreakField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<SectionBreakField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<SectionBreakField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<SectionBreakField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<SectionBreakField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<SectionBreakField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<SectionBreakField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<SectionBreakField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<SectionBreakField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : SectionBreakFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : SectionBreakFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : SectionBreakFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : SectionBreakFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : SectionBreakFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : SectionBreakFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<SectionBreakField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<SectionBreakField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<SectionBreakField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class SectionBreakFieldSectionColumnProperties(private val path: String) : FieldsList<SectionBreakField>(path) {
	val paddingEnd by lazy { object : SectionBreakFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : SectionBreakFieldDimension("${path}/width") {} }
}

abstract class SectionBreakFieldDimension(private val path: String) : FieldsList<SectionBreakField>(path) {
	val magnitude: FieldsList<SectionBreakField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SectionBreakField> get() = fieldsList("${path}/unit")
}

