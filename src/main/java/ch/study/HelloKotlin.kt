package ch.study

/**
 * Demo for:
 * - top-level (package-level) function, without an argument list (unlike Java).
 * - and string templates: $variable, ${functionCall(...)}
 */
fun main() {
    val name = "Kotlin"
    println("Hello, $name!")
}

/**
 * Demo for:
 * - top-level (package-level) function, with an argument list,
 * - no special build-in syntax for arrays.
 * - 'if' is an expression
 */
fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${args.getOrNull(0)}")
    println("Hello, ${max(10, 12)}")
    println("Hello, ${displaySeparator(size = 5)}")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}
