class Cat(
    val name : String,
    val funColor: String ,
    val weight :Double,
    val age : Int,
    val numberOffset : Int ,
    val isCarnivora : Boolean
) {
    fun eat() {
         println("$name sedang tidur !")
    }

    fun sleep() {
        println("$name sedang tidur")
    }

    fun playWithHuman(){
        println("$name bermain dengan manusia")
    }

}
