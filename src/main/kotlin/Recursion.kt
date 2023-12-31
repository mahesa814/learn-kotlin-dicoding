fun main(){
    println(factorial(7))
    println()
}

// Recursive Function
fun factorial(n : Int) : Int{
    return if ( n == 1){
        n
    }else {
        n * factorial(n - 1)
    }
}

// Tail Recursion

tailrec fun factorial(n : Int, result : Int = 1 ): Int {
    val newResult = n *result
    return if(n == 1){
        newResult
    }else {
        factorial(n - 1 , newResult)
    }
}