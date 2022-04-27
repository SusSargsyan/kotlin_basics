import kotlin.math.pow
import kotlin.math.abs
import kotlin.math.tan
import kotlin.math.log2

/**
 * Textbook - 12 problem
 */

fun exercise11(z:Int, a:Int):Double {
    var result:Double = 0.0
	if(abs(a.toDouble()) > 3) {
        val part1 = a.toDouble().pow(2.0) + 4
        val part2 = log2(part1)
        val part3 = part2.toDouble().pow(5.0)
        val part4 = tan(z.toDouble() + a.toDouble())
        result = part3 + part4
 	} else {
         val part1 = a.toDouble().pow(4.0) + 4 * a
         val part2 = part1.toDouble().pow(5.0)
	     result = part2
      
    }
    return result
}

 fun main() {
     var z:Int = 1
     var a:Int = 6
     val result1 = exercise11(z, a)	
     println(result1)
   
     z = 7
     a = 2
     val result2 = exercise11(z, a)	
     println(result2)
	
     z = 3
     a = -9
     val result3 = exercise11(z, a)	
     println(result3)
 }
