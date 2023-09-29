fun main(){
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filterNot { it % 2 == 0 }
    println(evenList)
    val multiplied5 = numberList.map{it * 5}
    println(multiplied5)

    val firstOddNumber = numberList.find{it % 2 == 1}
    val firstOrNullNumber = numberList.firstOrNull{it % 2 == 1}
    println(firstOddNumber)
    println(firstOrNullNumber)

    val total = numberList.sum()
    println(total)

    val kotlinChar = listOf('k','o','t','i')
    val ascendingSort = kotlinChar.sortedDescending()
    println(ascendingSort)
}

