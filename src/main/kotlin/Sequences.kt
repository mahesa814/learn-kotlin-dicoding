fun main() {
    val list = (1..1000000).toList()
    list.asSequence().filter{it % 5 == 0}.map{it * 2 }.forEach{ println(it) }

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(10).forEach { println("$it ") }
}