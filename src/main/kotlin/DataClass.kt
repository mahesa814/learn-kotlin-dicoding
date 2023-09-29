class User(val name : String , val age : Int){
    override fun toString(): String {
        return "user(name=$name , age = $age)"
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false
        other as User
        if(name != other.name) return false
        if(age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
data class DataUser(val name: String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}
fun main(){
    val user = User("Mahesa",19)
    val user2 = User("Mahesa",19)
    val dataUser = DataUser("Mahesa",19)

    println(user)
    println(dataUser)

    val dataUser2 = DataUser("Mahesa",19)
    val dataUser3 = DataUser("fajar",1)
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(user.equals(user2))
}