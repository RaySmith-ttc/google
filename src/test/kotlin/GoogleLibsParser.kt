import com.google.common.reflect.ClassPath
import kotlin.test.Test


class GoogleLibsParser {

    @Test
    fun sheets() {
        ClassPath.from(ClassLoader.getSystemClassLoader())
            .getTopLevelClassesRecursive("com.google.api.services.sheets.v4.model")
            .sortedBy { it.simpleName }
            .forEach {
                println("fun ${it.simpleName.replaceFirstChar { it.lowercase() }}(setup: ${it.simpleName}.() -> Unit) = ${it.simpleName}().apply(setup)")
            }
    }

    @Test
    fun drive() {
        ClassPath.from(ClassLoader.getSystemClassLoader())
            .getTopLevelClassesRecursive("com.google.api.services.drive.model")
            .sortedBy { it.simpleName }
            .forEach {
                println("fun ${it.simpleName.replaceFirstChar { it.lowercase() }}(setup: ${it.simpleName}.() -> Unit) = ${it.simpleName}().apply(setup)")
            }
    }
}