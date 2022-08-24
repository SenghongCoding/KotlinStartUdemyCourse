package hong.kotlin.kotlinbasic.oopBasic

fun main() {
    var person = Person("seng", "hong" ,34)
    var john = Person("Dara", "Kac")
    var me = Person(LastName = "Khmer")
//    println(person.toString())
    person.age = 32
    println("Person is ${person.age} Years old")
    person.hobby = "play again "

    var firstName = "DARA"

    var test = Person()
    test.hobby = "play new "

    person.stateHobby()

}

class Person(firstName: String = "test", LastName: String = "me") {
    //    initializer block

    var firstName: String
    var age: Int? = null
    var hobby: String = "test"

    init {
        this.firstName = firstName
        println("person created fist name is $firstName   and  lastNmae : $LastName")
    }

    constructor(firstName: String, LastName: String, age: Int)
            : this(firstName, LastName) {
        this.age = age
        println("person created fist name is $firstName   and  lastNmae : $LastName and age is $age")

    }

    //    Member function
    fun stateHobby() {
        println(" $firstName\'s my hobby is : $hobby")
    }
}

