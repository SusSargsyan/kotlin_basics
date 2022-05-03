import kotlin.math.pow
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.tan
import kotlin.math.abs

/**
 * Textbook - 20 problem
 */

fun exercise20(a:Int, b:Int, c:Int, x:Int): Double {
    var result:Double = 0.0
    if(-1 < c && c < 1) {
          val part1 =  c.toDouble() + a.toDouble()
          val part2 =  tan(part1)
          val part3 = part2.toDouble().pow(5.0)
          val part4 = b + part3
          result = part4
    } else if(c <= -1) {
          val part1 = abs(x) + x.toDouble().pow(8.0) 
          val part2 = ln(part1)
          val part3 = part2.toDouble().pow(2.0)
          val part4 = cos(part3)
          result = part4
    } else {
         val part1 = a.toDouble().pow(-10.0)
         result = part1
    }
    return result
}

fun main() {
	var a:Int = -7
    var b:Int = 2
    var c:Int = 0
    var x:Int = 5
    val result1 = exercise20(a, b, c, x)
    println(result1)
    
    a = 6
    b = 1
    c = -2
    val result2 = exercise20(a, b, c, x)
    println(result2)
    
    a = 9
    b = 7
    c = -8
    val result3 = exercise20(a, b, c, x)
    println(result3)
}
