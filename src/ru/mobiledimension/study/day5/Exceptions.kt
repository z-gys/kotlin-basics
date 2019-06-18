package ru.mobiledimension.study.day5

fun main() {
    try {
        val a = 10
        exc()
        println(1/1)
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Ya vsё")
    }
}

fun exc(): Unit {
    throw Exception()
}