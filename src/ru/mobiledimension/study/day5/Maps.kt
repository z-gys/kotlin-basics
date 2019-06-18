package ru.mobiledimension.study.day5

val myMap = HashMap<String, String>()

fun main() {
    myMap["day"] = "День"
    myMap["month"] = "Месяц"
    myMap["year"] = "Год"
    myMap["day"] = "Диень"
    println(myMap["day"])
    println(myMap["asd"])


}