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
}
