import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.log2
import kotlin.math.abs
import kotlin.math.tan

/**
 * Textbook - 16 problem
 */

fun exercise16(x:Int, a:Int, b:Int): Double {
    var result:Double = 0.0
    val cond:Double = a.toDouble().pow(2.0) + b.toDouble().pow(2.0)
    var e:Int = 1
    if(cond > 5) {
       val part1 = (x.toDouble() + a.toDouble() + b.toDouble() + 5)
       val part2 = log2(part1) / log2(3.0)
       val part3 =  a - x 
       val part4 = 3 * e.toDouble().pow(part2)
       result = part4 +part2
        
    } else if(cond < 1) {
       val part1 = a.toDouble() + b.toDouble()
       val part2 = tan(part1)  
       val part3= part2.toDouble().pow(4.0)
       result = part3
    } else {
        val part1 = -3.toDouble()
        result = part1
    }
   
    return result
}

fun main() {
	var x:Int = 4
    var a:Int = 3
    var b:Int = 5
    val result1 = exercise16(x, a, b)
    println(result1)
    
    x = 8
    a = 0
    b = 0
    val result2 = exercise16(x, a, b)
    println(result2)
    
    x = 5
    a = 1
    b = 1
    val result3 = exercise16(x, a, b)
    println(result3)
}
