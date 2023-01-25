## Basics 1. Hello World 
Demo for:
- top-level (package-level) functions ~ static
- `main()` or `main(args: Array<String>)`
- string templates: `"$variable"`, `"${functionCall(...)}"`
- `Array<String>` - there is no special build-in syntax for arrays
- 'if' is an expression

## Basics 2. Variables
There are two main keywords to define a variable:
- val - a read-only == assigned-once == final in Java.
- var - mutable variable

```kotlin
val mutableList = mutableListOf("str1")
val readOnlyList = listOf("str1")
```

Functional style:
- immutable references
- immutable objects
- functions without side effects

## Basics 3. Functions

```kotlin
// Function with block body:
fun max(a: Int, b:Int): Int {
    return if (a > b) a else b
}
// Functions with expression body:
fun max(a: Int, b: Int): Int = if (a > b) a else b
fun max(a: Int, b: Int) = if (a > b) a else b
```
If omitting return type -> Function returning `Unit` == `void` in Java.

Functions everywhere:
- top-level functions == `static` in Java.
  - either by `ClassNameKt.function()`
  - or by JvmName annotation `@file:JvmName("Util")` -> call as `Util.function()`
- member functions
- local functions

## Basics 4. Named & default arguments
== Overloads in Java.
```kotlin
// prints: (abc)
println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))
```

```kotlin
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}
```
From Java: `@JvmOverloads`.
