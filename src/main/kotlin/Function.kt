fun main(){
    println(getUsername("fajar","fajar@gmail.com"))
}

fun getUsername(name : String = "undang", email : String = "undang@gmail.com" ) :String{
    return "My name is $name and My email $email"
}