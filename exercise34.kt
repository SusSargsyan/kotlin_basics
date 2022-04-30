// Write a program which calculates sum  of squares
// from 1..n numbers with function returning the sum


fun sum(n:Int):Int {
    var n:Int = 10
    var sum:Int = 0
    var a:Int = 1
    for(i in 1..11) {
        println("${i - 1}^2 = $a")
    	a = a * 2
        sum = sum + a
    }
        
    
	return sum
    
}

fun main() {
    var n:Int = 10
	println(sum(10))
   
}
