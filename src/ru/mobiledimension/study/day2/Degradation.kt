package ru.mobiledimension.study.day2

import kotlin.random.Random

fun main() {
    val degradationRate = Random.nextDouble(0.0, 10.0)
    if (degradationRate >= 0.3 && degradationRate < 8.0) {
        println("Хорошо $degradationRate")
    } else {
        println("Плохо $degradationRate")
    }

}