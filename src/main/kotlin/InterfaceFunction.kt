interface  USB{
    fun enable()
    fun close()
    val deriveName: String  //默認屬性
    get() = "USB"
    fun printDeriveName(){
        println(deriveName)
    }
}

class Mouse : USB{
    override val deriveName: String = "mouse"
    override fun enable() {
        println("Mouse inserted")
    }

    override fun close() {
        println("Unplugged the mouse")
    }

    override fun printDeriveName() {
        println(deriveName + " G502")
    }
}
class KeyBoard : USB{
    override val deriveName: String = "keyboard"
    override fun enable() {
        println("Keyboard inserted")
    }

    override fun close() {
        println("Unplugged the keyboard")
    }

}
class Computer{
    fun bootUp(){
        println("Computer boot up")
    }
    fun shutdown(){
        println("Computer shut down")
    }
    fun useEquipment(usb: USB){
        usb.enable()
        usb.close()
    }
}

fun main() {
    val computer = Computer()
    computer.bootUp()
    val mouse = Mouse()
    computer.useEquipment(mouse)
    mouse.printDeriveName()
    val keyBoard = KeyBoard()
    computer.useEquipment(keyBoard)
    computer.shutdown()
}