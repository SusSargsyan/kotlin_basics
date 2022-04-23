import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.exp
import kotlin.math.ln

/**
 * Textbook - 4 problem
 */

fun main() {
	val x:Int = 3
    val y:Int = 6
    
    val part1 = x.toDouble().pow(2.0) + 4
    val part2 = part1.toDouble().pow(1 / 3)
    val part3 = exp(x.toDouble()) + 1
    val part4 = ln(part3)
    
    val result = part4 + part2
    print(result)
}
