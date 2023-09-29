class User2(val name : String , val age : Int){
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
data class DataUser2(val name: String, val age : Int)
fun main(){
 val dataUser = DataUser2("Mahesa",10)
 val dataUser2 = DataUser2("Mahesa",10)
 val dataUser3 = DataUser2("Undang",11)
 val dataUser4 = dataUser.copy()
 val dataUser5 = dataUser.copy(age = 11)

 println(dataUser5)
}