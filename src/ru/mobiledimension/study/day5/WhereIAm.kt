package ru.mobiledimension.study.day5

fun main() {
    target()
}

fun whereIAm(): String {
    try {
        throw Exception()
    } catch (e: Exception) {
        return e.stackTrace[1].methodName +":"+ e.stackTrace[1].lineNumber
    }
}

fun target() {
    println(whereIAm())
}