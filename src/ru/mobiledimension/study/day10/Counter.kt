package ru.mobiledimension.study.day10

class Counter(a: Int) {
    init {
        println(a)
        count++
    }
    constructor() : this(1)
    companion object {
        var count: Int = 0
    }
}

fun main() {
    Counter()
    Counter(2)
    Counter()
    Counter(3)
    println(Counter.count)
}