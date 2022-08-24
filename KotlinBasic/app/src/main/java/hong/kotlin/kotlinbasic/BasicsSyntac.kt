package hong.kotlin.kotlinbasic

fun main() {
    var name = "senghong"
    var number = 12
//    TODO add new function
    var VariableKotlin = VariableKotlin()
    println("Hello world! $name")
    println(name + number.toString())

    AriThmaticOperators()
}

fun VariableKotlin() {
    var myByte: Byte = 12
    var number: Int = 23
    var mylong: Long = 202423_023
    var myBoolean: Boolean = true
    myBoolean = false
    var myFloat: Float = 34.4534F

    var letterchar = 'A'

    var MyString = "Hello You"
    var firstStr = MyString[0]
    var lastCharater = MyString[MyString.length - 3]
    println("first char in String is :" + firstStr)
    println(myFloat)
    println("Hello function !")
}

fun AriThmaticOperators() {
//     Operators have (- ,+ , *,/,%,)
    println("===========/Hello operators/==========")
    var result = 12
    var a = 3
    var b = 1
    result *= (a / b).toInt()
    println(result)

    println("============/Comparison operators/=======")
    var isEqual = 5 == 5 && 5 > 6

    println("isEqual is : $isEqual")

    val isNotEqual = 5 != 6
    println("isNotEqual is : $isNotEqual")
    println("==========/Assignment operators/==========")
    var Mynum = 3
    Mynum += 3
    println("Mynum is : $Mynum")

    Mynum++
    println("myNum is : $Mynum")
    println("myNum is : ${Mynum++}")
    println("myNum is : ${++Mynum}")
    println("myNum is : ${--Mynum}")

}