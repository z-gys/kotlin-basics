package ru.mobiledimension.study.day11

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.locks.ReadWriteLock
import java.util.concurrent.locks.ReentrantReadWriteLock

var list = CopyOnWriteArrayList<Int>()
val map = ConcurrentHashMap<Int, String>()

var i: Int = 0

fun main() {
    val r0 = Runnable { repeat(10) {list.add(0)} }
    val r1 = Runnable { repeat(10) {list.add(1)} }

    Thread(r0).start()
    val thread = Thread(r1)
    thread.start()
    thread.stop()

    Thread.sleep(1000)
    println("list = ${list}")
}

class SafeList() {
    private val list = ArrayList<Int>()
    private val lock = ReentrantReadWriteLock()
    fun add(x: Int) {
        lock.writeLock().lock()
        list.add(x)
        lock.writeLock().unlock()
    }

    fun remove(x: Int) {
        lock.writeLock().lock()
        list.remove(x)
        lock.writeLock().unlock()
    }

    fun get(x: Int): Int {
        lock.readLock().lock()
        val i1 = list[x]
        lock.readLock().unlock()
        return i1
    }

    override fun toString(): String {
        return list.toString()
    }
}
