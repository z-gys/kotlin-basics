package ru.mobiledimension.study.day2

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 9)
    when {
        a == 0 -> println("Zero")
        a >0 && a < 3 -> print("From 0 to 3")
        else -> println("Other")
    }

    when(a) {
        0 -> println("Zero")
        in 1 until 3 -> print("From 1 to 3")
        else -> println("Other")
    }

}