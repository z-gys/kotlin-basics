package ru.mobiledimension.study.day2

fun main() {
    println(факториал(4L))
}

fun факториал(a: Long): Long {
    if (a == 0L) {
        return 1
    }
    var result = 1L
    for (i in 1..a) {
        result *= i
    }
    return result
}