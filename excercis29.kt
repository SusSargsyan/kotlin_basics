/**
 * Given a number between 2 and 12, calculate the odds of rolling this number 
 * using two six-sided dice. Compute it by exhaustively looping through all of 
 * the combinations and counting the fraction of outcomes that give you that value. 
 * Don’t use a formula.    ……
 */

// e.g. given number is 3
// 10 times rolling dice, 7 times we got 4 and 3 times 3

// e.g. given nuber is 11
// 200 times rolling dice, 20 times we got 3 and 180 times 1

fun main() {
    val givenNumber:Int = 4
    val myFirstDice = Dice(6)
    val mySecondDice = Dice(6)
    val n:Int = 40
    var count:Int = 0
    for(i in 0..n) {
        val rollResult = myFirstDice.roll() + mySecondDice.roll()
        if(rollResult == givenNumber) {
            count = count + 1
        }
        println("Rolled ${rollResult}!")
    }
    println("Matched $givenNumber, $count times")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
