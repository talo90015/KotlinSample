fun main() {

    val list = listOf(0, 1, 2, 3, 4)

    for (i in list)
        println(i)

    println("\n")

    for (j in listOf("C", "C++", "Go"))
        println(j)

    println("\n")

    println(list.forEach { println(it) })
}