/**
 * Textbook - 42 problem
 */

fun main() {
    var a:Int = 99
    var b:Int = 99
    var c:Int = 102
    var d:Int = 103
    if(a <= b && a <= c && a <= d) {
        println(a)
    } else if(b <= a && b <= c && b <= d) {
        println(b)
    } else if(c <= a && c <= b && c <= d) {
        println(c)
    } else {
        println(d)
    }
}
