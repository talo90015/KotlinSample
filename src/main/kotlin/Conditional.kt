fun main() {
    val firstValue = 30
    val secondValue = 20

    val theString = "ABCD"


    if (firstValue > secondValue)
        println("firstValue is bigger than secondValue")
    else
        println("secondValue is bigger than firstValue")


    if (theString.isEmpty())
        println("No String Data")
    else if (theString.length < 3)
        println("Quantity is less than 3")
    else if (theString.length in 3.. 5)
        println("Quantity is between 3 and 5")
    else
        println("morn than 5")
}