package ru.mobiledimension.study.day10

import java.util.*

fun main() {
    Random().ints()
            .parallel()
            .distinct()
            .limit(1)
}