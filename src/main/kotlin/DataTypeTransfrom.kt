fun main() {
    val integerToFloat = 10
    val integerToDubble = 10.0f

    println(integerToFloat::class.java.typeName)
    println("${integerToFloat.toFloat()::class.java.typeName}\n")


    println(integerToDubble::class.java.typeName)
    println("${integerToDubble.toDouble()::class.java.typeName}\n")
}