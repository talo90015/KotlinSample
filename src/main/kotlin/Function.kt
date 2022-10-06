fun main() {
    helloFunction()
    println(returnFunction(10, 10))
    println(initValueFunction())
    println(initValueFunction(10))

    var result = parameterCallFunction() + 20
    println(result)
}

fun helloFunction() {
    println("hello world")
}

fun returnFunction(firstValue: Int, secondValue: Int): Int {
    return firstValue + secondValue
}

fun initValueFunction(firstValue: Int = 20, secondValue: Int = 30): Int {
    return firstValue + secondValue
}

fun parameterCallFunction(firstValue: Int = 10, secondValue: Int = 10): Int {
    return firstValue + secondValue
}