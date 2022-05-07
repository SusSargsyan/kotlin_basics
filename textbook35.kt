// Write a program which calculates big sum 
// of sum squares of even numbers and product of odd numbers from 1..n with 
// function returning the big sum 1, 2, 3, 4, 5
// Big sum = 1*3*5 + (2^2 + 4^2)

fun sum(n:Int):Int {
    var result:Int = 0
    var sum:Int = 0
    var prod:Int = 1
    for(i in 1..n) {
        sum = sum + i * i
        prod = prod * i
    }  
         if(n % 2 == 0) {
         println("$sum")
    } else if(n % 2 = 1){
        println("$prod")
    } else {
        val bigsum = prod + sum
        println("$bigsum")
    }
    return sum
}

fun main() {
     var n:Int = 10
    println(sum(10))
//      if(n % 2 == 0) {
//          println("$sum(n)")
//     } else if(n % 2 = 1){
//         println("$prod")
//     } else {
//         val bigsum = prod + sum
//         println("$bigsum")
//     } 
}
