fun main(args: Array<String>) {
    val str: String? = null
    // safe call
    // str이 null이어도 npe가 발생하지 않고 해당 문구 자체가 null이 된다.
    println(str?.length)

    // elvis
    println(str?.length ?: 0)

    // !!
    val javaPerson = JavaPerson("min kim", 32)
    startsWithA(javaPerson.name)

}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false;
}