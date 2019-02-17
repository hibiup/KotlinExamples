package example_1_hello

data class Person(val name:String, val age:Int? = null)

fun findOldest(persons: List<Person>): String {
    val oldest = persons.maxBy {
        /** Lambda */
        it.age ?:0
    }

    return oldest!!.name  // Bob
}