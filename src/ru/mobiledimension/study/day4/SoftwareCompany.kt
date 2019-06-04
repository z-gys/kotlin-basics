package ru.mobiledimension.study.day4

interface CanTest {
    fun test()
}

interface CanDevelop {
    fun develop()
}

interface CanAdministrate {
    fun administrateServak()
}

class Tester: CanTest {
    override fun test() {
        println("Билд в очереди")
    }
}

class Autotester: CanTest, CanDevelop {
    override fun test() {
        println("Тут блокер ваще-то")
    }


    override fun develop() {
        println("Мне котлин не нужен")
    }
}

class ProdProgrammer: CanDevelop, CanAdministrate {
    override fun develop() {
        println("А в котлине это есть!")
    }

    override fun administrateServak() {
        println("helm delete --purge super-project")
    }
}

class Admin: CanAdministrate {
    override fun administrateServak() {
        println("У вас тут жавка всю память съела")
    }
}

fun main() {
    val admin: CanAdministrate = ProdProgrammer()
    admin.administrateServak()

    val developer: CanDevelop = Autotester()
    developer.develop()
}

