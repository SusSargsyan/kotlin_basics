/**
 * Textbook - 41 problem
 */

fun main() {
    val a:Int = 100
    val b:Int = 101
    val c:Int = 102
    val d:Int = 103
    if(a > b && a > c && a > d) {
        println(a)
    } else if(b > a && b > c && b > d) {
        println(b)
    } else if(c > a && c > b && c > d) {
        println(c)
    } else {
        println(d)
    }
}
