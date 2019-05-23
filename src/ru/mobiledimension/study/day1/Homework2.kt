package ru.mobiledimension.study.day1

/*
   Чтобы снимать видео я купил комп стоимостью 200к и квадрокоптер за 57к.
   Квадрокоптер я 2 раза разбил и его ремонт вышел 9880
   Сколько стоит одно видео на моем канале: https://www.youtube.com/channel/UC1z9oTxNmllOO_IDbnxxtzg
 */

fun main() {
    val compPrice = 200_000
    val copterPrice = 57_000
    val repairPrice = 9880
    val videoCoutn = 27

    println("Price of 1 video: ${(compPrice + copterPrice + repairPrice).toDouble() / videoCoutn}")
}