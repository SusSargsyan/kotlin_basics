/**
 * Textbook - 41 problem
 */

fun main() {
    val a:Int = 100
    val b:Int = 101
    val c:Int = 102
    val d:Int = 103
    if(d > c) {
        println(d)
    } else if(c > d) {
        println(c)
    } else if(c > b) {
        println(c)
    } else if(b > c) {
        println(b)
    } else if(b > a) {
        println(b)
    } else {
        println(a)
    }
}
