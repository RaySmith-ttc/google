package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListForwardingAddressesResponseField : Field

object ListForwardingAddressesResponseFields {
    val ALL: FieldsList<ListForwardingAddressesResponseField> = fieldsList("*")
	val forwardingAddresses = object : ListForwardingAddressesResponseFieldForwardingAddress("forwardingAddresses") {}
}

abstract class ListForwardingAddressesResponseFieldForwardingAddress(private val path: String) : FieldsList<ListForwardingAddressesResponseField>(path) {
	val forwardingEmail: FieldsList<ListForwardingAddressesResponseField> get() = fieldsList("${path}/forwardingEmail")
	val verificationStatus: FieldsList<ListForwardingAddressesResponseField> get() = fieldsList("${path}/verificationStatus")
}

