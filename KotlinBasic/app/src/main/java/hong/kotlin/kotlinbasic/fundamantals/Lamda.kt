package hong.kotlin.kotlinbasic.fundamantals

fun main() {

    var sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(12, 23))

    var num : (Int, Int) -> Unit = { a:Int, b:Int -> println(a+ b)}
    num(13,23)
}


open class Test{
    public var name: String? = null

}
