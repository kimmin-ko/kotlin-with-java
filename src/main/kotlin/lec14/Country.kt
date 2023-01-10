package lec14

fun main(country: Country) {
    return when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    val countryName: String
) {
    KOREA("KO"),
    AMERICA("US")
}