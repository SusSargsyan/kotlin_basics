/**
 * Print product of odd numbers from 1..10 and sum of even numbers of 1..10
 **/
fun main() {
    var sum:Int = 0 
    var prod:Int = 1
    for(i in 1 until 11) {
        if( i % 2 == 0) {
            sum = sum + i
        } else {
            prod = prod * i
        }
    }
	println(sum)
    println(prod)
}
