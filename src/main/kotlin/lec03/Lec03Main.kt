package lec03

import Person

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    printAgeIfPerson(Person("min", 19))
    printAgeIfPerson(null)

    val person = Person("min kim", 32)
    val str = "사람의 이름은 ${person.name}이고 나이는 ${person.age}입니다."
    println(str)

    val trimIndent = """
        ABC
        DEF
        ${person.name}
    """.trimIndent()
    println(trimIndent)

    val c:Char = str[1]
    println(c)

    //

}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}