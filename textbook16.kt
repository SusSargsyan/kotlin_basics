import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.log2
import kotlin.math.abs
import kotlin.math.cos



/**
 * Textbook - 16 problem
 */
fun exercise16(x:Int, a:Int, b:Int): Double {
    val cond:Double = a.toDouble().pow(2.0) + b.toDouble().pow(2.0)
    if(cond > 5) {
        println("branch 1")
    } else if(cond < 1) {
        println("branch 2")
    } else {
        println("branch else")  
    }
   
    return 0.0
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
