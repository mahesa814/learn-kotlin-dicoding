fun main(){
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorGreen)
    println(colorRed)
    println(colorBlue)

    val color:Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
}

enum class Colsor(val value: Int)
{
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
