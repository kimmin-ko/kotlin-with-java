package lec20

import lec19.Person

fun main() {
    printPerson(Person("a", 32))
}

fun printPerson(person: Person?) {
    // let = 일반 함수
    val returnValue = person?.let {
        println(it.name)
        println(it.age)
        true
    }

    // run = 확장 함수
    person?.run {
        println(this.name)
        println(age)
    }

    println("return value: ${returnValue}")
}