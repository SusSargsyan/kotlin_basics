import kotlin.math.pow

fun exercise22(x:Int): Double {
    var result: Double = 0.0
    if (x >= -2) {
        result = 2.toDouble()
    } else if(-2 <= x && 2 >= x) {
        result = x.toDouble().pow(2.0)
    } else {
        result = -2.toDouble()
    }
    return result
}

fun main() {
    var x:Int = 3
    var result:Double = exercise22(x)
    if(result == 3.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -1
    result = exercise22(x)
    if(result == -1.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = -4
    result = exercise22(x)
    if(result == -4.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
