package hong.kotlin.kotlinbasic.fundamantals

class myArray {

}

fun main() {
    println("Hello this is array options")

//    val numbers: IntArray = intArrayOf(12,23,34,45,56,56)
//    val numbers = intArrayOf(12,23,34,45,56,56)
    val numbers = arrayOf(12, 23, 34, 45, 56, 56)

    val numbersD: DoubleArray = doubleArrayOf(1.0, 3.3, 5.0, 6.7, 5.34)
    println(numbers.contentToString())

//    for (element in numbers) {
//        print("${element + 3} , ")
//    }

//    print(numbers[3])

    numbers[0] = 34
    numbers[2] = 45
    numbers[3] = 11
    numbers[4] = 55
    numbers[5] = 77

//    print("the final values : " + numbers.contentToString())

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    ,1,2,3,Fruit("BOO",200.00) , Fruit("TEST" , 400.30))
    println(days.contentToString())

    val name = arrayOf("senghong","dara","panda","Sey ha","Kakda")
    println(name.contentToString())

    for (nm in name){
        println(nm[1])
    }



    val fruits = arrayOf(Fruit("Apple", 1200.00), Fruit("banna", 2000.00))
//    println(fruits.contentToString())
    for (fruit in fruits) {
//        println("${fruit.name}")
    }

    for (index in fruits.indices) {
//        println("${fruits[index].name} is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)
