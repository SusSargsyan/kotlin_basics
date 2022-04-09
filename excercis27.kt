/**
 * Print product of odd numbers from 1..10 and sum of odd numbers of 1..10
 **/

fun main() { 
    var sum:Int = 0
    var prod:Int = 1
    for(i in 1 until 11) {
        if( i % 2 == 1) {
            sum = sum + i 
            prod = prod * i
        }
    }
    println(sum)
    println(prod)
}
