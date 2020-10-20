object recursiveFunctions {
  def main(args: Array[String]): Unit = {
      def factorial (n:Int):Int = {
        if(n<2) 1
        else n*factorial(n-1)
      }
//println(factorial(12))
    def factorialong (n:Long):Long = {
      if(n<2) 1
      else n*factorialong(n-1)
    }
    //println(factorialong(50))

    def factorialBigInt (n:BigInt):BigInt = {
      if(n<2) 1
      else n*factorialBigInt(n-1)
    }
    //println(factorialBigInt(500))

    def squareSum(n:Int):Int= {
      if(n<2) 1
      else n*n+squareSum(n-1)
    }
//println(squareSum(9))

    def countDown(n:Int):Unit= {
      if(n>0) { println(n);countDown(n-1) }
    }
//println(countDown(10))

    def countFromTo (from:Int, to:Int):Unit={
      if (from <= to) {
        println(from)
        countFromTo(from+1, to)
      }
    }
//println(countFromTo(1,11))

    //recursion user input
    import io.StdIn._
    def sum (n:Int):Int = {
      if (n<1) 0
      else readInt + sum(n-1)
     }
//println("sum " + sum(3))

    def sumPozitive ():Int={
      val input= readInt
      if (input >= 0) {
        input + sumPozitive()
      } else 0
    }
//println(sumPozitive())

    def sumUntilQuit():Int={
      val input = readLine.toLowerCase.trim
      if (input == "quit") 0
      else input.toInt + sumUntilQuit()
    }
println(sumUntilQuit())

    def sumAndCount ():(Int,Int)={
      val input = readLine.toLowerCase.trim
      if(input == "quit") (0,0)
      else {
        val (sum,count) = sumAndCount()
        (input.toInt + sum, count+1)
      }
    }
//print(sumAndCount())

   /* val (s,c) = sumAndCount()
println(s/c.toDouble)*/

    def multAndCount ():(Int,Int)={
      val input = readLine.toLowerCase.trim
      if(input == "quit") (0,0)
      else {
        val (prod,count) = multAndCount()
        (input.toInt*prod, count+1)
      }
    }
/*println(multAndCount())
    val (p, ca) = multAndCount()
    println(s +"  " +ca)*/

    // soyutlanmış fonksiyondur . çağırılırken operasyona tanımlanan ıslemı gercekelstırır.
    def inputAndCount (base:Int , op:(Int,Int)=>Int):(Int,Int)={
      val input = readLine.toLowerCase.trim
      if(input == "quit") (base,0)
      else {
        val (value,count) = inputAndCount(base,op)
        (op(input.toInt, value), count+1)
      }
    }
    val (v, co) = inputAndCount(1,_*_)
    println(v +"  " +co)
  }
}
