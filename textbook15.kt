import kotlin.math.pow
import kotlin.math.log2
import kotlin.math.tan
import kotlin.math.cos
import kotlin.math.exp

/**
 * Textbook - 15 problem
 * log_x(a) = log_10(a) / log_10(x) = ln(a) / ln(x) = log_2(a) / log_2(x)
 * log3(a) = log2(a) / log2(3)
 */

fun exercise15(a:Int, b:Int, x:Int):Double {
    var result:Double = 0.0
	if(a < 3) {
        val part1 = cos(x.toDouble() + a.toDouble() + b.toDouble())
        val part2 = exp(part1)
        val part3 = tan(a + b.toDouble().pow(2.0))
        val part4 = part2 * part3
        result = part4 
 	} else {
        val part1 = 4 + a.toDouble().pow(2.0) + b.toDouble().pow(2.0)
        val part2 = log2(part1) / log2(3.0)
        result = part2
    }
    return result
}

fun main() {
    var a:Int = 2
    var b:Int = 5
    var x:Int = 1
    val result1 = exercise15(a, b, x)	
    println(result1)
   
    a = 5
    b = 4
    x = 2
    val result2 = exercise15(a, b, x)	
    println(result2)
	
    a = 5
    b = -4
    x = 4
    val result3 = exercise15(a, b, x)	
    println(result3)
}
