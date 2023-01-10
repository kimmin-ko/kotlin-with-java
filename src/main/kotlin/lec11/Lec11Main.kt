package lec11

private var a = 1

fun a() {
    a = 2
}

abstract class Lec11Main protected constructor(
    val studentName: String
) {

}

class SubClass(studentName: String) : Lec11Main(studentName)

fun main() {
    isDirectory()
    val car = Car("name", "owner", 5000)
    car.name
    car.price
}
