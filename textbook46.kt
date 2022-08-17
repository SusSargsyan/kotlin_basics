/**
 * Textbook - 46 problem
 */

fun main() {
    val a:Int = 7
    val b:Int = 2
    val c:Int = 5
    val d:Int = 1
    if((a % 2 == 1 && b % 2 == 1) || (a % 2 == 1 && c % 2 == 1) || (a % 2 == 1 && d % 2 == 1) || (b % 2 == 1 && c % 2 == 1) || (b % 2 == 1 && d % 2 == 1) || (c % 2 == 1 && d % 2 == 1) ) {
          println("1")
    } else {
          println("2")
    }
} 
