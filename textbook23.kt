import kotlin.math.pow

fun exercise23(x:Int): Double {
    var result: Double = 0.0
    if (x >= -2) {
        result = 2.toDouble()
    } else if(-2 <= x && 2 >= x) {
        result = -x.toDouble()
    } else {
        result = -2.toDouble()
    }
    return result
}

fun main() {
    var x:Int = 1
    var result:Double = exercise23(x)
    if(result == 1.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -2
    result = exercise23(x)
    if(result == -2.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = -5
    result = exercise23(x)
    if(result == -5.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
