object ParametricFunctions {
  def main(args: Array[String]): Unit = {
      def ident[A](o:A):A=o // = ident[Int](i:Int):Int=i , parametre tiplerini atamaya olanak saglar
    def makeTuple[A,B](a:A,b:B):(A,B)=(a,b)
    def threeList[A](a1:A,a2:A,a3:A):List[A]=List(a1,a2,a3)
    def ourFold[A,B](lst:List[A],base:B)(f:(A,B)=>B):B=lst match {
      case Nil =>base
      case h::t => f(h,ourFold(t,base)(f))
    }
    println("ourFold(List(1,2,3,4,5),0)(_+_) : "+ourFold(List(1,2,3,4,5),0)(_+_))
    println("ourFold(List(1,2,3,4,5),1)(_*_) : "+ourFold(List(1,2,3,4,5),1)(_*_))
  }
}
