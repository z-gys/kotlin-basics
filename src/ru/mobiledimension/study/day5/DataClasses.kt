package ru.mobiledimension.study.day5

data class SlimCat(override val name: String, override val age: Int): Cat(name, age)

fun main() {
    val cat1 = SlimCat("Vasya", 2)
    val cat2 = SlimCat("Vasya", 2)

    println(cat1 == cat2)

    val catSet = HashSet<SlimCat>()
    catSet.add(cat1)
    catSet.add(cat2)

    val catCopy = cat1.copy()

    println(catSet.size)
}