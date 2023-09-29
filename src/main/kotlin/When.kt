@file:Suppress("UNUSED_EXPRESSION")

import kotlin.random.Random


fun  main(){
    val value = 7
    when(value){
        6-> println("value i 6")
        7-> println("value i 7")
        8-> println("value i 8")
        else -> println("value cannot be reached")
    }
    val stringOfValue = when (value) {
        6 -> {
            println("six")
            "Value is 6"
        }
        7 -> {
            println("seven")
            "Value is 7"
        }
        8 -> {
            println("eight")
            "Value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reacher"
        }
    }
    println(stringOfValue)

    val anyType : Any = "100"
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val values = 50
    val ranges = 10..50
    when(values){
        in ranges -> println("values is in the range")
        !in ranges -> println("value is outside the range")
        else-> println("value undefined")
    }

    val registerNumber = when (val regis = getRegisterNumber()){

        in 1..50 -> 50 * regis
        in 51..100 -> 100*regis
        else->regis
    }
    println(registerNumber)

    if(anyType is Long){
        println("the value has a Long type")
    }else{
        println("the value is not Long Type")
    }

    when(anyType){
        is Long -> println("the value has a long type")
        is Int -> println("the value has a Int type")
        is String -> println("the value has String type")
        else -> println("undefine")
    }
}

fun getRegisterNumber() = Random.nextInt(100)