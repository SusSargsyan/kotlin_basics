import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.PI
import kotlin.math.exp

/**
 * Textbook - 10 problem
 */
fun exercise10(x:Int, y:Int):Double {
    val part1 = x.toDouble().pow(2.0) 
    val part2 = sin(part1 + y)
    val part3 = part2.toDouble().pow(2.0) 
    val part4 = sin(PI / 12 + x.toDouble())
    val part5 = cos((y.toDouble() + part3) / (PI + part3.toDouble().pow(2.0)))
    val part6 = part3 + 4
    val part7 = exp(part6) 
    
    val result = part4 * part5 + part7
    return result
}

fun main() {
  	var x:Int = 8
    var y:Int = 2
    var result = exercise10(x, y)
    println(result)
    
    x = 1
    y = 4
    result = exercise10(x, y)
    println(result)
}
