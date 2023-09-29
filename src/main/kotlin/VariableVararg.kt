 fun main() {
     val number = sumNumber(10, 20, 40, 10)
     val numberSize  = getNumberSize(10, 20, 40, 10)
     println(number)
     println(numberSize)
 }

 fun sumNumber(vararg number: Int): Int{
     return number.sum()
 }

 fun<T> asList(vararg input: T) :List<T>{
     val result = ArrayList<T>()
     for (item in input)
         result.add(item)
     return result
 }

 fun getNumberSize(vararg number: Int):Int{
     return number.size
 }