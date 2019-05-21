package ru.mobiledimension.study.day1

//Kent 151

//Стоимость см2 каждой
fun main() {
    val priceSmall = 395
    val priceMed = 625
    val priceBig = 765

    val rSmall = 25 / 2.0
    val rMed = 30 / 2.0
    val rBig = 35 / 2.0

    val sSmall = Math.PI * rSmall * rSmall
    val sMed = Math.PI * rMed * rMed
    val sBig = Math.PI * rBig * rBig

    val cmSmall = priceSmall / sSmall
    val cmMed = priceMed / sMed
    val cmBig = priceBig / sBig
    cmBig = 100.0

    println("Small: $cmSmall")
    println("Med: $cmMed")
    println("Big: $cmBig")
}