package lec14

fun main() {
    val dto = PersonDto(name = "min", age = 32)
    println(dto)
    println(dto == PersonDto("min", 32))
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}