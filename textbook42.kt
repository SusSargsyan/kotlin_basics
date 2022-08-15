/**
 * Textbook - 42 problem
 */

fun main() {
    val a:Int = 103
    val b:Int = 102
    val c:Int = 101
    val d:Int = 100
    if(a < b && a < c && a < d) {
        println(a)
    } else if(b < a && b < c && b < d) {
        println(b)
    } else if(c < a && c < b && c < d) {
        println(c)
    } else {
        println(d)
    }
}
