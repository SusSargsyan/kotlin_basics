import kotlin.math.pow
import kotlin.math.log10
import kotlin.math.atan

/**
 * Textbook - 19 problem
 */

fun exercise19(a:Int, b:Int): Double {
    var result:Double = 0.0
    val cond:Double = a.toDouble() + b.toDouble()
    
    if(cond < 3) {
         val part1 =  atan(a.toDouble() + b.toDouble())
         val part2 =  part1.toDouble().pow(4.0)
         result = part2
        
    } else if(cond > 5) {
         val part1 = log10(a.toDouble() + b.toDouble())
         val part2 = part1.toDouble().pow(4.0) 
         result = part2
    } else {
         val part1 = a.toDouble().pow(15.0)
         result = part1
    }
   
    return result
}


fun main() {
	
    var a:Int = -7
    var b:Int = 2
    val result1 = exercise19(a, b)
    println(result1)
    
   
    a = 6
    b = 1
    val result2 = exercise19(a, b)
    println(result2)
    
  
    a = 9
    b = 7
    val result3 = exercise19(a, b)
    println(result3)
    
}
