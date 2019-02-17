package example_1_hello

import kotlin.test.assertEquals
import org.junit.Test as test

class TestCases {
    @test
    fun whoIsOldestRetuensOldest() {
        assertEquals("Bob", findOldest(listOf(
            Person("Alice"),
            Person("Bob", 13)
        )))
    }
}