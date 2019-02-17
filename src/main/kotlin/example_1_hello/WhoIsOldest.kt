package example_1_hello

data class Person(val name:String, val age:Int? = null)

/**
 * 如果一个函数不属于任何 class，那么缺省它是 static 的
 * */
fun findOldest(persons: List<Person>): String {
    val oldest = persons.maxBy { // maxBy 的返回类型是 T?
        /** Lambda: maxBy 的比较条件。*/
        it.age ?: 0    // ?: 表示如果值为 null，则返回后面的缺省值，这里返回 0
    }

    /**
     * 因为 List.maxBy 的返回值是 Person? ，也就是说它可能为 null，因此在取值的时候需要使用附加操作：
     * “!!.” 告诉编译器我们知道这个值肯定不是 null。
     * 否则使用 “?.”
     * */
    return oldest!!.name  // Bob
}