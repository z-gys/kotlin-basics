package ru.mobiledimension.study.day3.homework

import kotlin.random.Random

abstract class Employee {
    var wallet: Int = 0
        private set

    fun receiveSalary(monthSalary: Int) {
        wallet += monthSalary
    }

    abstract fun doWork()
}

class Developer: Employee() {
    override fun doWork() {
        println("Надо на проде протестить это")
    }
}

class DevOps: Employee() {
    override fun doWork() {
        println("Опять вы логи не читаете")
    }
}

class Tester: Employee() {
    override fun doWork() {
        if (Random.nextInt(0, 100) < 80) {
            println("У вас баг")
        } else {
            println("Че-то билд в очереди висит")
        }
    }
}