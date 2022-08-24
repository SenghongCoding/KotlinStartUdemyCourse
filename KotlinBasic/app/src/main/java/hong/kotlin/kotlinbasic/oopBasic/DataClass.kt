package hong.kotlin.kotlinbasic.oopBasic

fun main() {
    val user1 = User(1, "dara")
//    val name = user1.name
//    println(name)

    user1.name = "Senghong"
    var user2 = User(1, "Senghong")

    println(user1 == user2)

    println("User details: $user1")

    val updatedUser = user1.copy(name = "update")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())

    val (id, name) = updatedUser
    println("id = $id , name = $name")
}

data class User(val id: Long, var name: String)