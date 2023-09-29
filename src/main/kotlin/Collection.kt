fun main()
{
    val numberLIst: List<Int> = listOf(1,2,3,4,5)
    val anyList = mutableListOf('a',"kotlin",100,true)
    println(anyList[2])
    anyList.add('w')
    anyList.add(1,"love")
    anyList[3] = false
    println(anyList)
}