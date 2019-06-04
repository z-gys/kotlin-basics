package ru.mobiledimension.study.day3

open class Person(val age: Int? = null): Any() {
    override fun toString(): String {
        return "Age: $age"
    }

}

class Friend(val email: String, age: Int?): Person(age) {
    override fun toString(): String {
        return "Friend(email='$email')" + super.toString()
    }
}

fun main() {
    val friend = Friend("1@1.ru", 12)
    println(friend)
}