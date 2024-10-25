package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface OperationField : Field

object OperationFields {
    val ALL: FieldsList<OperationField> = fieldsList("*")
	val done: FieldsList<OperationField> get() = fieldsList("done")
	val error = object : OperationFieldStatus("error") {}
	val metadata: FieldsList<OperationField> get() = fieldsList("metadata")
	val name: FieldsList<OperationField> get() = fieldsList("name")
	val response: FieldsList<OperationField> get() = fieldsList("response")
}

abstract class OperationFieldStatus(private val path: String) : FieldsList<OperationField>(path) {
	val code: FieldsList<OperationField> get() = fieldsList("${path}/code")
	val details: FieldsList<OperationField> get() = fieldsList("${path}/details")
	val message: FieldsList<OperationField> get() = fieldsList("${path}/message")
}

