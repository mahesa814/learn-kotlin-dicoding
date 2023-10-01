class FirstClass(
        val name : String,
        val weight : Double,
        val age : Int,
        val IsMammal : Boolean
    ) {
    var last = "ml"

    fun eat () {
         println("$name makan !")
    }

    fun sleep (){
        println("$name tidur")
    }
}
class Animal(){
    var name : String by PropertyDelegation()
}
class Person{
     var name : String by PropertyDelegation()
}
class Hero{
     var name : String by PropertyDelegation()
}

fun main(){
    val animal = Animal()
    animal.name = "Dicoding Miaw"
    println("Name Hewan ${animal.name}")

    val person = Person()
    person.name = "Dicoding Miaw"
    println("Name Hewan ${person.name}")
    val hero = Hero()
    hero.name = "Dicoding Miaw"
    println("Name Hewan ${hero.name}")

}