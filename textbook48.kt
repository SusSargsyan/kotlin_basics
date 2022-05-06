/**
 * Textbook - 48 problem
 */

fun main() {
    val b1:Int = 2
    val b2:Int = 4
    val b3:Int = 8
    val b4:Int = 16
    val q:Int = 2
    if(b2 == b1 * q) {
          println("true")
    } else if(b3 == b2 * q){
          println("true")
    } else if(b4 == b3 * q) {
        println("true")
   } else {
        println("false")
   }
}
