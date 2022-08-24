package hong.kotlin.kotlinbasic

fun main() {
   var myfunction =  myFunction("Hang Senghong" ,12,23)
    println(myfunction)

    println("The result is : "+Cal(12,23))
}

fun myFunction(Name:String, num : Int ,num1:Int) :String {
    return (Name + num + num1 )
}

fun Cal(a : Int ,b:Int) : Int{
    return (a + b)
}

