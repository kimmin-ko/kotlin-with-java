package lec_08

fun main() {
    println(max(1, 2))
    repeat(str = "ABC", userNewLine = false)
    printNameAndGender(name = "김민", gender = "MALE")

    printAll("A", "B", "C")
    val arr = arrayOf("A", "B", "C")
    printAll(*arr)
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// = 쓸 경우 반환 타입 생략 가능
fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max1(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}