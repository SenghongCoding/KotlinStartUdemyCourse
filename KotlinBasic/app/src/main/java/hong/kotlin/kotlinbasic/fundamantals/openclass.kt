package hong.kotlin.kotlinbasic.fundamantals



fun main() {
    Derived().function1()
}
open class Test1{
    open fun function1(){
        println("Test function !")
    }
}

class Derived: Test1(){
    override fun function1() {
      println(" has been changed it !")
    }
}