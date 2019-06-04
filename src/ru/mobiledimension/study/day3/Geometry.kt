package ru.mobiledimension.study.day3

abstract class Shape {
    abstract fun draw()
}

class Circle(radius: Double): Shape() {
    var radius = radius
        set(value) {
            field = value
            square = 3.14 * field * field
        }
    var square: Double? = null
        private set
        get() {
            if (field == null)
                field = 3.14 * radius * radius
            return field
        }


    override fun draw() {
        println("Я круг")
    }

}

class Triangle: Shape() {
    override fun draw() {
        println("Я треугольник")
    }

}

fun main() {
    val circle = Circle(10.0)
    println(circle.square)
    circle.radius = 15.0
    println(circle.square)

}

fun getShape(): Shape {
    return Triangle()
}