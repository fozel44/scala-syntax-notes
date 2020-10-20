object LambdaExpressions {
  def main(args: Array[String]): Unit = {

    val f = (x:Double) => x*x
    println(f(2))

    val sum = (x:Double,y:Double) => x+y
    println(sum(2,3))
    val f2 = (_:Double)*2
    println(f2(2))

    // higher and order functions
    println("higher and order functions")
    def sum3(x:Double,y:Double,z:Double):Double =x+y+z
    println("sum3 " + sum3(1,2,3))
    def mult3(x:Double,y:Double,z:Double):Double =x*y*z
    println("mult3 "  +  mult3(2,3,4))
    def min3(x:Double,y:Double,z:Double):Double =x min y min z
    println("min3 "  + min3(3,5,7))

    //important
    def combine3(x:Double,y:Double,z:Double , f:(Double,Double)=>Double )= f(f(x,y),z)
    println(combine3(1,2,3,(x,y)=>x+y))
    println(combine3(1,2,3,_+_))
    println(combine3(2,3,4,_*_))
    println(combine3(2,3,4,_ min _))
    println(combine3(2,3,4,_ max _))
  }
}
