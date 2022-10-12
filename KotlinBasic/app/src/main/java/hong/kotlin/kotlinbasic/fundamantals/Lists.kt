package hong.kotlin.kotlinbasic.fundamantals

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val months = listOf("January", "February", "March")
    val anyType = listOf(1, 4, 5, true, false, "String")



    val number1 = mutableListOf("one","two","three","four","Five")
    number1.add("sex")
    number1.removeAt(3)
    number1.size


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