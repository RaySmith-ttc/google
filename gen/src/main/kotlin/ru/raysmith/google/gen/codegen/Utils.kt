package ru.raysmith.google.gen.codegen

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import com.google.common.reflect.ClassPath
import com.thoughtworks.paranamer.BytecodeReadingParanamer
import org.intellij.lang.annotations.Language
import kotlin.reflect.KClass

// TODO parse enums from docs

val BASE_URL = "https://developers.google.com/"

fun kotlin(@Language("kotlin") str: String) = str

public inline fun <T> Iterable<T>.containsTwoOrMore(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return false

    var find = false


    for (element in this) {
        if (predicate(element)) {
            if (find) return true
            else find = true
        }
    }
    return false
}

fun collectModels(`package`: String) = ClassPath.from(ClassLoader.getSystemClassLoader())
    .getTopLevelClassesRecursive(`package`)
    .sortedBy { it.simpleName }

val paranamer = BytecodeReadingParanamer()

val <T : AbstractGoogleJsonClient> T.modelPackageName get() = this::class.java.packageName + ".model"
val <T : AbstractGoogleJsonClient> KClass<T>.modelPackageName get() = java.packageName + ".model"