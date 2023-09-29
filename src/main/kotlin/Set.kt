fun main(){
    val integerSet = setOf(1,2,3,4,5,1)
    println(integerSet)
    val setA = setOf(1,2,2,4,1,5)
    val setB = setOf(1,2,4,5,6)
    println(setA == setB)
    println(5 in setA)

    val setC = setOf(1,5,7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}