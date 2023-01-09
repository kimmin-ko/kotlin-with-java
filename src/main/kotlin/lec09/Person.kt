package lec09

fun main() {
    val person = Person(name = "Min")
    println(person.isAdult)
    println(person.uppercaseName)
}

class Person(
    val name: String,
    var age: Int = 1
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    val uppercaseName: String
        get() = this.name.uppercase()

    val isAdult: Boolean
        get() = this.age >= 20
}