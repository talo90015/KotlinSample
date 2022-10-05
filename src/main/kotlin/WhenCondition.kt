fun main() {

    val firstValue = 10
    val secondValue = "ABCD"

    when(firstValue){
        10 -> println("value is 10\n")
        30 -> println("value is 30\n")
        else -> println("value not 10 or 30\n")
    }
    when(secondValue){
        is String -> println("is String\n")
        else -> println("not String Type\n")
    }
}