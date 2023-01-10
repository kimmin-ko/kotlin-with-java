package lec12

fun main() {
    Person.newBaby("a")
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}