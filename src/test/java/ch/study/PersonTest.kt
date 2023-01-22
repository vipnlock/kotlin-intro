package ch.study

import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun getName() {
        val person = Person("Alice", 27)
        println(person.name)
    }
}