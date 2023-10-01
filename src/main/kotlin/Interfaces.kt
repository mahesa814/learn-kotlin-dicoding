interface IFly {
    fun fly()
    val numberOfWings: Int
}
class Bird (override val numberOfWings : Int) : IFly{
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}
fun flyWithWings(bird : IFly){
    bird.fly()
}

fun main(){
    flyWithWings(Bird(4))
    flyWithWings(object  : IFly {
        override fun fly(){
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }

        override val numberOfWings: Int
            get() = 2
    })
}