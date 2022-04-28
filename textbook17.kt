import kotlin.math.pow
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.abs



/**
 * Textbook - 17 problem
 */
fun exercise17(x:Int, a:Int): Double {
    var result:Double = 0.0
    if(1 <= x && x <= 7) {
        val part1 =  1 + a.toDouble().pow(2.0)
        val part2 =  part1.toDouble().pow(6.0)
        result = part2
        
    } else if(x > 5) {
        val part1 = abs(x) + x.toDouble().pow(8.0)
        val part2 = ln(part1)  
        val part3 = part2.toDouble().pow(2.0)
        val part4 = cos(part3)
        result = part4
    } else {
         val part1 = a.toDouble()
         result = part1
    }
   
    return result
}


fun main() {
	var x:Int = 4
    var a:Int = 3

    val result1 = exercise17(x, a)
    println(result1)
    
    x = 7
    a = 0

    val result2 = exercise17(x, a)
    println(result2)
    
    x = 9
    a = 1

    val result3 = exercise17(x, a)
    println(result3)
    
}
