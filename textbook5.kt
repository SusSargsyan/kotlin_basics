import kotlin.math.log2
import kotlin.math.pow
import kotlin.math.abs

/**
 * Textbook - 5 problem
 */

fun exercise5(x:Int, y:Int): Double {
    val part1 = 2.toDouble().pow(6.0) - 5
    val part2 = 3.toDouble().pow(7.0) + 2
    val part3 = part1 / part2
    val part4 = abs(x) + 1
    val part5 = part4.toDouble().pow(4.0) + y.toDouble().pow(2.0)
    val part6 = log2(part5)
    val result = part3 + part6
    return result
}

fun main() {
    var x:Int = 6
    var y:Int = 7
    var result = exercise5(x, y)
    println(result)
    
    x = 2
    y = 5
    result = exercise5(x, y)
    println(result)
}
