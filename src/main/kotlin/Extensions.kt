fun main(){
    10.printInt()
    println(15.plushTree())
    println(10.slice)
}
fun Int.printInt(){
    println("value $this")
}

val Int.slice: Int
    get() = this / 2

fun Int.plushTree() : Int{
    return this + 3
}