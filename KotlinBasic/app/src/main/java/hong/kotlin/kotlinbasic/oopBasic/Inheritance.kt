package hong.kotlin.kotlinbasic.oopBasic//package hong.kotlin.kotlinbasic.oopBasic
//
//import java.sql.Driver
//import hong.kotlin.kotlinbasic.oopBasic.Driver as Driver1
//
///*
//* The class that inherits the features of another
//* class is called the sub class or child class or
//* Derived class, and the class whose features are
//* inherited is called the super class or parent class
//* or base class
//*/
//open class Vehicle {
////    Properties
////    Methods
//}
//
//open class car : Vehicle() {
//    fun myCar(): String {
//        return "Hello my car"
//    }
//
//    fun Model(name: String): String {
//        return name
//    }
//}
//
//class Electicar : car() {
//    fun els() {
//        println("Hello electric ")
//    }
//}
//
//class myMain(override var type: Double) : Driver1 {
//
//    //    var type = 45.34
//
//    override fun myPrint(): String {
//        return "Hello "
//    }
//}
//
//interface Driver {
//    var type: Double
//    fun myDrive() {
//        println("Hello world !")
//    }
//
//    fun myPrint(): String {
//        return "testing";
//    }
//}
//
//fun main() {
//    var test = myMain(34.4)
//    test.myPrint()
//    println(test.myPrint())
//    println(test.type)
//    var drive = test.myDrive()
//    var car = car()
//    car.toString()
//    var electrical = Electicar()
//    electrical.els()
//    println(car.myCar())
//
////    val model = car.Model("TOYOTA")
//
//    println("The my car Model is : $model")
//}
