import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos



/**
 * Textbook - 10 problem
 */

fun main() {
  	val x:Int = 8
    val y:Int = 2
    val p:Int = 180
    val e:Int = 3
    
    
    val part1 = x.toDouble().pow(2.0) 
    val part2 = sin(part1 + y)
    val part3 = part2.toDouble().pow(2.0) 
    val part4 = sin(p / 12 + x.toDouble())
    val part5 = cos(y.toDouble() + part3 / p + part3.toDouble().pow(2.0) )
    val part6 = part3 + 4
    val part7 = e.toDouble().pow(part6) 
    
    val result = part4 * part5 + part7
    print(result)
}
