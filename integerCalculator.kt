class Calculator(val name: String) {
  init {
    println("The owner of this calculator is $name.")
  }

  fun add(val1: Int, val2: Int): Int = val1 + val2
  
  fun subtract(val1: Int, val2: Int): Int = val1 - val2
  
  fun multiply(val1: Int, val2: Int): Int = val1 * val2
  
  fun divide(val1: Int, val2: Int): Int = val1 / val2
  
  fun power(val1: Int, val2: Int): Int {
    var result = 1
    for (i in 1..val2) {
      result *= val1
    }
    return result
  }
}

fun main() {
  var calc = Calculator("Codey")
  
  println("The sum of 7 and 5 is ${calc.add(7, 5)}")
  println("The difference of 7 and 5 is ${calc.subtract(7, 5)}")
  println("The product of 7 and 5 is ${calc.multiply(7, 5)}")
  println("The integer division quotient of 7 and 5 is ${calc.divide(7, 5)}")
  println("7 to the 5th power is ${calc.power(7, 5)}")
}