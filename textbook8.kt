import kotlin.math.pow
import kotlin.math.abs

/**
 * Textbook - 8 problem
 */

fun exercise8(x:Int, y:Int): Double {
	val part1 = x.toDouble().pow(2.0)
    val part2 = y.toDouble().pow(2.0)
    val part3 = part2 + 4
    val part4 = part3.toDouble().pow(1 / 3)
    val part5 = part1 + part4
    val part6 = part5.toDouble().pow(1 / 4)
    val part7 = abs(x) + abs(y)
    val part8 = part7.toDouble().pow(10.0)
    val result = part6 + part8
    return result  
}

fun main() {
	var x:Int = 2
    var y:Int = 5
    var result = exercise8(x, y)
    println(result)
    
    x = 3
    y = 1
    result = exercise8(x, y)
    println(result)
}
