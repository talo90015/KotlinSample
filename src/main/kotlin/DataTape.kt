fun main() {
    val integer = 10
    val float = 10.0f
    val double = 10.0
    val long = 10L

    val char = 'A'
    val string = "ABC"

    println(integer)
    println(integer::class.java.typeName + "\n")
    println(float)
    println(float::class.java.typeName + "\n")
    println(double)
    println(double::class.java.typeName + "\n")
    println(long)
    println(long::class.java.typeName + "\n")
    println(char)
    println(char::class.java.typeName + "\n")
    println(string)
    println(string::class.java.typeName + "\n")
}