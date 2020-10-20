import java.util.concurrent.Delayed

object recursiveFunctionsMatch {
  def main(args: Array[String]): Unit = {
    def fact2(n: Int): Int = n match {
      case 0 => 1
      case _ => n * fact2(n - 1)
    }

    def sumSquares2(n: Int): Int = n match {
      case 1 => 1
      case _ => n * n + sumSquares2(n - 1)
    }

    def countDown2(n: Int): Unit = n match {
      case 0 =>
      case _ => println("son " + n); countDown2(n - 1)
    }

    println("fact " + fact2(3))
    println("sumsuq " + sumSquares2(4))
    countDown2(7)

    /*(a,b) match {
      case (0,0) =>
      case (0,1) =>
      case (1,0) =>
      case (1,n) if n%2==0 =>
      case (1,n) ir n%2==1 =>
    }
    */

    io.StdIn.readInt match {
      case 1 => println("it's 1")
      case 2 => println("it's 2")
      case 3 => println("it's 3")
      case n => println("something else " + n)
    }


    def fizzBuzz(i:Int):Unit = {
      if(i<=100) {
        (i%3, i%5) match {
          case (0,0) =>println("fizzbuzz")
          case (0,_) =>println("fizz")
          case (_,0) =>println("buzz")
          case _ => println(i)
        }
        fizzBuzz(i+1)
      }
    }

    fizzBuzz(0)
  }
}
