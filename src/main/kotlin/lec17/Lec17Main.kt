package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1000),
        Fruit("사과", 1000),
        Fruit("사과", 1000),
        Fruit("바나나", 1000),
        Fruit("바나나", 1000),
        Fruit("바나나", 1000),
        Fruit("포도", 1000),
        Fruit("포도", 1000),
        Fruit("포도", 1000)
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    val results = filterFruits(fruits) { it.name == "사과" }
    println(results.toString())
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}