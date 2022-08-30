package hong.kotlin.kotlinbasic.fundamantals

fun main() {
    val months = listOf("January", "February", "March")
    val anyType = listOf(1, 4, 5, true, false, "String")


    println(months[1])
    for (month in months) {
//        println(month)
    }

    println(anyType.size)
    val addtionalMonth = months.toMutableList()
    val newMonth = arrayOf("April","May","Jun")
    addtionalMonth.addAll(newMonth)
    addtionalMonth.add("July")
//    print(addtionalMonth)

    val days = mutableListOf<String>("Mon","Tue","Wed")

    days.add("Thu")
    days[2] = "Sunday"
    days.removeAt(3)
    val removeList = mutableListOf<String>("Mon","Wed")
    days.removeAll(removeList)
//    days.removeAll(days)
    println(days)



}