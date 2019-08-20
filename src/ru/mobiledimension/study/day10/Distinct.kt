package ru.mobiledimension.study.day10

fun main() {
    listOf(7, 1, 3, 4, 1, 3, 5)
            .distinct()
            .sorted()
            .forEach{println(it)}
}