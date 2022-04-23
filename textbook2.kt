import kotlin.math.pow
import kotlin.math.sin

/**
 * Textbook - 2 problem
 */

fun main() {
	val x:Int = 3
    val y:Int = 6
    
    val part1 = x.toDouble().pow(2.0)
    val part2 = part1 - 4
    val part3 = y.toDouble().pow(2.0)
    val part4 = part3 + 2
    val part5 = part1 + 1
    val part6 = part5.toDouble().pow(0.5)
    val part7 = sin(part5)
    val part8 = 2.toDouble().pow(part7)
   
    
    val result = part2 / part4 + part8
    print(result)
    
}
