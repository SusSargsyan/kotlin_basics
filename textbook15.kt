import kotlin.math.pow
import kotlin.math.log2
import kotlin.math.tan
import kotlin.math.cos



/**
 * Textbook - 15 problem
 */

fun exercise15(a:Int, b:Int, x:Int):Double {
    var e:Int = 2
    var result:Double = 0.0
	if(a < 3) {
         val part1 = cos(x.toDouble() + a.toDouble() + b.toDouble())
         val part2 = e.toDouble().pow(part1)
         val part3 = tan(a + b.toDouble().pow(2.0))
         val part4 = x.toDouble().pow(2.0)
         val part5 = part3 * part4
         result = part5  
 	} else {
         val part1 = 4 + a.toDouble().pow(2.0) + b.toDouble().pow(2.0)
         val part2 = log2(part1)
         result = part2
    }
    return result
}

fun main() {
    var b:Int = 5
    var a:Int = 2 
    var e:Int = 1
    val result1 = exercise15(b, a, e)	
    println(result1)
   
    b = 5
    a = 4
    e= 2
    val result2 = exercise15(b, a, e)	
    println(result2)
	
    b = 5
    a = -4
    e = 4
    val result3 = exercise15(b, a, e)	
    println(result3)
}
