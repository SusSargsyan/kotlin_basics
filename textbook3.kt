import kotlin.math.pow
import kotlin.math.ctg
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
    val part4 = log(part1 + 1)
    val part5 = |part1 - y|
   
    
    val result = part5 / part3 + part4
    print(result)
    
}
