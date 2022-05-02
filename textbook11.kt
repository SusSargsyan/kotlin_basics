import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.log2

/**
 * Textbook - 11 problem
 */

fun exercise11(x:Int, a:Int):Double {
    var result:Double = 0.0
	if(abs(a.toDouble()) < 3) {
        val part1 = abs(x.toDouble() + a.toDouble())
        val part2 = sin(part1)
        val part3 = part2.pow(2.0)
        val part4 = x.toDouble().pow(2.0)
        val part5 = cos(part4)
        val part6 = part5.pow(2.0)
        result = part3 + part6   
	} else {
        val part1 = x.toDouble().pow(2.0)
        val part2 = a.toDouble().pow(2.0)
        val part3 = part2 + part1
        val part4 = part3.pow(1 / 4)
        val part5 = x.toDouble().pow(4.0)
        val part6 = part2 + part5
        val part7 = log2(part6)
        result = part4 * part7
    }
    return result
}

fun main() {
    var x:Int = 5
    var a:Int = 2
    val result1 = exercise11(x, a)	
    println(result1)
   
    x = 5
    a = 4
    val result2 = exercise11(x, a)	
    println(result2)
	
    x = 5
    a = -4
    val result3 = exercise11(x, a)	
    println(result3)
}
