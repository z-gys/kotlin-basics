package ru.mobiledimension.study.day10

fun compare(a: Int, b: Int): Int {
    return a - b
}

fun <T>compareExt(a: T, b: T, comparator: (a: T, b: T) -> Int): Int {
    return comparator(a, b)
}

data class Person(val x: Int) {
    companion object {
        fun compare(a: Person, b: Person): Int {
            return a.x - b.x
        }
    }
}

fun main() {
    compareExt(2, 3, {a, b -> a - b})
    val long = Person(30)
    val short = Person(5)

    compareExt(long, short, Person.Companion::compare)
}