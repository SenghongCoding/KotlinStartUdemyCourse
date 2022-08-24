package hong.kotlin.kotlinbasic

fun main() {
    var name:String = "senghong"
    name = "Khmer"
    var NullableName:String? ="Testing"
//    NullableName = null

    var myName = NullableName ?: "Testing"
//    print("$myName")
   println( NullableName!!.toUpperCase())

    var len = name.length

    var len2 = NullableName?.length
//    NullableName?.let { println(it.length) }
//    println(NullableName?.toLowerCase())
//     or
    /*if (NullableName !=null){
        var len2 = NullableName.length
    }else{
        null
    }*/

//    var wifeAge : String ? = user?wife?age? :0

}