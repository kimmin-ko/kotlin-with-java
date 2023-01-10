package lec15

fun main() {
    // array
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("${index} ${value}")
    }

    for (a in array) {
        println(a)
    }


    // immutable collection
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    val one = numbers[0]

    for (number in numbers) {
        println(number)
    }

    for ((idx, number) in numbers.withIndex()) {
        println("${idx} ${number}")
    }

    // mutable collection
    val mutableNumbers = mutableListOf(100, 200, 300)
    mutableNumbers.add(400)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val newMap = mapOf(
        1 to "MONDAY",
        2 to "TUESDAY"
    )

    for (key in newMap.keys) {
        println("${key} ${oldMap[key]}")
    }

    for ((key, value) in newMap.entries) {
        println("${key} ${value}")
    }

    // null 위치
    // List<Int>?
    // List<Int?>
    // Lint<Int?>?


}