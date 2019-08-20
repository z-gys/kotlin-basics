package ru.mobiledimension.study.day3.homework

class Cat(val name: String, isFemale: Boolean,  val father: Cat? = null, val mother: Cat? = null) {
    override fun toString(): String {
        return "Cat(name='$name', father=$father, mother=$mother)"
    }
}

fun main() {
    val ryjik = Cat("Рыжик", false)
    val cleopatra = Cat("Клеопатра", true)
    val chernysh = Cat("Черныш", false)
    val musya = Cat("Муся", true)

    val vaska = Cat("Васька", false, ryjik, cleopatra)
    val murka = Cat("Мурка", true, chernysh, musya)

    val murzik = Cat("Мурзик", false, vaska, murka)
}
    