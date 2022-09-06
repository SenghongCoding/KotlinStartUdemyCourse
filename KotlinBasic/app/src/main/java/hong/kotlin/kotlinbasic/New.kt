package hong.kotlin.kotlinbasic

fun main() {
    println("tester")
    println(myNew(1))
    println(myNew("Hello"))
    println(myNew(3))

    myLoop()
    val number = listOf(1,2,3,4,-56,3,-5,3,-2,-34,12,32,4,-23,-23,-2)
    val positive = number.filter { x->x>0 }
    val negative = number.filter { x->x<0 }

    println("positive is :$positive and negative is : $negative")
}

fun myNew(new: Any): Any {
    val result = when (new) {
        1 -> "one"
        "Hello" -> 1

        else -> "No data"
    }
    return result

}
fun myLoop(){
    val car = listOf("toyota", "RangRover","Tesla")
    for (cars in car){
        println("there are my car : $cars")
    }
}

