/**
 * Print sum and product of 1..10 integers
 **/
fun main() {
	var sum:Int = 0
    var prod:Int = 1
    for(i in 1 until 11) {
        sum = sum + i 
        prod = prod * i
    }
    println(sum)
    println(prod)
}
