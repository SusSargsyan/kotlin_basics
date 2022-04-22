import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos


/**
 * Textbook - 7 problem
 */

fun main() {
	val x:Int = 7
    val y:Int = 3
    
    val part1 = x.toDouble().pow(2.0)
    val part2 = y.toDouble().pow(2.0) 
    val part3 = part1 + part2
    val part4 = part3 + 4
    val part5 = part4.toDouble().pow(7.0)
    val part6 =  sin(cos(x + y))
   
    
    val result = part5 + part6
    print(result)
    
}
