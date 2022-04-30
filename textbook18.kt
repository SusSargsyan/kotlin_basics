import kotlin.math.pow
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.abs
import kotlin.math.atan
import kotlin.math.exp

/**
 * Textbook - 18 problem
 */

fun exercise18(x:Int, a:Int, b:Int): Double {
    var result:Double = 0.0
    val cond:Double = a.toDouble() + abs(b.toDouble())
    if(cond < -5) {
        val part1 =  cos(a.toDouble() + x.toDouble() + b.toDouble())
        val part2 =  part1.toDouble().pow(2.0)
        val part3 = abs(a + x)
        val part4 = exp(part3.toDouble())
        result = part4 * part2
    } else if(cond > 2) {
        val part1 = atan(a.toDouble() + x.toDouble())
        val part2 = part1.toDouble().pow(1 / 3) 
        result = part2
    } else {
        val part1 = a.toDouble() + abs(b)
        result = part1
    }
    return result
}

fun main() {
    var x:Int = 1
    var a:Int = -8
    var b:Int = 2
    val result1 = exercise18(x, a, b)
    println(result1)
    
    x = 5
    a = 7
    b = 3
    val result2 = exercise18(x, a, b)
    println(result2)
    
    x = 5
    a = 1
    b = 1
    val result3 = exercise18(x, a, b)
    println(result3)
}
