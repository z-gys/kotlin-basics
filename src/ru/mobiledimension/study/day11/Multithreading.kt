package ru.mobiledimension.study.day11

class MyThread: Thread() {
    override fun run() {
        sleep(500)
        println("From thread")
    }
}

fun main() {
    val myThread = MyThread()
    myThread.start()
    println("From main")
}
