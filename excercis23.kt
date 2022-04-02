/*
 * Print a table of the first 10 powers of 2
 * 2^0 = 1
 * 2^1 = 2
 * 2^2 = 4
 * 2^3 = 8
 * 2^4 = 16
 * 2^5 = 32
 * ...
 * 
 */


fun main() {
	var a:Int = 1
    
	for(i in 1..11) {
        println("2^${i - 1} = $a")
    	a = a * 2
    }
}
