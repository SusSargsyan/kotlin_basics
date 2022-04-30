import kotlin.math.pow
import kotlin.math.abs




/**
 * Textbook - 8 problem
 */

fun main() {
    val x:Int = 5
    val y:Int = 7
 
    val part1 = x.toDouble().pow(2.0) 
    val part2 = y.toDouble().pow(2.0)
    val part3 = part2 + 4
    val part4 = part3.toDouble().pow(1 / 3)
    val part5 = part1 + part4
    val part6 = part5.toDouble().pow(1 / 4)
    val part7 = abs(x) + abs(y)
    val part8 = part7.toDouble().pow(10.0)
    
    val result = part6 + part8
    print(result)
   
}
