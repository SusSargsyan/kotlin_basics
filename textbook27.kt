import kotlin.math.pow

fun exercise27(x:Int): Double {
    var result: Double = 0.0
    if (x <= -1) {
        result = -2.5 * x.toDouble()
    } else if(-1 <= x && 1 >= x) {
        result = 2.toDouble()
    } else if (x >= 1) {
        result = 2 * x.toDouble()
    }
    return result
}

fun main() {
    var x:Int = 1
    var result:Double = exercise27(x)
    if(result == 1.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -2
    result = exercise27(x)
    if(result == -2.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = 4
    result = exercise27(x)
    if(result == 4.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
