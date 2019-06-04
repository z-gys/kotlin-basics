package ru.mobiledimension.study.day3

import java.awt.image.CropImageFilter

abstract class Shape {
    abstract fun draw()
}

class Circle: Shape() {
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
    var shape: Any = Any()
    shape = Circle()
    shape.draw()
    shape = getShape()
    shape.draw()
}

fun getShape(): Shape {
    return Triangle()
}