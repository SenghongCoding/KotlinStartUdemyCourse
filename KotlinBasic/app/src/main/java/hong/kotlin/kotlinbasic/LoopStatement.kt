package hong.kotlin.kotlinbasic

fun main() {
    BreakAndContiue()


}

fun Wile() {
    var x = 100
    while (x >= 0) {
        println("$x")
        x -= 2
    }

    var Y = 15
    do {
        println(Y)
        x++
    } while (Y <= 10)

    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }

    var x1 = 0
    for (y in 0..9) {
        x1 += y
    }

    println("$x1")

}

fun BreakAndContiue() {
    for (i in 1 until 20) {

        if (i / 2 == 5) {
            continue
        }
        println("$i")
    }
    println("Done with the loop")
}
