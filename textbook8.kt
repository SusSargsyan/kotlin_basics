import kotlin.math.pow
import kotlin.math.sin



/**
 * Textbook - 8 problem
 */

fun main() {
	  val x:Int = 7
    val y:Int = 5
    
    
    val part1 = x.toDouble().pow(2.0) 
    val part2 = y.toDouble().pow(2.0)
    val part3 = x + 4 
    val part4 = part2 + 4
    val part5 = part4.toDouble().pow(3.0)
    val part6 = part3 / part5
    val part7 = part6.toDouble().pow(1 / 5) 
    val part8 = sin(x + part7.toDouble().pow(2.0))
    val part9 = 3 * part7
    val part10 = y / part1
    
    val result = part8 + part9 + part10
    print(result)
}
