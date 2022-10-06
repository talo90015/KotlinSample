open class Shape
class Rectangle: Shape()

fun Shape.getName(): String = "Shape"
fun Rectangle.getName(): String = "Rectangle"
fun printInfo(str: Rectangle) = println(str.getName())

class Example(){
    fun printFunctionType() = println("class method")
}
fun Example.printFunctionType(int: Int) = println("extension function")

fun main() {
    printInfo(Rectangle())
    Example().printFunctionType(5)
}