import kotlin.math.pow

fun exercise24(x:Int): Double {
    var result: Double = 0.0
    if (x <= -1) {
        result = -x.toDouble() - 1
    } else if(-1 <= x && 1 >= x) {
        val part1 = x.toDouble().pow(2.0)
        val part2 = 1 - part1
        val part3 = part2.toDouble().pow(1 / 1)
        result = part3 
    } else if (x >= 1){
        result = x.toDouble() - 1
    }
    return result
}

fun main() {
    var x:Int = 5
    var result:Double = exercise24(x)
    if(result == 5.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -2
    result = exercise24(x)
    if(result == -2.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = 3
    result = exercise24(x)
    if(result == 3.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
