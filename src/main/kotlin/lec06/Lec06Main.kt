package lec06

fun main() {
    // 향상된 for문 (for-each)
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    for (i in 1..3) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 3 downTo 1 step 2) {
        println(i)
    }
}