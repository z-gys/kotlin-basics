package ru.mobiledimension.study.day10

import kotlin.streams.toList

fun main() {
    val map = mapOf(
            "1" to listOf(11, 12, 13),
            "2" to listOf(21, 22, 23),
            "3" to listOf(31, 32, 33))

    val list = map.entries.stream()
            .flatMap { it.value.stream() }
            .filter { it / 10 == it.rem(10) }
            .toList()

    println(list)
}