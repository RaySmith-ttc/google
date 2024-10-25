package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListOperationsResponseField : Field

object ListOperationsResponseFields {
    val ALL: FieldsList<ListOperationsResponseField> = fieldsList("*")
	val nextPageToken: FieldsList<ListOperationsResponseField> get() = fieldsList("nextPageToken")
	val operations = object : ListOperationsResponseFieldOperation("operations") {}
}

abstract class ListOperationsResponseFieldOperation(private val path: String) : FieldsList<ListOperationsResponseField>(path) {
	val done: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/done")
	val error by lazy { object : ListOperationsResponseFieldStatus("${path}/error") {} }
	val metadata: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/metadata")
	val name: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/name")
	val response: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/response")
}

abstract class ListOperationsResponseFieldStatus(private val path: String) : FieldsList<ListOperationsResponseField>(path) {
	val code: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/code")
	val details: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/details")
	val message: FieldsList<ListOperationsResponseField> get() = fieldsList("${path}/message")
}

