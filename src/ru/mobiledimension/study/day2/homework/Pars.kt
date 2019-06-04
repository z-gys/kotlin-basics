package ru.mobiledimension.study.day2.homework

import kotlin.random.Random

/**
 * DESCRIPTION
 *
 * @author U.Goryntsev on 04.06.2019
 */

fun main() {
    val parsValue = Random.nextInt(1, 11)
    estimatePars(parsValue)
}

fun estimatePars(pars: Int) {
    when(pars) {
        in 1 until 4 -> println("ПАРС=$pars - хорошо")
        in 4 until 6 -> println("ПАРС=$pars - умеренно")
        in 6 until 8 -> println("ПАРС=$pars - нехорошо")
        in 8 until 11 -> println("ПАРС=$pars - плохо")
    }
}