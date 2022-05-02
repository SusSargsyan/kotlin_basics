import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos

/**
 * Textbook - 7 problem
 */

fun exercise7(x:Int, y:Int): Double {
    val part1 = x.toDouble().pow(2.0) 
    val part2 = y.toDouble().pow(2.0)
    val part3 = part1 + part2
    val part4 = part3.toDouble().pow(5.0)
    val part5 = part4 + 4
    val part6 = part5.toDouble().pow(7.0) 
    val part7 = x.toDouble() + y.toDouble()
    val part8 = cos(part7)
    val part9 = sin(part8)
    val result = part6 + part9
    return result 
}

fun main() {
    var x:Int = 7
    var y:Int = 3
    var result = exercise7(x, y)
    println(result)
    
    x = 9
    x = 1
    result = exercise7(x, y)
    println(result)
}
