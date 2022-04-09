/**
 * Print sum and product of all even number in 1..10 integers
 **/

fun main() {
    var sum:Int = 0
    var prod:Int = 2
    for(i in 1 until 11) {
        if(i % 2 == 0) {
            sum = sum + i
            prod = prod * i
        }
    }
    println(sum)
    println(prod)
}
