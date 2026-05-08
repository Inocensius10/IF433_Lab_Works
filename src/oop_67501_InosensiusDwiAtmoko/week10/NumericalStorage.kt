package oop_67501_InosensiusDwiAtmoko.week10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> maxOfTwo(first: T, second: T): T where T : Comparable<T> {
    return if (first >= second) first else second
}