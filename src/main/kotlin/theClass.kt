import javax.print.DocFlavor.STRING

class Drink{
    fun tea(){
        println("red tea")
    }
    fun coffee(){
        println("ice coffee")
    }
}
class Calculate{
    fun add(firstValue:Int, secondValue:Int): Int{
        return firstValue + secondValue
    }
    fun sub(firstValue:Int, secondValue:Int): Int{
        return firstValue - secondValue
    }
    fun mul(firstValue:Int, secondValue:Int): Int{
        return firstValue * secondValue
    }
    fun division(firstValue:Float, secondValue:Float): Float{
        return firstValue / secondValue
    }
}
class ClassAccess{
    var id:Int = 10
    var name:String = "UserName"
    var note:String = "-"
    fun printInfo(){
        println("$id, $name, $note")
    }
}
class Initialization{
    var id: Int = 0
    init {
        println(20)     //預設
    }
    constructor(){
        println(30)
    }
}

open class Animal(id : Int, name : String){
    val id = id
    val name = name
}
class Dog(id: Int, name: String):Animal(id, name)
class Cat(id: Int, name: String, note:String):Animal(id, name){
    val note = note
}

abstract class Food(private var quantity:Int){
    abstract val name: String
    abstract val price: Int

    fun totalPrice(): Int{
        return quantity * price
    }
}
class IceCream(quantity: Int) : Food(quantity){
    override val name: String
        get() = "berry iceCream"
    override val price: Int
        get() = 30
}
class InstantNoodle(quantity: Int):Food(quantity){
    override val name: String = "seafood flavor"
    override val price: Int = 40
}


fun main() {
    val drink = Drink()
    drink.tea()
    drink.coffee()
    println()
    val calculate = Calculate()
    println(calculate.add(10, 10))
    println(calculate.sub(30, 10))
    println(calculate.mul(5, 20))
    println(calculate.division(100.0f, 24.0f))
    println()
    val classAccess = ClassAccess()
    classAccess.printInfo()
    classAccess.id = 1000
    classAccess.name = "Peko"
    classAccess.note = "is note"
    classAccess.printInfo()
    println()
    val initialization = Initialization()
    initialization.id = 100
    println(initialization.id)
    println()
    val dog = Dog(1, "wolf")
    val cat = Cat(2, "meow", "6Kg")
    println("${dog.id}, ${dog.name}")
    println("${cat.id}, ${cat.name}, ${cat.note}")
    println()
    val iceCream = IceCream(5)
    println(iceCream.name)
    println(iceCream.price)
    println(iceCream.totalPrice())
    println()
    val instantNoodle = InstantNoodle(3)
    with(instantNoodle){
        println("$name")
        println("$price")
        println("${totalPrice()}")
    }
}