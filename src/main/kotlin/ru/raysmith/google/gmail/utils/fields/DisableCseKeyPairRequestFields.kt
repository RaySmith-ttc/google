package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DisableCseKeyPairRequestField : Field

object DisableCseKeyPairRequestFields {
    val ALL: FieldsList<DisableCseKeyPairRequestField> = fieldsList("*")
}

