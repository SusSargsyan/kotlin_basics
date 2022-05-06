// Write a program which calculated sum number multiple to 5 or 7
//  from 1..n with function returning sum (with test)

fun sum(n:Int):Int {
    var sum:Int = 0
    for(i in 1..n + 1) {
        sum = (sum  / 5) + i
    }
	return sum
}

fun main() {
    var n:Int = 10
	println(sum(10))
    
    n = 20
    println(sum(20))
    
    n = 33
    println(sum(33))
}
