package hong.kotlin.kotlinbasic

fun main() {
    IfStatment()
    WhenExpression()
}

fun IfStatment() {
    println("=======/IF statements/=========")
    var heightPerson1 = 170
    var heightPerson2 = 190

    if (heightPerson1 > heightPerson2) {
        println("use raw forc")
    } else {
        println("use technique")
    }

    var age = 31
    if (age >= 30) {
        println("You're Over 30")
    }
    if (age >= 21) {
        println("Now you may drink in the RR")
    } else if (age >= 16) {
        println("You may vote now")
    } else {
        println("You are young")
    }
    when (age) {
        in 21..150 -> println("Now you may can drink")
        in 18..20 -> println("you may vote now")
        16, 18 -> println("you may drink now ")
        else -> println("you to young")
    }
    var name = "senghong"
    if (name == "senghong") {
        println("Welcome home Senghong")
    } else {
        println("Who Are You?")
    }

    var isMe = true
    if (isMe) {
        println("It is Me")
    }
}

fun WhenExpression() {
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> print("Summer")
        3 -> {
            println("Fall")
            println("Automn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }
    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
    }

    var x: Any = 13.37
    when (x) {
        is Int -> println("It is Int")
        is Double -> println("is Double")
        is String -> println("Is String")
        else -> println("Is no one Datatype")
    }
}
