fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (2..12).random()
    }
}
