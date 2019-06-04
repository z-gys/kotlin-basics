package ru.mobiledimension.study.day2.homework

/**
 * DESCRIPTION
 *
 * @author U.Goryntsev on 04.06.2019
 */

fun main() {
    println(fibRecurrent(0))
    println(fibCycle(0))
    println()
    println(fibRecurrent(2))
    println(fibCycle(2))
    println()
    println(fibRecurrent(10))
    println(fibCycle(10))
    println()
}

fun fibRecurrent(n: Int): Int {
    if (n == 0)
        return 0
    if (n == 1)
        return 1
    return fibRecurrent(n - 1) + fibRecurrent(n - 2)
}

fun fibCycle(n: Int): Int {
    if (n == 0)
        return 0

    var fib1 = 1
    var fib2 = 1
    for (i in 3..n) {
        val fibSum = fib1 + fib2
        fib1 = fib2
        fib2 = fibSum
    }
    return fib2

}