package ru.mobiledimension.study.day11

import ru.mobiledimension.study.day4.list
import java.lang.Thread.sleep
import java.util.ArrayList

class Holder {
    @Volatile
    var i: Int = 0
    val list = ArrayList<Int>()
}

fun main() {
    val holder = Holder()
    val runnable = Runnable {
        repeat(10) { holder.list.add(holder.i++)}
    }

    Thread(runnable).start()
    Thread(runnable).start()
    Thread(runnable).start()
    Thread(runnable).start()

    sleep(1000)
    println("i = ${holder.i}")
    println("holder = ${holder.list}")
}