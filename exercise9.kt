// Print quadratic equation given coefficents
// a * x^2 + b * x + c = 0
// Given coefficients are a, b, c
// example a = 2, b = 5, c = 7 
// 2 * x^2 + 5 * x + 7 = 0
fun main() {
    var a  = 6
    // 1) var - val, var is can be modified - val is constant it cannot be modified
    // 2) : - none, : is used to specify type of variable
    // 3) Int - none, is used to explicitely specificy the type of variable
    // 4) none - "" 
    var b : Int = 6
    var c : Int = 7

    println("${a} * x^2 + ${b} * x + ${c} = 0")
    
    var d = a + b
    println("${a} + ${b} = ${d}")
    // ----
    var a1 = "15"
    var b1 = "32"
    var c1 = a1 + b1 // 1532
    println("${a1} + ${b1} = ${c1}")
}
