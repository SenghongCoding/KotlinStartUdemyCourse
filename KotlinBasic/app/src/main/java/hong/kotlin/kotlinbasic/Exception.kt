package hong.kotlin.kotlinbasic

fun main() {
    val obj: Any = "Seng hong"
    val str: String? = obj as String?
    println(str)

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}

/*
 *1./Try: the try block contains a set of statements which might generate an exception.
 *It must be followed by either catch or finally or both.
 * 2./catch: the block is used to catch the exception thrown from try block.
 * 3./Finally: finally block always execute whether exception is handled or not.
 * So it is used to execute important code statement.(like closing buffers)
 * 4./ Throw: the throw keyword is used to throw an exception explicitly.
*/