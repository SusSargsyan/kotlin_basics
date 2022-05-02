import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.exp
import kotlin.math.ln

/**
 * Textbook - 4 problem
 */

fun exercise4(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0) + 4
    val part2 = part1.toDouble().pow(1 / 3)
    val part3 = exp(x.toDouble()) + 1
    val part4 = ln(part3)
    val result = part4 + part2
    return result
}

fun main() {
	var x:Int = 3
    var y:Int = 6
    var result = exercise4(x, y)
    println(result)
    
    x = 7
    y = 4
    result = exercise4(x, y)
    println(result)
}
