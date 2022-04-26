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
    val part4 = part3.toDouble().pow(5.0)
    val part5 = part4 + 4
    val part6 = part5.toDouble().pow(7.0) 
    val part7 = x.toDouble() + y.toDouble()
    val part8 = cos(part7)
    val part9 = sin(part8)
    
    val result = part6 + part9
    print(result)
    
}
