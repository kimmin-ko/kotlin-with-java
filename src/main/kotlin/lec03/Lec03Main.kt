package lec03

import JavaPerson

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    printAgeIfPerson(JavaPerson("min", 19))
    printAgeIfPerson(null)

    val javaPerson = JavaPerson("min kim", 32)
    val str = "사람의 이름은 ${javaPerson.name}이고 나이는 ${javaPerson.age}입니다."
    println(str)

    val trimIndent = """
        ABC
        DEF
        ${javaPerson.name}
    """.trimIndent()
    println(trimIndent)

    val c:Char = str[1]
    println(c)

    //

}

fun printAgeIfPerson(obj: Any?) {
    val javaPerson = obj as? JavaPerson
    println(javaPerson?.age)
}