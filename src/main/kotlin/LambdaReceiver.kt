fun main(){
    println(buildString.append("halo2"))
    printMessage("halo")
    println(buildString2)
    val text = "hello"

    text.let {
        val message = "$it kotlin"
        println(message)
    }

}
val buildString = StringBuilder().apply {
    append("Hello ")
    append("kotlin ")
}
val printMessages = { message: String -> println(message) }
val buildString2 = { "Helow" }


