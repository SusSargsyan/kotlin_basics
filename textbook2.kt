import kotlin.math.pow
import kotlin.math.sin

/**
 * Textbook - 2 problem
 */

fun exercise2(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0)
    val part2 = part1 - 4
    val part3 = y.toDouble().pow(2.0)
    val part4 = part3 + 2
    val part5 = part1 + 1
    val part6 = part5.toDouble().pow(0.5)
    val part7 = sin(part5)
    val part8 = 2.toDouble().pow(part7)
    val result = part2 / part4 + part8
    return result
}

fun main() {
	var x:Int = 3
    var y:Int = 6
    var result = exercise2(x, y)
    println(result)
    
    x = 5
    y = 4
    result = exercise2(x, y)
    println(result)
}
