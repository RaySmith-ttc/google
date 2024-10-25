package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface VacationSettingsField : Field

object VacationSettingsFields {
    val ALL: FieldsList<VacationSettingsField> = fieldsList("*")
	val enableAutoReply: FieldsList<VacationSettingsField> get() = fieldsList("enableAutoReply")
	val endTime: FieldsList<VacationSettingsField> get() = fieldsList("endTime")
	val responseBodyHtml: FieldsList<VacationSettingsField> get() = fieldsList("responseBodyHtml")
	val responseBodyPlainText: FieldsList<VacationSettingsField> get() = fieldsList("responseBodyPlainText")
	val responseSubject: FieldsList<VacationSettingsField> get() = fieldsList("responseSubject")
	val restrictToContacts: FieldsList<VacationSettingsField> get() = fieldsList("restrictToContacts")
	val restrictToDomain: FieldsList<VacationSettingsField> get() = fieldsList("restrictToDomain")
	val startTime: FieldsList<VacationSettingsField> get() = fieldsList("startTime")
}

