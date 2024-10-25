package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ObliterateCseKeyPairRequestField : Field

object ObliterateCseKeyPairRequestFields {
    val ALL: FieldsList<ObliterateCseKeyPairRequestField> = fieldsList("*")
}

