package lec17

class Fruit(
    val id: Long,
    val name: String,
    val price: Int,
    val factoryPrice: Int = 500,
    val currentPrice: Int = 1000
) {

    val isSamePrice
        get() = this.factoryPrice == this.currentPrice

    override fun toString(): String {
        return "Fruit(id=$id, name='$name', price=$price)"
    }
}