// if 100*a is greater than b assign max to square of a otherwise assign max to b
fun main() {
    var max:Int = -1
	  var a:Int = 4
    var b:Int = 90
    if(100 * a > b) {
        max = a * a
    } else {
        max = b
    }
    print("max = $max")
}
