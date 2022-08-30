package hong.kotlin.kotlinbasic.fundamantals

fun main() {
    val fruits = setOf("Orange","Apple","Grape", "Apple" , "Mango" ,"Orange")
//    print(fruits)

    println(fruits.toString())

    val newFruit = fruits.toMutableList()
    newFruit.add("Banana")
    newFruit.add("Pear")
    println(newFruit.elementAt(4))

    val dayOfTheWeek = mapOf(1 to "Monday" , 2 to "tuesday" , 3 to "Wednesday")

    for (Key in dayOfTheWeek.keys){
        println("$Key is to ${dayOfTheWeek[Key]}")
    }

    val myFruit = mapOf("Fevorite" to myFruitPrice("Grape" ,2000.0), "OK" to myFruitPrice("BANANA" , 300.00))

    val  newDayOfWeek = dayOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    print(newDayOfWeek.toSortedMap())
 }

data class myFruitPrice(val name : String , val Price : Double)
