
class Calculation{
    fun add(firstValue: Int, secondValue: Int) = firstValue + secondValue
    fun sub(firstValue: Int, secondValue: Int) = firstValue - secondValue
}
fun Calculation.mul(firstValue: Int, secondValue: Int) = firstValue * secondValue
fun String.first() = "$this -----first"
fun String.second() = "$this -----second"
fun String.third() = "$this -----third"

fun Any?.toString() : String{
    if (this == null) return "null"
    return toString()
}

class Car
val Car.name:String
get() = "Toyota"


fun main() {
    val calculation = Calculation()
    println(calculation.add(10, 10))
    println(calculation.sub(10, 5))
    println(calculation.mul(5, 10))
    println()
    val msg = "I am hungry, i want to eat something"
    println(msg.first())
    println(msg.second())
    println(msg.third())
    println()
    val car = Car()
    println(car.name)
}