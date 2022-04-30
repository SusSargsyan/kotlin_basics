// Write a program which calculates sum  of squares
// from 1..n numbers with function returning the sum
import kotlin.math.pow

fun sum(n:Int):Int {
    var sum:Int = 0
    for(i in 1..n) {
        sum = sum + i * i
    }
    return sum
}

fun main() {
    var n:Int = 2
    var result = sum(n)
    if(result == 5) {
        println("test1 okay")
    } else {
        println("test1 not okay")
    }
    
    n = 3
    result = sum(n)
    if(result == 14) {
        println("test2 okay")
    } else {
        println("test2 not okay")
    }
}
