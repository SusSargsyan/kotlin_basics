import kotlin.math.pow

fun exercise25(x:Int): Double {
    var result: Double = 0.0
    if (x <= -1) {
        result = 2 * x.toDouble() + 2
    } else if(-1 <= x && 6 >= x) {
        result = 2.toDouble()
    } else if (x >= 6) {
        result =-3 * x.toDouble() + 5
    }
    return result
}

fun main() {
    var x:Int = 2
    var result:Double = exercise25(x)
    if(result == 2.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -1
    result = exercise25(x)
    if(result == -1.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = 6
    result = exercise25(x)
    if(result == 6.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
