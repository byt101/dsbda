// PS : Write a simple program in SCALA using Apache Spark framework --Don

// Steps to run this on terminal:-
// cd ~
// check :- scala -version 
    // If not then :- sudo apt-get install scala
// write code :- vi CheckNum.scala
// to see code :- cat CheckNum.scala
// to save and exit :- :wq
// compile :- scalac CheckNum.scala
// run :- scala CheckNum

import scala.io.StdIn._
object CheckNum {
    def main(args: Array[String]): Unit = {
        println("Enter a number:")
        val num = readInt()
        if (num > 0) {
            println("Positive number")
        } else if (num < 0) {
            println("Negative number")
        } else {
            println("Zero")
        }
    }
}

// Writing some simple codes of scala in comments :-

// object HelloWorld {
//   def main(args: Array[String]): Unit = {
//     println("Hello, World")
//   }
// }

// object AddNumbers {
//   def main(args: Array[String]): Unit = {
//     val a = 5
//     val b = 10
//     val sum = a + b
//     println("Sum = " + sum)
//   }
// }

// object UserInputExample {
//   def main(args: Array[String]): Unit = {
//     print("Enter your name: ")
//     val name = readLine()
//     println("Hello, " + name)
//   }
// }

// object CheckEvenOdd {
//   def main(args: Array[String]): Unit = {
//     val num = 5

//     if (num % 2 == 0) {
//       println("Even number")
//     } else {
//       println("Odd number")
//     }
//   }
// }

// object SimpleCalculator {
//   def main(args: Array[String]): Unit = {
//     val a = 10
//     val b = 5
//     val sum = a + b
//     val difference = a - b
//     val product = a * b  
//     val quotient = a / b
//     println("Sum: " + sum)
//     println("Difference: " + difference)
//     println("Product: " + product)
//     println("Quotient: " + quotient) 
//   }
// }

// object Factorial {
//   def main(args: Array[String]): Unit = {    
//     val num = 5
//     var fact = 1
//     for (i <- 1 to num) {
//       fact *= i
//     }    
//     println("Factorial of " + num + " is " + fact)   
//   }
// }

// object Fibonacci {
//   def main(args: Array[String]): Unit = {
//     val n = 10
//     var a = 0    
//     var b = 1
//     println("Fibonacci series:")
//     for (i <- 1 to n) {
//       println(a)
//       val c = a + b
//       a = b
//       b = c
//     }
//   }
// }

// object PrimeNumber {
//   def main(args: Array[String]): Unit = {
//     val num = 29
//     var isPrime = true
//     if (num <= 1) {
//       isPrime = false
//     } else {
//       for (i <- 2 until num) {
//         if (num % i == 0) {
//           isPrime = false
//         }
//       }
//     }
//     if (isPrime) {
//       println(num + " is a prime number")
//     } else {
//       println(num + " is not a prime number")
//     }
//   }
// }

