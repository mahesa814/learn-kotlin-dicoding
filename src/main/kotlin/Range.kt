fun main(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    val tenToOne = 12.downTo(1)
    if(7 in tenToOne) {
        println("value 7")
    }
    if(11 !in tenToOne){
        println("No Value 11")
    }
}
