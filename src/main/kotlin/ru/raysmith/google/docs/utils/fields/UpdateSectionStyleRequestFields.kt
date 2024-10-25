package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateSectionStyleRequestField : Field

object UpdateSectionStyleRequestFields {
    val ALL: FieldsList<UpdateSectionStyleRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("fields")
	val range = object : UpdateSectionStyleRequestFieldRange("range") {}
	val sectionStyle = object : UpdateSectionStyleRequestFieldSectionStyle("sectionStyle") {}
}

abstract class UpdateSectionStyleRequestFieldRange(private val path: String) : FieldsList<UpdateSectionStyleRequestField>(path) {
	val endIndex: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateSectionStyleRequestFieldSectionStyle(private val path: String) : FieldsList<UpdateSectionStyleRequestField>(path) {
	val columnProperties by lazy { object : UpdateSectionStyleRequestFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class UpdateSectionStyleRequestFieldSectionColumnProperties(private val path: String) : FieldsList<UpdateSectionStyleRequestField>(path) {
	val paddingEnd by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : UpdateSectionStyleRequestFieldDimension("${path}/width") {} }
}

abstract class UpdateSectionStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateSectionStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateSectionStyleRequestField> get() = fieldsList("${path}/unit")
}

