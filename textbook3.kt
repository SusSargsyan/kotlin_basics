import kotlin.math.pow
import kotlin.math.tan
import kotlin.math.log10
import kotlin.math.abs

/**
 * Textbook - 3 problem
 */

fun exercise3(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0)
	val part2 = y.toDouble().pow(2.0) 
    val part3 = part1 + part2
    val part4 = abs(part1 - y)
    val part5 = part4 / part3
    val part6 = 1 / tan(part5) 
    val part7 = log10(part1 + 1)
    val result = part6 + part7
    return result
}

fun main() {
	var x:Int = 2
    var y:Int = 8
    var result = exercise3(x, y)
    println(result)
    
    x = 1
    y = 3
    result = exercise3(x, y)
    println(result)
}
