package ru.mobiledimension.study.day4

interface Runnable {
    fun run()
}

interface Flyable {
    fun fly()
}

class Dog: Runnable {
    override fun run() {
        println("Тыг дык")
    }
}

class Bird: Flyable {
    override fun fly() {
        println("I can fly!!!")
    }
}

class Duck: Runnable, Flyable {
    override fun run() {
        println("I'm run by duck")
    }

    override fun fly() {
        println("aaaaa")
    }
}

fun main() {
    var flyable: Flyable = Bird()
    flyable = Duck()
    flyable.fly()

    var runnable: Runnable = Duck()
    runnable = Dog()
    runnable.run()
}