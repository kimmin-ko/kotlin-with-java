package lec04

import JavaPerson

fun main() {
    val a: Long = 10L
    val b: Long = 10L
//    println(a >= b) // call compareTo()

    val p1 = JavaPerson("a", 11)
    val p2 = JavaPerson("a", 10)
    val p3 = p1

    println(p1 == p2) // 동등성
    println(p1 === p3) // 동일성
    println(p1 === p2) // false

    // compareTo 호출
    println(p1 > p2)
}