import kotlin.math.pow
import kotlin.math.sin

/**
 * Textbook - 9 problem
 */
fun exercise9(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0) 
    val part2 = y.toDouble().pow(2.0)
    val part3 = x + 4 
    val part4 = part2 + 4
    val part5 = part4.toDouble().pow(3.0)
    val part6 = part3 / part5
    val part7 = part6.toDouble().pow(1 / 5) 
    val part8 = sin(x + part7).toDouble().pow(2.0)
    val part9 = 3 * part7
    val part10 = y / part1
    
    val result = part8 + part9 + part10
    return result
}

fun main() {
	var x:Int = 7
    var y:Int = 5
    var result = exercise9(x, y)
    println(result)
    
    x = 2
    y = 6
    result = exercise9(x, y)
    println(result)
}
