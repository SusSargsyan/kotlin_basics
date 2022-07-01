import kotlin.math.pow

fun exercise26(x:Int): Double {
    var result: Double = 0.0
    if (x <= -1) {
        val part1 = x + 2
        val part2 = -part1.toDouble().pow(2.0)
        val part3 = part2 + 1
        result = part3
    } else if(-1 <= x && 1 >= x) {
        val part1 = x + 2
        val part2 = -part1.toDouble().pow(2.0)
        result = part2
    } else if (x >= 1) {
        val part1 = x - 2
        val part2 = -part1.toDouble().pow(2.0)
        val part3 = part2 + 1
        result = part3
    }
    return result
}

fun main() {
    var x:Int = 7
    var result:Double = exercise26(x)
    if(result == 7.0) {
        println("test1 is okay")
    } else {
        println("test1 is not okay")
    }
    
    x = -3
    result = exercise26(x)
    if(result == -3.0) {
        println("test2 is okay")
    } else {
        println("test2 is not okay")
    }
    
    x = 2
    result = exercise26(x)
    if(result == 2.0) {
        println("test3 is okay")
    } else {
        println("test3 is not okay")
    }
}
