/**
 * Given a number n, calculate the factorial of n. 
 * (Example: 4 factorial is equal to 1 * 2 * 3 * 4.)  …..
 **/

fun main() { 
    var n:Int = 10
    var prod:Int = 1
    for(i in 1 until n+1) {
       prod = prod * i 
    }
    println(prod)
}
