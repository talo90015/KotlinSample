fun main() {
    val list = listOf(0, 1, 2, 3, 4)
    val isMutableList = mutableListOf(0, 1, 2, 3, 4)

    println(list)
    println(list::class.java.typeName)

    println(isMutableList)
    isMutableList.add(5)
    println(isMutableList)
    println(isMutableList::class.java.typeName)
    println(isMutableList.size)
    println(isMutableList.isEmpty())
    println(isMutableList.contains(0))
    println(isMutableList.contains(10))
    println(isMutableList[3])
}