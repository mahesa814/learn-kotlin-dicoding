fun main()
{
    val capital = mapOf(
        "jakarta" to "indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam","Netherland")
    println(mutableCapital)
    val mapKeys = capital.keys
    println(mapKeys)
    println(capital["jakarta"])
}