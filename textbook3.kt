import kotlin.math.pow
import kotlin.math.tan
import kotlin.math.log



/**
 * Textbook - 3 problem
 */

fun main() {
	val x:Int =2
    val y:Int = 8
    
    val part1 = x.toDouble().pow(2.0)
	val part2 = y.toDouble().pow(2.0) 
    val part3 = part1 + part2
    val part4 = part1-y
    val part5 = part4 / part3
    val part6 = 1/tan(part5) 
    val part7 = part1 + 1
  
    
    val result = part6 + part7
    print(result)
    
}
