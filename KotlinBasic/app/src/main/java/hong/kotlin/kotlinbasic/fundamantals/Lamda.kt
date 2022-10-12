package hong.kotlin.kotlinbasic.fundamantals

fun main() {

    myFun("Senghong",23)
    println(addussue("dara"))

    var sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(12, 23))

    var num: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }
    num(13, 23)

    println("===================!!")

    val aNewIssue: String = "Test4"
    val anIssueAlreadyIn: String = "test2"

    println("Issue $aNewIssue ${getStatLog(addussue(aNewIssue))}")

}

val openIssues: MutableSet<String> = mutableSetOf("test1", "test2", "test3")
fun addussue(test: String): Boolean {
    return openIssues.add(test)
    return true
}

fun getStatLog(isAdd: Boolean): String {
    return if (isAdd) "register correctly" else "make ask duplicate and rejected"
}

open class Test {
    private var name: String? = null
    private var age: Int? = null


}


fun myFun( name : String , age : Int) {
    print("my name and age is : $name and $age")
}


