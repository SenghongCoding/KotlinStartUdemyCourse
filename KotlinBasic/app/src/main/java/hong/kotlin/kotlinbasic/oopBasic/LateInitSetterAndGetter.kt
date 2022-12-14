package hong.kotlin.kotlinbasic.oopBasic

import java.util.*

fun main() {
    val Answer : Boolean = false

    var simple : String? = null
    println(simple  )
//    !============

    var car = Car()
    println("branch is : ${car.myBranch} ")
    car.maSpeed = 3
    println("Max Speed is : ${car.maSpeed}")

    println("the Model is ${car.myModel}")
}

// !this class create for assign data

class Car() {
    lateinit var owner: String

    val myBranch: String = "BMW"
        get() {
            return field.toLowerCase()
        }
    var maSpeed = 250
        get() = field
        set(value) {
            field = if (value > 0)
                value
            else throw IllegalAccessException("The max speed cannot input value is small than zero")
        }
    var myModel: String = "MS"
        private set

    init {
        this.myModel = "TOYOTA"
        this.owner = "Senghong"
    }
}

class Address {
    var name: String = " Senghong Hang"
    var street: String = "Kampuchea"
    var city: String = "PP"
    var state: String? = null
    var zip: String = "111124312"
}

fun CopyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}