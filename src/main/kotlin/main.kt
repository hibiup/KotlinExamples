data class Person(val name:String, val age:Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", 13)
    )

    val oldest = persons.maxBy {
        /** Lambda */
        it.age ?:0
    }

    println("The oldest is: $oldest")   // The oldest is: Person(name=Bob, age=13)
}