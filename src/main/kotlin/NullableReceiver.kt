fun main()
{
    val value: Int = 2
    println(value.slice)
}

val Int?.slice : Int
    get() = this?.div(2) ?: 0