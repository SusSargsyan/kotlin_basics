/**
 * Given a number n, calculate the n-th Fibonacci number. 
 * (Recall Fibonacci is 1, 1, 2, 3, 5, 8, 13, 21, 34 … Start with 1 and 1 and add these 
 * values together to get the next value. The next value is the sum of the 
 * previous two. So the next value in this case is 8+13 = 21.)
 */

// e.g. 

fun main() {
	var n:Int = 8
    var a:Int = 1
    var b:Int = 1
    if(n == 0) {
        println(a)
        return
    }
    if(n == 1) {
        println(b)
        return
    }
    for(i in 0 until n - 1) {
        val tmp = b
        b = a + b
        a = tmp
    }
    println(b)
}
