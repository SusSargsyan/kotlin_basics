import kotlin.math.pow
import kotlin.math.sin



/**
 * Textbook - 7 problem
 */

fun main() {
	val x:Int = 7
    val y:Int = 3
    val z:Int = 1
    
    val part1 = x.toDouble().pow(2.0)
    val part2 = sin(x + z)
    val part3 = part2.toDouble().pow(2.0)
    val part4 = 3 * z
    
   
    
    val result = part3 + part4 + y/part1
    print(result)
    
}
