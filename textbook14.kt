import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos

/**
 * Textbook - 14problem
 */

fun exercise14(a:Int, b:Int, c:Int):Double {
    var result:Double = 0.0
	if( a + b < 7) {
        val part1 = a.toDouble().pow(2.0) 
        val part2 = b.toDouble().pow(2.0)
        val part3 = part1 + part2 + c
        val part4 = cos(part3) / sin(part3)
        val part5 = part4.toDouble().pow(2.0) 
        result = part5
        
  
 	} else {
      	val part1 = 10.toDouble().pow(-7.0) 
        result = part1
    }
    return result
}

fun main() {
     var a:Int = 1
     var b:Int = 2
     var c:Int = 2
     val result1 = exercise14(a, b, c)
     println(result1)
   
     a = 6
     b = 3
     c = 1
     val result2 = exercise14(a, b, c)
     println(result2)
     
     a = 5
     b = 4
     c = 1
     val result3= exercise14(a, b, c)
     println(result3)
}
