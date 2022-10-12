package hong.kotlin.kotlinbasic.fundamantals

/*?
? ArrayList use to create dynamic array, which means the size of an ArrayList can be increased or decreased according to your requirement
? The ArrayList class provides both read and write functionalities.
? The ArrayList follows the sequence of insertion order.
? An ArrayList is non synchronized and it may contain duplicate elements
? */

fun main() {
    val name = listOf("Seng hong","Dara","Pan ha","katakana")

    for(name1 in name){
        println(name1)
    }

    val number = arrayOf(1,23,4,5,4,5,3,4)


    println("==============")
    for (num in number){
        if (num == 3 || num == 4) {
            println("It is 3 and 4")
        }else if (num/2 == 0){
            println("----------$num")
        }
    }
}