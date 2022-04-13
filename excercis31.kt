/**
 * Given a number between 2 and 12, calculate the odds of rolling this number 
 * using two six-sided dice. Compute it by exhaustively looping through all of 
 * the combinations and counting the fraction of outcomes that give you that value. 
 * Don’t use a formula.
 */

fun main() {
    val n:Int = 100
    val a:Int = 4 //this value is in between 2 and 12
    var count:Int = 0
    for(i in 0..n) {
        val diceOne = (1..6).random()
        val diceTwo = (1..6).random()
        if(diceOne + diceTwo == a) {
            count = count + 1
        }
        println("diceOne = $diceOne diceTwo = $diceTwo : sum = ${diceOne + diceTwo}") 
    }
    println("count = $count")
}
