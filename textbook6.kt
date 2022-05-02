import kotlin.math.pow
import kotlin.math.atan

/**
 * Textbook - 6 problem
 */

fun exercise6(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0) 
    val part2 = y.toDouble().pow(2.0) 
    val part3 = 3 * x + 4 
    val part4 = part2 + 4
    val part5 = part3 / part4
    val part6 = atan(part5)
    val part7 = part1 + 3
    val part8 = part7.toDouble().pow(3.0)
    val part9 = part8.toDouble().pow(1 / 1)
    val result = part7 + part9
    return result
}

fun main() {
    var x:Int = 3
    var y:Int = 8
    var result = exercise6(x, y)
    println(result)
    
    x = 9
    y = 5
    result = exercise6(x, y)
    println(result)
}
