data class Item(val key : String,val value : Any)
fun main(){
    val total = listOf(1,2,2,3,1,2,4,6,6)
    val distinct = total.distinct()
    println(distinct)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach{
        println("${it.key} with value ${it.value}")
    }

    val distinctBy = items.distinctBy { it.value }
    println(distinctBy)

}