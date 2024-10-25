package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedDrawingPropertiesField : Field

object EmbeddedDrawingPropertiesFields {
    val ALL: FieldsList<EmbeddedDrawingPropertiesField> = fieldsList("*")
}

