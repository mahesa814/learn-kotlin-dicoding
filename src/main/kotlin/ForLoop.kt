fun main(){
    val ranges = 1..10 step 3
    for(i in ranges){
        println("values is $i")
    }

    for((index,value) in ranges.withIndex()){
        println("value $value with index $index")
    }

    ranges.forEachIndexed{ index,value ->
        println("value $value index $index")
    }


}