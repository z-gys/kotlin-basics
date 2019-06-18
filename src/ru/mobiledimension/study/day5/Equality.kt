package ru.mobiledimension.study.day5

import java.util.HashSet

open class Cat(open val name: String, open val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cat

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val cat1 = Cat("Vasya", 2)
    val cat2 = Cat("Vasya", 2)

    val catSet = HashSet<Cat>()
    catSet.add(cat1)
    catSet.add(cat2)

    println(catSet.size)

    println(cat1 == cat2)
}