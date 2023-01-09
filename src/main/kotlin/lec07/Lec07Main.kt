package lec07

import java.lang.NumberFormatException

fun main() {
    println(parseIntOrThrow2("A"))
}

fun parseIntOrThrow(str: String): Int {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        println(str)
        str.toInt()
    } catch (e: NumberFormatException) {
        println(e.message)
        null
    }
}