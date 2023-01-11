package lec17

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1000),
        Fruit(2, "사과", 1000),
        Fruit(3, "사과", 1000),
        Fruit(4, "사과", 1000),
        Fruit(5, "바나나", 1000),
        Fruit(6, "바나나", 1000),
        Fruit(7, "바나나", 1000),
        Fruit(8, "포도", 1000),
        Fruit(9, "포도", 1000),
        Fruit(10, "포도", 1000)
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    val results = filterFruits(fruits) { it.name == "사과" }
    println(results.toString())

    fruits.all { fruit -> fruit.name == "사과" } // 모두 만족 true
    fruits.none { fruit -> fruit.name == "사과" } // 모두 불만족 true
    fruits.any { fruit -> fruit.name == "사과" } // 하나라도 만족 true

    fruits.count()
    fruits.sortedByDescending { fruit -> fruit.name }
    fruits.distinctBy { it.name }.map { it.name }

    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }
    println("사과: $map[\"사과\"]")

    val idAndFruit: Map<Long, Fruit> = fruits.associateBy { it.id }
    println(idAndFruit[1])

    val nameAndPrices: Map<String, List<Int>> = fruits.groupBy({ it.name }, { it.price })
    val associateBy: Map<Long, Int> = fruits.associateBy({ it.id }, { it.price })

    val fruitInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "aa", 1000, 300, 300)
        ),
        listOf(
            Fruit(2, "ab", 2000, 400, 900)
        ),
        listOf(
            Fruit(3, "ac", 3000, 500, 500)
        )
    )

    // 출고가와 현재가가 동일한 과일을 고르세요.
    val fruits1: List<Fruit> = fruitInList.flatMap { list -> list.samePriceFilter }
    println(fruits1)

    // List<List<Fruit>> -> List<Fruit>
    val flatten = fruitInList.flatten()
    println(flatten)
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter { it.isSamePrice }

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}