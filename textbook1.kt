import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.tan


/**
 * Textbook - 1 problem
 */
fun main() {
	  val x:Int = 2
    val y:Int = 5
    
    val part1 = x.toDouble().pow(2.0)
    val part2 = part1.pow(6.0)
    val part3 = sin(part1 - 3)
    val part4 = tan(y.toDouble())
    val result = (y + 1) * (x + part2 * part3 - part4)
    print(result)
}
