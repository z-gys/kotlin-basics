package ru.mobiledimension.study.day10

import java.util.stream.IntStream

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    list.stream()
            .filter { a -> a.rem(2) == 0 }
            .map { "$it " }
            .forEach { print(it) }

    val count = list //6
            .filter { it.rem(2) == 0 } //3
//            .map { "$it " } //3
            .joinToString()
//            .forEach { print(it) }

    println(count)


    IntStream.range(0, 101)
            .forEach{println(it)}
}