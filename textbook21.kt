import kotlin.math.pow

fun exercise21(x:Int): Double {
    var result: Double = 0.0
    if(x >= 0) {
        result = x.toDouble()
    } else {
        result = -x.toDouble().pow(2.0)
    }
    return result
}

fun main() {
    var x:Int = 1
    var result:Double = exercise21(x)
    if(result == 1.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -1
    result = exercise21(x)
    if(result == -1.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = -2
    result = exercise21(x)
    if(result == -4.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
