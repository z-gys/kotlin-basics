package ru.mobiledimension.study.day4

val list = ArrayList<Flyable>()

fun main() {
    list.add(Bird())
    list.add(Duck())

    for (flyable in list) {
        flyable.fly()
    }

    val set = HashSet<Duck>()
    val duck = Duck()
    set.add(duck)
    set.add(duck)
    set.add(duck)

    val list = ArrayList<Duck>()
    list.add(duck)
    list.add(duck)
    list.add(duck)

    println("set size = ${set.size}")
    println("list size = ${list.size}")


}