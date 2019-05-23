package ru.mobiledimension.study.day1

/*
    Кент стоит 151р. В пачке 20 сигарет
    В день я скуриваю 7 сигарет
    Через сколько дней я скурю MacBook Pro, который стоит 101 000р
 */

fun main() {
    val kentPrice = 151
    val mbpPrice = 101_000
    val sigaPrice = kentPrice / 20.0
    val pricePerDay = sigaPrice * 7

    val totalDays = (mbpPrice / pricePerDay).toInt()
    val years = totalDays / 365
    val remainderDays = totalDays - years * 365

    println("I'll smoke MacBook Pro in $years years and $remainderDays days")
}