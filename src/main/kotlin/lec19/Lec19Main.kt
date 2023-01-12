package lec19

// as import
import lec19.a.printHelloWorld as printHelloWorldA
import lec19.b.printHelloWorld as printHelloWorldB

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    // as import
    printHelloWorldA()
    printHelloWorldB()

    // 구조분해
    val person = Person("min", 32)

    // data class는 프로퍼티 순서에 따라 컴포넌트 메서드를 생성한다.
    println(person.component1())
    println(person.component2())

    // component의 순서에 따라 넣어준다. property의 이름에 따라 매핑되지 않는다.
    val (name, age) = person
    println("name: $name")
    println("age: $age")

    // forEach continew
    val numbers = listOf(1, 2, 3)
    numbers
        .map { it + 1 }
        .forEach {
            println(it)
            return
        }

    // break
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
            println(number)
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
        println(number)
    }
}

val number = 0
fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNull2(): Int? {
    // 조건을 만족하면 그 값을 아니면 널 반환
    return number.takeIf { it > 0 }
}

fun getNumberOrNull3(): Int? {
    // 조건을 만족하지 않으면 그 값을 아니면 널 반환
    return number.takeUnless { it <= 0 }
}