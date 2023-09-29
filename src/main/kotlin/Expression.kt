fun main(){
    val openOffice = 8
    val now = 1
    if (now > openOffice){
        print("office already open")
    } else {
        print("office close")
    }

    val office = if(now > openOffice) "Office Laready open 1" else "office close 1"
    println(office)

    println( sum(1,2*4))

}

fun sum(value1 : Int,value2 : Int)= value1 + value2