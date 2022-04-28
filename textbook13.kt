import kotlin.math.pow
import kotlin.math.abs
import kotlin.math.tan


/**
 * Textbook - 13 problem
 */

fun exercise13(z:Int, x:Int, e:Int):Double {
    var result:Double = 0.0
	if(1 <= x && x <= 7) {
         val part1 = abs(x) + 2 * abs(z)
         val part2 = part1.toDouble().pow(1 / 4)
         val part3 = abs(x + 1)
         val part4 = e.toDouble().pow(part3)
         result = part2 + part4
 	} else {
          val part1 = x + z
          val part2 = part1.toDouble().pow(7.0)
          val part3 = tan(part2)
          val part4 = part3.toDouble().pow(2.0)
 	     result = part4
      
    }
    return result
}

 fun main() {
     var z:Int = 1
     var x:Int = 6
     var e:Int = 3 
     val result1 = exercise13(z, x, e)	
     println(result1)
   
     z = 7
     x = 2
     e = 4
     val result2 = exercise13(z, x, e)	
     println(result2)
	
     z = 3
     x = -9
     e = 8
     val result3 = exercise13(z, x, e)	
     println(result3)
 }
