fun main() {
    printMessage("Hello From Lambda")
    println (sum(5,3))
    printResult(10,sum)

    printResult(11){value ->
        value + value
    }
    printResult2(12,sum)
}
val printMessage = { message: String -> println(message) }

var sum: (Int) ->  Int = {value -> value* value}

fun printResult(value : Int, sum:(Int) -> Int){
    val result = sum(value)
    println(result)
}

inline fun printResult2(value : Int , sum:(Int) -> Int){
    val result = sum(value)
    println(result)
}