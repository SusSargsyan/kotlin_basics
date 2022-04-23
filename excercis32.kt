//Write a program which calculates sum from 1..n numbers with 
//function returning the sum

fun sum(n:Int):Int {
    var n:Int = 10
    var sum:Int = 0
    for(i in 1..n + 1) {
        sum = sum + i
    }
	return sum
    
}

fun main() {
    var n:Int = 10
	println(sum(10))
}
	
