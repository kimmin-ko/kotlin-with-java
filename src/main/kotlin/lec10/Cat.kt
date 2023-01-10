package lec10

class Cat(species: String) : Animal(species = species, legCount = 4) {

    override fun move() {
        println("고양이가 ${legCount}발로 걸어간다 ~")
    }

}